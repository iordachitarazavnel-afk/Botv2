// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

public final class Initializer_3
{
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public static double method_double(final double n, final double n2) {
        return n2 * Math.round(n / n2);
    }
    
    public static double method_double_1(final double b, final double n, final double n2) {
        final double max = Math.max(0.0, Math.min(1.0, b));
        return n + (n2 - n) * max * max * (3.0 - 2.0 * max);
    }
    
    public static double method_double_2(final float n, final double n2, final double n3) {
        final double ceil = Math.ceil(Math.abs(n3 - n2) * n);
        return (n2 < n3) ? Math.min(n2 + ceil, n3) : Math.max(n2 - ceil, n3);
    }
    
    public static double method_double_4(final double n, final double n2, final double n3) {
        return n2 + (n3 - n2) * n;
    }
    
    public static double method_double_3(final double n, final double n2, final double a, final double b) {
        return method_double_4(1.0f - (float)Math.pow(a, b), n, n2);
    }
    
    public static double method_double_6(final double a, final double a2, final double b) {
        return Math.max(a2, Math.min(a, b));
    }
    
    public static int method_int(final int a, final int a2, final int b) {
        return Math.max(a2, Math.min(a, b));
    }
    
    public static int method_int_1(final int n, final int n2) {
        return (int)(Math.random() * (n2 - n + 1)) + n;
    }
    
    public static double method_double_5(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: sipush          32481
        //     8: sipush          -17623
        //    11: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_3.createString:(II)Ljava/lang/String;
        //    14: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    17: astore          5
        //    19: sipush          32480
        //    22: aload           5
        //    24: new             Ljava/lang/String;
        //    27: dup            
        //    28: bipush          11
        //    30: newarray        B
        //    32: dup            
        //    33: iconst_0       
        //    34: bipush          103
        //    36: bastore        
        //    37: dup            
        //    38: iconst_1       
        //    39: bipush          101
        //    41: bastore        
        //    42: dup            
        //    43: iconst_2       
        //    44: bipush          116
        //    46: bastore        
        //    47: dup            
        //    48: iconst_3       
        //    49: bipush          80
        //    51: bastore        
        //    52: dup            
        //    53: iconst_4       
        //    54: bipush          114
        //    56: bastore        
        //    57: dup            
        //    58: iconst_5       
        //    59: bipush          111
        //    61: bastore        
        //    62: dup            
        //    63: bipush          6
        //    65: bipush          112
        //    67: bastore        
        //    68: dup            
        //    69: bipush          7
        //    71: bipush          101
        //    73: bastore        
        //    74: dup            
        //    75: bipush          8
        //    77: bipush          114
        //    79: bastore        
        //    80: dup            
        //    81: bipush          9
        //    83: bipush          116
        //    85: bastore        
        //    86: dup            
        //    87: bipush          10
        //    89: bipush          121
        //    91: bastore        
        //    92: invokespecial   java/lang/String.<init>:([B)V
        //    95: iconst_1       
        //    96: anewarray       Ljava/lang/Class;
        //    99: dup            
        //   100: iconst_0       
        //   101: ldc             Ljava/lang/String;.class
        //   103: aastore        
        //   104: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   107: astore          6
        //   109: sipush          -7450
        //   112: new             Ljava/lang/StringBuilder;
        //   115: dup            
        //   116: invokespecial   java/lang/StringBuilder.<init>:()V
        //   119: astore          7
        //   121: aload           7
        //   123: aload           6
        //   125: aconst_null    
        //   126: iconst_1       
        //   127: anewarray       Ljava/lang/Object;
        //   130: dup            
        //   131: iconst_0       
        //   132: new             Ljava/lang/String;
        //   135: dup            
        //   136: bipush          9
        //   138: newarray        B
        //   140: dup            
        //   141: iconst_0       
        //   142: bipush          117
        //   144: bastore        
        //   145: dup            
        //   146: iconst_1       
        //   147: bipush          115
        //   149: bastore        
        //   150: dup            
        //   151: iconst_2       
        //   152: bipush          101
        //   154: bastore        
        //   155: dup            
        //   156: iconst_3       
        //   157: bipush          114
        //   159: bastore        
        //   160: dup            
        //   161: iconst_4       
        //   162: bipush          46
        //   164: bastore        
        //   165: dup            
        //   166: iconst_5       
        //   167: bipush          110
        //   169: bastore        
        //   170: dup            
        //   171: bipush          6
        //   173: bipush          97
        //   175: bastore        
        //   176: dup            
        //   177: bipush          7
        //   179: bipush          109
        //   181: bastore        
        //   182: dup            
        //   183: bipush          8
        //   185: bipush          101
        //   187: bastore        
        //   188: invokespecial   java/lang/String.<init>:([B)V
        //   191: aastore        
        //   192: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   195: checkcast       Ljava/lang/String;
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: pop            
        //   202: aload           7
        //   204: aload           6
        //   206: aconst_null    
        //   207: iconst_1       
        //   208: anewarray       Ljava/lang/Object;
        //   211: dup            
        //   212: iconst_0       
        //   213: new             Ljava/lang/String;
        //   216: dup            
        //   217: bipush          7
        //   219: newarray        B
        //   221: dup            
        //   222: iconst_0       
        //   223: bipush          111
        //   225: bastore        
        //   226: dup            
        //   227: iconst_1       
        //   228: bipush          115
        //   230: bastore        
        //   231: dup            
        //   232: iconst_2       
        //   233: bipush          46
        //   235: bastore        
        //   236: dup            
        //   237: iconst_3       
        //   238: bipush          110
        //   240: bastore        
        //   241: dup            
        //   242: iconst_4       
        //   243: bipush          97
        //   245: bastore        
        //   246: dup            
        //   247: iconst_5       
        //   248: bipush          109
        //   250: bastore        
        //   251: dup            
        //   252: bipush          6
        //   254: bipush          101
        //   256: bastore        
        //   257: invokespecial   java/lang/String.<init>:([B)V
        //   260: aastore        
        //   261: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   264: checkcast       Ljava/lang/String;
        //   267: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   270: pop            
        //   271: aload           7
        //   273: aload           6
        //   275: aconst_null    
        //   276: iconst_1       
        //   277: anewarray       Ljava/lang/Object;
        //   280: dup            
        //   281: iconst_0       
        //   282: new             Ljava/lang/String;
        //   285: dup            
        //   286: bipush          7
        //   288: newarray        B
        //   290: dup            
        //   291: iconst_0       
        //   292: bipush          111
        //   294: bastore        
        //   295: dup            
        //   296: iconst_1       
        //   297: bipush          115
        //   299: bastore        
        //   300: dup            
        //   301: iconst_2       
        //   302: bipush          46
        //   304: bastore        
        //   305: dup            
        //   306: iconst_3       
        //   307: bipush          97
        //   309: bastore        
        //   310: dup            
        //   311: iconst_4       
        //   312: bipush          114
        //   314: bastore        
        //   315: dup            
        //   316: iconst_5       
        //   317: bipush          99
        //   319: bastore        
        //   320: dup            
        //   321: bipush          6
        //   323: bipush          104
        //   325: bastore        
        //   326: invokespecial   java/lang/String.<init>:([B)V
        //   329: aastore        
        //   330: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   333: checkcast       Ljava/lang/String;
        //   336: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   339: pop            
        //   340: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_3.createString:(II)Ljava/lang/String;
        //   343: invokestatic    java/security/MessageDigest.getInstance:(Ljava/lang/String;)Ljava/security/MessageDigest;
        //   346: astore          8
        //   348: aload           8
        //   350: aload           7
        //   352: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   355: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //   358: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   361: invokevirtual   java/security/MessageDigest.digest:([B)[B
        //   364: astore          9
        //   366: new             Ljava/lang/StringBuilder;
        //   369: dup            
        //   370: invokespecial   java/lang/StringBuilder.<init>:()V
        //   373: astore          10
        //   375: aload           9
        //   377: astore          11
        //   379: aload           11
        //   381: arraylength    
        //   382: istore          12
        //   384: iconst_0       
        //   385: istore          13
        //   387: iload           13
        //   389: iload           12
        //   391: if_icmpge       476
        //   394: aload           11
        //   396: iload           13
        //   398: baload         
        //   399: istore          14
        //   401: sipush          255
        //   404: iload           14
        //   406: iand           
        //   407: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   410: astore          15
        //   412: iload           4
        //   414: ifeq            492
        //   417: iload           4
        //   419: ifeq            471
        //   422: goto            429
        //   425: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   428: athrow         
        //   429: aload           15
        //   431: invokevirtual   java/lang/String.length:()I
        //   434: iconst_1       
        //   435: if_icmpne       460
        //   438: goto            445
        //   441: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   444: athrow         
        //   445: aload           10
        //   447: bipush          48
        //   449: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   452: pop            
        //   453: goto            460
        //   456: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_3.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   459: athrow         
        //   460: aload           10
        //   462: aload           15
        //   464: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   467: pop            
        //   468: iinc            13, 1
        //   471: iload           4
        //   473: ifne            387
        //   476: getstatic       com/target/mod/compat/sub1/sub2/sub3/Initializer_1.byteArray:[[B
        //   479: iconst_0       
        //   480: aload           10
        //   482: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   485: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //   488: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   491: aastore        
        //   492: goto            520
        //   495: astore          5
        //   497: getstatic       com/target/mod/compat/sub1/sub2/sub3/Initializer_1.byteArray:[[B
        //   500: iconst_0       
        //   501: iconst_3       
        //   502: newarray        B
        //   504: dup            
        //   505: iconst_0       
        //   506: bipush          117
        //   508: bastore        
        //   509: dup            
        //   510: iconst_1       
        //   511: bipush          110
        //   513: bastore        
        //   514: dup            
        //   515: iconst_2       
        //   516: bipush          107
        //   518: bastore        
        //   519: aastore        
        //   520: dload_0        
        //   521: dload_2        
        //   522: dmul           
        //   523: dreturn        
        //    StackMapTable: 00 0C FF 01 83 00 0C 03 03 01 07 00 4D 07 00 5F 07 00 5C 07 00 69 07 00 81 07 00 5C 07 00 81 01 01 00 00 FF 00 25 00 0E 03 03 01 07 00 4D 07 00 5F 07 00 5C 07 00 69 07 00 81 07 00 5C 07 00 81 01 01 01 07 00 53 00 01 07 00 41 03 4B 07 00 41 03 4A 07 00 41 03 0A F9 00 04 0F FF 00 02 00 03 03 03 01 00 01 07 00 41 FC 00 18 07 00 99
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  429    453    456    460    Ljava/lang/Exception;
        //  417    438    441    445    Ljava/lang/Exception;
        //  412    422    425    429    Ljava/lang/Exception;
        //  5      492    495    520    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0429:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u0000\u00ee£\u00e0Y\u0019³c«\u0013¼K\u00f9Y\u0088K\u0007\u00e2\u008a\u00d6,:\u001c\u0017").length();
        int char1 = 16;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 47);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0200: {
                        if (length2 > 1) {
                            break Label_0200;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 8;
                                case 1 -> 127;
                                case 2 -> 57;
                                case 3 -> 52;
                                case 4 -> 86;
                                case 5 -> 104;
                                default -> 18;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                strArr2[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr = strArr2;
        strArr_1 = new String[2];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x7EE1) & 0xFFFF;
        if (Initializer_3.strArr_1[n3] == null) {
            final char[] charArray = Initializer_3.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 238;
                case 1 -> 109;
                case 2 -> 58;
                case 3 -> 204;
                case 4 -> 19;
                case 5 -> 195;
                case 6 -> 13;
                case 7 -> 0;
                case 8 -> 245;
                case 9 -> 26;
                case 10 -> 95;
                case 11 -> 31;
                case 12 -> 134;
                case 13 -> 178;
                case 14 -> 187;
                case 15 -> 194;
                case 16 -> 165;
                case 17 -> 123;
                case 18 -> 255;
                case 19 -> 142;
                case 20 -> 146;
                case 21 -> 87;
                case 22 -> 4;
                case 23 -> 132;
                case 24 -> 179;
                case 25 -> 44;
                case 26 -> 188;
                case 27 -> 181;
                case 28 -> 21;
                case 29 -> 18;
                case 30 -> 240;
                case 31 -> 164;
                case 32 -> 30;
                case 33 -> 85;
                case 34 -> 43;
                case 35 -> 206;
                case 36 -> 158;
                case 37 -> 205;
                case 38 -> 250;
                case 39 -> 220;
                case 40 -> 252;
                case 41 -> 74;
                case 42 -> 78;
                case 43 -> 148;
                case 44 -> 20;
                case 45 -> 183;
                case 46 -> 98;
                case 47 -> 112;
                case 48 -> 7;
                case 49 -> 12;
                case 50 -> 120;
                case 51 -> 79;
                case 52 -> 28;
                case 53 -> 137;
                case 54 -> 151;
                case 55 -> 171;
                case 56 -> 129;
                case 57 -> 133;
                case 58 -> 33;
                case 59 -> 227;
                case 60 -> 64;
                case 61 -> 149;
                case 62 -> 119;
                case 63 -> 154;
                case 64 -> 42;
                case 65 -> 29;
                case 66 -> 189;
                case 67 -> 56;
                case 68 -> 254;
                case 69 -> 152;
                case 70 -> 65;
                case 71 -> 170;
                case 72 -> 217;
                case 73 -> 83;
                case 74 -> 198;
                case 75 -> 233;
                case 76 -> 197;
                case 77 -> 167;
                case 78 -> 53;
                case 79 -> 232;
                case 80 -> 226;
                case 81 -> 15;
                case 82 -> 138;
                case 83 -> 81;
                case 84 -> 184;
                case 85 -> 38;
                case 86 -> 66;
                case 87 -> 202;
                case 88 -> 191;
                case 89 -> 193;
                case 90 -> 1;
                case 91 -> 185;
                case 92 -> 242;
                case 93 -> 166;
                case 94 -> 76;
                case 95 -> 86;
                case 96 -> 100;
                case 97 -> 99;
                case 98 -> 143;
                case 99 -> 139;
                case 100 -> 237;
                case 101 -> 107;
                case 102 -> 127;
                case 103 -> 176;
                case 104 -> 210;
                case 105 -> 50;
                case 106 -> 110;
                case 107 -> 213;
                case 108 -> 236;
                case 109 -> 103;
                case 110 -> 219;
                case 111 -> 14;
                case 112 -> 36;
                case 113 -> 93;
                case 114 -> 77;
                case 115 -> 218;
                case 116 -> 114;
                case 117 -> 35;
                case 118 -> 248;
                case 119 -> 214;
                case 120 -> 235;
                case 121 -> 208;
                case 122 -> 128;
                case 123 -> 51;
                case 124 -> 47;
                case 125 -> 168;
                case 126 -> 89;
                case 127 -> 46;
                case 128 -> 159;
                case 129 -> 209;
                case 130 -> 57;
                case 131 -> 60;
                case 132 -> 54;
                case 133 -> 73;
                case 134 -> 229;
                case 135 -> 39;
                case 136 -> 92;
                case 137 -> 201;
                case 138 -> 108;
                case 139 -> 97;
                case 140 -> 122;
                case 141 -> 153;
                case 142 -> 22;
                case 143 -> 225;
                case 144 -> 141;
                case 145 -> 82;
                case 146 -> 200;
                case 147 -> 147;
                case 148 -> 68;
                case 149 -> 3;
                case 150 -> 186;
                case 151 -> 161;
                case 152 -> 196;
                case 153 -> 140;
                case 154 -> 96;
                case 155 -> 136;
                case 156 -> 63;
                case 157 -> 222;
                case 158 -> 203;
                case 159 -> 37;
                case 160 -> 91;
                case 161 -> 101;
                case 162 -> 115;
                case 163 -> 224;
                case 164 -> 75;
                case 165 -> 113;
                case 166 -> 72;
                case 167 -> 2;
                case 168 -> 192;
                case 169 -> 9;
                case 170 -> 34;
                case 171 -> 48;
                case 172 -> 5;
                case 173 -> 234;
                case 174 -> 180;
                case 175 -> 88;
                case 176 -> 144;
                case 177 -> 24;
                case 178 -> 102;
                case 179 -> 62;
                case 180 -> 106;
                case 181 -> 90;
                case 182 -> 59;
                case 183 -> 41;
                case 184 -> 228;
                case 185 -> 69;
                case 186 -> 174;
                case 187 -> 16;
                case 188 -> 155;
                case 189 -> 247;
                case 190 -> 212;
                case 191 -> 249;
                case 192 -> 117;
                case 193 -> 10;
                case 194 -> 172;
                case 195 -> 223;
                case 196 -> 135;
                case 197 -> 80;
                case 198 -> 190;
                case 199 -> 211;
                case 200 -> 160;
                case 201 -> 177;
                case 202 -> 49;
                case 203 -> 173;
                case 204 -> 45;
                case 205 -> 8;
                case 206 -> 246;
                case 207 -> 111;
                case 208 -> 6;
                case 209 -> 116;
                case 210 -> 61;
                case 211 -> 145;
                case 212 -> 25;
                case 213 -> 216;
                case 214 -> 67;
                case 215 -> 150;
                case 216 -> 243;
                case 217 -> 244;
                case 218 -> 130;
                case 219 -> 241;
                case 220 -> 70;
                case 221 -> 131;
                case 222 -> 157;
                case 223 -> 84;
                case 224 -> 231;
                case 225 -> 163;
                case 226 -> 162;
                case 227 -> 239;
                case 228 -> 230;
                case 229 -> 71;
                case 230 -> 105;
                case 231 -> 221;
                case 232 -> 169;
                case 233 -> 23;
                case 234 -> 104;
                case 235 -> 199;
                case 236 -> 32;
                case 237 -> 207;
                case 238 -> 124;
                case 239 -> 253;
                case 240 -> 118;
                case 241 -> 156;
                case 242 -> 121;
                case 243 -> 17;
                case 244 -> 125;
                case 245 -> 27;
                case 246 -> 52;
                case 247 -> 126;
                case 248 -> 251;
                case 249 -> 182;
                case 250 -> 175;
                case 251 -> 55;
                case 252 -> 215;
                case 253 -> 40;
                case 254 -> 94;
                default -> 11;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < '\0') {
                n6 += '\u0100';
            }
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            if (n7 < '\0') {
                n7 += '\u0100';
            }
            for (int i = 0; i < charArray.length; ++i) {
                final int n8 = i % 2;
                final char[] array = charArray;
                final int n9 = i;
                final char c = array[n9];
                if (n8 == 0) {
                    array[n9] = (char)(c ^ n6);
                    n6 = (((n6 >>> 3 | n6 << 5) ^ charArray[i]) & 0xFF);
                }
                else {
                    array[n9] = (char)(c ^ n7);
                    n7 = (((n7 >>> 3 | n7 << 5) ^ charArray[i]) & 0xFF);
                }
            }
            Initializer_3.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_3.strArr_1[n3];
    }
}
