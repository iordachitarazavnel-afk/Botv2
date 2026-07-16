// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.util.Random;

public class Initializer_3
{
    private static final Random random;
    public final int intValue;
    public final int intValue_1;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_3(final int intValue, final int intValue_1) {
        if (intValue > intValue_1) {
            throw new IllegalArgumentException(createString(14759, 13699));
        }
        this.intValue = intValue;
        this.intValue_1 = intValue_1;
    }
    
    public int getInt() {
        try {
            if (this.intValue == this.intValue_1) {
                return this.intValue;
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
        return Initializer_3.random.nextInt(this.intValue_1 - this.intValue + 1) + this.intValue;
    }
    
    public int getInt_1() {
        return this.intValue;
    }
    
    public int getInt_2() {
        return this.intValue_1;
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: iload_2        
        //     6: ifne            27
        //     9: aload_1        
        //    10: if_acmpne       26
        //    13: goto            20
        //    16: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_3.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    19: athrow         
        //    20: iconst_1       
        //    21: ireturn        
        //    22: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_3.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    25: athrow         
        //    26: aload_1        
        //    27: ifnull          59
        //    30: aload_0        
        //    31: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    34: iload_2        
        //    35: ifne            66
        //    38: goto            45
        //    41: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_3.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    44: athrow         
        //    45: aload_1        
        //    46: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    49: if_acmpeq       65
        //    52: goto            59
        //    55: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_3.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    58: athrow         
        //    59: iconst_0       
        //    60: ireturn        
        //    61: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_3.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    64: athrow         
        //    65: aload_1        
        //    66: checkcast       Lcom/target/mod/compat/sub1/sub1/sub7/Initializer_3;
        //    69: astore_3       
        //    70: aload_0        
        //    71: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_3.intValue:I
        //    74: aload_3        
        //    75: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_3.intValue:I
        //    78: iload_2        
        //    79: ifne            118
        //    82: if_icmpne       125
        //    85: goto            92
        //    88: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_3.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    91: athrow         
        //    92: aload_0        
        //    93: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_3.intValue_1:I
        //    96: iload_2        
        //    97: ifne            122
        //   100: goto            107
        //   103: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_3.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //   106: athrow         
        //   107: aload_3        
        //   108: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_3.intValue_1:I
        //   111: goto            118
        //   114: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_3.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //   117: athrow         
        //   118: if_icmpne       125
        //   121: iconst_1       
        //   122: goto            126
        //   125: iconst_0       
        //   126: ireturn        
        //    StackMapTable: 00 15 FF 00 10 00 03 07 00 02 07 00 04 01 00 01 07 00 14 03 41 07 00 14 03 40 07 00 04 4D 07 00 14 43 07 00 3B 49 07 00 14 03 41 07 00 14 03 40 07 00 04 FF 00 15 00 04 07 00 02 07 00 04 01 07 00 02 00 01 07 00 14 03 4A 07 00 14 43 01 46 07 00 14 FF 00 03 00 04 07 00 02 07 00 04 01 07 00 02 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      13     16     20     Ljava/lang/IllegalArgumentException;
        //  9      22     22     26     Ljava/lang/IllegalArgumentException;
        //  27     38     41     45     Ljava/lang/IllegalArgumentException;
        //  30     52     55     59     Ljava/lang/IllegalArgumentException;
        //  45     61     61     65     Ljava/lang/IllegalArgumentException;
        //  70     85     88     92     Ljava/lang/IllegalArgumentException;
        //  82     100    103    107    Ljava/lang/IllegalArgumentException;
        //  92     111    114    118    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    @Override
    public int hashCode() {
        return 31 * this.intValue + this.intValue_1;
    }
    
    @Override
    public String toString() {
        return this.intValue + createString(14758, -3869) + this.intValue_1;
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u0002\u009b\u00fd\u00e4\u0083\u00c3\u00ca©T\u00f9\u00d3\u0093\u0001?\u0005¹5\\\u000e\u009f\u0001LG\u00e3¦½F0i\u00c3\u0081\u0080´\u00c4½\u00c9S\u000f\u00dc\u00dc¹q\u0003Q^\u0019").length();
        int char1 = 42;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 12);
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
                                case 0 -> 79;
                                case 1 -> 64;
                                case 2 -> 83;
                                case 3 -> 118;
                                case 4 -> 14;
                                case 5 -> 89;
                                default -> 34;
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
        random = new Random();
    }
    
    private static IllegalArgumentException computeIllegalargumentexception(final IllegalArgumentException ex) {
        return ex;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x39A7) & 0xFFFF;
        if (Initializer_3.strArr_1[n3] == null) {
            final char[] charArray = Initializer_3.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 224;
                case 1 -> 153;
                case 2 -> 254;
                case 3 -> 121;
                case 4 -> 189;
                case 5 -> 134;
                case 6 -> 251;
                case 7 -> 230;
                case 8 -> 136;
                case 9 -> 140;
                case 10 -> 139;
                case 11 -> 247;
                case 12 -> 110;
                case 13 -> 67;
                case 14 -> 69;
                case 15 -> 2;
                case 16 -> 192;
                case 17 -> 108;
                case 18 -> 177;
                case 19 -> 103;
                case 20 -> 30;
                case 21 -> 116;
                case 22 -> 149;
                case 23 -> 117;
                case 24 -> 249;
                case 25 -> 71;
                case 26 -> 135;
                case 27 -> 203;
                case 28 -> 207;
                case 29 -> 63;
                case 30 -> 166;
                case 31 -> 46;
                case 32 -> 160;
                case 33 -> 127;
                case 34 -> 79;
                case 35 -> 126;
                case 36 -> 141;
                case 37 -> 100;
                case 38 -> 16;
                case 39 -> 216;
                case 40 -> 55;
                case 41 -> 17;
                case 42 -> 124;
                case 43 -> 179;
                case 44 -> 87;
                case 45 -> 234;
                case 46 -> 170;
                case 47 -> 34;
                case 48 -> 186;
                case 49 -> 65;
                case 50 -> 178;
                case 51 -> 123;
                case 52 -> 188;
                case 53 -> 64;
                case 54 -> 35;
                case 55 -> 193;
                case 56 -> 62;
                case 57 -> 74;
                case 58 -> 255;
                case 59 -> 12;
                case 60 -> 8;
                case 61 -> 147;
                case 62 -> 131;
                case 63 -> 148;
                case 64 -> 104;
                case 65 -> 119;
                case 66 -> 142;
                case 67 -> 72;
                case 68 -> 223;
                case 69 -> 228;
                case 70 -> 168;
                case 71 -> 58;
                case 72 -> 154;
                case 73 -> 61;
                case 74 -> 231;
                case 75 -> 183;
                case 76 -> 219;
                case 77 -> 205;
                case 78 -> 105;
                case 79 -> 42;
                case 80 -> 243;
                case 81 -> 162;
                case 82 -> 210;
                case 83 -> 5;
                case 84 -> 200;
                case 85 -> 130;
                case 86 -> 20;
                case 87 -> 113;
                case 88 -> 146;
                case 89 -> 252;
                case 90 -> 236;
                case 91 -> 155;
                case 92 -> 36;
                case 93 -> 43;
                case 94 -> 0;
                case 95 -> 215;
                case 96 -> 172;
                case 97 -> 7;
                case 98 -> 226;
                case 99 -> 85;
                case 100 -> 211;
                case 101 -> 227;
                case 102 -> 106;
                case 103 -> 145;
                case 104 -> 143;
                case 105 -> 90;
                case 106 -> 13;
                case 107 -> 39;
                case 108 -> 80;
                case 109 -> 97;
                case 110 -> 4;
                case 111 -> 24;
                case 112 -> 47;
                case 113 -> 190;
                case 114 -> 181;
                case 115 -> 238;
                case 116 -> 208;
                case 117 -> 92;
                case 118 -> 125;
                case 119 -> 76;
                case 120 -> 246;
                case 121 -> 237;
                case 122 -> 25;
                case 123 -> 59;
                case 124 -> 163;
                case 125 -> 199;
                case 126 -> 191;
                case 127 -> 138;
                case 128 -> 217;
                case 129 -> 68;
                case 130 -> 206;
                case 131 -> 60;
                case 132 -> 197;
                case 133 -> 114;
                case 134 -> 159;
                case 135 -> 66;
                case 136 -> 248;
                case 137 -> 180;
                case 138 -> 27;
                case 139 -> 120;
                case 140 -> 21;
                case 141 -> 98;
                case 142 -> 250;
                case 143 -> 240;
                case 144 -> 93;
                case 145 -> 19;
                case 146 -> 115;
                case 147 -> 195;
                case 148 -> 235;
                case 149 -> 201;
                case 150 -> 70;
                case 151 -> 194;
                case 152 -> 29;
                case 153 -> 1;
                case 154 -> 11;
                case 155 -> 111;
                case 156 -> 157;
                case 157 -> 51;
                case 158 -> 89;
                case 159 -> 253;
                case 160 -> 94;
                case 161 -> 128;
                case 162 -> 245;
                case 163 -> 167;
                case 164 -> 176;
                case 165 -> 164;
                case 166 -> 9;
                case 167 -> 133;
                case 168 -> 14;
                case 169 -> 150;
                case 170 -> 52;
                case 171 -> 95;
                case 172 -> 158;
                case 173 -> 196;
                case 174 -> 41;
                case 175 -> 37;
                case 176 -> 118;
                case 177 -> 53;
                case 178 -> 137;
                case 179 -> 213;
                case 180 -> 48;
                case 181 -> 107;
                case 182 -> 174;
                case 183 -> 15;
                case 184 -> 209;
                case 185 -> 161;
                case 186 -> 22;
                case 187 -> 132;
                case 188 -> 18;
                case 189 -> 241;
                case 190 -> 32;
                case 191 -> 99;
                case 192 -> 82;
                case 193 -> 156;
                case 194 -> 40;
                case 195 -> 173;
                case 196 -> 218;
                case 197 -> 212;
                case 198 -> 225;
                case 199 -> 84;
                case 200 -> 10;
                case 201 -> 122;
                case 202 -> 239;
                case 203 -> 229;
                case 204 -> 45;
                case 205 -> 26;
                case 206 -> 101;
                case 207 -> 182;
                case 208 -> 232;
                case 209 -> 86;
                case 210 -> 44;
                case 211 -> 185;
                case 212 -> 112;
                case 213 -> 220;
                case 214 -> 77;
                case 215 -> 31;
                case 216 -> 171;
                case 217 -> 83;
                case 218 -> 244;
                case 219 -> 88;
                case 220 -> 3;
                case 221 -> 49;
                case 222 -> 151;
                case 223 -> 33;
                case 224 -> 242;
                case 225 -> 222;
                case 226 -> 75;
                case 227 -> 91;
                case 228 -> 233;
                case 229 -> 165;
                case 230 -> 221;
                case 231 -> 57;
                case 232 -> 23;
                case 233 -> 184;
                case 234 -> 50;
                case 235 -> 109;
                case 236 -> 81;
                case 237 -> 102;
                case 238 -> 54;
                case 239 -> 169;
                case 240 -> 129;
                case 241 -> 96;
                case 242 -> 202;
                case 243 -> 73;
                case 244 -> 38;
                case 245 -> 204;
                case 246 -> 144;
                case 247 -> 28;
                case 248 -> 152;
                case 249 -> 6;
                case 250 -> 78;
                case 251 -> 56;
                case 252 -> 214;
                case 253 -> 187;
                case 254 -> 198;
                default -> 175;
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
