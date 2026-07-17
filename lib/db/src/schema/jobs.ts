import { pgTable, text, integer, timestamp, uuid } from "drizzle-orm/pg-core";
import { createInsertSchema } from "drizzle-zod";
import { z } from "zod/v4";

export const jobStatusValues = [
  "queued",
  "running",
  "done",
  "failed",
] as const;
export type JobStatus = (typeof jobStatusValues)[number];

export const jobsTable = pgTable("jobs", {
  id: uuid("id").primaryKey().defaultRandom(),
  filename: text("filename").notNull(),
  status: text("status").$type<JobStatus>().notNull().default("queued"),
  stage: text("stage").notNull().default("Queued…"),
  inputPath: text("input_path").notNull(),
  outputZipPath: text("output_zip_path"),
  fileCount: integer("file_count"),
  summary: text("summary"),
  error: text("error"),
  createdAt: timestamp("created_at").notNull().defaultNow(),
  updatedAt: timestamp("updated_at").notNull().defaultNow(),
});

export const insertJobSchema = createInsertSchema(jobsTable).omit({
  id: true,
  status: true,
  stage: true,
  outputZipPath: true,
  fileCount: true,
  summary: true,
  error: true,
  createdAt: true,
  updatedAt: true,
});
export type InsertJob = z.infer<typeof insertJobSchema>;
export type Job = typeof jobsTable.$inferSelect;
