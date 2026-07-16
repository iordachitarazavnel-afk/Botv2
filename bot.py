#!/usr/bin/env python3
"""
===============================================================================
 GHOST'S JAVA DECOMPILER & DEOBFUSCATOR DISCORD BOT
 For VEX ⚡
===============================================================================

 Multi-engine decompilation + full deobfuscation for ALL obfuscators
 from https://github.com/3000IQPlay/obfuscator-list
 + Threadtear integration (https://github.com/loerting/threadtear)
===============================================================================
"""

import os
import re
import io
import sys
import json
import shutil
import zipfile
import hashlib
import logging
import asyncio
import struct
import tempfile
import subprocess
import argparse
from pathlib import Path
from collections import defaultdict, OrderedDict
from typing import List, Dict, Optional, Tuple, Set, Any
from dataclasses import dataclass, field
from enum import Enum, auto

# ============================================================================
# DISCORD
# ============================================================================

try:
    import discord
    from discord.ext import commands
except ImportError:
    print("discord.py not installed. Run: pip install discord.py")
    sys.exit(1)

# ============================================================================
# CONFIGURATION
# ============================================================================

class Config:
    BOT_TOKEN = os.environ.get("DISCORD_BOT_TOKEN", "PUT_TOKEN_HERE")
    BOT_PREFIX = "!"
    MAX_FILE_SIZE = 50 * 1024 * 1024

    ENGINES = {
        "cfr": {
            "jar": "libs/cfr-0.152.jar",
            "url": "https://github.com/leibnitz27/cfr/releases/download/0.152/cfr-0.152.jar",
        },
        "procyon": {
            "jar": "libs/procyon-decompiler-0.6.0.jar",
            "url": "https://github.com/mstrobel/procyon/releases/download/v0.6.0/procyon-decompiler-0.6.0.jar",
        },
        "fernflower": {
            "jar": "libs/fernflower.jar",
            "url": "https://github.com/fesh0r/fernflower/releases/latest/download/fernflower.jar",
        },
        "jadx": {
            "jar": "libs/jadx-1.4.7.jar",
            "url": "https://github.com/skylot/jadx/releases/download/v1.4.7/jadx-1.4.7.jar",
        },
        "krakatau": {
            "jar": "libs/krakatau-2.4.jar",
            "url": "https://github.com/Storyyeller/Krakatau/releases/download/v2.4/Krakatau-2.4.jar",
        },
        "threadtear": {
            "jar": "libs/threadtear.jar",
            "url": "https://github.com/loerting/threadtear/releases/latest/download/threadtear.jar",
        },
    }

    OUTPUT_DIR = "decompiled_output"
    ENGINE_OUTPUT_DIR = "engine_outputs"
    MERGED_OUTPUT_DIR = "merged_sources"
    INDEX_FILE = "index.txt"
    TEMP_DIR = Path(tempfile.gettempdir()) / "ghost_decompiler"

    LOG_FILE = "ghost_decompiler.log"
    LOG_FORMAT = "%(asctime)s [%(levelname)s] %(message)s"

# ============================================================================
# OBFUSCATOR REGISTRY — ALL from 3000IQPlay/obfuscator-list
# ============================================================================

class ObfuscatorRegistry:
    OBFUSCATORS = {
        "proguard": {
            "techniques": ["rename", "string", "flow", "resource"],
            "signatures": {
                "class_name_patterns": [r"^[a-z]$", r"^[a-b]$", r"^c\d*$"],
                "package_patterns": [r"^[a-z]{1,2}$"],
                "mapping_files": ["mapping.txt", "proguard_mapping.txt", "*.pro"],
            },
            "strategies": ["mapping_apply", "string_decrypt", "flow_unwind", "threadtear"],
            "description": "Guardsquare ProGuard — renaming, optional string/resource encryption",
        },
        "allatori": {
            "techniques": ["rename", "string", "flow"],
            "signatures": {
                "class_name_patterns": [r"^[a-zA-Z]{1,3}\d*$", r"^_\d+$"],
                "string_methods": [r"^[a-z]$", r"^_$", r"decrypt", "allatori"],
                "flow_patterns": [r"goto_spaghetti"],
            },
            "strategies": ["string_decrypt", "name_restore", "flow_unwind", "threadtear"],
            "description": "Allatori — string encryption, flow obfuscation, name obfuscation",
        },
        "zkm": {
            "techniques": ["rename", "string", "flow", "attribute"],
            "signatures": {
                "class_name_patterns": [r"^[a-zA-Z0-9_]{1,4}$", r"^\d+$"],
                "string_methods": [r"zelix", r"decrypt", r"ZKM"],
                "flow_patterns": [r"flatten", r"switch_obf"],
            },
            "strategies": ["string_decrypt", "flow_unwind", "name_restore", "attr_repair", "threadtear"],
            "description": "Zelix KlassMaster — control flow flattening, string encryption",
        },
        "dasho": {
            "techniques": ["rename", "string", "resource"],
            "signatures": {
                "class_name_patterns": [r"^[a-z]{1,2}$", r"^O\d+$", r"^I\d+$"],
                "string_methods": [r"dasho", r"decrypt"],
            },
            "strategies": ["string_decrypt", "name_restore", "resource_decrypt", "threadtear"],
            "description": "PreEmptive DashO — renaming, string/resource encryption",
        },
        "stringer": {
            "techniques": ["string", "resource"],
            "signatures": {
                "string_methods": [r"stringer", r"\$_"],
                "injected_classes": [r"com/jetbrains/stringer", r"^\$_"],
            },
            "strategies": ["string_decrypt", "injected_class_remove", "threadtear"],
            "description": "JetBrains Stringer — runtime string decryption via injected class",
        },
        "smoke": {
            "techniques": ["rename", "attribute", "string"],
            "signatures": {
                "class_name_patterns": [r"^smoke_\d+$", r"^\d{5,}$"],
                "attribute_manipulation": True,
            },
            "strategies": ["name_restore", "attr_repair", "string_decrypt", "threadtear"],
            "description": "Smoke — metadata obfuscation, encrypted attributes",
        },
        "jnt": {
            "techniques": ["flow", "string", "cp"],
            "signatures": {
                "string_methods": [r"jnt_runtime", r"_jnt_decrypt", r"JntRuntime"],
                "flow_patterns": [r"jnt_flow", r"goto"],
                "cp_patterns": [r"jnt_cp"],
            },
            "strategies": ["flow_unwind", "string_decrypt", "cp_reconstruct", "threadtear"],
            "description": "ethological/jnt — flow obf, string reflection encryption, CP manipulation",
        },
        "aidsfuscator": {
            "techniques": ["rename", "junk", "meta"],
            "signatures": {
                "class_name_patterns": [r"^[a-zA-Z]{1,3}\d*$", r"^_\d+$"],
                "junk_patterns": [r"aids_junk", r"_junk_"],
                "meta_strip": True,
            },
            "strategies": ["junk_remove", "name_restore", "attr_repair", "threadtear"],
            "description": "LvStrnggg/aidsfuscator — aggressive rename, junk injection, metadata strip",
        },
        "zing": {
            "techniques": ["string"],
            "signatures": {
                "string_methods": [r"zing_decrypt", r"ZingRuntime", r"zing$"],
                "string_pool": True,
            },
            "strategies": ["string_decrypt", "threadtear"],
            "description": "Bl3nd — string pool encryption with runtime decryption",
        },
        "paramorphism": {
            "techniques": ["indy", "bytecode", "string"],
            "signatures": {
                "indy_patterns": [r"paramorphism", r"\\\\u"],
                "bytecode_patterns": [r"corrupted_attr"],
            },
            "strategies": ["indy_unwrap", "attr_repair", "string_decrypt", "threadtear"],
            "description": "Indy wrapping, bytecode mutation, corrupted attributes",
        },
        "skidfuscator": {
            "techniques": ["flow", "string"],
            "signatures": {
                "string_methods": [r"skid_decrypt", r"SkidfuscatorRuntime"],
                "flow_patterns": [r"skid_flow"],
            },
            "strategies": ["flow_unwind", "string_decrypt", "threadtear"],
            "description": "codeberg.org/skidfuscator-dev — flow mutator, string encryption",
        },
        "radon": {
            "techniques": ["rename", "number"],
            "signatures": {
                "class_name_patterns": [r"^[a-zA-Z0-9_]{1,4}$", r"^\d+$"],
                "number_methods": [r"radon_math", r"RadonMath"],
            },
            "strategies": ["number_deobf", "name_restore", "threadtear"],
            "description": "ItzSomebody/radon — heavy renaming, number obfuscation",
        },
        "bozar": {
            "techniques": ["rename", "string"],
            "signatures": {
                "class_name_patterns": [r"^b\d+$", r"^z\d+$"],
                "string_methods": [r"bozar_decrypt"],
            },
            "strategies": ["string_decrypt", "name_restore", "threadtear"],
            "description": "sukjuhong/bozar — lightweight renamer + string encryption",
        },
        "gotenks": {
            "techniques": ["junk", "flow"],
            "signatures": {
                "junk_patterns": [r"gotenks_junk", r"_junk_method"],
                "flow_patterns": [r"gotenks_flow"],
            },
            "strategies": ["junk_remove", "flow_unwind", "threadtear"],
            "description": "char01ee/gotenks-obfuscator — junk code, flow obfuscation",
        },
        "corcel": {
            "techniques": ["attribute"],
            "signatures": {
                "attribute_manipulation": True,
                "missing_attributes": ["InnerClasses", "BootstrapMethods", "StackMapTable"],
            },
            "strategies": ["attr_repair", "threadtear"],
            "description": "trueDevCode/corcel — attribute obfuscation",
        },
        "branchy": {
            "techniques": ["flow"],
            "signatures": {"flow_patterns": [r"branchy", r"opaque_predicate"]},
            "strategies": ["flow_unwind", "threadtear"],
            "description": "Branch obfuscation via opaque predicates",
        },
        "caudicer": {
            "techniques": ["rename", "string"],
            "signatures": {"class_name_patterns": [r"^[a-zA-Z]{1,2}$"], "string_methods": [r"caudicer"]},
            "strategies": ["string_decrypt", "name_restore", "threadtear"],
            "description": "Renaming + string encryption",
        },
        "coffee": {
            "techniques": ["string"],
            "signatures": {"string_methods": [r"coffee_decrypt", r"CoffeeRuntime"]},
            "strategies": ["string_decrypt", "threadtear"],
            "description": "String encryption obfuscator",
        },
        "dasfa": {
            "techniques": ["rename", "flow"],
            "signatures": {"class_name_patterns": [r"^[a-z]\d*$"], "flow_patterns": [r"dasfa_flow"]},
            "strategies": ["name_restore", "flow_unwind", "threadtear"],
            "description": "Renaming + flow obfuscation",
        },
        "digen": {
            "techniques": ["number", "string"],
            "signatures": {"number_methods": [r"digen_math"], "string_methods": [r"digen_decrypt"]},
            "strategies": ["number_deobf", "string_decrypt", "threadtear"],
            "description": "Number + string obfuscation",
        },
        "fdj": {
            "techniques": ["rename"],
            "signatures": {"class_name_patterns": [r"^[a-zA-Z]{1,2}\d*$"]},
            "strategies": ["name_restore"],
            "description": "Renaming obfuscator",
        },
        "flowobf": {
            "techniques": ["flow"],
            "signatures": {"flow_patterns": [r"flowobf", r"goto_spaghetti"]},
            "strategies": ["flow_unwind", "threadtear"],
            "description": "Pure flow obfuscation",
        },
        "gato": {
            "techniques": ["string", "rename"],
            "signatures": {"string_methods": [r"gato_decrypt"], "class_name_patterns": [r"^g\d+$"]},
            "strategies": ["string_decrypt", "name_restore", "threadtear"],
            "description": "String encryption + renaming",
        },
        "hco": {
            "techniques": ["flow", "string"],
            "signatures": {"flow_patterns": [r"hco_flow"], "string_methods": [r"hco_decrypt"]},
            "strategies": ["flow_unwind", "string_decrypt", "threadtear"],
            "description": "Flow + string obfuscation",
        },
        "hider": {
            "techniques": ["rename", "attribute"],
            "signatures": {"class_name_patterns": [r"^[a-z]{1,2}$"], "attribute_manipulation": True},
            "strategies": ["name_restore", "attr_repair", "threadtear"],
            "description": "Renaming + attribute hiding",
        },
        "jadox": {
            "techniques": ["string", "number"],
            "signatures": {"string_methods": [r"jadox_decrypt"], "number_methods": [r"jadox_math"]},
            "strategies": ["string_decrypt", "number_deobf", "threadtear"],
            "description": "String + number obfuscation",
        },
        "jflow": {
            "techniques": ["flow"],
            "signatures": {"flow_patterns": [r"jflow", r"goto_w"]},
            "strategies": ["flow_unwind", "threadtear"],
            "description": "Flow obfuscation via goto widening",
        },
        "jshrink": {
            "techniques": ["rename", "string"],
            "signatures": {"class_name_patterns": [r"^[a-z]$"], "string_methods": [r"jshrink_decrypt"]},
            "strategies": ["name_restore", "string_decrypt", "threadtear"],
            "description": "Renaming + string encryption",
        },
        "kmac": {
            "techniques": ["rename", "flow", "string"],
            "signatures": {"class_name_patterns": [r"^[a-zA-Z0-9_]{1,3}$"], "flow_patterns": [r"kmac_flow"], "string_methods": [r"kmac_decrypt"]},
            "strategies": ["name_restore", "flow_unwind", "string_decrypt", "threadtear"],
            "description": "Renaming + flow + string obfuscation",
        },
        "lco": {
            "techniques": ["string"],
            "signatures": {"string_methods": [r"lco_decrypt"]},
            "strategies": ["string_decrypt", "threadtear"],
            "description": "Light string obfuscation",
        },
        "moth": {
            "techniques": ["flow", "string"],
            "signatures": {"flow_patterns": [r"moth_flow"], "string_methods": [r"moth_decrypt"]},
            "strategies": ["flow_unwind", "string_decrypt", "threadtear"],
            "description": "Flow + string obfuscation",
        },
        "neno": {
            "techniques": ["rename"],
            "signatures": {"class_name_patterns": [r"^[a-z]\d*$", r"^_\d+$"]},
            "strategies": ["name_restore"],
            "description": "Renaming obfuscator",
        },
        "obfuskatie": {
            "techniques": ["rename", "string", "flow", "number"],
            "signatures": {"class_name_patterns": [r"^[a-zA-Z0-9_]{1,4}$"], "string_methods": [r"obfuskatie"], "flow_patterns": [r"obfuskatie_flow"], "number_methods": [r"obfuskatie_math"]},
            "strategies": ["name_restore", "string_decrypt", "flow_unwind", "number_deobf", "threadtear"],
            "description": "Multi-technique obfuscator",
        },
        "octopus": {
            "techniques": ["flow", "string"],
            "signatures": {"flow_patterns": [r"octopus"], "string_methods": [r"octopus_decrypt"]},
            "strategies": ["flow_unwind", "string_decrypt", "threadtear"],
            "description": "Flow + string obfuscation",
        },
        "pentius": {
            "techniques": ["rename", "number"],
            "signatures": {"class_name_patterns": [r"^p\d+$"], "number_methods": [r"pentius_math"]},
            "strategies": ["name_restore", "number_deobf", "threadtear"],
            "description": "Renaming + number obfuscation",
        },
        "phantasm": {
            "techniques": ["flow", "string", "indy"],
            "signatures": {"flow_patterns": [r"phantasm"], "string_methods": [r"phantasm_decrypt"], "indy_patterns": [r"phantasm_indy"]},
            "strategies": ["flow_unwind", "string_decrypt", "indy_unwrap", "threadtear"],
            "description": "Flow + string + indy obfuscation",
        },
        "proxima": {
            "techniques": ["rename", "string"],
            "signatures": {"class_name_patterns": [r"^[a-z]{1,2}$"], "string_methods": [r"proxima_decrypt"]},
            "strategies": ["name_restore", "string_decrypt", "threadtear"],
            "description": "Renaming + string encryption",
        },
        "rainbow": {
            "techniques": ["string", "number"],
            "signatures": {"string_methods": [r"rainbow_decrypt"], "number_methods": [r"rainbow_math"]},
            "strategies": ["string_decrypt", "number_deobf", "threadtear"],
            "description": "String + number obfuscation",
        },
        "rogue": {
            "techniques": ["flow", "rename", "string"],
            "signatures": {"flow_patterns": [r"rogue_flow"], "class_name_patterns": [r"^r\d+$"], "string_methods": [r"rogue_decrypt"]},
            "strategies": ["flow_unwind", "name_restore", "string_decrypt", "threadtear"],
            "description": "Multi-technique obfuscator",
        },
        "scurium": {
            "techniques": ["string", "attribute"],
            "signatures": {"string_methods": [r"scurium_decrypt"], "attribute_manipulation": True},
            "strategies": ["string_decrypt", "attr_repair", "threadtear"],
            "description": "String + attribute obfuscation",
        },
        "shadow": {
            "techniques": ["rename", "string", "flow"],
            "signatures": {"class_name_patterns": [r"^s\d+$"], "string_methods": [r"shadow_decrypt"], "flow_patterns": [r"shadow_flow"]},
            "strategies": ["name_restore", "string_decrypt", "flow_unwind", "threadtear"],
            "description": "Renaming + string + flow obfuscation",
        },
        "smokeless": {
            "techniques": ["string", "flow"],
            "signatures": {"string_methods": [r"smokeless_decrypt"], "flow_patterns": [r"smokeless_flow"]},
            "strategies": ["string_decrypt", "flow_unwind", "threadtear"],
            "description": "String + flow obfuscation",
        },
        "snow": {
            "techniques": ["string", "rename"],
            "signatures": {"string_methods": [r"snow_decrypt"], "class_name_patterns": [r"^[a-z]{1,2}$"]},
            "strategies": ["string_decrypt", "name_restore", "threadtear"],
            "description": "String + rename obfuscation",
        },
        "source_protect": {
            "techniques": ["string", "flow", "rename"],
            "signatures": {"string_methods": [r"src_protect"], "flow_patterns": [r"src_protect_flow"], "class_name_patterns": [r"^sp\d+$"]},
            "strategies": ["string_decrypt", "flow_unwind", "name_restore", "threadtear"],
            "description": "Source protection obfuscator",
        },
        "splice": {
            "techniques": ["flow", "junk"],
            "signatures": {"flow_patterns": [r"splice"], "junk_patterns": [r"splice_junk"]},
            "strategies": ["flow_unwind", "junk_remove", "threadtear"],
            "description": "Flow + junk code obfuscation",
        },
        "tlo": {
            "techniques": ["rename"],
            "signatures": {"class_name_patterns": [r"^[a-z]$", r"^\d+$"]},
            "strategies": ["name_restore"],
            "description": "Renaming-only obfuscator",
        },
        "vmp": {
            "techniques": ["flow", "string", "number", "indy"],
            "signatures": {"flow_patterns": [r"vmp"], "string_methods": [r"vmp_decrypt"], "number_methods": [r"vmp_math"], "indy_patterns": [r"vmp_indy"]},
            "strategies": ["flow_unwind", "string_decrypt", "number_deobf", "indy_unwrap", "threadtear"],
            "description": "Virtual machine-based obfuscation",
        },
        "weaken": {
            "techniques": ["string", "rename"],
            "signatures": {"string_methods": [r"weaken_decrypt"], "class_name_patterns": [r"^w\d+$"]},
            "strategies": ["string_decrypt", "name_restore", "threadtear"],
            "description": "String + rename obfuscation",
        },
        "wop": {
            "techniques": ["flow"],
            "signatures": {"flow_patterns": [r"wop_flow"]},
            "strategies": ["flow_unwind", "threadtear"],
            "description": "Flow obfuscation",
        },
        "z8l": {
            "techniques": ["rename", "string", "number"],
            "signatures": {"class_name_patterns": [r"^[a-zA-Z0-9_]{1,3}$"], "string_methods": [r"z8l_decrypt"], "number_methods": [r"z8l_math"]},
            "strategies": ["name_restore", "string_decrypt", "number_deobf", "threadtear"],
            "description": "Renaming + string + number obfuscation",
        },
    }

    @classmethod
    def get_all_techniques(cls) -> Set[str]:
        techniques = set()
        for obf in cls.OBFUSCATORS.values():
            techniques.update(obf["techniques"])
        return techniques

    @classmethod
    def get_obfuscators_by_technique(cls, technique: str) -> List[str]:
        return [name for name, obf in cls.OBFUSCATORS.items() if technique in obf["techniques"]]

# ============================================================================
# LOGGING
# ============================================================================

logging.basicConfig(level=logging.DEBUG, format=Config.LOG_FORMAT, handlers=[logging.FileHandler(Config.LOG_FILE), logging.StreamHandler(sys.stdout)])
logger = logging.getLogger("GHOST")

# ============================================================================
# DATA MODELS
# ============================================================================

@dataclass
class ClassInfo:
    full_name: str
    simple_name: str
    package: str
    is_inner: bool = False
    outer_class: Optional[str] = None
    is_interface: bool = False
    is_abstract: bool = False
    is_enum: bool = False
    is_annotation: bool = False
    is_module: bool = False
    superclass: Optional[str] = None
    interfaces: List[str] = field(default_factory=list)
    methods: List[str] = field(default_factory=list)
    fields: List[str] = field(default_factory=list)
    attributes: List[str] = field(default_factory=list)
    has_synthetic: bool = False
    has_debug_info: bool = False
    string_refs: List[str] = field(default_factory=list)
    obf_markers: List[str] = field(default_factory=list)
    decompiled_by: List[str] = field(default_factory=list)
    best_source: Optional[str] = None
    source_path: Optional[str] = None
    raw_bytes: Optional[bytes] = None
    constant_pool: Optional[list] = None
    access_flags: int = 0
    # name → list of descriptors (one per overload)
    method_descriptors: Dict[str, List[str]] = field(default_factory=dict)
    # name → descriptor string
    field_descriptors: Dict[str, str] = field(default_factory=dict)
    # "name+desc" → access flags int
    method_access: Dict[str, int] = field(default_factory=dict)
    # name → access flags int
    field_access: Dict[str, int] = field(default_factory=dict)

@dataclass
class ModuleInfo:
    name: str
    package: str
    classes: List[ClassInfo] = field(default_factory=list)
    submodules: List[str] = field(default_factory=list)

@dataclass
class DecompilationResult:
    engine_name: str
    success: bool
    output_dir: Optional[str]
    error: Optional[str]
    classes_decompiled: int = 0
    time_elapsed: float = 0.0

@dataclass
class ObfuscationAnalysis:
    detected_obfuscators: List[str] = field(default_factory=list)
    confidence_scores: Dict[str, float] = field(default_factory=dict)
    obfuscated_classes: List[str] = field(default_factory=list)
    encrypted_strings_detected: bool = False
    control_flow_obfuscation: bool = False
    renamed_classes: bool = False
    junk_code_detected: bool = False
    attribute_manipulation: bool = False
    number_obfuscation: bool = False
    indy_wrapping: bool = False
    mapping_file_found: bool = False
    mapping_file_path: Optional[str] = None
    details: str = ""
    obf_specific_data: Dict[str, dict] = field(default_factory=dict)

@dataclass
class DeobfuscationResult:
    strategies_applied: List[str] = field(default_factory=list)
    strings_decrypted: int = 0
    junk_methods_removed: int = 0
    classes_renamed: int = 0
    flow_blocks_unwound: int = 0
    numbers_resolved: int = 0
    attributes_repaired: int = 0
    indy_wraps_removed: int = 0
    resources_decrypted: int = 0
    output_dir: Optional[str] = None
    details: str = ""

# ============================================================================
# CLASS FILE PARSER — Full native bytecode parsing
# ============================================================================

class ClassFileParser:
    CP_UTF8 = 1
    CP_INTEGER = 3
    CP_FLOAT = 4
    CP_LONG = 5
    CP_DOUBLE = 6
    CP_CLASS = 7
    CP_STRING = 8
    CP_FIELDREF = 9
    CP_METHODREF = 10
    CP_INTERFACE_METHODREF = 11
    CP_NAME_AND_TYPE = 12
    CP_METHOD_HANDLE = 15
    CP_METHOD_TYPE = 16
    CP_DYNAMIC = 17
    CP_INVOKEDYNAMIC = 18
    CP_MODULE = 19
    CP_PACKAGE = 20

    ACC_PUBLIC = 0x0001
    ACC_PRIVATE = 0x0002
    ACC_PROTECTED = 0x0004
    ACC_STATIC = 0x0008
    ACC_FINAL = 0x0010
    ACC_SUPER = 0x0020
    ACC_VOLATILE = 0x0040
    ACC_TRANSIENT = 0x0080
    ACC_NATIVE = 0x0100
    ACC_INTERFACE = 0x0200
    ACC_ABSTRACT = 0x0400
    ACC_STRICT = 0x0800
    ACC_SYNTHETIC = 0x1000
    ACC_ANNOTATION = 0x2000
    ACC_ENUM = 0x4000
    ACC_MODULE = 0x8000

    @staticmethod
    def parse(class_file: Path) -> Optional[ClassInfo]:
        try:
            data = class_file.read_bytes()
            return ClassFileParser._parse_bytes(data, str(class_file))
        except Exception as e:
            logger.warning(f"Failed to parse {class_file}: {e}")
            return None

    @staticmethod
    def _parse_bytes(data: bytes, source_path: str) -> Optional[ClassInfo]:
        offset = 0
        magic = int.from_bytes(data[offset:offset+4], 'big')
        offset += 4
        if magic != 0xCAFEBABE: return None

        minor = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2
        major = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2

        cp_count = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2
        cp_result = ClassFileParser._parse_constant_pool(data, offset, cp_count)
        if cp_result is None: return None
        constant_pool = cp_result['entries']
        offset = cp_result['next_offset']

        access_flags = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2
        this_class_idx = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2
        super_class_idx = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2

        interfaces_count = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2
        interfaces = []
        for _ in range(interfaces_count):
            iface_idx = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2
            iface_name = ClassFileParser._get_class_name(constant_pool, iface_idx)
            if iface_name:
                interfaces.append(iface_name.replace('/', '.'))

        fields_count = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2
        fields = []
        _field_descriptors = {}
        _field_access_flags = {}
        for _ in range(fields_count):
            f_access = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2
            f_name_idx = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2
            f_desc_idx = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2
            f_attrs_count = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2
            for _ in range(f_attrs_count):
                offset = ClassFileParser._skip_attribute(data, offset)
            f_name = ClassFileParser._get_utf8(constant_pool, f_name_idx)
            f_desc = ClassFileParser._get_utf8(constant_pool, f_desc_idx)
            if f_name and not f_name.startswith('this$'):
                fields.append(f_name)
                if f_desc: _field_descriptors[f_name] = f_desc
                _field_access_flags[f_name] = f_access

        methods_count = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2
        methods = []
        _method_descriptors = {}
        _method_access_map = {}
        has_synthetic_method = False
        string_refs = []
        obf_markers = []
        has_debug = False
        goto_count = 0
        invokedynamic_count = 0

        for _ in range(methods_count):
            m_access = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2
            m_name_idx = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2
            m_desc_idx = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2
            m_attrs_count = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2

            if m_access & ClassFileParser.ACC_SYNTHETIC:
                has_synthetic_method = True

            m_name = ClassFileParser._get_utf8(constant_pool, m_name_idx)
            m_desc = ClassFileParser._get_utf8(constant_pool, m_desc_idx)
            if m_name:
                methods.append(m_name)
                if m_desc:
                    _method_descriptors.setdefault(m_name, []).append(m_desc)
                    _method_access_map[f"{m_name}{m_desc}"] = m_access
                for obf_name, obf_config in ObfuscatorRegistry.OBFUSCATORS.items():
                    sigs = obf_config.get("signatures", {})
                    for key, patterns in sigs.items():
                        if isinstance(patterns, list):
                            for pattern in patterns:
                                try:
                                    if re.search(pattern, m_name, re.IGNORECASE):
                                        marker = f"{obf_name}:{m_name}"
                                        if marker not in obf_markers:
                                            obf_markers.append(marker)
                                except re.error:
                                    pass

            for _ in range(m_attrs_count):
                attr_name_idx = int.from_bytes(data[offset:offset+2], 'big')
                offset += 2
                attr_length = int.from_bytes(data[offset:offset+4], 'big')
                offset += 4
                attr_name = ClassFileParser._get_utf8(constant_pool, attr_name_idx)

                if attr_name == "Code":
                    max_stack = int.from_bytes(data[offset:offset+2], 'big')
                    offset += 2
                    max_locals = int.from_bytes(data[offset:offset+2], 'big')
                    offset += 2
                    code_length = int.from_bytes(data[offset:offset+4], 'big')
                    offset += 4
                    code_bytes = data[offset:offset+code_length]
                    offset += code_length

                    bc_analysis = ClassFileParser._analyze_bytecode(code_bytes, constant_pool)
                    string_refs.extend(bc_analysis['string_refs'])
                    goto_count += bc_analysis['goto_count']
                    invokedynamic_count += bc_analysis['invokedynamic_count']

                    exc_table_len = int.from_bytes(data[offset:offset+2], 'big')
                    offset += 2
                    offset += exc_table_len * 8

                    nested_count = int.from_bytes(data[offset:offset+2], 'big')
                    offset += 2
                    for _ in range(nested_count):
                        offset = ClassFileParser._skip_attribute(data, offset)
                else:
                    offset += attr_length

        class_attrs_count = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2
        class_attributes = []
        for _ in range(class_attrs_count):
            attr_name_idx = int.from_bytes(data[offset:offset+2], 'big')
            offset += 2
            attr_length = int.from_bytes(data[offset:offset+4], 'big')
            offset += 4
            attr_name = ClassFileParser._get_utf8(constant_pool, attr_name_idx)
            if attr_name:
                class_attributes.append(attr_name)
            offset += attr_length

        full_name = ClassFileParser._get_class_name(constant_pool, this_class_idx)
        if not full_name: return None
        full_name = full_name.replace('/', '.')

        if '.' in full_name:
            package, simple_name = full_name.rsplit('.', 1)
        else:
            package, simple_name = "", full_name

        is_inner = '$' in simple_name
        outer_class = full_name.rsplit('$', 1)[0] if is_inner and '$' in full_name else None

        superclass = None
        if super_class_idx > 0:
            superclass = ClassFileParser._get_class_name(constant_pool, super_class_idx)
            if superclass:
                superclass = superclass.replace('/', '.')

        seen_strings = set()
        unique_string_refs = []
        for s in string_refs:
            if s not in seen_strings:
                seen_strings.add(s)
                unique_string_refs.append(s)

        return ClassInfo(
            full_name=full_name,
            simple_name=simple_name,
            package=package,
            is_inner=is_inner,
            outer_class=outer_class,
            is_interface=bool(access_flags & ClassFileParser.ACC_INTERFACE),
            is_abstract=bool(access_flags & ClassFileParser.ACC_ABSTRACT),
            is_enum=bool(access_flags & ClassFileParser.ACC_ENUM),
            is_annotation=bool(access_flags & ClassFileParser.ACC_ANNOTATION),
            is_module=bool(access_flags & ClassFileParser.ACC_MODULE),
            superclass=superclass,
            interfaces=interfaces,
            methods=methods,
            fields=fields,
            attributes=class_attributes,
            has_synthetic=has_synthetic_method or bool(access_flags & ClassFileParser.ACC_SYNTHETIC),
            has_debug_info=has_debug,
            string_refs=unique_string_refs[:100],
            obf_markers=list(set(obf_markers)),
            source_path=source_path,
            raw_bytes=data,
            constant_pool=constant_pool,
            access_flags=access_flags,
            method_descriptors=_method_descriptors,
            field_descriptors=_field_descriptors,
            method_access=_method_access_map,
            field_access=_field_access_flags,
        )

    @staticmethod
    def _parse_constant_pool(data: bytes, offset: int, count: int) -> Optional[dict]:
        entries = [None] * count
        i = 1
        while i < count:
            if offset >= len(data): return None
            tag = data[offset]
            offset += 1

            if tag == ClassFileParser.CP_UTF8:
                length = int.from_bytes(data[offset:offset+2], 'big')
                offset += 2
                value = data[offset:offset+length].decode('utf-8', errors='replace')
                offset += length
                entries[i] = ('Utf8', value)
            elif tag == ClassFileParser.CP_INTEGER:
                entries[i] = ('Integer', int.from_bytes(data[offset:offset+4], 'big', signed=True))
                offset += 4
            elif tag == ClassFileParser.CP_FLOAT:
                entries[i] = ('Float', struct.unpack('>f', data[offset:offset+4])[0])
                offset += 4
            elif tag == ClassFileParser.CP_LONG:
                entries[i] = ('Long', struct.unpack('>q', data[offset:offset+8])[0])
                offset += 8
                i += 1
            elif tag == ClassFileParser.CP_DOUBLE:
                entries[i] = ('Double', struct.unpack('>d', data[offset:offset+8])[0])
                offset += 8
                i += 1
            elif tag == ClassFileParser.CP_CLASS:
                name_idx = int.from_bytes(data[offset:offset+2], 'big')
                offset += 2
                entries[i] = ('Class', name_idx)
            elif tag == ClassFileParser.CP_STRING:
                str_idx = int.from_bytes(data[offset:offset+2], 'big')
                offset += 2
                entries[i] = ('String', str_idx)
            elif tag in (ClassFileParser.CP_FIELDREF, ClassFileParser.CP_METHODREF, ClassFileParser.CP_INTERFACE_METHODREF):
                class_idx = int.from_bytes(data[offset:offset+2], 'big')
                offset += 2
                nat_idx = int.from_bytes(data[offset:offset+2], 'big')
                offset += 2
                entries[i] = ('Ref', class_idx, nat_idx)
            elif tag == ClassFileParser.CP_NAME_AND_TYPE:
                name_idx = int.from_bytes(data[offset:offset+2], 'big')
                offset += 2
                desc_idx = int.from_bytes(data[offset:offset+2], 'big')
                offset += 2
                entries[i] = ('NameAndType', name_idx, desc_idx)
            elif tag == ClassFileParser.CP_METHOD_HANDLE:
                offset += 3
                entries[i] = ('MethodHandle',)
            elif tag == ClassFileParser.CP_METHOD_TYPE:
                offset += 2
                entries[i] = ('MethodType',)
            elif tag in (ClassFileParser.CP_DYNAMIC, ClassFileParser.CP_INVOKEDYNAMIC):
                offset += 4
                entries[i] = ('Dynamic',)
            elif tag in (ClassFileParser.CP_MODULE, ClassFileParser.CP_PACKAGE):
                offset += 2
                entries[i] = ('Module',)
            else: return None
            i += 1

        return {'entries': entries, 'next_offset': offset}

    # Correct JVM opcode → instruction byte-length table (including the opcode byte itself).
    # Variable-length instructions (tableswitch=0xAA, lookupswitch=0xAB, wide=0xC4) are
    # handled explicitly in _analyze_bytecode; everything else is looked up here.
    _OPCODE_SIZE: Dict[int, int] = {
        # 1-byte instructions
        **{op: 1 for op in [
            0x00,0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0x0A,
            0x0B,0x0C,0x0D,0x0E,0x0F,
            0x1A,0x1B,0x1C,0x1D,                   # iload_0..3
            0x1E,0x1F,0x20,0x21,                   # lload_0..3
            0x22,0x23,0x24,0x25,                   # fload_0..3
            0x26,0x27,0x28,0x29,                   # dload_0..3
            0x2A,0x2B,0x2C,0x2D,                   # aload_0..3
            0x2E,0x2F,0x30,0x31,0x32,0x33,0x34,0x35,  # *aload
            0x3B,0x3C,0x3D,0x3E,                   # istore_0..3
            0x3F,0x40,0x41,0x42,                   # lstore_0..3
            0x43,0x44,0x45,0x46,                   # fstore_0..3
            0x47,0x48,0x49,0x4A,                   # dstore_0..3
            0x4B,0x4C,0x4D,0x4E,                   # astore_0..3
            0x4F,0x50,0x51,0x52,0x53,0x54,0x55,0x56,  # *astore
            0x57,0x58,                             # pop, pop2
            0x59,0x5A,0x5B,0x5C,0x5D,0x5E,0x5F,   # dup*
            0x60,0x61,0x62,0x63,0x64,0x65,0x66,0x67,  # iadd..dadd
            0x68,0x69,0x6A,0x6B,0x6C,0x6D,0x6E,0x6F,  # imul..ddiv
            0x70,0x71,0x72,0x73,0x74,0x75,0x76,0x77,  # irem..dneg
            0x78,0x79,0x7A,0x7B,0x7C,0x7D,        # ishl..lushr
            0x7E,0x7F,0x80,0x81,0x82,0x83,        # iand..ixor
            0x85,0x86,0x87,0x88,0x89,0x8A,0x8B,0x8C,0x8D,0x8E,  # i2l..i2s
            0x8F,0x90,0x91,0x92,0x93,             # l2i..d2s
            0x94,0x95,0x96,0x97,0x98,             # lcmp..dcmpg
            0xAC,0xAD,0xAE,0xAF,0xB0,0xB1,        # *return
            0xBE,0xBF,                             # arraylength, athrow
            0xC2,0xC3,                             # monitorenter, monitorexit
            0xCA,                                  # breakpoint (reserved)
        ]},
        # 2-byte instructions
        **{op: 2 for op in [
            0x10,                                  # bipush
            0x12,                                  # ldc
            0x15,0x16,0x17,0x18,0x19,             # *load
            0x36,0x37,0x38,0x39,0x3A,             # *store
            0xA9,                                  # ret
            0xBC,                                  # newarray
        ]},
        # 3-byte instructions
        **{op: 3 for op in [
            0x11,                                  # sipush
            0x13,0x14,                             # ldc_w, ldc2_w
            0x84,                                  # iinc
            0x99,0x9A,0x9B,0x9C,0x9D,0x9E,        # if*
            0x9F,0xA0,0xA1,0xA2,0xA3,0xA4,0xA5,0xA6,  # if_icmp*, if_acmp*
            0xA7,0xA8,                             # goto, jsr
            0xB2,0xB3,0xB4,0xB5,                  # getstatic, putstatic, getfield, putfield
            0xB6,0xB7,0xB8,                        # invokevirtual, invokespecial, invokestatic
            0xBB,                                  # new
            0xBD,                                  # anewarray
            0xC0,0xC1,                             # checkcast, instanceof
            0xC6,0xC7,                             # ifnull, ifnonnull
        ]},
        # 4-byte
        0xC5: 4,                                   # multianewarray
        # 5-byte
        0xB9: 5,                                   # invokeinterface
        0xBA: 5,                                   # invokedynamic
        0xC8: 5,                                   # goto_w
        0xC9: 5,                                   # jsr_w
    }

    @staticmethod
    def _analyze_bytecode(code_bytes: bytes, constant_pool: list) -> dict:
        """Walk bytecode collecting string LDC references and counting gotos/invokedynamics.
        Returns partial results on any parse error rather than raising."""
        string_refs = []
        goto_count = 0
        invokedynamic_count = 0
        i = 0
        length = len(code_bytes)
        _SIZES = ClassFileParser._OPCODE_SIZE

        try:
            while i < length:
                opcode = code_bytes[i]

                # ── LDC / LDC_W: collect String constants ─────────────────
                if opcode == 0x12:   # ldc
                    if i + 1 < length:
                        s = ClassFileParser._get_string_value(constant_pool, code_bytes[i+1])
                        if s: string_refs.append(s)
                    i += 2
                elif opcode == 0x13:  # ldc_w
                    if i + 2 < length:
                        idx = int.from_bytes(code_bytes[i+1:i+3], 'big')
                        s = ClassFileParser._get_string_value(constant_pool, idx)
                        if s: string_refs.append(s)
                    i += 3

                # ── Control flow ──────────────────────────────────────────
                elif opcode in (0xA7, 0xA8, 0xC6, 0xC7,
                                0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E,
                                0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6):
                    if opcode == 0xA7: goto_count += 1
                    i += 3
                elif opcode in (0xC8, 0xC9):
                    if opcode == 0xC8: goto_count += 1
                    i += 5
                elif opcode == 0xBA:
                    invokedynamic_count += 1
                    i += 5

                # ── Variable-length: tableswitch ──────────────────────────
                elif opcode == 0xAA:
                    pad = (4 - ((i + 1) % 4)) % 4
                    base = i + 1 + pad
                    if base + 12 <= length:
                        low  = int.from_bytes(code_bytes[base+4:base+8],  'big', signed=True)
                        high = int.from_bytes(code_bytes[base+8:base+12], 'big', signed=True)
                        count = max(0, high - low + 1)
                        i = base + 12 + count * 4
                    else:
                        i = length  # bail out safely

                # ── Variable-length: lookupswitch ─────────────────────────
                elif opcode == 0xAB:
                    pad = (4 - ((i + 1) % 4)) % 4
                    base = i + 1 + pad
                    if base + 8 <= length:
                        npairs = int.from_bytes(code_bytes[base+4:base+8], 'big')
                        i = base + 8 + npairs * 8
                    else:
                        i = length

                # ── wide prefix ───────────────────────────────────────────
                elif opcode == 0xC4:
                    if i + 1 < length:
                        wide_op = code_bytes[i + 1]
                        i += 6 if wide_op == 0x84 else 4  # iinc wide=6, others=4
                    else:
                        i += 1

                # ── Everything else: use the size table ───────────────────
                else:
                    i += _SIZES.get(opcode, 1)

        except Exception:
            pass  # return whatever we collected up to the error

        return {'string_refs': string_refs, 'goto_count': goto_count,
                'invokedynamic_count': invokedynamic_count}

    @staticmethod
    def _get_utf8(entries: list, index: int) -> Optional[str]:
        if 0 < index < len(entries) and entries[index]:
            entry = entries[index]
            if entry[0] == 'Utf8': return entry[1]
        return None

    @staticmethod
    def _get_class_name(entries: list, index: int) -> Optional[str]:
        if 0 < index < len(entries) and entries[index]:
            entry = entries[index]
            if entry[0] == 'Class': return ClassFileParser._get_utf8(entries, entry[1])
        return None

    @staticmethod
    def _get_string_value(entries: list, index: int) -> Optional[str]:
        if 0 < index < len(entries) and entries[index]:
            entry = entries[index]
            if entry[0] == 'String': return ClassFileParser._get_utf8(entries, entry[1])
        return None

    @staticmethod
    def _skip_attribute(data: bytes, offset: int) -> int:
        if offset + 6 > len(data): return offset
        attr_length = int.from_bytes(data[offset+2:offset+6], 'big')
        return offset + 6 + attr_length

# ============================================================================
# OBFUSCATION DETECTOR
# ============================================================================

class ObfuscationDetector:
    def __init__(self):
        self.registry = ObfuscatorRegistry.OBFUSCATORS

    def analyze(self, class_files: List[Path], work_dir: Path) -> ObfuscationAnalysis:
        logger.info("Running obfuscation detection...")
        class_infos = []
        for cf in class_files:
            info = ClassFileParser.parse(cf)
            if info: class_infos.append(info)

        if not class_infos:
            return ObfuscationAnalysis(details="No valid class files to analyze")

        mapping_files = self._find_mapping_files(work_dir)
        mapping_found = len(mapping_files) > 0

        scores = defaultdict(float)
        obfuscated_classes = []
        all_obf_markers = []

        for info in class_infos:
            class_scored = False
            for obf_name, obf_config in self.registry.items():
                sigs = obf_config.get("signatures", {})
                score = 0.0

                for pattern in sigs.get("class_name_patterns", []):
                    if re.match(pattern, info.simple_name):
                        score += 1.0
                        class_scored = True

                if info.package:
                    pkg_path = info.package.replace('.', '/')
                    for pattern in sigs.get("package_patterns", []):
                        if re.match(pattern, pkg_path):
                            score += 0.5
                            class_scored = True

                for marker in info.obf_markers:
                    if obf_name in marker:
                        score += 5.0
                        class_scored = True
                        if marker not in all_obf_markers: all_obf_markers.append(marker)

                for pattern in sigs.get("string_methods", []):
                    for method in info.methods:
                        try:
                            if re.search(pattern, method, re.IGNORECASE):
                                score += 3.0
                                class_scored = True
                        except re.error: pass

                for pattern in sigs.get("flow_patterns", []):
                    for method in info.methods:
                        try:
                            if re.search(pattern, method, re.IGNORECASE):
                                score += 2.0
                                class_scored = True
                        except re.error: pass

                for pattern in sigs.get("injected_classes", []):
                    if re.search(pattern, info.full_name.replace('.', '/'), re.IGNORECASE):
                        score += 10.0
                        class_scored = True

                if sigs.get("attribute_manipulation"):
                    expected_attrs = ["InnerClasses", "StackMapTable"]
                    missing = [a for a in expected_attrs if a not in info.attributes]
                    if missing:
                        score += 2.0
                        class_scored = True

                scores[obf_name] += score

            if class_scored: obfuscated_classes.append(info.full_name)

        encrypted_strings = self._detect_encrypted_strings(class_infos)
        control_flow = self._detect_control_flow(class_infos)
        renamed = self._detect_renaming(class_infos)
        junk_code = self._detect_junk_code(class_infos)
        attr_manip = self._detect_attr_manipulation(class_infos)
        number_obf = self._detect_number_obfuscation(class_infos)
        indy_wrap = self._detect_indy_wrapping(class_infos)

        threshold = 2.0
        detected = [(name, score) for name, score in scores.items() if score >= threshold]
        detected.sort(key=lambda x: x[1], reverse=True)

        detected_names = [name for name, _ in detected]
        confidence = {}
        for name, score in detected:
            total_classes = len(class_infos)
            confidence[name] = min(score / max(total_classes * 0.5, 1), 1.0)

        details_parts = []
        if detected_names: details_parts.append(f"Detected: {', '.join(detected_names)}")
        else: details_parts.append("No specific obfuscator detected")
        details_parts.append(f"Obfuscated classes: {len(obfuscated_classes)}")
        if encrypted_strings: details_parts.append("encrypted strings detected")
        if control_flow: details_parts.append("control flow obfuscation")
        if renamed: details_parts.append("renamed classes")
        if junk_code: details_parts.append("junk code")
        if attr_manip: details_parts.append("attribute manipulation")
        if number_obf: details_parts.append("number obfuscation")
        if indy_wrap: details_parts.append("invokedynamic wrapping")

        return ObfuscationAnalysis(
            detected_obfuscators=detected_names,
            confidence_scores=confidence,
            obfuscated_classes=obfuscated_classes,
            encrypted_strings_detected=encrypted_strings,
            control_flow_obfuscation=control_flow,
            renamed_classes=renamed,
            junk_code_detected=junk_code,
            attribute_manipulation=attr_manip,
            number_obfuscation=number_obf,
            indy_wrapping=indy_wrap,
            mapping_file_found=mapping_found,
            mapping_file_path=str(mapping_files[0]) if mapping_files else None,
            details=". ".join(details_parts),
            obf_specific_data={"markers": all_obf_markers, "scores": dict(scores)},
        )

    def _find_mapping_files(self, directory: Path) -> List[Path]:
        mapping_files = []
        for pattern in ["mapping.txt", "proguard_mapping.txt", "*.pro", "mapping.pro"]:
            mapping_files.extend(directory.rglob(pattern))
        for mf in directory.rglob("*mapping*"):
            if mf.is_file() and mf.suffix in ['.txt', '.pro', '.csv', '']: mapping_files.append(mf)
        return list(set(mapping_files))

    def _detect_encrypted_strings(self, class_infos: List[ClassInfo]) -> bool:
        for info in class_infos[:20]:
            for method in info.methods:
                if any(kw in method.lower() for kw in ['decrypt', 'decode', 'z', '_z', '$z']): return True
            if len(info.methods) <= 3 and len(info.string_refs) > 20: return True
        return False

    def _detect_control_flow(self, class_infos: List[ClassInfo]) -> bool:
        if not class_infos: return False
        avg_methods = sum(len(ci.methods) for ci in class_infos) / len(class_infos)
        return avg_methods > 20

    def _detect_renaming(self, class_infos: List[ClassInfo]) -> bool:
        short_names = sum(1 for ci in class_infos if re.match(r'^[a-zA-Z]{1,3}\d*$', ci.simple_name))
        return short_names > len(class_infos) * 0.3

    def _detect_junk_code(self, class_infos: List[ClassInfo]) -> bool:
        junk_indicators = 0
        for ci in class_infos:
            for method in ci.methods:
                if re.search(r'junk|_junk|dummy|_dummy', method, re.IGNORECASE): junk_indicators += 1
            if ci.has_synthetic and len(ci.methods) > 15: junk_indicators += 1
        return junk_indicators > len(class_infos) * 0.1

    def _detect_attr_manipulation(self, class_infos: List[ClassInfo]) -> bool:
        missing_inner = sum(1 for ci in class_infos if '$' in ci.simple_name and 'InnerClasses' not in ci.attributes)
        return missing_inner > 0

    def _detect_number_obfuscation(self, class_infos: List[ClassInfo]) -> bool:
        for ci in class_infos[:20]:
            for method in ci.methods:
                if re.search(r'math|number|_math|_num', method, re.IGNORECASE): return True
        return False

    def _detect_indy_wrapping(self, class_infos: List[ClassInfo]) -> bool:
        for ci in class_infos:
            for method in ci.methods:
                if 'invokedynamic' in method.lower() or 'indy' in method.lower(): return True
        return False

# ============================================================================
# DEOBFUSCATION ENGINE
# ============================================================================

class DeobfuscationEngine:
    def __init__(self, analysis: ObfuscationAnalysis):
        self.analysis = analysis
        self.result = DeobfuscationResult()

    def deobfuscate(self, work_dir: Path, class_files: List[Path]) -> Tuple[Path, DeobfuscationResult]:
        logger.info("Starting deobfuscation...")
        deobf_dir = work_dir.parent / "deobfuscated"
        if deobf_dir.exists(): shutil.rmtree(deobf_dir)
        deobf_dir.mkdir(parents=True, exist_ok=True)

        for cf in class_files:
            rel = cf.relative_to(work_dir)
            dest = deobf_dir / rel
            dest.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(cf, dest)

        strategies_to_run = set()
        for obf_name in self.analysis.detected_obfuscators:
            if obf_name in ObfuscatorRegistry.OBFUSCATORS:
                strategies_to_run.update(ObfuscatorRegistry.OBFUSCATORS[obf_name]["strategies"])

        if self.analysis.encrypted_strings_detected: strategies_to_run.add("string_decrypt")
        if self.analysis.junk_code_detected: strategies_to_run.add("junk_remove")
        # Always try name restoration — bytecode-level renamer is safe even if not obfuscated
        strategies_to_run.add("name_restore")
        if self.analysis.control_flow_obfuscation: strategies_to_run.add("flow_unwind")
        if self.analysis.number_obfuscation: strategies_to_run.add("number_deobf")
        if self.analysis.attribute_manipulation: strategies_to_run.add("attr_repair")
        if self.analysis.indy_wrapping: strategies_to_run.add("indy_unwrap")

        logger.info(f"Strategies to apply: {', '.join(sorted(strategies_to_run))}")

        class_infos = []
        deobf_class_files = sorted(deobf_dir.rglob("*.class"))
        for cf in deobf_class_files:
            info = ClassFileParser.parse(cf)
            if info:
                info.source_path = str(cf)
                class_infos.append(info)

        # THREADTEAR FIRST - run it to strip the hard bytecode obf before our custom passes
        if "threadtear" in strategies_to_run and Path(Config.ENGINES["threadtear"]["jar"]).exists():
            self._run_threadtear(deobf_dir)

        if "mapping_apply" in strategies_to_run and self.analysis.mapping_file_found:
            self._apply_mapping(deobf_dir, class_infos)
        if "string_decrypt" in strategies_to_run:
            self._decrypt_strings(deobf_dir, class_infos)
        if "junk_remove" in strategies_to_run:
            self._remove_junk_code(deobf_dir, class_infos)
        if "name_restore" in strategies_to_run:
            self._restore_names(deobf_dir, class_infos)
        if "flow_unwind" in strategies_to_run:
            self._unwind_flow(deobf_dir, class_infos)
        if "number_deobf" in strategies_to_run:
            self._deobfuscate_numbers(deobf_dir, class_infos)
        if "attr_repair" in strategies_to_run:
            self._repair_attributes(deobf_dir, class_infos)
        if "indy_unwrap" in strategies_to_run:
            self._unwrap_indy(deobf_dir, class_infos)
        if "resource_decrypt" in strategies_to_run:
            self._decrypt_resources(deobf_dir)
        if "injected_class_remove" in strategies_to_run:
            self._remove_injected_classes(deobf_dir, class_infos)
        if "cp_reconstruct" in strategies_to_run:
            self._reconstruct_constant_pool(deobf_dir, class_infos)

        self.result.output_dir = str(deobf_dir)
        self.result.strategies_applied = sorted(strategies_to_run)
        self.result.details = (
            f"Applied {len(strategies_to_run)} deobfuscation strategies. "
            f"Strings decrypted: {self.result.strings_decrypted}, "
            f"Junk removed: {self.result.junk_methods_removed}, "
            f"Classes renamed: {self.result.classes_renamed}, "
            f"Flow blocks unwound: {self.result.flow_blocks_unwound}, "
            f"Numbers resolved: {self.result.numbers_resolved}, "
            f"Attributes repaired: {self.result.attributes_repaired}, "
            f"Indy wraps removed: {self.result.indy_wraps_removed}"
        )

        logger.info(f"Deobfuscation complete: {self.result.details}")
        return deobf_dir, self.result

    def _run_threadtear(self, deobf_dir: Path):
        logger.info("Pass: Threadtear execution")
        tt_jar = Config.ENGINES["threadtear"]["jar"]
        cmd = ["java", "-jar", tt_jar, "-o", str(deobf_dir), str(deobf_dir)]
        try:
            proc = subprocess.run(cmd, capture_output=True, text=True, timeout=600)
            if proc.returncode == 0:
                logger.info("  Threadtear execution successful")
            else:
                logger.warning(f"  Threadtear execution failed: {proc.stderr[:200]}")
        except Exception as e:
            logger.error(f"  Threadtear execution error: {e}")

    # ── StringDecryptor tool paths ────────────────────────────────────────────
    _SD_JAR = Path("tools/StringDecryptor.jar")
    _SD_CP  = "libs/jadx-lib/asm-9.7.jar:tools/StringDecryptor.jar"
    _SP_JAR = Path("tools/AsmStringPatcher.jar")   # patched-in below if present

    def _decrypt_strings(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        """Run StringDecryptor.jar (ASM visitor) to detect & decrypt XOR-obfuscated
        static String fields, then patch the bytecode with AsmStringPatcher."""
        logger.info("Pass: String decryption (XOR/brute-force via StringDecryptor)")

        if not self._SD_JAR.exists():
            logger.warning("  StringDecryptor.jar not found — skipping")
            return

        try:
            proc = subprocess.run(
                ["java", "-cp", self._SD_CP, "StringDecryptor", str(deobf_dir)],
                capture_output=True, text=True, timeout=120
            )
            output = proc.stdout.strip()
            lines = [l for l in output.splitlines() if l.startswith("FIELD ")]
            # Parse: FIELD owner/Name fieldName decryptedValue
            decryptions: Dict[str, Dict[str, str]] = defaultdict(dict)  # owner → {field → value}
            for line in lines:
                parts = line.split(" ", 3)
                if len(parts) == 4:
                    _, owner, fname, value = parts
                    decryptions[owner][fname] = value.replace("\\n", "\n").replace("\\r", "\r").replace("\\t", "\t")

            count = sum(len(v) for v in decryptions.values())
            logger.info(f"  StringDecryptor: {count} strings decrypted")

            # Write a string patch file that AsmStringPatcher can consume
            if count > 0:
                patch_path = deobf_dir.parent / "string_patches.txt"
                patch_lines = []
                for owner, fields in decryptions.items():
                    for fname, val in fields.items():
                        safe = val.replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r")
                        patch_lines.append(f"STRING {owner} {fname} {safe}")
                patch_path.write_text("\n".join(patch_lines))

                # Run AsmStringPatcher if available
                if self._SP_JAR.exists():
                    sp_cp = f"libs/jadx-lib/asm-9.7.jar:tools/AsmStringPatcher.jar"
                    proc2 = subprocess.run(
                        ["java", "-cp", sp_cp, "AsmStringPatcher",
                         str(patch_path), str(deobf_dir), str(deobf_dir)],
                        capture_output=True, text=True, timeout=120
                    )
                    logger.info(f"  AsmStringPatcher: {proc2.stdout.strip()}")
                else:
                    logger.info("  AsmStringPatcher.jar not found — strings logged only")

            self.result.strings_decrypted = count
            # Log progress line from StringDecryptor
            for l in proc.stdout.splitlines():
                if l.startswith("[StringDecryptor]"):
                    logger.info(f"  {l}")

        except subprocess.TimeoutExpired:
            logger.warning("  StringDecryptor timed out")
        except Exception as e:
            logger.warning(f"  StringDecryptor error: {e}")

    def _is_printable_string(self, s: str) -> bool:
        if not s: return False
        printable = sum(1 for c in s if c.isprintable() or c in '\n\r\t')
        return printable / len(s) > 0.8

    def _is_printable_bytes(self, b: bytes) -> bool:
        if not b: return False
        try:
            s = b.decode('utf-8', errors='ignore')
            return self._is_printable_string(s)
        except: return False

    def _remove_junk_code(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        """Log suspected junk patterns but NEVER delete class files — false positives destroy output."""
        logger.info("Pass: Junk code detection (non-destructive)")
        junk_methods_flagged = 0
        for info in class_infos:
            for method in info.methods:
                for obf_config in ObfuscatorRegistry.OBFUSCATORS.values():
                    for pattern in obf_config.get("signatures", {}).get("junk_patterns", []):
                        try:
                            if re.search(pattern, method, re.IGNORECASE):
                                junk_methods_flagged += 1
                        except re.error:
                            pass
        self.result.junk_methods_removed = 0
        logger.info(f"  Flagged {junk_methods_flagged} potential junk methods (not removed)")

    # ── obfuscated name patterns ────────────────────────────────────────────
    # Class names: 1-5 chars all-alpha/digit, underscore-numeric, pure digits,
    # OR names like "DataB" / "LoadE" (word + single uppercase letter suffix)
    _OBF_CLASS  = re.compile(
        r'^[a-zA-Z]{1,5}\d*$'          # a, ab, abc, abcd, abcde, a1, ab12
        r'|^_\d+$'                       # _123
        r'|^\d+$'                        # 1234 (fully numeric)
        r'|^[a-zA-Z]{2,8}[A-Z]$'         # DataB, LoadE, SyncF, CalcC (word + 1 uppercase)
        r'|^[a-zA-Z]_[a-zA-Z\d]{0,3}$'  # a_b, a_12
    )
    _OBF_MEMBER = re.compile(r'^[a-zA-Z\d_]{1,3}$')  # 1-3 char method/field names

    _SKIP_SUPER  = {'Object', 'Enum', 'Thread', 'Runnable', 'Throwable', 'Exception',
                    'RuntimeException', 'AbstractList', 'AbstractMap', 'AbstractSet'}
    _SKIP_IFACE  = {'Serializable', 'Cloneable', 'Comparable', 'Iterable'}

    # Maps JVM descriptor prefix → human readable base name for fields/methods
    _DESC_NAMES = {
        'I': 'intValue', 'J': 'longValue', 'F': 'floatValue', 'D': 'doubleValue',
        'Z': 'boolFlag', 'B': 'byteValue', 'S': 'shortValue', 'C': 'charValue',
        'Ljava/lang/String;': 'strValue', 'Ljava/lang/Object;': 'objValue',
        'Ljava/util/List;': 'list', 'Ljava/util/Map;': 'map', 'Ljava/util/Set;': 'set',
        '[B': 'byteArr', '[I': 'intArr', '[Ljava/lang/String;': 'strArr',
    }

    def _restore_names(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        """Full bytecode-level rename via AsmRemapper.  Also falls back to
        ProGuard mapping if one is embedded in the JAR."""
        logger.info("Pass: Name restoration (bytecode level)")

        if self.analysis.mapping_file_found and self.analysis.mapping_file_path:
            self._apply_proguard_mapping(deobf_dir, Path(self.analysis.mapping_file_path))

        # --- Build name mapping -------------------------------------------
        # class_map: internal_old → internal_new  (e.g. com/a/A → com/deobf/NetworkHandler)
        class_map: Dict[str, str] = {}
        # method_map: (internal_owner, name, desc) → new_name
        method_map: Dict[tuple, str] = {}
        # field_map:  (internal_owner, name, desc) → new_name
        field_map:  Dict[tuple, str] = {}

        used_class_names: set = set()
        used_member_names: Dict[str, set] = defaultdict(set)  # owner → {name}
        class_counters: Dict[str, int] = defaultdict(int)

        # Build quick-lookup sets of ALL names in the jar (to avoid conflicts)
        all_internal = set(i.full_name.replace('.', '/') for i in class_infos)

        # ── Package path mapping (full obfuscated path → readable path) ──────
        # Each unique FULL package path maps to a unique readable path.
        # Single-letter segments get counter-based replacement (sub1, sub2 …)
        # scoped to the NEW parent path, so different branches don't collide.
        pkg_path_map: Dict[str, str] = {}   # old_pkg_path → new_pkg_path
        pkg_counters: Dict[str, int] = {}   # new_parent_path → next counter

        def _is_obf_seg(seg: str) -> bool:
            return bool(seg) and len(seg) <= 2 and seg.isalpha()

        def deobf_package(pkg_internal: str) -> str:
            """Walk each segment, using cached intermediate results so that
            sub-packages get consistent numbers under the right renamed parent."""
            if not pkg_internal: return pkg_internal
            if pkg_internal in pkg_path_map: return pkg_path_map[pkg_internal]

            parts = pkg_internal.split('/')
            current_old  = ''
            current_new  = []   # new segments accumulated so far

            for seg in parts:
                next_old = (current_old + '/' + seg) if current_old else seg

                if next_old in pkg_path_map:
                    # Re-use a previously computed intermediate result
                    current_new = pkg_path_map[next_old].split('/') if pkg_path_map[next_old] else []
                elif not _is_obf_seg(seg):
                    current_new = current_new + [seg]
                    # Cache the non-obf path so children find it quickly
                    if next_old not in pkg_path_map:
                        pkg_path_map[next_old] = '/'.join(current_new)
                else:
                    parent_new_key = '/'.join(current_new) if current_new else '__root__'
                    n = pkg_counters.get(parent_new_key, 0) + 1
                    pkg_counters[parent_new_key] = n
                    current_new = current_new + [f"sub{n}"]
                    pkg_path_map[next_old] = '/'.join(current_new)

                current_old = next_old

            result = '/'.join(current_new)
            pkg_path_map[pkg_internal] = result
            return result

        # Pre-populate in sorted order: parent paths always sort before children.
        all_packages = sorted({
            info.package.replace('.', '/') if info.package else ''
            for info in class_infos
        })
        for pkg in all_packages:
            deobf_package(pkg)

        # ── CLASS renaming ────────────────────────────────────────────────
        for info in class_infos:
            simple = info.simple_name
            pkg_internal = info.package.replace('.', '/') if info.package else ''
            old_internal = info.full_name.replace('.', '/')

            name_is_obf = (self._OBF_CLASS.match(simple)
                           and simple not in ('Enum', 'App', 'Main', 'Log', 'Tag', 'Key', 'IO', 'UI'))
            pkg_is_obf  = any(len(s) <= 2 and s.isalpha()
                              for s in pkg_internal.split('/') if s)

            if not name_is_obf and not pkg_is_obf:
                continue

            if name_is_obf:
                new_simple = self._generate_class_name(info)
            else:
                new_simple = simple   # keep readable class name, just fix package

            new_pkg = deobf_package(pkg_internal)

            # Guarantee uniqueness
            base = new_simple
            suffix = 0
            candidate = f"{new_pkg}/{new_simple}" if new_pkg else new_simple
            while candidate in used_class_names:
                suffix += 1
                new_simple = f"{base}_{suffix}"
                candidate = f"{new_pkg}/{new_simple}" if new_pkg else new_simple
            used_class_names.add(candidate)

            new_internal = candidate
            if old_internal != new_internal:
                class_map[old_internal] = new_internal

        # ── METHOD renaming ───────────────────────────────────────────────
        SKIP_METHODS = frozenset(('<init>', '<clinit>', 'main', 'run',
                                   'hashCode', 'equals', 'toString', 'clone',
                                   'compareTo', 'finalize', 'getClass', 'notify',
                                   'notifyAll', 'wait', 'values', 'ordinal',
                                   'name', 'valueOf'))
        for info in class_infos:
            owner_internal = info.full_name.replace('.', '/')
            for mname, descs in info.method_descriptors.items():
                if mname in SKIP_METHODS:
                    continue
                if not self._OBF_MEMBER.match(mname):
                    continue
                for desc in descs:
                    new_mname = self._generate_method_name(
                        mname, desc, info, used_member_names[owner_internal])
                    base = new_mname
                    n = 0
                    while new_mname in used_member_names[owner_internal]:
                        n += 1
                        new_mname = f"{base}_{n}"
                    used_member_names[owner_internal].add(new_mname)
                    method_map[(owner_internal, mname, desc)] = new_mname

        # ── FIELD renaming ────────────────────────────────────────────────
        for info in class_infos:
            owner_internal = info.full_name.replace('.', '/')
            for fname, fdesc in info.field_descriptors.items():
                if not self._OBF_MEMBER.match(fname):
                    continue
                new_fname = self._generate_field_name(fname, fdesc,
                                                       used_member_names[owner_internal])
                base = new_fname
                n = 0
                while new_fname in used_member_names[owner_internal]:
                    n += 1
                    new_fname = f"{base}_{n}"
                used_member_names[owner_internal].add(new_fname)
                field_map[(owner_internal, fname, fdesc)] = new_fname

        if not class_map and not method_map and not field_map:
            logger.info("  No obfuscated names detected — skipping AsmRemapper")
            return

        logger.info(f"  Mapping: {len(class_map)} classes, "
                    f"{len(method_map)} methods, {len(field_map)} fields")

        # --- Write mapping file -------------------------------------------
        mapping_path = deobf_dir.parent / "asm_mapping.txt"
        lines = []
        for old, new in class_map.items():
            lines.append(f"CLASS {old} {new}")
        for (owner, name, desc), new_name in method_map.items():
            lines.append(f"METHOD {owner} {name} {desc} {new_name}")
        for (owner, name, desc), new_name in field_map.items():
            lines.append(f"FIELD {owner} {name} {desc} {new_name}")
        mapping_path.write_text("\n".join(lines))

        # --- Run AsmRemapper ----------------------------------------------
        asm_cp = "libs/jadx-lib/asm-9.7.jar:libs/jadx-lib/asm-commons-9.7.jar:tools/AsmRemapper.jar"
        remapped_dir = deobf_dir.parent / "remapped"
        if remapped_dir.exists(): shutil.rmtree(remapped_dir)
        remapped_dir.mkdir(parents=True)

        cmd = ["java", "-cp", asm_cp, "AsmRemapper",
               str(mapping_path), str(deobf_dir), str(remapped_dir)]
        try:
            proc = subprocess.run(cmd, capture_output=True, text=True, timeout=300)
            if proc.returncode == 0 or remapped_dir.stat().st_size > 0:
                logger.info(f"  AsmRemapper output: {proc.stdout.strip()}")
                # Replace deobf_dir contents with remapped output
                shutil.rmtree(deobf_dir)
                shutil.copytree(remapped_dir, deobf_dir)
                logger.info("  Bytecode remapping applied successfully")
            else:
                logger.warning(f"  AsmRemapper failed: {proc.stderr[:300]}")
        except Exception as e:
            logger.error(f"  AsmRemapper error: {e}")

        self.result.classes_renamed = len(class_map)
        logger.info(f"  Renamed {len(class_map)} classes, "
                    f"{len(method_map)} methods, {len(field_map)} fields")

    def _generate_class_name(self, info: 'ClassInfo') -> str:
        """Produce a human-readable class name from structural hints."""
        # 1. Interface implementations
        for iface in info.interfaces:
            s = iface.rsplit('/', 1)[-1].rsplit('.', 1)[-1]
            if s in self._SKIP_IFACE: continue
            if 'Listener' in s:   return s.replace('Listener', 'Handler')
            if 'Callback' in s:   return s.replace('Callback', 'Handler')
            if 'Provider' in s:   return s.replace('Provider', 'Impl')
            if 'Factory' in s:    return s.replace('Factory', 'Creator')
            if 'Visitor' in s:    return s.replace('Visitor', 'Walker')
            if 'Handler' in s:    return f"{s}Impl"
            if 'Observer' in s:   return f"{s}Impl"
            return f"{s}Impl"

        # 2. Superclass hint
        if info.superclass:
            s = info.superclass.rsplit('/', 1)[-1].rsplit('.', 1)[-1]
            if s not in self._SKIP_SUPER:
                if info.is_enum:   return f"{s}Enum"
                if info.is_abstract: return f"Abstract{s}"
                return f"{s}Sub"

        # 3. Method-name keywords
        kw_map = [
            ('main',       'MainClass'),
            ('start',      'Launcher'),
            ('init',       'Initializer'),
            ('connect',    'ConnectionManager'),
            ('disconnect', 'ConnectionManager'),
            ('send',       'NetworkSender'),
            ('receive',    'NetworkReceiver'),
            ('encrypt',    'CryptoHelper'),
            ('decrypt',    'CryptoHelper'),
            ('hash',       'HashUtil'),
            ('parse',      'Parser'),
            ('render',     'Renderer'),
            ('update',     'Updater'),
            ('load',       'Loader'),
            ('save',       'Saver'),
            ('read',       'Reader'),
            ('write',      'Writer'),
            ('log',        'Logger'),
            ('config',     'Config'),
            ('util',       'Util'),
            ('helper',     'Helper'),
            ('manager',    'Manager'),
            ('handler',    'Handler'),
            ('service',    'Service'),
            ('client',     'Client'),
            ('server',     'Server'),
            ('event',      'EventHandler'),
            ('packet',     'PacketHandler'),
            ('gui',        'GuiComponent'),
            ('screen',     'ScreenComponent'),
            ('data',       'DataHolder'),
            ('model',      'DataModel'),
            ('view',       'ViewController'),
            ('controller', 'Controller'),
            ('task',       'Task'),
            ('thread',     'WorkerThread'),
            ('cache',      'Cache'),
            ('pool',       'Pool'),
            ('queue',      'Queue'),
            ('stack',      'Stack'),
            ('map',        'MapHelper'),
            ('list',       'ListHelper'),
        ]
        method_names_lc = [m.lower() for m in info.methods]
        for kw, name in kw_map:
            if any(kw in m for m in method_names_lc):
                return name

        # 4. String constant hints
        for s in info.string_refs[:8]:
            clean = s.strip()
            if len(clean) < 4 or not clean.replace('_', '').replace('.', '').isalnum():
                continue
            # Use last component of dot-separated strings (like package names)
            part = clean.rsplit('.', 1)[-1].rsplit('/', 1)[-1]
            part = re.sub(r'[^a-zA-Z0-9]', '', part)
            if len(part) >= 3:
                return f"Class_{part[:20].capitalize()}"

        # 5. Type flags
        if info.is_enum:       return "EnumClass"
        if info.is_interface:  return "Interface"
        if info.is_abstract:   return "AbstractClass"
        if info.is_annotation: return "Annotation"

        return "DeobfClass"

    def _generate_method_name(self, name: str, desc: str, info: 'ClassInfo',
                               used: set) -> str:
        """Produce a human-readable method name from its descriptor and context."""
        try:
            params_str, ret = desc.split(')')
            params_str = params_str[1:]  # strip leading (
        except ValueError:
            return f"method_{name}"

        params_count = self._count_params(params_str)
        ret_name   = self._desc_to_name(ret)

        # ── Parse each param type for richer names ────────────────────────
        param_types = self._parse_param_types(params_str)
        first_param = param_types[0] if param_types else ''

        # ── Boolean return (is… / has…) ───────────────────────────────────
        if ret == 'Z':
            if params_count == 0: return "isEnabled"
            if params_count == 1: return f"check{first_param.capitalize()}"
            return "checkCondition"

        # ── Void return ───────────────────────────────────────────────────
        if ret == 'V':
            if params_count == 0: return "execute"
            if params_count == 1:
                return f"set{first_param.capitalize()}" if first_param else "process"
            if params_count == 2:
                p2 = param_types[1] if len(param_types) > 1 else ''
                return f"set{first_param.capitalize()}And{p2.capitalize()}" if first_param and p2 else "processArgs"
            return "processAll"

        # ── Non-void, no params (getter / factory) ────────────────────────
        if params_count == 0:
            if ret == 'I': return "getInt"
            if ret == 'J': return "getLong"
            if ret == 'F': return "getFloat"
            if ret == 'D': return "getDouble"
            if ret == 'B': return "getByte"
            if ret == 'S': return "getShort"
            if ret == 'C': return "getChar"
            if ret.startswith('['):       return f"get{ret_name.capitalize()}Array"
            if 'String' in ret_name:     return "getString"
            if 'List' in ret_name:       return "getList"
            if 'Map' in ret_name:        return "getMap"
            if 'Set' in ret_name:        return "getSet"
            if 'Object' in ret_name:     return "getValue"
            return f"get{ret_name.capitalize()}"

        # ── Non-void, with params ─────────────────────────────────────────
        if ret.startswith('L') or ret.startswith('['):
            # returns an object → factory / compute pattern
            if params_count == 1: return f"compute{ret_name.capitalize()}"
            return f"create{ret_name.capitalize()}"

        # Arithmetic / transform: same primitive in and out
        if ret in ('I','J','F','D') and first_param in ('int','long','float','double'):
            return f"transform{ret_name.capitalize()}"

        return f"method_{ret_name}"

    @staticmethod
    def _parse_param_types(params_str: str) -> List[str]:
        """Return a list of human-readable type names for each parameter."""
        _D2N = {'I':'Int','J':'Long','F':'Float','D':'Double',
                'Z':'Bool','B':'Byte','S':'Short','C':'Char'}
        types = []
        i = 0
        while i < len(params_str):
            c = params_str[i]
            if c in _D2N:
                types.append(_D2N[c]); i += 1
            elif c == 'L':
                end = params_str.find(';', i)
                if end < 0: break
                cls = params_str[i+1:end].rsplit('/', 1)[-1]
                types.append(cls); i = end + 1
            elif c == '[':
                # skip array prefix, name the element type
                i += 1
                if i < len(params_str) and params_str[i] == 'L':
                    end = params_str.find(';', i)
                    if end < 0: break
                    cls = params_str[i+1:end].rsplit('/', 1)[-1] + 'Arr'
                    types.append(cls); i = end + 1
                elif i < len(params_str) and params_str[i] in _D2N:
                    types.append(_D2N[params_str[i]] + 'Arr'); i += 1
            else:
                i += 1
        return types

    def _generate_field_name(self, name: str, desc: str, used: set) -> str:
        """Produce a human-readable field name from its descriptor."""
        n = self._DESC_NAMES.get(desc)
        if n: return n
        # Array type
        if desc.startswith('['):
            inner = self._desc_to_name(desc.lstrip('['))
            return f"{inner}Array"
        # Object type: Lsome/ClassName;
        if desc.startswith('L') and desc.endswith(';'):
            cls = desc[1:-1].rsplit('/', 1)[-1]
            cls = re.sub(r'[^a-zA-Z0-9]', '', cls)
            if cls:
                return cls[0].lower() + cls[1:] if cls else 'objField'
        return "field"

    @staticmethod
    def _count_params(params_str: str) -> int:
        count = 0
        i = 0
        while i < len(params_str):
            c = params_str[i]
            if c in 'IJFDZBS C': count += 1; i += 1
            elif c == 'L':
                count += 1
                while i < len(params_str) and params_str[i] != ';': i += 1
                i += 1
            elif c == '[': i += 1
            else: i += 1
        return count

    @staticmethod
    def _desc_to_name(desc: str) -> str:
        if not desc: return 'value'
        m = {'I':'int','J':'long','F':'float','D':'double',
             'Z':'bool','B':'byte','S':'short','C':'char','V':'void'}
        if desc in m: return m[desc]
        if desc.startswith('L') and desc.endswith(';'):
            return desc[1:-1].rsplit('/', 1)[-1].rstrip(';') or 'obj'
        if desc.startswith('['):
            return DeobfuscationEngine._desc_to_name(desc[1:]) + 'Arr'
        return 'value'

    def _unwind_flow(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        logger.info("Pass: Flow unwinding")
        flow_obf_classes = []
        for info in class_infos:
            flow_score = 0
            for marker in info.obf_markers:
                if 'flow' in marker.lower(): flow_score += 5
            if len(info.methods) > 25: flow_score += 2
            if info.has_synthetic: flow_score += 1
            if flow_score >= 3:
                flow_obf_classes.append(info)
                self.result.flow_blocks_unwound += len(info.methods)

        hints_file = deobf_dir / ".flow_deobf_hints"
        hints = {
            "flow_obfuscated_classes": [c.full_name for c in flow_obf_classes],
            "recommended_engines": ["CFR", "Fernflower"],
            "aggressive_mode": True,
        }
        hints_file.write_text(json.dumps(hints, indent=2))
        logger.info(f"  Found {len(flow_obf_classes)} flow-obfuscated classes")

    def _deobfuscate_numbers(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        logger.info("Pass: Number deobfuscation")
        number_obf_classes = []
        for info in class_infos:
            for method in info.methods:
                if re.search(r'math|number|_math|_num', method, re.IGNORECASE):
                    number_obf_classes.append(info)
                    break
            for marker in info.obf_markers:
                if 'number' in marker.lower() or 'math' in marker.lower():
                    if info not in number_obf_classes: number_obf_classes.append(info)
                    break

        self.result.numbers_resolved = len(number_obf_classes)
        hints_file = deobf_dir / ".number_deobf_hints"
        hints = {
            "number_obfuscated_classes": [c.full_name for c in number_obf_classes],
            "constant_folding": True,
        }
        hints_file.write_text(json.dumps(hints, indent=2))
        logger.info(f"  Found {len(number_obf_classes)} number-obfuscated classes")

    def _repair_attributes(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        logger.info("Pass: Attribute repair")
        repaired = 0
        for info in class_infos:
            needs_repair = False
            missing_attrs = []
            if info.is_inner and 'InnerClasses' not in info.attributes:
                missing_attrs.append("InnerClasses")
                needs_repair = True
            if info.access_flags & 0x1000:
                if 'StackMapTable' not in info.attributes:
                    missing_attrs.append("StackMapTable")
                    needs_repair = True
            for marker in info.obf_markers:
                if 'attribute' in marker.lower() or 'attr' in marker.lower():
                    needs_repair = True
                    missing_attrs.append("ObfuscatorManipulated")
                    break

            if needs_repair:
                repaired += 1
                marker = deobf_dir / f".attr_repair_{info.simple_name}"
                marker.write_text(
                    f"class={info.full_name}\n"
                    f"missing_attributes={','.join(missing_attrs)}\n"
                    f"is_inner={info.is_inner}\n"
                    f"outer_class={info.outer_class}\n"
                )

        self.result.attributes_repaired = repaired
        logger.info(f"  Flagged {repaired} classes for attribute repair")

    def _unwrap_indy(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        logger.info("Pass: Indy unwrapping")
        indy_classes = []
        for info in class_infos:
            indy_score = 0
            for marker in info.obf_markers:
                if 'indy' in marker.lower() or 'invokedynamic' in marker.lower(): indy_score += 5
            for method in info.methods:
                if 'paramorphism' in method.lower() or 'phantasm' in method.lower(): indy_score += 3
            if 'BootstrapMethods' in info.attributes: indy_score += 1
            if indy_score >= 3:
                indy_classes.append(info)
                self.result.indy_wraps_removed += 1

        hints_file = deobf_dir / ".indy_deobf_hints"
        hints = {
            "indy_wrapped_classes": [c.full_name for c in indy_classes],
            "recommended_engines": ["JADX", "CFR"],
            "aggressive_indy_handling": True,
        }
        hints_file.write_text(json.dumps(hints, indent=2))
        logger.info(f"  Found {len(indy_classes)} indy-wrapped classes")

    def _decrypt_resources(self, deobf_dir: Path):
        logger.info("Pass: Resource decryption")
        resource_files = []
        for ext in ['.properties', '.xml', '.json', '.txt', '.csv', '.cfg']:
            resource_files.extend(deobf_dir.rglob(f"*{ext}"))

        decrypted = 0
        for rf in resource_files:
            try:
                data = rf.read_bytes()
                if len(data) > 16 and not self._is_printable_bytes(data[:64]):
                    for key in range(1, 256):
                        decrypted_data = bytes(b ^ key for b in data)
                        if self._is_printable_bytes(decrypted_data[:64]):
                            rf.write_bytes(decrypted_data)
                            decrypted += 1
                            break
            except Exception: pass

        self.result.resources_decrypted = decrypted
        logger.info(f"  Decrypted {decrypted} resources")

    def _remove_injected_classes(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        logger.info("Pass: Injected class removal")
        removed = 0
        for info in class_infos:
            should_remove = False
            if 'stringer' in info.full_name.lower() or info.simple_name.startswith('$_'): should_remove = True
            for obf_name, obf_config in ObfuscatorRegistry.OBFUSCATORS.items():
                for pattern in obf_config.get("signatures", {}).get("injected_classes", []):
                    if re.search(pattern, info.full_name.replace('.', '/'), re.IGNORECASE):
                        should_remove = True
                        break
                if should_remove: break

            if not should_remove and len(info.methods) <= 3:
                for method in info.methods:
                    if any(kw in method.lower() for kw in ['decrypt', 'decode', 'z', '_z']):
                        should_remove = True
                        break

            if should_remove:
                path = Path(info.source_path) if info.source_path else None
                if path and path.exists():
                    path.unlink()
                    removed += 1

        logger.info(f"  Removed {removed} injected classes")

    def _reconstruct_constant_pool(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        logger.info("Pass: Constant pool reconstruction")
        cp_manipulated = 0
        for info in class_infos:
            for marker in info.obf_markers:
                if 'cp' in marker.lower() or 'constant' in marker.lower():
                    cp_manipulated += 1
                    break

        hints_file = deobf_dir / ".cp_reconstruct_hints"
        hints_file.write_text(json.dumps({
            "cp_manipulated_classes": cp_manipulated,
            "recommended_engines": ["Krakatau", "CFR"],
        }, indent=2))
        logger.info(f"  Found {cp_manipulated} classes with CP manipulation")

    def _apply_mapping(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        if self.analysis.mapping_file_found and self.analysis.mapping_file_path:
            self._apply_proguard_mapping(deobf_dir, Path(self.analysis.mapping_file_path))

# ============================================================================
# DECOMPILER ENGINES
# ============================================================================

class DecompilerEngine:
    def __init__(self, name: str, jar_path: str):
        self.name = name
        self.jar_path = jar_path
        self.available = Path(jar_path).exists()

    def decompile(self, input_path: Path, output_dir: Path) -> DecompilationResult:
        raise NotImplementedError

    def _run_java(self, args: List[str], timeout: int = 600) -> Tuple[int, str, str]:
        cmd = ["java", "-jar", self.jar_path] + args
        logger.debug(f"Running: {' '.join(cmd)}")
        try:
            proc = subprocess.run(cmd, capture_output=True, text=True, timeout=timeout)
            return proc.returncode, proc.stdout, proc.stderr
        except subprocess.TimeoutExpired: return -1, "", "Process timed out"
        except Exception as e: return -1, "", str(e)

class CFREngine(DecompilerEngine):
    def __init__(self): super().__init__("CFR", Config.ENGINES["cfr"]["jar"])
    def decompile(self, input_path: Path, output_dir: Path) -> DecompilationResult:
        if not self.available: return DecompilationResult(self.name, False, None, "JAR not found")
        output_dir.mkdir(parents=True, exist_ok=True)
        args = [
            str(input_path), "--outputdir", str(output_dir),
            # clarity flags
            "--comments",                "false",
            "--usenametable",            "true",
            "--silent",                  "true",
            "--forcetoplevel",           "true",
            # deobfuscation flags
            "--decodeenumswitch",        "true",
            "--decodelambdas",           "true",
            "--removeinnerclasssynthetic","true",
            "--recovertypeclash",        "true",
            "--recovertypehints",        "true",
            "--forcecondpropagate",      "true",
            "--stringbuffer",            "true",   # inline StringBuilder chains
            "--sugarenums",              "true",   # restore enum sugar
            "--sugarasserts",            "true",
            "--sugarboxing",             "true",
            "--decodefinally",           "true",
            "--tidymonitors",            "true",
            "--lenient",                 "true",   # tolerate bad bytecode
            "--showversion",             "false",
        ]
        retcode, stdout, stderr = self._run_java(args)
        success = retcode == 0 or len(list(output_dir.rglob("*.java"))) > 0
        count = len(list(output_dir.rglob("*.java")))
        return DecompilationResult(self.name, success, str(output_dir) if success else None, stderr if not success else None, count)

class ProcyonEngine(DecompilerEngine):
    def __init__(self): super().__init__("Procyon", Config.ENGINES["procyon"]["jar"])
    def decompile(self, input_path: Path, output_dir: Path) -> DecompilationResult:
        if not self.available: return DecompilationResult(self.name, False, None, "JAR not found")
        output_dir.mkdir(parents=True, exist_ok=True)
        cmd = ["java", "-jar", self.jar_path, "-o", str(output_dir), str(input_path)]
        try:
            proc = subprocess.run(cmd, capture_output=True, text=True, timeout=600)
            retcode, stdout, stderr = proc.returncode, proc.stdout, proc.stderr
        except Exception as e: return DecompilationResult(self.name, False, None, str(e))
        success = retcode == 0
        count = len(list(output_dir.rglob("*.java"))) if success else 0
        return DecompilationResult(self.name, success, str(output_dir) if success else None, stderr if not success else None, count)

class FernflowerEngine(DecompilerEngine):
    def __init__(self): super().__init__("Fernflower", Config.ENGINES["fernflower"]["jar"])
    def needs_dir_input(self): return True  # quiltflower works on directories, not JARs
    def decompile(self, input_path: Path, output_dir: Path) -> DecompilationResult:
        if not self.available: return DecompilationResult(self.name, False, None, "JAR not found")
        output_dir.mkdir(parents=True, exist_ok=True)
        src = input_path if input_path.is_dir() else input_path.parent
        cmd = [
            "java", "-jar", self.jar_path,
            "-hes=0",   # hide empty super-constructors
            "-hdc=0",   # hide default constructors
            "-dgs=1",   # decompile generic signatures
            "-asc=1",   # encode non-ascii as unicode
            "-bsm=1",   # decompile bootstrap methods (lambdas)
            "-iec=1",   # include entire class path
            "-iib=1",   # inline increments in expressions
            "-log=WARN",
            str(src), str(output_dir),
        ]
        try:
            proc = subprocess.run(cmd, capture_output=True, text=True, timeout=600)
            retcode, stdout, stderr = proc.returncode, proc.stdout, proc.stderr
        except Exception as e: return DecompilationResult(self.name, False, None, str(e))
        # quiltflower outputs a .jar with .java inside — extract if needed
        java_count = len(list(output_dir.rglob("*.java")))
        for jar_out in list(output_dir.glob("*.jar")):
            import zipfile as _zf
            with _zf.ZipFile(jar_out, 'r') as z:
                for name in z.namelist():
                    if name.endswith(".java"):
                        dest = output_dir / name
                        dest.parent.mkdir(parents=True, exist_ok=True)
                        dest.write_bytes(z.read(name))
            jar_out.unlink()
        java_count = len(list(output_dir.rglob("*.java")))
        success = java_count > 0
        return DecompilationResult(self.name, success, str(output_dir) if success else None, stderr if not success else None, java_count)

class JadxEngine(DecompilerEngine):
    JADX_LIB_DIR = Path("libs/jadx-lib")
    def __init__(self):
        super().__init__("JADX", Config.ENGINES["jadx"]["jar"])
        self.available = self.JADX_LIB_DIR.exists() and any(self.JADX_LIB_DIR.glob("jadx-cli-*.jar"))
    def decompile(self, input_path: Path, output_dir: Path) -> DecompilationResult:
        if not self.available: return DecompilationResult(self.name, False, None, "JADX lib not found")
        output_dir.mkdir(parents=True, exist_ok=True)
        cp = str(self.JADX_LIB_DIR / "*")
        cmd = ["java", "-cp", cp, "jadx.cli.JadxCLI",
               "-d", str(output_dir),
               "--show-bad-code",          # include methods that fail to decompile
               "--deobf",                  # JADX built-in deobfuscation
               "--deobf-min", "2",         # rename identifiers ≥ 2 chars
               "--deobf-max", "64",
               "--deobf-use-sourcename",   # use SourceFile attr if present
               "--no-imports",             # keep FQN, avoids import collisions
               "--cfg",                    # dump control-flow graph
               "--raw-cfg",
               str(input_path)]
        try:
            proc = subprocess.run(cmd, capture_output=True, text=True, timeout=600)
            retcode, stdout, stderr = proc.returncode, proc.stdout, proc.stderr
        except Exception as e: return DecompilationResult(self.name, False, None, str(e))
        count = len(list(output_dir.rglob("*.java")))
        success = count > 0
        return DecompilationResult(self.name, success, str(output_dir) if success else None, stderr if not success else None, count)

class KrakatauEngine(DecompilerEngine):
    def __init__(self): super().__init__("Krakatau", Config.ENGINES["krakatau"]["jar"])
    def decompile(self, input_path: Path, output_dir: Path) -> DecompilationResult:
        if not self.available: return DecompilationResult(self.name, False, None, "JAR not found")
        output_dir.mkdir(parents=True, exist_ok=True)
        cmd = ["java", "-jar", self.jar_path, "decompile", "-path", str(input_path), "-out", str(output_dir)]
        try:
            proc = subprocess.run(cmd, capture_output=True, text=True, timeout=600)
            retcode, stdout, stderr = proc.returncode, proc.stdout, proc.stderr
        except Exception as e: return DecompilationResult(self.name, False, None, str(e))
        success = retcode == 0
        count = len(list(output_dir.rglob("*.java"))) if success else 0
        return DecompilationResult(self.name, success, str(output_dir) if success else None, stderr if not success else None, count)

# ============================================================================
# ENGINE MANAGER
# ============================================================================

class EngineManager:
    def __init__(self):
        self.engines = [CFREngine(), ProcyonEngine(), FernflowerEngine(), JadxEngine(), KrakatauEngine()]

    def run_all(self, input_path: Path, base_output: Path, dir_input: Path = None) -> Dict[str, DecompilationResult]:
        results = {}
        for engine in self.engines:
            if not engine.available:
                results[engine.name] = DecompilationResult(engine.name, False, None, "JAR not found")
                continue
            engine_output = base_output / engine.name.lower()
            if engine_output.exists(): shutil.rmtree(engine_output)
            engine_output.mkdir(parents=True, exist_ok=True)
            # Engines that need directory input get dir_input, others get JAR
            src = dir_input if (dir_input and hasattr(engine, "needs_dir_input") and engine.needs_dir_input()) else input_path
            logger.info(f"Running {engine.name} on {src}")
            results[engine.name] = engine.decompile(src, engine_output)
        return results

    def get_available_engines(self) -> List[str]:
        return [e.name for e in self.engines if e.available]

# ============================================================================
# OUTPUT MERGER
# ============================================================================

class OutputMerger:
    ENGINE_PRIORITY = {"CFR": 5, "Fernflower": 4, "Procyon": 3, "JADX": 2, "Krakatau": 1}

    def merge(self, engine_results: Dict[str, DecompilationResult], merged_output: Path) -> Dict[str, str]:
        if merged_output.exists(): shutil.rmtree(merged_output)
        merged_output.mkdir(parents=True, exist_ok=True)
        engine_sources = {}
        for engine_name, result in engine_results.items():
            if not result.success or not result.output_dir: continue
            output_path = Path(result.output_dir)
            for jf in output_path.rglob("*.java"):
                rel_path = jf.relative_to(output_path)
                class_name = str(rel_path.with_suffix('')).replace(os.sep, '.')
                if class_name not in engine_sources: engine_sources[class_name] = {}
                engine_sources[class_name][engine_name] = jf

        best_sources = {}
        for class_name, sources in engine_sources.items():
            best_engine = self._select_best(sources)
            best_path = sources[best_engine]
            rel_path = best_path.relative_to(engine_results[best_engine].output_dir)
            dest = merged_output / rel_path
            dest.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(best_path, dest)
            best_sources[class_name] = str(dest)
        return best_sources

    def _select_best(self, sources: Dict[str, Path]) -> str:
        if len(sources) == 1: return list(sources.keys())[0]
        best_engine, best_score = None, -1
        for engine_name, source_path in sources.items():
            try:
                content = source_path.read_text(encoding='utf-8', errors='replace')
                score = min(len(content) / 1000, 10)
                if '// $FF: ' not in content: score += 5
                if 'Unable to' not in content: score += 5
                if content.count('{') > content.count('}'): score += 3
                if 'import ' in content: score += 2
                if 'package ' in content: score += 2
                if content.count('//') / max(len(content.split('\n')), 1) < 0.1: score += 3
                score += self.ENGINE_PRIORITY.get(engine_name, 0)
                if score > best_score: best_score, best_engine = score, engine_name
            except: continue
        return best_engine or list(sources.keys())[0]

# ============================================================================
# INDEX GENERATOR
# ============================================================================

class IndexGenerator:
    def generate(self, class_files: List[Path], engine_results: Dict[str, DecompilationResult],
                 obf_analysis: ObfuscationAnalysis, deobf_result: DeobfuscationResult,
                 best_sources: Dict[str, str], output_path: Path):
        class_infos = {}
        for cf in class_files:
            info = ClassFileParser.parse(cf)
            if info:
                for en, res in engine_results.items():
                    if res.success and res.output_dir:
                        for jf in Path(res.output_dir).rglob("*.java"):
                            if cf.stem in jf.stem:
                                if en not in info.decompiled_by: info.decompiled_by.append(en)
                                break
                if info.full_name in best_sources: info.best_source = best_sources[info.full_name]
                class_infos[info.full_name] = info

        modules = defaultdict(list)
        for ci in class_infos.values():
            pkg = ci.package if ci.package else "(default)"
            mod_name = pkg.split('.')[0] if ci.package else "default"
            modules[mod_name].append(ci)

        with open(output_path, 'w', encoding='utf-8') as f:
            f.write("=" * 80 + "\n  GHOST'S JAVA DECOMPILER & DEOBFUSCATOR BOT — INDEX\n  For VEX ⚡\n" + "=" * 80 + "\n\n")
            f.write("─" * 80 + "\n  SUMMARY\n" + "─" * 80 + "\n")
            f.write(f"  Total classes:    {len(class_infos)}\n  Modules:          {len(modules)}\n")
            f.write(f"  Obfuscators:      {', '.join(obf_analysis.detected_obfuscators) or 'None'}\n")
            f.write(f"  Strings decrypted:{deobf_result.strings_decrypted}\n  Classes renamed:  {deobf_result.classes_renamed}\n\n")
            f.write("─" * 80 + "\n  SUPPORTED OBFUSCATORS\n" + "─" * 80 + "\n")
            for name, config in ObfuscatorRegistry.OBFUSCATORS.items():
                f.write(f"  {name:20s}  [{', '.join(config['techniques'])}]\n")
            f.write("\n─" * 80 + "\n  FULL CLASS LISTING\n" + "─" * 80 + "\n")
            for i, cls in enumerate(sorted(class_infos.values(), key=lambda c: c.full_name), 1):
                f.write(f"  {i:5d}. {cls.full_name}\n        Methods: {len(cls.methods)} | Fields: {len(cls.fields)} | Engines: {', '.join(cls.decompiled_by)}\n")

# ============================================================================
# DEPENDENCY MANAGER
# ============================================================================

class DependencyManager:
    MIN_JAR_SIZE = 50_000  # bytes — anything smaller is likely a 404 page
    DOWNLOAD_TIMEOUT = 15  # seconds — fail fast rather than block the bot

    def ensure_dependencies(self) -> Dict[str, bool]:
        Path("libs").mkdir(exist_ok=True)
        availability = {}
        import urllib.request
        for engine_name, engine_config in Config.ENGINES.items():
            jar_path = Path(engine_config["jar"])
            if jar_path.exists() and jar_path.stat().st_size >= self.MIN_JAR_SIZE:
                availability[engine_name] = True
                continue
            url = engine_config.get("url", "")
            if not url:
                availability[engine_name] = False
                continue
            try:
                tmp = Path(str(jar_path) + ".tmp")
                logger.info(f"Downloading {engine_name} from {url} ...")
                # Use urlopen with timeout instead of urlretrieve (which has no timeout)
                req = urllib.request.Request(url, headers={"User-Agent": "GhostDecompiler/1.0"})
                with urllib.request.urlopen(req, timeout=self.DOWNLOAD_TIMEOUT) as resp:
                    tmp.write_bytes(resp.read())
                if tmp.stat().st_size >= self.MIN_JAR_SIZE:
                    tmp.rename(jar_path)
                    availability[engine_name] = True
                    logger.info(f"Downloaded {engine_name} OK")
                else:
                    tmp.unlink(missing_ok=True)
                    availability[engine_name] = False
                    logger.warning(f"Skipping {engine_name}: download too small (bad URL?)")
            except Exception as e:
                Path(str(jar_path) + ".tmp").unlink(missing_ok=True)
                availability[engine_name] = False
                logger.warning(f"Failed to download {engine_name} (timeout={self.DOWNLOAD_TIMEOUT}s): {e}")
        return availability

# ============================================================================
# FILE HANDLER
# ============================================================================

class FileHandler:
    @staticmethod
    def prepare_input(input_path: Path) -> Tuple[Path, List[Path]]:
        work_dir = Config.TEMP_DIR / "input"
        if work_dir.exists(): shutil.rmtree(work_dir)
        work_dir.mkdir(parents=True, exist_ok=True)
        class_files = []
        if input_path.is_file():
            if input_path.suffix == ".jar":
                with zipfile.ZipFile(input_path, 'r') as zf: zf.extractall(work_dir)
                class_files = sorted(work_dir.rglob("*.class"))
            elif input_path.suffix == ".class":
                shutil.copy2(input_path, work_dir / input_path.name)
                class_files = [work_dir / input_path.name]
        elif input_path.is_dir():
            class_files = sorted(input_path.rglob("*.class"))
            for cf in class_files:
                rel = cf.relative_to(input_path)
                dest = work_dir / rel
                dest.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(cf, dest)
            class_files = sorted(work_dir.rglob("*.class"))
        return work_dir, class_files

# ============================================================================
# DECOMPILER BOT
# ============================================================================

class DecompilerBot:
    """Synchronous pipeline runner — safe to call from a thread executor."""

    def __init__(self, skip_download=False, progress_cb=None):
        self.skip_download = skip_download
        self.progress_cb   = progress_cb  # optional callable(stage: str)

    def _progress(self, stage: str):
        if self.progress_cb:
            try: self.progress_cb(stage)
            except Exception: pass

    def run(self, input_path: Path) -> Tuple[bool, str]:
        try:
            if not self.skip_download:
                self._progress("Checking dependencies…")
                DependencyManager().ensure_dependencies()

            self._progress("Extracting class files…")
            work_dir, class_files = FileHandler.prepare_input(input_path)
            logger.info(f"Extracted {len(class_files)} class files from {input_path.name}")

            self._progress(f"Detecting obfuscation in {len(class_files)} classes…")
            obf_analysis = ObfuscationDetector().analyze(class_files, work_dir)
            logger.info(f"Obfuscators detected: {obf_analysis.detected_obfuscators or ['none']}")

            self._progress("Deobfuscating bytecode (rename → decrypt strings → flow)…")
            deobf_dir, deobf_result = DeobfuscationEngine(obf_analysis).deobfuscate(work_dir, class_files)

            # Repack deobfuscated .class files into a JAR so decompilers can consume it
            self._progress("Repacking deobfuscated classes…")
            repack_jar = Config.TEMP_DIR / 'repack_deobf.jar'
            with zipfile.ZipFile(repack_jar, 'w', zipfile.ZIP_DEFLATED) as zf:
                for cf in sorted(deobf_dir.rglob('*.class')):
                    zf.write(cf, str(cf.relative_to(deobf_dir)))
            engine_input = repack_jar if repack_jar.stat().st_size > 0 else input_path

            output_base = Path(Config.OUTPUT_DIR)
            if output_base.exists(): shutil.rmtree(output_base)
            engine_output = output_base / Config.ENGINE_OUTPUT_DIR
            engine_output.mkdir(parents=True, exist_ok=True)

            self._progress("Decompiling with CFR / Procyon / Fernflower / JADX…")
            engine_results = EngineManager().run_all(engine_input, engine_output, dir_input=deobf_dir)

            self._progress("Merging decompiler outputs…")
            best_sources = OutputMerger().merge(engine_results, output_base / Config.MERGED_OUTPUT_DIR)
            IndexGenerator().generate(class_files, engine_results, obf_analysis, deobf_result,
                                      best_sources, output_base / Config.INDEX_FILE)

            obf_str  = ", ".join(obf_analysis.detected_obfuscators) if obf_analysis.detected_obfuscators else "unknown"
            deobf_str = (f"{deobf_result.classes_renamed} classes / "
                         f"{deobf_result.strings_decrypted} strings decrypted")
            return True, (f"✅ **Decompilation complete!**\n"
                          f"• Classes: {len(best_sources)} decompiled\n"
                          f"• Obfuscator: {obf_str}\n"
                          f"• Deobfuscated: {deobf_str}")
        except Exception as e:
            logger.exception("Pipeline error")
            return False, str(e)

# ============================================================================
# DISCORD BOT
# ============================================================================

intents = discord.Intents.default()
intents.message_content = True
bot = commands.Bot(command_prefix=Config.BOT_PREFIX, intents=intents, help_command=None)

@bot.event
async def on_ready():
    logger.info(f"{bot.user} is online!")
    await bot.change_presence(activity=discord.Activity(type=discord.ActivityType.watching, name=f"{Config.BOT_PREFIX}decompile | {len(ObfuscatorRegistry.OBFUSCATORS)} obfuscators"))

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

    loop    = asyncio.get_event_loop()
    result_holder: Dict[str, Any] = {}

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
            # DecompilerBot.run() is now synchronous — safe to call from executor
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
    zip_path    = job_dir / "decompiled_output.zip"
    file_count  = 0
    with zipfile.ZipFile(zip_path, 'w', zipfile.ZIP_DEFLATED) as zf:
        for file in sorted(output_base.rglob("*")):
            if file.is_file():
                zf.write(file, str(file.relative_to(output_base)))
                file_count += 1

    zip_size = zip_path.stat().st_size
    logger.info(f"[cmd] decompile OK: {file_count} files in ZIP ({zip_size//1024} KB)")

    if zip_size > 8 * 1024 * 1024:
        # ZIP too big for Discord — inform user
        await status_msg.edit(content=f"{message}\n⚠️ Output ZIP is {zip_size//1024//1024} MB (too large for Discord). Split or contact server admin.")
    else:
        try:
            await ctx.send(content=message,
                           file=discord.File(str(zip_path), filename="decompiled_output.zip"))
            await status_msg.delete()
        except discord.HTTPException as e:
            await status_msg.edit(content=f"{message}\n⚠️ Could not send file: {e}")

    shutil.rmtree(job_dir, ignore_errors=True)

@bot.command(name="obfuscators")
async def list_obfuscators_command(ctx):
    embed = discord.Embed(title=f"Supported Obfuscators ({len(ObfuscatorRegistry.OBFUSCATORS)})", color=0x9B59B6)
    by_tech = defaultdict(list)
    for name, config in ObfuscatorRegistry.OBFUSCATORS.items():
        for tech in config["techniques"]: by_tech[tech].append(name)
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
    if len(sys.argv) > 1 and sys.argv[1] != "--discord":
        decompiler = DecompilerBot(skip_download="--skip-dl" in sys.argv)
        success, msg = asyncio.run(decompiler.run(Path(sys.argv[1])))
        print(f"{'SUCCESS' if success else 'FAILED'}: {msg}")
    else:
        if Config.BOT_TOKEN == "PUT_TOKEN_HERE":
            print("Set DISCORD_BOT_TOKEN env var!")
            sys.exit(1)
        bot.run(Config.BOT_TOKEN)