// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub5;

import net.minecraft.class_11908;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_2;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import net.minecraft.class_11909;
import java.util.Iterator;
import net.minecraft.class_327;
import net.minecraft.class_332;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import net.minecraft.class_2561;
import java.util.Random;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_4;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;
import java.util.Set;
import java.util.Map;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import java.util.List;
import net.minecraft.class_310;
import net.minecraft.class_437;

public final class class_437Sub extends class_437
{
    public static final class_310 class310;
    private List<Initializer> list;
    private Map<Initializer, Integer> map;
    private Map<Initializer, Integer> map_1;
    private Map<Initializer, Integer> map_2;
    private Set<Initializer_3> set;
    private Set<Initializer> set_1;
    private Initializer cacheE;
    private SyncASub_1 buildC;
    private SyncASub_1 buildC_1;
    private String strValue;
    private SyncASub_4 itemG;
    private String strValue_1;
    private Initializer cacheE_1;
    private SyncASub_3 initD;
    private int intValue;
    private int intValue_1;
    private float floatValue;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private boolean boolFlag_2;
    private String strValue_2;
    private String strValue_3;
    private String strValue_4;
    private List<String> list_1;
    private int intValue_2;
    private boolean boolFlag_3;
    private String strValue_5;
    private boolean boolFlag_4;
    private List<Initializer_3> list_2;
    private Set<Initializer_3> set_2;
    private int intValue_3;
    private String strValue_6;
    private long longValue;
    private static final long longValue_1 = 3000L;
    private static final String strValue_7;
    private static final String strValue_8;
    private static final String strValue_9;
    private static final String strValue_10;
    private static final String strValue_11;
    private static final String strValue_12;
    private static final String strValue_13;
    private static final String strValue_14;
    private static final String strValue_15;
    private static final String strValue_16;
    private static final double doubleValue = 2.0;
    private float floatValue_1;
    private int intValue_4;
    private int intValue_5;
    private static final int intValue_6 = 200;
    private float[] floatArray;
    private float[] floatArray_1;
    private float[] floatArray_2;
    private float[] floatArray_3;
    private boolean boolFlag_5;
    private Random random;
    private static int intValue_7;
    private static final int intValue_8 = 24;
    private static final int intValue_9 = 17;
    private static final int intValue_10 = 16;
    private static final int intValue_11 = 360;
    private static final int intValue_12;
    private static final int intValue_13;
    private static final int intValue_14;
    private static final int intValue_15;
    private static final int intValue_16;
    private static final int intValue_17;
    private static final int intValue_18;
    private static final int intValue_19;
    private static final int intValue_20;
    private static final int intValue_21;
    private static final int intValue_22;
    private static final int intValue_23;
    private static final int intValue_24;
    private static final int intValue_25;
    private static final int intValue_26;
    private static final int intValue_27;
    private static final int intValue_28;
    private static final int intValue_29;
    private static final int intValue_30;
    private static final int intValue_31;
    private String[] strArr;
    private int[] intArr;
    private static final int[][] intArray;
    private static com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] SyncAArray;
    private static final String[] strArr_1;
    private static final String[] strArr_2;
    
    private com.target.mod.compat.sub1.sub2.sub1.Initializer getUtilc() {
        return com.target.mod.compat.sub1.sub2.sub1.Initializer.utilC;
    }
    
    private static int method_int(final int n, final int n2, final int n3, final int n4) {
        return n4 << 24 | n << 16 | n2 << 8 | n3;
    }
    
    public class_437Sub() {
        super((class_2561)class_2561.method_43473());
        this.list = new ArrayList<Initializer>();
        this.map = new HashMap<Initializer, Integer>();
        this.map_1 = new HashMap<Initializer, Integer>();
        this.map_2 = new HashMap<Initializer, Integer>();
        this.set = new HashSet<Initializer_3>();
        this.set_1 = new HashSet<Initializer>();
        this.cacheE = null;
        this.buildC = null;
        this.buildC_1 = null;
        this.strValue = "";
        this.itemG = null;
        this.strValue_1 = "";
        this.cacheE_1 = null;
        this.initD = null;
        this.floatValue = 0.0f;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.strValue_2 = null;
        this.strValue_3 = "";
        this.strValue_4 = createString_1(27895, 26140);
        this.list_1 = new ArrayList<String>();
        this.intValue_2 = 0;
        this.boolFlag_3 = false;
        this.strValue_5 = "";
        this.boolFlag_4 = false;
        this.list_2 = new ArrayList<Initializer_3>();
        this.set_2 = new HashSet<Initializer_3>();
        this.intValue_3 = 0;
        this.strValue_6 = null;
        this.longValue = 0L;
        this.floatValue_1 = 1.0f;
        this.boolFlag_5 = false;
        this.random = new Random();
        this.strArr = new String[] { createString_1(27849, 16090), createString_1(27859, 23333), createString_1(27779, -5455) };
        this.intArr = new int[3];
        final int length = Initializer.values().length;
        class_437Sub.intValue_7 = Math.min(155, Math.max(100, (950 - length * 6) / length));
        int i = 10;
        for (final Initializer initializer : Initializer.values()) {
            this.list.add(initializer);
            this.map.put(initializer, i);
            this.map_1.put(initializer, 44);
            this.map_2.put(initializer, 0);
            i += class_437Sub.intValue_7 + 6;
        }
    }
    
    private int method_int_1(final class_332 class_332, final String s, final int n, final int n2, final int n3, final boolean b, final int n4) {
        try {
            if (s == null) {
                return 0;
            }
        }
        catch (final MatchException ex) {
            throw computeException((Exception)ex);
        }
        int n5 = n;
        final int n6 = n + n4;
        for (int i = 0; i < s.length(); ++i) {
            char char1 = s.charAt(i);
            Label_0179: {
                Label_0086: {
                    Label_0074: {
                        try {
                            if (char1 < '\uff01' || char1 > '\uff5e') {
                                break Label_0074;
                            }
                        }
                        catch (final MatchException ex2) {
                            throw computeException((Exception)ex2);
                        }
                        char1 -= '\ufee0';
                        break Label_0086;
                    }
                    if (char1 == '\u3000') {
                        char1 = ' ';
                    }
                    try {
                        if (char1 != '.' || i + 1 >= s.length()) {
                            break Label_0179;
                        }
                    }
                    catch (final MatchException ex3) {
                        throw computeException((Exception)ex3);
                    }
                }
                final char char2 = s.charAt(i + 1);
                Label_0172: {
                    Label_0151: {
                        Label_0144: {
                            try {
                                if (char2 < '\uff41') {
                                    break Label_0151;
                                }
                                final char c = char2;
                                final char c2 = '\uff5a';
                                if (c <= c2) {
                                    break Label_0144;
                                }
                                break Label_0151;
                            }
                            catch (final MatchException ex4) {
                                throw computeException((Exception)ex4);
                            }
                            try {
                                final char c = char2;
                                final char c2 = '\uff5a';
                                if (c <= c2) {
                                    continue;
                                }
                            }
                            catch (final MatchException ex5) {
                                throw computeException((Exception)ex5);
                            }
                        }
                        try {
                            if (char2 < 'a') {
                                break Label_0179;
                            }
                            final char c3 = char2;
                            final char c4 = 'z';
                            if (c3 <= c4) {
                                break Label_0172;
                            }
                            break Label_0179;
                        }
                        catch (final MatchException ex6) {
                            throw computeException((Exception)ex6);
                        }
                    }
                    try {
                        final char c3 = char2;
                        final char c4 = 'z';
                        if (c3 <= c4) {
                            continue;
                        }
                    }
                    catch (final MatchException ex7) {
                        throw computeException((Exception)ex7);
                    }
                }
            }
            final String value = String.valueOf(char1);
            final int method_1727 = this.field_22793.method_1727(value);
            Label_0249: {
                Label_0321: {
                    Label_0276: {
                        Label_0219: {
                            try {
                                if (n5 + method_1727 <= n6) {
                                    break Label_0276;
                                }
                                final boolean b2 = b;
                                if (b2) {
                                    break Label_0219;
                                }
                                break Label_0249;
                            }
                            catch (final MatchException ex8) {
                                throw computeException((Exception)ex8);
                            }
                            try {
                                final boolean b2 = b;
                                if (b2) {
                                    class_332.method_25303(this.field_22793, createString_1(27885, 7705), n5, n2, n3);
                                    break;
                                }
                            }
                            catch (final MatchException ex9) {
                                throw computeException((Exception)ex9);
                            }
                        }
                        break Label_0249;
                        try {
                            if (b) {
                                class_332.method_25303(this.field_22793, value, n5, n2, n3);
                                break Label_0321;
                            }
                        }
                        catch (final MatchException ex10) {
                            throw computeException((Exception)ex10);
                        }
                    }
                    class_332.method_51433(this.field_22793, value, n5, n2, n3, false);
                }
                n5 += method_1727;
                continue;
            }
            class_332.method_51433(this.field_22793, createString_1(27885, 7705), n5, n2, n3, false);
            break;
        }
        return n5 - n;
    }
    
    private int method_int_2(final String s) {
        try {
            if (s == null) {
                return 0;
            }
        }
        catch (final MatchException ex) {
            throw computeException((Exception)ex);
        }
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            char char1 = s.charAt(i);
            Label_0167: {
                Label_0076: {
                    Label_0064: {
                        try {
                            if (char1 < '\uff01' || char1 > '\uff5e') {
                                break Label_0064;
                            }
                        }
                        catch (final MatchException ex2) {
                            throw computeException((Exception)ex2);
                        }
                        char1 -= '\ufee0';
                        break Label_0076;
                    }
                    if (char1 == '\u3000') {
                        char1 = ' ';
                    }
                    try {
                        if (char1 != '.' || i + 1 >= s.length()) {
                            break Label_0167;
                        }
                    }
                    catch (final MatchException ex3) {
                        throw computeException((Exception)ex3);
                    }
                }
                final char char2 = s.charAt(i + 1);
                Label_0160: {
                    Label_0139: {
                        Label_0132: {
                            try {
                                if (char2 < '\uff41') {
                                    break Label_0139;
                                }
                                final char c = char2;
                                final char c2 = '\uff5a';
                                if (c <= c2) {
                                    break Label_0132;
                                }
                                break Label_0139;
                            }
                            catch (final MatchException ex4) {
                                throw computeException((Exception)ex4);
                            }
                            try {
                                final char c = char2;
                                final char c2 = '\uff5a';
                                if (c <= c2) {
                                    continue;
                                }
                            }
                            catch (final MatchException ex5) {
                                throw computeException((Exception)ex5);
                            }
                        }
                        try {
                            if (char2 < 'a') {
                                break Label_0167;
                            }
                            final char c3 = char2;
                            final char c4 = 'z';
                            if (c3 <= c4) {
                                break Label_0160;
                            }
                            break Label_0167;
                        }
                        catch (final MatchException ex6) {
                            throw computeException((Exception)ex6);
                        }
                    }
                    try {
                        final char c3 = char2;
                        final char c4 = 'z';
                        if (c3 <= c4) {
                            continue;
                        }
                    }
                    catch (final MatchException ex7) {
                        throw computeException((Exception)ex7);
                    }
                }
            }
            n += this.field_22793.method_1727(String.valueOf(char1));
        }
        return n;
    }
    
    private static String computeString_1(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       11
        //     4: ldc             ""
        //     6: areturn        
        //     7: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    10: athrow         
        //    11: new             Ljava/lang/StringBuilder;
        //    14: dup            
        //    15: aload_0        
        //    16: invokevirtual   java/lang/String.length:()I
        //    19: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    22: astore_1       
        //    23: iconst_0       
        //    24: istore_2       
        //    25: iload_2        
        //    26: aload_0        
        //    27: invokevirtual   java/lang/String.length:()I
        //    30: if_icmpge       111
        //    33: aload_0        
        //    34: iload_2        
        //    35: invokevirtual   java/lang/String.charAt:(I)C
        //    38: istore_3       
        //    39: iload_3        
        //    40: ldc_w           65281
        //    43: if_icmplt       78
        //    46: iload_3        
        //    47: ldc_w           65374
        //    50: if_icmpgt       78
        //    53: goto            60
        //    56: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    59: athrow         
        //    60: aload_1        
        //    61: iload_3        
        //    62: ldc_w           65248
        //    65: isub           
        //    66: i2c            
        //    67: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    70: pop            
        //    71: goto            105
        //    74: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    77: athrow         
        //    78: iload_3        
        //    79: sipush          12288
        //    82: if_icmpne       99
        //    85: aload_1        
        //    86: bipush          32
        //    88: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    91: pop            
        //    92: goto            105
        //    95: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    98: athrow         
        //    99: aload_1        
        //   100: iload_3        
        //   101: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   104: pop            
        //   105: iinc            2, 1
        //   108: goto            25
        //   111: aload_1        
        //   112: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   115: astore_2       
        //   116: new             Ljava/lang/StringBuilder;
        //   119: dup            
        //   120: invokespecial   java/lang/StringBuilder.<init>:()V
        //   123: astore_3       
        //   124: iconst_0       
        //   125: istore          4
        //   127: iload           4
        //   129: aload_2        
        //   130: invokevirtual   java/lang/String.length:()I
        //   133: if_icmpge       217
        //   136: aload_2        
        //   137: iload           4
        //   139: invokevirtual   java/lang/String.charAt:(I)C
        //   142: bipush          46
        //   144: if_icmpne       200
        //   147: goto            154
        //   150: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   153: athrow         
        //   154: iload           4
        //   156: iconst_1       
        //   157: iadd           
        //   158: aload_2        
        //   159: invokevirtual   java/lang/String.length:()I
        //   162: if_icmpge       200
        //   165: goto            172
        //   168: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   171: athrow         
        //   172: aload_2        
        //   173: iload           4
        //   175: iconst_1       
        //   176: iadd           
        //   177: invokevirtual   java/lang/String.charAt:(I)C
        //   180: invokestatic    java/lang/Character.isLowerCase:(C)Z
        //   183: ifeq            200
        //   186: goto            193
        //   189: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   192: athrow         
        //   193: goto            211
        //   196: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   199: athrow         
        //   200: aload_3        
        //   201: aload_2        
        //   202: iload           4
        //   204: invokevirtual   java/lang/String.charAt:(I)C
        //   207: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   210: pop            
        //   211: iinc            4, 1
        //   214: goto            127
        //   217: aload_3        
        //   218: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   221: areturn        
        //    StackMapTable: 00 16 47 07 01 1C 03 FD 00 0D 07 01 49 01 FF 00 1E 00 04 07 00 EF 07 01 49 01 01 00 01 07 01 1C 03 4D 07 01 1C 03 50 07 01 1C 03 05 FA 00 05 FF 00 0F 00 05 07 00 EF 07 01 49 07 00 EF 07 01 49 01 00 00 56 07 01 1C 03 4D 07 01 1C 03 50 07 01 1C 03 42 07 01 1C 03 0A 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  0      7      7      11     Ljava/lang/MatchException;
        //  39     53     56     60     Ljava/lang/MatchException;
        //  46     74     74     78     Ljava/lang/MatchException;
        //  78     95     95     99     Ljava/lang/MatchException;
        //  127    147    150    154    Ljava/lang/MatchException;
        //  136    165    168    172    Ljava/lang/MatchException;
        //  154    186    189    193    Ljava/lang/MatchException;
        //  172    196    196    200    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0154:
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
    
    private void processAll(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final boolean b, final boolean b2) {
        final int n6 = 4;
        final int n7 = n5 >> 24 & 0xFF;
        final int n8 = n5 & 0xFFFFFF;
        for (int i = 0; i < n6; ++i) {
            for (int j = 0; j < n6; ++j) {
                final int n9 = class_437Sub.intArray[i][j];
                try {
                    if (n9 == 0) {
                        continue;
                    }
                }
                catch (final MatchException ex) {
                    throw computeException((Exception)ex);
                }
                int n10 = 0;
                Label_0095: {
                    try {
                        if (n9 >= 100) {
                            n10 = n5;
                            break Label_0095;
                        }
                    }
                    catch (final MatchException ex2) {
                        throw computeException((Exception)ex2);
                    }
                    n10 = (n7 * n9 / 100 << 24 | n8);
                }
                final int n11 = n10;
                try {
                    if (b) {
                        class_332.method_25294(n + j, n2 + i, n + j + 1, n2 + i + 1, n11);
                        class_332.method_25294(n + n3 - 1 - j, n2 + i, n + n3 - j, n2 + i + 1, n11);
                    }
                }
                catch (final MatchException ex3) {
                    throw computeException((Exception)ex3);
                }
                try {
                    if (b2) {
                        class_332.method_25294(n + j, n2 + n4 - 1 - i, n + j + 1, n2 + n4 - i, n11);
                        class_332.method_25294(n + n3 - 1 - j, n2 + n4 - 1 - i, n + n3 - j, n2 + n4 - i, n11);
                    }
                }
                catch (final MatchException ex4) {
                    throw computeException((Exception)ex4);
                }
            }
        }
    }
    
    private void processAll_1(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = 4;
        class_332.method_25294(n + n6, n2, n + n3 - n6, n2 + n4, n5);
        class_332.method_25294(n, n2 + n6, n + n6, n2 + n4, n5);
        class_332.method_25294(n + n3 - n6, n2 + n6, n + n3, n2 + n4, n5);
        this.processAll(class_332, n, n2, n3, n4, n5, true, false);
    }
    
    private void processAll_6(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = 4;
        class_332.method_25294(n + n6, n2, n + n3 - n6, n2 + n4, n5);
        class_332.method_25294(n, n2, n + n6, n2 + n4 - n6, n5);
        class_332.method_25294(n + n3 - n6, n2, n + n3, n2 + n4 - n6, n5);
        this.processAll(class_332, n, n2, n3, n4, n5, false, true);
    }
    
    private void processAll_8(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = 4;
        class_332.method_25294(n + n6, n2, n + n3 - n6, n2 + n4, n5);
        class_332.method_25294(n, n2 + n6, n + n6, n2 + n4 - n6, n5);
        class_332.method_25294(n + n3 - n6, n2 + n6, n + n3, n2 + n4 - n6, n5);
        this.processAll(class_332, n, n2, n3, n4, n5, true, true);
    }
    
    private String createString(String substring, final int n) {
        try {
            if (this.field_22793.method_1727(substring) <= n) {
                return substring;
            }
        }
        catch (final MatchException ex) {
            throw computeException((Exception)ex);
        }
        final String string_1 = createString_1(27885, 7705);
        final int method_1727 = this.field_22793.method_1727(string_1);
        while (true) {
            try {
                if (substring.length() <= 1 || this.field_22793.method_1727(substring) + method_1727 <= n) {
                    break;
                }
            }
            catch (final MatchException ex2) {
                throw computeException((Exception)ex2);
            }
            substring = substring.substring(0, substring.length() - 1);
        }
        return substring + string_1;
    }
    
    private int method_int_3(final int n) {
        return (int)(n * this.floatValue_1);
    }
    
    private int method_int_4(final double n) {
        return (int)(n / this.floatValue_1);
    }
    
    private int method_int_5(final double n) {
        return (int)(n / this.floatValue_1);
    }
    
    public void method_25394(final class_332 v1, final int i2, final int i3, final float f4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            15
        //     6: aload_0         /* this */
        //     7: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_25419:()V
        //    10: return         
        //    11: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    14: athrow         
        //    15: aload_0         /* this */
        //    16: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.getUtilc:()Lcom/target/mod/compat/sub1/sub2/sub1/Initializer;
        //    19: ifnull          36
        //    22: aload_0         /* this */
        //    23: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.getUtilc:()Lcom/target/mod/compat/sub1/sub2/sub1/Initializer;
        //    26: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/Initializer.getClass_437:()Lnet/minecraft/class_437;
        //    29: goto            37
        //    32: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    35: athrow         
        //    36: aconst_null    
        //    37: astore          v5
        //    39: aload           v5
        //    41: ifnull          74
        //    44: aload           v5
        //    46: aload_0         /* this */
        //    47: if_acmpeq       74
        //    50: goto            57
        //    53: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    56: athrow         
        //    57: aload           v5
        //    59: aload_1         /* v1 */
        //    60: iconst_0       
        //    61: iconst_0       
        //    62: fload           f4
        //    64: invokevirtual   net/minecraft/class_437.method_25394:(Lnet/minecraft/class_332;IIF)V
        //    67: goto            74
        //    70: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    73: athrow         
        //    74: goto            79
        //    77: astore          v5
        //    79: aload_0         /* this */
        //    80: aconst_null    
        //    81: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //    84: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.class310:Lnet/minecraft/class_310;
        //    87: invokevirtual   net/minecraft/class_310.method_22683:()Lnet/minecraft/class_1041;
        //    90: invokevirtual   net/minecraft/class_1041.method_4495:()I
        //    93: i2d            
        //    94: dstore          d5
        //    96: aload_0         /* this */
        //    97: ldc2_w          2.0
        //   100: dload           d5
        //   102: ddiv           
        //   103: d2f            
        //   104: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue_1:F
        //   107: aload_0         /* this */
        //   108: aload_0         /* this */
        //   109: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22789:I
        //   112: i2f            
        //   113: aload_0         /* this */
        //   114: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue_1:F
        //   117: fdiv           
        //   118: f2i            
        //   119: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   122: aload_0         /* this */
        //   123: aload_0         /* this */
        //   124: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22790:I
        //   127: i2f            
        //   128: aload_0         /* this */
        //   129: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue_1:F
        //   132: fdiv           
        //   133: f2i            
        //   134: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //   137: aload_1         /* v1 */
        //   138: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   141: invokevirtual   org/joml/Matrix3x2fStack.pushMatrix:()Lorg/joml/Matrix3x2fStack;
        //   144: pop            
        //   145: aload_1         /* v1 */
        //   146: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //   149: aload_0         /* this */
        //   150: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue_1:F
        //   153: aload_0         /* this */
        //   154: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue_1:F
        //   157: invokevirtual   org/joml/Matrix3x2fStack.scale:(FF)Lorg/joml/Matrix3x2f;
        //   160: pop            
        //   161: aload_0         /* this */
        //   162: iload_2         /* i2 */
        //   163: i2d            
        //   164: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_4:(D)I
        //   167: istore          i7
        //   169: aload_0         /* this */
        //   170: iload_3         /* i3 */
        //   171: i2d            
        //   172: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_5:(D)I
        //   175: istore          i8
        //   177: aload_0         /* this */
        //   178: dup            
        //   179: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue:F
        //   182: ldc_w           0.005
        //   185: fadd           
        //   186: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue:F
        //   189: aload_0         /* this */
        //   190: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue:F
        //   193: fconst_1       
        //   194: fcmpl          
        //   195: ifle            215
        //   198: aload_0         /* this */
        //   199: dup            
        //   200: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue:F
        //   203: fconst_1       
        //   204: fsub           
        //   205: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue:F
        //   208: goto            215
        //   211: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   214: athrow         
        //   215: aload_1         /* v1 */
        //   216: iconst_0       
        //   217: iconst_0       
        //   218: aload_0         /* this */
        //   219: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   222: aload_0         /* this */
        //   223: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //   226: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_25:I
        //   229: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   232: aload_0         /* this */
        //   233: aload_1         /* v1 */
        //   234: fload           f4
        //   236: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setClass_332AndFloat:(Lnet/minecraft/class_332;F)V
        //   239: new             Ljava/lang/String;
        //   242: dup            
        //   243: bipush          41
        //   245: newarray        C
        //   247: dup            
        //   248: iconst_0       
        //   249: sipush          167
        //   252: castore        
        //   253: dup            
        //   254: iconst_1       
        //   255: bipush          108
        //   257: castore        
        //   258: dup            
        //   259: iconst_2       
        //   260: bipush          67
        //   262: castore        
        //   263: dup            
        //   264: iconst_3       
        //   265: bipush          114
        //   267: castore        
        //   268: dup            
        //   269: iconst_4       
        //   270: bipush          97
        //   272: castore        
        //   273: dup            
        //   274: iconst_5       
        //   275: bipush          99
        //   277: castore        
        //   278: dup            
        //   279: bipush          6
        //   281: bipush          107
        //   283: castore        
        //   284: dup            
        //   285: bipush          7
        //   287: bipush          101
        //   289: castore        
        //   290: dup            
        //   291: bipush          8
        //   293: bipush          100
        //   295: castore        
        //   296: dup            
        //   297: bipush          9
        //   299: bipush          32
        //   301: castore        
        //   302: dup            
        //   303: bipush          10
        //   305: bipush          98
        //   307: castore        
        //   308: dup            
        //   309: bipush          11
        //   311: bipush          121
        //   313: castore        
        //   314: dup            
        //   315: bipush          12
        //   317: bipush          32
        //   319: castore        
        //   320: dup            
        //   321: bipush          13
        //   323: bipush          103
        //   325: castore        
        //   326: dup            
        //   327: bipush          14
        //   329: bipush          105
        //   331: castore        
        //   332: dup            
        //   333: bipush          15
        //   335: bipush          116
        //   337: castore        
        //   338: dup            
        //   339: bipush          16
        //   341: bipush          104
        //   343: castore        
        //   344: dup            
        //   345: bipush          17
        //   347: bipush          117
        //   349: castore        
        //   350: dup            
        //   351: bipush          18
        //   353: bipush          98
        //   355: castore        
        //   356: dup            
        //   357: bipush          19
        //   359: bipush          46
        //   361: castore        
        //   362: dup            
        //   363: bipush          20
        //   365: bipush          99
        //   367: castore        
        //   368: dup            
        //   369: bipush          21
        //   371: bipush          111
        //   373: castore        
        //   374: dup            
        //   375: bipush          22
        //   377: bipush          109
        //   379: castore        
        //   380: dup            
        //   381: bipush          23
        //   383: bipush          47
        //   385: castore        
        //   386: dup            
        //   387: bipush          24
        //   389: bipush          84
        //   391: castore        
        //   392: dup            
        //   393: bipush          25
        //   395: bipush          114
        //   397: castore        
        //   398: dup            
        //   399: bipush          26
        //   401: bipush          105
        //   403: castore        
        //   404: dup            
        //   405: bipush          27
        //   407: bipush          108
        //   409: castore        
        //   410: dup            
        //   411: bipush          28
        //   413: bipush          108
        //   415: castore        
        //   416: dup            
        //   417: bipush          29
        //   419: bipush          105
        //   421: castore        
        //   422: dup            
        //   423: bipush          30
        //   425: bipush          117
        //   427: castore        
        //   428: dup            
        //   429: bipush          31
        //   431: bipush          109
        //   433: castore        
        //   434: dup            
        //   435: bipush          32
        //   437: bipush          83
        //   439: castore        
        //   440: dup            
        //   441: bipush          33
        //   443: bipush          111
        //   445: castore        
        //   446: dup            
        //   447: bipush          34
        //   449: bipush          108
        //   451: castore        
        //   452: dup            
        //   453: bipush          35
        //   455: bipush          117
        //   457: castore        
        //   458: dup            
        //   459: bipush          36
        //   461: bipush          116
        //   463: castore        
        //   464: dup            
        //   465: bipush          37
        //   467: bipush          105
        //   469: castore        
        //   470: dup            
        //   471: bipush          38
        //   473: bipush          111
        //   475: castore        
        //   476: dup            
        //   477: bipush          39
        //   479: bipush          110
        //   481: castore        
        //   482: dup            
        //   483: bipush          40
        //   485: bipush          115
        //   487: castore        
        //   488: invokespecial   java/lang/String.<init>:([C)V
        //   491: astore          v9
        //   493: aload_0         /* this */
        //   494: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   497: aload           v9
        //   499: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //   502: istore          i10
        //   504: aload_0         /* this */
        //   505: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue:F
        //   508: ldc_w           0.7
        //   511: fconst_1       
        //   512: invokestatic    java/awt/Color.HSBtoRGB:(FFF)I
        //   515: istore          i11
        //   517: aload_0         /* this */
        //   518: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   521: iload           i10
        //   523: isub           
        //   524: iconst_2       
        //   525: idiv           
        //   526: istore          i12
        //   528: aload_1         /* v1 */
        //   529: iload           i12
        //   531: iconst_4       
        //   532: isub           
        //   533: iconst_3       
        //   534: iload           i12
        //   536: iload           i10
        //   538: iadd           
        //   539: iconst_4       
        //   540: iadd           
        //   541: bipush          16
        //   543: iload           i11
        //   545: bipush          16
        //   547: ishr           
        //   548: sipush          255
        //   551: iand           
        //   552: iload           i11
        //   554: bipush          8
        //   556: ishr           
        //   557: sipush          255
        //   560: iand           
        //   561: iload           i11
        //   563: sipush          255
        //   566: iand           
        //   567: bipush          18
        //   569: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   572: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   575: aload_1         /* v1 */
        //   576: aload_0         /* this */
        //   577: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   580: aload           v9
        //   582: iload           i12
        //   584: bipush          6
        //   586: iload           i11
        //   588: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //   591: aload_0         /* this */
        //   592: aload_1         /* v1 */
        //   593: iload           i7
        //   595: iload           i8
        //   597: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_2:(Lnet/minecraft/class_332;II)V
        //   600: aload_0         /* this */
        //   601: aload_1         /* v1 */
        //   602: iload           i7
        //   604: iload           i8
        //   606: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_9:(Lnet/minecraft/class_332;II)V
        //   609: aload_0         /* this */
        //   610: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   613: invokevirtual   java/lang/String.isEmpty:()Z
        //   616: ifne            635
        //   619: aload_0         /* this */
        //   620: aload_1         /* v1 */
        //   621: iload           i7
        //   623: iload           i8
        //   625: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_7:(Lnet/minecraft/class_332;II)V
        //   628: goto            682
        //   631: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   634: athrow         
        //   635: aload_0         /* this */
        //   636: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list:Ljava/util/List;
        //   639: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   644: astore          v13
        //   646: aload           v13
        //   648: invokeinterface java/util/Iterator.hasNext:()Z
        //   653: ifeq            682
        //   656: aload           v13
        //   658: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   663: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer;
        //   666: astore          v14
        //   668: aload_0         /* this */
        //   669: aload_1         /* v1 */
        //   670: aload           v14
        //   672: iload           i7
        //   674: iload           i8
        //   676: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_3:(Lnet/minecraft/class_332;Lcom/target/mod/compat/sub1/sub2/sub2/Initializer;II)V
        //   679: goto            646
        //   682: sipush          27877
        //   685: sipush          -13376
        //   688: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   691: astore          v13
        //   693: aload_0         /* this */
        //   694: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   697: aload           v13
        //   699: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //   702: istore          i14
        //   704: aload_1         /* v1 */
        //   705: aload_0         /* this */
        //   706: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   709: aload           v13
        //   711: aload_0         /* this */
        //   712: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   715: iload           i14
        //   717: isub           
        //   718: bipush          6
        //   720: isub           
        //   721: bipush          7
        //   723: bipush          80
        //   725: bipush          70
        //   727: bipush          120
        //   729: bipush          100
        //   731: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   734: iconst_0       
        //   735: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //   738: aload_0         /* this */
        //   739: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.buildC_1:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   742: ifnull          1003
        //   745: aload_1         /* v1 */
        //   746: iconst_0       
        //   747: iconst_0       
        //   748: aload_0         /* this */
        //   749: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   752: aload_0         /* this */
        //   753: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //   756: bipush          10
        //   758: bipush          10
        //   760: bipush          15
        //   762: sipush          200
        //   765: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   768: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   771: sipush          27862
        //   774: sipush          160
        //   777: istore          i15
        //   779: sipush          27012
        //   782: bipush          60
        //   784: istore          i16
        //   786: aload_0         /* this */
        //   787: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   790: iload           i15
        //   792: isub           
        //   793: iconst_2       
        //   794: idiv           
        //   795: istore          i17
        //   797: aload_0         /* this */
        //   798: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //   801: iload           i16
        //   803: isub           
        //   804: iconst_2       
        //   805: idiv           
        //   806: istore          i18
        //   808: aload_0         /* this */
        //   809: aload_1         /* v1 */
        //   810: iload           i17
        //   812: iload           i18
        //   814: iload           i15
        //   816: iload           i16
        //   818: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_17:I
        //   821: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //   824: aload_1         /* v1 */
        //   825: iload           i17
        //   827: iconst_4       
        //   828: iadd           
        //   829: iload           i18
        //   831: iconst_4       
        //   832: iadd           
        //   833: iload           i17
        //   835: iconst_5       
        //   836: iadd           
        //   837: iload           i18
        //   839: iload           i16
        //   841: iadd           
        //   842: iconst_4       
        //   843: isub           
        //   844: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //   847: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   850: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   853: astore          v19
        //   855: aload_1         /* v1 */
        //   856: aload_0         /* this */
        //   857: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   860: aload           v19
        //   862: iload           i17
        //   864: iload           i15
        //   866: aload_0         /* this */
        //   867: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   870: aload           v19
        //   872: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //   875: isub           
        //   876: iconst_2       
        //   877: idiv           
        //   878: iadd           
        //   879: iload           i18
        //   881: bipush          10
        //   883: iadd           
        //   884: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //   887: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //   890: iload           i17
        //   892: bipush          20
        //   894: iadd           
        //   895: istore          i20
        //   897: iload           i18
        //   899: bipush          30
        //   901: iadd           
        //   902: istore          i21
        //   904: bipush          120
        //   906: istore          i22
        //   908: bipush          16
        //   910: istore          i23
        //   912: aload_1         /* v1 */
        //   913: iload           i20
        //   915: iload           i21
        //   917: iload           i20
        //   919: iload           i22
        //   921: iadd           
        //   922: iload           i21
        //   924: iload           i23
        //   926: iadd           
        //   927: bipush          20
        //   929: bipush          25
        //   931: bipush          35
        //   933: sipush          255
        //   936: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   939: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   942: aload_1         /* v1 */
        //   943: iload           i20
        //   945: iload           i21
        //   947: iload           i23
        //   949: iadd           
        //   950: iconst_1       
        //   951: isub           
        //   952: iload           i20
        //   954: iload           i22
        //   956: iadd           
        //   957: iload           i21
        //   959: iload           i23
        //   961: iadd           
        //   962: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_24:I
        //   965: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   968: aload_0         /* this */
        //   969: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue:Ljava/lang/String;
        //   972: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //   977: astore          v24
        //   979: aload_1         /* v1 */
        //   980: aload_0         /* this */
        //   981: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   984: aload           v24
        //   986: iload           i20
        //   988: bipush          6
        //   990: iadd           
        //   991: iload           i21
        //   993: iconst_4       
        //   994: iadd           
        //   995: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //   998: iconst_0       
        //   999: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1002: return         
        //  1003: aload_0         /* this */
        //  1004: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.itemG:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //  1007: ifnull          1269
        //  1010: aload_1         /* v1 */
        //  1011: iconst_0       
        //  1012: iconst_0       
        //  1013: aload_0         /* this */
        //  1014: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //  1017: aload_0         /* this */
        //  1018: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //  1021: bipush          10
        //  1023: bipush          10
        //  1025: bipush          15
        //  1027: sipush          200
        //  1030: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1033: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1036: sipush          200
        //  1039: istore          i15
        //  1041: bipush          60
        //  1043: istore          i16
        //  1045: aload_0         /* this */
        //  1046: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //  1049: iload           i15
        //  1051: isub           
        //  1052: iconst_2       
        //  1053: idiv           
        //  1054: istore          i17
        //  1056: aload_0         /* this */
        //  1057: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //  1060: iload           i16
        //  1062: isub           
        //  1063: iconst_2       
        //  1064: idiv           
        //  1065: istore          i18
        //  1067: aload_0         /* this */
        //  1068: aload_1         /* v1 */
        //  1069: iload           i17
        //  1071: iload           i18
        //  1073: iload           i15
        //  1075: iload           i16
        //  1077: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_17:I
        //  1080: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  1083: aload_1         /* v1 */
        //  1084: iload           i17
        //  1086: iconst_4       
        //  1087: iadd           
        //  1088: iload           i18
        //  1090: iconst_4       
        //  1091: iadd           
        //  1092: iload           i17
        //  1094: iconst_5       
        //  1095: iadd           
        //  1096: iload           i18
        //  1098: iload           i16
        //  1100: iadd           
        //  1101: iconst_4       
        //  1102: isub           
        //  1103: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //  1106: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1109: aload_0         /* this */
        //  1110: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.itemG:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //  1113: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4.getString:()Ljava/lang/String;
        //  1116: astore          v19
        //  1118: aload_1         /* v1 */
        //  1119: aload_0         /* this */
        //  1120: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1123: aload           v19
        //  1125: iload           i17
        //  1127: iload           i15
        //  1129: aload_0         /* this */
        //  1130: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1133: aload           v19
        //  1135: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1138: isub           
        //  1139: iconst_2       
        //  1140: idiv           
        //  1141: iadd           
        //  1142: iload           i18
        //  1144: bipush          10
        //  1146: iadd           
        //  1147: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1150: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  1153: iload           i17
        //  1155: bipush          20
        //  1157: iadd           
        //  1158: istore          i20
        //  1160: iload           i18
        //  1162: bipush          30
        //  1164: iadd           
        //  1165: istore          i21
        //  1167: iload           i15
        //  1169: bipush          40
        //  1171: isub           
        //  1172: istore          i22
        //  1174: bipush          16
        //  1176: istore          i23
        //  1178: aload_1         /* v1 */
        //  1179: iload           i20
        //  1181: iload           i21
        //  1183: iload           i20
        //  1185: iload           i22
        //  1187: iadd           
        //  1188: iload           i21
        //  1190: iload           i23
        //  1192: iadd           
        //  1193: bipush          20
        //  1195: bipush          25
        //  1197: bipush          35
        //  1199: sipush          255
        //  1202: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1205: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1208: aload_1         /* v1 */
        //  1209: iload           i20
        //  1211: iload           i21
        //  1213: iload           i23
        //  1215: iadd           
        //  1216: iconst_1       
        //  1217: isub           
        //  1218: iload           i20
        //  1220: iload           i22
        //  1222: iadd           
        //  1223: iload           i21
        //  1225: iload           i23
        //  1227: iadd           
        //  1228: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //  1231: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1234: aload_0         /* this */
        //  1235: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_1:Ljava/lang/String;
        //  1238: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        //  1243: astore          v24
        //  1245: aload_1         /* v1 */
        //  1246: aload_0         /* this */
        //  1247: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1250: aload           v24
        //  1252: iload           i20
        //  1254: bipush          6
        //  1256: iadd           
        //  1257: iload           i21
        //  1259: iconst_4       
        //  1260: iadd           
        //  1261: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1264: iconst_0       
        //  1265: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1268: return         
        //  1269: aload_0         /* this */
        //  1270: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //  1273: ifne            1290
        //  1276: aload_0         /* this */
        //  1277: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //  1280: ifeq            1387
        //  1283: goto            1290
        //  1286: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1289: athrow         
        //  1290: aload_1         /* v1 */
        //  1291: iconst_0       
        //  1292: iconst_0       
        //  1293: aload_0         /* this */
        //  1294: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //  1297: aload_0         /* this */
        //  1298: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //  1301: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_26:I
        //  1304: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1307: aload_0         /* this */
        //  1308: aload_1         /* v1 */
        //  1309: aload_0         /* this */
        //  1310: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //  1313: ifeq            1339
        //  1316: goto            1323
        //  1319: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1322: athrow         
        //  1323: sipush          27890
        //  1326: sipush          -7772
        //  1329: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1332: goto            1348
        //  1335: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1338: athrow         
        //  1339: sipush          27887
        //  1342: sipush          27382
        //  1345: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1348: aload_0         /* this */
        //  1349: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //  1352: ifeq            1371
        //  1355: sipush          27776
        //  1358: sipush          -29247
        //  1361: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1364: goto            1380
        //  1367: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1370: athrow         
        //  1371: sipush          27876
        //  1374: sipush          1119
        //  1377: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1380: iload           i7
        //  1382: iload           i8
        //  1384: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_4:(Lnet/minecraft/class_332;Ljava/lang/String;Ljava/lang/String;II)V
        //  1387: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1390: lstore          j15
        //  1392: aload_0         /* this */
        //  1393: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_6:Ljava/lang/String;
        //  1396: ifnull          1428
        //  1399: lload           j15
        //  1401: aload_0         /* this */
        //  1402: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.longValue:J
        //  1405: lsub           
        //  1406: ldc2_w          3000
        //  1409: lcmp           
        //  1410: ifge            1428
        //  1413: goto            1420
        //  1416: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1419: athrow         
        //  1420: iconst_1       
        //  1421: goto            1429
        //  1424: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1427: athrow         
        //  1428: iconst_0       
        //  1429: istore          i17
        //  1431: iload           i17
        //  1433: ifeq            1447
        //  1436: aload_0         /* this */
        //  1437: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_6:Ljava/lang/String;
        //  1440: goto            1451
        //  1443: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1446: athrow         
        //  1447: aload_0         /* this */
        //  1448: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //  1451: astore          v18
        //  1453: aload           v18
        //  1455: ifnull          1867
        //  1458: iload           i17
        //  1460: ifeq            1486
        //  1463: goto            1470
        //  1466: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1469: athrow         
        //  1470: aload_0         /* this */
        //  1471: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1474: aload           v18
        //  1476: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1479: goto            1492
        //  1482: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1485: athrow         
        //  1486: aload_0         /* this */
        //  1487: aload           v18
        //  1489: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_2:(Ljava/lang/String;)I
        //  1492: istore          i19
        //  1494: bipush          8
        //  1496: istore          i20
        //  1498: aload_0         /* this */
        //  1499: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //  1502: iload           i19
        //  1504: isub           
        //  1505: iconst_2       
        //  1506: idiv           
        //  1507: istore          i21
        //  1509: aload_0         /* this */
        //  1510: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //  1513: bipush          52
        //  1515: isub           
        //  1516: istore          i22
        //  1518: iload           i17
        //  1520: ifeq            1542
        //  1523: bipush          16
        //  1525: bipush          35
        //  1527: bipush          25
        //  1529: sipush          240
        //  1532: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1535: goto            1554
        //  1538: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1541: athrow         
        //  1542: bipush          14
        //  1544: bipush          14
        //  1546: bipush          28
        //  1548: sipush          240
        //  1551: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1554: istore          i23
        //  1556: iload           i17
        //  1558: ifeq            1581
        //  1561: bipush          50
        //  1563: sipush          185
        //  1566: bipush          110
        //  1568: sipush          255
        //  1571: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1574: goto            1584
        //  1577: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1580: athrow         
        //  1581: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //  1584: istore          i24
        //  1586: aload_0         /* this */
        //  1587: aload_1         /* v1 */
        //  1588: iload           i21
        //  1590: iload           i20
        //  1592: isub           
        //  1593: iconst_2       
        //  1594: iadd           
        //  1595: iload           i22
        //  1597: iload           i20
        //  1599: isub           
        //  1600: iconst_2       
        //  1601: iadd           
        //  1602: iload           i19
        //  1604: iload           i20
        //  1606: iconst_2       
        //  1607: imul           
        //  1608: iadd           
        //  1609: bipush          8
        //  1611: iload           i20
        //  1613: iconst_2       
        //  1614: imul           
        //  1615: iadd           
        //  1616: iconst_0       
        //  1617: iconst_0       
        //  1618: iconst_0       
        //  1619: bipush          60
        //  1621: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1624: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  1627: aload_0         /* this */
        //  1628: aload_1         /* v1 */
        //  1629: iload           i21
        //  1631: iload           i20
        //  1633: isub           
        //  1634: iload           i22
        //  1636: iload           i20
        //  1638: isub           
        //  1639: iload           i19
        //  1641: iload           i20
        //  1643: iconst_2       
        //  1644: imul           
        //  1645: iadd           
        //  1646: bipush          8
        //  1648: iload           i20
        //  1650: iconst_2       
        //  1651: imul           
        //  1652: iadd           
        //  1653: iload           i23
        //  1655: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  1658: aload_1         /* v1 */
        //  1659: iload           i21
        //  1661: iload           i20
        //  1663: isub           
        //  1664: iconst_4       
        //  1665: iadd           
        //  1666: iload           i22
        //  1668: iload           i20
        //  1670: isub           
        //  1671: iload           i21
        //  1673: iload           i19
        //  1675: iconst_2       
        //  1676: idiv           
        //  1677: iadd           
        //  1678: iload           i22
        //  1680: iload           i20
        //  1682: isub           
        //  1683: iconst_1       
        //  1684: iadd           
        //  1685: iload           i24
        //  1687: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1690: aload_1         /* v1 */
        //  1691: iload           i21
        //  1693: iload           i19
        //  1695: iconst_2       
        //  1696: idiv           
        //  1697: iadd           
        //  1698: iload           i22
        //  1700: iload           i20
        //  1702: isub           
        //  1703: iload           i21
        //  1705: iload           i19
        //  1707: iadd           
        //  1708: iload           i20
        //  1710: iadd           
        //  1711: iconst_4       
        //  1712: isub           
        //  1713: iload           i22
        //  1715: iload           i20
        //  1717: isub           
        //  1718: iconst_1       
        //  1719: iadd           
        //  1720: sipush          180
        //  1723: sipush          140
        //  1726: sipush          255
        //  1729: sipush          200
        //  1732: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1735: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1738: aload_1         /* v1 */
        //  1739: iload           i21
        //  1741: iload           i20
        //  1743: isub           
        //  1744: iload           i22
        //  1746: iconst_2       
        //  1747: isub           
        //  1748: iload           i21
        //  1750: iload           i20
        //  1752: isub           
        //  1753: iconst_1       
        //  1754: iadd           
        //  1755: iload           i22
        //  1757: bipush          10
        //  1759: iadd           
        //  1760: bipush          120
        //  1762: bipush          90
        //  1764: sipush          235
        //  1767: bipush          80
        //  1769: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1772: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1775: aload_1         /* v1 */
        //  1776: iload           i21
        //  1778: iload           i19
        //  1780: iadd           
        //  1781: iload           i20
        //  1783: iadd           
        //  1784: iconst_1       
        //  1785: isub           
        //  1786: iload           i22
        //  1788: iconst_2       
        //  1789: isub           
        //  1790: iload           i21
        //  1792: iload           i19
        //  1794: iadd           
        //  1795: iload           i20
        //  1797: iadd           
        //  1798: iload           i22
        //  1800: bipush          10
        //  1802: iadd           
        //  1803: bipush          120
        //  1805: bipush          90
        //  1807: sipush          235
        //  1810: bipush          80
        //  1812: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1815: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1818: iload           i17
        //  1820: ifeq            1847
        //  1823: aload_1         /* v1 */
        //  1824: aload_0         /* this */
        //  1825: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1828: aload           v18
        //  1830: iload           i21
        //  1832: iload           i22
        //  1834: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1837: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  1840: goto            1867
        //  1843: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1846: athrow         
        //  1847: aload_0         /* this */
        //  1848: aload_1         /* v1 */
        //  1849: aload           v18
        //  1851: iload           i21
        //  1853: iload           i22
        //  1855: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1858: iconst_1       
        //  1859: iload           i19
        //  1861: iconst_5       
        //  1862: iadd           
        //  1863: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  1866: pop            
        //  1867: aload_1         /* v1 */
        //  1868: invokevirtual   net/minecraft/class_332.method_51448:()Lorg/joml/Matrix3x2fStack;
        //  1871: invokevirtual   org/joml/Matrix3x2fStack.popMatrix:()Lorg/joml/Matrix3x2fStack;
        //  1874: pop            
        //  1875: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  v1    
        //  i2    
        //  i3    
        //  f4    
        //    StackMapTable: 00 34 4B 07 01 88 03 50 07 01 88 03 40 07 00 04 FF 00 0F 00 06 07 00 02 07 01 2C 01 01 02 07 00 04 00 01 07 01 88 03 4C 07 01 88 03 FF 00 02 00 05 07 00 02 07 01 2C 01 01 02 00 01 07 01 88 FC 00 01 07 01 9B FF 00 83 00 09 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 00 01 07 01 88 03 FF 01 9F 00 0D 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 00 01 07 01 88 03 FC 00 0A 07 01 E9 FA 00 23 FE 01 40 07 00 EF 00 01 FB 01 09 50 07 01 88 03 5C 07 01 88 FF 00 03 00 10 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 02 07 00 02 07 01 2C 4B 07 01 88 FF 00 03 00 10 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 02 07 00 02 07 01 2C FF 00 08 00 10 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 03 07 00 02 07 01 2C 07 00 EF 52 07 01 88 FF 00 03 00 10 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 03 07 00 02 07 01 2C 07 00 EF FF 00 08 00 10 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 04 07 00 02 07 01 2C 07 00 EF 07 00 EF 06 FF 00 1C 00 1B 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 00 00 00 00 00 00 00 00 00 04 00 01 07 01 88 03 43 07 01 88 03 40 01 FF 00 0D 00 1B 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 00 01 00 00 00 00 00 00 00 04 00 01 07 01 88 03 43 07 00 EF FF 00 0E 00 1C 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 00 01 00 00 00 00 00 00 00 04 07 00 EF 00 01 07 01 88 03 4B 07 01 88 03 45 01 FF 00 2D 00 1D 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 00 01 00 00 01 01 01 00 00 04 07 00 EF 01 00 01 07 01 88 03 4B 01 FF 00 16 00 1D 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 00 01 00 00 01 01 01 01 00 04 07 00 EF 01 00 01 07 01 88 03 42 01 FF 01 02 00 1E 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 00 01 00 00 01 01 01 01 00 04 07 00 EF 01 01 00 01 07 01 88 03 FF 00 13 00 1C 07 00 02 07 01 2C 01 01 02 07 01 9B 03 01 01 07 00 EF 01 01 01 07 00 EF 00 01 00 00 01 00 00 00 00 00 00 00 04 07 00 EF 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  44     67     70     74     Ljava/lang/Exception;
        //  39     50     53     57     Ljava/lang/Exception;
        //  15     32     32     36     Ljava/lang/Exception;
        //  0      11     11     15     Ljava/lang/Exception;
        //  15     74     77     79     Ljava/lang/Exception;
        //  177    208    211    215    Ljava/lang/Exception;
        //  528    631    631    635    Ljava/lang/Exception;
        //  1269   1283   1286   1290   Ljava/lang/Exception;
        //  1276   1316   1319   1323   Ljava/lang/Exception;
        //  1290   1335   1335   1339   Ljava/lang/Exception;
        //  1348   1367   1367   1371   Ljava/lang/Exception;
        //  1392   1413   1416   1420   Ljava/lang/Exception;
        //  1399   1424   1424   1428   Ljava/lang/Exception;
        //  1431   1443   1443   1447   Ljava/lang/Exception;
        //  1453   1463   1466   1470   Ljava/lang/Exception;
        //  1458   1482   1482   1486   Ljava/lang/Exception;
        //  1518   1538   1538   1542   Ljava/lang/Exception;
        //  1556   1577   1577   1581   Ljava/lang/Exception;
        //  1586   1843   1843   1847   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1290:
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
    
    private void setString(final String strValue_6) {
        this.strValue_6 = strValue_6;
        this.longValue = System.currentTimeMillis();
    }
    
    private void processAll_2(final class_332 class_332, final int n, final int n2) {
        final int n3 = 220;
        final int n4 = 18;
        final int n5 = (this.intValue_4 - n3) / 2;
        final int n6 = 20;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        Label_0243: {
            Label_0192: {
                Label_0072: {
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    try {
                        n7 = n5;
                        n8 = n6;
                        n9 = n3;
                        n10 = n4;
                        if (this.boolFlag_4) {
                            final int n11 = method_int(22, 22, 36, 245);
                            break Label_0072;
                        }
                    }
                    catch (final MatchException ex) {
                        throw computeException((Exception)ex);
                    }
                    final int n11 = method_int(16, 16, 24, 240);
                    try {
                        this.processAll_8(class_332, n7, n8, n9, n10, n11);
                        if (this.boolFlag_4) {
                            class_332.method_25294(n5 + 8, n6 + n4 - 1, n5 + n3 - 8, n6 + n4, class_437Sub.intValue_23);
                            class_332.method_25294(n5 + 4, n6 + n4, n5 + n3 - 4, n6 + n4 + 1, method_int(120, 90, 235, 30));
                            break Label_0192;
                        }
                    }
                    catch (final MatchException ex2) {
                        throw computeException((Exception)ex2);
                    }
                }
                class_332.method_25294(n5 + 8, n6 + n4 - 1, n5 + n3 - 8, n6 + n4, class_437Sub.intValue_24);
                try {
                    n12 = n5 + 4;
                    n13 = n6 + 6;
                    n14 = n5 + 5;
                    n15 = n6 + n4 - 6;
                    if (this.boolFlag_4) {
                        n16 = class_437Sub.intValue_23;
                        break Label_0243;
                    }
                }
                catch (final MatchException ex3) {
                    throw computeException((Exception)ex3);
                }
            }
            n16 = method_int(80, 70, 140, 120);
        }
        class_332.method_25294(n12, n13, n14, n15, n16);
        final String string_1 = createString_1(27900, -533);
        class_332.method_51433(this.field_22793, string_1, n5 + 8, n6 + 5, class_437Sub.intValue_30, false);
        final int method_1727 = this.field_22793.method_1727(string_1);
        String s = this.strValue_5;
        Label_0440: {
            class_327 field_22793 = null;
            String s4 = null;
            int n22 = 0;
            int n23 = 0;
            Label_0427: {
                Label_0384: {
                    String s2 = null;
                    String s3 = null;
                    Label_0377: {
                        Label_0365: {
                            Label_0333: {
                                try {
                                    if (!s.isEmpty() || this.boolFlag_4) {
                                        break Label_0333;
                                    }
                                }
                                catch (final MatchException ex4) {
                                    throw computeException((Exception)ex4);
                                }
                                s = createString_1(27875, 32053);
                                break Label_0384;
                                try {
                                    if (!this.boolFlag_4) {
                                        break Label_0384;
                                    }
                                    final class_437Sub class_437Sub = this;
                                    s2 = class_437Sub.strValue_5;
                                    final long n17 = System.currentTimeMillis();
                                    final long n18 = 1000L;
                                    final long n19 = n17 % n18;
                                    final long n20 = 500L;
                                    final long n21 = lcmp(n19, n20);
                                    if (n21 < 0) {
                                        break Label_0365;
                                    }
                                    break Label_0365;
                                }
                                catch (final MatchException ex5) {
                                    throw computeException((Exception)ex5);
                                }
                            }
                            try {
                                final class_437Sub class_437Sub = this;
                                s2 = class_437Sub.strValue_5;
                                final long n17 = System.currentTimeMillis();
                                final long n18 = 1000L;
                                final long n19 = n17 % n18;
                                final long n20 = 500L;
                                final long n21 = lcmp(n19, n20);
                                if (n21 < 0) {
                                    s3 = "_";
                                    break Label_0377;
                                }
                            }
                            catch (final MatchException ex6) {
                                throw computeException((Exception)ex6);
                            }
                        }
                        s3 = "";
                    }
                    s = s2 + s3;
                    try {
                        field_22793 = this.field_22793;
                        s4 = s;
                        n22 = n5 + 8 + method_1727;
                        n23 = n6 + 5;
                        if (!this.strValue_5.isEmpty()) {
                            break Label_0427;
                        }
                        final class_437Sub class_437Sub2 = this;
                        final boolean b = class_437Sub2.boolFlag_4;
                        if (!b) {
                            break Label_0427;
                        }
                        break Label_0427;
                    }
                    catch (final MatchException ex7) {
                        throw computeException((Exception)ex7);
                    }
                }
                try {
                    final class_437Sub class_437Sub2 = this;
                    final boolean b = class_437Sub2.boolFlag_4;
                    if (!b) {
                        final int n24 = class_437Sub.intValue_30;
                        break Label_0440;
                    }
                }
                catch (final MatchException ex8) {
                    throw computeException((Exception)ex8);
                }
            }
            final int n24 = class_437Sub.intValue_28;
            try {
                class_332.method_51433(field_22793, s4, n22, n23, n24, false);
                if (!this.boolFlag_4 || this.strValue_5.isEmpty()) {
                    return;
                }
            }
            catch (final MatchException ex9) {
                throw computeException((Exception)ex9);
            }
        }
        final String s5 = "\u00d7";
        class_332.method_51433(this.field_22793, s5, n5 + n3 - this.field_22793.method_1727(s5) - 8, n6 + 5, class_437Sub.intValue_29, false);
    }
    
    private void execute() {
        try {
            if (this.strValue_5.isEmpty()) {
                this.list_2.clear();
                return;
            }
        }
        catch (final MatchException ex) {
            throw computeException((Exception)ex);
        }
        final String lowerCase = this.strValue_5.toLowerCase();
        this.list_2 = new ArrayList<Initializer_3>();
        final Initializer[] values = Initializer.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            for (final Initializer_3 initializer_3 : com.target.mod.compat.sub1.sub2.sub1.Initializer.utilC.computeList(values[i])) {
                final String lowerCase2 = computeString_1(initializer_3.getString_1()).toLowerCase();
                try {
                    if (!lowerCase2.contains(lowerCase)) {
                        continue;
                    }
                    this.list_2.add(initializer_3);
                }
                catch (final MatchException ex2) {
                    throw computeException((Exception)ex2);
                }
            }
        }
    }
    
    private void processAll_7(final class_332 p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //     4: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //     7: isub           
        //     8: bipush          40
        //    10: isub           
        //    11: iconst_2       
        //    12: idiv           
        //    13: istore          4
        //    15: bipush          42
        //    17: istore          5
        //    19: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //    22: bipush          40
        //    24: iadd           
        //    25: istore          6
        //    27: iconst_0       
        //    28: istore          7
        //    30: aload_0        
        //    31: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //    34: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    39: astore          8
        //    41: aload           8
        //    43: invokeinterface java/util/Iterator.hasNext:()Z
        //    48: ifeq            101
        //    51: aload           8
        //    53: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    58: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //    61: astore          9
        //    63: iinc            7, 17
        //    66: aload_0        
        //    67: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_2:Ljava/util/Set;
        //    70: aload           9
        //    72: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    77: ifeq            98
        //    80: iload           7
        //    82: aload           9
        //    84: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //    87: invokeinterface java/util/List.size:()I
        //    92: bipush          16
        //    94: imul           
        //    95: iadd           
        //    96: istore          7
        //    98: goto            41
        //   101: iload           7
        //   103: sipush          360
        //   106: invokestatic    java/lang/Math.min:(II)I
        //   109: istore          8
        //   111: iload           8
        //   113: ifgt            120
        //   116: bipush          17
        //   118: istore          8
        //   120: aload_0        
        //   121: aload_1        
        //   122: iload           4
        //   124: iload           5
        //   126: iload           6
        //   128: bipush          24
        //   130: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_13:I
        //   133: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_1:(Lnet/minecraft/class_332;IIIII)V
        //   136: aload_1        
        //   137: iload           4
        //   139: iload           5
        //   141: bipush          24
        //   143: iadd           
        //   144: iconst_2       
        //   145: isub           
        //   146: iload           4
        //   148: iload           6
        //   150: iadd           
        //   151: iload           5
        //   153: bipush          24
        //   155: iadd           
        //   156: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_14:I
        //   159: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   162: aload_0        
        //   163: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //   166: invokeinterface java/util/List.size:()I
        //   171: aload_0        
        //   172: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //   175: invokeinterface java/util/List.size:()I
        //   180: iconst_1       
        //   181: if_icmpeq       194
        //   184: ldc_w           "s"
        //   187: goto            196
        //   190: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   193: athrow         
        //   194: ldc             ""
        //   196: sipush          27871
        //   199: sipush          -5064
        //   202: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   205: swap           
        //   206: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   211: astore          9
        //   213: aload_1        
        //   214: aload_0        
        //   215: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   218: aload           9
        //   220: iload           4
        //   222: bipush          8
        //   224: iadd           
        //   225: iload           5
        //   227: bipush          7
        //   229: iadd           
        //   230: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //   233: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //   236: aload_0        
        //   237: aload_1        
        //   238: iload           4
        //   240: iload           5
        //   242: bipush          24
        //   244: iadd           
        //   245: iload           6
        //   247: iload           8
        //   249: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_12:I
        //   252: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_6:(Lnet/minecraft/class_332;IIIII)V
        //   255: aload_1        
        //   256: iload           4
        //   258: iload           5
        //   260: bipush          24
        //   262: iadd           
        //   263: iload           4
        //   265: iconst_1       
        //   266: iadd           
        //   267: iload           5
        //   269: bipush          24
        //   271: iadd           
        //   272: iload           8
        //   274: iadd           
        //   275: iconst_4       
        //   276: isub           
        //   277: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_24:I
        //   280: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   283: aload_1        
        //   284: iload           4
        //   286: iload           6
        //   288: iadd           
        //   289: iconst_1       
        //   290: isub           
        //   291: iload           5
        //   293: bipush          24
        //   295: iadd           
        //   296: iload           4
        //   298: iload           6
        //   300: iadd           
        //   301: iload           5
        //   303: bipush          24
        //   305: iadd           
        //   306: iload           8
        //   308: iadd           
        //   309: iconst_4       
        //   310: isub           
        //   311: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_24:I
        //   314: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   317: aload_1        
        //   318: iload           4
        //   320: iload           5
        //   322: bipush          24
        //   324: iadd           
        //   325: iload           4
        //   327: iload           6
        //   329: iadd           
        //   330: iload           5
        //   332: bipush          24
        //   334: iadd           
        //   335: iload           8
        //   337: iadd           
        //   338: invokevirtual   net/minecraft/class_332.method_44379:(IIII)V
        //   341: iload           5
        //   343: bipush          24
        //   345: iadd           
        //   346: aload_0        
        //   347: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_3:I
        //   350: isub           
        //   351: istore          10
        //   353: aload_0        
        //   354: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //   357: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   362: astore          11
        //   364: aload           11
        //   366: invokeinterface java/util/Iterator.hasNext:()Z
        //   371: ifeq            1948
        //   374: aload           11
        //   376: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   381: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   384: astore          12
        //   386: aload           12
        //   388: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.isEnabled:()Z
        //   391: istore          13
        //   393: aload_0        
        //   394: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_2:Ljava/util/Set;
        //   397: aload           12
        //   399: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   404: istore          14
        //   406: iload_2        
        //   407: iload           4
        //   409: iconst_2       
        //   410: iadd           
        //   411: if_icmplt       504
        //   414: iload_2        
        //   415: iload           4
        //   417: iload           6
        //   419: iadd           
        //   420: iconst_2       
        //   421: isub           
        //   422: if_icmpge       504
        //   425: goto            432
        //   428: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   431: athrow         
        //   432: iload_3        
        //   433: iload           10
        //   435: if_icmplt       504
        //   438: goto            445
        //   441: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   444: athrow         
        //   445: iload_3        
        //   446: iload           10
        //   448: bipush          17
        //   450: iadd           
        //   451: if_icmpge       504
        //   454: goto            461
        //   457: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   460: athrow         
        //   461: iload_3        
        //   462: iload           5
        //   464: bipush          24
        //   466: iadd           
        //   467: if_icmplt       504
        //   470: goto            477
        //   473: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   476: athrow         
        //   477: iload_3        
        //   478: iload           5
        //   480: bipush          24
        //   482: iadd           
        //   483: iload           8
        //   485: iadd           
        //   486: if_icmpge       504
        //   489: goto            496
        //   492: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   495: athrow         
        //   496: iconst_1       
        //   497: goto            505
        //   500: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   503: athrow         
        //   504: iconst_0       
        //   505: istore          15
        //   507: iload           15
        //   509: ifeq            561
        //   512: aload           12
        //   514: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString_2:()Ljava/lang/String;
        //   517: ifnull          561
        //   520: goto            527
        //   523: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   526: athrow         
        //   527: aload           12
        //   529: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString_2:()Ljava/lang/String;
        //   532: invokevirtual   java/lang/String.isEmpty:()Z
        //   535: ifne            561
        //   538: goto            545
        //   541: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   544: athrow         
        //   545: aload_0        
        //   546: aload           12
        //   548: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString_2:()Ljava/lang/String;
        //   551: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //   554: goto            561
        //   557: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   560: athrow         
        //   561: iload           13
        //   563: ifeq            658
        //   566: aload_1        
        //   567: iload           4
        //   569: iconst_2       
        //   570: iadd           
        //   571: iload           10
        //   573: iload           4
        //   575: iload           6
        //   577: iadd           
        //   578: iconst_2       
        //   579: isub           
        //   580: iload           10
        //   582: bipush          8
        //   584: iadd           
        //   585: bipush          35
        //   587: bipush          100
        //   589: sipush          195
        //   592: sipush          200
        //   595: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   598: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   601: aload_1        
        //   602: iload           4
        //   604: iconst_2       
        //   605: iadd           
        //   606: iload           10
        //   608: bipush          8
        //   610: iadd           
        //   611: iload           4
        //   613: iload           6
        //   615: iadd           
        //   616: iconst_2       
        //   617: isub           
        //   618: iload           10
        //   620: bipush          17
        //   622: iadd           
        //   623: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_15:I
        //   626: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   629: aload_1        
        //   630: iload           4
        //   632: iconst_2       
        //   633: iadd           
        //   634: iload           10
        //   636: iload           4
        //   638: iconst_4       
        //   639: iadd           
        //   640: iload           10
        //   642: bipush          17
        //   644: iadd           
        //   645: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_14:I
        //   648: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   651: goto            727
        //   654: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   657: athrow         
        //   658: iload           15
        //   660: ifeq            727
        //   663: aload_1        
        //   664: iload           4
        //   666: iconst_2       
        //   667: iadd           
        //   668: iload           10
        //   670: iload           4
        //   672: iload           6
        //   674: iadd           
        //   675: iconst_2       
        //   676: isub           
        //   677: iload           10
        //   679: bipush          17
        //   681: iadd           
        //   682: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_16:I
        //   685: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   688: aload_1        
        //   689: iload           4
        //   691: iconst_2       
        //   692: iadd           
        //   693: iload           10
        //   695: iload           4
        //   697: iconst_3       
        //   698: iadd           
        //   699: iload           10
        //   701: bipush          17
        //   703: iadd           
        //   704: bipush          55
        //   706: sipush          130
        //   709: sipush          220
        //   712: bipush          100
        //   714: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   717: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   720: goto            727
        //   723: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   726: athrow         
        //   727: aload_0        
        //   728: aload_1        
        //   729: aload           12
        //   731: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString_1:()Ljava/lang/String;
        //   734: iload           4
        //   736: bipush          7
        //   738: iadd           
        //   739: iload           10
        //   741: iconst_4       
        //   742: iadd           
        //   743: iload           13
        //   745: ifeq            758
        //   748: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //   751: goto            776
        //   754: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   757: athrow         
        //   758: iload           15
        //   760: ifeq            773
        //   763: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //   766: goto            776
        //   769: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   772: athrow         
        //   773: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //   776: iconst_1       
        //   777: iload           6
        //   779: bipush          22
        //   781: isub           
        //   782: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //   785: pop            
        //   786: aload           12
        //   788: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //   791: invokeinterface java/util/List.isEmpty:()Z
        //   796: ifne            867
        //   799: iload           14
        //   801: ifeq            821
        //   804: goto            811
        //   807: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   810: athrow         
        //   811: ldc_w           "\u25be"
        //   814: goto            824
        //   817: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   820: athrow         
        //   821: ldc_w           "\u25b8"
        //   824: astore          16
        //   826: aload_1        
        //   827: aload_0        
        //   828: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   831: aload           16
        //   833: iload           4
        //   835: iload           6
        //   837: iadd           
        //   838: bipush          12
        //   840: isub           
        //   841: iload           10
        //   843: iconst_4       
        //   844: iadd           
        //   845: iload           13
        //   847: ifeq            860
        //   850: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //   853: goto            863
        //   856: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   859: athrow         
        //   860: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_30:I
        //   863: iconst_0       
        //   864: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //   867: iload           14
        //   869: ifne            923
        //   872: iload           13
        //   874: ifne            923
        //   877: goto            884
        //   880: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   883: athrow         
        //   884: aload_1        
        //   885: iload           4
        //   887: bipush          6
        //   889: iadd           
        //   890: iload           10
        //   892: bipush          17
        //   894: iadd           
        //   895: iconst_1       
        //   896: isub           
        //   897: iload           4
        //   899: iload           6
        //   901: iadd           
        //   902: bipush          6
        //   904: isub           
        //   905: iload           10
        //   907: bipush          17
        //   909: iadd           
        //   910: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_24:I
        //   913: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   916: goto            923
        //   919: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   922: athrow         
        //   923: iinc            10, 17
        //   926: iload           14
        //   928: ifeq            1945
        //   931: aload           12
        //   933: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //   936: astore          16
        //   938: aload           16
        //   940: invokeinterface java/util/List.size:()I
        //   945: bipush          16
        //   947: imul           
        //   948: istore          17
        //   950: aload_1        
        //   951: iload           4
        //   953: iconst_4       
        //   954: iadd           
        //   955: iload           10
        //   957: iload           4
        //   959: iload           6
        //   961: iadd           
        //   962: iconst_4       
        //   963: isub           
        //   964: iload           10
        //   966: iload           17
        //   968: iadd           
        //   969: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_17:I
        //   972: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   975: aload_1        
        //   976: iload           4
        //   978: iconst_4       
        //   979: iadd           
        //   980: iload           10
        //   982: iload           4
        //   984: bipush          6
        //   986: iadd           
        //   987: iload           10
        //   989: iload           17
        //   991: iadd           
        //   992: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //   995: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   998: iconst_0       
        //   999: istore          18
        //  1001: iload           18
        //  1003: aload           16
        //  1005: invokeinterface java/util/List.size:()I
        //  1010: if_icmpge       1938
        //  1013: aload           16
        //  1015: iload           18
        //  1017: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1022: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/Initializer;
        //  1025: astore          19
        //  1027: iload           10
        //  1029: iload           18
        //  1031: bipush          16
        //  1033: imul           
        //  1034: iadd           
        //  1035: istore          20
        //  1037: iload_2        
        //  1038: iload           4
        //  1040: iconst_4       
        //  1041: iadd           
        //  1042: if_icmplt       1135
        //  1045: iload_2        
        //  1046: iload           4
        //  1048: iload           6
        //  1050: iadd           
        //  1051: iconst_4       
        //  1052: isub           
        //  1053: if_icmpge       1135
        //  1056: goto            1063
        //  1059: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1062: athrow         
        //  1063: iload_3        
        //  1064: iload           20
        //  1066: if_icmplt       1135
        //  1069: goto            1076
        //  1072: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1075: athrow         
        //  1076: iload_3        
        //  1077: iload           20
        //  1079: bipush          16
        //  1081: iadd           
        //  1082: if_icmpge       1135
        //  1085: goto            1092
        //  1088: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1091: athrow         
        //  1092: iload_3        
        //  1093: iload           5
        //  1095: bipush          24
        //  1097: iadd           
        //  1098: if_icmplt       1135
        //  1101: goto            1108
        //  1104: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1107: athrow         
        //  1108: iload_3        
        //  1109: iload           5
        //  1111: bipush          24
        //  1113: iadd           
        //  1114: iload           8
        //  1116: iadd           
        //  1117: if_icmpge       1135
        //  1120: goto            1127
        //  1123: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1126: athrow         
        //  1127: iconst_1       
        //  1128: goto            1136
        //  1131: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1134: athrow         
        //  1135: iconst_0       
        //  1136: istore          21
        //  1138: iload           21
        //  1140: ifeq            1176
        //  1143: aload_1        
        //  1144: iload           4
        //  1146: bipush          6
        //  1148: iadd           
        //  1149: iload           20
        //  1151: iload           4
        //  1153: iload           6
        //  1155: iadd           
        //  1156: iconst_4       
        //  1157: isub           
        //  1158: iload           20
        //  1160: bipush          16
        //  1162: iadd           
        //  1163: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_16:I
        //  1166: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1169: goto            1176
        //  1172: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1175: athrow         
        //  1176: iload           18
        //  1178: ifle            1214
        //  1181: aload_1        
        //  1182: iload           4
        //  1184: bipush          12
        //  1186: iadd           
        //  1187: iload           20
        //  1189: iload           4
        //  1191: iload           6
        //  1193: iadd           
        //  1194: bipush          8
        //  1196: isub           
        //  1197: iload           20
        //  1199: iconst_1       
        //  1200: iadd           
        //  1201: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_18:I
        //  1204: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1207: goto            1214
        //  1210: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1213: athrow         
        //  1214: aload           19
        //  1216: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //  1219: ifeq            1382
        //  1222: aload           19
        //  1224: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //  1227: astore          22
        //  1229: aload_0        
        //  1230: aload_1        
        //  1231: aload           19
        //  1233: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  1236: iload           4
        //  1238: bipush          12
        //  1240: iadd           
        //  1241: iload           20
        //  1243: iconst_3       
        //  1244: iadd           
        //  1245: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1248: iconst_0       
        //  1249: iload           6
        //  1251: bipush          36
        //  1253: isub           
        //  1254: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  1257: pop            
        //  1258: iload           4
        //  1260: iload           6
        //  1262: iadd           
        //  1263: bipush          20
        //  1265: isub           
        //  1266: istore          27
        //  1268: bipush          12
        //  1270: istore          28
        //  1272: bipush          7
        //  1274: istore          29
        //  1276: iload           20
        //  1278: iconst_3       
        //  1279: iadd           
        //  1280: istore          30
        //  1282: aload_1        
        //  1283: iload           27
        //  1285: iload           30
        //  1287: iload           27
        //  1289: iload           28
        //  1291: iadd           
        //  1292: iload           30
        //  1294: iload           29
        //  1296: iadd           
        //  1297: aload           22
        //  1299: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //  1302: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1305: ifeq            1318
        //  1308: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_21:I
        //  1311: goto            1321
        //  1314: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1317: athrow         
        //  1318: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_22:I
        //  1321: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1324: aload           22
        //  1326: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //  1329: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1332: ifeq            1349
        //  1335: iload           27
        //  1337: iload           28
        //  1339: iadd           
        //  1340: iconst_4       
        //  1341: isub           
        //  1342: goto            1353
        //  1345: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1348: athrow         
        //  1349: iload           27
        //  1351: iconst_1       
        //  1352: iadd           
        //  1353: istore          31
        //  1355: aload_1        
        //  1356: iload           31
        //  1358: iload           30
        //  1360: iconst_1       
        //  1361: iadd           
        //  1362: iload           31
        //  1364: iconst_3       
        //  1365: iadd           
        //  1366: iload           30
        //  1368: iload           29
        //  1370: iadd           
        //  1371: iconst_1       
        //  1372: isub           
        //  1373: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1376: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1379: goto            1932
        //  1382: aload           19
        //  1384: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //  1387: ifeq            1495
        //  1390: aload           19
        //  1392: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //  1395: astore          23
        //  1397: sipush          27781
        //  1400: aload_0        
        //  1401: aload_1        
        //  1402: aload           19
        //  1404: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  1407: iload           4
        //  1409: bipush          12
        //  1411: iadd           
        //  1412: iload           20
        //  1414: iconst_3       
        //  1415: iadd           
        //  1416: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1419: iconst_0       
        //  1420: iload           6
        //  1422: bipush          52
        //  1424: isub           
        //  1425: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  1428: pop            
        //  1429: sipush          26424
        //  1432: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1435: iconst_1       
        //  1436: anewarray       Ljava/lang/Object;
        //  1439: dup            
        //  1440: iconst_0       
        //  1441: aload           23
        //  1443: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble:()Ljava/lang/Double;
        //  1446: aastore        
        //  1447: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1450: astore          27
        //  1452: aload_0        
        //  1453: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1456: aload           27
        //  1458: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1461: istore          28
        //  1463: aload_1        
        //  1464: aload_0        
        //  1465: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1468: aload           27
        //  1470: iload           4
        //  1472: iload           6
        //  1474: iadd           
        //  1475: iload           28
        //  1477: isub           
        //  1478: bipush          8
        //  1480: isub           
        //  1481: iload           20
        //  1483: iconst_3       
        //  1484: iadd           
        //  1485: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  1488: iconst_0       
        //  1489: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1492: goto            1932
        //  1495: aload           19
        //  1497: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2;
        //  1500: ifeq            1592
        //  1503: aload           19
        //  1505: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2;
        //  1508: astore          24
        //  1510: aload_0        
        //  1511: aload_1        
        //  1512: aload           19
        //  1514: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  1517: iload           4
        //  1519: bipush          12
        //  1521: iadd           
        //  1522: iload           20
        //  1524: iconst_3       
        //  1525: iadd           
        //  1526: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1529: iconst_0       
        //  1530: iload           6
        //  1532: bipush          56
        //  1534: isub           
        //  1535: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  1538: pop            
        //  1539: aload           24
        //  1541: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2.getString:()Ljava/lang/String;
        //  1544: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeString_1:(Ljava/lang/String;)Ljava/lang/String;
        //  1547: astore          27
        //  1549: aload_0        
        //  1550: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1553: aload           27
        //  1555: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1558: istore          28
        //  1560: aload_1        
        //  1561: aload_0        
        //  1562: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1565: aload           27
        //  1567: iload           4
        //  1569: iload           6
        //  1571: iadd           
        //  1572: iload           28
        //  1574: isub           
        //  1575: bipush          8
        //  1577: isub           
        //  1578: iload           20
        //  1580: iconst_3       
        //  1581: iadd           
        //  1582: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  1585: iconst_0       
        //  1586: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1589: goto            1932
        //  1592: aload           19
        //  1594: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //  1597: ifeq            1788
        //  1600: aload           19
        //  1602: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //  1605: astore          25
        //  1607: aload_0        
        //  1608: aload_1        
        //  1609: aload           19
        //  1611: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  1614: iload           4
        //  1616: bipush          12
        //  1618: iadd           
        //  1619: iload           20
        //  1621: iconst_3       
        //  1622: iadd           
        //  1623: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1626: iconst_0       
        //  1627: iload           6
        //  1629: bipush          50
        //  1631: isub           
        //  1632: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  1635: pop            
        //  1636: aload_0        
        //  1637: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //  1640: aload           25
        //  1642: if_acmpne       1661
        //  1645: sipush          27865
        //  1648: sipush          -17701
        //  1651: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1654: goto            1669
        //  1657: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1660: athrow         
        //  1661: aload           25
        //  1663: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.getInt:()I
        //  1666: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_9.computeString:(I)Ljava/lang/String;
        //  1669: astore          27
        //  1671: aload           27
        //  1673: ifnull          1715
        //  1676: aload           27
        //  1678: invokevirtual   java/lang/String.isEmpty:()Z
        //  1681: ifne            1715
        //  1684: goto            1691
        //  1687: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1690: athrow         
        //  1691: aload           27
        //  1693: sipush          27880
        //  1696: sipush          19605
        //  1699: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1702: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1705: ifeq            1726
        //  1708: goto            1715
        //  1711: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1714: athrow         
        //  1715: sipush          27873
        //  1718: sipush          15337
        //  1721: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1724: astore          27
        //  1726: aload_0        
        //  1727: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1730: aload           27
        //  1732: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1735: istore          28
        //  1737: aload_1        
        //  1738: aload_0        
        //  1739: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1742: aload           27
        //  1744: iload           4
        //  1746: iload           6
        //  1748: iadd           
        //  1749: iload           28
        //  1751: isub           
        //  1752: bipush          8
        //  1754: isub           
        //  1755: iload           20
        //  1757: iconst_3       
        //  1758: iadd           
        //  1759: aload_0        
        //  1760: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //  1763: aload           25
        //  1765: if_acmpne       1778
        //  1768: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //  1771: goto            1781
        //  1774: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1777: athrow         
        //  1778: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  1781: iconst_0       
        //  1782: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1785: goto            1932
        //  1788: aload           19
        //  1790: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //  1793: ifeq            1932
        //  1796: aload           19
        //  1798: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //  1801: astore          26
        //  1803: aload_0        
        //  1804: aload_1        
        //  1805: aload           19
        //  1807: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  1810: iload           4
        //  1812: bipush          12
        //  1814: iadd           
        //  1815: iload           20
        //  1817: iconst_3       
        //  1818: iadd           
        //  1819: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1822: iconst_0       
        //  1823: iload           6
        //  1825: bipush          56
        //  1827: isub           
        //  1828: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  1831: pop            
        //  1832: aload           26
        //  1834: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4.getString:()Ljava/lang/String;
        //  1837: astore          27
        //  1839: aload           27
        //  1841: invokevirtual   java/lang/String.length:()I
        //  1844: bipush          12
        //  1846: if_icmple       1873
        //  1849: aload           27
        //  1851: iconst_0       
        //  1852: bipush          12
        //  1854: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1857: sipush          27885
        //  1860: sipush          7705
        //  1863: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1866: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1871: astore          27
        //  1873: aload_0        
        //  1874: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1877: aload           27
        //  1879: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1882: istore          28
        //  1884: aload_1        
        //  1885: aload_0        
        //  1886: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1889: aload           27
        //  1891: iload           4
        //  1893: iload           6
        //  1895: iadd           
        //  1896: iload           28
        //  1898: isub           
        //  1899: bipush          8
        //  1901: isub           
        //  1902: iload           20
        //  1904: iconst_3       
        //  1905: iadd           
        //  1906: aload_0        
        //  1907: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.itemG:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //  1910: aload           26
        //  1912: if_acmpne       1925
        //  1915: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //  1918: goto            1928
        //  1921: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1924: athrow         
        //  1925: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  1928: iconst_0       
        //  1929: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1932: iinc            18, 1
        //  1935: goto            1001
        //  1938: iload           10
        //  1940: iload           17
        //  1942: iadd           
        //  1943: istore          10
        //  1945: goto            364
        //  1948: aload_1        
        //  1949: invokevirtual   net/minecraft/class_332.method_44380:()V
        //  1952: return         
        //    StackMapTable: 00 60 FF 00 29 00 09 07 00 02 07 01 2C 01 01 01 01 01 01 07 01 E9 00 00 FC 00 38 07 02 52 FA 00 02 FF 00 12 00 09 07 00 02 07 01 2C 01 01 01 01 01 01 01 00 00 F7 00 45 07 01 1C 43 01 FF 00 01 00 09 07 00 02 07 01 2C 01 01 01 01 01 01 01 00 02 01 07 00 EF FE 00 A7 07 00 EF 01 07 01 E9 FF 00 3F 00 0F 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 00 01 07 01 1C 03 48 07 01 1C 03 4B 07 01 1C 03 4B 07 01 1C 03 4E 07 01 1C 03 43 07 01 1C 03 40 01 FF 00 11 00 10 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 00 01 07 01 1C 03 4D 07 01 1C 03 4B 07 01 1C 03 F7 00 5C 07 01 1C 03 F7 00 40 07 01 1C 03 5A 07 01 1C FF 00 03 00 10 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 00 05 07 00 02 07 01 2C 07 00 EF 01 01 4A 07 01 1C FF 00 03 00 10 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 00 05 07 00 02 07 01 2C 07 00 EF 01 01 FF 00 02 00 10 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 00 06 07 00 02 07 01 2C 07 00 EF 01 01 01 5E 07 01 1C 03 45 07 01 1C 03 42 07 00 EF FF 00 1F 00 11 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 00 EF 00 01 07 01 1C FF 00 03 00 11 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 11 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FA 00 03 4C 07 01 1C 03 62 07 01 1C 03 FE 00 4D 07 01 08 01 01 FF 00 39 00 15 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 00 01 07 01 1C 03 48 07 01 1C 03 4B 07 01 1C 03 4B 07 01 1C 03 4E 07 01 1C 03 43 07 01 1C 03 40 01 FF 00 23 00 16 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 01 07 01 1C 03 61 07 01 1C 03 FF 00 63 00 1F 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 00 00 00 01 01 01 01 00 01 07 01 1C FF 00 03 00 1F 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 00 00 00 01 01 01 01 00 05 07 01 2C 01 01 01 01 FF 00 02 00 1F 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 00 00 00 01 01 01 01 00 06 07 01 2C 01 01 01 01 01 57 07 01 1C 03 43 01 FF 00 1C 00 16 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 FB 00 70 FB 00 60 FF 00 40 00 1A 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 01 07 01 1C 03 47 07 00 EF FF 00 11 00 1C 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 07 00 EF 00 01 07 01 1C 03 53 07 01 1C 03 0A FF 00 2F 00 1D 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 07 00 EF 01 00 01 07 01 1C FF 00 03 00 1D 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 07 00 EF 01 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 1D 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 07 00 EF 01 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 06 00 16 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 FF 00 54 00 1C 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 00 07 02 04 07 00 EF 00 00 FF 00 2F 00 1D 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 00 07 02 04 07 00 EF 01 00 01 07 01 1C FF 00 03 00 1D 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 00 07 02 04 07 00 EF 01 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 1D 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 00 07 02 04 07 00 EF 01 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 03 00 16 07 00 02 07 01 2C 01 01 01 01 01 01 01 07 00 EF 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 F8 00 05 F8 00 06 FF 00 02 00 02 07 00 02 07 01 2C 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  120    190    190    194    Ljava/lang/MatchException;
        //  406    425    428    432    Ljava/lang/MatchException;
        //  414    438    441    445    Ljava/lang/MatchException;
        //  432    454    457    461    Ljava/lang/MatchException;
        //  445    470    473    477    Ljava/lang/MatchException;
        //  461    489    492    496    Ljava/lang/MatchException;
        //  477    500    500    504    Ljava/lang/MatchException;
        //  507    520    523    527    Ljava/lang/MatchException;
        //  512    538    541    545    Ljava/lang/MatchException;
        //  527    554    557    561    Ljava/lang/MatchException;
        //  561    654    654    658    Ljava/lang/MatchException;
        //  658    720    723    727    Ljava/lang/MatchException;
        //  727    754    754    758    Ljava/lang/MatchException;
        //  758    769    769    773    Ljava/lang/MatchException;
        //  776    804    807    811    Ljava/lang/MatchException;
        //  799    817    817    821    Ljava/lang/MatchException;
        //  826    856    856    860    Ljava/lang/MatchException;
        //  867    877    880    884    Ljava/lang/MatchException;
        //  872    916    919    923    Ljava/lang/MatchException;
        //  1037   1056   1059   1063   Ljava/lang/MatchException;
        //  1045   1069   1072   1076   Ljava/lang/MatchException;
        //  1063   1085   1088   1092   Ljava/lang/MatchException;
        //  1076   1101   1104   1108   Ljava/lang/MatchException;
        //  1092   1120   1123   1127   Ljava/lang/MatchException;
        //  1108   1131   1131   1135   Ljava/lang/MatchException;
        //  1138   1169   1172   1176   Ljava/lang/MatchException;
        //  1176   1207   1210   1214   Ljava/lang/MatchException;
        //  1282   1314   1314   1318   Ljava/lang/MatchException;
        //  1321   1345   1345   1349   Ljava/lang/MatchException;
        //  1607   1657   1657   1661   Ljava/lang/MatchException;
        //  1671   1684   1687   1691   Ljava/lang/MatchException;
        //  1676   1708   1711   1715   Ljava/lang/MatchException;
        //  1737   1774   1774   1778   Ljava/lang/MatchException;
        //  1884   1921   1921   1925   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0432:
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
    
    private void execute_1() {
        this.floatArray = new float[200];
        this.floatArray_1 = new float[200];
        this.floatArray_2 = new float[200];
        this.floatArray_3 = new float[200];
        int i = 0;
        try {
            while (i < 200) {
                this.floatArray[i] = this.random.nextFloat() * 2000.0f;
                this.floatArray_1[i] = this.random.nextFloat() * 1200.0f;
                this.floatArray_2[i] = 0.15f + this.random.nextFloat() * 0.8f;
                this.floatArray_3[i] = (float)(1 + this.random.nextInt(3));
                ++i;
            }
        }
        catch (final MatchException ex) {
            throw computeException((Exception)ex);
        }
        this.boolFlag_5 = true;
    }
    
    private void setClass_332AndFloat(final class_332 class_332, final float n) {
        try {
            if (!this.boolFlag_5) {
                this.execute_1();
            }
        }
        catch (final MatchException ex) {
            throw computeException((Exception)ex);
        }
        int n2 = 0;
        while (true) {
            Label_0107: {
                try {
                    if (n2 >= 200) {
                        break;
                    }
                    final class_437Sub class_437Sub = this;
                    final float[] array = class_437Sub.floatArray_1;
                    final int n3 = n2;
                    final float n4 = array[n3];
                    final class_437Sub class_437Sub2 = this;
                    final float[] array2 = class_437Sub2.floatArray_2;
                    final int n5 = n2;
                    final float n6 = array2[n5];
                    final float n7 = n;
                    final float n8 = n6 * n7;
                    final float n9 = 1.5f;
                    final float n10 = n8 * n9;
                    final float n11 = n4 + n10;
                    array[n3] = n11;
                    final class_437Sub class_437Sub3 = this;
                    final float[] array3 = class_437Sub3.floatArray;
                    final int n12 = n2;
                    final float n13 = array3[n12];
                    final class_437Sub class_437Sub4 = this;
                    final float[] array4 = class_437Sub4.floatArray_1;
                    final int n14 = n2;
                    final float n15 = array4[n14];
                    final float n16 = 0.015f;
                    final float n17 = n15 * n16;
                    final int n18 = n2;
                    final float n19 = (float)n18;
                    final float n20 = 0.7f;
                    final float n21 = n19 * n20;
                    final float n22 = n17 + n21;
                    final double n23 = n22;
                    final double n24 = Math.sin(n23);
                    final float n25 = (float)n24;
                    final float n26 = 0.2f;
                    final float n27 = n25 * n26;
                    final float n28 = n13 + n27;
                    array3[n12] = n28;
                    final class_437Sub class_437Sub5 = this;
                    final float[] array5 = class_437Sub5.floatArray_1;
                    final int n29 = n2;
                    final float n30 = array5[n29];
                    final class_437Sub class_437Sub6 = this;
                    final int n31 = class_437Sub6.intValue_5;
                    final int n32 = 5;
                    final int n33 = n31 + n32;
                    final float n34 = (float)n33;
                    final float n35 = fcmpl(n30, n34);
                    if (n35 > 0) {
                        break Label_0107;
                    }
                    break Label_0107;
                }
                catch (final MatchException ex2) {
                    throw computeException((Exception)ex2);
                }
                try {
                    final class_437Sub class_437Sub = this;
                    final float[] array = class_437Sub.floatArray_1;
                    final int n3 = n2;
                    final float n4 = array[n3];
                    final class_437Sub class_437Sub2 = this;
                    final float[] array2 = class_437Sub2.floatArray_2;
                    final int n5 = n2;
                    final float n6 = array2[n5];
                    final float n7 = n;
                    final float n8 = n6 * n7;
                    final float n9 = 1.5f;
                    final float n10 = n8 * n9;
                    final float n11 = n4 + n10;
                    array[n3] = n11;
                    final class_437Sub class_437Sub3 = this;
                    final float[] array3 = class_437Sub3.floatArray;
                    final int n12 = n2;
                    final float n13 = array3[n12];
                    final class_437Sub class_437Sub4 = this;
                    final float[] array4 = class_437Sub4.floatArray_1;
                    final int n14 = n2;
                    final float n15 = array4[n14];
                    final float n16 = 0.015f;
                    final float n17 = n15 * n16;
                    final int n18 = n2;
                    final float n19 = (float)n18;
                    final float n20 = 0.7f;
                    final float n21 = n19 * n20;
                    final float n22 = n17 + n21;
                    final double n23 = n22;
                    final double n24 = Math.sin(n23);
                    final float n25 = (float)n24;
                    final float n26 = 0.2f;
                    final float n27 = n25 * n26;
                    final float n28 = n13 + n27;
                    array3[n12] = n28;
                    final class_437Sub class_437Sub5 = this;
                    final float[] array5 = class_437Sub5.floatArray_1;
                    final int n29 = n2;
                    final float n30 = array5[n29];
                    final class_437Sub class_437Sub6 = this;
                    final int n31 = class_437Sub6.intValue_5;
                    final int n32 = 5;
                    final int n33 = n31 + n32;
                    final float n34 = (float)n33;
                    final float n35 = fcmpl(n30, n34);
                    if (n35 > 0) {
                        this.floatArray_1[n2] = (float)(-this.random.nextInt(20));
                        this.floatArray[n2] = this.random.nextFloat() * this.intValue_4;
                        this.floatArray_2[n2] = 0.15f + this.random.nextFloat() * 0.8f;
                        this.floatArray_3[n2] = (float)(1 + this.random.nextInt(3));
                    }
                }
                catch (final MatchException ex3) {
                    throw computeException((Exception)ex3);
                }
            }
            final int n36 = (int)this.floatArray[n2];
            final int n37 = (int)this.floatArray_1[n2];
            final int n38 = (int)this.floatArray_3[n2];
            final int n39 = 20 + (int)(this.floatArray_2[n2] * 50.0f);
            if (n38 >= 3) {
                class_332.method_25294(n36 - 1, n37 - 1, n36 + n38 + 1, n37 + n38 + 1, method_int(180, 160, 240, n39 / 3));
            }
            class_332.method_25294(n36, n37, n36 + n38, n37 + n38, method_int(200, 190, 245, n39));
            ++n2;
        }
    }
    
    private void processAll_9(final class_332 p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //     4: bipush          8
        //     6: isub           
        //     7: istore          4
        //     9: iconst_3       
        //    10: anewarray       Ljava/lang/String;
        //    13: dup            
        //    14: iconst_0       
        //    15: sipush          27884
        //    18: sipush          -31781
        //    21: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //    24: aastore        
        //    25: dup            
        //    26: iconst_1       
        //    27: sipush          27867
        //    30: sipush          14625
        //    33: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //    36: aastore        
        //    37: dup            
        //    38: iconst_2       
        //    39: sipush          27853
        //    42: sipush          14543
        //    45: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //    48: aastore        
        //    49: astore          5
        //    51: aload_0        
        //    52: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strArr:[Ljava/lang/String;
        //    55: arraylength    
        //    56: iconst_1       
        //    57: isub           
        //    58: istore          6
        //    60: iload           6
        //    62: iflt            565
        //    65: aload_0        
        //    66: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //    69: aload_0        
        //    70: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strArr:[Ljava/lang/String;
        //    73: iload           6
        //    75: aaload         
        //    76: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //    79: bipush          28
        //    81: iadd           
        //    82: istore          7
        //    84: aload_0        
        //    85: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intArr:[I
        //    88: iload           6
        //    90: iload           7
        //    92: iastore        
        //    93: iload           4
        //    95: iload           7
        //    97: isub           
        //    98: istore          4
        //   100: aload_0        
        //   101: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //   104: bipush          28
        //   106: isub           
        //   107: istore          8
        //   109: iload_2        
        //   110: iload           4
        //   112: if_icmplt       168
        //   115: iload_2        
        //   116: iload           4
        //   118: iload           7
        //   120: iadd           
        //   121: if_icmpge       168
        //   124: goto            131
        //   127: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   130: athrow         
        //   131: iload_3        
        //   132: iload           8
        //   134: if_icmplt       168
        //   137: goto            144
        //   140: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   143: athrow         
        //   144: iload_3        
        //   145: iload           8
        //   147: bipush          21
        //   149: iadd           
        //   150: if_icmpge       168
        //   153: goto            160
        //   156: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   159: athrow         
        //   160: iconst_1       
        //   161: goto            169
        //   164: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   167: athrow         
        //   168: iconst_0       
        //   169: istore          9
        //   171: iload           9
        //   173: ifeq            206
        //   176: aload_0        
        //   177: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //   180: ifnonnull       206
        //   183: goto            190
        //   186: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   189: athrow         
        //   190: aload_0        
        //   191: aload           5
        //   193: iload           6
        //   195: aaload         
        //   196: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //   199: goto            206
        //   202: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   205: athrow         
        //   206: aload_0        
        //   207: aload_1        
        //   208: iload           4
        //   210: iload           8
        //   212: iload           7
        //   214: bipush          21
        //   216: iload           9
        //   218: ifeq            240
        //   221: bipush          28
        //   223: bipush          24
        //   225: bipush          48
        //   227: sipush          240
        //   230: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   233: goto            252
        //   236: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   239: athrow         
        //   240: bipush          16
        //   242: bipush          16
        //   244: bipush          24
        //   246: sipush          230
        //   249: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   252: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //   255: aload_1        
        //   256: iload           4
        //   258: bipush          6
        //   260: iadd           
        //   261: iload           8
        //   263: iload           4
        //   265: iload           7
        //   267: iconst_2       
        //   268: idiv           
        //   269: iadd           
        //   270: iload           8
        //   272: iconst_1       
        //   273: iadd           
        //   274: iload           9
        //   276: ifeq            300
        //   279: sipush          140
        //   282: bipush          110
        //   284: sipush          255
        //   287: sipush          255
        //   290: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   293: goto            313
        //   296: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   299: athrow         
        //   300: bipush          100
        //   302: bipush          80
        //   304: sipush          220
        //   307: sipush          180
        //   310: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   313: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   316: aload_1        
        //   317: iload           4
        //   319: iload           7
        //   321: iconst_2       
        //   322: idiv           
        //   323: iadd           
        //   324: iload           8
        //   326: iload           4
        //   328: iload           7
        //   330: iadd           
        //   331: bipush          6
        //   333: isub           
        //   334: iload           8
        //   336: iconst_1       
        //   337: iadd           
        //   338: iload           9
        //   340: ifeq            365
        //   343: sipush          180
        //   346: sipush          140
        //   349: sipush          255
        //   352: sipush          255
        //   355: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   358: goto            379
        //   361: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   364: athrow         
        //   365: sipush          140
        //   368: bipush          100
        //   370: sipush          240
        //   373: sipush          140
        //   376: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   379: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   382: aload_1        
        //   383: iload           4
        //   385: bipush          6
        //   387: iadd           
        //   388: iload           8
        //   390: bipush          20
        //   392: iadd           
        //   393: iload           4
        //   395: iload           7
        //   397: iadd           
        //   398: bipush          6
        //   400: isub           
        //   401: iload           8
        //   403: bipush          21
        //   405: iadd           
        //   406: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_24:I
        //   409: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   412: iload           9
        //   414: ifeq            492
        //   417: aload_1        
        //   418: iload           4
        //   420: iload           8
        //   422: iconst_4       
        //   423: iadd           
        //   424: iload           4
        //   426: iconst_1       
        //   427: iadd           
        //   428: iload           8
        //   430: bipush          17
        //   432: iadd           
        //   433: bipush          120
        //   435: bipush          90
        //   437: sipush          235
        //   440: bipush          100
        //   442: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   445: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   448: aload_1        
        //   449: iload           4
        //   451: iload           7
        //   453: iadd           
        //   454: iconst_1       
        //   455: isub           
        //   456: iload           8
        //   458: iconst_4       
        //   459: iadd           
        //   460: iload           4
        //   462: iload           7
        //   464: iadd           
        //   465: iload           8
        //   467: bipush          17
        //   469: iadd           
        //   470: bipush          120
        //   472: bipush          90
        //   474: sipush          235
        //   477: bipush          100
        //   479: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   482: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   485: goto            492
        //   488: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   491: athrow         
        //   492: iload           4
        //   494: iload           7
        //   496: aload_0        
        //   497: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   500: aload_0        
        //   501: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strArr:[Ljava/lang/String;
        //   504: iload           6
        //   506: aaload         
        //   507: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //   510: isub           
        //   511: iconst_2       
        //   512: idiv           
        //   513: iadd           
        //   514: istore          10
        //   516: aload_1        
        //   517: aload_0        
        //   518: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   521: aload_0        
        //   522: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strArr:[Ljava/lang/String;
        //   525: iload           6
        //   527: aaload         
        //   528: iload           10
        //   530: iload           8
        //   532: bipush          6
        //   534: iadd           
        //   535: iload           9
        //   537: ifeq            550
        //   540: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //   543: goto            553
        //   546: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   549: athrow         
        //   550: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //   553: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //   556: iinc            4, -6
        //   559: iinc            6, -1
        //   562: goto            60
        //   565: return         
        //    StackMapTable: 00 1D FE 00 3C 01 07 02 E1 01 FF 00 42 00 09 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 00 01 07 01 1C 03 48 07 01 1C 03 4B 07 01 1C 03 43 07 01 1C 03 40 01 FF 00 10 00 0A 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 00 01 07 01 1C 03 4B 07 01 1C 03 5D 07 01 1C FF 00 03 00 0A 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 0B 00 0A 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 6B 07 01 1C FF 00 03 00 0A 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 00 05 07 01 2C 01 01 01 01 FF 00 0C 00 0A 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 00 06 07 01 2C 01 01 01 01 01 6F 07 01 1C FF 00 03 00 0A 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 00 05 07 01 2C 01 01 01 01 FF 00 0D 00 0A 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 00 06 07 01 2C 01 01 01 01 01 F7 00 6C 07 01 1C 03 FF 00 35 00 0B 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 01 00 01 07 01 1C FF 00 03 00 0B 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 01 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 0B 07 00 02 07 01 2C 01 01 01 07 02 E1 01 01 01 01 01 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 0B 00 01 07 00 02 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  109    124    127    131    Ljava/lang/MatchException;
        //  115    137    140    144    Ljava/lang/MatchException;
        //  131    153    156    160    Ljava/lang/MatchException;
        //  144    164    164    168    Ljava/lang/MatchException;
        //  171    183    186    190    Ljava/lang/MatchException;
        //  176    199    202    206    Ljava/lang/MatchException;
        //  206    236    236    240    Ljava/lang/MatchException;
        //  252    296    296    300    Ljava/lang/MatchException;
        //  313    361    361    365    Ljava/lang/MatchException;
        //  379    485    488    492    Ljava/lang/MatchException;
        //  516    546    546    550    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0131:
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
    
    private void processAll_3(final class_332 p0, final Initializer p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map:Ljava/util/Map;
        //     4: aload_2        
        //     5: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    10: checkcast       Ljava/lang/Integer;
        //    13: invokevirtual   java/lang/Integer.intValue:()I
        //    16: istore          5
        //    18: aload_0        
        //    19: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map_1:Ljava/util/Map;
        //    22: aload_2        
        //    23: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    28: checkcast       Ljava/lang/Integer;
        //    31: invokevirtual   java/lang/Integer.intValue:()I
        //    34: istore          6
        //    36: aload_0        
        //    37: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map_2:Ljava/util/Map;
        //    40: aload_2        
        //    41: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    46: checkcast       Ljava/lang/Integer;
        //    49: invokevirtual   java/lang/Integer.intValue:()I
        //    52: istore          7
        //    54: getstatic       com/target/mod/compat/sub1/sub2/sub1/Initializer.utilC:Lcom/target/mod/compat/sub1/sub2/sub1/Initializer;
        //    57: aload_2        
        //    58: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/Initializer.computeList:(Lcom/target/mod/compat/sub1/sub2/sub2/Initializer;)Ljava/util/List;
        //    61: astore          8
        //    63: iconst_0       
        //    64: istore          9
        //    66: aload           8
        //    68: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    73: astore          10
        //    75: aload           10
        //    77: invokeinterface java/util/Iterator.hasNext:()Z
        //    82: ifeq            135
        //    85: aload           10
        //    87: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    92: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //    95: astore          11
        //    97: iinc            9, 17
        //   100: aload_0        
        //   101: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set:Ljava/util/Set;
        //   104: aload           11
        //   106: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   111: ifeq            132
        //   114: iload           9
        //   116: aload           11
        //   118: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //   121: invokeinterface java/util/List.size:()I
        //   126: bipush          16
        //   128: imul           
        //   129: iadd           
        //   130: istore          9
        //   132: goto            75
        //   135: iload           9
        //   137: sipush          360
        //   140: invokestatic    java/lang/Math.min:(II)I
        //   143: istore          10
        //   145: iload           10
        //   147: ifgt            154
        //   150: bipush          17
        //   152: istore          10
        //   154: aload_0        
        //   155: aload_1        
        //   156: iload           5
        //   158: iload           6
        //   160: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   163: bipush          24
        //   165: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_13:I
        //   168: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_1:(Lnet/minecraft/class_332;IIIII)V
        //   171: aload_1        
        //   172: iload           5
        //   174: iconst_4       
        //   175: iadd           
        //   176: iload           6
        //   178: iload           5
        //   180: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   183: iadd           
        //   184: iconst_4       
        //   185: isub           
        //   186: iload           6
        //   188: iconst_1       
        //   189: iadd           
        //   190: sipush          255
        //   193: sipush          255
        //   196: sipush          255
        //   199: bipush          10
        //   201: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   204: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   207: aload_1        
        //   208: iload           5
        //   210: iload           6
        //   212: bipush          24
        //   214: iadd           
        //   215: iconst_2       
        //   216: isub           
        //   217: iload           5
        //   219: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   222: iconst_2       
        //   223: idiv           
        //   224: iadd           
        //   225: iload           6
        //   227: bipush          24
        //   229: iadd           
        //   230: bipush          100
        //   232: bipush          80
        //   234: sipush          220
        //   237: sipush          255
        //   240: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   243: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   246: aload_1        
        //   247: iload           5
        //   249: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   252: iconst_2       
        //   253: idiv           
        //   254: iadd           
        //   255: iload           6
        //   257: bipush          24
        //   259: iadd           
        //   260: iconst_2       
        //   261: isub           
        //   262: iload           5
        //   264: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   267: iadd           
        //   268: iload           6
        //   270: bipush          24
        //   272: iadd           
        //   273: sipush          160
        //   276: bipush          100
        //   278: sipush          255
        //   281: sipush          255
        //   284: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   287: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   290: aload_1        
        //   291: iload           5
        //   293: iconst_4       
        //   294: iadd           
        //   295: iload           6
        //   297: bipush          24
        //   299: iadd           
        //   300: iload           5
        //   302: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   305: iadd           
        //   306: iconst_4       
        //   307: isub           
        //   308: iload           6
        //   310: bipush          24
        //   312: iadd           
        //   313: iconst_1       
        //   314: iadd           
        //   315: bipush          120
        //   317: bipush          90
        //   319: sipush          235
        //   322: bipush          50
        //   324: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   327: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   330: aload_0        
        //   331: aload_1        
        //   332: aload_2        
        //   333: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer.getString:()Ljava/lang/String;
        //   336: iload           5
        //   338: bipush          8
        //   340: iadd           
        //   341: iload           6
        //   343: bipush          8
        //   345: iadd           
        //   346: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //   349: iconst_1       
        //   350: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   353: bipush          28
        //   355: isub           
        //   356: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //   359: pop            
        //   360: aload_0        
        //   361: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_1:Ljava/util/Set;
        //   364: aload_2        
        //   365: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   370: istore          11
        //   372: iload           11
        //   374: ifeq            387
        //   377: ldc_w           "\u25b6"
        //   380: goto            390
        //   383: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   386: athrow         
        //   387: ldc_w           "\u25bc"
        //   390: astore          12
        //   392: aload_1        
        //   393: aload_0        
        //   394: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   397: aload           12
        //   399: iload           5
        //   401: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   404: iadd           
        //   405: bipush          14
        //   407: isub           
        //   408: iload           6
        //   410: bipush          8
        //   412: iadd           
        //   413: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_30:I
        //   416: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //   419: iload           11
        //   421: ifeq            429
        //   424: return         
        //   425: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   428: athrow         
        //   429: aload_1        
        //   430: iload           5
        //   432: iconst_2       
        //   433: iadd           
        //   434: iload           6
        //   436: bipush          24
        //   438: iadd           
        //   439: iconst_2       
        //   440: iadd           
        //   441: iload           5
        //   443: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   446: iadd           
        //   447: iconst_2       
        //   448: iadd           
        //   449: iload           6
        //   451: bipush          24
        //   453: iadd           
        //   454: iload           10
        //   456: iadd           
        //   457: iconst_2       
        //   458: iadd           
        //   459: iconst_0       
        //   460: iconst_0       
        //   461: iconst_0       
        //   462: bipush          30
        //   464: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   467: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   470: aload_1        
        //   471: iload           5
        //   473: iconst_3       
        //   474: iadd           
        //   475: iload           6
        //   477: bipush          24
        //   479: iadd           
        //   480: iconst_3       
        //   481: iadd           
        //   482: iload           5
        //   484: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   487: iadd           
        //   488: iconst_1       
        //   489: iadd           
        //   490: iload           6
        //   492: bipush          24
        //   494: iadd           
        //   495: iload           10
        //   497: iadd           
        //   498: iconst_1       
        //   499: iadd           
        //   500: iconst_0       
        //   501: iconst_0       
        //   502: iconst_0       
        //   503: bipush          15
        //   505: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   508: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   511: aload_0        
        //   512: aload_1        
        //   513: iload           5
        //   515: iload           6
        //   517: bipush          24
        //   519: iadd           
        //   520: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   523: iload           10
        //   525: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_12:I
        //   528: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_6:(Lnet/minecraft/class_332;IIIII)V
        //   531: ldc2_w          40.0
        //   534: ldc2_w          20.0
        //   537: aload_0        
        //   538: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.floatValue:F
        //   541: f2d            
        //   542: ldc2_w          3.141592653589793
        //   545: dmul           
        //   546: ldc2_w          6.0
        //   549: dmul           
        //   550: aload_2        
        //   551: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer.ordinal:()I
        //   554: i2d            
        //   555: dadd           
        //   556: invokestatic    java/lang/Math.sin:(D)D
        //   559: dmul           
        //   560: dadd           
        //   561: d2i            
        //   562: istore          13
        //   564: aload_1        
        //   565: iload           5
        //   567: iload           6
        //   569: bipush          24
        //   571: iadd           
        //   572: iload           5
        //   574: iconst_1       
        //   575: iadd           
        //   576: iload           6
        //   578: bipush          24
        //   580: iadd           
        //   581: iload           10
        //   583: iadd           
        //   584: iconst_4       
        //   585: isub           
        //   586: bipush          100
        //   588: bipush          80
        //   590: sipush          200
        //   593: iload           13
        //   595: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   598: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   601: aload_1        
        //   602: iload           5
        //   604: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   607: iadd           
        //   608: iconst_1       
        //   609: isub           
        //   610: iload           6
        //   612: bipush          24
        //   614: iadd           
        //   615: iload           5
        //   617: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   620: iadd           
        //   621: iload           6
        //   623: bipush          24
        //   625: iadd           
        //   626: iload           10
        //   628: iadd           
        //   629: iconst_4       
        //   630: isub           
        //   631: bipush          100
        //   633: bipush          80
        //   635: sipush          200
        //   638: iload           13
        //   640: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   643: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   646: aload_1        
        //   647: iload           5
        //   649: iconst_5       
        //   650: iadd           
        //   651: iload           6
        //   653: bipush          24
        //   655: iadd           
        //   656: iload           10
        //   658: iadd           
        //   659: iconst_1       
        //   660: isub           
        //   661: iload           5
        //   663: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   666: iadd           
        //   667: iconst_5       
        //   668: isub           
        //   669: iload           6
        //   671: bipush          24
        //   673: iadd           
        //   674: iload           10
        //   676: iadd           
        //   677: bipush          100
        //   679: bipush          80
        //   681: sipush          200
        //   684: iload           13
        //   686: iconst_2       
        //   687: idiv           
        //   688: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   691: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   694: aload_1        
        //   695: iload           5
        //   697: iload           6
        //   699: bipush          24
        //   701: iadd           
        //   702: iload           5
        //   704: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   707: iadd           
        //   708: iload           6
        //   710: bipush          24
        //   712: iadd           
        //   713: iload           10
        //   715: iadd           
        //   716: invokevirtual   net/minecraft/class_332.method_44379:(IIII)V
        //   719: iload           6
        //   721: bipush          24
        //   723: iadd           
        //   724: iload           7
        //   726: isub           
        //   727: istore          14
        //   729: aload           8
        //   731: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   736: astore          15
        //   738: aload           15
        //   740: invokeinterface java/util/Iterator.hasNext:()Z
        //   745: ifeq            2841
        //   748: aload           15
        //   750: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   755: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   758: astore          16
        //   760: aload           16
        //   762: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.isEnabled:()Z
        //   765: istore          17
        //   767: aload_0        
        //   768: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set:Ljava/util/Set;
        //   771: aload           16
        //   773: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   778: istore          18
        //   780: iload_3        
        //   781: iload           5
        //   783: iconst_2       
        //   784: iadd           
        //   785: if_icmplt       883
        //   788: iload_3        
        //   789: iload           5
        //   791: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   794: iadd           
        //   795: iconst_2       
        //   796: isub           
        //   797: if_icmpge       883
        //   800: goto            807
        //   803: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   806: athrow         
        //   807: iload           4
        //   809: iload           14
        //   811: if_icmplt       883
        //   814: goto            821
        //   817: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   820: athrow         
        //   821: iload           4
        //   823: iload           14
        //   825: bipush          17
        //   827: iadd           
        //   828: if_icmpge       883
        //   831: goto            838
        //   834: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   837: athrow         
        //   838: iload           4
        //   840: iload           6
        //   842: bipush          24
        //   844: iadd           
        //   845: if_icmplt       883
        //   848: goto            855
        //   851: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   854: athrow         
        //   855: iload           4
        //   857: iload           6
        //   859: bipush          24
        //   861: iadd           
        //   862: iload           10
        //   864: iadd           
        //   865: if_icmpge       883
        //   868: goto            875
        //   871: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   874: athrow         
        //   875: iconst_1       
        //   876: goto            884
        //   879: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   882: athrow         
        //   883: iconst_0       
        //   884: istore          19
        //   886: iload           19
        //   888: ifeq            940
        //   891: aload           16
        //   893: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString_2:()Ljava/lang/String;
        //   896: ifnull          940
        //   899: goto            906
        //   902: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   905: athrow         
        //   906: aload           16
        //   908: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString_2:()Ljava/lang/String;
        //   911: invokevirtual   java/lang/String.isEmpty:()Z
        //   914: ifne            940
        //   917: goto            924
        //   920: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   923: athrow         
        //   924: aload_0        
        //   925: aload           16
        //   927: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString_2:()Ljava/lang/String;
        //   930: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //   933: goto            940
        //   936: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   939: athrow         
        //   940: iload           17
        //   942: ifeq            1119
        //   945: aload_1        
        //   946: iload           5
        //   948: iconst_2       
        //   949: iadd           
        //   950: iload           14
        //   952: iload           5
        //   954: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   957: iadd           
        //   958: iconst_2       
        //   959: isub           
        //   960: iload           14
        //   962: iconst_5       
        //   963: iadd           
        //   964: bipush          70
        //   966: bipush          45
        //   968: sipush          175
        //   971: sipush          160
        //   974: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   977: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   980: aload_1        
        //   981: iload           5
        //   983: iconst_2       
        //   984: iadd           
        //   985: iload           14
        //   987: iconst_5       
        //   988: iadd           
        //   989: iload           5
        //   991: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   994: iadd           
        //   995: iconst_2       
        //   996: isub           
        //   997: iload           14
        //   999: bipush          11
        //  1001: iadd           
        //  1002: bipush          85
        //  1004: bipush          55
        //  1006: sipush          195
        //  1009: sipush          170
        //  1012: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1015: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1018: aload_1        
        //  1019: iload           5
        //  1021: iconst_2       
        //  1022: iadd           
        //  1023: iload           14
        //  1025: bipush          11
        //  1027: iadd           
        //  1028: iload           5
        //  1030: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1033: iadd           
        //  1034: iconst_2       
        //  1035: isub           
        //  1036: iload           14
        //  1038: bipush          17
        //  1040: iadd           
        //  1041: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_15:I
        //  1044: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1047: aload_1        
        //  1048: iload           5
        //  1050: iconst_2       
        //  1051: iadd           
        //  1052: iload           14
        //  1054: iload           5
        //  1056: iconst_4       
        //  1057: iadd           
        //  1058: iload           14
        //  1060: bipush          17
        //  1062: iadd           
        //  1063: sipush          140
        //  1066: bipush          110
        //  1068: sipush          255
        //  1071: sipush          255
        //  1074: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1077: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1080: aload_1        
        //  1081: iload           5
        //  1083: iconst_4       
        //  1084: iadd           
        //  1085: iload           14
        //  1087: iload           5
        //  1089: iconst_5       
        //  1090: iadd           
        //  1091: iload           14
        //  1093: bipush          17
        //  1095: iadd           
        //  1096: sipush          140
        //  1099: bipush          110
        //  1101: sipush          255
        //  1104: bipush          40
        //  1106: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1109: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1112: goto            1188
        //  1115: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1118: athrow         
        //  1119: iload           19
        //  1121: ifeq            1188
        //  1124: aload_1        
        //  1125: iload           5
        //  1127: iconst_2       
        //  1128: iadd           
        //  1129: iload           14
        //  1131: iload           5
        //  1133: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1136: iadd           
        //  1137: iconst_2       
        //  1138: isub           
        //  1139: iload           14
        //  1141: bipush          17
        //  1143: iadd           
        //  1144: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_16:I
        //  1147: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1150: aload_1        
        //  1151: iload           5
        //  1153: iconst_2       
        //  1154: iadd           
        //  1155: iload           14
        //  1157: iload           5
        //  1159: iconst_3       
        //  1160: iadd           
        //  1161: iload           14
        //  1163: bipush          17
        //  1165: iadd           
        //  1166: bipush          120
        //  1168: bipush          90
        //  1170: sipush          235
        //  1173: bipush          120
        //  1175: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1178: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1181: goto            1188
        //  1184: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1187: athrow         
        //  1188: aload_0        
        //  1189: aload_1        
        //  1190: aload           16
        //  1192: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString_1:()Ljava/lang/String;
        //  1195: iload           5
        //  1197: bipush          7
        //  1199: iadd           
        //  1200: iload           14
        //  1202: iconst_4       
        //  1203: iadd           
        //  1204: iload           17
        //  1206: ifeq            1219
        //  1209: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1212: goto            1237
        //  1215: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1218: athrow         
        //  1219: iload           19
        //  1221: ifeq            1234
        //  1224: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1227: goto            1237
        //  1230: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1233: athrow         
        //  1234: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1237: iconst_1       
        //  1238: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1241: bipush          22
        //  1243: isub           
        //  1244: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  1247: pop            
        //  1248: aload           16
        //  1250: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //  1253: invokeinterface java/util/List.isEmpty:()Z
        //  1258: ifne            1330
        //  1261: iload           18
        //  1263: ifeq            1283
        //  1266: goto            1273
        //  1269: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1272: athrow         
        //  1273: ldc_w           "\u25be"
        //  1276: goto            1286
        //  1279: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1282: athrow         
        //  1283: ldc_w           "\u25b8"
        //  1286: astore          20
        //  1288: aload_1        
        //  1289: aload_0        
        //  1290: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1293: aload           20
        //  1295: iload           5
        //  1297: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1300: iadd           
        //  1301: bipush          12
        //  1303: isub           
        //  1304: iload           14
        //  1306: iconst_4       
        //  1307: iadd           
        //  1308: iload           17
        //  1310: ifeq            1323
        //  1313: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1316: goto            1326
        //  1319: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1322: athrow         
        //  1323: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_30:I
        //  1326: iconst_0       
        //  1327: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1330: iload           18
        //  1332: ifne            1387
        //  1335: iload           17
        //  1337: ifne            1387
        //  1340: goto            1347
        //  1343: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1346: athrow         
        //  1347: aload_1        
        //  1348: iload           5
        //  1350: bipush          6
        //  1352: iadd           
        //  1353: iload           14
        //  1355: bipush          17
        //  1357: iadd           
        //  1358: iconst_1       
        //  1359: isub           
        //  1360: iload           5
        //  1362: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1365: iadd           
        //  1366: bipush          6
        //  1368: isub           
        //  1369: iload           14
        //  1371: bipush          17
        //  1373: iadd           
        //  1374: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_24:I
        //  1377: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1380: goto            1387
        //  1383: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1386: athrow         
        //  1387: iinc            14, 17
        //  1390: iload           18
        //  1392: ifeq            2838
        //  1395: aload           16
        //  1397: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //  1400: astore          20
        //  1402: aload           20
        //  1404: invokeinterface java/util/List.size:()I
        //  1409: bipush          16
        //  1411: imul           
        //  1412: istore          21
        //  1414: aload_1        
        //  1415: iload           5
        //  1417: iconst_4       
        //  1418: iadd           
        //  1419: iload           14
        //  1421: iload           5
        //  1423: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1426: iadd           
        //  1427: iconst_4       
        //  1428: isub           
        //  1429: iload           14
        //  1431: iload           21
        //  1433: iadd           
        //  1434: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_17:I
        //  1437: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1440: aload_1        
        //  1441: iload           5
        //  1443: iconst_4       
        //  1444: iadd           
        //  1445: iload           14
        //  1447: iload           5
        //  1449: bipush          6
        //  1451: iadd           
        //  1452: iload           14
        //  1454: iload           21
        //  1456: iadd           
        //  1457: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //  1460: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1463: iconst_0       
        //  1464: istore          22
        //  1466: iload           22
        //  1468: aload           20
        //  1470: invokeinterface java/util/List.size:()I
        //  1475: if_icmpge       2831
        //  1478: aload           20
        //  1480: iload           22
        //  1482: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1487: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/Initializer;
        //  1490: astore          23
        //  1492: iload           14
        //  1494: iload           22
        //  1496: bipush          16
        //  1498: imul           
        //  1499: iadd           
        //  1500: istore          24
        //  1502: iload_3        
        //  1503: iload           5
        //  1505: iconst_4       
        //  1506: iadd           
        //  1507: if_icmplt       1605
        //  1510: iload_3        
        //  1511: iload           5
        //  1513: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1516: iadd           
        //  1517: iconst_4       
        //  1518: isub           
        //  1519: if_icmpge       1605
        //  1522: goto            1529
        //  1525: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1528: athrow         
        //  1529: iload           4
        //  1531: iload           24
        //  1533: if_icmplt       1605
        //  1536: goto            1543
        //  1539: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1542: athrow         
        //  1543: iload           4
        //  1545: iload           24
        //  1547: bipush          16
        //  1549: iadd           
        //  1550: if_icmpge       1605
        //  1553: goto            1560
        //  1556: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1559: athrow         
        //  1560: iload           4
        //  1562: iload           6
        //  1564: bipush          24
        //  1566: iadd           
        //  1567: if_icmplt       1605
        //  1570: goto            1577
        //  1573: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1576: athrow         
        //  1577: iload           4
        //  1579: iload           6
        //  1581: bipush          24
        //  1583: iadd           
        //  1584: iload           10
        //  1586: iadd           
        //  1587: if_icmpge       1605
        //  1590: goto            1597
        //  1593: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1596: athrow         
        //  1597: iconst_1       
        //  1598: goto            1606
        //  1601: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1604: athrow         
        //  1605: iconst_0       
        //  1606: istore          25
        //  1608: iload           25
        //  1610: ifeq            1647
        //  1613: aload_1        
        //  1614: iload           5
        //  1616: bipush          6
        //  1618: iadd           
        //  1619: iload           24
        //  1621: iload           5
        //  1623: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1626: iadd           
        //  1627: iconst_4       
        //  1628: isub           
        //  1629: iload           24
        //  1631: bipush          16
        //  1633: iadd           
        //  1634: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_16:I
        //  1637: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1640: goto            1647
        //  1643: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1646: athrow         
        //  1647: iload           22
        //  1649: ifle            1686
        //  1652: aload_1        
        //  1653: iload           5
        //  1655: bipush          12
        //  1657: iadd           
        //  1658: iload           24
        //  1660: iload           5
        //  1662: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1665: iadd           
        //  1666: bipush          8
        //  1668: isub           
        //  1669: iload           24
        //  1671: iconst_1       
        //  1672: iadd           
        //  1673: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_18:I
        //  1676: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1679: goto            1686
        //  1682: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1685: athrow         
        //  1686: aload           23
        //  1688: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //  1691: ifeq            1959
        //  1694: aload           23
        //  1696: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //  1699: astore          26
        //  1701: aload_0        
        //  1702: aload_1        
        //  1703: aload           23
        //  1705: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  1708: iload           5
        //  1710: bipush          12
        //  1712: iadd           
        //  1713: iload           24
        //  1715: iconst_4       
        //  1716: iadd           
        //  1717: iload           25
        //  1719: ifeq            1732
        //  1722: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1725: goto            1735
        //  1728: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1731: athrow         
        //  1732: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1735: iconst_0       
        //  1736: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1739: bipush          40
        //  1741: isub           
        //  1742: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  1745: pop            
        //  1746: iload           5
        //  1748: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1751: iadd           
        //  1752: bipush          24
        //  1754: isub           
        //  1755: istore          32
        //  1757: bipush          16
        //  1759: istore          33
        //  1761: bipush          8
        //  1763: istore          34
        //  1765: iload           24
        //  1767: iconst_4       
        //  1768: iadd           
        //  1769: istore          35
        //  1771: aload_1        
        //  1772: iload           32
        //  1774: iload           35
        //  1776: iload           32
        //  1778: iload           33
        //  1780: iadd           
        //  1781: iload           35
        //  1783: iload           34
        //  1785: iadd           
        //  1786: aload           26
        //  1788: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //  1791: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1794: ifeq            1807
        //  1797: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_21:I
        //  1800: goto            1810
        //  1803: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1806: athrow         
        //  1807: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_22:I
        //  1810: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1813: aload_1        
        //  1814: iload           32
        //  1816: iload           35
        //  1818: iload           32
        //  1820: iload           33
        //  1822: iadd           
        //  1823: iload           35
        //  1825: iconst_1       
        //  1826: iadd           
        //  1827: iconst_0       
        //  1828: iconst_0       
        //  1829: iconst_0       
        //  1830: bipush          30
        //  1832: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1835: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1838: aload           26
        //  1840: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //  1843: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1846: ifeq            1863
        //  1849: iload           32
        //  1851: iload           33
        //  1853: iadd           
        //  1854: iconst_5       
        //  1855: isub           
        //  1856: goto            1867
        //  1859: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1862: athrow         
        //  1863: iload           32
        //  1865: iconst_1       
        //  1866: iadd           
        //  1867: istore          36
        //  1869: aload_1        
        //  1870: iload           36
        //  1872: iload           35
        //  1874: iconst_1       
        //  1875: iadd           
        //  1876: iload           36
        //  1878: iconst_4       
        //  1879: iadd           
        //  1880: iload           35
        //  1882: iload           34
        //  1884: iadd           
        //  1885: iconst_1       
        //  1886: isub           
        //  1887: sipush          240
        //  1890: sipush          240
        //  1893: sipush          255
        //  1896: sipush          255
        //  1899: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1902: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1905: aload           26
        //  1907: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //  1910: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1913: ifeq            1956
        //  1916: aload_1        
        //  1917: iload           32
        //  1919: iconst_1       
        //  1920: isub           
        //  1921: iload           35
        //  1923: iconst_1       
        //  1924: isub           
        //  1925: iload           32
        //  1927: iload           33
        //  1929: iadd           
        //  1930: iconst_1       
        //  1931: iadd           
        //  1932: iload           35
        //  1934: bipush          120
        //  1936: bipush          90
        //  1938: sipush          235
        //  1941: bipush          50
        //  1943: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1946: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1949: goto            1956
        //  1952: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1955: athrow         
        //  1956: goto            2825
        //  1959: aload           23
        //  1961: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //  1964: ifeq            2285
        //  1967: aload           23
        //  1969: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //  1972: astore          27
        //  1974: aload_0        
        //  1975: aload_1        
        //  1976: aload           23
        //  1978: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  1981: iload           5
        //  1983: bipush          12
        //  1985: iadd           
        //  1986: iload           24
        //  1988: iconst_3       
        //  1989: iadd           
        //  1990: iload           25
        //  1992: ifeq            2005
        //  1995: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1998: goto            2008
        //  2001: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2004: athrow         
        //  2005: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  2008: iconst_0       
        //  2009: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2012: bipush          56
        //  2014: isub           
        //  2015: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  2018: pop            
        //  2019: sipush          27855
        //  2022: sipush          -12130
        //  2025: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2028: iconst_1       
        //  2029: anewarray       Ljava/lang/Object;
        //  2032: dup            
        //  2033: iconst_0       
        //  2034: aload           27
        //  2036: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble:()Ljava/lang/Double;
        //  2039: aastore        
        //  2040: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  2043: astore          32
        //  2045: aload_0        
        //  2046: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2049: aload           32
        //  2051: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2054: istore          33
        //  2056: aload_1        
        //  2057: aload_0        
        //  2058: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2061: aload           32
        //  2063: iload           5
        //  2065: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2068: iadd           
        //  2069: iload           33
        //  2071: isub           
        //  2072: bipush          8
        //  2074: isub           
        //  2075: iload           24
        //  2077: iconst_3       
        //  2078: iadd           
        //  2079: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  2082: iconst_0       
        //  2083: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  2086: iload           24
        //  2088: bipush          16
        //  2090: iadd           
        //  2091: iconst_3       
        //  2092: isub           
        //  2093: istore          34
        //  2095: dconst_0       
        //  2096: dstore          35
        //  2098: aload           27
        //  2100: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble_2:()D
        //  2103: aload           27
        //  2105: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble_1:()D
        //  2108: dsub           
        //  2109: dconst_0       
        //  2110: dcmpl          
        //  2111: ifle            2142
        //  2114: aload           27
        //  2116: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble:()Ljava/lang/Double;
        //  2119: invokevirtual   java/lang/Double.doubleValue:()D
        //  2122: aload           27
        //  2124: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble_1:()D
        //  2127: dsub           
        //  2128: aload           27
        //  2130: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble_2:()D
        //  2133: aload           27
        //  2135: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble_1:()D
        //  2138: dsub           
        //  2139: ddiv           
        //  2140: dstore          35
        //  2142: dconst_0       
        //  2143: dconst_1       
        //  2144: dload           35
        //  2146: invokestatic    java/lang/Math.min:(DD)D
        //  2149: invokestatic    java/lang/Math.max:(DD)D
        //  2152: dstore          35
        //  2154: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2157: bipush          24
        //  2159: isub           
        //  2160: istore          37
        //  2162: dload           35
        //  2164: iload           37
        //  2166: i2d            
        //  2167: dmul           
        //  2168: d2i            
        //  2169: istore          38
        //  2171: aload_1        
        //  2172: iload           5
        //  2174: bipush          12
        //  2176: iadd           
        //  2177: iload           34
        //  2179: iload           5
        //  2181: bipush          12
        //  2183: iadd           
        //  2184: iload           37
        //  2186: iadd           
        //  2187: iload           34
        //  2189: iconst_2       
        //  2190: iadd           
        //  2191: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_19:I
        //  2194: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  2197: iload           38
        //  2199: ifle            2282
        //  2202: aload_1        
        //  2203: iload           5
        //  2205: bipush          12
        //  2207: iadd           
        //  2208: iload           34
        //  2210: iload           5
        //  2212: bipush          12
        //  2214: iadd           
        //  2215: iload           38
        //  2217: iadd           
        //  2218: iload           34
        //  2220: iconst_2       
        //  2221: iadd           
        //  2222: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_20:I
        //  2225: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  2228: aload_1        
        //  2229: iload           5
        //  2231: bipush          12
        //  2233: iadd           
        //  2234: iload           38
        //  2236: iadd           
        //  2237: iconst_1       
        //  2238: isub           
        //  2239: iload           34
        //  2241: iconst_1       
        //  2242: isub           
        //  2243: iload           5
        //  2245: bipush          12
        //  2247: iadd           
        //  2248: iload           38
        //  2250: iadd           
        //  2251: iconst_1       
        //  2252: iadd           
        //  2253: iload           34
        //  2255: iconst_3       
        //  2256: iadd           
        //  2257: sipush          180
        //  2260: sipush          160
        //  2263: sipush          255
        //  2266: sipush          255
        //  2269: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  2272: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  2275: goto            2282
        //  2278: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2281: athrow         
        //  2282: goto            2825
        //  2285: aload           23
        //  2287: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2;
        //  2290: ifeq            2384
        //  2293: aload           23
        //  2295: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2;
        //  2298: astore          28
        //  2300: aload_0        
        //  2301: aload_1        
        //  2302: aload           23
        //  2304: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  2307: iload           5
        //  2309: bipush          12
        //  2311: iadd           
        //  2312: iload           24
        //  2314: iconst_3       
        //  2315: iadd           
        //  2316: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  2319: iconst_0       
        //  2320: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2323: bipush          56
        //  2325: isub           
        //  2326: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  2329: pop            
        //  2330: aload           28
        //  2332: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2.getString:()Ljava/lang/String;
        //  2335: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeString_1:(Ljava/lang/String;)Ljava/lang/String;
        //  2338: astore          32
        //  2340: aload_0        
        //  2341: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2344: aload           32
        //  2346: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2349: istore          33
        //  2351: aload_1        
        //  2352: aload_0        
        //  2353: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2356: aload           32
        //  2358: iload           5
        //  2360: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2363: iadd           
        //  2364: iload           33
        //  2366: isub           
        //  2367: bipush          8
        //  2369: isub           
        //  2370: iload           24
        //  2372: iconst_3       
        //  2373: iadd           
        //  2374: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  2377: iconst_0       
        //  2378: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  2381: goto            2825
        //  2384: aload           23
        //  2386: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //  2389: ifeq            2580
        //  2392: aload           23
        //  2394: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //  2397: astore          29
        //  2399: aload_0        
        //  2400: aload_1        
        //  2401: aload           23
        //  2403: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  2406: iload           5
        //  2408: bipush          12
        //  2410: iadd           
        //  2411: iload           24
        //  2413: iconst_3       
        //  2414: iadd           
        //  2415: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  2418: iconst_0       
        //  2419: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2422: bipush          50
        //  2424: isub           
        //  2425: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  2428: pop            
        //  2429: aload_0        
        //  2430: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //  2433: aload           29
        //  2435: if_acmpne       2452
        //  2438: sipush          27902
        //  2441: sipush          17923
        //  2444: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2447: astore          32
        //  2449: goto            2517
        //  2452: aload           29
        //  2454: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.getInt:()I
        //  2457: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_9.computeString:(I)Ljava/lang/String;
        //  2460: astore          32
        //  2462: aload           32
        //  2464: ifnull          2506
        //  2467: aload           32
        //  2469: invokevirtual   java/lang/String.isEmpty:()Z
        //  2472: ifne            2506
        //  2475: goto            2482
        //  2478: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2481: athrow         
        //  2482: aload           32
        //  2484: sipush          27845
        //  2487: sipush          -2461
        //  2490: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2493: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2496: ifeq            2517
        //  2499: goto            2506
        //  2502: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2505: athrow         
        //  2506: sipush          27899
        //  2509: sipush          -14637
        //  2512: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2515: astore          32
        //  2517: aload_0        
        //  2518: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2521: aload           32
        //  2523: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2526: istore          33
        //  2528: aload_1        
        //  2529: aload_0        
        //  2530: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2533: aload           32
        //  2535: iload           5
        //  2537: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2540: iadd           
        //  2541: iload           33
        //  2543: isub           
        //  2544: bipush          8
        //  2546: isub           
        //  2547: iload           24
        //  2549: iconst_3       
        //  2550: iadd           
        //  2551: aload_0        
        //  2552: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //  2555: aload           29
        //  2557: if_acmpne       2570
        //  2560: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //  2563: goto            2573
        //  2566: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2569: athrow         
        //  2570: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  2573: iconst_0       
        //  2574: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  2577: goto            2825
        //  2580: aload           23
        //  2582: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub;
        //  2585: ifeq            2679
        //  2588: aload           23
        //  2590: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub;
        //  2593: astore          30
        //  2595: aload_0        
        //  2596: aload_1        
        //  2597: aload           23
        //  2599: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  2602: iload           5
        //  2604: bipush          12
        //  2606: iadd           
        //  2607: iload           24
        //  2609: iconst_3       
        //  2610: iadd           
        //  2611: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  2614: iconst_0       
        //  2615: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2618: bipush          50
        //  2620: isub           
        //  2621: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  2624: pop            
        //  2625: aload           30
        //  2627: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub.getString:()Ljava/lang/String;
        //  2630: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeString_1:(Ljava/lang/String;)Ljava/lang/String;
        //  2633: astore          32
        //  2635: aload_0        
        //  2636: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2639: aload           32
        //  2641: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2644: istore          33
        //  2646: aload_1        
        //  2647: aload_0        
        //  2648: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2651: aload           32
        //  2653: iload           5
        //  2655: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2658: iadd           
        //  2659: iload           33
        //  2661: isub           
        //  2662: bipush          8
        //  2664: isub           
        //  2665: iload           24
        //  2667: iconst_3       
        //  2668: iadd           
        //  2669: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_30:I
        //  2672: iconst_0       
        //  2673: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  2676: goto            2825
        //  2679: aload           23
        //  2681: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //  2684: ifeq            2825
        //  2687: aload           23
        //  2689: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //  2692: astore          31
        //  2694: aload_0        
        //  2695: aload_1        
        //  2696: aload           23
        //  2698: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //  2701: iload           5
        //  2703: bipush          12
        //  2705: iadd           
        //  2706: iload           24
        //  2708: iconst_3       
        //  2709: iadd           
        //  2710: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  2713: iconst_0       
        //  2714: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2717: bipush          56
        //  2719: isub           
        //  2720: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  2723: pop            
        //  2724: aload           31
        //  2726: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4.getString:()Ljava/lang/String;
        //  2729: astore          32
        //  2731: aload           32
        //  2733: invokevirtual   java/lang/String.length:()I
        //  2736: bipush          12
        //  2738: if_icmple       2765
        //  2741: aload           32
        //  2743: iconst_0       
        //  2744: bipush          12
        //  2746: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  2749: sipush          27841
        //  2752: sipush          -17312
        //  2755: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2758: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2763: astore          32
        //  2765: aload_0        
        //  2766: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2769: aload           32
        //  2771: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2774: istore          33
        //  2776: aload_1        
        //  2777: aload_0        
        //  2778: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2781: aload           32
        //  2783: iload           5
        //  2785: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  2788: iadd           
        //  2789: iload           33
        //  2791: isub           
        //  2792: bipush          8
        //  2794: isub           
        //  2795: iload           24
        //  2797: iconst_3       
        //  2798: iadd           
        //  2799: aload_0        
        //  2800: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.itemG:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //  2803: aload           31
        //  2805: if_acmpne       2818
        //  2808: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //  2811: goto            2821
        //  2814: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2817: athrow         
        //  2818: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  2821: iconst_0       
        //  2822: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  2825: iinc            22, 1
        //  2828: goto            1466
        //  2831: iload           14
        //  2833: iload           21
        //  2835: iadd           
        //  2836: istore          14
        //  2838: goto            738
        //  2841: aload_1        
        //  2842: invokevirtual   net/minecraft/class_332.method_44380:()V
        //  2845: return         
        //    StackMapTable: 00 6C FF 00 4B 00 0B 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 07 01 E9 00 00 FC 00 38 07 02 52 FA 00 02 FF 00 12 00 0B 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 00 00 FF 00 E4 00 0C 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 00 01 07 01 1C 03 42 07 00 EF FF 00 22 00 0D 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 00 01 07 01 1C 03 FE 01 34 01 01 07 01 E9 FF 00 40 00 13 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 00 01 07 01 1C 03 49 07 01 1C 03 4C 07 01 1C 03 4C 07 01 1C 03 4F 07 01 1C 03 43 07 01 1C 03 40 01 FF 00 11 00 14 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 00 01 07 01 1C 03 4D 07 01 1C 03 4B 07 01 1C 03 F7 00 AE 07 01 1C 03 F7 00 40 07 01 1C 03 5A 07 01 1C FF 00 03 00 14 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 00 05 07 00 02 07 01 2C 07 00 EF 01 01 4A 07 01 1C FF 00 03 00 14 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 00 05 07 00 02 07 01 2C 07 00 EF 01 01 FF 00 02 00 14 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 00 06 07 00 02 07 01 2C 07 00 EF 01 01 01 5F 07 01 1C 03 45 07 01 1C 03 42 07 00 EF FF 00 20 00 15 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 00 EF 00 01 07 01 1C FF 00 03 00 15 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 15 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FA 00 03 4C 07 01 1C 03 63 07 01 1C 03 FE 00 4E 07 01 08 01 01 FF 00 3A 00 19 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 00 01 07 01 1C 03 49 07 01 1C 03 4C 07 01 1C 03 4C 07 01 1C 03 4F 07 01 1C 03 43 07 01 1C 03 40 01 FF 00 24 00 1A 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 01 07 01 1C 03 62 07 01 1C 03 FF 00 29 00 1B 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 01 07 01 1C FF 00 03 00 1B 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 05 07 00 02 07 01 2C 07 00 EF 01 01 FF 00 02 00 1B 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 06 07 00 02 07 01 2C 07 00 EF 01 01 01 FF 00 43 00 24 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 00 00 00 00 01 01 01 01 00 01 07 01 1C FF 00 03 00 24 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 00 00 00 00 01 01 01 01 00 05 07 01 2C 01 01 01 01 FF 00 02 00 24 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 00 00 00 00 01 01 01 01 00 06 07 01 2C 01 01 01 01 01 70 07 01 1C 03 43 01 FF 00 54 00 25 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 07 02 94 00 00 00 00 00 01 01 01 01 01 00 01 07 01 1C 03 FF 00 02 00 1A 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 FF 00 29 00 1C 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 07 02 A4 00 01 07 01 1C FF 00 03 00 1C 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 07 02 A4 00 05 07 00 02 07 01 2C 07 00 EF 01 01 FF 00 02 00 1C 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 07 02 A4 00 06 07 00 02 07 01 2C 07 00 EF 01 01 01 FF 00 85 00 24 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 07 02 A4 00 00 00 00 07 00 EF 01 01 03 00 00 FF 00 87 00 26 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 07 02 A4 00 00 00 00 07 00 EF 01 01 03 01 01 00 01 07 01 1C 03 FF 00 02 00 1A 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 FB 00 62 FF 00 43 00 1E 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 00 FF 00 19 00 21 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 00 07 00 EF 00 01 07 01 1C 03 53 07 01 1C 03 0A FF 00 30 00 22 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 00 07 00 EF 01 00 01 07 01 1C FF 00 03 00 22 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 00 07 00 EF 01 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 22 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 07 02 B3 00 00 07 00 EF 01 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 06 00 1A 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 FB 00 62 FF 00 55 00 21 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 00 00 07 02 04 07 00 EF 00 00 FF 00 30 00 22 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 00 00 07 02 04 07 00 EF 01 00 01 07 01 1C FF 00 03 00 22 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 00 00 07 02 04 07 00 EF 01 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 22 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 00 00 00 07 02 04 07 00 EF 01 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 03 00 1A 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 07 02 52 01 01 01 07 01 08 01 01 07 02 90 01 01 00 00 F8 00 05 F8 00 06 FF 00 02 00 10 07 00 02 07 01 2C 07 00 F5 01 01 01 01 01 07 01 08 01 01 01 07 00 EF 01 01 07 01 E9 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  372    383    383    387    Ljava/lang/MatchException;
        //  392    425    425    429    Ljava/lang/MatchException;
        //  780    800    803    807    Ljava/lang/MatchException;
        //  788    814    817    821    Ljava/lang/MatchException;
        //  807    831    834    838    Ljava/lang/MatchException;
        //  821    848    851    855    Ljava/lang/MatchException;
        //  838    868    871    875    Ljava/lang/MatchException;
        //  855    879    879    883    Ljava/lang/MatchException;
        //  886    899    902    906    Ljava/lang/MatchException;
        //  891    917    920    924    Ljava/lang/MatchException;
        //  906    933    936    940    Ljava/lang/MatchException;
        //  940    1115   1115   1119   Ljava/lang/MatchException;
        //  1119   1181   1184   1188   Ljava/lang/MatchException;
        //  1188   1215   1215   1219   Ljava/lang/MatchException;
        //  1219   1230   1230   1234   Ljava/lang/MatchException;
        //  1237   1266   1269   1273   Ljava/lang/MatchException;
        //  1261   1279   1279   1283   Ljava/lang/MatchException;
        //  1288   1319   1319   1323   Ljava/lang/MatchException;
        //  1330   1340   1343   1347   Ljava/lang/MatchException;
        //  1335   1380   1383   1387   Ljava/lang/MatchException;
        //  1502   1522   1525   1529   Ljava/lang/MatchException;
        //  1510   1536   1539   1543   Ljava/lang/MatchException;
        //  1529   1553   1556   1560   Ljava/lang/MatchException;
        //  1543   1570   1573   1577   Ljava/lang/MatchException;
        //  1560   1590   1593   1597   Ljava/lang/MatchException;
        //  1577   1601   1601   1605   Ljava/lang/MatchException;
        //  1608   1640   1643   1647   Ljava/lang/MatchException;
        //  1647   1679   1682   1686   Ljava/lang/MatchException;
        //  1701   1728   1728   1732   Ljava/lang/MatchException;
        //  1771   1803   1803   1807   Ljava/lang/MatchException;
        //  1810   1859   1859   1863   Ljava/lang/MatchException;
        //  1869   1949   1952   1956   Ljava/lang/MatchException;
        //  1974   2001   2001   2005   Ljava/lang/MatchException;
        //  2171   2275   2278   2282   Ljava/lang/MatchException;
        //  2462   2475   2478   2482   Ljava/lang/MatchException;
        //  2467   2499   2502   2506   Ljava/lang/MatchException;
        //  2528   2566   2566   2570   Ljava/lang/MatchException;
        //  2776   2814   2814   2818   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0807:
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
    
    private String computeString(final Initializer initializer) {
        try {
            switch (com.target.mod.compat.sub1.sub2.sub5.Initializer.intArr[initializer.ordinal()]) {
                default: {
                    throw new MatchException((String)null, (Throwable)null);
                }
                case 1: {
                    break;
                }
                case 2: {
                    return "\u25c9";
                }
                case 3: {
                    return "\u2726";
                }
                case 4: {
                    return "\u2699";
                }
                case 5: {
                    return "\u2697";
                }
                case 6: {
                    return "\u25cf";
                }
                case 7: {
                    return "\u26a1";
                }
            }
        }
        catch (final MatchException ex) {
            throw computeException((Exception)ex);
        }
        return "\u2694";
        s = "\u25c9";
        return s;
        s = "\u2726";
        return s;
        s = "\u2699";
        return s;
        s = "\u2697";
        return s;
        s = "\u25cf";
        return s;
        s = "\u26a1";
        return s;
    }
    
    private void processAll_4(final class_332 p0, final String p1, final String p2, final int p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          6
        //     5: aload_0        
        //     6: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //     9: aload           6
        //    11: ifnonnull       27
        //    14: ifeq            30
        //    17: goto            24
        //    20: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    23: athrow         
        //    24: sipush          360
        //    27: goto            33
        //    30: sipush          240
        //    33: istore          7
        //    35: aload_0        
        //    36: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //    39: aload           6
        //    41: ifnonnull       57
        //    44: ifeq            60
        //    47: goto            54
        //    50: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    53: athrow         
        //    54: sipush          240
        //    57: goto            63
        //    60: sipush          140
        //    63: istore          8
        //    65: aload_0        
        //    66: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //    69: iload           7
        //    71: isub           
        //    72: iconst_2       
        //    73: idiv           
        //    74: istore          9
        //    76: aload_0        
        //    77: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //    80: iload           8
        //    82: isub           
        //    83: iconst_2       
        //    84: idiv           
        //    85: istore          10
        //    87: aload_0        
        //    88: aload_1        
        //    89: iload           9
        //    91: iload           10
        //    93: iload           7
        //    95: iload           8
        //    97: bipush          12
        //    99: bipush          12
        //   101: bipush          20
        //   103: sipush          245
        //   106: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   109: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //   112: aload_1        
        //   113: iload           9
        //   115: iconst_5       
        //   116: iadd           
        //   117: iload           10
        //   119: iload           9
        //   121: iload           7
        //   123: iadd           
        //   124: iconst_5       
        //   125: isub           
        //   126: iload           10
        //   128: iconst_2       
        //   129: iadd           
        //   130: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //   133: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   136: aload_1        
        //   137: iload           9
        //   139: iload           10
        //   141: iconst_4       
        //   142: iadd           
        //   143: iload           9
        //   145: iconst_1       
        //   146: iadd           
        //   147: iload           10
        //   149: iload           8
        //   151: iadd           
        //   152: iconst_4       
        //   153: isub           
        //   154: bipush          50
        //   156: bipush          55
        //   158: bipush          75
        //   160: bipush          100
        //   162: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   165: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   168: aload_1        
        //   169: iload           9
        //   171: iload           7
        //   173: iadd           
        //   174: iconst_1       
        //   175: isub           
        //   176: iload           10
        //   178: iconst_4       
        //   179: iadd           
        //   180: iload           9
        //   182: iload           7
        //   184: iadd           
        //   185: iload           10
        //   187: iload           8
        //   189: iadd           
        //   190: iconst_4       
        //   191: isub           
        //   192: bipush          50
        //   194: bipush          55
        //   196: bipush          75
        //   198: bipush          100
        //   200: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   203: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   206: aload_1        
        //   207: iload           9
        //   209: iconst_4       
        //   210: iadd           
        //   211: iload           10
        //   213: iload           8
        //   215: iadd           
        //   216: iconst_1       
        //   217: isub           
        //   218: iload           9
        //   220: iload           7
        //   222: iadd           
        //   223: iconst_4       
        //   224: isub           
        //   225: iload           10
        //   227: iload           8
        //   229: iadd           
        //   230: bipush          50
        //   232: bipush          55
        //   234: bipush          75
        //   236: bipush          100
        //   238: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   241: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   244: aload_1        
        //   245: aload_0        
        //   246: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   249: aload_2        
        //   250: iload           9
        //   252: bipush          12
        //   254: iadd           
        //   255: iload           10
        //   257: bipush          10
        //   259: iadd           
        //   260: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //   263: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //   266: aload_1        
        //   267: iload           9
        //   269: bipush          8
        //   271: iadd           
        //   272: iload           10
        //   274: bipush          24
        //   276: iadd           
        //   277: iload           9
        //   279: iload           7
        //   281: iadd           
        //   282: bipush          8
        //   284: isub           
        //   285: iload           10
        //   287: bipush          25
        //   289: iadd           
        //   290: bipush          55
        //   292: sipush          130
        //   295: sipush          220
        //   298: bipush          80
        //   300: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   303: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   306: aload_0        
        //   307: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //   310: aload           6
        //   312: ifnonnull       3184
        //   315: ifeq            3173
        //   318: goto            325
        //   321: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   324: athrow         
        //   325: iload           9
        //   327: bipush          10
        //   329: iadd           
        //   330: istore          11
        //   332: sipush          27843
        //   335: iload           10
        //   337: bipush          30
        //   339: iadd           
        //   340: istore          12
        //   342: sipush          -31488
        //   345: sipush          180
        //   348: istore          13
        //   350: sipush          140
        //   353: istore          14
        //   355: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   358: astore          15
        //   360: aload_1        
        //   361: aload_0        
        //   362: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   365: aload           15
        //   367: iload           11
        //   369: iconst_4       
        //   370: iadd           
        //   371: iload           12
        //   373: iconst_2       
        //   374: iadd           
        //   375: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_30:I
        //   378: iconst_0       
        //   379: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //   382: aload_0        
        //   383: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //   386: invokeinterface java/util/List.size:()I
        //   391: invokedynamic   BootstrapMethod #3, makeConcatWithConstants:(I)Ljava/lang/String;
        //   396: astore          16
        //   398: aload_0        
        //   399: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   402: aload           16
        //   404: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //   407: istore          17
        //   409: aload_1        
        //   410: aload_0        
        //   411: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //   414: aload           16
        //   416: iload           11
        //   418: iload           13
        //   420: iadd           
        //   421: iload           17
        //   423: isub           
        //   424: iconst_4       
        //   425: isub           
        //   426: iload           12
        //   428: iconst_2       
        //   429: iadd           
        //   430: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_30:I
        //   433: iconst_0       
        //   434: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //   437: iinc            12, 14
        //   440: iinc            14, -14
        //   443: aload_1        
        //   444: iload           11
        //   446: iload           12
        //   448: iload           11
        //   450: iload           13
        //   452: iadd           
        //   453: iload           12
        //   455: iload           14
        //   457: iadd           
        //   458: bipush          8
        //   460: bipush          8
        //   462: bipush          16
        //   464: sipush          200
        //   467: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   470: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   473: aload_1        
        //   474: iload           11
        //   476: iload           12
        //   478: iload           11
        //   480: iload           13
        //   482: iadd           
        //   483: iload           12
        //   485: iconst_1       
        //   486: iadd           
        //   487: bipush          55
        //   489: sipush          130
        //   492: sipush          220
        //   495: bipush          60
        //   497: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   500: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   503: aload_1        
        //   504: iload           11
        //   506: iload           12
        //   508: iload           11
        //   510: iload           13
        //   512: iadd           
        //   513: iload           12
        //   515: iload           14
        //   517: iadd           
        //   518: invokevirtual   net/minecraft/class_332.method_44379:(IIII)V
        //   521: iload           12
        //   523: iconst_2       
        //   524: iadd           
        //   525: aload_0        
        //   526: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_2:I
        //   529: isub           
        //   530: istore          18
        //   532: bipush          18
        //   534: istore          19
        //   536: iconst_0       
        //   537: istore          20
        //   539: iload           20
        //   541: aload_0        
        //   542: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //   545: invokeinterface java/util/List.size:()I
        //   550: if_icmpge       1180
        //   553: aload_0        
        //   554: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //   557: iload           20
        //   559: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   564: checkcast       Ljava/lang/String;
        //   567: astore          21
        //   569: iload           18
        //   571: iload           19
        //   573: iadd           
        //   574: iload           12
        //   576: aload           6
        //   578: ifnonnull       1257
        //   581: aload           6
        //   583: ifnonnull       1169
        //   586: goto            593
        //   589: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   592: athrow         
        //   593: if_icmple       1165
        //   596: goto            603
        //   599: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   602: athrow         
        //   603: iload           18
        //   605: iload           12
        //   607: iload           14
        //   609: iadd           
        //   610: aload           6
        //   612: ifnonnull       1169
        //   615: goto            622
        //   618: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   621: athrow         
        //   622: if_icmpge       1165
        //   625: goto            632
        //   628: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   631: athrow         
        //   632: aload           21
        //   634: aload_0        
        //   635: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   638: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   641: istore          22
        //   643: iload           4
        //   645: iload           11
        //   647: aload           6
        //   649: ifnonnull       676
        //   652: if_icmplt       750
        //   655: goto            662
        //   658: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   661: athrow         
        //   662: iload           4
        //   664: iload           11
        //   666: iload           13
        //   668: iadd           
        //   669: goto            676
        //   672: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   675: athrow         
        //   676: aload           6
        //   678: ifnonnull       702
        //   681: if_icmpge       750
        //   684: goto            691
        //   687: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   690: athrow         
        //   691: iload           5
        //   693: iload           18
        //   695: goto            702
        //   698: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   701: athrow         
        //   702: aload           6
        //   704: ifnonnull       743
        //   707: if_icmplt       750
        //   710: goto            717
        //   713: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   716: athrow         
        //   717: iload           5
        //   719: aload           6
        //   721: ifnonnull       747
        //   724: goto            731
        //   727: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   730: athrow         
        //   731: iload           18
        //   733: iload           19
        //   735: iadd           
        //   736: goto            743
        //   739: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   742: athrow         
        //   743: if_icmpge       750
        //   746: iconst_1       
        //   747: goto            751
        //   750: iconst_0       
        //   751: istore          23
        //   753: iload           20
        //   755: iconst_2       
        //   756: irem           
        //   757: aload           6
        //   759: ifnonnull       793
        //   762: ifne            791
        //   765: goto            772
        //   768: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   771: athrow         
        //   772: bipush          16
        //   774: bipush          16
        //   776: bipush          28
        //   778: sipush          200
        //   781: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   784: goto            803
        //   787: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   790: athrow         
        //   791: bipush          20
        //   793: bipush          20
        //   795: bipush          32
        //   797: sipush          200
        //   800: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   803: istore          24
        //   805: aload_1        
        //   806: iload           11
        //   808: iconst_1       
        //   809: iadd           
        //   810: iload           18
        //   812: iload           11
        //   814: iload           13
        //   816: iadd           
        //   817: iconst_1       
        //   818: isub           
        //   819: iload           18
        //   821: iload           19
        //   823: iadd           
        //   824: iload           24
        //   826: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   829: iload           22
        //   831: aload           6
        //   833: ifnonnull       924
        //   836: ifeq            915
        //   839: goto            846
        //   842: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   845: athrow         
        //   846: aload_1        
        //   847: iload           11
        //   849: iconst_1       
        //   850: iadd           
        //   851: iload           18
        //   853: iload           11
        //   855: iload           13
        //   857: iadd           
        //   858: iconst_1       
        //   859: isub           
        //   860: iload           18
        //   862: iload           19
        //   864: iadd           
        //   865: bipush          55
        //   867: sipush          130
        //   870: sipush          220
        //   873: bipush          60
        //   875: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   878: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   881: aload_1        
        //   882: iload           11
        //   884: iconst_1       
        //   885: iadd           
        //   886: iload           18
        //   888: iload           11
        //   890: iconst_3       
        //   891: iadd           
        //   892: iload           18
        //   894: iload           19
        //   896: iadd           
        //   897: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //   900: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   903: aload           6
        //   905: ifnull          980
        //   908: goto            915
        //   911: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   914: athrow         
        //   915: iload           23
        //   917: goto            924
        //   920: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   923: athrow         
        //   924: aload           6
        //   926: ifnonnull       982
        //   929: ifeq            980
        //   932: goto            939
        //   935: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   938: athrow         
        //   939: aload_1        
        //   940: iload           11
        //   942: iconst_1       
        //   943: iadd           
        //   944: iload           18
        //   946: iload           11
        //   948: iload           13
        //   950: iadd           
        //   951: iconst_1       
        //   952: isub           
        //   953: iload           18
        //   955: iload           19
        //   957: iadd           
        //   958: bipush          40
        //   960: bipush          45
        //   962: bipush          65
        //   964: sipush          150
        //   967: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //   970: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //   973: goto            980
        //   976: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   979: athrow         
        //   980: iload           20
        //   982: aload           6
        //   984: ifnonnull       1042
        //   987: ifle            1038
        //   990: goto            997
        //   993: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   996: athrow         
        //   997: aload_1        
        //   998: iload           11
        //  1000: bipush          6
        //  1002: iadd           
        //  1003: iload           18
        //  1005: iload           11
        //  1007: iload           13
        //  1009: iadd           
        //  1010: bipush          6
        //  1012: isub           
        //  1013: iload           18
        //  1015: iconst_1       
        //  1016: iadd           
        //  1017: bipush          50
        //  1019: bipush          55
        //  1021: bipush          75
        //  1023: bipush          60
        //  1025: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1028: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1031: goto            1038
        //  1034: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1037: athrow         
        //  1038: iload           20
        //  1040: iconst_1       
        //  1041: iadd           
        //  1042: invokedynamic   BootstrapMethod #4, makeConcatWithConstants:(I)Ljava/lang/String;
        //  1047: astore          25
        //  1049: aload_1        
        //  1050: aload_0        
        //  1051: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1054: aload           25
        //  1056: iload           11
        //  1058: bipush          6
        //  1060: iadd           
        //  1061: iload           18
        //  1063: iconst_5       
        //  1064: iadd           
        //  1065: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_30:I
        //  1068: iconst_0       
        //  1069: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1072: aload_0        
        //  1073: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1076: aload           25
        //  1078: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1081: istore          26
        //  1083: aload_0        
        //  1084: aload_1        
        //  1085: aload           21
        //  1087: iload           11
        //  1089: bipush          8
        //  1091: iadd           
        //  1092: iload           26
        //  1094: iadd           
        //  1095: iload           18
        //  1097: iconst_5       
        //  1098: iadd           
        //  1099: iload           22
        //  1101: aload           6
        //  1103: ifnonnull       1128
        //  1106: ifeq            1126
        //  1109: goto            1116
        //  1112: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1115: athrow         
        //  1116: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1119: goto            1152
        //  1122: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1125: athrow         
        //  1126: iload           23
        //  1128: aload           6
        //  1130: ifnonnull       1146
        //  1133: ifeq            1149
        //  1136: goto            1143
        //  1139: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1142: athrow         
        //  1143: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1146: goto            1152
        //  1149: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1152: iconst_1       
        //  1153: iload           13
        //  1155: iload           26
        //  1157: isub           
        //  1158: bipush          16
        //  1160: isub           
        //  1161: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  1164: pop            
        //  1165: iload           18
        //  1167: iload           19
        //  1169: iadd           
        //  1170: istore          18
        //  1172: iinc            20, 1
        //  1175: aload           6
        //  1177: ifnull          539
        //  1180: aload_0        
        //  1181: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //  1184: invokeinterface java/util/List.isEmpty:()Z
        //  1189: aload           6
        //  1191: ifnonnull       1263
        //  1194: ifeq            1246
        //  1197: goto            1204
        //  1200: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1203: athrow         
        //  1204: aload_1        
        //  1205: aload_0        
        //  1206: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1209: sipush          27893
        //  1212: sipush          24745
        //  1215: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1218: iload           11
        //  1220: bipush          10
        //  1222: iadd           
        //  1223: iload           12
        //  1225: iload           14
        //  1227: iconst_2       
        //  1228: idiv           
        //  1229: iadd           
        //  1230: iconst_4       
        //  1231: isub           
        //  1232: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_30:I
        //  1235: iconst_0       
        //  1236: invokevirtual   net/minecraft/class_332.method_51433:(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V
        //  1239: goto            1246
        //  1242: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1245: athrow         
        //  1246: aload_1        
        //  1247: invokevirtual   net/minecraft/class_332.method_44380:()V
        //  1250: iload           11
        //  1252: iload           13
        //  1254: iadd           
        //  1255: bipush          14
        //  1257: iadd           
        //  1258: istore          20
        //  1260: sipush          140
        //  1263: istore          21
        //  1265: bipush          22
        //  1267: istore          22
        //  1269: bipush          6
        //  1271: istore          23
        //  1273: iload           12
        //  1275: istore          24
        //  1277: iload           4
        //  1279: iload           20
        //  1281: aload           6
        //  1283: ifnonnull       1310
        //  1286: if_icmplt       1384
        //  1289: goto            1296
        //  1292: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1295: athrow         
        //  1296: iload           4
        //  1298: iload           20
        //  1300: iload           21
        //  1302: iadd           
        //  1303: goto            1310
        //  1306: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1309: athrow         
        //  1310: aload           6
        //  1312: ifnonnull       1336
        //  1315: if_icmpge       1384
        //  1318: goto            1325
        //  1321: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1324: athrow         
        //  1325: iload           5
        //  1327: iload           24
        //  1329: goto            1336
        //  1332: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1335: athrow         
        //  1336: aload           6
        //  1338: ifnonnull       1377
        //  1341: if_icmplt       1384
        //  1344: goto            1351
        //  1347: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1350: athrow         
        //  1351: iload           5
        //  1353: aload           6
        //  1355: ifnonnull       1381
        //  1358: goto            1365
        //  1361: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1364: athrow         
        //  1365: iload           24
        //  1367: iload           22
        //  1369: iadd           
        //  1370: goto            1377
        //  1373: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1376: athrow         
        //  1377: if_icmpge       1384
        //  1380: iconst_1       
        //  1381: goto            1385
        //  1384: iconst_0       
        //  1385: istore          25
        //  1387: aload_0        
        //  1388: aload_1        
        //  1389: iload           20
        //  1391: iload           24
        //  1393: iload           21
        //  1395: iload           22
        //  1397: iload           25
        //  1399: aload           6
        //  1401: ifnonnull       1435
        //  1404: ifeq            1433
        //  1407: goto            1414
        //  1410: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1413: athrow         
        //  1414: bipush          45
        //  1416: bipush          48
        //  1418: bipush          65
        //  1420: sipush          230
        //  1423: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1426: goto            1445
        //  1429: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1432: athrow         
        //  1433: bipush          28
        //  1435: bipush          30
        //  1437: bipush          42
        //  1439: sipush          220
        //  1442: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1445: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  1448: sipush          27896
        //  1451: sipush          -22340
        //  1454: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1457: astore          26
        //  1459: aload_1        
        //  1460: aload_0        
        //  1461: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1464: aload           26
        //  1466: iload           20
        //  1468: iload           21
        //  1470: aload_0        
        //  1471: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1474: aload           26
        //  1476: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1479: isub           
        //  1480: iconst_2       
        //  1481: idiv           
        //  1482: iadd           
        //  1483: iload           24
        //  1485: bipush          7
        //  1487: iadd           
        //  1488: iload           25
        //  1490: aload           6
        //  1492: ifnonnull       1508
        //  1495: ifeq            1511
        //  1498: goto            1505
        //  1501: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1504: athrow         
        //  1505: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1508: goto            1514
        //  1511: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1514: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  1517: iload           25
        //  1519: aload           6
        //  1521: ifnonnull       1566
        //  1524: ifeq            1554
        //  1527: goto            1534
        //  1530: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1533: athrow         
        //  1534: aload_0        
        //  1535: sipush          27891
        //  1538: sipush          -14732
        //  1541: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1544: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //  1547: goto            1554
        //  1550: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1553: athrow         
        //  1554: iload           24
        //  1556: iload           22
        //  1558: iload           23
        //  1560: iadd           
        //  1561: iadd           
        //  1562: istore          24
        //  1564: iload           4
        //  1566: iload           20
        //  1568: aload           6
        //  1570: ifnonnull       1597
        //  1573: if_icmplt       1671
        //  1576: goto            1583
        //  1579: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1582: athrow         
        //  1583: iload           4
        //  1585: iload           20
        //  1587: iload           21
        //  1589: iadd           
        //  1590: goto            1597
        //  1593: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1596: athrow         
        //  1597: aload           6
        //  1599: ifnonnull       1623
        //  1602: if_icmpge       1671
        //  1605: goto            1612
        //  1608: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1611: athrow         
        //  1612: iload           5
        //  1614: iload           24
        //  1616: goto            1623
        //  1619: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1622: athrow         
        //  1623: aload           6
        //  1625: ifnonnull       1664
        //  1628: if_icmplt       1671
        //  1631: goto            1638
        //  1634: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1637: athrow         
        //  1638: iload           5
        //  1640: aload           6
        //  1642: ifnonnull       1668
        //  1645: goto            1652
        //  1648: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1651: athrow         
        //  1652: iload           24
        //  1654: iload           22
        //  1656: iadd           
        //  1657: goto            1664
        //  1660: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1663: athrow         
        //  1664: if_icmpge       1671
        //  1667: iconst_1       
        //  1668: goto            1672
        //  1671: iconst_0       
        //  1672: istore          27
        //  1674: aload_0        
        //  1675: aload_1        
        //  1676: iload           20
        //  1678: iload           24
        //  1680: iload           21
        //  1682: iload           22
        //  1684: iload           27
        //  1686: aload           6
        //  1688: ifnonnull       1722
        //  1691: ifeq            1720
        //  1694: goto            1701
        //  1697: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1700: athrow         
        //  1701: bipush          45
        //  1703: bipush          48
        //  1705: bipush          65
        //  1707: sipush          230
        //  1710: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1713: goto            1732
        //  1716: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1719: athrow         
        //  1720: bipush          28
        //  1722: bipush          30
        //  1724: bipush          42
        //  1726: sipush          220
        //  1729: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1732: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  1735: sipush          27788
        //  1738: sipush          31840
        //  1741: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1744: astore          28
        //  1746: aload_1        
        //  1747: aload_0        
        //  1748: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1751: aload           28
        //  1753: iload           20
        //  1755: iload           21
        //  1757: aload_0        
        //  1758: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  1761: aload           28
        //  1763: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  1766: isub           
        //  1767: iconst_2       
        //  1768: idiv           
        //  1769: iadd           
        //  1770: iload           24
        //  1772: bipush          7
        //  1774: iadd           
        //  1775: iload           27
        //  1777: aload           6
        //  1779: ifnonnull       1795
        //  1782: ifeq            1798
        //  1785: goto            1792
        //  1788: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1791: athrow         
        //  1792: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  1795: goto            1801
        //  1798: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  1801: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  1804: iload           27
        //  1806: aload           6
        //  1808: ifnonnull       1898
        //  1811: ifeq            1841
        //  1814: goto            1821
        //  1817: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1820: athrow         
        //  1821: aload_0        
        //  1822: sipush          27889
        //  1825: sipush          22548
        //  1828: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1831: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //  1834: goto            1841
        //  1837: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1840: athrow         
        //  1841: iload           24
        //  1843: iload           22
        //  1845: iload           23
        //  1847: iadd           
        //  1848: iconst_2       
        //  1849: iadd           
        //  1850: iadd           
        //  1851: istore          24
        //  1853: aload_1        
        //  1854: iload           20
        //  1856: bipush          10
        //  1858: iadd           
        //  1859: iload           24
        //  1861: iload           20
        //  1863: iload           21
        //  1865: iadd           
        //  1866: bipush          10
        //  1868: isub           
        //  1869: iload           24
        //  1871: iconst_1       
        //  1872: iadd           
        //  1873: bipush          50
        //  1875: bipush          55
        //  1877: bipush          75
        //  1879: bipush          120
        //  1881: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  1884: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  1887: iload           24
        //  1889: iload           23
        //  1891: iconst_2       
        //  1892: iadd           
        //  1893: iadd           
        //  1894: istore          24
        //  1896: iload           4
        //  1898: iload           20
        //  1900: aload           6
        //  1902: ifnonnull       1929
        //  1905: if_icmplt       2003
        //  1908: goto            1915
        //  1911: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1914: athrow         
        //  1915: iload           4
        //  1917: iload           20
        //  1919: iload           21
        //  1921: iadd           
        //  1922: goto            1929
        //  1925: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1928: athrow         
        //  1929: aload           6
        //  1931: ifnonnull       1955
        //  1934: if_icmpge       2003
        //  1937: goto            1944
        //  1940: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1943: athrow         
        //  1944: iload           5
        //  1946: iload           24
        //  1948: goto            1955
        //  1951: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1954: athrow         
        //  1955: aload           6
        //  1957: ifnonnull       1996
        //  1960: if_icmplt       2003
        //  1963: goto            1970
        //  1966: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1969: athrow         
        //  1970: iload           5
        //  1972: aload           6
        //  1974: ifnonnull       2000
        //  1977: goto            1984
        //  1980: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1983: athrow         
        //  1984: iload           24
        //  1986: iload           22
        //  1988: iadd           
        //  1989: goto            1996
        //  1992: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1995: athrow         
        //  1996: if_icmpge       2003
        //  1999: iconst_1       
        //  2000: goto            2004
        //  2003: iconst_0       
        //  2004: istore          29
        //  2006: aload_0        
        //  2007: aload_1        
        //  2008: iload           20
        //  2010: iload           24
        //  2012: iload           21
        //  2014: iload           22
        //  2016: iload           29
        //  2018: aload           6
        //  2020: ifnonnull       2054
        //  2023: ifeq            2052
        //  2026: goto            2033
        //  2029: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2032: athrow         
        //  2033: bipush          45
        //  2035: bipush          48
        //  2037: bipush          65
        //  2039: sipush          230
        //  2042: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  2045: goto            2064
        //  2048: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2051: athrow         
        //  2052: bipush          28
        //  2054: bipush          30
        //  2056: bipush          42
        //  2058: sipush          220
        //  2061: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  2064: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  2067: sipush          27879
        //  2070: sipush          31169
        //  2073: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2076: astore          30
        //  2078: aload_1        
        //  2079: aload_0        
        //  2080: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2083: aload           30
        //  2085: iload           20
        //  2087: iload           21
        //  2089: aload_0        
        //  2090: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2093: aload           30
        //  2095: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2098: isub           
        //  2099: iconst_2       
        //  2100: idiv           
        //  2101: iadd           
        //  2102: iload           24
        //  2104: bipush          7
        //  2106: iadd           
        //  2107: iload           29
        //  2109: aload           6
        //  2111: ifnonnull       2127
        //  2114: ifeq            2130
        //  2117: goto            2124
        //  2120: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2123: athrow         
        //  2124: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  2127: goto            2133
        //  2130: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  2133: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  2136: iload           29
        //  2138: aload           6
        //  2140: ifnonnull       2185
        //  2143: ifeq            2173
        //  2146: goto            2153
        //  2149: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2152: athrow         
        //  2153: aload_0        
        //  2154: sipush          27854
        //  2157: sipush          30404
        //  2160: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2163: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //  2166: goto            2173
        //  2169: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2172: athrow         
        //  2173: iload           24
        //  2175: iload           22
        //  2177: iload           23
        //  2179: iadd           
        //  2180: iadd           
        //  2181: istore          24
        //  2183: iload           4
        //  2185: iload           20
        //  2187: aload           6
        //  2189: ifnonnull       2216
        //  2192: if_icmplt       2290
        //  2195: goto            2202
        //  2198: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2201: athrow         
        //  2202: iload           4
        //  2204: iload           20
        //  2206: iload           21
        //  2208: iadd           
        //  2209: goto            2216
        //  2212: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2215: athrow         
        //  2216: aload           6
        //  2218: ifnonnull       2242
        //  2221: if_icmpge       2290
        //  2224: goto            2231
        //  2227: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2230: athrow         
        //  2231: iload           5
        //  2233: iload           24
        //  2235: goto            2242
        //  2238: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2241: athrow         
        //  2242: aload           6
        //  2244: ifnonnull       2283
        //  2247: if_icmplt       2290
        //  2250: goto            2257
        //  2253: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2256: athrow         
        //  2257: iload           5
        //  2259: aload           6
        //  2261: ifnonnull       2287
        //  2264: goto            2271
        //  2267: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2270: athrow         
        //  2271: iload           24
        //  2273: iload           22
        //  2275: iadd           
        //  2276: goto            2283
        //  2279: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2282: athrow         
        //  2283: if_icmpge       2290
        //  2286: iconst_1       
        //  2287: goto            2291
        //  2290: iconst_0       
        //  2291: istore          31
        //  2293: aload_0        
        //  2294: aload_1        
        //  2295: iload           20
        //  2297: iload           24
        //  2299: iload           21
        //  2301: iload           22
        //  2303: iload           31
        //  2305: aload           6
        //  2307: ifnonnull       2341
        //  2310: ifeq            2339
        //  2313: goto            2320
        //  2316: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2319: athrow         
        //  2320: bipush          45
        //  2322: bipush          48
        //  2324: bipush          65
        //  2326: sipush          230
        //  2329: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  2332: goto            2351
        //  2335: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2338: athrow         
        //  2339: bipush          28
        //  2341: bipush          30
        //  2343: bipush          42
        //  2345: sipush          220
        //  2348: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  2351: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  2354: sipush          27846
        //  2357: sipush          25963
        //  2360: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2363: astore          32
        //  2365: aload_1        
        //  2366: aload_0        
        //  2367: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2370: aload           32
        //  2372: iload           20
        //  2374: iload           21
        //  2376: aload_0        
        //  2377: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  2380: aload           32
        //  2382: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  2385: isub           
        //  2386: iconst_2       
        //  2387: idiv           
        //  2388: iadd           
        //  2389: iload           24
        //  2391: bipush          7
        //  2393: iadd           
        //  2394: iload           31
        //  2396: aload           6
        //  2398: ifnonnull       2414
        //  2401: ifeq            2417
        //  2404: goto            2411
        //  2407: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2410: athrow         
        //  2411: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  2414: goto            2420
        //  2417: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  2420: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  2423: iload           31
        //  2425: aload           6
        //  2427: ifnonnull       2468
        //  2430: ifeq            2460
        //  2433: goto            2440
        //  2436: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2439: athrow         
        //  2440: aload_0        
        //  2441: sipush          27777
        //  2444: sipush          28287
        //  2447: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2450: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //  2453: goto            2460
        //  2456: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2459: athrow         
        //  2460: iload           10
        //  2462: iload           8
        //  2464: iadd           
        //  2465: bipush          38
        //  2467: isub           
        //  2468: istore          33
        //  2470: iload           13
        //  2472: bipush          70
        //  2474: iadd           
        //  2475: istore          34
        //  2477: iload           4
        //  2479: iload           11
        //  2481: aload           6
        //  2483: ifnonnull       2510
        //  2486: if_icmplt       2584
        //  2489: goto            2496
        //  2492: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2495: athrow         
        //  2496: iload           4
        //  2498: iload           11
        //  2500: iload           34
        //  2502: iadd           
        //  2503: goto            2510
        //  2506: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2509: athrow         
        //  2510: aload           6
        //  2512: ifnonnull       2536
        //  2515: if_icmpge       2584
        //  2518: goto            2525
        //  2521: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2524: athrow         
        //  2525: iload           5
        //  2527: iload           33
        //  2529: goto            2536
        //  2532: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2535: athrow         
        //  2536: aload           6
        //  2538: ifnonnull       2577
        //  2541: if_icmplt       2584
        //  2544: goto            2551
        //  2547: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2550: athrow         
        //  2551: iload           5
        //  2553: aload           6
        //  2555: ifnonnull       2581
        //  2558: goto            2565
        //  2561: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2564: athrow         
        //  2565: iload           33
        //  2567: bipush          22
        //  2569: iadd           
        //  2570: goto            2577
        //  2573: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2576: athrow         
        //  2577: if_icmpge       2584
        //  2580: iconst_1       
        //  2581: goto            2585
        //  2584: iconst_0       
        //  2585: istore          35
        //  2587: aload_0        
        //  2588: aload_1        
        //  2589: iload           11
        //  2591: iload           33
        //  2593: iload           34
        //  2595: bipush          22
        //  2597: aload_0        
        //  2598: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  2601: aload           6
        //  2603: ifnonnull       2637
        //  2606: ifeq            2635
        //  2609: goto            2616
        //  2612: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2615: athrow         
        //  2616: bipush          25
        //  2618: bipush          35
        //  2620: bipush          55
        //  2622: sipush          230
        //  2625: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  2628: goto            2647
        //  2631: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2634: athrow         
        //  2635: bipush          15
        //  2637: bipush          15
        //  2639: bipush          25
        //  2641: sipush          220
        //  2644: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  2647: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  2650: aload_1        
        //  2651: iload           11
        //  2653: iload           33
        //  2655: bipush          21
        //  2657: iadd           
        //  2658: iload           11
        //  2660: iload           34
        //  2662: iadd           
        //  2663: iload           33
        //  2665: bipush          22
        //  2667: iadd           
        //  2668: aload_0        
        //  2669: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  2672: aload           6
        //  2674: ifnonnull       2699
        //  2677: ifeq            2697
        //  2680: goto            2687
        //  2683: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2686: athrow         
        //  2687: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_23:I
        //  2690: goto            2708
        //  2693: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2696: athrow         
        //  2697: bipush          50
        //  2699: bipush          55
        //  2701: bipush          75
        //  2703: bipush          80
        //  2705: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  2708: invokevirtual   net/minecraft/class_332.method_25294:(IIIII)V
        //  2711: aload_0        
        //  2712: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //  2715: aload_0        
        //  2716: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  2719: aload           6
        //  2721: ifnonnull       2752
        //  2724: ifeq            2765
        //  2727: goto            2734
        //  2730: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2733: athrow         
        //  2734: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2737: ldc2_w          1000
        //  2740: lrem           
        //  2741: ldc2_w          500
        //  2744: lcmp           
        //  2745: goto            2752
        //  2748: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2751: athrow         
        //  2752: ifge            2765
        //  2755: ldc_w           "_"
        //  2758: goto            2767
        //  2761: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2764: athrow         
        //  2765: ldc             ""
        //  2767: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2772: astore          36
        //  2774: aload           36
        //  2776: invokevirtual   java/lang/String.isEmpty:()Z
        //  2779: aload           6
        //  2781: ifnonnull       2817
        //  2784: ifeq            2831
        //  2787: goto            2794
        //  2790: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2793: athrow         
        //  2794: aload_0        
        //  2795: aload           6
        //  2797: ifnonnull       2832
        //  2800: goto            2807
        //  2803: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2806: athrow         
        //  2807: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  2810: goto            2817
        //  2813: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2816: athrow         
        //  2817: ifne            2831
        //  2820: sipush          27886
        //  2823: sipush          2477
        //  2826: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  2829: astore          36
        //  2831: aload_0        
        //  2832: aload_1        
        //  2833: aload           36
        //  2835: iload           11
        //  2837: bipush          8
        //  2839: iadd           
        //  2840: iload           33
        //  2842: bipush          7
        //  2844: iadd           
        //  2845: aload_0        
        //  2846: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  2849: aload           6
        //  2851: ifnonnull       2867
        //  2854: ifeq            2870
        //  2857: goto            2864
        //  2860: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2863: athrow         
        //  2864: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  2867: goto            2873
        //  2870: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_30:I
        //  2873: iconst_0       
        //  2874: iload           34
        //  2876: bipush          16
        //  2878: isub           
        //  2879: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_1:(Lnet/minecraft/class_332;Ljava/lang/String;IIIZI)I
        //  2882: pop            
        //  2883: iload           11
        //  2885: iload           34
        //  2887: iadd           
        //  2888: bipush          8
        //  2890: iadd           
        //  2891: istore          37
        //  2893: iload           7
        //  2895: iload           34
        //  2897: isub           
        //  2898: bipush          28
        //  2900: isub           
        //  2901: istore          38
        //  2903: iload           4
        //  2905: iload           37
        //  2907: aload           6
        //  2909: ifnonnull       2936
        //  2912: if_icmplt       3010
        //  2915: goto            2922
        //  2918: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2921: athrow         
        //  2922: iload           4
        //  2924: iload           37
        //  2926: iload           38
        //  2928: iadd           
        //  2929: goto            2936
        //  2932: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2935: athrow         
        //  2936: aload           6
        //  2938: ifnonnull       2962
        //  2941: if_icmpge       3010
        //  2944: goto            2951
        //  2947: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2950: athrow         
        //  2951: iload           5
        //  2953: iload           33
        //  2955: goto            2962
        //  2958: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2961: athrow         
        //  2962: aload           6
        //  2964: ifnonnull       3003
        //  2967: if_icmplt       3010
        //  2970: goto            2977
        //  2973: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2976: athrow         
        //  2977: iload           5
        //  2979: aload           6
        //  2981: ifnonnull       3007
        //  2984: goto            2991
        //  2987: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  2990: athrow         
        //  2991: iload           33
        //  2993: bipush          22
        //  2995: iadd           
        //  2996: goto            3003
        //  2999: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3002: athrow         
        //  3003: if_icmpge       3010
        //  3006: iconst_1       
        //  3007: goto            3011
        //  3010: iconst_0       
        //  3011: istore          39
        //  3013: aload_0        
        //  3014: aload_1        
        //  3015: iload           37
        //  3017: iload           33
        //  3019: iload           38
        //  3021: bipush          22
        //  3023: iload           39
        //  3025: aload           6
        //  3027: ifnonnull       3061
        //  3030: ifeq            3059
        //  3033: goto            3040
        //  3036: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3039: athrow         
        //  3040: bipush          45
        //  3042: bipush          48
        //  3044: bipush          65
        //  3046: sipush          230
        //  3049: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  3052: goto            3071
        //  3055: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3058: athrow         
        //  3059: bipush          28
        //  3061: bipush          30
        //  3063: bipush          42
        //  3065: sipush          220
        //  3068: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  3071: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  3074: sipush          27892
        //  3077: sipush          7016
        //  3080: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3083: astore          40
        //  3085: aload_1        
        //  3086: aload_0        
        //  3087: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  3090: aload           40
        //  3092: iload           37
        //  3094: iload           38
        //  3096: aload_0        
        //  3097: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  3100: aload           40
        //  3102: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  3105: isub           
        //  3106: iconst_2       
        //  3107: idiv           
        //  3108: iadd           
        //  3109: iload           33
        //  3111: bipush          7
        //  3113: iadd           
        //  3114: iload           39
        //  3116: aload           6
        //  3118: ifnonnull       3134
        //  3121: ifeq            3137
        //  3124: goto            3131
        //  3127: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3130: athrow         
        //  3131: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  3134: goto            3140
        //  3137: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  3140: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  3143: iload           39
        //  3145: ifeq            3168
        //  3148: aload_0        
        //  3149: sipush          27778
        //  3152: sipush          18675
        //  3155: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3158: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //  3161: goto            3168
        //  3164: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3167: athrow         
        //  3168: aload           6
        //  3170: ifnull          4221
        //  3173: aload_0        
        //  3174: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //  3177: goto            3184
        //  3180: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3183: athrow         
        //  3184: aload           6
        //  3186: ifnonnull       4223
        //  3189: ifeq            4221
        //  3192: goto            3199
        //  3195: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3198: athrow         
        //  3199: iload           9
        //  3201: bipush          40
        //  3203: iadd           
        //  3204: istore          11
        //  3206: iload           10
        //  3208: bipush          45
        //  3210: iadd           
        //  3211: istore          12
        //  3213: iload           10
        //  3215: bipush          75
        //  3217: iadd           
        //  3218: istore          13
        //  3220: sipush          160
        //  3223: istore          14
        //  3225: bipush          20
        //  3227: istore          15
        //  3229: iload           4
        //  3231: iload           11
        //  3233: aload           6
        //  3235: ifnonnull       3262
        //  3238: if_icmplt       3336
        //  3241: goto            3248
        //  3244: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3247: athrow         
        //  3248: iload           4
        //  3250: iload           11
        //  3252: iload           14
        //  3254: iadd           
        //  3255: goto            3262
        //  3258: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3261: athrow         
        //  3262: aload           6
        //  3264: ifnonnull       3288
        //  3267: if_icmpge       3336
        //  3270: goto            3277
        //  3273: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3276: athrow         
        //  3277: iload           5
        //  3279: iload           12
        //  3281: goto            3288
        //  3284: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3287: athrow         
        //  3288: aload           6
        //  3290: ifnonnull       3329
        //  3293: if_icmplt       3336
        //  3296: goto            3303
        //  3299: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3302: athrow         
        //  3303: iload           5
        //  3305: aload           6
        //  3307: ifnonnull       3333
        //  3310: goto            3317
        //  3313: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3316: athrow         
        //  3317: iload           12
        //  3319: iload           15
        //  3321: iadd           
        //  3322: goto            3329
        //  3325: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3328: athrow         
        //  3329: if_icmpge       3336
        //  3332: iconst_1       
        //  3333: goto            3337
        //  3336: iconst_0       
        //  3337: istore          16
        //  3339: aload_0        
        //  3340: aload_1        
        //  3341: iload           11
        //  3343: iload           12
        //  3345: iload           14
        //  3347: iload           15
        //  3349: iload           16
        //  3351: aload           6
        //  3353: ifnonnull       3369
        //  3356: ifeq            3372
        //  3359: goto            3366
        //  3362: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3365: athrow         
        //  3366: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_16:I
        //  3369: goto            3375
        //  3372: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_17:I
        //  3375: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  3378: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.boolFlag:Z
        //  3381: ifeq            3400
        //  3384: sipush          27847
        //  3387: sipush          -10446
        //  3390: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3393: goto            3409
        //  3396: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3399: athrow         
        //  3400: sipush          27852
        //  3403: sipush          -236
        //  3406: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3409: sipush          27878
        //  3412: sipush          24050
        //  3415: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3418: swap           
        //  3419: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3424: astore          17
        //  3426: aload_1        
        //  3427: aload_0        
        //  3428: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  3431: aload           17
        //  3433: iload           11
        //  3435: iload           14
        //  3437: aload_0        
        //  3438: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  3441: aload           17
        //  3443: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  3446: isub           
        //  3447: iconst_2       
        //  3448: idiv           
        //  3449: iadd           
        //  3450: iload           12
        //  3452: bipush          6
        //  3454: iadd           
        //  3455: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.boolFlag:Z
        //  3458: aload           6
        //  3460: ifnonnull       3476
        //  3463: ifeq            3479
        //  3466: goto            3473
        //  3469: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3472: athrow         
        //  3473: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  3476: goto            3482
        //  3479: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  3482: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  3485: iload           16
        //  3487: aload           6
        //  3489: ifnonnull       3524
        //  3492: ifeq            3522
        //  3495: goto            3502
        //  3498: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3501: athrow         
        //  3502: aload_0        
        //  3503: sipush          27870
        //  3506: sipush          -23211
        //  3509: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3512: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //  3515: goto            3522
        //  3518: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3521: athrow         
        //  3522: iload           4
        //  3524: iload           11
        //  3526: aload           6
        //  3528: ifnonnull       3555
        //  3531: if_icmplt       3629
        //  3534: goto            3541
        //  3537: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3540: athrow         
        //  3541: iload           4
        //  3543: iload           11
        //  3545: iload           14
        //  3547: iadd           
        //  3548: goto            3555
        //  3551: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3554: athrow         
        //  3555: aload           6
        //  3557: ifnonnull       3581
        //  3560: if_icmpge       3629
        //  3563: goto            3570
        //  3566: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3569: athrow         
        //  3570: iload           5
        //  3572: iload           13
        //  3574: goto            3581
        //  3577: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3580: athrow         
        //  3581: aload           6
        //  3583: ifnonnull       3622
        //  3586: if_icmplt       3629
        //  3589: goto            3596
        //  3592: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3595: athrow         
        //  3596: iload           5
        //  3598: aload           6
        //  3600: ifnonnull       3626
        //  3603: goto            3610
        //  3606: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3609: athrow         
        //  3610: iload           13
        //  3612: iload           15
        //  3614: iadd           
        //  3615: goto            3622
        //  3618: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3621: athrow         
        //  3622: if_icmpge       3629
        //  3625: iconst_1       
        //  3626: goto            3630
        //  3629: iconst_0       
        //  3630: istore          18
        //  3632: aload_0        
        //  3633: aload_1        
        //  3634: iload           11
        //  3636: iload           13
        //  3638: iload           14
        //  3640: iload           15
        //  3642: iload           18
        //  3644: aload           6
        //  3646: ifnonnull       3662
        //  3649: ifeq            3665
        //  3652: goto            3659
        //  3655: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3658: athrow         
        //  3659: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_16:I
        //  3662: goto            3668
        //  3665: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_17:I
        //  3668: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  3671: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.boolFlag_1:Z
        //  3674: ifeq            3693
        //  3677: sipush          27848
        //  3680: sipush          -4064
        //  3683: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3686: goto            3702
        //  3689: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3692: athrow         
        //  3693: sipush          27858
        //  3696: sipush          7368
        //  3699: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3702: sipush          27883
        //  3705: sipush          -12607
        //  3708: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3711: swap           
        //  3712: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3717: astore          19
        //  3719: aload_1        
        //  3720: aload_0        
        //  3721: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  3724: aload           19
        //  3726: iload           11
        //  3728: iload           14
        //  3730: aload_0        
        //  3731: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  3734: aload           19
        //  3736: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  3739: isub           
        //  3740: iconst_2       
        //  3741: idiv           
        //  3742: iadd           
        //  3743: iload           13
        //  3745: bipush          6
        //  3747: iadd           
        //  3748: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.boolFlag_1:Z
        //  3751: aload           6
        //  3753: ifnonnull       3769
        //  3756: ifeq            3772
        //  3759: goto            3766
        //  3762: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3765: athrow         
        //  3766: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  3769: goto            3775
        //  3772: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  3775: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  3778: iload           18
        //  3780: aload           6
        //  3782: ifnonnull       3820
        //  3785: ifeq            3815
        //  3788: goto            3795
        //  3791: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3794: athrow         
        //  3795: aload_0        
        //  3796: sipush          27897
        //  3799: sipush          9687
        //  3802: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3805: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //  3808: goto            3815
        //  3811: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3814: athrow         
        //  3815: iload           10
        //  3817: bipush          105
        //  3819: iadd           
        //  3820: istore          20
        //  3822: iload           4
        //  3824: iload           11
        //  3826: aload           6
        //  3828: ifnonnull       3855
        //  3831: if_icmplt       3929
        //  3834: goto            3841
        //  3837: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3840: athrow         
        //  3841: iload           4
        //  3843: iload           11
        //  3845: iload           14
        //  3847: iadd           
        //  3848: goto            3855
        //  3851: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3854: athrow         
        //  3855: aload           6
        //  3857: ifnonnull       3881
        //  3860: if_icmpge       3929
        //  3863: goto            3870
        //  3866: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3869: athrow         
        //  3870: iload           5
        //  3872: iload           20
        //  3874: goto            3881
        //  3877: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3880: athrow         
        //  3881: aload           6
        //  3883: ifnonnull       3922
        //  3886: if_icmplt       3929
        //  3889: goto            3896
        //  3892: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3895: athrow         
        //  3896: iload           5
        //  3898: aload           6
        //  3900: ifnonnull       3926
        //  3903: goto            3910
        //  3906: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3909: athrow         
        //  3910: iload           20
        //  3912: iload           15
        //  3914: iadd           
        //  3915: goto            3922
        //  3918: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3921: athrow         
        //  3922: if_icmpge       3929
        //  3925: iconst_1       
        //  3926: goto            3930
        //  3929: iconst_0       
        //  3930: istore          21
        //  3932: aload_0        
        //  3933: aload_1        
        //  3934: iload           11
        //  3936: iload           20
        //  3938: iload           14
        //  3940: iload           15
        //  3942: iload           21
        //  3944: aload           6
        //  3946: ifnonnull       3962
        //  3949: ifeq            3965
        //  3952: goto            3959
        //  3955: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  3958: athrow         
        //  3959: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_16:I
        //  3962: goto            3968
        //  3965: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_17:I
        //  3968: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  3971: aload_0        
        //  3972: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_1:Z
        //  3975: ifeq            3994
        //  3978: sipush          27860
        //  3981: sipush          -4292
        //  3984: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  3987: astore          22
        //  3989: aload           6
        //  3991: ifnull          4124
        //  3994: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //  3997: aload           6
        //  3999: ifnonnull       4022
        //  4002: goto            4009
        //  4005: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4008: athrow         
        //  4009: ifnull          4037
        //  4012: goto            4019
        //  4015: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4018: athrow         
        //  4019: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //  4022: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //  4025: ldc_w           Lcom/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl;.class
        //  4028: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.computeLoadf:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //  4031: checkcast       Lcom/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl;
        //  4034: goto            4038
        //  4037: aconst_null    
        //  4038: astore          23
        //  4040: aload           23
        //  4042: aload           6
        //  4044: ifnonnull       4059
        //  4047: ifnull          4065
        //  4050: goto            4057
        //  4053: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4056: athrow         
        //  4057: aload           23
        //  4059: invokevirtual   com/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl.getInt_2:()I
        //  4062: goto            4066
        //  4065: iconst_m1      
        //  4066: istore          24
        //  4068: iload           24
        //  4070: aload           6
        //  4072: ifnonnull       4104
        //  4075: iconst_m1      
        //  4076: if_icmpne       4102
        //  4079: goto            4086
        //  4082: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4085: athrow         
        //  4086: sipush          27864
        //  4089: sipush          -16879
        //  4092: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  4095: goto            4107
        //  4098: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4101: athrow         
        //  4102: iload           24
        //  4104: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_9.computeString:(I)Ljava/lang/String;
        //  4107: sipush          27856
        //  4110: sipush          -3079
        //  4113: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  4116: swap           
        //  4117: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  4122: astore          22
        //  4124: aload_1        
        //  4125: aload_0        
        //  4126: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  4129: aload           22
        //  4131: iload           11
        //  4133: iload           14
        //  4135: aload_0        
        //  4136: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  4139: aload           22
        //  4141: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  4144: isub           
        //  4145: iconst_2       
        //  4146: idiv           
        //  4147: iadd           
        //  4148: iload           20
        //  4150: bipush          6
        //  4152: iadd           
        //  4153: aload_0        
        //  4154: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_1:Z
        //  4157: aload           6
        //  4159: ifnonnull       4175
        //  4162: ifeq            4178
        //  4165: goto            4172
        //  4168: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4171: athrow         
        //  4172: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_31:I
        //  4175: goto            4181
        //  4178: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_29:I
        //  4181: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  4184: iload           21
        //  4186: aload           6
        //  4188: ifnonnull       4251
        //  4191: ifeq            4221
        //  4194: goto            4201
        //  4197: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4200: athrow         
        //  4201: aload_0        
        //  4202: sipush          27783
        //  4205: sipush          2143
        //  4208: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  4211: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_2:Ljava/lang/String;
        //  4214: goto            4221
        //  4217: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4220: athrow         
        //  4221: bipush          60
        //  4223: istore          11
        //  4225: bipush          14
        //  4227: istore          12
        //  4229: iload           9
        //  4231: iload           7
        //  4233: iadd           
        //  4234: iload           11
        //  4236: isub           
        //  4237: bipush          8
        //  4239: isub           
        //  4240: istore          13
        //  4242: iload           10
        //  4244: bipush          6
        //  4246: iadd           
        //  4247: istore          14
        //  4249: iload           4
        //  4251: iload           13
        //  4253: aload           6
        //  4255: ifnonnull       4282
        //  4258: if_icmplt       4356
        //  4261: goto            4268
        //  4264: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4267: athrow         
        //  4268: iload           4
        //  4270: iload           13
        //  4272: iload           11
        //  4274: iadd           
        //  4275: goto            4282
        //  4278: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4281: athrow         
        //  4282: aload           6
        //  4284: ifnonnull       4308
        //  4287: if_icmpge       4356
        //  4290: goto            4297
        //  4293: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4296: athrow         
        //  4297: iload           5
        //  4299: iload           14
        //  4301: goto            4308
        //  4304: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4307: athrow         
        //  4308: aload           6
        //  4310: ifnonnull       4349
        //  4313: if_icmplt       4356
        //  4316: goto            4323
        //  4319: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4322: athrow         
        //  4323: iload           5
        //  4325: aload           6
        //  4327: ifnonnull       4353
        //  4330: goto            4337
        //  4333: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4336: athrow         
        //  4337: iload           14
        //  4339: iload           12
        //  4341: iadd           
        //  4342: goto            4349
        //  4345: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4348: athrow         
        //  4349: if_icmpge       4356
        //  4352: iconst_1       
        //  4353: goto            4357
        //  4356: iconst_0       
        //  4357: istore          15
        //  4359: aload_0        
        //  4360: aload_1        
        //  4361: iload           13
        //  4363: iload           14
        //  4365: iload           11
        //  4367: iload           12
        //  4369: iload           15
        //  4371: aload           6
        //  4373: ifnonnull       4409
        //  4376: ifeq            4406
        //  4379: goto            4386
        //  4382: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4385: athrow         
        //  4386: sipush          200
        //  4389: bipush          50
        //  4391: bipush          50
        //  4393: sipush          200
        //  4396: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  4399: goto            4419
        //  4402: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  4405: athrow         
        //  4406: sipush          150
        //  4409: bipush          40
        //  4411: bipush          40
        //  4413: sipush          150
        //  4416: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int:(IIII)I
        //  4419: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_8:(Lnet/minecraft/class_332;IIIII)V
        //  4422: sipush          27903
        //  4425: sipush          450
        //  4428: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  4431: astore          16
        //  4433: aload_1        
        //  4434: aload_0        
        //  4435: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  4438: aload           16
        //  4440: iload           13
        //  4442: iload           11
        //  4444: aload_0        
        //  4445: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.field_22793:Lnet/minecraft/class_327;
        //  4448: aload           16
        //  4450: invokevirtual   net/minecraft/class_327.method_1727:(Ljava/lang/String;)I
        //  4453: isub           
        //  4454: iconst_2       
        //  4455: idiv           
        //  4456: iadd           
        //  4457: iload           14
        //  4459: iconst_3       
        //  4460: iadd           
        //  4461: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_28:I
        //  4464: invokevirtual   net/minecraft/class_332.method_25303:(Lnet/minecraft/class_327;Ljava/lang/String;III)V
        //  4467: return         
        //    StackMapTable: 01 B9 FF 00 14 00 07 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 00 01 07 01 1C 03 42 01 02 42 01 FF 00 10 00 08 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 00 01 07 01 1C 03 42 01 02 42 01 FF 01 01 00 0B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 00 01 07 01 1C 03 FF 00 D5 00 15 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 00 00 FF 00 31 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 00 01 07 01 1C FF 00 03 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 00 02 01 01 45 07 01 1C 03 4E 07 01 1C FF 00 03 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 00 02 01 01 45 07 01 1C 03 FF 00 19 00 17 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 00 01 07 01 1C 03 49 07 01 1C FF 00 03 00 17 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 17 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 17 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 00 02 01 01 43 01 02 40 01 FF 00 10 00 18 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 00 01 07 01 1C 03 4E 07 01 1C 03 41 01 49 01 FF 00 26 00 19 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 01 00 01 07 01 1C 03 F7 00 40 07 01 1C 03 44 07 01 1C 43 01 4A 07 01 1C 03 64 07 01 1C 03 41 01 4A 07 01 1C 03 64 07 01 1C 03 43 01 FF 00 45 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 01 07 00 EF 01 00 01 07 01 1C FF 00 03 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 01 07 00 EF 01 00 05 07 00 02 07 01 2C 07 00 EF 01 01 45 07 01 1C FF 00 03 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 01 07 00 EF 01 00 05 07 00 02 07 01 2C 07 00 EF 01 01 FF 00 01 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 01 07 00 EF 01 00 06 07 00 02 07 01 2C 07 00 EF 01 01 01 4A 07 01 1C FF 00 03 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 01 07 00 EF 01 00 05 07 00 02 07 01 2C 07 00 EF 01 01 FF 00 02 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 01 07 00 EF 01 00 06 07 00 02 07 01 2C 07 00 EF 01 01 01 FF 00 02 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 01 07 00 EF 01 00 05 07 00 02 07 01 2C 07 00 EF 01 01 FF 00 02 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 01 01 01 07 00 EF 01 00 06 07 00 02 07 01 2C 07 00 EF 01 01 01 FF 00 0C 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 00 00 FF 00 03 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 07 00 EF 00 02 01 01 FA 00 0A 53 07 01 1C 03 65 07 01 1C 03 FF 00 0A 00 15 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 00 02 01 01 45 01 FF 00 1C 00 19 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 00 01 07 01 1C 03 49 07 01 1C FF 00 03 00 19 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 19 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 19 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 00 02 01 01 43 01 02 40 01 FF 00 18 00 1A 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 00 01 07 01 1C FF 00 03 00 1A 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 4E 07 01 1C FF 00 03 00 1A 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 01 00 1A 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 09 00 1A 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 37 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 00 01 07 01 1C FF 00 03 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 02 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 4F 07 01 1C 03 4F 07 01 1C 03 4B 01 4C 07 01 1C 03 49 07 01 1C FF 00 03 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 1B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 00 02 01 01 43 01 02 40 01 FF 00 18 00 1C 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 01 07 01 1C FF 00 03 00 1C 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 06 07 00 02 07 01 2C 01 01 01 01 4E 07 01 1C FF 00 03 00 1C 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 01 00 1C 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 09 00 1C 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 37 00 1D 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 01 07 01 1C FF 00 03 00 1D 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 1D 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 02 00 1D 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 1D 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 4F 07 01 1C 03 4F 07 01 1C 03 78 01 4C 07 01 1C 03 49 07 01 1C FF 00 03 00 1D 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 1D 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 1D 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 02 01 01 43 01 02 40 01 FF 00 18 00 1E 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 00 01 07 01 1C FF 00 03 00 1E 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 00 06 07 00 02 07 01 2C 01 01 01 01 4E 07 01 1C FF 00 03 00 1E 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 01 00 1E 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 09 00 1E 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 37 00 1F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 01 07 01 1C FF 00 03 00 1F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 1F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 02 00 1F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 1F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 4F 07 01 1C 03 4F 07 01 1C 03 4B 01 4C 07 01 1C 03 49 07 01 1C FF 00 03 00 1F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 1F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 1F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 02 01 01 43 01 02 40 01 FF 00 18 00 20 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 00 01 07 01 1C FF 00 03 00 20 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 00 06 07 00 02 07 01 2C 01 01 01 01 4E 07 01 1C FF 00 03 00 20 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 01 00 20 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 09 00 20 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 37 00 21 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 01 07 01 1C FF 00 03 00 21 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 21 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 02 00 21 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 21 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 4F 07 01 1C 03 4F 07 01 1C 03 47 01 FF 00 17 00 23 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 00 01 07 01 1C 03 49 07 01 1C FF 00 03 00 23 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 23 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 23 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 00 02 01 01 43 01 02 40 01 FF 00 1A 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 01 07 01 1C FF 00 03 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 4E 07 01 1C FF 00 03 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 01 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 09 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 63 07 01 1C FF 00 03 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 05 07 01 2C 01 01 01 01 45 07 01 1C FF 00 03 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 05 07 01 2C 01 01 01 01 FF 00 01 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 06 07 01 2C 01 01 01 01 01 FF 00 08 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 06 07 01 2C 01 01 01 01 01 55 07 01 1C 43 07 00 EF 4D 07 01 1C FF 00 03 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 02 07 00 EF 01 48 07 01 1C 43 07 00 EF FF 00 01 00 24 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 00 02 07 00 EF 07 00 EF FF 00 16 00 25 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 00 01 07 01 1C 03 48 07 01 1C 43 07 00 02 45 07 01 1C 43 01 0D 40 07 00 02 5B 07 01 1C FF 00 03 00 25 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 00 05 07 00 02 07 01 2C 07 00 EF 01 01 FF 00 02 00 25 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 00 06 07 00 02 07 01 2C 07 00 EF 01 01 01 FF 00 02 00 25 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 00 05 07 00 02 07 01 2C 07 00 EF 01 01 FF 00 02 00 25 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 00 06 07 00 02 07 01 2C 07 00 EF 01 01 01 FF 00 2C 00 27 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 00 01 07 01 1C 03 49 07 01 1C FF 00 03 00 27 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 27 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 27 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 00 02 01 01 43 01 02 40 01 FF 00 18 00 28 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 00 01 07 01 1C FF 00 03 00 28 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 4E 07 01 1C FF 00 03 00 28 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 01 00 28 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 09 00 28 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 37 00 29 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 07 00 EF 00 01 07 01 1C FF 00 03 00 29 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 29 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 02 00 29 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 29 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 07 00 EF 07 00 EF 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 07 00 EF 01 01 01 07 00 EF 01 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 57 07 01 1C 03 FF 00 04 00 0B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 00 00 46 07 01 1C 43 01 4A 07 01 1C 03 FF 00 2C 00 10 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 00 01 07 01 1C 03 49 07 01 1C FF 00 03 00 10 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 10 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 10 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 00 02 01 01 43 01 02 40 01 FF 00 18 00 11 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 00 01 07 01 1C FF 00 03 00 11 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 02 00 11 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 02 00 11 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 02 00 11 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 54 07 01 1C 03 48 07 00 EF FF 00 3B 00 12 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 01 07 01 1C FF 00 03 00 12 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 12 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 02 00 12 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 12 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 4F 07 01 1C 03 4F 07 01 1C 03 41 01 4C 07 01 1C 03 49 07 01 1C FF 00 03 00 12 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 12 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 12 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 02 01 01 43 01 02 40 01 FF 00 18 00 13 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 01 07 01 1C FF 00 03 00 13 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 02 00 13 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 02 00 13 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 02 00 13 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 54 07 01 1C 03 48 07 00 EF FF 00 3B 00 14 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 01 07 01 1C FF 00 03 00 14 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 14 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 02 00 14 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 14 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 4F 07 01 1C 03 4F 07 01 1C 03 44 01 FF 00 10 00 15 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 00 01 07 01 1C 03 49 07 01 1C FF 00 03 00 15 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 15 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 15 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 00 02 01 01 43 01 02 40 01 FF 00 18 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 00 01 07 01 1C FF 00 03 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 02 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 02 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 02 00 16 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 19 4A 07 01 1C 43 07 03 32 45 07 01 1C 03 42 07 03 32 0E 40 07 03 3C FF 00 0E 00 18 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 00 07 03 3C 00 01 07 01 1C 03 41 07 03 3C 05 40 01 FF 00 0F 00 19 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 00 07 03 3C 01 00 01 07 01 1C 03 4B 07 01 1C 03 41 01 42 07 00 EF FF 00 10 00 17 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 07 00 EF 00 00 6B 07 01 1C FF 00 03 00 17 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 17 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 FF 00 02 00 17 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 07 00 EF 00 05 07 01 2C 07 01 38 07 00 EF 01 01 FF 00 02 00 17 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 01 07 00 EF 01 07 00 EF 01 01 07 00 EF 00 06 07 01 2C 07 01 38 07 00 EF 01 01 01 4F 07 01 1C 03 4F 07 01 1C FF 00 03 00 0B 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 00 00 41 01 FF 00 1B 00 0F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 00 01 01 4C 07 01 1C 03 49 07 01 1C FF 00 03 00 0F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 00 02 01 01 4A 07 01 1C 03 46 07 01 1C FF 00 03 00 0F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 00 02 01 01 4A 07 01 1C 03 49 07 01 1C 43 01 47 07 01 1C FF 00 03 00 0F 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 00 02 01 01 43 01 02 40 01 FF 00 18 00 10 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 00 01 07 01 1C FF 00 03 00 10 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 4F 07 01 1C FF 00 03 00 10 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 00 06 07 00 02 07 01 2C 01 01 01 01 FF 00 02 00 10 07 00 02 07 01 2C 07 00 EF 07 00 EF 01 01 07 03 25 01 01 01 01 01 01 01 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01 FF 00 09 00 0F 07 00 02 07 01 2C 00 00 00 00 00 00 00 00 00 01 00 01 01 00 07 07 00 02 07 01 2C 01 01 01 01 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  5      17     20     24     Ljava/lang/MatchException;
        //  35     47     50     54     Ljava/lang/MatchException;
        //  87     318    321    325    Ljava/lang/MatchException;
        //  569    586    589    593    Ljava/lang/MatchException;
        //  581    596    599    603    Ljava/lang/MatchException;
        //  593    615    618    622    Ljava/lang/MatchException;
        //  603    625    628    632    Ljava/lang/MatchException;
        //  643    655    658    662    Ljava/lang/MatchException;
        //  652    669    672    676    Ljava/lang/MatchException;
        //  676    684    687    691    Ljava/lang/MatchException;
        //  681    695    698    702    Ljava/lang/MatchException;
        //  702    710    713    717    Ljava/lang/MatchException;
        //  707    724    727    731    Ljava/lang/MatchException;
        //  717    736    739    743    Ljava/lang/MatchException;
        //  753    765    768    772    Ljava/lang/MatchException;
        //  762    787    787    791    Ljava/lang/MatchException;
        //  805    839    842    846    Ljava/lang/MatchException;
        //  836    908    911    915    Ljava/lang/MatchException;
        //  846    917    920    924    Ljava/lang/MatchException;
        //  924    932    935    939    Ljava/lang/MatchException;
        //  929    973    976    980    Ljava/lang/MatchException;
        //  982    990    993    997    Ljava/lang/MatchException;
        //  987    1031   1034   1038   Ljava/lang/MatchException;
        //  1083   1109   1112   1116   Ljava/lang/MatchException;
        //  1106   1122   1122   1126   Ljava/lang/MatchException;
        //  1128   1136   1139   1143   Ljava/lang/MatchException;
        //  1180   1197   1200   1204   Ljava/lang/MatchException;
        //  1194   1239   1242   1246   Ljava/lang/MatchException;
        //  1277   1289   1292   1296   Ljava/lang/MatchException;
        //  1286   1303   1306   1310   Ljava/lang/MatchException;
        //  1310   1318   1321   1325   Ljava/lang/MatchException;
        //  1315   1329   1332   1336   Ljava/lang/MatchException;
        //  1336   1344   1347   1351   Ljava/lang/MatchException;
        //  1341   1358   1361   1365   Ljava/lang/MatchException;
        //  1351   1370   1373   1377   Ljava/lang/MatchException;
        //  1387   1407   1410   1414   Ljava/lang/MatchException;
        //  1404   1429   1429   1433   Ljava/lang/MatchException;
        //  1459   1498   1501   1505   Ljava/lang/MatchException;
        //  1514   1527   1530   1534   Ljava/lang/MatchException;
        //  1524   1547   1550   1554   Ljava/lang/MatchException;
        //  1566   1576   1579   1583   Ljava/lang/MatchException;
        //  1573   1590   1593   1597   Ljava/lang/MatchException;
        //  1597   1605   1608   1612   Ljava/lang/MatchException;
        //  1602   1616   1619   1623   Ljava/lang/MatchException;
        //  1623   1631   1634   1638   Ljava/lang/MatchException;
        //  1628   1645   1648   1652   Ljava/lang/MatchException;
        //  1638   1657   1660   1664   Ljava/lang/MatchException;
        //  1674   1694   1697   1701   Ljava/lang/MatchException;
        //  1691   1716   1716   1720   Ljava/lang/MatchException;
        //  1746   1785   1788   1792   Ljava/lang/MatchException;
        //  1801   1814   1817   1821   Ljava/lang/MatchException;
        //  1811   1834   1837   1841   Ljava/lang/MatchException;
        //  1898   1908   1911   1915   Ljava/lang/MatchException;
        //  1905   1922   1925   1929   Ljava/lang/MatchException;
        //  1929   1937   1940   1944   Ljava/lang/MatchException;
        //  1934   1948   1951   1955   Ljava/lang/MatchException;
        //  1955   1963   1966   1970   Ljava/lang/MatchException;
        //  1960   1977   1980   1984   Ljava/lang/MatchException;
        //  1970   1989   1992   1996   Ljava/lang/MatchException;
        //  2006   2026   2029   2033   Ljava/lang/MatchException;
        //  2023   2048   2048   2052   Ljava/lang/MatchException;
        //  2078   2117   2120   2124   Ljava/lang/MatchException;
        //  2133   2146   2149   2153   Ljava/lang/MatchException;
        //  2143   2166   2169   2173   Ljava/lang/MatchException;
        //  2185   2195   2198   2202   Ljava/lang/MatchException;
        //  2192   2209   2212   2216   Ljava/lang/MatchException;
        //  2216   2224   2227   2231   Ljava/lang/MatchException;
        //  2221   2235   2238   2242   Ljava/lang/MatchException;
        //  2242   2250   2253   2257   Ljava/lang/MatchException;
        //  2247   2264   2267   2271   Ljava/lang/MatchException;
        //  2257   2276   2279   2283   Ljava/lang/MatchException;
        //  2293   2313   2316   2320   Ljava/lang/MatchException;
        //  2310   2335   2335   2339   Ljava/lang/MatchException;
        //  2365   2404   2407   2411   Ljava/lang/MatchException;
        //  2420   2433   2436   2440   Ljava/lang/MatchException;
        //  2430   2453   2456   2460   Ljava/lang/MatchException;
        //  2477   2489   2492   2496   Ljava/lang/MatchException;
        //  2486   2503   2506   2510   Ljava/lang/MatchException;
        //  2510   2518   2521   2525   Ljava/lang/MatchException;
        //  2515   2529   2532   2536   Ljava/lang/MatchException;
        //  2536   2544   2547   2551   Ljava/lang/MatchException;
        //  2541   2558   2561   2565   Ljava/lang/MatchException;
        //  2551   2570   2573   2577   Ljava/lang/MatchException;
        //  2587   2609   2612   2616   Ljava/lang/MatchException;
        //  2606   2631   2631   2635   Ljava/lang/MatchException;
        //  2647   2680   2683   2687   Ljava/lang/MatchException;
        //  2677   2693   2693   2697   Ljava/lang/MatchException;
        //  2708   2727   2730   2734   Ljava/lang/MatchException;
        //  2724   2745   2748   2752   Ljava/lang/MatchException;
        //  2752   2761   2761   2765   Ljava/lang/MatchException;
        //  2774   2787   2790   2794   Ljava/lang/MatchException;
        //  2784   2800   2803   2807   Ljava/lang/MatchException;
        //  2794   2810   2813   2817   Ljava/lang/MatchException;
        //  2832   2857   2860   2864   Ljava/lang/MatchException;
        //  2903   2915   2918   2922   Ljava/lang/MatchException;
        //  2912   2929   2932   2936   Ljava/lang/MatchException;
        //  2936   2944   2947   2951   Ljava/lang/MatchException;
        //  2941   2955   2958   2962   Ljava/lang/MatchException;
        //  2962   2970   2973   2977   Ljava/lang/MatchException;
        //  2967   2984   2987   2991   Ljava/lang/MatchException;
        //  2977   2996   2999   3003   Ljava/lang/MatchException;
        //  3013   3033   3036   3040   Ljava/lang/MatchException;
        //  3030   3055   3055   3059   Ljava/lang/MatchException;
        //  3085   3124   3127   3131   Ljava/lang/MatchException;
        //  3140   3161   3164   3168   Ljava/lang/MatchException;
        //  3168   3177   3180   3184   Ljava/lang/MatchException;
        //  3184   3192   3195   3199   Ljava/lang/MatchException;
        //  3229   3241   3244   3248   Ljava/lang/MatchException;
        //  3238   3255   3258   3262   Ljava/lang/MatchException;
        //  3262   3270   3273   3277   Ljava/lang/MatchException;
        //  3267   3281   3284   3288   Ljava/lang/MatchException;
        //  3288   3296   3299   3303   Ljava/lang/MatchException;
        //  3293   3310   3313   3317   Ljava/lang/MatchException;
        //  3303   3322   3325   3329   Ljava/lang/MatchException;
        //  3339   3359   3362   3366   Ljava/lang/MatchException;
        //  3375   3396   3396   3400   Ljava/lang/MatchException;
        //  3426   3466   3469   3473   Ljava/lang/MatchException;
        //  3482   3495   3498   3502   Ljava/lang/MatchException;
        //  3492   3515   3518   3522   Ljava/lang/MatchException;
        //  3524   3534   3537   3541   Ljava/lang/MatchException;
        //  3531   3548   3551   3555   Ljava/lang/MatchException;
        //  3555   3563   3566   3570   Ljava/lang/MatchException;
        //  3560   3574   3577   3581   Ljava/lang/MatchException;
        //  3581   3589   3592   3596   Ljava/lang/MatchException;
        //  3586   3603   3606   3610   Ljava/lang/MatchException;
        //  3596   3615   3618   3622   Ljava/lang/MatchException;
        //  3632   3652   3655   3659   Ljava/lang/MatchException;
        //  3668   3689   3689   3693   Ljava/lang/MatchException;
        //  3719   3759   3762   3766   Ljava/lang/MatchException;
        //  3775   3788   3791   3795   Ljava/lang/MatchException;
        //  3785   3808   3811   3815   Ljava/lang/MatchException;
        //  3822   3834   3837   3841   Ljava/lang/MatchException;
        //  3831   3848   3851   3855   Ljava/lang/MatchException;
        //  3855   3863   3866   3870   Ljava/lang/MatchException;
        //  3860   3874   3877   3881   Ljava/lang/MatchException;
        //  3881   3889   3892   3896   Ljava/lang/MatchException;
        //  3886   3903   3906   3910   Ljava/lang/MatchException;
        //  3896   3915   3918   3922   Ljava/lang/MatchException;
        //  3932   3952   3955   3959   Ljava/lang/MatchException;
        //  3989   4002   4005   4009   Ljava/lang/MatchException;
        //  3994   4012   4015   4019   Ljava/lang/MatchException;
        //  4040   4050   4053   4057   Ljava/lang/MatchException;
        //  4068   4079   4082   4086   Ljava/lang/MatchException;
        //  4075   4098   4098   4102   Ljava/lang/MatchException;
        //  4124   4165   4168   4172   Ljava/lang/MatchException;
        //  4181   4194   4197   4201   Ljava/lang/MatchException;
        //  4191   4214   4217   4221   Ljava/lang/MatchException;
        //  4251   4261   4264   4268   Ljava/lang/MatchException;
        //  4258   4275   4278   4282   Ljava/lang/MatchException;
        //  4282   4290   4293   4297   Ljava/lang/MatchException;
        //  4287   4301   4304   4308   Ljava/lang/MatchException;
        //  4308   4316   4319   4323   Ljava/lang/MatchException;
        //  4313   4330   4333   4337   Ljava/lang/MatchException;
        //  4323   4342   4345   4349   Ljava/lang/MatchException;
        //  4359   4379   4382   4386   Ljava/lang/MatchException;
        //  4376   4402   4402   4406   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0593:
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
    
    private boolean checkCondition(final double p0, final double p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //     4: ifne            27
        //     7: aload_0        
        //     8: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //    11: ifne            27
        //    14: goto            21
        //    17: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    20: athrow         
        //    21: iconst_0       
        //    22: ireturn        
        //    23: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    26: athrow         
        //    27: aload_0        
        //    28: dload_1        
        //    29: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_4:(D)I
        //    32: istore          5
        //    34: aload_0        
        //    35: dload_3        
        //    36: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_5:(D)I
        //    39: istore          6
        //    41: aload_0        
        //    42: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //    45: ifeq            58
        //    48: sipush          360
        //    51: goto            61
        //    54: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    57: athrow         
        //    58: sipush          240
        //    61: istore          7
        //    63: aload_0        
        //    64: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //    67: ifeq            80
        //    70: sipush          240
        //    73: goto            83
        //    76: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    79: athrow         
        //    80: sipush          140
        //    83: istore          8
        //    85: aload_0        
        //    86: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //    89: iload           7
        //    91: isub           
        //    92: iconst_2       
        //    93: idiv           
        //    94: istore          9
        //    96: aload_0        
        //    97: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //   100: iload           8
        //   102: isub           
        //   103: iconst_2       
        //   104: idiv           
        //   105: istore          10
        //   107: bipush          60
        //   109: istore          11
        //   111: bipush          14
        //   113: istore          12
        //   115: iload           9
        //   117: iload           7
        //   119: iadd           
        //   120: iload           11
        //   122: isub           
        //   123: bipush          8
        //   125: isub           
        //   126: istore          13
        //   128: iload           10
        //   130: bipush          6
        //   132: iadd           
        //   133: istore          14
        //   135: iload           5
        //   137: iload           13
        //   139: if_icmplt       211
        //   142: iload           5
        //   144: iload           13
        //   146: iload           11
        //   148: iadd           
        //   149: if_icmpge       211
        //   152: goto            159
        //   155: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   158: athrow         
        //   159: iload           6
        //   161: iload           14
        //   163: if_icmplt       211
        //   166: goto            173
        //   169: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   172: athrow         
        //   173: iload           6
        //   175: iload           14
        //   177: iload           12
        //   179: iadd           
        //   180: if_icmpge       211
        //   183: goto            190
        //   186: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   189: athrow         
        //   190: aload_0        
        //   191: iconst_0       
        //   192: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //   195: aload_0        
        //   196: iconst_0       
        //   197: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //   200: aload_0        
        //   201: iconst_0       
        //   202: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //   205: iconst_1       
        //   206: ireturn        
        //   207: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   210: athrow         
        //   211: aload_0        
        //   212: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //   215: ifeq            1260
        //   218: iload           9
        //   220: bipush          10
        //   222: iadd           
        //   223: istore          11
        //   225: iload           10
        //   227: bipush          30
        //   229: iadd           
        //   230: bipush          14
        //   232: iadd           
        //   233: istore          12
        //   235: sipush          180
        //   238: istore          13
        //   240: bipush          126
        //   242: istore          14
        //   244: bipush          18
        //   246: istore          15
        //   248: iload           5
        //   250: iload           11
        //   252: if_icmplt       378
        //   255: iload           5
        //   257: iload           11
        //   259: iload           13
        //   261: iadd           
        //   262: if_icmpge       378
        //   265: goto            272
        //   268: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   271: athrow         
        //   272: iload           6
        //   274: iload           12
        //   276: if_icmplt       378
        //   279: goto            286
        //   282: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   285: athrow         
        //   286: iload           6
        //   288: iload           12
        //   290: iload           14
        //   292: iadd           
        //   293: if_icmpge       378
        //   296: goto            303
        //   299: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   302: athrow         
        //   303: iload           6
        //   305: iload           12
        //   307: isub           
        //   308: iconst_2       
        //   309: isub           
        //   310: aload_0        
        //   311: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_2:I
        //   314: iadd           
        //   315: iload           15
        //   317: idiv           
        //   318: istore          16
        //   320: iload           16
        //   322: iflt            371
        //   325: iload           16
        //   327: aload_0        
        //   328: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //   331: invokeinterface java/util/List.size:()I
        //   336: if_icmpge       371
        //   339: goto            346
        //   342: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   345: athrow         
        //   346: aload_0        
        //   347: aload_0        
        //   348: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //   351: iload           16
        //   353: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   358: checkcast       Ljava/lang/String;
        //   361: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   364: goto            371
        //   367: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   370: athrow         
        //   371: aload_0        
        //   372: iconst_0       
        //   373: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //   376: iconst_1       
        //   377: ireturn        
        //   378: iload           11
        //   380: iload           13
        //   382: iadd           
        //   383: bipush          14
        //   385: iadd           
        //   386: istore          16
        //   388: sipush          140
        //   391: istore          17
        //   393: bipush          22
        //   395: istore          18
        //   397: bipush          6
        //   399: istore          19
        //   401: iload           12
        //   403: istore          20
        //   405: iload           5
        //   407: iload           16
        //   409: if_icmplt       538
        //   412: iload           5
        //   414: iload           16
        //   416: iload           17
        //   418: iadd           
        //   419: if_icmpge       538
        //   422: goto            429
        //   425: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   428: athrow         
        //   429: iload           6
        //   431: iload           20
        //   433: if_icmplt       538
        //   436: goto            443
        //   439: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   442: athrow         
        //   443: iload           6
        //   445: iload           20
        //   447: iload           18
        //   449: iadd           
        //   450: if_icmpge       538
        //   453: goto            460
        //   456: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   459: athrow         
        //   460: aload_0        
        //   461: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   464: invokevirtual   java/lang/String.isEmpty:()Z
        //   467: ifne            531
        //   470: goto            477
        //   473: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   476: athrow         
        //   477: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   480: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getDatab:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_1;
        //   483: aload_0        
        //   484: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   487: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.setString:(Ljava/lang/String;)V
        //   490: aload_0        
        //   491: aload_0        
        //   492: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   495: sipush          27872
        //   498: sipush          10978
        //   501: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   504: swap           
        //   505: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   510: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setString:(Ljava/lang/String;)V
        //   513: goto            531
        //   516: astore          21
        //   518: aload_0        
        //   519: sipush          27881
        //   522: sipush          -22182
        //   525: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   528: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setString:(Ljava/lang/String;)V
        //   531: aload_0        
        //   532: iconst_0       
        //   533: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //   536: iconst_1       
        //   537: ireturn        
        //   538: iload           20
        //   540: iload           18
        //   542: iload           19
        //   544: iadd           
        //   545: iadd           
        //   546: istore          20
        //   548: iload           5
        //   550: iload           16
        //   552: if_icmplt       690
        //   555: iload           5
        //   557: iload           16
        //   559: iload           17
        //   561: iadd           
        //   562: if_icmpge       690
        //   565: goto            572
        //   568: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   571: athrow         
        //   572: iload           6
        //   574: iload           20
        //   576: if_icmplt       690
        //   579: goto            586
        //   582: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   585: athrow         
        //   586: iload           6
        //   588: iload           20
        //   590: iload           18
        //   592: iadd           
        //   593: if_icmpge       690
        //   596: goto            603
        //   599: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   602: athrow         
        //   603: aload_0        
        //   604: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   607: invokevirtual   java/lang/String.isEmpty:()Z
        //   610: ifne            683
        //   613: goto            620
        //   616: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   619: athrow         
        //   620: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   623: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getDatab:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_1;
        //   626: aload_0        
        //   627: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   630: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.checkString:(Ljava/lang/String;)Z
        //   633: pop            
        //   634: aload_0        
        //   635: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   638: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getDatab:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_1;
        //   641: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.getList:()Ljava/util/List;
        //   644: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //   647: aload_0        
        //   648: aload_0        
        //   649: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   652: sipush          27844
        //   655: sipush          7365
        //   658: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   661: swap           
        //   662: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   667: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setString:(Ljava/lang/String;)V
        //   670: aload_0        
        //   671: ldc             ""
        //   673: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   676: goto            683
        //   679: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   682: athrow         
        //   683: aload_0        
        //   684: iconst_0       
        //   685: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //   688: iconst_1       
        //   689: ireturn        
        //   690: iload           20
        //   692: iload           18
        //   694: iload           19
        //   696: iadd           
        //   697: iconst_2       
        //   698: iadd           
        //   699: iload           19
        //   701: iadd           
        //   702: iconst_2       
        //   703: iadd           
        //   704: iadd           
        //   705: istore          20
        //   707: iload           5
        //   709: iload           16
        //   711: if_icmplt       815
        //   714: iload           5
        //   716: iload           16
        //   718: iload           17
        //   720: iadd           
        //   721: if_icmpge       815
        //   724: goto            731
        //   727: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   730: athrow         
        //   731: iload           6
        //   733: iload           20
        //   735: if_icmplt       815
        //   738: goto            745
        //   741: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   744: athrow         
        //   745: iload           6
        //   747: iload           20
        //   749: iload           18
        //   751: iadd           
        //   752: if_icmpge       815
        //   755: goto            762
        //   758: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   761: athrow         
        //   762: invokestatic    net/minecraft/class_156.method_668:()Lnet/minecraft/class_156$class_158;
        //   765: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   768: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getDatab:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_1;
        //   771: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.getPath:()Ljava/nio/file/Path;
        //   774: invokeinterface java/nio/file/Path.toFile:()Ljava/io/File;
        //   779: invokevirtual   net/minecraft/class_156$class_158.method_672:(Ljava/io/File;)V
        //   782: aload_0        
        //   783: sipush          27894
        //   786: sipush          9217
        //   789: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   792: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setString:(Ljava/lang/String;)V
        //   795: goto            813
        //   798: astore          21
        //   800: aload_0        
        //   801: sipush          27780
        //   804: sipush          32407
        //   807: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   810: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setString:(Ljava/lang/String;)V
        //   813: iconst_1       
        //   814: ireturn        
        //   815: iload           20
        //   817: iload           18
        //   819: iload           19
        //   821: iadd           
        //   822: iadd           
        //   823: istore          20
        //   825: iload           5
        //   827: iload           16
        //   829: if_icmplt       961
        //   832: iload           5
        //   834: iload           16
        //   836: iload           17
        //   838: iadd           
        //   839: if_icmpge       961
        //   842: goto            849
        //   845: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   848: athrow         
        //   849: iload           6
        //   851: iload           20
        //   853: if_icmplt       961
        //   856: goto            863
        //   859: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   862: athrow         
        //   863: iload           6
        //   865: iload           20
        //   867: iload           18
        //   869: iadd           
        //   870: if_icmpge       961
        //   873: goto            880
        //   876: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   879: athrow         
        //   880: aload_0        
        //   881: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   884: invokevirtual   java/lang/String.isEmpty:()Z
        //   887: ifne            959
        //   890: goto            897
        //   893: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   896: athrow         
        //   897: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   900: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getDatab:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_1;
        //   903: aload_0        
        //   904: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //   907: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //   910: astore          21
        //   912: aload           21
        //   914: ifnull          959
        //   917: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.class310:Lnet/minecraft/class_310;
        //   920: getfield        net/minecraft/class_310.field_1774:Lnet/minecraft/class_309;
        //   923: aload           21
        //   925: invokevirtual   net/minecraft/class_309.method_1455:(Ljava/lang/String;)V
        //   928: aload_0        
        //   929: sipush          27842
        //   932: sipush          4309
        //   935: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   938: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setString:(Ljava/lang/String;)V
        //   941: goto            959
        //   944: astore          22
        //   946: aload_0        
        //   947: sipush          27898
        //   950: sipush          14788
        //   953: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   956: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setString:(Ljava/lang/String;)V
        //   959: iconst_1       
        //   960: ireturn        
        //   961: iload           10
        //   963: iload           8
        //   965: iadd           
        //   966: bipush          38
        //   968: isub           
        //   969: istore          21
        //   971: iload           13
        //   973: bipush          70
        //   975: iadd           
        //   976: istore          22
        //   978: iload           5
        //   980: iload           11
        //   982: if_icmplt       1044
        //   985: iload           5
        //   987: iload           11
        //   989: iload           22
        //   991: iadd           
        //   992: if_icmpge       1044
        //   995: goto            1002
        //   998: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1001: athrow         
        //  1002: iload           6
        //  1004: iload           21
        //  1006: if_icmplt       1044
        //  1009: goto            1016
        //  1012: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1015: athrow         
        //  1016: iload           6
        //  1018: iload           21
        //  1020: bipush          22
        //  1022: iadd           
        //  1023: if_icmpge       1044
        //  1026: goto            1033
        //  1029: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1032: athrow         
        //  1033: aload_0        
        //  1034: iconst_1       
        //  1035: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  1038: iconst_1       
        //  1039: ireturn        
        //  1040: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1043: athrow         
        //  1044: iload           11
        //  1046: iload           22
        //  1048: iadd           
        //  1049: bipush          8
        //  1051: iadd           
        //  1052: istore          23
        //  1054: iload           7
        //  1056: iload           22
        //  1058: isub           
        //  1059: bipush          28
        //  1061: isub           
        //  1062: istore          24
        //  1064: iload           5
        //  1066: iload           23
        //  1068: if_icmplt       1257
        //  1071: iload           5
        //  1073: iload           23
        //  1075: iload           24
        //  1077: iadd           
        //  1078: if_icmpge       1257
        //  1081: goto            1088
        //  1084: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1087: athrow         
        //  1088: iload           6
        //  1090: iload           21
        //  1092: if_icmplt       1257
        //  1095: goto            1102
        //  1098: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1101: athrow         
        //  1102: iload           6
        //  1104: iload           21
        //  1106: bipush          22
        //  1108: iadd           
        //  1109: if_icmpge       1257
        //  1112: goto            1119
        //  1115: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1118: athrow         
        //  1119: aload_0        
        //  1120: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  1123: ifeq            1161
        //  1126: goto            1133
        //  1129: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1132: athrow         
        //  1133: aload_0        
        //  1134: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //  1137: invokevirtual   java/lang/String.isEmpty:()Z
        //  1140: ifne            1161
        //  1143: goto            1150
        //  1146: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1149: athrow         
        //  1150: aload_0        
        //  1151: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //  1154: goto            1165
        //  1157: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1160: athrow         
        //  1161: aload_0        
        //  1162: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //  1165: astore          25
        //  1167: aload           25
        //  1169: invokevirtual   java/lang/String.isEmpty:()Z
        //  1172: ifne            1255
        //  1175: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //  1178: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getDatab:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_1;
        //  1181: aload           25
        //  1183: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.setString_1:(Ljava/lang/String;)V
        //  1186: aload_0        
        //  1187: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //  1190: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getDatab:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_1;
        //  1193: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.getList:()Ljava/util/List;
        //  1196: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //  1199: aload_0        
        //  1200: aload           25
        //  1202: sipush          27840
        //  1205: sipush          -27993
        //  1208: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1211: swap           
        //  1212: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1217: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setString:(Ljava/lang/String;)V
        //  1220: aload_0        
        //  1221: ldc             ""
        //  1223: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //  1226: aload_0        
        //  1227: iconst_0       
        //  1228: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  1231: aload_0        
        //  1232: aload           25
        //  1234: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_4:Ljava/lang/String;
        //  1237: goto            1255
        //  1240: astore          26
        //  1242: aload_0        
        //  1243: sipush          27851
        //  1246: sipush          17296
        //  1249: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //  1252: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.setString:(Ljava/lang/String;)V
        //  1255: iconst_1       
        //  1256: ireturn        
        //  1257: goto            1476
        //  1260: aload_0        
        //  1261: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //  1264: ifeq            1476
        //  1267: iload           9
        //  1269: bipush          40
        //  1271: iadd           
        //  1272: istore          11
        //  1274: iload           10
        //  1276: bipush          45
        //  1278: iadd           
        //  1279: istore          12
        //  1281: iload           10
        //  1283: bipush          75
        //  1285: iadd           
        //  1286: istore          13
        //  1288: sipush          160
        //  1291: istore          14
        //  1293: bipush          20
        //  1295: istore          15
        //  1297: iload           5
        //  1299: iload           11
        //  1301: if_icmplt       1476
        //  1304: iload           5
        //  1306: iload           11
        //  1308: iload           14
        //  1310: iadd           
        //  1311: if_icmpge       1476
        //  1314: goto            1321
        //  1317: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1320: athrow         
        //  1321: iload           6
        //  1323: iload           12
        //  1325: if_icmplt       1380
        //  1328: goto            1335
        //  1331: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1334: athrow         
        //  1335: iload           6
        //  1337: iload           12
        //  1339: iload           15
        //  1341: iadd           
        //  1342: if_icmpge       1380
        //  1345: goto            1352
        //  1348: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1351: athrow         
        //  1352: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.boolFlag:Z
        //  1355: ifne            1373
        //  1358: goto            1365
        //  1361: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1364: athrow         
        //  1365: iconst_1       
        //  1366: goto            1374
        //  1369: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1372: athrow         
        //  1373: iconst_0       
        //  1374: putstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.boolFlag:Z
        //  1377: goto            1474
        //  1380: iload           6
        //  1382: iload           13
        //  1384: if_icmplt       1432
        //  1387: iload           6
        //  1389: iload           13
        //  1391: iload           15
        //  1393: iadd           
        //  1394: if_icmpge       1432
        //  1397: goto            1404
        //  1400: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1403: athrow         
        //  1404: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.boolFlag_1:Z
        //  1407: ifne            1425
        //  1410: goto            1417
        //  1413: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1416: athrow         
        //  1417: iconst_1       
        //  1418: goto            1426
        //  1421: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1424: athrow         
        //  1425: iconst_0       
        //  1426: putstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.boolFlag_1:Z
        //  1429: goto            1474
        //  1432: iload           6
        //  1434: iload           10
        //  1436: bipush          105
        //  1438: iadd           
        //  1439: if_icmplt       1474
        //  1442: iload           6
        //  1444: iload           10
        //  1446: bipush          105
        //  1448: iadd           
        //  1449: iload           15
        //  1451: iadd           
        //  1452: if_icmpge       1474
        //  1455: goto            1462
        //  1458: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1461: athrow         
        //  1462: aload_0        
        //  1463: iconst_1       
        //  1464: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_1:Z
        //  1467: goto            1474
        //  1470: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1473: athrow         
        //  1474: iconst_1       
        //  1475: ireturn        
        //  1476: bipush          60
        //  1478: istore          11
        //  1480: bipush          14
        //  1482: istore          12
        //  1484: iload           9
        //  1486: iload           7
        //  1488: iadd           
        //  1489: iload           11
        //  1491: isub           
        //  1492: bipush          8
        //  1494: isub           
        //  1495: istore          13
        //  1497: iload           10
        //  1499: bipush          6
        //  1501: iadd           
        //  1502: istore          14
        //  1504: iload           5
        //  1506: iload           13
        //  1508: if_icmplt       1580
        //  1511: iload           5
        //  1513: iload           13
        //  1515: iload           11
        //  1517: iadd           
        //  1518: if_icmpge       1580
        //  1521: goto            1528
        //  1524: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1527: athrow         
        //  1528: iload           6
        //  1530: iload           14
        //  1532: if_icmplt       1580
        //  1535: goto            1542
        //  1538: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1541: athrow         
        //  1542: iload           6
        //  1544: iload           14
        //  1546: iload           12
        //  1548: iadd           
        //  1549: if_icmpge       1580
        //  1552: goto            1559
        //  1555: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1558: athrow         
        //  1559: aload_0        
        //  1560: iconst_0       
        //  1561: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //  1564: aload_0        
        //  1565: iconst_0       
        //  1566: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //  1569: aload_0        
        //  1570: iconst_0       
        //  1571: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  1574: iconst_1       
        //  1575: ireturn        
        //  1576: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1579: athrow         
        //  1580: iload           5
        //  1582: iload           9
        //  1584: if_icmplt       1646
        //  1587: iload           5
        //  1589: iload           9
        //  1591: iload           7
        //  1593: iadd           
        //  1594: if_icmpge       1646
        //  1597: goto            1604
        //  1600: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1603: athrow         
        //  1604: iload           6
        //  1606: iload           10
        //  1608: if_icmplt       1646
        //  1611: goto            1618
        //  1614: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1617: athrow         
        //  1618: iload           6
        //  1620: iload           10
        //  1622: iload           8
        //  1624: iadd           
        //  1625: if_icmpge       1646
        //  1628: goto            1635
        //  1631: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1634: athrow         
        //  1635: aload_0        
        //  1636: iconst_0       
        //  1637: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //  1640: iconst_1       
        //  1641: ireturn        
        //  1642: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1645: athrow         
        //  1646: iconst_0       
        //  1647: ireturn        
        //    StackMapTable: 00 89 51 07 01 88 03 41 07 01 88 03 FF 00 1A 00 05 07 00 02 03 03 01 01 00 01 07 01 88 03 42 01 FF 00 0E 00 06 07 00 02 03 03 01 01 01 00 01 07 01 88 03 42 01 FF 00 47 00 0D 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 00 01 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 50 07 01 88 03 FF 00 38 00 0E 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 01 00 01 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 FF 00 26 00 0F 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 01 01 00 01 07 01 88 03 54 07 01 88 03 FA 00 06 FF 00 2E 00 13 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 00 01 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 4C 07 01 88 03 66 07 01 88 0E 06 5D 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 4C 07 01 88 03 7A 07 01 88 03 06 64 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 63 07 01 88 0E 01 5D 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 4C 07 01 88 03 FF 00 2E 00 14 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 01 07 01 88 FA 00 0E 01 FF 00 24 00 15 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 00 01 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 46 07 01 88 03 FF 00 27 00 17 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 00 01 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 46 07 01 88 03 43 07 00 EF FF 00 4A 00 18 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 01 07 00 EF 00 01 07 01 88 0E FA 00 01 FF 00 02 00 0D 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 00 00 FF 00 38 00 0E 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 01 00 01 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 48 07 01 88 03 43 07 01 88 03 40 01 05 53 07 01 88 03 48 07 01 88 03 43 07 01 88 03 40 01 05 59 07 01 88 03 47 07 01 88 03 FA 00 01 6F 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 50 07 01 88 03 53 07 01 88 03 49 07 01 88 03 4C 07 01 88 03 46 07 01 88 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  443    470    473    477    Ljava/lang/Exception;
        //  429    453    456    460    Ljava/lang/Exception;
        //  412    436    439    443    Ljava/lang/Exception;
        //  405    422    425    429    Ljava/lang/Exception;
        //  325    364    367    371    Ljava/lang/Exception;
        //  320    339    342    346    Ljava/lang/Exception;
        //  272    296    299    303    Ljava/lang/Exception;
        //  255    279    282    286    Ljava/lang/Exception;
        //  248    265    268    272    Ljava/lang/Exception;
        //  173    207    207    211    Ljava/lang/Exception;
        //  159    183    186    190    Ljava/lang/Exception;
        //  142    166    169    173    Ljava/lang/Exception;
        //  135    152    155    159    Ljava/lang/Exception;
        //  63     76     76     80     Ljava/lang/Exception;
        //  41     54     54     58     Ljava/lang/Exception;
        //  7      23     23     27     Ljava/lang/Exception;
        //  0      14     17     21     Ljava/lang/Exception;
        //  477    513    516    531    Ljava/lang/Exception;
        //  731    755    758    762    Ljava/lang/Exception;
        //  714    738    741    745    Ljava/lang/Exception;
        //  707    724    727    731    Ljava/lang/Exception;
        //  603    676    679    683    Ljava/lang/Exception;
        //  586    613    616    620    Ljava/lang/Exception;
        //  572    596    599    603    Ljava/lang/Exception;
        //  555    579    582    586    Ljava/lang/Exception;
        //  548    565    568    572    Ljava/lang/Exception;
        //  762    795    798    813    Ljava/lang/Exception;
        //  863    890    893    897    Ljava/lang/Exception;
        //  849    873    876    880    Ljava/lang/Exception;
        //  832    856    859    863    Ljava/lang/Exception;
        //  825    842    845    849    Ljava/lang/Exception;
        //  917    941    944    959    Ljava/lang/Exception;
        //  1133   1157   1157   1161   Ljava/lang/Exception;
        //  1119   1143   1146   1150   Ljava/lang/Exception;
        //  1102   1126   1129   1133   Ljava/lang/Exception;
        //  1088   1112   1115   1119   Ljava/lang/Exception;
        //  1071   1095   1098   1102   Ljava/lang/Exception;
        //  1064   1081   1084   1088   Ljava/lang/Exception;
        //  1016   1040   1040   1044   Ljava/lang/Exception;
        //  1002   1026   1029   1033   Ljava/lang/Exception;
        //  985    1009   1012   1016   Ljava/lang/Exception;
        //  978    995    998    1002   Ljava/lang/Exception;
        //  1175   1237   1240   1255   Ljava/lang/Exception;
        //  1297   1314   1317   1321   Ljava/lang/Exception;
        //  1304   1328   1331   1335   Ljava/lang/Exception;
        //  1321   1345   1348   1352   Ljava/lang/Exception;
        //  1335   1358   1361   1365   Ljava/lang/Exception;
        //  1352   1369   1369   1373   Ljava/lang/Exception;
        //  1380   1397   1400   1404   Ljava/lang/Exception;
        //  1387   1410   1413   1417   Ljava/lang/Exception;
        //  1404   1421   1421   1425   Ljava/lang/Exception;
        //  1432   1455   1458   1462   Ljava/lang/Exception;
        //  1442   1467   1470   1474   Ljava/lang/Exception;
        //  1504   1521   1524   1528   Ljava/lang/Exception;
        //  1511   1535   1538   1542   Ljava/lang/Exception;
        //  1528   1552   1555   1559   Ljava/lang/Exception;
        //  1542   1576   1576   1580   Ljava/lang/Exception;
        //  1580   1597   1600   1604   Ljava/lang/Exception;
        //  1587   1611   1614   1618   Ljava/lang/Exception;
        //  1604   1628   1631   1635   Ljava/lang/Exception;
        //  1618   1642   1642   1646   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0159:
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
    
    public boolean method_25402(final class_11909 p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   net/minecraft/class_11909.comp_4798:()D
        //     4: dstore_3       
        //     5: aload_1        
        //     6: invokevirtual   net/minecraft/class_11909.comp_4799:()D
        //     9: dstore          5
        //    11: aload_1        
        //    12: invokevirtual   net/minecraft/class_11909.method_74245:()I
        //    15: istore          7
        //    17: aload_0        
        //    18: dload_3        
        //    19: dload           5
        //    21: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.checkCondition:(DD)Z
        //    24: ifeq            33
        //    27: iconst_1       
        //    28: ireturn        
        //    29: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    32: athrow         
        //    33: aload_0        
        //    34: dload_3        
        //    35: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_4:(D)I
        //    38: istore          8
        //    40: aload_0        
        //    41: dload           5
        //    43: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_5:(D)I
        //    46: istore          9
        //    48: aload_0        
        //    49: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //    52: ifnull          109
        //    55: iload           7
        //    57: iflt            109
        //    60: goto            67
        //    63: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    66: athrow         
        //    67: iload           7
        //    69: bipush          7
        //    71: if_icmpgt       109
        //    74: goto            81
        //    77: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    80: athrow         
        //    81: aload_0        
        //    82: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //    85: iload           7
        //    87: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.setInt:(I)V
        //    90: aload_0        
        //    91: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //    94: iconst_0       
        //    95: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.setBool:(Z)V
        //    98: aload_0        
        //    99: aconst_null    
        //   100: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   103: iconst_1       
        //   104: ireturn        
        //   105: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   108: athrow         
        //   109: sipush          200
        //   112: istore          10
        //   114: bipush          16
        //   116: istore          11
        //   118: aload_0        
        //   119: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   122: iload           10
        //   124: isub           
        //   125: iconst_2       
        //   126: idiv           
        //   127: istore          12
        //   129: bipush          20
        //   131: istore          13
        //   133: iload           8
        //   135: iload           12
        //   137: if_icmplt       259
        //   140: iload           8
        //   142: iload           12
        //   144: iload           10
        //   146: iadd           
        //   147: if_icmpge       259
        //   150: goto            157
        //   153: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   156: athrow         
        //   157: iload           9
        //   159: iload           13
        //   161: if_icmplt       259
        //   164: goto            171
        //   167: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   170: athrow         
        //   171: iload           9
        //   173: iload           13
        //   175: iload           11
        //   177: iadd           
        //   178: if_icmpge       259
        //   181: goto            188
        //   184: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   187: athrow         
        //   188: aload_0        
        //   189: iconst_1       
        //   190: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_4:Z
        //   193: aload_0        
        //   194: iconst_0       
        //   195: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //   198: aload_0        
        //   199: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   202: invokevirtual   java/lang/String.isEmpty:()Z
        //   205: ifne            257
        //   208: goto            215
        //   211: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   214: athrow         
        //   215: iload           8
        //   217: iload           12
        //   219: iload           10
        //   221: iadd           
        //   222: bipush          14
        //   224: isub           
        //   225: if_icmplt       257
        //   228: goto            235
        //   231: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   234: athrow         
        //   235: aload_0        
        //   236: ldc             ""
        //   238: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   241: aload_0        
        //   242: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.execute:()V
        //   245: aload_0        
        //   246: iconst_0       
        //   247: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_4:Z
        //   250: goto            257
        //   253: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   256: athrow         
        //   257: iconst_1       
        //   258: ireturn        
        //   259: aload_0        
        //   260: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_4:Z
        //   263: ifeq            295
        //   266: aload_0        
        //   267: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   270: invokevirtual   java/lang/String.isEmpty:()Z
        //   273: ifeq            295
        //   276: goto            283
        //   279: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   282: athrow         
        //   283: aload_0        
        //   284: iconst_0       
        //   285: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_4:Z
        //   288: goto            295
        //   291: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   294: athrow         
        //   295: aload_0        
        //   296: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   299: invokevirtual   java/lang/String.isEmpty:()Z
        //   302: ifne            794
        //   305: aload_0        
        //   306: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //   309: invokeinterface java/util/List.isEmpty:()Z
        //   314: ifne            794
        //   317: goto            324
        //   320: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   323: athrow         
        //   324: aload_0        
        //   325: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   328: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   331: isub           
        //   332: bipush          40
        //   334: isub           
        //   335: iconst_2       
        //   336: idiv           
        //   337: istore          14
        //   339: bipush          42
        //   341: istore          15
        //   343: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   346: bipush          40
        //   348: iadd           
        //   349: istore          16
        //   351: iconst_0       
        //   352: istore          17
        //   354: aload_0        
        //   355: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //   358: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   363: astore          18
        //   365: aload           18
        //   367: invokeinterface java/util/Iterator.hasNext:()Z
        //   372: ifeq            425
        //   375: aload           18
        //   377: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   382: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   385: astore          19
        //   387: iinc            17, 17
        //   390: aload_0        
        //   391: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_2:Ljava/util/Set;
        //   394: aload           19
        //   396: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   401: ifeq            422
        //   404: iload           17
        //   406: aload           19
        //   408: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //   411: invokeinterface java/util/List.size:()I
        //   416: bipush          16
        //   418: imul           
        //   419: iadd           
        //   420: istore          17
        //   422: goto            365
        //   425: iload           17
        //   427: sipush          360
        //   430: invokestatic    java/lang/Math.min:(II)I
        //   433: istore          18
        //   435: iload           18
        //   437: ifgt            444
        //   440: bipush          17
        //   442: istore          18
        //   444: iload           8
        //   446: iload           14
        //   448: if_icmplt       794
        //   451: iload           8
        //   453: iload           14
        //   455: iload           16
        //   457: iadd           
        //   458: if_icmpge       794
        //   461: goto            468
        //   464: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   467: athrow         
        //   468: iload           9
        //   470: iload           15
        //   472: bipush          24
        //   474: iadd           
        //   475: if_icmplt       794
        //   478: goto            485
        //   481: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   484: athrow         
        //   485: iload           9
        //   487: iload           15
        //   489: bipush          24
        //   491: iadd           
        //   492: iload           18
        //   494: iadd           
        //   495: if_icmpge       794
        //   498: goto            505
        //   501: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   504: athrow         
        //   505: iload           15
        //   507: bipush          24
        //   509: iadd           
        //   510: aload_0        
        //   511: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_3:I
        //   514: isub           
        //   515: istore          19
        //   517: aload_0        
        //   518: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //   521: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   526: astore          20
        //   528: aload           20
        //   530: invokeinterface java/util/Iterator.hasNext:()Z
        //   535: ifeq            792
        //   538: aload           20
        //   540: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   545: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   548: astore          21
        //   550: iload           9
        //   552: iload           19
        //   554: if_icmplt       675
        //   557: iload           9
        //   559: iload           19
        //   561: bipush          17
        //   563: iadd           
        //   564: if_icmpge       675
        //   567: goto            574
        //   570: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   573: athrow         
        //   574: iload           9
        //   576: iload           15
        //   578: bipush          24
        //   580: iadd           
        //   581: if_icmplt       675
        //   584: goto            591
        //   587: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   590: athrow         
        //   591: iload           7
        //   593: ifne            615
        //   596: goto            603
        //   599: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   602: athrow         
        //   603: aload           21
        //   605: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.execute_2:()V
        //   608: goto            673
        //   611: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   614: athrow         
        //   615: iload           7
        //   617: iconst_1       
        //   618: if_icmpne       673
        //   621: aload_0        
        //   622: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_2:Ljava/util/Set;
        //   625: aload           21
        //   627: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   632: ifeq            661
        //   635: goto            642
        //   638: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   641: athrow         
        //   642: aload_0        
        //   643: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_2:Ljava/util/Set;
        //   646: aload           21
        //   648: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   653: pop            
        //   654: goto            673
        //   657: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   660: athrow         
        //   661: aload_0        
        //   662: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_2:Ljava/util/Set;
        //   665: aload           21
        //   667: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   672: pop            
        //   673: iconst_1       
        //   674: ireturn        
        //   675: iinc            19, 17
        //   678: aload_0        
        //   679: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_2:Ljava/util/Set;
        //   682: aload           21
        //   684: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   689: ifeq            789
        //   692: aload           21
        //   694: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //   697: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   702: astore          22
        //   704: aload           22
        //   706: invokeinterface java/util/Iterator.hasNext:()Z
        //   711: ifeq            789
        //   714: aload           22
        //   716: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   721: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/Initializer;
        //   724: astore          23
        //   726: iload           9
        //   728: iload           19
        //   730: if_icmplt       783
        //   733: iload           9
        //   735: iload           19
        //   737: bipush          16
        //   739: iadd           
        //   740: if_icmpge       783
        //   743: goto            750
        //   746: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   749: athrow         
        //   750: iload           9
        //   752: iload           15
        //   754: bipush          24
        //   756: iadd           
        //   757: if_icmplt       783
        //   760: goto            767
        //   763: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   766: athrow         
        //   767: aload_0        
        //   768: aload           23
        //   770: iload           8
        //   772: iload           14
        //   774: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_5:(Lcom/target/mod/compat/sub1/sub2/sub2/sub1/Initializer;II)V
        //   777: iconst_1       
        //   778: ireturn        
        //   779: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   782: athrow         
        //   783: iinc            19, 16
        //   786: goto            704
        //   789: goto            528
        //   792: iconst_1       
        //   793: ireturn        
        //   794: aload_0        
        //   795: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   798: bipush          8
        //   800: isub           
        //   801: istore          14
        //   803: aload_0        
        //   804: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strArr:[Ljava/lang/String;
        //   807: arraylength    
        //   808: iconst_1       
        //   809: isub           
        //   810: istore          15
        //   812: iload           15
        //   814: iflt            1041
        //   817: aload_0        
        //   818: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intArr:[I
        //   821: iload           15
        //   823: iaload         
        //   824: istore          16
        //   826: iload           14
        //   828: iload           16
        //   830: isub           
        //   831: istore          14
        //   833: aload_0        
        //   834: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //   837: bipush          26
        //   839: isub           
        //   840: istore          17
        //   842: iload           8
        //   844: iload           14
        //   846: if_icmplt       1032
        //   849: iload           8
        //   851: iload           14
        //   853: iload           16
        //   855: iadd           
        //   856: if_icmpge       1032
        //   859: goto            866
        //   862: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   865: athrow         
        //   866: iload           9
        //   868: iload           17
        //   870: if_icmplt       1032
        //   873: goto            880
        //   876: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   879: athrow         
        //   880: iload           9
        //   882: iload           17
        //   884: bipush          19
        //   886: iadd           
        //   887: if_icmpge       1032
        //   890: goto            897
        //   893: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   896: athrow         
        //   897: iload           7
        //   899: ifne            1030
        //   902: goto            909
        //   905: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   908: athrow         
        //   909: aload_0        
        //   910: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strArr:[Ljava/lang/String;
        //   913: iload           15
        //   915: aaload         
        //   916: sipush          27861
        //   919: sipush          -8942
        //   922: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   925: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   928: ifeq            949
        //   931: goto            938
        //   934: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   937: athrow         
        //   938: aload_0        
        //   939: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_25419:()V
        //   942: goto            1030
        //   945: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   948: athrow         
        //   949: aload_0        
        //   950: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strArr:[Ljava/lang/String;
        //   953: iload           15
        //   955: aaload         
        //   956: sipush          27890
        //   959: sipush          -7772
        //   962: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   965: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   968: ifeq            983
        //   971: aload_0        
        //   972: iconst_1       
        //   973: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //   976: goto            1030
        //   979: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   982: athrow         
        //   983: aload_0        
        //   984: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strArr:[Ljava/lang/String;
        //   987: iload           15
        //   989: aaload         
        //   990: sipush          27874
        //   993: sipush          -7288
        //   996: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.createString_1:(II)Ljava/lang/String;
        //   999: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1002: ifeq            1030
        //  1005: aload_0        
        //  1006: iconst_1       
        //  1007: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //  1010: aload_0        
        //  1011: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //  1014: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getDatab:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_1;
        //  1017: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.getList:()Ljava/util/List;
        //  1020: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //  1023: goto            1030
        //  1026: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1029: athrow         
        //  1030: iconst_1       
        //  1031: ireturn        
        //  1032: iinc            14, -6
        //  1035: iinc            15, -1
        //  1038: goto            812
        //  1041: aload_0        
        //  1042: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list:Ljava/util/List;
        //  1045: invokeinterface java/util/List.size:()I
        //  1050: iconst_1       
        //  1051: isub           
        //  1052: istore          15
        //  1054: iload           15
        //  1056: iflt            1780
        //  1059: aload_0        
        //  1060: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list:Ljava/util/List;
        //  1063: iload           15
        //  1065: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1070: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer;
        //  1073: astore          16
        //  1075: aload_0        
        //  1076: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map:Ljava/util/Map;
        //  1079: aload           16
        //  1081: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1086: checkcast       Ljava/lang/Integer;
        //  1089: invokevirtual   java/lang/Integer.intValue:()I
        //  1092: istore          17
        //  1094: aload_0        
        //  1095: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map_1:Ljava/util/Map;
        //  1098: aload           16
        //  1100: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1105: checkcast       Ljava/lang/Integer;
        //  1108: invokevirtual   java/lang/Integer.intValue:()I
        //  1111: istore          18
        //  1113: aload_0        
        //  1114: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map_2:Ljava/util/Map;
        //  1117: aload           16
        //  1119: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1124: checkcast       Ljava/lang/Integer;
        //  1127: invokevirtual   java/lang/Integer.intValue:()I
        //  1130: istore          19
        //  1132: getstatic       com/target/mod/compat/sub1/sub2/sub1/Initializer.utilC:Lcom/target/mod/compat/sub1/sub2/sub1/Initializer;
        //  1135: aload           16
        //  1137: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/Initializer.computeList:(Lcom/target/mod/compat/sub1/sub2/sub2/Initializer;)Ljava/util/List;
        //  1140: astore          20
        //  1142: iconst_0       
        //  1143: istore          21
        //  1145: aload           20
        //  1147: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1152: astore          22
        //  1154: aload           22
        //  1156: invokeinterface java/util/Iterator.hasNext:()Z
        //  1161: ifeq            1214
        //  1164: aload           22
        //  1166: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1171: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //  1174: astore          23
        //  1176: iinc            21, 17
        //  1179: aload_0        
        //  1180: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set:Ljava/util/Set;
        //  1183: aload           23
        //  1185: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  1190: ifeq            1211
        //  1193: iload           21
        //  1195: aload           23
        //  1197: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //  1200: invokeinterface java/util/List.size:()I
        //  1205: bipush          16
        //  1207: imul           
        //  1208: iadd           
        //  1209: istore          21
        //  1211: goto            1154
        //  1214: iload           21
        //  1216: sipush          360
        //  1219: invokestatic    java/lang/Math.min:(II)I
        //  1222: istore          22
        //  1224: iload           22
        //  1226: ifgt            1233
        //  1229: bipush          17
        //  1231: istore          22
        //  1233: iload           8
        //  1235: iload           17
        //  1237: if_icmplt       1406
        //  1240: iload           8
        //  1242: iload           17
        //  1244: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1247: iadd           
        //  1248: if_icmpge       1406
        //  1251: goto            1258
        //  1254: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1257: athrow         
        //  1258: iload           9
        //  1260: iload           18
        //  1262: if_icmplt       1406
        //  1265: goto            1272
        //  1268: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1271: athrow         
        //  1272: iload           9
        //  1274: iload           18
        //  1276: bipush          24
        //  1278: iadd           
        //  1279: if_icmpge       1406
        //  1282: goto            1289
        //  1285: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1288: athrow         
        //  1289: iload           7
        //  1291: iconst_1       
        //  1292: if_icmpne       1356
        //  1295: goto            1302
        //  1298: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1301: athrow         
        //  1302: aload_0        
        //  1303: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_1:Ljava/util/Set;
        //  1306: aload           16
        //  1308: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  1313: ifeq            1342
        //  1316: goto            1323
        //  1319: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1322: athrow         
        //  1323: aload_0        
        //  1324: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_1:Ljava/util/Set;
        //  1327: aload           16
        //  1329: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //  1334: pop            
        //  1335: goto            1354
        //  1338: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1341: athrow         
        //  1342: aload_0        
        //  1343: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_1:Ljava/util/Set;
        //  1346: aload           16
        //  1348: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //  1353: pop            
        //  1354: iconst_1       
        //  1355: ireturn        
        //  1356: aload_0        
        //  1357: aload           16
        //  1359: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.cacheE:Lcom/target/mod/compat/sub1/sub2/sub2/Initializer;
        //  1362: aload_0        
        //  1363: iload           8
        //  1365: iload           17
        //  1367: isub           
        //  1368: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue:I
        //  1371: aload_0        
        //  1372: iload           9
        //  1374: iload           18
        //  1376: isub           
        //  1377: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_1:I
        //  1380: aload_0        
        //  1381: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list:Ljava/util/List;
        //  1384: iload           15
        //  1386: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //  1391: pop            
        //  1392: aload_0        
        //  1393: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list:Ljava/util/List;
        //  1396: aload           16
        //  1398: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1403: pop            
        //  1404: iconst_1       
        //  1405: ireturn        
        //  1406: aload_0        
        //  1407: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_1:Ljava/util/Set;
        //  1410: aload           16
        //  1412: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  1417: ifeq            1427
        //  1420: goto            1774
        //  1423: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1426: athrow         
        //  1427: iload           8
        //  1429: iload           17
        //  1431: if_icmplt       1774
        //  1434: iload           8
        //  1436: iload           17
        //  1438: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //  1441: iadd           
        //  1442: if_icmpge       1774
        //  1445: goto            1452
        //  1448: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1451: athrow         
        //  1452: iload           9
        //  1454: iload           18
        //  1456: bipush          24
        //  1458: iadd           
        //  1459: if_icmplt       1774
        //  1462: goto            1469
        //  1465: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1468: athrow         
        //  1469: iload           9
        //  1471: iload           18
        //  1473: bipush          24
        //  1475: iadd           
        //  1476: iload           22
        //  1478: iadd           
        //  1479: if_icmpge       1774
        //  1482: goto            1489
        //  1485: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1488: athrow         
        //  1489: iload           18
        //  1491: bipush          24
        //  1493: iadd           
        //  1494: iload           19
        //  1496: isub           
        //  1497: istore          23
        //  1499: aload           20
        //  1501: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1506: astore          24
        //  1508: aload           24
        //  1510: invokeinterface java/util/Iterator.hasNext:()Z
        //  1515: ifeq            1772
        //  1518: aload           24
        //  1520: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1525: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //  1528: astore          25
        //  1530: iload           9
        //  1532: iload           23
        //  1534: if_icmplt       1655
        //  1537: iload           9
        //  1539: iload           23
        //  1541: bipush          17
        //  1543: iadd           
        //  1544: if_icmpge       1655
        //  1547: goto            1554
        //  1550: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1553: athrow         
        //  1554: iload           9
        //  1556: iload           18
        //  1558: bipush          24
        //  1560: iadd           
        //  1561: if_icmplt       1655
        //  1564: goto            1571
        //  1567: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1570: athrow         
        //  1571: iload           7
        //  1573: ifne            1595
        //  1576: goto            1583
        //  1579: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1582: athrow         
        //  1583: aload           25
        //  1585: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.execute_2:()V
        //  1588: goto            1653
        //  1591: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1594: athrow         
        //  1595: iload           7
        //  1597: iconst_1       
        //  1598: if_icmpne       1653
        //  1601: aload_0        
        //  1602: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set:Ljava/util/Set;
        //  1605: aload           25
        //  1607: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  1612: ifeq            1641
        //  1615: goto            1622
        //  1618: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1621: athrow         
        //  1622: aload_0        
        //  1623: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set:Ljava/util/Set;
        //  1626: aload           25
        //  1628: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //  1633: pop            
        //  1634: goto            1653
        //  1637: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1640: athrow         
        //  1641: aload_0        
        //  1642: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set:Ljava/util/Set;
        //  1645: aload           25
        //  1647: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //  1652: pop            
        //  1653: iconst_1       
        //  1654: ireturn        
        //  1655: iinc            23, 17
        //  1658: aload_0        
        //  1659: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set:Ljava/util/Set;
        //  1662: aload           25
        //  1664: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  1669: ifeq            1769
        //  1672: aload           25
        //  1674: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //  1677: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1682: astore          26
        //  1684: aload           26
        //  1686: invokeinterface java/util/Iterator.hasNext:()Z
        //  1691: ifeq            1769
        //  1694: aload           26
        //  1696: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1701: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/Initializer;
        //  1704: astore          27
        //  1706: iload           9
        //  1708: iload           23
        //  1710: if_icmplt       1763
        //  1713: iload           9
        //  1715: iload           23
        //  1717: bipush          16
        //  1719: iadd           
        //  1720: if_icmpge       1763
        //  1723: goto            1730
        //  1726: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1729: athrow         
        //  1730: iload           9
        //  1732: iload           18
        //  1734: bipush          24
        //  1736: iadd           
        //  1737: if_icmplt       1763
        //  1740: goto            1747
        //  1743: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1746: athrow         
        //  1747: aload_0        
        //  1748: aload           27
        //  1750: iload           8
        //  1752: iload           17
        //  1754: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.processAll_5:(Lcom/target/mod/compat/sub1/sub2/sub2/sub1/Initializer;II)V
        //  1757: iconst_1       
        //  1758: ireturn        
        //  1759: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //  1762: athrow         
        //  1763: iinc            23, 16
        //  1766: goto            1684
        //  1769: goto            1508
        //  1772: iconst_1       
        //  1773: ireturn        
        //  1774: iinc            15, -1
        //  1777: goto            1054
        //  1780: aload_0        
        //  1781: aload_1        
        //  1782: iload_2        
        //  1783: invokespecial   net/minecraft/class_437.method_25402:(Lnet/minecraft/class_11909;Z)Z
        //  1786: ireturn        
        //    StackMapTable: 00 87 FF 00 1D 00 06 07 00 02 07 03 7D 01 03 03 01 00 01 07 01 1C 03 FF 00 1D 00 08 07 00 02 07 03 7D 01 03 03 01 01 01 00 01 07 01 1C 03 49 07 01 1C 03 57 07 01 1C 03 FF 00 2B 00 0C 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 00 01 07 01 1C 03 49 07 01 1C 03 4C 07 01 1C 03 56 07 01 1C 03 4F 07 01 1C 03 51 07 01 1C 03 01 53 07 01 1C 03 47 07 01 1C 03 58 07 01 1C 03 FF 00 28 00 11 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 01 01 07 01 E9 00 00 FC 00 38 07 02 52 FA 00 02 FF 00 12 00 11 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 01 01 01 00 00 53 07 01 1C 03 4C 07 01 1C 03 4F 07 01 1C 03 FD 00 16 01 07 01 E9 FF 00 29 00 14 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 01 01 01 01 07 01 E9 07 02 52 00 01 07 01 1C 03 4C 07 01 1C 03 47 07 01 1C 03 47 07 01 1C 03 56 07 01 1C 03 4E 07 01 1C 03 0B 01 FC 00 1C 07 01 E9 FF 00 29 00 16 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 01 01 01 01 07 01 E9 07 02 52 07 01 E9 07 02 90 00 01 07 01 1C 03 4C 07 01 1C 03 4B 07 01 1C 03 F9 00 05 FA 00 02 FF 00 01 00 0C 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 00 00 FD 00 11 01 01 FF 00 31 00 10 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 01 01 00 01 07 01 1C 03 49 07 01 1C 03 4C 07 01 1C 03 47 07 01 1C 03 58 07 01 1C 03 46 07 01 1C 03 5D 07 01 1C 03 6A 07 01 1C 03 01 F9 00 08 0C FF 00 63 00 15 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 07 00 F5 01 01 01 07 01 08 01 07 01 E9 00 00 FC 00 38 07 02 52 FA 00 02 FF 00 12 00 15 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 07 00 F5 01 01 01 07 01 08 01 01 00 00 54 07 01 1C 03 49 07 01 1C 03 4C 07 01 1C 03 48 07 01 1C 03 50 07 01 1C 03 4E 07 01 1C 03 0B 01 31 50 07 01 1C 03 54 07 01 1C 03 4C 07 01 1C 03 4F 07 01 1C 03 FD 00 12 01 07 01 E9 FF 00 29 00 18 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 07 00 F5 01 01 01 07 01 08 01 01 01 07 01 E9 07 02 52 00 01 07 01 1C 03 4C 07 01 1C 03 47 07 01 1C 03 47 07 01 1C 03 56 07 01 1C 03 4E 07 01 1C 03 0B 01 FC 00 1C 07 01 E9 FF 00 29 00 1A 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 07 00 F5 01 01 01 07 01 08 01 01 01 07 01 E9 07 02 52 07 01 E9 07 02 90 00 01 07 01 1C 03 4C 07 01 1C 03 4B 07 01 1C 03 F9 00 05 FA 00 02 F9 00 01 FF 00 05 00 0E 07 00 02 07 03 7D 01 03 03 01 01 01 01 01 01 01 01 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  17     29     29     33     Ljava/lang/MatchException;
        //  48     60     63     67     Ljava/lang/MatchException;
        //  55     74     77     81     Ljava/lang/MatchException;
        //  67     105    105    109    Ljava/lang/MatchException;
        //  133    150    153    157    Ljava/lang/MatchException;
        //  140    164    167    171    Ljava/lang/MatchException;
        //  157    181    184    188    Ljava/lang/MatchException;
        //  171    208    211    215    Ljava/lang/MatchException;
        //  188    228    231    235    Ljava/lang/MatchException;
        //  215    250    253    257    Ljava/lang/MatchException;
        //  259    276    279    283    Ljava/lang/MatchException;
        //  266    288    291    295    Ljava/lang/MatchException;
        //  295    317    320    324    Ljava/lang/MatchException;
        //  444    461    464    468    Ljava/lang/MatchException;
        //  451    478    481    485    Ljava/lang/MatchException;
        //  468    498    501    505    Ljava/lang/MatchException;
        //  550    567    570    574    Ljava/lang/MatchException;
        //  557    584    587    591    Ljava/lang/MatchException;
        //  574    596    599    603    Ljava/lang/MatchException;
        //  591    611    611    615    Ljava/lang/MatchException;
        //  615    635    638    642    Ljava/lang/MatchException;
        //  621    657    657    661    Ljava/lang/MatchException;
        //  726    743    746    750    Ljava/lang/MatchException;
        //  733    760    763    767    Ljava/lang/MatchException;
        //  750    779    779    783    Ljava/lang/MatchException;
        //  842    859    862    866    Ljava/lang/MatchException;
        //  849    873    876    880    Ljava/lang/MatchException;
        //  866    890    893    897    Ljava/lang/MatchException;
        //  880    902    905    909    Ljava/lang/MatchException;
        //  897    931    934    938    Ljava/lang/MatchException;
        //  909    945    945    949    Ljava/lang/MatchException;
        //  949    979    979    983    Ljava/lang/MatchException;
        //  983    1023   1026   1030   Ljava/lang/MatchException;
        //  1233   1251   1254   1258   Ljava/lang/MatchException;
        //  1240   1265   1268   1272   Ljava/lang/MatchException;
        //  1258   1282   1285   1289   Ljava/lang/MatchException;
        //  1272   1295   1298   1302   Ljava/lang/MatchException;
        //  1289   1316   1319   1323   Ljava/lang/MatchException;
        //  1302   1338   1338   1342   Ljava/lang/MatchException;
        //  1406   1423   1423   1427   Ljava/lang/MatchException;
        //  1427   1445   1448   1452   Ljava/lang/MatchException;
        //  1434   1462   1465   1469   Ljava/lang/MatchException;
        //  1452   1482   1485   1489   Ljava/lang/MatchException;
        //  1530   1547   1550   1554   Ljava/lang/MatchException;
        //  1537   1564   1567   1571   Ljava/lang/MatchException;
        //  1554   1576   1579   1583   Ljava/lang/MatchException;
        //  1571   1591   1591   1595   Ljava/lang/MatchException;
        //  1595   1615   1618   1622   Ljava/lang/MatchException;
        //  1601   1637   1637   1641   Ljava/lang/MatchException;
        //  1706   1723   1726   1730   Ljava/lang/MatchException;
        //  1713   1740   1743   1747   Ljava/lang/MatchException;
        //  1730   1759   1759   1763   Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0067:
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
    
    private void processAll_5(final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer initializer, final int n, final int n2) {
        if (initializer instanceof final SyncASub_5 syncASub_3) {
            syncASub_3.execute();
        }
        else if (initializer instanceof final SyncASub_2 syncASub_2) {
            syncASub_2.execute();
        }
        else if (initializer instanceof final SyncASub_3 initD) {
            try {
                if (this.initD == initD) {
                    initD.setBool(false);
                    this.initD = null;
                    return;
                }
            }
            catch (final MatchException ex) {
                throw computeException((Exception)ex);
            }
            try {
                if (this.initD != null) {
                    this.initD.setBool(false);
                }
            }
            catch (final MatchException ex2) {
                throw computeException((Exception)ex2);
            }
            (this.initD = initD).setBool(true);
        }
        else if (initializer instanceof final SyncASub_4 itemG) {
            this.itemG = itemG;
            this.strValue_1 = itemG.getString();
        }
        else if (initializer instanceof final SyncASub_1 syncASub_1) {
            final int method_1727 = this.field_22793.method_1727(String.format(createString_1(27781, 26424), syncASub_1.getDouble()));
            try {
                if (n >= n2 + class_437Sub.intValue_7 - method_1727 - 12) {
                    this.buildC_1 = syncASub_1;
                    this.strValue = "";
                    return;
                }
            }
            catch (final MatchException ex3) {
                throw computeException((Exception)ex3);
            }
            (this.buildC = syncASub_1).setObject(this.buildC.getDouble_1() + Math.max(0.0, Math.min(1.0, (n - n2 - 12) / (double)(class_437Sub.intValue_7 - 22))) * (this.buildC.getDouble_2() - this.buildC.getDouble_1()));
            for (final Initializer cacheE_1 : this.list) {
                for (final Initializer_3 initializer_3 : com.target.mod.compat.sub1.sub2.sub1.Initializer.utilC.computeList(cacheE_1)) {
                    try {
                        if (initializer_3.getList().contains(initializer)) {
                            this.cacheE_1 = cacheE_1;
                            return;
                        }
                        continue;
                    }
                    catch (final MatchException ex4) {
                        throw computeException((Exception)ex4);
                    }
                }
            }
        }
    }
    
    public boolean method_25403(final class_11909 class_11909, final double n, final double n2) {
        final double comp_4798 = class_11909.comp_4798();
        final double comp_4799 = class_11909.comp_4799();
        final int method_74245 = class_11909.method_74245();
        Label_0045: {
            try {
                if (this.boolFlag) {
                    return true;
                }
                final class_437Sub class_437Sub = this;
                final boolean b = class_437Sub.boolFlag_2;
                if (b) {
                    return true;
                }
                break Label_0045;
            }
            catch (final MatchException ex) {
                throw computeException((Exception)ex);
            }
            try {
                final class_437Sub class_437Sub = this;
                final boolean b = class_437Sub.boolFlag_2;
                if (b) {
                    return true;
                }
            }
            catch (final MatchException ex2) {
                throw computeException((Exception)ex2);
            }
        }
        final int method_int_4 = this.method_int_4(comp_4798);
        final int method_int_5 = this.method_int_5(comp_4799);
        Label_0153: {
            Label_0134: {
                Label_0080: {
                    try {
                        if (this.cacheE == null) {
                            break Label_0134;
                        }
                        final int n3 = method_74245;
                        if (n3 == 0) {
                            break Label_0080;
                        }
                        break Label_0134;
                    }
                    catch (final MatchException ex3) {
                        throw computeException((Exception)ex3);
                    }
                    try {
                        final int n3 = method_74245;
                        if (n3 == 0) {
                            this.map.put(this.cacheE, method_int_4 - this.intValue);
                            this.map_1.put(this.cacheE, method_int_5 - this.intValue_1);
                            return true;
                        }
                    }
                    catch (final MatchException ex4) {
                        throw computeException((Exception)ex4);
                    }
                }
                try {
                    if (this.buildC == null) {
                        return super.method_25403(class_11909, n, n2);
                    }
                    final int n4 = method_74245;
                    if (n4 == 0) {
                        break Label_0153;
                    }
                    return super.method_25403(class_11909, n, n2);
                }
                catch (final MatchException ex5) {
                    throw computeException((Exception)ex5);
                }
            }
            try {
                final int n4 = method_74245;
                if (n4 != 0) {
                    return super.method_25403(class_11909, n, n2);
                }
                if (this.cacheE_1 == null) {
                    return super.method_25403(class_11909, n, n2);
                }
            }
            catch (final MatchException ex6) {
                throw computeException((Exception)ex6);
            }
        }
        this.buildC.setObject(this.buildC.getDouble_1() + Math.max(0.0, Math.min(1.0, (method_int_4 - this.map.get(this.cacheE_1) - 12) / (double)(class_437Sub.intValue_7 - 22))) * (this.buildC.getDouble_2() - this.buildC.getDouble_1()));
        return true;
    }
    
    public boolean method_25406(final class_11909 class_11909) {
        final int method_74245 = class_11909.method_74245();
        try {
            if (method_74245 == 0) {
                this.cacheE = null;
                this.buildC = null;
                this.cacheE_1 = null;
            }
        }
        catch (final MatchException ex) {
            throw computeException((Exception)ex);
        }
        return super.method_25406(class_11909);
    }
    
    public boolean method_25401(final double p0, final double p1, final double p2, final double p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dload_1        
        //     2: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_4:(D)I
        //     5: istore          9
        //     7: aload_0        
        //     8: dload_3        
        //     9: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_int_5:(D)I
        //    12: istore          10
        //    14: aload_0        
        //    15: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //    18: invokevirtual   java/lang/String.isEmpty:()Z
        //    21: ifne            259
        //    24: aload_0        
        //    25: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //    28: invokeinterface java/util/List.isEmpty:()Z
        //    33: ifne            259
        //    36: goto            43
        //    39: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    42: athrow         
        //    43: aload_0        
        //    44: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //    47: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //    50: isub           
        //    51: bipush          40
        //    53: isub           
        //    54: iconst_2       
        //    55: idiv           
        //    56: istore          11
        //    58: bipush          42
        //    60: istore          12
        //    62: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //    65: bipush          40
        //    67: iadd           
        //    68: istore          13
        //    70: iconst_0       
        //    71: istore          14
        //    73: aload_0        
        //    74: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //    77: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    82: astore          15
        //    84: aload           15
        //    86: invokeinterface java/util/Iterator.hasNext:()Z
        //    91: ifeq            144
        //    94: aload           15
        //    96: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   101: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   104: astore          16
        //   106: iinc            14, 17
        //   109: aload_0        
        //   110: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set_2:Ljava/util/Set;
        //   113: aload           16
        //   115: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   120: ifeq            141
        //   123: iload           14
        //   125: aload           16
        //   127: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //   130: invokeinterface java/util/List.size:()I
        //   135: bipush          16
        //   137: imul           
        //   138: iadd           
        //   139: istore          14
        //   141: goto            84
        //   144: iload           14
        //   146: sipush          360
        //   149: invokestatic    java/lang/Math.min:(II)I
        //   152: istore          15
        //   154: iload           9
        //   156: iload           11
        //   158: if_icmplt       259
        //   161: iload           9
        //   163: iload           11
        //   165: iload           13
        //   167: iadd           
        //   168: if_icmpge       259
        //   171: goto            178
        //   174: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   177: athrow         
        //   178: iload           10
        //   180: iload           12
        //   182: if_icmplt       259
        //   185: goto            192
        //   188: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   191: athrow         
        //   192: iload           10
        //   194: iload           12
        //   196: bipush          24
        //   198: iadd           
        //   199: iload           15
        //   201: iadd           
        //   202: if_icmpge       259
        //   205: goto            212
        //   208: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   211: athrow         
        //   212: iconst_0       
        //   213: iload           14
        //   215: sipush          360
        //   218: isub           
        //   219: invokestatic    java/lang/Math.max:(II)I
        //   222: istore          16
        //   224: aload_0        
        //   225: dup            
        //   226: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_3:I
        //   229: dload           7
        //   231: ldc2_w          14.0
        //   234: dmul           
        //   235: d2i            
        //   236: isub           
        //   237: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_3:I
        //   240: aload_0        
        //   241: iconst_0       
        //   242: aload_0        
        //   243: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_3:I
        //   246: iload           16
        //   248: invokestatic    java/lang/Math.min:(II)I
        //   251: invokestatic    java/lang/Math.max:(II)I
        //   254: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_3:I
        //   257: iconst_1       
        //   258: ireturn        
        //   259: aload_0        
        //   260: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_2:Z
        //   263: ifeq            434
        //   266: sipush          320
        //   269: istore          11
        //   271: sipush          200
        //   274: istore          12
        //   276: aload_0        
        //   277: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_4:I
        //   280: iload           11
        //   282: isub           
        //   283: iconst_2       
        //   284: idiv           
        //   285: istore          13
        //   287: aload_0        
        //   288: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_5:I
        //   291: iload           12
        //   293: isub           
        //   294: iconst_2       
        //   295: idiv           
        //   296: istore          14
        //   298: iload           13
        //   300: bipush          12
        //   302: iadd           
        //   303: istore          15
        //   305: iload           14
        //   307: bipush          32
        //   309: iadd           
        //   310: istore          16
        //   312: sipush          140
        //   315: istore          17
        //   317: bipush          120
        //   319: istore          18
        //   321: iload           9
        //   323: iload           15
        //   325: if_icmplt       432
        //   328: iload           9
        //   330: iload           15
        //   332: iload           17
        //   334: iadd           
        //   335: if_icmpge       432
        //   338: goto            345
        //   341: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   344: athrow         
        //   345: iload           10
        //   347: iload           16
        //   349: if_icmplt       432
        //   352: goto            359
        //   355: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   358: athrow         
        //   359: iload           10
        //   361: iload           16
        //   363: iload           18
        //   365: iadd           
        //   366: if_icmpge       432
        //   369: goto            376
        //   372: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   375: athrow         
        //   376: iconst_0       
        //   377: aload_0        
        //   378: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_1:Ljava/util/List;
        //   381: invokeinterface java/util/List.size:()I
        //   386: bipush          14
        //   388: imul           
        //   389: iload           18
        //   391: isub           
        //   392: invokestatic    java/lang/Math.max:(II)I
        //   395: istore          19
        //   397: aload_0        
        //   398: dup            
        //   399: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_2:I
        //   402: dload           7
        //   404: ldc2_w          14.0
        //   407: dmul           
        //   408: d2i            
        //   409: isub           
        //   410: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_2:I
        //   413: aload_0        
        //   414: iconst_0       
        //   415: aload_0        
        //   416: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_2:I
        //   419: iload           19
        //   421: invokestatic    java/lang/Math.min:(II)I
        //   424: invokestatic    java/lang/Math.max:(II)I
        //   427: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_2:I
        //   430: iconst_1       
        //   431: ireturn        
        //   432: iconst_1       
        //   433: ireturn        
        //   434: aload_0        
        //   435: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag:Z
        //   438: ifeq            447
        //   441: iconst_1       
        //   442: ireturn        
        //   443: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   446: athrow         
        //   447: aload_0        
        //   448: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list:Ljava/util/List;
        //   451: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   456: astore          11
        //   458: aload           11
        //   460: invokeinterface java/util/Iterator.hasNext:()Z
        //   465: ifeq            743
        //   468: aload           11
        //   470: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   475: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer;
        //   478: astore          12
        //   480: aload_0        
        //   481: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map:Ljava/util/Map;
        //   484: aload           12
        //   486: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   491: checkcast       Ljava/lang/Integer;
        //   494: invokevirtual   java/lang/Integer.intValue:()I
        //   497: istore          13
        //   499: aload_0        
        //   500: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map_1:Ljava/util/Map;
        //   503: aload           12
        //   505: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   510: checkcast       Ljava/lang/Integer;
        //   513: invokevirtual   java/lang/Integer.intValue:()I
        //   516: istore          14
        //   518: aload_0        
        //   519: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map_2:Ljava/util/Map;
        //   522: aload           12
        //   524: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   529: checkcast       Ljava/lang/Integer;
        //   532: invokevirtual   java/lang/Integer.intValue:()I
        //   535: istore          15
        //   537: getstatic       com/target/mod/compat/sub1/sub2/sub1/Initializer.utilC:Lcom/target/mod/compat/sub1/sub2/sub1/Initializer;
        //   540: aload           12
        //   542: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/Initializer.computeList:(Lcom/target/mod/compat/sub1/sub2/sub2/Initializer;)Ljava/util/List;
        //   545: astore          16
        //   547: iconst_0       
        //   548: istore          17
        //   550: aload           16
        //   552: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   557: astore          18
        //   559: aload           18
        //   561: invokeinterface java/util/Iterator.hasNext:()Z
        //   566: ifeq            619
        //   569: aload           18
        //   571: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   576: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   579: astore          19
        //   581: iinc            17, 17
        //   584: aload_0        
        //   585: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.set:Ljava/util/Set;
        //   588: aload           19
        //   590: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   595: ifeq            616
        //   598: iload           17
        //   600: aload           19
        //   602: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //   605: invokeinterface java/util/List.size:()I
        //   610: bipush          16
        //   612: imul           
        //   613: iadd           
        //   614: istore          17
        //   616: goto            559
        //   619: iload           9
        //   621: iload           13
        //   623: if_icmplt       740
        //   626: iload           9
        //   628: iload           13
        //   630: getstatic       com/target/mod/compat/sub1/sub2/sub5/class_437Sub.intValue_7:I
        //   633: iadd           
        //   634: if_icmpge       740
        //   637: goto            644
        //   640: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   643: athrow         
        //   644: iload           10
        //   646: iload           14
        //   648: if_icmplt       740
        //   651: goto            658
        //   654: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   657: athrow         
        //   658: iload           10
        //   660: iload           14
        //   662: bipush          24
        //   664: iadd           
        //   665: iload           17
        //   667: sipush          360
        //   670: invokestatic    java/lang/Math.min:(II)I
        //   673: iadd           
        //   674: if_icmpge       740
        //   677: goto            684
        //   680: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   683: athrow         
        //   684: iconst_0       
        //   685: iload           17
        //   687: sipush          360
        //   690: isub           
        //   691: invokestatic    java/lang/Math.max:(II)I
        //   694: istore          18
        //   696: iload           15
        //   698: dload           7
        //   700: ldc2_w          14.0
        //   703: dmul           
        //   704: d2i            
        //   705: isub           
        //   706: istore          15
        //   708: iconst_0       
        //   709: iload           15
        //   711: iload           18
        //   713: invokestatic    java/lang/Math.min:(II)I
        //   716: invokestatic    java/lang/Math.max:(II)I
        //   719: istore          15
        //   721: aload_0        
        //   722: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.map_2:Ljava/util/Map;
        //   725: aload           12
        //   727: iload           15
        //   729: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   732: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   737: pop            
        //   738: iconst_1       
        //   739: ireturn        
        //   740: goto            458
        //   743: aload_0        
        //   744: dload_1        
        //   745: dload_3        
        //   746: dload           5
        //   748: dload           7
        //   750: invokespecial   net/minecraft/class_437.method_25401:(DDDD)Z
        //   753: ireturn        
        //    StackMapTable: 00 22 FF 00 27 00 07 07 00 02 03 03 03 03 01 01 00 01 07 01 1C 03 FF 00 28 00 0C 07 00 02 03 03 03 03 01 01 01 01 01 01 07 01 E9 00 00 FC 00 38 07 02 52 FA 00 02 FF 00 1D 00 0C 07 00 02 03 03 03 03 01 01 01 01 01 01 01 00 01 07 01 1C 03 49 07 01 1C 03 4F 07 01 1C 03 FF 00 2E 00 07 07 00 02 03 03 03 03 01 01 00 00 FF 00 51 00 0F 07 00 02 03 03 03 03 01 01 01 01 01 01 01 01 01 01 00 01 07 01 1C 03 49 07 01 1C 03 4C 07 01 1C 03 37 FF 00 01 00 07 07 00 02 03 03 03 03 01 01 00 00 48 07 01 1C 03 FC 00 0A 07 01 E9 FF 00 64 00 0F 07 00 02 03 03 03 03 01 01 07 01 E9 07 00 F5 01 01 01 07 01 08 01 07 01 E9 00 00 FC 00 38 07 02 52 FA 00 02 54 07 01 1C 03 49 07 01 1C 03 55 07 01 1C 03 37 FF 00 02 00 08 07 00 02 03 03 03 03 01 01 07 01 E9 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  14     36     39     43     Ljava/lang/MatchException;
        //  154    171    174    178    Ljava/lang/MatchException;
        //  161    185    188    192    Ljava/lang/MatchException;
        //  178    205    208    212    Ljava/lang/MatchException;
        //  321    338    341    345    Ljava/lang/MatchException;
        //  328    352    355    359    Ljava/lang/MatchException;
        //  345    369    372    376    Ljava/lang/MatchException;
        //  434    443    443    447    Ljava/lang/MatchException;
        //  619    637    640    644    Ljava/lang/MatchException;
        //  626    651    654    658    Ljava/lang/MatchException;
        //  644    677    680    684    Ljava/lang/MatchException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0178:
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
    
    public boolean method_25404(final class_11908 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   net/minecraft/class_11908.comp_4795:()I
        //     4: istore_2       
        //     5: aload_0        
        //     6: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.itemG:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //     9: ifnull          172
        //    12: iload_2        
        //    13: sipush          259
        //    16: if_icmpne       71
        //    19: goto            26
        //    22: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    25: athrow         
        //    26: aload_0        
        //    27: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_1:Ljava/lang/String;
        //    30: invokevirtual   java/lang/String.isEmpty:()Z
        //    33: ifne            71
        //    36: goto            43
        //    39: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    42: athrow         
        //    43: aload_0        
        //    44: aload_0        
        //    45: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_1:Ljava/lang/String;
        //    48: iconst_0       
        //    49: aload_0        
        //    50: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_1:Ljava/lang/String;
        //    53: invokevirtual   java/lang/String.length:()I
        //    56: iconst_1       
        //    57: isub           
        //    58: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    61: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_1:Ljava/lang/String;
        //    64: goto            170
        //    67: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    70: athrow         
        //    71: iload_2        
        //    72: sipush          257
        //    75: if_icmpne       101
        //    78: aload_0        
        //    79: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.itemG:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //    82: aload_0        
        //    83: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_1:Ljava/lang/String;
        //    86: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4.setObject:(Ljava/lang/Object;)V
        //    89: aload_0        
        //    90: aconst_null    
        //    91: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.itemG:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //    94: goto            170
        //    97: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   100: athrow         
        //   101: iload_2        
        //   102: sipush          256
        //   105: if_icmpne       120
        //   108: aload_0        
        //   109: aconst_null    
        //   110: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.itemG:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //   113: goto            170
        //   116: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   119: athrow         
        //   120: aload_0        
        //   121: aload_1        
        //   122: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_char:(Lnet/minecraft/class_11908;)C
        //   125: istore_3       
        //   126: iload_3        
        //   127: ifeq            170
        //   130: aload_0        
        //   131: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_1:Ljava/lang/String;
        //   134: invokevirtual   java/lang/String.length:()I
        //   137: bipush          32
        //   139: if_icmpge       170
        //   142: goto            149
        //   145: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   148: athrow         
        //   149: aload_0        
        //   150: dup            
        //   151: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_1:Ljava/lang/String;
        //   154: iload_3        
        //   155: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;C)Ljava/lang/String;
        //   160: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_1:Ljava/lang/String;
        //   163: goto            170
        //   166: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   169: athrow         
        //   170: iconst_1       
        //   171: ireturn        
        //   172: aload_0        
        //   173: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.buildC_1:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   176: ifnull          377
        //   179: iload_2        
        //   180: sipush          259
        //   183: if_icmpne       238
        //   186: goto            193
        //   189: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   192: athrow         
        //   193: aload_0        
        //   194: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue:Ljava/lang/String;
        //   197: invokevirtual   java/lang/String.isEmpty:()Z
        //   200: ifne            238
        //   203: goto            210
        //   206: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   209: athrow         
        //   210: aload_0        
        //   211: aload_0        
        //   212: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue:Ljava/lang/String;
        //   215: iconst_0       
        //   216: aload_0        
        //   217: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue:Ljava/lang/String;
        //   220: invokevirtual   java/lang/String.length:()I
        //   223: iconst_1       
        //   224: isub           
        //   225: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   228: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue:Ljava/lang/String;
        //   231: goto            375
        //   234: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   237: athrow         
        //   238: iload_2        
        //   239: sipush          257
        //   242: if_icmpne       296
        //   245: aload_0        
        //   246: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue:Ljava/lang/String;
        //   249: invokestatic    java/lang/Double.parseDouble:(Ljava/lang/String;)D
        //   252: dstore_3       
        //   253: aload_0        
        //   254: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.buildC_1:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   257: aload_0        
        //   258: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.buildC_1:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   261: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble_1:()D
        //   264: aload_0        
        //   265: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.buildC_1:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   268: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble_2:()D
        //   271: dload_3        
        //   272: invokestatic    java/lang/Math.min:(DD)D
        //   275: invokestatic    java/lang/Math.max:(DD)D
        //   278: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   281: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.setObject:(Ljava/lang/Object;)V
        //   284: goto            288
        //   287: astore_3       
        //   288: aload_0        
        //   289: aconst_null    
        //   290: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.buildC_1:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   293: goto            375
        //   296: iload_2        
        //   297: sipush          256
        //   300: if_icmpne       315
        //   303: aload_0        
        //   304: aconst_null    
        //   305: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.buildC_1:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   308: goto            375
        //   311: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   314: athrow         
        //   315: aload_0        
        //   316: aload_1        
        //   317: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_char:(Lnet/minecraft/class_11908;)C
        //   320: istore_3       
        //   321: iload_3        
        //   322: invokestatic    java/lang/Character.isDigit:(C)Z
        //   325: ifne            354
        //   328: iload_3        
        //   329: bipush          46
        //   331: if_icmpeq       354
        //   334: goto            341
        //   337: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   340: athrow         
        //   341: iload_3        
        //   342: bipush          45
        //   344: if_icmpne       375
        //   347: goto            354
        //   350: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   353: athrow         
        //   354: aload_0        
        //   355: dup            
        //   356: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue:Ljava/lang/String;
        //   359: iload_3        
        //   360: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;C)Ljava/lang/String;
        //   365: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue:Ljava/lang/String;
        //   368: goto            375
        //   371: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   374: athrow         
        //   375: iconst_1       
        //   376: ireturn        
        //   377: aload_0        
        //   378: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_4:Z
        //   381: ifeq            578
        //   384: iload_2        
        //   385: sipush          259
        //   388: if_icmpne       447
        //   391: goto            398
        //   394: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   397: athrow         
        //   398: aload_0        
        //   399: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   402: invokevirtual   java/lang/String.isEmpty:()Z
        //   405: ifne            447
        //   408: goto            415
        //   411: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   414: athrow         
        //   415: aload_0        
        //   416: aload_0        
        //   417: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   420: iconst_0       
        //   421: aload_0        
        //   422: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   425: invokevirtual   java/lang/String.length:()I
        //   428: iconst_1       
        //   429: isub           
        //   430: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   433: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   436: aload_0        
        //   437: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.execute:()V
        //   440: goto            576
        //   443: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   446: athrow         
        //   447: iload_2        
        //   448: sipush          256
        //   451: if_icmpeq       468
        //   454: iload_2        
        //   455: sipush          257
        //   458: if_icmpne       506
        //   461: goto            468
        //   464: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   467: athrow         
        //   468: aload_0        
        //   469: iconst_0       
        //   470: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_4:Z
        //   473: aload_0        
        //   474: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   477: invokevirtual   java/lang/String.isEmpty:()Z
        //   480: ifeq            576
        //   483: goto            490
        //   486: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   489: athrow         
        //   490: aload_0        
        //   491: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.list_2:Ljava/util/List;
        //   494: invokeinterface java/util/List.clear:()V
        //   499: goto            576
        //   502: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   505: athrow         
        //   506: aload_0        
        //   507: aload_1        
        //   508: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_char:(Lnet/minecraft/class_11908;)C
        //   511: istore_3       
        //   512: aload_0        
        //   513: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   516: invokevirtual   java/lang/String.length:()I
        //   519: bipush          32
        //   521: if_icmpge       576
        //   524: iload_3        
        //   525: invokestatic    java/lang/Character.isLetterOrDigit:(C)Z
        //   528: ifne            551
        //   531: goto            538
        //   534: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   537: athrow         
        //   538: iload_3        
        //   539: bipush          32
        //   541: if_icmpne       576
        //   544: goto            551
        //   547: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   550: athrow         
        //   551: aload_0        
        //   552: dup            
        //   553: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   556: iload_3        
        //   557: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;C)Ljava/lang/String;
        //   562: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_5:Ljava/lang/String;
        //   565: aload_0        
        //   566: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.execute:()V
        //   569: goto            576
        //   572: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   575: athrow         
        //   576: iconst_1       
        //   577: ireturn        
        //   578: aload_0        
        //   579: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //   582: ifeq            771
        //   585: iload_2        
        //   586: sipush          259
        //   589: if_icmpne       644
        //   592: goto            599
        //   595: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   598: athrow         
        //   599: aload_0        
        //   600: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //   603: invokevirtual   java/lang/String.isEmpty:()Z
        //   606: ifne            644
        //   609: goto            616
        //   612: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   615: athrow         
        //   616: aload_0        
        //   617: aload_0        
        //   618: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //   621: iconst_0       
        //   622: aload_0        
        //   623: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //   626: invokevirtual   java/lang/String.length:()I
        //   629: iconst_1       
        //   630: isub           
        //   631: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   634: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //   637: goto            769
        //   640: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   643: athrow         
        //   644: iload_2        
        //   645: sipush          257
        //   648: if_icmpeq       665
        //   651: iload_2        
        //   652: sipush          256
        //   655: if_icmpne       677
        //   658: goto            665
        //   661: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   664: athrow         
        //   665: aload_0        
        //   666: iconst_0       
        //   667: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_3:Z
        //   670: goto            769
        //   673: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   676: athrow         
        //   677: aload_0        
        //   678: aload_1        
        //   679: invokevirtual   com/target/mod/compat/sub1/sub2/sub5/class_437Sub.method_char:(Lnet/minecraft/class_11908;)C
        //   682: istore_3       
        //   683: aload_0        
        //   684: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //   687: invokevirtual   java/lang/String.length:()I
        //   690: bipush          24
        //   692: if_icmpge       769
        //   695: iload_3        
        //   696: invokestatic    java/lang/Character.isLetterOrDigit:(C)Z
        //   699: ifne            748
        //   702: goto            709
        //   705: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   708: athrow         
        //   709: iload_3        
        //   710: bipush          32
        //   712: if_icmpeq       748
        //   715: goto            722
        //   718: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   721: athrow         
        //   722: iload_3        
        //   723: bipush          95
        //   725: if_icmpeq       748
        //   728: goto            735
        //   731: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   734: athrow         
        //   735: iload_3        
        //   736: bipush          45
        //   738: if_icmpne       769
        //   741: goto            748
        //   744: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   747: athrow         
        //   748: aload_0        
        //   749: dup            
        //   750: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //   753: iload_3        
        //   754: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;C)Ljava/lang/String;
        //   759: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.strValue_3:Ljava/lang/String;
        //   762: goto            769
        //   765: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   768: athrow         
        //   769: iconst_1       
        //   770: ireturn        
        //   771: aload_0        
        //   772: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_1:Z
        //   775: ifeq            857
        //   778: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   781: ifnull          813
        //   784: goto            791
        //   787: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   790: athrow         
        //   791: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   794: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //   797: ldc_w           Lcom/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl;.class
        //   800: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.computeLoadf:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   803: checkcast       Lcom/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl;
        //   806: goto            814
        //   809: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   812: athrow         
        //   813: aconst_null    
        //   814: astore_3       
        //   815: aload_3        
        //   816: ifnull          850
        //   819: iload_2        
        //   820: sipush          256
        //   823: if_icmpne       845
        //   826: goto            833
        //   829: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   832: athrow         
        //   833: aload_3        
        //   834: iconst_m1      
        //   835: invokevirtual   com/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl.setInt:(I)V
        //   838: goto            850
        //   841: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   844: athrow         
        //   845: aload_3        
        //   846: iload_2        
        //   847: invokevirtual   com/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl.setInt:(I)V
        //   850: aload_0        
        //   851: iconst_0       
        //   852: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.boolFlag_1:Z
        //   855: iconst_1       
        //   856: ireturn        
        //   857: aload_0        
        //   858: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   861: ifnull          916
        //   864: iload_2        
        //   865: sipush          256
        //   868: if_icmpne       893
        //   871: goto            878
        //   874: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   877: athrow         
        //   878: aload_0        
        //   879: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   882: iconst_m1      
        //   883: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.setInt:(I)V
        //   886: goto            901
        //   889: invokestatic    com/target/mod/compat/sub1/sub2/sub5/class_437Sub.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   892: athrow         
        //   893: aload_0        
        //   894: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   897: iload_2        
        //   898: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.setInt:(I)V
        //   901: aload_0        
        //   902: getfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   905: iconst_0       
        //   906: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.setBool:(Z)V
        //   909: aload_0        
        //   910: aconst_null    
        //   911: putfield        com/target/mod/compat/sub1/sub2/sub5/class_437Sub.initD:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   914: iconst_1       
        //   915: ireturn        
        //   916: aload_0        
        //   917: aload_1        
        //   918: invokespecial   net/minecraft/class_437.method_25404:(Lnet/minecraft/class_11908;)Z
        //   921: ireturn        
        //    StackMapTable: 00 5A FF 00 16 00 03 07 00 02 07 03 C0 01 00 01 07 01 88 03 4C 07 01 88 03 57 07 01 88 03 59 07 01 88 03 4E 07 01 88 03 FF 00 18 00 04 07 00 02 07 03 C0 01 01 00 01 07 01 88 03 50 07 01 88 FA 00 03 01 50 07 01 88 03 4C 07 01 88 03 57 07 01 88 03 70 07 01 88 00 07 4E 07 01 88 03 FF 00 15 00 04 07 00 02 07 03 C0 01 01 00 01 07 01 88 03 48 07 01 88 03 50 07 01 88 FA 00 03 01 50 07 01 88 03 4C 07 01 88 03 5B 07 01 88 03 50 07 01 88 03 51 07 01 88 03 4B 07 01 88 03 FF 00 1B 00 04 07 00 02 07 03 C0 01 01 00 01 07 01 88 03 48 07 01 88 03 54 07 01 88 FA 00 03 01 50 07 01 88 03 4C 07 01 88 03 57 07 01 88 03 50 07 01 88 03 47 07 01 88 03 FF 00 1B 00 04 07 00 02 07 03 C0 01 01 00 01 07 01 88 03 48 07 01 88 03 48 07 01 88 03 48 07 01 88 03 50 07 01 88 FA 00 03 01 4F 07 01 88 03 51 07 01 88 03 40 07 03 3C FF 00 0E 00 04 07 00 02 07 03 C0 01 07 03 3C 00 01 07 01 88 03 47 07 01 88 03 04 FA 00 06 50 07 01 88 03 4A 07 01 88 03 07 0E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  193    234    234    238    Ljava/lang/Exception;
        //  179    203    206    210    Ljava/lang/Exception;
        //  172    186    189    193    Ljava/lang/Exception;
        //  130    163    166    170    Ljava/lang/Exception;
        //  126    142    145    149    Ljava/lang/Exception;
        //  101    116    116    120    Ljava/lang/Exception;
        //  71     97     97     101    Ljava/lang/Exception;
        //  26     67     67     71     Ljava/lang/Exception;
        //  12     36     39     43     Ljava/lang/Exception;
        //  5      19     22     26     Ljava/lang/Exception;
        //  245    284    287    288    Ljava/lang/Exception;
        //  296    311    311    315    Ljava/lang/Exception;
        //  321    334    337    341    Ljava/lang/Exception;
        //  328    347    350    354    Ljava/lang/Exception;
        //  341    368    371    375    Ljava/lang/Exception;
        //  377    391    394    398    Ljava/lang/Exception;
        //  384    408    411    415    Ljava/lang/Exception;
        //  398    443    443    447    Ljava/lang/Exception;
        //  447    461    464    468    Ljava/lang/Exception;
        //  454    483    486    490    Ljava/lang/Exception;
        //  468    502    502    506    Ljava/lang/Exception;
        //  512    531    534    538    Ljava/lang/Exception;
        //  524    544    547    551    Ljava/lang/Exception;
        //  538    569    572    576    Ljava/lang/Exception;
        //  578    592    595    599    Ljava/lang/Exception;
        //  585    609    612    616    Ljava/lang/Exception;
        //  599    640    640    644    Ljava/lang/Exception;
        //  644    658    661    665    Ljava/lang/Exception;
        //  651    673    673    677    Ljava/lang/Exception;
        //  683    702    705    709    Ljava/lang/Exception;
        //  695    715    718    722    Ljava/lang/Exception;
        //  709    728    731    735    Ljava/lang/Exception;
        //  722    741    744    748    Ljava/lang/Exception;
        //  735    762    765    769    Ljava/lang/Exception;
        //  771    784    787    791    Ljava/lang/Exception;
        //  778    809    809    813    Ljava/lang/Exception;
        //  815    826    829    833    Ljava/lang/Exception;
        //  819    841    841    845    Ljava/lang/Exception;
        //  857    871    874    878    Ljava/lang/Exception;
        //  864    889    889    893    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    private char method_char(final class_11908 class_11908) {
        final int comp_4795 = class_11908.comp_4795();
        boolean b = false;
        Label_0023: {
            try {
                if ((class_11908.comp_4797() & 0x1) != 0x0) {
                    b = true;
                    break Label_0023;
                }
            }
            catch (final MatchException ex) {
                throw computeException((Exception)ex);
            }
            b = false;
        }
        final boolean b2 = b;
        Label_0104: {
            Label_0091: {
                Label_0072: {
                    try {
                        if (comp_4795 < 65 || comp_4795 > 90) {
                            break Label_0072;
                        }
                    }
                    catch (final MatchException ex2) {
                        throw computeException((Exception)ex2);
                    }
                    final char ch = (char)(97 + (comp_4795 - 65));
                    try {
                        if (b2) {
                            return Character.toUpperCase(ch);
                        }
                    }
                    catch (final MatchException ex3) {
                        throw computeException((Exception)ex3);
                    }
                    return ch;
                    try {
                        if (comp_4795 < 48) {
                            break Label_0104;
                        }
                        final int n = comp_4795;
                        final int n2 = 57;
                        if (n <= n2) {
                            break Label_0091;
                        }
                        break Label_0104;
                    }
                    catch (final MatchException ex4) {
                        throw computeException((Exception)ex4);
                    }
                }
                try {
                    final int n = comp_4795;
                    final int n2 = 57;
                    if (n <= n2) {
                        return (char)(48 + (comp_4795 - 48));
                    }
                }
                catch (final MatchException ex5) {
                    throw computeException((Exception)ex5);
                }
            }
            try {
                if (comp_4795 == 32) {
                    return ' ';
                }
            }
            catch (final MatchException ex6) {
                throw computeException((Exception)ex6);
            }
        }
        try {
            if (comp_4795 == 46) {
                return '.';
            }
        }
        catch (final MatchException ex7) {
            throw computeException((Exception)ex7);
        }
        Label_0147: {
            try {
                if (comp_4795 != 45) {
                    return '\0';
                }
                final boolean b3 = b2;
                if (b3) {
                    break Label_0147;
                }
                return '-';
            }
            catch (final MatchException ex8) {
                throw computeException((Exception)ex8);
            }
            try {
                final boolean b3 = b2;
                if (b3) {
                    final int n3 = '_';
                    return (char)n3;
                }
            }
            catch (final MatchException ex9) {
                throw computeException((Exception)ex9);
            }
        }
        final int n3 = '-';
        return (char)n3;
    }
    
    public boolean method_25421() {
        return false;
    }
    
    public void execute_2() {
        Label_0020: {
            try {
                if (class_437Sub.class310 == null) {
                    return;
                }
                final class_437Sub class_437Sub = this;
                final com.target.mod.compat.sub1.sub2.sub1.Initializer initializer = class_437Sub.getUtilc();
                if (initializer != null) {
                    break Label_0020;
                }
                return;
            }
            catch (final MatchException ex) {
                throw computeException((Exception)ex);
            }
            try {
                final class_437Sub class_437Sub = this;
                final com.target.mod.compat.sub1.sub2.sub1.Initializer initializer = class_437Sub.getUtilc();
                if (initializer != null) {
                    com.target.mod.compat.sub1.sub2.sub5.class_437Sub.class310.method_29970(this.getUtilc().getClass_437());
                }
            }
            catch (final MatchException ex2) {
                throw computeException((Exception)ex2);
            }
        }
    }
    
    public void method_25419() {
        this.execute_2();
    }
    
    public boolean isEnabled() {
        return false;
    }
    
    static {
        final String[] strArr_3 = new String[73];
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncaarr = null;
        int n = 0;
        String s;
        int n2 = (s = """
                      \u00e9\u0093\u00d1\u007f\u0094¶\u00dc¸\u007f\u0010/\u00dd\u00da¦¢\u0010\u0007}\u00d7w\u0096¼\u00f3«\f\u00e5\u00dc¨-\u0006L\u009aEy\u0000D\u00f6\u0002`\u00c8\u000e\u0096\u009b\u00d1\u00fa\u00ddC\u00e0¤\u0012<)q®U\u0002 \u0000\u001b\u0002\u00e1Wv\u00ca\u001b`o(\u00c0@\u00e90\u0089~\u0015Y\u00e2X\u00cfJX7\b·\u0013\u001e\r¡,7\f\u0001\u009d[\u007fAGC\u001eª\u0003k\u0093\u00c1&z\u00cb\u0089\u00f4\u00ceC¢Kj\u0089C\u0082\u0017¨~»)\u009d\u007f¢\u00f5\u001e\u00e0v\u0007½1\u00f2\u008b\u0093\u00ee\u0085\u00f7\u001f\u00c5¢\u00f6\u008a,¥(;´µ´*\u008eo7\u0007¼\u00f1\u008dt\u00e9i\u00e7]\u00cf\u009d\u00faF\u00fa<.\u0016\u00cf\u000eµ}\u00ec\u00ce%\u00cf\u0002W¨\u000e\u0080\u0018\u0004¬\u0016\u0004¨\u00d5\u00e9\u0096\u0002\u009fª\u0011\u00e6\u00e0\u009d^/\u007f\u00ca\u00d5¥b6\u00f4\u00eb9\u00e4\u0014w"\u00d7b\u00ed\u0016\u00d8\u0002\u0080¦\u009bR\u001f\u0015\u00d7\u00051¸\u00ecE\u00ed\u0087\u0096<\u009e;\u0089\u0003\u008c\u00d6\u0087\u0093\u00ad\u009c~O\u0014\u001fy0\u00dds\u00ec\u00f1_:\u00830hp5\u00c2¨\u00f0~\u00e8_\u000e³\u00e8\u00dcc\u008b\u00d8\u00faoF\u0087c\u00d5\\u00dc\u0011S\u00f4+\u00dc\u00f9/\u0010\u00df\u00fe#]\u00dc\u0086<I´\u00c2\u0016\u0016\u001c\u0017\u00e4Q\u0080²\u00db¦r\u00ca0x\u00ee\fIe\u00c1µx\u008a'\u001f¶\u0016>\u0085\u0091\u00d9®#\u00ff\u0092\u001f\u0018ºQm/\u007f\u00ad_\u000bZ\u0002\u00ee\u00c1M\u00fa\u00e6\u00c7\u007f\u0002\u0089	\r%\u000b\u00daq\u00ef¥\u0089\u00ad/\u0084\u00f0eZpP\u001f6\u00c9\u00df»\u00e6NU\u00ec?\u009a%\u0085\u00c2\u00c2\u0080j0\u00d6[ \u0098\u0010\u0098\u0004\u0010y°\u00d1\u00fb4\u008e¤u)\u00d2.\u0099'/\u000f\u0003¨I¹\fI%\u0083\u00dax\u00ef\u0092\u00c7® W\u00ef&±\u00c1\u00f0µ\u00e1kGN\u00d6)\u00d4\u0096\u00e5* \u00eb\u00e2\u0097\u0006\u00e3\u00da6\u0005s»\u001d¦\u00e6y\u0011°\u00d5<\u0015¼\u00e3\u00d9¢&\u00e8\u00c1\u001e±`i\u008d\u00d7w\u00ef\u001d{\u00d56|\u00c0~*`\u0093\f^\u0087\u00cc\u008bA\u0080\u00d6\u00dc\u00d43\u00f1\u0090¯/?L\u008a/\u00f5\u009aK\u0017µ\u00f9§\u0003\u00deyY2\u0012\u00cfgl\u00ebO«\u008f\u0007)\u00d2\u0005\u00c1\u00fdBLL\u0002\u008fC\b\u00da\u00ff¶\u00f1'\u001c@>t\u00ccM{µ\u0084\u0007\u00ce$\u00d4j\u001d\u00c9\u00dc\u0004\u00e1Q¹h\u0003\u00dc¹\u0012$\r\bµ\u000f\u00ff\u0083\u00c4M\u00d6\u00f0\u00f5T\u00ad\u00853\u008b\u0017\u00cb\u00c67$3\u00c5\u00ec6\u000ey8+\u00e5k²\u0099j^¶$\u00d9\u0093/|¬\u00ed®\u0080\u009bI\c\u0098c\u0095W\u00c3P\Dw]¯!{·\u00d0\u000f\u001e\u0003\u00cdnM\u00f1\u00c4\u00c5\u001d\u001d^ª\u008e¤\u00e9 ] gCµ\u0006\u00cd,\u00feQ\u00d4Z\rp\u0088B\u00de\u0011«¥I\u009f\u0004]\u0012q¦\u0010.\u008c\u00f8\u0013\u0002[\u00c9N\u008e\u00c2z	\u00dbLe<\u000b\u00fe\rP\u0010\u00d8\u0012\u0080'\u0099,\b\u000f¢M¼\u00ee\u0084¤©\u0098\u0011>g6\u00d4h¶\u0004\u00d8S¾,\u0007P\u00d7\u0003¿\u0091\u00cf\u00d5\u0011\u00f0\u009a
                      IT\u0088u\u009e\u008a;\u0007\u00d8«Y\u0015w+\u001d®3\u00ad\u00e3N\u00edur¡\u0090r\u0014\u0006\u001e\u00d8\u00e9\u00d9\u00ed\u00e6\u0097\u0005?\u00f8|\u00c2 \u0094\u001b\u0096\u0002sz\u0014h#\u00d8\u0003¨|\u009aC]\u00c0\u00c0\u00ee\u0089\u00e8\u00f3¼\u001a\u00d8\u009f+\u000e\u0087#\u00f9!\u00ce\u001cm\u00c2\u0087\u009e},r¬\u0007w\u00816\\u0094ª®\u0015\u0000\u00e4\u00d3n\u000f\u009aa\u009f\u00c3Y\u00fd\u0096i\u0081B\u0014e\u00c7]\u00c0\u001e&\u008f\u0084\u0095\u0095\u00d4\u00e9bw\u009em\u00f1W\u00f9{<¬^\u0098*[\u00d9s\u0011\u0098\u00c2Y\u0001y\u001a*\u0091\r\u0082\u001f\u00e1\u0080\u0099\u0091\u0011\u00de\u00f8¿\u0087\u0099\u009c\u00cb~\u00d7\u0019\u0006R\u0017\u00e2\u00f2\u00c0\u00f2\u0004:¿D~\u0010§5\u001f\u00e6\u0093HFDj\u00f3G+X\u00de¤h\u0015\r\u00d3.\u00cbRKseJ\u0081\f\u00c1¹\u00df\u001b\u00efd\u009aQ"`\u0007\u00c4\u009bZz¯\u009b\u008a*¨\u000f\u00e0¥\u00c0¯	\u00da\u00078\u00e8w\u00c2\u0083\\u0095\u0082\u001fRC\u0003\u00c7eu¡\u00d7n\u00e5\u0083n@¶Gi\}¨|\u00f1:ºq&[.\u000f\u00c0\u0087C\b"\u00d3\u00c7X\u0002\u00cc\u00d1\u009a\u00f9\u008a2°\u000e\u008a\u00d9{\u00cd\u008f\u00f3¨,/\u00807XVµ{\u00d5\u00ca;\f¼w=\u0090¯¦h\u00ee\u00f1\u0005¼K\u001f\u00d2K².\u0000¬\u009c\u008d¹G\u00d7¢£\u0006N\u00c5\u001b\u00f0\u00d3 \u00cbw\u00dco\u000b/.}fUª\u0002\u23fe\u00d9\u001d\u00f7\u001c\u0086\u0006+Q\u00d9\u00e54b\u00c0JP\u00d5\u0012\u0090\u0080\u00c2\u00cdr`\u0083T\u00ebW\u00d2&E\u00c0\u0003\u00c7\u0000q\u0005\u001b\u00f1k\r±\u0004·\u00fc\u001e\u00d8*®c (\u00d8\u001e
                      \u00ecg\u00fe\u00e4¯C\u0098l\u00f6\u0084s\u0092\u00ce\u001bvfC\u00c1\u0011b=\u0002up\u00d5A\u0005\u009c\u00f0°\u00cd\u00f2\f\u00da·\u0015£\u00df!\u00e1T\u0005\u0091\u0084¤\u00d0\u00e4\u0090·\u00cb¬~U\u0010\u0095\u001f\u0004\u00de\u00ee~\u009b\u0015o®\u00ff\u009a{g9 \u009f\u00ea\u00c72\u00ea\u00863za(\u00f1tt\u0004¯\u00d1	\u0016,\u0000\u00f5\u008f\u000f#\u00c3\u00f8`5\u00eaL\u0007\u0098\u00faY\u0007\u00cc:\u00e9t\u000b\u008d\u0094\u0014f\u00f3]tg\u00c2P\u0002k\u00f8{¹\u00c1\u00df\u00dcnB\u00d9\u00e7\u00ad3\u001da\u00ad\u000f¡;\u0096«g\u00d8\u0001N\u00de3\u009a¢¢¹\u00f0\u0087l6\u009dc0\u001bh¢\u00e7®\u00e4\u0093·=ª^\u009c\u00e7  \u008f=\u001f\u0084<'\u00d8Kº\b\u00e9\u001b\u0094\u00f0e·;\u00e3º§¦\u00c6{\u000eo\u00ed\u00fcº\\u0087\u00d0\u0003\u001e\u00f7\u00c4-O\u00fc"$\u007f\u0093µ\u0017vy(¤\u0083\u00f8/+B®P\u001fX\u0093$YHgµ¶\u00d2k\u00ec{\u00d42t\u008dR&¢aW¥I\u00eb¨\u0087\u00d3\u00e5\u0089:G\u001e.\u00c54\u008a)\u0087%\u00dc¢\u009c/K\u0014\u0097N\u00fca\u00f4\u00da\u000ff+e\b""").length();
        setSyncaarr(syncaarr);
        int n3 = 16;
        int n4 = -1;
    Label_0028:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 54));
                ++n4;
                final String s2 = s;
                final int beginIndex = n4;
                String s3 = s2.substring(beginIndex, beginIndex + n3);
                int n9 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    final int length = charArray.length;
                    int n10 = 0;
                    while (true) {
                        Label_0388: {
                            if (length > 1) {
                                break Label_0388;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 31;
                                    case 1 -> 27;
                                    case 2 -> 95;
                                    case 3 -> 50;
                                    case 4 -> 32;
                                    case 5 -> 67;
                                    default -> 36;
                                }));
                                ++n10;
                            } while (n8 == 0);
                        }
                        if (length > n10) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n9) {
                        default: {
                            strArr_3[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0028;
                            }
                            n2 = (s = "\u00e7\u0014\u00064\u00c2ML\u0006\u0012+]\u009b\u00f6\u00d9").length();
                            n3 = 7;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr_3[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0028;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 74)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        strArr_1 = strArr_3;
        strArr_2 = new String[73];
        strValue_12 = createString_1(27869, 24163);
        strValue_14 = createString_1(27850, -2413);
        strValue_16 = createString_1(27888, 18383);
        strValue_8 = createString_1(27866, -6403);
        strValue_15 = createString_1(27857, -22289);
        strValue_13 = createString_1(27782, -27052);
        strValue_9 = createString_1(27868, -29998);
        strValue_11 = createString_1(27882, 32681);
        strValue_7 = createString_1(27901, 28589);
        strValue_10 = createString_1(27863, -2957);
        class310 = class_310.method_1551();
        class_437Sub.intValue_7 = 130;
        intValue_12 = method_int(10, 10, 16, 245);
        intValue_13 = method_int(16, 16, 24, 252);
        intValue_14 = method_int(100, 80, 220, 255);
        intValue_15 = method_int(90, 60, 200, 180);
        intValue_16 = method_int(28, 28, 42, 200);
        intValue_17 = method_int(14, 14, 22, 240);
        intValue_18 = method_int(35, 35, 55, 120);
        intValue_19 = method_int(35, 35, 55, 220);
        intValue_20 = method_int(120, 90, 235, 255);
        intValue_21 = method_int(100, 75, 220, 255);
        intValue_22 = method_int(40, 40, 58, 255);
        intValue_23 = method_int(120, 90, 235, 255);
        intValue_24 = method_int(40, 38, 60, 120);
        intValue_25 = method_int(4, 4, 10, 170);
        intValue_26 = method_int(0, 0, 0, 170);
        intValue_27 = method_int(200, 190, 240, 40);
        intValue_28 = method_int(240, 240, 255, 255);
        intValue_29 = method_int(145, 145, 170, 255);
        intValue_30 = method_int(95, 95, 120, 255);
        intValue_31 = method_int(160, 130, 255, 255);
        intArray = new int[][] { { 0, 10, 40, 85 }, { 10, 50, 92, 100 }, { 40, 92, 100, 100 }, { 85, 100, 100, 100 } };
    }
    
    public static void setSyncaarr(final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncAArray) {
        class_437Sub.SyncAArray = syncAArray;
    }
    
    public static com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] getSyncaarrArray() {
        return class_437Sub.SyncAArray;
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    private static String createString_1(final int n, final int n2) {
        final int n3 = (n ^ 0x6CC4) & 0xFFFF;
        if (class_437Sub.strArr_2[n3] == null) {
            final char[] charArray = class_437Sub.strArr_1[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 46;
                case 1 -> 45;
                case 2 -> 111;
                case 3 -> 18;
                case 4 -> 86;
                case 5 -> 76;
                case 6 -> 200;
                case 7 -> 157;
                case 8 -> 82;
                case 9 -> 51;
                case 10 -> 240;
                case 11 -> 74;
                case 12 -> 128;
                case 13 -> 49;
                case 14 -> 72;
                case 15 -> 106;
                case 16 -> 199;
                case 17 -> 62;
                case 18 -> 201;
                case 19 -> 40;
                case 20 -> 167;
                case 21 -> 25;
                case 22 -> 35;
                case 23 -> 36;
                case 24 -> 22;
                case 25 -> 14;
                case 26 -> 162;
                case 27 -> 107;
                case 28 -> 12;
                case 29 -> 56;
                case 30 -> 127;
                case 31 -> 92;
                case 32 -> 153;
                case 33 -> 104;
                case 34 -> 121;
                case 35 -> 91;
                case 36 -> 150;
                case 37 -> 53;
                case 38 -> 73;
                case 39 -> 164;
                case 40 -> 120;
                case 41 -> 238;
                case 42 -> 226;
                case 43 -> 109;
                case 44 -> 88;
                case 45 -> 133;
                case 46 -> 188;
                case 47 -> 135;
                case 48 -> 236;
                case 49 -> 170;
                case 50 -> 81;
                case 51 -> 235;
                case 52 -> 232;
                case 53 -> 30;
                case 54 -> 29;
                case 55 -> 220;
                case 56 -> 142;
                case 57 -> 58;
                case 58 -> 99;
                case 59 -> 184;
                case 60 -> 186;
                case 61 -> 237;
                case 62 -> 156;
                case 63 -> 10;
                case 64 -> 161;
                case 65 -> 169;
                case 66 -> 7;
                case 67 -> 247;
                case 68 -> 181;
                case 69 -> 252;
                case 70 -> 146;
                case 71 -> 93;
                case 72 -> 174;
                case 73 -> 44;
                case 74 -> 255;
                case 75 -> 151;
                case 76 -> 55;
                case 77 -> 118;
                case 78 -> 158;
                case 79 -> 143;
                case 80 -> 249;
                case 81 -> 176;
                case 82 -> 60;
                case 83 -> 177;
                case 84 -> 98;
                case 85 -> 90;
                case 86 -> 61;
                case 87 -> 140;
                case 88 -> 130;
                case 89 -> 102;
                case 90 -> 165;
                case 91 -> 131;
                case 92 -> 155;
                case 93 -> 100;
                case 94 -> 138;
                case 95 -> 66;
                case 96 -> 254;
                case 97 -> 221;
                case 98 -> 182;
                case 99 -> 48;
                case 100 -> 195;
                case 101 -> 105;
                case 102 -> 11;
                case 103 -> 241;
                case 104 -> 79;
                case 105 -> 251;
                case 106 -> 33;
                case 107 -> 13;
                case 108 -> 227;
                case 109 -> 166;
                case 110 -> 180;
                case 111 -> 144;
                case 112 -> 132;
                case 113 -> 85;
                case 114 -> 242;
                case 115 -> 50;
                case 116 -> 190;
                case 117 -> 230;
                case 118 -> 59;
                case 119 -> 228;
                case 120 -> 137;
                case 121 -> 78;
                case 122 -> 223;
                case 123 -> 213;
                case 124 -> 16;
                case 125 -> 116;
                case 126 -> 17;
                case 127 -> 229;
                case 128 -> 64;
                case 129 -> 250;
                case 130 -> 89;
                case 131 -> 3;
                case 132 -> 20;
                case 133 -> 244;
                case 134 -> 149;
                case 135 -> 4;
                case 136 -> 37;
                case 137 -> 185;
                case 138 -> 248;
                case 139 -> 27;
                case 140 -> 1;
                case 141 -> 191;
                case 142 -> 233;
                case 143 -> 117;
                case 144 -> 196;
                case 145 -> 183;
                case 146 -> 198;
                case 147 -> 114;
                case 148 -> 136;
                case 149 -> 210;
                case 150 -> 87;
                case 151 -> 6;
                case 152 -> 253;
                case 153 -> 43;
                case 154 -> 95;
                case 155 -> 163;
                case 156 -> 225;
                case 157 -> 124;
                case 158 -> 234;
                case 159 -> 160;
                case 160 -> 2;
                case 161 -> 63;
                case 162 -> 243;
                case 163 -> 101;
                case 164 -> 77;
                case 165 -> 34;
                case 166 -> 179;
                case 167 -> 68;
                case 168 -> 193;
                case 169 -> 215;
                case 170 -> 212;
                case 171 -> 32;
                case 172 -> 207;
                case 173 -> 246;
                case 174 -> 9;
                case 175 -> 47;
                case 176 -> 103;
                case 177 -> 218;
                case 178 -> 192;
                case 179 -> 125;
                case 180 -> 197;
                case 181 -> 23;
                case 182 -> 39;
                case 183 -> 152;
                case 184 -> 173;
                case 185 -> 97;
                case 186 -> 96;
                case 187 -> 231;
                case 188 -> 141;
                case 189 -> 216;
                case 190 -> 219;
                case 191 -> 187;
                case 192 -> 65;
                case 193 -> 209;
                case 194 -> 5;
                case 195 -> 75;
                case 196 -> 15;
                case 197 -> 69;
                case 198 -> 54;
                case 199 -> 70;
                case 200 -> 139;
                case 201 -> 83;
                case 202 -> 148;
                case 203 -> 208;
                case 204 -> 204;
                case 205 -> 194;
                case 206 -> 112;
                case 207 -> 84;
                case 208 -> 178;
                case 209 -> 145;
                case 210 -> 28;
                case 211 -> 21;
                case 212 -> 175;
                case 213 -> 122;
                case 214 -> 154;
                case 215 -> 41;
                case 216 -> 202;
                case 217 -> 171;
                case 218 -> 203;
                case 219 -> 239;
                case 220 -> 205;
                case 221 -> 80;
                case 222 -> 31;
                case 223 -> 168;
                case 224 -> 159;
                case 225 -> 129;
                case 226 -> 8;
                case 227 -> 52;
                case 228 -> 19;
                case 229 -> 108;
                case 230 -> 211;
                case 231 -> 113;
                case 232 -> 94;
                case 233 -> 119;
                case 234 -> 38;
                case 235 -> 126;
                case 236 -> 206;
                case 237 -> 147;
                case 238 -> 67;
                case 239 -> 245;
                case 240 -> 110;
                case 241 -> 42;
                case 242 -> 224;
                case 243 -> 172;
                case 244 -> 123;
                case 245 -> 0;
                case 246 -> 71;
                case 247 -> 26;
                case 248 -> 115;
                case 249 -> 134;
                case 250 -> 57;
                case 251 -> 189;
                case 252 -> 222;
                case 253 -> 217;
                case 254 -> 214;
                default -> 24;
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
            class_437Sub.strArr_2[n3] = new String(charArray).intern();
        }
        return class_437Sub.strArr_2[n3];
    }
}
