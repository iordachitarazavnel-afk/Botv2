// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.util.Random;

public class Initializer_6
{
    private static final Random random;
    public final double doubleValue;
    public final double doubleValue_1;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_6(final double doubleValue, final double doubleValue_1) {
        if (doubleValue > doubleValue_1) {
            throw new IllegalArgumentException(createString(18271, 26705));
        }
        this.doubleValue = doubleValue;
        this.doubleValue_1 = doubleValue_1;
    }
    
    public double getDouble() {
        try {
            if (this.doubleValue == this.doubleValue_1) {
                return this.doubleValue;
            }
        }
        catch (final IllegalArgumentException ex) {
            throw computeIllegalargumentexception(ex);
        }
        return this.doubleValue + (this.doubleValue_1 - this.doubleValue) * Initializer_6.random.nextDouble();
    }
    
    public double getDouble_1() {
        return this.doubleValue;
    }
    
    public double getDouble_2() {
        return this.doubleValue_1;
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
        //    16: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_6.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    19: athrow         
        //    20: iconst_1       
        //    21: ireturn        
        //    22: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_6.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    25: athrow         
        //    26: aload_1        
        //    27: ifnull          59
        //    30: aload_0        
        //    31: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    34: iload_2        
        //    35: ifne            66
        //    38: goto            45
        //    41: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_6.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    44: athrow         
        //    45: aload_1        
        //    46: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    49: if_acmpeq       65
        //    52: goto            59
        //    55: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_6.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    58: athrow         
        //    59: iconst_0       
        //    60: ireturn        
        //    61: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_6.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    64: athrow         
        //    65: aload_1        
        //    66: checkcast       Lcom/target/mod/compat/sub1/sub1/sub7/Initializer_6;
        //    69: astore_3       
        //    70: aload_3        
        //    71: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_6.doubleValue:D
        //    74: aload_0        
        //    75: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_6.doubleValue:D
        //    78: invokestatic    java/lang/Double.compare:(DD)I
        //    81: iload_2        
        //    82: ifne            113
        //    85: ifne            131
        //    88: goto            95
        //    91: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_6.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //    94: athrow         
        //    95: aload_3        
        //    96: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_6.doubleValue_1:D
        //    99: aload_0        
        //   100: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_6.doubleValue_1:D
        //   103: invokestatic    java/lang/Double.compare:(DD)I
        //   106: goto            113
        //   109: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_6.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //   112: athrow         
        //   113: iload_2        
        //   114: ifne            128
        //   117: ifne            131
        //   120: goto            127
        //   123: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_6.computeIllegalargumentexception:(Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
        //   126: athrow         
        //   127: iconst_1       
        //   128: goto            132
        //   131: iconst_0       
        //   132: ireturn        
        //    StackMapTable: 00 15 FF 00 10 00 03 07 00 02 07 00 04 01 00 01 07 00 14 03 41 07 00 14 03 40 07 00 04 4D 07 00 14 43 07 00 3C 49 07 00 14 03 41 07 00 14 03 40 07 00 04 FF 00 18 00 04 07 00 02 07 00 04 01 07 00 02 00 01 07 00 14 03 4D 07 00 14 43 01 49 07 00 14 03 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      13     16     20     Ljava/lang/IllegalArgumentException;
        //  9      22     22     26     Ljava/lang/IllegalArgumentException;
        //  27     38     41     45     Ljava/lang/IllegalArgumentException;
        //  30     52     55     59     Ljava/lang/IllegalArgumentException;
        //  45     61     61     65     Ljava/lang/IllegalArgumentException;
        //  70     88     91     95     Ljava/lang/IllegalArgumentException;
        //  85     106    109    113    Ljava/lang/IllegalArgumentException;
        //  113    120    123    127    Ljava/lang/IllegalArgumentException;
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
        return (int)(31L * Double.doubleToLongBits(this.doubleValue) + Double.doubleToLongBits(this.doubleValue_1));
    }
    
    @Override
    public String toString() {
        return String.format(createString(18270, 28872), this.doubleValue, this.doubleValue_1);
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u001eQcbHP\u0007\u00f3»¯\u00f1A\u0006\u00d1\u00cd21\u00f2\u0096\t¦¶\u00e5¡-\u00edt\u008e\u0007BQo¶zI6\u009b\u00ed\u001a\u0098\"M\u000b\u00cak\u00c0\u00cc½Gi\u0084\u00f8\t¾").length();
        int char1 = 42;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 76);
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
                                case 0 -> 46;
                                case 1 -> 60;
                                case 2 -> 42;
                                case 3 -> 110;
                                case 4 -> 113;
                                case 5 -> 81;
                                default -> 49;
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
        final int n3 = (n ^ 0x475F) & 0xFFFF;
        if (Initializer_6.strArr_1[n3] == null) {
            final char[] charArray = Initializer_6.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 44;
                case 1 -> 28;
                case 2 -> 137;
                case 3 -> 193;
                case 4 -> 179;
                case 5 -> 174;
                case 6 -> 21;
                case 7 -> 131;
                case 8 -> 122;
                case 9 -> 163;
                case 10 -> 209;
                case 11 -> 105;
                case 12 -> 15;
                case 13 -> 10;
                case 14 -> 29;
                case 15 -> 132;
                case 16 -> 34;
                case 17 -> 136;
                case 18 -> 1;
                case 19 -> 203;
                case 20 -> 146;
                case 21 -> 168;
                case 22 -> 201;
                case 23 -> 156;
                case 24 -> 184;
                case 25 -> 35;
                case 26 -> 161;
                case 27 -> 37;
                case 28 -> 188;
                case 29 -> 196;
                case 30 -> 2;
                case 31 -> 72;
                case 32 -> 42;
                case 33 -> 226;
                case 34 -> 84;
                case 35 -> 67;
                case 36 -> 182;
                case 37 -> 90;
                case 38 -> 61;
                case 39 -> 30;
                case 40 -> 242;
                case 41 -> 244;
                case 42 -> 127;
                case 43 -> 85;
                case 44 -> 222;
                case 45 -> 173;
                case 46 -> 19;
                case 47 -> 175;
                case 48 -> 92;
                case 49 -> 206;
                case 50 -> 103;
                case 51 -> 235;
                case 52 -> 202;
                case 53 -> 241;
                case 54 -> 24;
                case 55 -> 102;
                case 56 -> 80;
                case 57 -> 12;
                case 58 -> 233;
                case 59 -> 245;
                case 60 -> 8;
                case 61 -> 23;
                case 62 -> 120;
                case 63 -> 240;
                case 64 -> 114;
                case 65 -> 159;
                case 66 -> 96;
                case 67 -> 88;
                case 68 -> 3;
                case 69 -> 158;
                case 70 -> 143;
                case 71 -> 87;
                case 72 -> 113;
                case 73 -> 66;
                case 74 -> 236;
                case 75 -> 171;
                case 76 -> 50;
                case 77 -> 199;
                case 78 -> 166;
                case 79 -> 249;
                case 80 -> 40;
                case 81 -> 82;
                case 82 -> 128;
                case 83 -> 254;
                case 84 -> 150;
                case 85 -> 185;
                case 86 -> 252;
                case 87 -> 116;
                case 88 -> 162;
                case 89 -> 115;
                case 90 -> 83;
                case 91 -> 52;
                case 92 -> 49;
                case 93 -> 204;
                case 94 -> 68;
                case 95 -> 58;
                case 96 -> 243;
                case 97 -> 212;
                case 98 -> 77;
                case 99 -> 70;
                case 100 -> 5;
                case 101 -> 155;
                case 102 -> 7;
                case 103 -> 134;
                case 104 -> 4;
                case 105 -> 218;
                case 106 -> 123;
                case 107 -> 213;
                case 108 -> 64;
                case 109 -> 39;
                case 110 -> 234;
                case 111 -> 97;
                case 112 -> 109;
                case 113 -> 104;
                case 114 -> 45;
                case 115 -> 9;
                case 116 -> 152;
                case 117 -> 211;
                case 118 -> 214;
                case 119 -> 118;
                case 120 -> 178;
                case 121 -> 94;
                case 122 -> 0;
                case 123 -> 26;
                case 124 -> 32;
                case 125 -> 89;
                case 126 -> 141;
                case 127 -> 177;
                case 128 -> 225;
                case 129 -> 142;
                case 130 -> 183;
                case 131 -> 14;
                case 132 -> 47;
                case 133 -> 117;
                case 134 -> 16;
                case 135 -> 138;
                case 136 -> 38;
                case 137 -> 215;
                case 138 -> 48;
                case 139 -> 170;
                case 140 -> 190;
                case 141 -> 139;
                case 142 -> 220;
                case 143 -> 169;
                case 144 -> 25;
                case 145 -> 217;
                case 146 -> 125;
                case 147 -> 147;
                case 148 -> 194;
                case 149 -> 126;
                case 150 -> 76;
                case 151 -> 232;
                case 152 -> 69;
                case 153 -> 74;
                case 154 -> 73;
                case 155 -> 86;
                case 156 -> 57;
                case 157 -> 221;
                case 158 -> 135;
                case 159 -> 239;
                case 160 -> 46;
                case 161 -> 197;
                case 162 -> 130;
                case 163 -> 153;
                case 164 -> 231;
                case 165 -> 154;
                case 166 -> 144;
                case 167 -> 106;
                case 168 -> 59;
                case 169 -> 99;
                case 170 -> 176;
                case 171 -> 20;
                case 172 -> 192;
                case 173 -> 60;
                case 174 -> 187;
                case 175 -> 157;
                case 176 -> 81;
                case 177 -> 149;
                case 178 -> 54;
                case 179 -> 250;
                case 180 -> 223;
                case 181 -> 91;
                case 182 -> 237;
                case 183 -> 6;
                case 184 -> 191;
                case 185 -> 228;
                case 186 -> 43;
                case 187 -> 95;
                case 188 -> 216;
                case 189 -> 110;
                case 190 -> 195;
                case 191 -> 121;
                case 192 -> 253;
                case 193 -> 167;
                case 194 -> 100;
                case 195 -> 41;
                case 196 -> 208;
                case 197 -> 165;
                case 198 -> 107;
                case 199 -> 111;
                case 200 -> 124;
                case 201 -> 53;
                case 202 -> 186;
                case 203 -> 145;
                case 204 -> 75;
                case 205 -> 210;
                case 206 -> 164;
                case 207 -> 227;
                case 208 -> 36;
                case 209 -> 13;
                case 210 -> 17;
                case 211 -> 119;
                case 212 -> 255;
                case 213 -> 246;
                case 214 -> 219;
                case 215 -> 98;
                case 216 -> 93;
                case 217 -> 251;
                case 218 -> 112;
                case 219 -> 71;
                case 220 -> 224;
                case 221 -> 140;
                case 222 -> 51;
                case 223 -> 101;
                case 224 -> 160;
                case 225 -> 230;
                case 226 -> 18;
                case 227 -> 79;
                case 228 -> 151;
                case 229 -> 63;
                case 230 -> 181;
                case 231 -> 133;
                case 232 -> 62;
                case 233 -> 207;
                case 234 -> 198;
                case 235 -> 27;
                case 236 -> 205;
                case 237 -> 108;
                case 238 -> 238;
                case 239 -> 172;
                case 240 -> 11;
                case 241 -> 55;
                case 242 -> 56;
                case 243 -> 33;
                case 244 -> 148;
                case 245 -> 229;
                case 246 -> 200;
                case 247 -> 78;
                case 248 -> 247;
                case 249 -> 65;
                case 250 -> 248;
                case 251 -> 189;
                case 252 -> 129;
                case 253 -> 22;
                case 254 -> 180;
                default -> 31;
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
            Initializer_6.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_6.strArr_1[n3];
    }
}
