import { Router, type IRouter } from "express";
import multer from "multer";
import path from "node:path";
import fs from "node:fs";
import { db, jobsTable } from "@workspace/db";
import { eq } from "drizzle-orm";
import { runJob } from "../lib/pipeline-runner";

const router: IRouter = Router();

const DATA_DIR = process.env["JOBS_DATA_DIR"] ?? "/tmp/decompiler-jobs";
fs.mkdirSync(DATA_DIR, { recursive: true });

const ALLOWED_EXT = new Set([".jar", ".class", ".zip"]);
const MAX_UPLOAD_BYTES = 200 * 1024 * 1024; // 200MB — tune to taste

const upload = multer({
  storage: multer.diskStorage({
    destination: (_req, _file, cb) => cb(null, DATA_DIR),
    filename: (_req, file, cb) => {
      // Prefix with a timestamp to avoid collisions; original name kept for readability only.
      cb(null, `${Date.now()}-${path.basename(file.originalname)}`);
    },
  }),
  limits: { fileSize: MAX_UPLOAD_BYTES },
  fileFilter: (_req, file, cb) => {
    const ext = path.extname(file.originalname).toLowerCase();
    if (!ALLOWED_EXT.has(ext)) {
      cb(new Error(`Unsupported file type: ${ext}. Allowed: .jar, .class, .zip`));
      return;
    }
    cb(null, true);
  },
});

// POST /api/jobs — upload a jar and kick off decompilation
router.post("/jobs", upload.single("file"), async (req, res) => {
  if (!req.file) {
    res.status(400).json({ error: "No file uploaded (expected multipart field 'file')" });
    return;
  }

  const outputDir = path.join(DATA_DIR, path.basename(req.file.filename, path.extname(req.file.filename)));
  fs.mkdirSync(outputDir, { recursive: true });

  const [job] = await db
    .insert(jobsTable)
    .values({
      filename: req.file.originalname,
      inputPath: req.file.path,
    })
    .returning();

  if (!job) {
    res.status(500).json({ error: "Failed to create job" });
    return;
  }

  runJob(job.id, req.file.path, outputDir);

  res.status(201).json({ id: job.id, status: job.status });
});

// GET /api/jobs/:id — poll status/stage
router.get("/jobs/:id", async (req, res) => {
  const [job] = await db.select().from(jobsTable).where(eq(jobsTable.id, req.params.id!));
  if (!job) {
    res.status(404).json({ error: "Job not found" });
    return;
  }
  res.json({
    id: job.id,
    filename: job.filename,
    status: job.status,
    stage: job.stage,
    summary: job.summary,
    fileCount: job.fileCount,
    error: job.error,
    createdAt: job.createdAt,
    updatedAt: job.updatedAt,
  });
});

// GET /api/jobs/:id/download — stream the resulting zip
router.get("/jobs/:id/download", async (req, res) => {
  const [job] = await db.select().from(jobsTable).where(eq(jobsTable.id, req.params.id!));
  if (!job) {
    res.status(404).json({ error: "Job not found" });
    return;
  }
  if (job.status !== "done" || !job.outputZipPath) {
    res.status(409).json({ error: `Job is not ready (status: ${job.status})` });
    return;
  }
  if (!fs.existsSync(job.outputZipPath)) {
    res.status(410).json({ error: "Output file no longer exists" });
    return;
  }

  const downloadName = `${path.basename(job.filename, path.extname(job.filename))}-decompiled.zip`;
  res.download(job.outputZipPath, downloadName);
});

export default router;
