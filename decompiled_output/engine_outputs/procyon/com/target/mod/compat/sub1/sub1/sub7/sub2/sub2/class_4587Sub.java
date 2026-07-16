// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub2.sub2;

import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_4587$class_4665;
import org.joml.Matrix3fc;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import net.minecraft.class_4587;

public class class_4587Sub extends class_4587
{
    private static final MethodHandle methodHandle;
    private final ObjectArrayList<RecordSub> objectArrayList;
    private RecordSub linkD;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public class_4587Sub() {
        (this.objectArrayList = (ObjectArrayList<RecordSub>)new ObjectArrayList(8)).add((Object)(this.linkD = new RecordSub(new Matrix4f(), new Matrix3f())));
    }
    
    public void method_46416(final float n, final float n2, final float n3) {
        this.linkD.matrix4f.translate(n, n2, n3);
    }
    
    public void method_22905(final float p0, final float p1, final float p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: getfield        com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/class_4587Sub.linkD:Lcom/target/mod/compat/sub1/sub1/sub7/sub2/sub2/RecordSub;
        //     7: getfield        com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/RecordSub.matrix4f:Lorg/joml/Matrix4f;
        //    10: fload_1        
        //    11: fload_2        
        //    12: fload_3        
        //    13: invokevirtual   org/joml/Matrix4f.scale:(FFF)Lorg/joml/Matrix4f;
        //    16: pop            
        //    17: astore          4
        //    19: fload_1        
        //    20: fload_2        
        //    21: aload           4
        //    23: ifnonnull       100
        //    26: fcmpl          
        //    27: ifne            98
        //    30: goto            37
        //    33: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/class_4587Sub.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    36: athrow         
        //    37: fload_2        
        //    38: fload_3        
        //    39: aload           4
        //    41: ifnonnull       100
        //    44: goto            51
        //    47: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/class_4587Sub.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    50: athrow         
        //    51: fcmpl          
        //    52: ifne            98
        //    55: goto            62
        //    58: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/class_4587Sub.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    61: athrow         
        //    62: fload_1        
        //    63: fconst_0       
        //    64: fcmpl          
        //    65: ifeq            97
        //    68: goto            75
        //    71: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/class_4587Sub.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    74: athrow         
        //    75: aload_0        
        //    76: getfield        com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/class_4587Sub.linkD:Lcom/target/mod/compat/sub1/sub1/sub7/sub2/sub2/RecordSub;
        //    79: getfield        com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/RecordSub.matrix3f:Lorg/joml/Matrix3f;
        //    82: fload_1        
        //    83: invokestatic    java/lang/Math.signum:(F)F
        //    86: invokevirtual   org/joml/Matrix3f.scale:(F)Lorg/joml/Matrix3f;
        //    89: pop            
        //    90: goto            97
        //    93: invokestatic    com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/class_4587Sub.computeIllegalstateexception:(Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
        //    96: athrow         
        //    97: return         
        //    98: fconst_1       
        //    99: fload_1        
        //   100: fdiv           
        //   101: fstore          5
        //   103: fconst_1       
        //   104: fload_2        
        //   105: fdiv           
        //   106: fstore          6
        //   108: fconst_1       
        //   109: fload_3        
        //   110: fdiv           
        //   111: fstore          7
        //   113: dconst_1       
        //   114: fload           5
        //   116: fload           6
        //   118: fmul           
        //   119: fload           7
        //   121: fmul           
        //   122: f2d            
        //   123: invokestatic    java/lang/Math.cbrt:(D)D
        //   126: ddiv           
        //   127: d2f            
        //   128: fstore          8
        //   130: aload_0        
        //   131: getfield        com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/class_4587Sub.linkD:Lcom/target/mod/compat/sub1/sub1/sub7/sub2/sub2/RecordSub;
        //   134: getfield        com/target/mod/compat/sub1/sub1/sub7/sub2/sub2/RecordSub.matrix3f:Lorg/joml/Matrix3f;
        //   137: fload           8
        //   139: fload           5
        //   141: fmul           
        //   142: fload           8
        //   144: fload           6
        //   146: fmul           
        //   147: fload           8
        //   149: fload           7
        //   151: fmul           
        //   152: invokevirtual   org/joml/Matrix3f.scale:(FFF)Lorg/joml/Matrix3f;
        //   155: pop            
        //   156: return         
        //    StackMapTable: 00 0C FF 00 21 00 05 07 00 02 02 02 02 07 00 43 00 01 07 00 38 03 49 07 00 38 FF 00 03 00 05 07 00 02 02 02 02 07 00 43 00 02 02 02 46 07 00 38 03 48 07 00 38 03 51 07 00 38 03 00 FF 00 01 00 04 07 00 02 00 02 02 00 02 02 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  19     30     33     37     Ljava/lang/IllegalStateException;
        //  26     44     47     51     Ljava/lang/IllegalStateException;
        //  37     55     58     62     Ljava/lang/IllegalStateException;
        //  51     68     71     75     Ljava/lang/IllegalStateException;
        //  62     90     93     97     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    public void method_22907(final Quaternionfc quaternionfc) {
        this.linkD.matrix4f.rotate(quaternionfc);
        this.linkD.matrix3f.rotate(quaternionfc);
    }
    
    public void method_49278(final Quaternionfc quaternionfc, final float n, final float n2, final float n3) {
        this.linkD.matrix4f.rotateAround(quaternionfc, n, n2, n3);
        this.linkD.matrix3f.rotate(quaternionfc);
    }
    
    public void method_34425(final Matrix4fc matrix4fc) {
        this.linkD.matrix4f.mul(matrix4fc);
    }
    
    public void method_22903() {
        this.objectArrayList.add((Object)(this.linkD = new RecordSub(new Matrix4f((Matrix4fc)this.linkD.matrix4f), new Matrix3f((Matrix3fc)this.linkD.matrix3f))));
    }
    
    public void method_22909() {
        final String string = Initializer_2.getString();
        Label_0054: {
            Label_0026: {
                ObjectArrayList<RecordSub> objectArrayList;
                try {
                    objectArrayList = this.objectArrayList;
                    if (string != null) {
                        break Label_0054;
                    }
                    final int n = objectArrayList.size();
                    final int n2 = 1;
                    if (n == n2) {
                        break Label_0026;
                    }
                    break Label_0026;
                }
                catch (final IllegalStateException ex) {
                    throw computeIllegalstateexception(ex);
                }
                try {
                    final int n = objectArrayList.size();
                    final int n2 = 1;
                    if (n == n2) {
                        throw new IllegalStateException(createString(17959, -29443));
                    }
                }
                catch (final IllegalStateException ex2) {
                    throw computeIllegalstateexception(ex2);
                }
            }
            this.objectArrayList.pop();
        }
        this.linkD = (RecordSub)this.objectArrayList.top();
    }
    
    public class_4587$class_4665 method_23760() {
        try {
            return class_4587Sub.methodHandle.invoke(this.linkD.matrix4f, this.linkD.matrix3f);
        }
        catch (final Throwable cause) {
            throw new RuntimeException(createString(17958, -6117), cause);
        }
    }
    
    public boolean method_67795() {
        try {
            if (this.objectArrayList.size() == 1) {
                return true;
            }
        }
        catch (final IllegalStateException ex) {
            throw computeIllegalstateexception(ex);
        }
        return false;
    }
    
    public void method_34426() {
        this.linkD.matrix4f.identity();
        this.linkD.matrix3f.identity();
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u00da\u0002c_\u00f5\f\u00cb/n\u00e0\u0018\u00eeS\u008d\u008b\n\u0088\u00fb\u00cc\u00ad>\u0010\u00db\u00eeB\u001d·\u001d°\u00983\u0094\u000bwº\u00ed\u00eb\u0006\u00cf\u001cd\u00ff\u00f4\u0094\u001e\u00d3\u00dc·\u008c\u00f3]\u008d\u00c7\u008f\u00d5\u00e7\b\u0004\u00f0[6^@1f\u00e27\u00e6").length();
        int char1 = 39;
        int index = -1;
        Label_0022: {
            break Label_0022;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 77);
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
                                case 0 -> 82;
                                case 1 -> 126;
                                case 2 -> 113;
                                case 3 -> 21;
                                case 4 -> 114;
                                case 5 -> 36;
                                default -> 54;
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
        try {
            methodHandle = MethodHandles.privateLookupIn(class_4587$class_4665.class, MethodHandles.lookup()).findConstructor(class_4587$class_4665.class, MethodType.methodType(Void.TYPE, Matrix4f.class, Matrix3f.class));
        }
        catch (final IllegalAccessException | NoSuchMethodException cause) {
            throw new RuntimeException((Throwable)cause);
        }
    }
    
    private static IllegalStateException computeIllegalstateexception(final IllegalStateException ex) {
        return ex;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x4626) & 0xFFFF;
        if (class_4587Sub.strArr_1[n3] == null) {
            final char[] charArray = class_4587Sub.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 16;
                case 1 -> 124;
                case 2 -> 207;
                case 3 -> 187;
                case 4 -> 174;
                case 5 -> 122;
                case 6 -> 218;
                case 7 -> 68;
                case 8 -> 143;
                case 9 -> 59;
                case 10 -> 161;
                case 11 -> 15;
                case 12 -> 139;
                case 13 -> 13;
                case 14 -> 158;
                case 15 -> 17;
                case 16 -> 115;
                case 17 -> 97;
                case 18 -> 209;
                case 19 -> 149;
                case 20 -> 155;
                case 21 -> 76;
                case 22 -> 8;
                case 23 -> 212;
                case 24 -> 96;
                case 25 -> 191;
                case 26 -> 134;
                case 27 -> 153;
                case 28 -> 205;
                case 29 -> 51;
                case 30 -> 129;
                case 31 -> 119;
                case 32 -> 249;
                case 33 -> 145;
                case 34 -> 90;
                case 35 -> 229;
                case 36 -> 93;
                case 37 -> 228;
                case 38 -> 12;
                case 39 -> 232;
                case 40 -> 178;
                case 41 -> 226;
                case 42 -> 49;
                case 43 -> 182;
                case 44 -> 47;
                case 45 -> 116;
                case 46 -> 140;
                case 47 -> 180;
                case 48 -> 120;
                case 49 -> 41;
                case 50 -> 104;
                case 51 -> 166;
                case 52 -> 216;
                case 53 -> 133;
                case 54 -> 101;
                case 55 -> 0;
                case 56 -> 11;
                case 57 -> 117;
                case 58 -> 240;
                case 59 -> 3;
                case 60 -> 40;
                case 61 -> 62;
                case 62 -> 1;
                case 63 -> 154;
                case 64 -> 102;
                case 65 -> 202;
                case 66 -> 29;
                case 67 -> 220;
                case 68 -> 183;
                case 69 -> 204;
                case 70 -> 28;
                case 71 -> 71;
                case 72 -> 86;
                case 73 -> 203;
                case 74 -> 74;
                case 75 -> 44;
                case 76 -> 242;
                case 77 -> 95;
                case 78 -> 121;
                case 79 -> 192;
                case 80 -> 148;
                case 81 -> 103;
                case 82 -> 22;
                case 83 -> 151;
                case 84 -> 241;
                case 85 -> 172;
                case 86 -> 217;
                case 87 -> 159;
                case 88 -> 112;
                case 89 -> 224;
                case 90 -> 215;
                case 91 -> 46;
                case 92 -> 225;
                case 93 -> 55;
                case 94 -> 33;
                case 95 -> 163;
                case 96 -> 126;
                case 97 -> 110;
                case 98 -> 99;
                case 99 -> 25;
                case 100 -> 70;
                case 101 -> 24;
                case 102 -> 164;
                case 103 -> 5;
                case 104 -> 88;
                case 105 -> 230;
                case 106 -> 214;
                case 107 -> 109;
                case 108 -> 150;
                case 109 -> 30;
                case 110 -> 146;
                case 111 -> 105;
                case 112 -> 98;
                case 113 -> 85;
                case 114 -> 176;
                case 115 -> 137;
                case 116 -> 92;
                case 117 -> 185;
                case 118 -> 118;
                case 119 -> 27;
                case 120 -> 69;
                case 121 -> 2;
                case 122 -> 45;
                case 123 -> 206;
                case 124 -> 189;
                case 125 -> 234;
                case 126 -> 36;
                case 127 -> 211;
                case 128 -> 20;
                case 129 -> 34;
                case 130 -> 113;
                case 131 -> 23;
                case 132 -> 65;
                case 133 -> 63;
                case 134 -> 131;
                case 135 -> 127;
                case 136 -> 128;
                case 137 -> 54;
                case 138 -> 106;
                case 139 -> 167;
                case 140 -> 186;
                case 141 -> 111;
                case 142 -> 173;
                case 143 -> 58;
                case 144 -> 197;
                case 145 -> 89;
                case 146 -> 193;
                case 147 -> 48;
                case 148 -> 32;
                case 149 -> 194;
                case 150 -> 78;
                case 151 -> 75;
                case 152 -> 210;
                case 153 -> 72;
                case 154 -> 83;
                case 155 -> 26;
                case 156 -> 60;
                case 157 -> 254;
                case 158 -> 114;
                case 159 -> 222;
                case 160 -> 100;
                case 161 -> 231;
                case 162 -> 237;
                case 163 -> 73;
                case 164 -> 255;
                case 165 -> 200;
                case 166 -> 56;
                case 167 -> 108;
                case 168 -> 79;
                case 169 -> 245;
                case 170 -> 160;
                case 171 -> 31;
                case 172 -> 221;
                case 173 -> 81;
                case 174 -> 132;
                case 175 -> 243;
                case 176 -> 138;
                case 177 -> 80;
                case 178 -> 42;
                case 179 -> 57;
                case 180 -> 165;
                case 181 -> 52;
                case 182 -> 196;
                case 183 -> 190;
                case 184 -> 4;
                case 185 -> 144;
                case 186 -> 175;
                case 187 -> 156;
                case 188 -> 19;
                case 189 -> 235;
                case 190 -> 199;
                case 191 -> 43;
                case 192 -> 39;
                case 193 -> 67;
                case 194 -> 169;
                case 195 -> 238;
                case 196 -> 10;
                case 197 -> 152;
                case 198 -> 82;
                case 199 -> 37;
                case 200 -> 198;
                case 201 -> 246;
                case 202 -> 136;
                case 203 -> 247;
                case 204 -> 21;
                case 205 -> 135;
                case 206 -> 84;
                case 207 -> 7;
                case 208 -> 184;
                case 209 -> 195;
                case 210 -> 6;
                case 211 -> 18;
                case 212 -> 157;
                case 213 -> 227;
                case 214 -> 66;
                case 215 -> 107;
                case 216 -> 141;
                case 217 -> 177;
                case 218 -> 251;
                case 219 -> 9;
                case 220 -> 94;
                case 221 -> 64;
                case 222 -> 171;
                case 223 -> 179;
                case 224 -> 236;
                case 225 -> 61;
                case 226 -> 142;
                case 227 -> 233;
                case 228 -> 239;
                case 229 -> 250;
                case 230 -> 147;
                case 231 -> 162;
                case 232 -> 50;
                case 233 -> 170;
                case 234 -> 87;
                case 235 -> 91;
                case 236 -> 77;
                case 237 -> 252;
                case 238 -> 123;
                case 239 -> 130;
                case 240 -> 208;
                case 241 -> 244;
                case 242 -> 35;
                case 243 -> 219;
                case 244 -> 253;
                case 245 -> 248;
                case 246 -> 125;
                case 247 -> 53;
                case 248 -> 201;
                case 249 -> 181;
                case 250 -> 168;
                case 251 -> 213;
                case 252 -> 188;
                case 253 -> 14;
                case 254 -> 223;
                default -> 38;
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
            class_4587Sub.strArr_1[n3] = new String(charArray).intern();
        }
        return class_4587Sub.strArr_1[n3];
    }
}
