#!/usr/bin/env python3
"""
worker.py — headless CLI entry point for the decompilation pipeline.

Usage:
    python3 worker.py <input_file> <output_dir> [--skip-dl]

Emits one JSON object per line on stdout:
    {"type": "stage",  "message": "..."}                          — progress update
    {"type": "result", "success": true,  "zip_path": "...", "summary": "..."}
    {"type": "result", "success": false, "error": "..."}

Nothing else is ever written to stdout — all human-readable/debug logging goes
to stderr (see logger setup in deobf_pipeline.py) so the Node parent process
can safely treat every stdout line as JSON.
"""
import sys
import json
import shutil
import zipfile
import argparse
from pathlib import Path

from deobf_pipeline import DecompilerBot, Config


def emit(obj: dict) -> None:
    sys.stdout.write(json.dumps(obj) + "\n")
    sys.stdout.flush()


def main() -> int:
    parser = argparse.ArgumentParser(description="Run the decompilation pipeline headlessly")
    parser.add_argument("input_file", type=Path, help="Path to the uploaded .jar/.class/.zip")
    parser.add_argument("output_dir", type=Path, help="Directory to write decompiled_output.zip into")
    parser.add_argument("--skip-dl", action="store_true", help="Skip dependency download check")
    args = parser.parse_args()

    if not args.input_file.exists():
        emit({"type": "result", "success": False, "error": f"Input file not found: {args.input_file}"})
        return 1

    args.output_dir.mkdir(parents=True, exist_ok=True)

    def progress_cb(stage: str) -> None:
        emit({"type": "stage", "message": stage})

    bot = DecompilerBot(skip_download=args.skip_dl, progress_cb=progress_cb)
    success, message = bot.run(args.input_file)

    if not success:
        emit({"type": "result", "success": False, "error": message})
        return 1

    # Zip up Config.OUTPUT_DIR into the job's output directory
    emit({"type": "stage", "message": "Packaging results…"})
    output_base = Path(Config.OUTPUT_DIR)
    zip_path = args.output_dir / "decompiled_output.zip"
    file_count = 0
    with zipfile.ZipFile(zip_path, "w", zipfile.ZIP_DEFLATED) as zf:
        for file in sorted(output_base.rglob("*")):
            if file.is_file():
                zf.write(file, str(file.relative_to(output_base)))
                file_count += 1

    emit({
        "type": "result",
        "success": True,
        "zip_path": str(zip_path),
        "file_count": file_count,
        "summary": message,
    })
    return 0


if __name__ == "__main__":
    sys.exit(main())
