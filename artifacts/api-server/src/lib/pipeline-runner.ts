import { spawn } from "node:child_process";
import { createInterface } from "node:readline";
import path from "node:path";
import { db, jobsTable } from "@workspace/db";
import { eq } from "drizzle-orm";
import { logger } from "./logger";

// Repo root — worker.py and deobf_pipeline.py live there (two levels up from
// artifacts/api-server/src/lib).
const REPO_ROOT = path.resolve(import.meta.dirname, "../../../../");
const WORKER_SCRIPT = path.join(REPO_ROOT, "worker.py");
const PYTHON_BIN = process.env["PYTHON_BIN"] ?? "python3";

/** Fire-and-forget: spawns the pipeline for a job and updates the DB as it progresses. */
export function runJob(jobId: string, inputPath: string, outputDir: string): void {
  const child = spawn(PYTHON_BIN, [WORKER_SCRIPT, inputPath, outputDir], {
    cwd: REPO_ROOT,
  });

  void db
    .update(jobsTable)
    .set({ status: "running", stage: "Starting…", updatedAt: new Date() })
    .where(eq(jobsTable.id, jobId));

  const rl = createInterface({ input: child.stdout });

  rl.on("line", (line) => {
    if (!line.trim()) return;
    let msg: Record<string, unknown>;
    try {
      msg = JSON.parse(line);
    } catch {
      logger.warn({ jobId, line }, "Non-JSON line from worker, ignoring");
      return;
    }

    if (msg["type"] === "stage") {
      void db
        .update(jobsTable)
        .set({ stage: String(msg["message"]), updatedAt: new Date() })
        .where(eq(jobsTable.id, jobId));
    } else if (msg["type"] === "result") {
      if (msg["success"]) {
        void db
          .update(jobsTable)
          .set({
            status: "done",
            stage: "Complete",
            outputZipPath: String(msg["zip_path"]),
            fileCount: Number(msg["file_count"] ?? 0),
            summary: String(msg["summary"] ?? ""),
            updatedAt: new Date(),
          })
          .where(eq(jobsTable.id, jobId));
      } else {
        void db
          .update(jobsTable)
          .set({
            status: "failed",
            stage: "Failed",
            error: String(msg["error"] ?? "Unknown error"),
            updatedAt: new Date(),
          })
          .where(eq(jobsTable.id, jobId));
      }
    }
  });

  child.stderr.on("data", (chunk: Buffer) => {
    // Worker's own logger writes here — useful for debugging, not job state.
    logger.debug({ jobId }, chunk.toString().trim());
  });

  child.on("error", (err) => {
    logger.error({ jobId, err }, "Failed to spawn worker process");
    void db
      .update(jobsTable)
      .set({ status: "failed", stage: "Failed", error: err.message, updatedAt: new Date() })
      .where(eq(jobsTable.id, jobId));
  });

  child.on("close", (code) => {
    if (code !== 0) {
      logger.warn({ jobId, code }, "Worker exited non-zero");
    }
  });
}
