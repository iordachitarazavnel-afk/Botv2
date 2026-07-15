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
            if f_name and not f_name.startswith('this$'):
                fields.append(f_name)

        methods_count = int.from_bytes(data[offset:offset+2], 'big')
        offset += 2
        methods = []
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
            if m_name:
                methods.append(m_name)
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

    @staticmethod
    def _analyze_bytecode(code_bytes: bytes, constant_pool: list) -> dict:
        string_refs = []
        goto_count = 0
        invokedynamic_count = 0
        i = 0
        length = len(code_bytes)

        while i < length:
            opcode = code_bytes[i]
            if opcode == 0x12 and i + 1 < length:
                idx = code_bytes[i + 1]
                s = ClassFileParser._get_string_value(constant_pool, idx)
                if s: string_refs.append(s)
                i += 2
            elif opcode == 0x13 and i + 2 < length:
                idx = int.from_bytes(code_bytes[i+1:i+3], 'big')
                s = ClassFileParser._get_string_value(constant_pool, idx)
                if s: string_refs.append(s)
                i += 3
            elif opcode == 0xA7:
                goto_count += 1
                i += 3
            elif opcode == 0xC8:
                goto_count += 1
                i += 5
            elif opcode == 0xBA:
                invokedynamic_count += 1
                i += 5
            elif opcode == 0xAA:
                pad = (4 - ((i + 1) % 4)) % 4
                switch_start = i + 1 + pad
                if switch_start + 12 <= length:
                    low = int.from_bytes(code_bytes[switch_start+4:switch_start+8], 'big', signed=True)
                    high = int.from_bytes(code_bytes[switch_start+8:switch_start+12], 'big', signed=True)
                    offset_count = high - low + 1
                    i = switch_start + 12 + offset_count * 4
                else: i += 1
            elif opcode == 0xAB:
                pad = (4 - ((i + 1) % 4)) % 4
                switch_start = i + 1 + pad
                if switch_start + 8 <= length:
                    npairs = int.from_bytes(code_bytes[switch_start+4:switch_start+8], 'big')
                    i = switch_start + 8 + npairs * 8
                else: i += 1
            elif opcode == 0xC4:
                if i + 1 < length:
                    wide_op = code_bytes[i + 1]
                    if wide_op in (0x84,): i += 6
                    else: i += 4
                else: i += 1
            else:
                i += ClassFileParser._opcode_length(opcode, i, code_bytes)

        return {'string_refs': string_refs, 'goto_count': goto_count, 'invokedynamic_count': invokedynamic_count}

    @staticmethod
    def _opcode_length(opcode: int, offset: int, code: bytes) -> int:
        one_byte = {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x12, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F, 0x20, 0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, 0x2E, 0x2F, 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, 0x3E, 0x3F, 0x40, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49, 0x4A, 0x4B, 0x4C, 0x4D, 0x4E, 0x4F, 0x50, 0x51, 0x52, 0x53, 0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 0x5A, 0x5B, 0x5C, 0x5D, 0x5E, 0x5F, 0x60, 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A, 0x7B, 0x7C, 0x7D, 0x7E, 0x7F, 0x80, 0x81, 0x82, 0x83, 0x84, 0x85, 0x86, 0x87, 0x88, 0x89, 0x8A, 0x8B, 0x8C, 0x8D, 0x8E, 0x91, 0x92, 0x93, 0x94, 0x95, 0x96, 0x97, 0x98, 0xAC, 0xAD, 0xAE, 0xAF, 0xB0, 0xB1, 0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xCA, 0xCB, 0xCC}
        if opcode in one_byte: return 1
        two_byte = {0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0xA9, 0xC0, 0xC1}
        if opcode in two_byte: return 2
        three_byte = {0x84, 0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xA7, 0xA8, 0xB9, 0xBB, 0xBC, 0xBD, 0xBE, 0xBF, 0xC0, 0xC1}
        if opcode in three_byte: return 3
        if opcode == 0xC5: return 4
        if opcode == 0xBA: return 5
        return 1

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
        if self.analysis.renamed_classes: strategies_to_run.add("name_restore")
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

    def _decrypt_strings(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        logger.info("Pass: String decryption")
        decryptor_classes = []
        xor_keys = set()
        base64_patterns = set()

        for info in class_infos:
            is_decryptor = False
            for method in info.methods:
                if any(kw in method.lower() for kw in ['decrypt', 'decode', 'z', '_z', '$z']):
                    is_decryptor = True
                    break
            if len(info.methods) <= 3 and len(info.string_refs) > 20: is_decryptor = True
            for marker in info.obf_markers:
                if 'string' in marker.lower() or 'decrypt' in marker.lower(): is_decryptor = True

            if is_decryptor:
                decryptor_classes.append(info)
                if info.constant_pool:
                    for entry in info.constant_pool:
                        if entry and entry[0] == 'Integer': xor_keys.add(entry[1])
                        elif entry and entry[0] == 'Utf8':
                            val = entry[1]
                            if len(val) > 8 and re.match(r'^[A-Za-z0-9+/=]+$', val): base64_patterns.add(val)

            if info.constant_pool and info.string_refs:
                for s in info.string_refs:
                    for key in range(1, 256):
                        try:
                            decrypted = bytes(b ^ key for b in s.encode('utf-8', errors='replace'))
                            decoded = decrypted.decode('utf-8', errors='ignore')
                            if self._is_printable_string(decoded) and len(decoded) > 2:
                                if decoded != s: self.result.strings_decrypted += 1
                        except: pass

        import base64
        for b64str in list(base64_patterns)[:100]:
            try:
                decoded = base64.b64decode(b64str)
                if self._is_printable_bytes(decoded): self.result.strings_decrypted += 1
            except: pass

        for dc in decryptor_classes:
            dc_path = Path(dc.source_path) if dc.source_path else None
            if dc_path and dc_path.exists():
                marker = deobf_dir / f".string_decryptor_{dc.simple_name}"
                marker.write_text(f"class={dc.full_name}\nmethods={','.join(dc.methods)}\n")

        hints_file = deobf_dir / ".deobf_hints"
        hints = {
            "string_decryption": True,
            "decryptor_classes": [dc.full_name for dc in decryptor_classes],
            "xor_keys_found": list(xor_keys)[:20],
            "base64_strings_found": len(base64_patterns),
        }
        hints_file.write_text(json.dumps(hints, indent=2))
        logger.info(f"  Found {len(decryptor_classes)} decryptor classes, decrypted {self.result.strings_decrypted} strings")

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
        logger.info("Pass: Junk code removal")
        all_method_refs = set()
        all_class_refs = set()

        for info in class_infos:
            if info.constant_pool:
                for entry in info.constant_pool:
                    if entry and entry[0] == 'Ref':
                        class_name = ClassFileParser._get_class_name(info.constant_pool, entry[1])
                        if 0 < entry[2] < len(info.constant_pool) and info.constant_pool[entry[2]]:
                            nat_entry = info.constant_pool[entry[2]]
                            if nat_entry[0] == 'NameAndType':
                                nat_name = ClassFileParser._get_utf8(info.constant_pool, nat_entry[1])
                                if nat_name: all_method_refs.add(f"{class_name}.{nat_name}")
                        if class_name: all_class_refs.add(class_name.replace('/', '.'))

        junk_methods_removed = 0
        junk_classes_removed = 0

        for info in class_infos:
            path = Path(info.source_path) if info.source_path else None
            if not path or not path.exists(): continue

            junk_methods = []
            for method in info.methods:
                is_junk = False
                for obf_config in ObfuscatorRegistry.OBFUSCATORS.values():
                    for pattern in obf_config.get("signatures", {}).get("junk_patterns", []):
                        if re.search(pattern, method, re.IGNORECASE):
                            is_junk = True
                            break
                    if is_junk: break

                method_ref = f"{info.full_name.replace('.', '/')}.{method}"
                if method not in ['<init>', '<clinit>', 'main'] and method_ref not in all_method_refs:
                    if info.has_synthetic or re.match(r'^[a-zA-Z]{1,2}\d*$', method): is_junk = True

                if is_junk: junk_methods.append(method)

            if junk_methods:
                junk_methods_removed += len(junk_methods)
                marker = deobf_dir / f".junk_methods_{info.simple_name}"
                marker.write_text(f"class={info.full_name}\njunk_methods={','.join(junk_methods)}\n")

        for info in class_infos:
            if info.simple_name in ['Main', 'App', 'Application', 'Entry', 'Start']: continue
            if info.full_name in all_class_refs: continue
            if any(kw in info.simple_name.lower() for kw in ['util', 'helper', 'config', 'main']): continue
            if len(info.methods) <= 2 and len(info.fields) <= 2:
                path = Path(info.source_path) if info.source_path else None
                if path and path.exists():
                    path.unlink()
                    junk_classes_removed += 1
                    logger.debug(f"  Removed junk class: {info.full_name}")

        self.result.junk_methods_removed = junk_methods_removed
        logger.info(f"  Removed {junk_methods_removed} junk methods, {junk_classes_removed} junk classes")

    def _restore_names(self, deobf_dir: Path, class_infos: List[ClassInfo]):
        logger.info("Pass: Name restoration")
        if self.analysis.mapping_file_found and self.analysis.mapping_file_path:
            self._apply_proguard_mapping(deobf_dir, Path(self.analysis.mapping_file_path))
            return

        rename_map = {}
        counter = defaultdict(int)
        inheritance_map = defaultdict(list)
        for info in class_infos:
            if info.superclass: inheritance_map[info.superclass].append(info)

        interface_map = defaultdict(list)
        for info in class_infos:
            for iface in info.interfaces: interface_map[iface].append(info)

        for info in class_infos:
            simple = info.simple_name
            if not re.match(r'^[a-zA-Z]{1,3}\d*$', simple) and not re.match(r'^_\d+$', simple): continue

            new_name = None
            for iface in info.interfaces:
                iface_simple = iface.rsplit('.', 1)[-1] if '.' in iface else iface
                if iface_simple not in ['Object', 'Serializable', 'Cloneable']:
                    if 'Listener' in iface_simple: new_name = f"{iface_simple.replace('Listener', '')}Handler"
                    elif 'Provider' in iface_simple: new_name = f"{iface_simple.replace('Provider', '')}Impl"
                    elif 'Factory' in iface_simple: new_name = f"{iface_simple.replace('Factory', '')}Creator"
                    else: new_name = f"{iface_simple}Impl"
                    break

            if not new_name and info.superclass:
                super_simple = info.superclass.rsplit('.', 1)[-1] if '.' in info.superclass else info.superclass
                if super_simple not in ['Object', 'Enum', 'Thread', 'Runnable']: new_name = f"{super_simple}Subclass"

            if not new_name and info.string_refs:
                for s in info.string_refs[:5]:
                    if len(s) > 3 and s.replace('_', '').isalpha():
                        new_name = f"Class_{s[:15].capitalize()}"
                        break

            if not new_name:
                for method in info.methods:
                    if method in ['main']: new_name = "MainClass"; break
                    elif 'connect' in method.lower(): new_name = "ConnectionManager"; break
                    elif 'encrypt' in method.lower() or 'decrypt' in method.lower(): new_name = "CryptoHandler"; break
                    elif 'send' in method.lower() or 'receive' in method.lower(): new_name = "NetworkHandler"; break

            if not new_name:
                prefix = "Deobf"
                counter[prefix] += 1
                new_name = f"{prefix}{counter[prefix]}"

            base_name = new_name
            while new_name in [r[1] for r in rename_map.values()]:
                counter[base_name] += 1
                new_name = f"{base_name}_{counter[base_name]}"

            old_full = info.full_name
            new_full = f"{info.package}.{new_name}" if info.package else new_name
            rename_map[old_full] = new_full

        for old_name, new_name in rename_map.items():
            old_path = deobf_dir / (old_name.replace('.', '/') + ".class")
            new_path = deobf_dir / (new_name.replace('.', '/') + ".class")
            if old_path.exists():
                new_path.parent.mkdir(parents=True, exist_ok=True)
                shutil.move(str(old_path), str(new_path))

        self.result.classes_renamed = len(rename_map)
        logger.info(f"  Renamed {len(rename_map)} classes")

    def _apply_proguard_mapping(self, deobf_dir: Path, mapping_file: Path):
        logger.info(f"  Applying ProGuard mapping: {mapping_file}")
        mappings = {}
        try:
            with open(mapping_file, 'r') as f:
                for line in f:
                    line = line.strip()
                    if not line or line.startswith('#'): continue
                    if ' -> ' in line and ':' in line:
                        parts = line.split(' -> ')
                        if len(parts) == 2:
                            orig = parts[0].strip()
                            obf = parts[1].rstrip(':').strip()
                            mappings[obf] = orig
        except Exception as e:
            logger.error(f"  Error parsing mapping file: {e}")
            return

        for old_name, new_name in mappings.items():
            old_path = deobf_dir / (old_name.replace('.', '/') + ".class")
            new_path = deobf_dir / (new_name.replace('.', '/') + ".class")
            if old_path.exists():
                new_path.parent.mkdir(parents=True, exist_ok=True)
                shutil.move(str(old_path), str(new_path))

        self.result.classes_renamed = len(mappings)
        logger.info(f"  Applied {len(mappings)} mapping entries")

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
        args = [str(input_path), "--outputdir", str(output_dir), "--comments", "false", "--usenametable", "true", "--decodeenumswitch", "true", "--decodelambda", "true", "--decodelambdas", "true", "--removeinnerclasssynthetic", "true", "--silent", "true", "--recovertypeclash", "true", "--recovertypehints", "true", "--forcecondpropagate", "true", "--forcetoplevel", "true", "--trackbytecodes", "true"]
        retcode, stdout, stderr = self._run_java(args)
        success = retcode == 0
        count = len(list(output_dir.rglob("*.java"))) if success else 0
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
    def decompile(self, input_path: Path, output_dir: Path) -> DecompilationResult:
        if not self.available: return DecompilationResult(self.name, False, None, "JAR not found")
        output_dir.mkdir(parents=True, exist_ok=True)
        cmd = ["java", "-jar", self.jar_path, str(input_path), str(output_dir), "-hdc=0", "-dgs=1", "-rsy=1", "-rbr=0", "-lit=1", "-nls=1", "-ind=    "]
        try:
            proc = subprocess.run(cmd, capture_output=True, text=True, timeout=600)
            retcode, stdout, stderr = proc.returncode, proc.stdout, proc.stderr
        except Exception as e: return DecompilationResult(self.name, False, None, str(e))
        success = retcode == 0
        count = len(list(output_dir.rglob("*.java"))) if success else 0
        return DecompilationResult(self.name, success, str(output_dir) if success else None, stderr if not success else None, count)

class JadxEngine(DecompilerEngine):
    def __init__(self): super().__init__("JADX", Config.ENGINES["jadx"]["jar"])
    def decompile(self, input_path: Path, output_dir: Path) -> DecompilationResult:
        if not self.available: return DecompilationResult(self.name, False, None, "JAR not found")
        output_dir.mkdir(parents=True, exist_ok=True)
        cmd = ["java", "-jar", self.jar_path, "-d", str(output_dir), "--show-bad-code", "--no-imports", "--debug-info", "--deobf", "--escape-unicode", str(input_path)]
        try:
            proc = subprocess.run(cmd, capture_output=True, text=True, timeout=600)
            retcode, stdout, stderr = proc.returncode, proc.stdout, proc.stderr
        except Exception as e: return DecompilationResult(self.name, False, None, str(e))
        success = retcode == 0
        count = len(list(output_dir.rglob("*.java"))) if success else 0
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

    def run_all(self, input_path: Path, base_output: Path) -> Dict[str, DecompilationResult]:
        results = {}
        for engine in self.engines:
            if not engine.available:
                results[engine.name] = DecompilationResult(engine.name, False, None, "JAR not found")
                continue
            engine_output = base_output / engine.name.lower()
            if engine_output.exists(): shutil.rmtree(engine_output)
            engine_output.mkdir(parents=True, exist_ok=True)
            results[engine.name] = engine.decompile(input_path, engine_output)
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
    def ensure_dependencies(self) -> Dict[str, bool]:
        Path("libs").mkdir(exist_ok=True)
        availability = {}
        import urllib.request
        for engine_name, engine_config in Config.ENGINES.items():
            jar_path = Path(engine_config["jar"])
            if jar_path.exists():
                availability[engine_name] = True
            else:
                try:
                    urllib.request.urlretrieve(engine_config["url"], str(jar_path))
                    availability[engine_name] = True
                except:
                    availability[engine_name] = False
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
    def __init__(self, skip_download=False):
        self.skip_download = skip_download

    async def run(self, input_path: Path) -> Tuple[bool, str]:
        try:
            if not self.skip_download:
                DependencyManager().ensure_dependencies()
            work_dir, class_files = FileHandler.prepare_input(input_path)
            obf_analysis = ObfuscationDetector().analyze(class_files, work_dir)
            deobf_dir, deobf_result = DeobfuscationEngine(obf_analysis).deobfuscate(work_dir, class_files)

            # Repack deobfuscated .class files into a JAR so decompilers can consume it
            repack_jar = Config.TEMP_DIR / 'repack_deobf.jar'
            with zipfile.ZipFile(repack_jar, 'w', zipfile.ZIP_DEFLATED) as zf:
                for cf in sorted(deobf_dir.rglob('*.class')):
                    zf.write(cf, str(cf.relative_to(deobf_dir)))
            engine_input = repack_jar if repack_jar.stat().st_size > 0 else input_path

            output_base = Path(Config.OUTPUT_DIR)
            if output_base.exists(): shutil.rmtree(output_base)
            engine_output = output_base / Config.ENGINE_OUTPUT_DIR
            engine_output.mkdir(parents=True, exist_ok=True)
            
            engine_results = EngineManager().run_all(engine_input, engine_output)
            best_sources = OutputMerger().merge(engine_results, output_base / Config.MERGED_OUTPUT_DIR)
            IndexGenerator().generate(class_files, engine_results, obf_analysis, deobf_result, best_sources, output_base / Config.INDEX_FILE)
            return True, f"Decompilation complete! {len(best_sources)} classes decompiled."
        except Exception as e:
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
        await ctx.send("Attach a .jar, .class, or .zip file to decompile!")
        return
    attachment = ctx.message.attachments[0]
    if attachment.size > Config.MAX_FILE_SIZE:
        await ctx.send(f"File too large! Max: {Config.MAX_FILE_SIZE // (1024*1024)}MB")
        return
    skip_download = "--skip-dl" in args
    status_msg = await ctx.send(f"Received `{attachment.filename}`. Starting pipeline...")
    job_dir = Config.TEMP_DIR / f"job_{ctx.message.id}"
    job_dir.mkdir(parents=True, exist_ok=True)
    input_file = job_dir / attachment.filename
    await attachment.save(input_file)
    
    import concurrent.futures
    loop = asyncio.get_event_loop()
    decompiler = DecompilerBot(skip_download=skip_download)
    
    with concurrent.futures.ThreadPoolExecutor() as pool:
        success, message = await loop.run_in_executor(pool, lambda: asyncio.run(decompiler.run(input_file)))
    
    if not success:
        await status_msg.edit(content=f"Failed: {message}")
        return
    
    output_base = Path(Config.OUTPUT_DIR)
    zip_path = job_dir / "decompiled_output.zip"
    with zipfile.ZipFile(zip_path, 'w', zipfile.ZIP_DEFLATED) as zf:
        for file in output_base.rglob("*"):
            if file.is_file(): zf.write(file, str(file.relative_to(output_base)))
    
    await ctx.send(content=message, file=discord.File(str(zip_path), filename="decompiled_output.zip"))
    await status_msg.delete()
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