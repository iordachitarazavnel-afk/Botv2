import { spawn } from "node:child_process";
import { createInterface } from "node:readline";
import path from "node:path";
import { db, jobsTable } from "@workspace/db";
import { eq } from "drizzle-orm";
import { logger } from "./logger";

const REPO_ROOT = path.resolve(import.meta.dirname, "../../../../");
const WORKER_SCRIPT = path.join(REPO_ROOT, "worker.py");
const PYTHON_BIN = process.env["PYTHON_BIN"] ?? "python3";

// How many worker.py processes may run at once. Each one spawns 4-5 Java
// decompilers in sequence, so keep this conservative relative to CPU cores.
const MAX_CONCURRENT_JOBS = Number(process.env["MAX_CONCURRENT_JOBS"] ?? 2);

interface QueuedJob {
  jobId: string;
  inputPath: string;
  outputDir: string;
}

const queue: QueuedJob[] = [];
let active = 0;

/** Adds a job to the queue and kicks off processing if a slot is free. */
export function enqueueJob(jobId: string, inputPath: string, outputDir: string): void {
  queue.push({ jobId, inputPath, outputDir });
  logger.info({ jobId, queueLength: queue.length, active }, "Job queued");
  pump();
}

/** Number of jobs waiting ahead of (and including) this one. 0 if not queued. */
export function queuePosition(jobId: string): number {
  const idx = queue.findIndex((j) => j.jobId === jobId);
  return idx === -1 ? 0 : idx + 1;
}

function pump(): void {
  while (active < MAX_CONCURRENT_JOBS && queue.length > 0) {
    const job = queue.shift();
    if (!job) break;
    active++;
    runJob(job).finally(() => {
      active--;
      pump();
    });
  }
}

function runJob(job: QueuedJob): Promise<void> {
  const { jobId, inputPath, outputDir } = job;

  return new Promise((resolve) => {
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
      logger.debug({ jobId }, chunk.toString().trim());
    });

    child.on("error", (err) => {
      logger.error({ jobId, err }, "Failed to spawn worker process");
      void db
        .update(jobsTable)
        .set({ status: "failed", stage: "Failed", error: err.message, updatedAt: new Date() })
        .where(eq(jobsTable.id, jobId));
      resolve();
    });

    child.on("close", (code) => {
      if (code !== 0) {
        logger.warn({ jobId, code }, "Worker exited non-zero");
      }
      resolve();
    });
  });
}
