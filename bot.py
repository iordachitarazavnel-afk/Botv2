#!/usr/bin/env python3
"""
===============================================================================
 GHOST'S JAVA DECOMPILER & DEOBFUSCATOR — DISCORD BOT
 For VEX ⚡
===============================================================================

 Thin Discord wrapper around the shared pipeline in deobf_pipeline.py.
 The website (worker.py / Express API) uses the exact same pipeline, so any
 fix made to deobf_pipeline.py automatically applies to both — no more
 duplicated logic to keep in sync.
===============================================================================
"""
import sys
import asyncio
import shutil
import zipfile
from pathlib import Path
from collections import defaultdict
from typing import Dict, Any

try:
    import discord
    from discord.ext import commands
except ImportError:
    print("discord.py not installed. Run: pip install discord.py")
    sys.exit(1)

from deobf_pipeline import Config, DecompilerBot, ObfuscatorRegistry, logger

# ============================================================================
# DISCORD BOT
# ============================================================================

intents = discord.Intents.default()
intents.message_content = True
bot = commands.Bot(command_prefix=Config.BOT_PREFIX, intents=intents, help_command=None)


@bot.event
async def on_ready():
    logger.info(f"{bot.user} is online!")
    await bot.change_presence(activity=discord.Activity(
        type=discord.ActivityType.watching,
        name=f"{Config.BOT_PREFIX}decompile | {len(ObfuscatorRegistry.OBFUSCATORS)} obfuscators",
    ))


@bot.command(name="decompile")
async def decompile_command(ctx, *args):
    if not ctx.message.attachments:
        await ctx.send("❌ Attach a `.jar`, `.class`, or `.zip` file to decompile!")
        return

    attachment = ctx.message.attachments[0]
    if not any(attachment.filename.lower().endswith(ext) for ext in (".jar", ".class", ".zip")):
        await ctx.send("❌ Only `.jar`, `.class`, and `.zip` files are supported.")
        return
    if attachment.size > Config.MAX_FILE_SIZE:
        await ctx.send(f"❌ File too large! Max: {Config.MAX_FILE_SIZE // (1024*1024)} MB")
        return

    skip_download = "--skip-dl" in args

    job_dir = Config.TEMP_DIR / f"job_{ctx.message.id}"
    job_dir.mkdir(parents=True, exist_ok=True)
    input_file = job_dir / attachment.filename

    status_msg = await ctx.send(f"📥 Downloading `{attachment.filename}` ({attachment.size//1024} KB)…")
    await attachment.save(input_file)
    logger.info(f"[cmd] decompile: {attachment.filename} ({attachment.size} B) job={ctx.message.id}")

    loop = asyncio.get_event_loop()

    # ── live status updater ────────────────────────────────────────────────
    _stage: list = ["Starting…"]

    def progress_cb(stage: str):
        _stage[0] = stage
        logger.info(f"[pipeline] {stage}")

    async def status_updater():
        """Edit the status message every 5 s so the user sees progress."""
        dot = 0
        dots = ["⣾", "⣽", "⣻", "⢿", "⡿", "⣟", "⣯", "⣷"]
        while True:
            try:
                await status_msg.edit(content=f"{dots[dot % 8]} `{attachment.filename}` — {_stage[0]}")
            except Exception:
                pass
            dot += 1
            await asyncio.sleep(5)

    updater_task = asyncio.ensure_future(status_updater())

    try:
        import concurrent.futures
        with concurrent.futures.ThreadPoolExecutor(max_workers=1) as pool:
            decompiler = DecompilerBot(skip_download=skip_download, progress_cb=progress_cb)
            success, message = await loop.run_in_executor(pool, decompiler.run, input_file)
    except Exception as exc:
        success, message = False, str(exc)
        logger.exception("decompile_command executor error")
    finally:
        updater_task.cancel()

    if not success:
        logger.warning(f"[cmd] decompile FAILED: {message}")
        await status_msg.edit(content=f"❌ Failed: {message}")
        shutil.rmtree(job_dir, ignore_errors=True)
        return

    # ── zip up the output and send ─────────────────────────────────────────
    output_base = Path(Config.OUTPUT_DIR)
    zip_path = job_dir / "decompiled_output.zip"
    file_count = 0
    with zipfile.ZipFile(zip_path, 'w', zipfile.ZIP_DEFLATED) as zf:
        for file in sorted(output_base.rglob("*")):
            if file.is_file():
                zf.write(file, str(file.relative_to(output_base)))
                file_count += 1

    zip_size = zip_path.stat().st_size
    logger.info(f"[cmd] decompile OK: {file_count} files in ZIP ({zip_size//1024} KB)")

    if zip_size > 8 * 1024 * 1024:
        await status_msg.edit(content=f"{message}\n⚠️ Output ZIP is {zip_size//1024//1024} MB (too large for Discord). Split or contact server admin.")
    else:
        try:
            await ctx.send(content=message, file=discord.File(str(zip_path), filename="decompiled_output.zip"))
            await status_msg.delete()
        except discord.HTTPException as e:
            await status_msg.edit(content=f"{message}\n⚠️ Could not send file: {e}")

    shutil.rmtree(job_dir, ignore_errors=True)


@bot.command(name="obfuscators")
async def list_obfuscators_command(ctx):
    embed = discord.Embed(title=f"Supported Obfuscators ({len(ObfuscatorRegistry.OBFUSCATORS)})", color=0x9B59B6)
    by_tech = defaultdict(list)
    for name, config in ObfuscatorRegistry.OBFUSCATORS.items():
        for tech in config["techniques"]:
            by_tech[tech].append(name)
    for tech, names in sorted(by_tech.items()):
        embed.add_field(name=f"{tech} ({len(names)})", value=", ".join(sorted(names)), inline=False)
    await ctx.send(embed=embed)


@bot.command(name="help")
async def help_command(ctx):
    embed = discord.Embed(title="GHOST's Java Decompiler Bot", description="Multi-engine decompilation with full deobfuscation.", color=0x9B59B6)
    embed.add_field(name=f"{Config.BOT_PREFIX}decompile", value="Decompile attached file", inline=False)
    embed.add_field(name=f"{Config.BOT_PREFIX}obfuscators", value="List supported obfuscators", inline=False)
    await ctx.send(embed=embed)


if __name__ == "__main__":
    if Config.BOT_TOKEN == "PUT_TOKEN_HERE":
        print("Set DISCORD_BOT_TOKEN env var!")
        sys.exit(1)
    bot.run(Config.BOT_TOKEN)
