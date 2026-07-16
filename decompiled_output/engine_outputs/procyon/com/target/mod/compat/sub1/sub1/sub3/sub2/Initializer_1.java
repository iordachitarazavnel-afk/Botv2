// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub2;

import com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer;
import net.minecraft.class_332;
import java.awt.Color;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_4;
import com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_8;
import net.minecraft.class_310;

public class Initializer_1
{
    private final class_310 class310;
    private final int intValue = 180;
    private final int intValue_1 = 200;
    private final int intValue_2 = 25;
    private final int intValue_3 = 10;
    private final int intValue_4 = 100;
    private final int intValue_5 = 15;
    private final int intValue_6 = 22;
    private final int intValue_7 = 30;
    private final Initializer_8 slotJ;
    private final int intValue_8 = 100;
    private final int intValue_9 = 15;
    private RenderASub_4 coreD;
    private int intValue_10;
    private int intValue_11;
    private float floatValue;
    private float floatValue_1;
    private float floatValue_2;
    private float floatValue_3;
    private boolean boolFlag;
    private int intValue_12;
    private int intValue_13;
    private boolean boolFlag_1;
    private boolean boolFlag_2;
    private boolean boolFlag_3;
    private boolean boolFlag_4;
    private long longValue;
    private boolean boolFlag_5;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_1() {
        this.class310 = class_310.method_1551();
        this.slotJ = new Initializer_8();
        this.intValue_10 = 1000;
        this.intValue_11 = 600;
        this.floatValue = 0.0f;
        this.floatValue_1 = 1.0f;
        this.floatValue_2 = 1.0f;
        this.floatValue_3 = 1.0f;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.boolFlag_3 = false;
        this.boolFlag_4 = false;
        this.longValue = System.currentTimeMillis();
        this.boolFlag_5 = true;
    }
    
    public void setCored(final RenderASub_4 coreD) {
        this.coreD = coreD;
        if (coreD != null) {
            final Color color = coreD.getColor();
            final float[] rgBtoHSB = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
            this.floatValue = rgBtoHSB[0];
            this.floatValue_1 = rgBtoHSB[1];
            this.floatValue_2 = rgBtoHSB[2];
            this.floatValue_3 = color.getAlpha() / 255.0f;
            this.execute();
        }
        else {
            this.boolFlag_4 = false;
            this.slotJ.setString_2("");
            this.slotJ.execute();
        }
    }
    
    public void processAll(final RenderASub_4 cored, int max, int max2) {
        Label_0099: {
            try {
                this.setCored(cored);
                this.longValue = System.currentTimeMillis();
                this.boolFlag_5 = true;
                if (this.class310 == null || this.class310.method_22683() == null) {
                    break Label_0099;
                }
            }
            catch (final NumberFormatException ex) {
                throw computeNumberformatexception(ex);
            }
            final int method_4480 = this.class310.method_22683().method_4480();
            final int method_4481 = this.class310.method_22683().method_4507();
            max = Math.max(5, Math.min(method_4480 - 180 - 5, max));
            max2 = Math.max(5, Math.min(method_4481 - 200 - 5, max2));
        }
        this.intValue_10 = max;
        this.intValue_11 = max2;
    }
    
    public void processAll_1(final class_332 class_332, final int n, final int n2, final float n3) {
        final String string = Initializer_2.getString();
        try {
            if (this.coreD == null) {
                return;
            }
        }
        catch (final NumberFormatException ex) {
            throw computeNumberformatexception(ex);
        }
        float method_float = 1.0f;
        float n5 = 0.0f;
        Label_0100: {
            Label_0096: {
                try {
                    final int n4 = (int)(n5 = (this.boolFlag_5 ? 1 : 0));
                    if (string != null) {
                        break Label_0100;
                    }
                    if (n4 == 0) {
                        break Label_0096;
                    }
                }
                catch (final NumberFormatException ex2) {
                    throw computeNumberformatexception(ex2);
                }
                method_float = this.method_float(Math.min(1.0f, (System.currentTimeMillis() - this.longValue) / 300.0f));
                Label_0084: {
                    float n6;
                    try {
                        n6 = (n5 = fcmpl(method_float, 1.0f));
                        if (string != null) {
                            break Label_0100;
                        }
                        if (n6 >= 0) {
                            break Label_0084;
                        }
                        break Label_0096;
                    }
                    catch (final NumberFormatException ex3) {
                        throw computeNumberformatexception(ex3);
                    }
                    try {
                        if (n6 >= 0) {
                            this.boolFlag_5 = false;
                        }
                    }
                    catch (final NumberFormatException ex4) {
                        throw computeNumberformatexception(ex4);
                    }
                }
            }
            n5 = this.getInt_1();
        }
        final float n7 = n5;
        final int n8 = -2147;
        final int method_int = com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_6(), method_float * com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getFloat());
        final int n9 = -32115;
        Initializer.processAll_20(class_332, this.intValue_10, this.intValue_11, 180, 200, (int)n7, method_int);
        Initializer.processAll_30(class_332, this.intValue_10, this.intValue_11, 180, 200, (int)n7, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt(), method_float * 0.5f));
        Initializer.processAll_23(class_332, this.intValue_10, this.intValue_11, 180, 25, (int)n7, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_4(), method_float * com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getFloat()));
        class_332.method_51433(this.class310.field_1772, createString(n8, n9), this.intValue_10 + 10, this.intValue_11 + 8, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int_1(-1, (int)(method_float * 255.0f)) | 0xFF000000, true);
        final String s = "\u2715";
        final int checkCondition_4 = this.checkCondition_4(n, n2, this.intValue_10 + 180 - 20, this.intValue_11 + 4, 16, 16) ? 1 : 0;
        int int1 = 0;
        Label_0326: {
            Label_0323: {
                Label_0320: {
                    try {
                        final int n10 = int1 = checkCondition_4;
                        if (string != null) {
                            break Label_0320;
                        }
                        if (n10 == 0) {
                            break Label_0323;
                        }
                    }
                    catch (final NumberFormatException ex5) {
                        throw computeNumberformatexception(ex5);
                    }
                    int1 = com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt();
                }
                break Label_0326;
            }
            int1 = -3355444;
        }
        class_332.method_51433(this.class310.field_1772, s, this.intValue_10 + 180 - 18, this.intValue_11 + 8, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int_1(int1, (int)(method_float * 255.0f)) | 0xFF000000, false);
        final int n11 = this.intValue_11 + 25 + 10;
        final int n12 = this.intValue_10 + 10;
        final int n13 = n11;
        final int n14 = n12 + 100 + 10;
        final int n15 = n13;
        this.processAll_4(class_332, n12, n13, method_float);
        this.processAll_5(class_332, n14, n15, method_float);
        this.processAll_6(class_332, (int)(n12 + this.floatValue_1 * 100.0f), (int)(n13 + (1.0f - this.floatValue_2) * 100.0f), method_float);
        this.processAll_7(class_332, n14, (int)(n15 + this.floatValue * 100.0f), method_float);
        final int n16 = n13 + 100 + 10;
        final int n17 = n12;
        final int n18 = 125;
        this.processAll_2(class_332, n17, n16, n18, method_float);
        this.processAll_8(class_332, (int)(n17 + this.floatValue_3 * n18), n16, method_float);
        final int n19 = n16 + 15 + 10;
        final int n20 = this.intValue_10 + 10;
        final int n21 = 125;
        this.processAll_3(class_332, n20, n19, n21, n, n2, method_float);
        this.processAll_9(class_332, n20 + n21 + 5, n19 - 4, method_float);
    }
    
    private void processAll_4(final class_332 class_332, final int n, final int n2, final float n3) {
        for (int n4 = 2, i = 0; i < 100; i += n4) {
            final float brightness = 1.0f - i / 100.0f;
            for (int j = 0; j < 100; j += n4) {
                class_332.method_25294(n + j, n2 + i, n + j + n4, n2 + i + n4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(Color.HSBtoRGB(this.floatValue, j / 100.0f, brightness), n3));
            }
        }
        Initializer.processAll_30(class_332, n, n2, 100, 100, 4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_10(), n3 * 0.6f));
    }
    
    private void processAll_5(final class_332 class_332, final int n, final int n2, final float n3) {
        Initializer.processAll_20(class_332, n, n2, 15, 100, 4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-14540254, n3 * com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getFloat()));
        for (int n4 = 2, i = 0; i < 100; i += n4) {
            class_332.method_25294(n + 2, n2 + i, n + 15 - 2, n2 + i + n4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(Color.HSBtoRGB(i / 100.0f, 1.0f, 1.0f), n3));
        }
        Initializer.processAll_30(class_332, n, n2, 15, 100, 4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_10(), n3 * 0.6f));
    }
    
    private void processAll_2(final class_332 class_332, final int n, final int n2, final int n3, final float n4) {
        Initializer.processAll_20(class_332, n, n2, n3, 15, 4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-13421773, n4 * com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getFloat()));
        final Color color = new Color(Color.HSBtoRGB(this.floatValue, this.floatValue_1, this.floatValue_2));
        for (int n5 = 2, i = 0; i < n3; i += n5) {
            class_332.method_25294(n + i, n2 + 2, n + i + n5, n2 + 15 - 2, new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)(i / (float)n3 * 255.0f)).getRGB());
        }
        Initializer.processAll_30(class_332, n, n2, n3, 15, 4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_10(), n4 * 0.6f));
    }
    
    private void processAll_6(final class_332 class_332, int max, int max2, final float n) {
        final int a = this.intValue_10 + 10;
        final int a2 = this.intValue_11 + 25 + 10;
        max = Math.max(a, Math.min(a + 100, max));
        max2 = Math.max(a2, Math.min(a2 + 100, max2));
        final int n2 = 8;
        Initializer.processAll_20(class_332, max - n2 / 2 - 2, max2 - n2 / 2 - 2, n2 + 4, n2 + 4, n2 / 2 + 2, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-16777216, n * 0.8f));
        Initializer.processAll_20(class_332, max - n2 / 2 - 1, max2 - n2 / 2 - 1, n2 + 2, n2 + 2, n2 / 2 + 1, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-1, n));
        Initializer.processAll_20(class_332, max - n2 / 2, max2 - n2 / 2, n2, n2, n2 / 2, this.getInt());
    }
    
    private void processAll_7(final class_332 class_332, final int n, final int n2, final float n3) {
        final int n4 = 21;
        final int n5 = 4;
        final int n6 = n - 3;
        final int n7 = n2 - 2;
        Initializer.processAll_20(class_332, n6 - 1, n7 - 1, n4 + 2, n5 + 2, 3, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-16777216, n3 * 0.8f));
        Initializer.processAll_20(class_332, n6, n7, n4, n5, 2, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-1, n3));
        Initializer.processAll_20(class_332, n6 + 1, n7 + 1, n4 - 2, n5 - 2, 2, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(Color.HSBtoRGB(this.floatValue, 1.0f, 1.0f), n3));
    }
    
    private void processAll_8(final class_332 class_332, final int n, final int n2, final float n3) {
        final int n4 = 4;
        final int n5 = 21;
        final int n6 = n - 2;
        final int n7 = n2 - 3;
        Initializer.processAll_20(class_332, n6 - 1, n7 - 1, n4 + 2, n5 + 2, 3, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-16777216, n3 * 0.8f));
        Initializer.processAll_20(class_332, n6, n7, n4, n5, 2, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-1, n3));
        Initializer.processAll_20(class_332, n6 + 1, n7 + 1, n4 - 2, n5 - 2, 2, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(this.getInt(), n3));
    }
    
    private void processAll_3(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final float n6) {
        final boolean checkCondition_4 = this.checkCondition_4(n4, n5, n, n2, n3, 22);
        int n7 = 0;
        Label_0067: {
            Label_0037: {
                try {
                    if (this.boolFlag_4) {
                        break Label_0037;
                    }
                    final boolean b = checkCondition_4;
                    if (b) {
                        break Label_0037;
                    }
                    break Label_0037;
                }
                catch (final NumberFormatException ex) {
                    throw computeNumberformatexception(ex);
                }
                try {
                    final boolean b = checkCondition_4;
                    if (b) {
                        n7 = com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_7(), n6 * 0.5f);
                        break Label_0067;
                    }
                }
                catch (final NumberFormatException ex2) {
                    throw computeNumberformatexception(ex2);
                }
            }
            n7 = com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-13421773, n6 * com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getFloat());
        }
        Initializer.processAll_20(class_332, n, n2, n3, 22, 6, n7);
        final String string_1 = this.slotJ.getString_1();
        String s = null;
        Label_0205: {
            Label_0174: {
                try {
                    if (!this.boolFlag_4 || !this.slotJ.isEnabled_1()) {
                        break Label_0174;
                    }
                }
                catch (final NumberFormatException ex3) {
                    throw computeNumberformatexception(ex3);
                }
                final int int_2 = this.slotJ.getInt_2();
                s = "#" + string_1.substring(0, Math.min(int_2, string_1.length())) + "_" + string_1.substring(Math.min(int_2, string_1.length()));
                break Label_0205;
            }
            if (string_1.isEmpty()) {
                s = "#" + this.getString();
            }
            else {
                s = "#" + string_1;
            }
        }
        class_332.method_51433(this.class310.field_1772, s, n + 6, n2 + 7, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int_1(-1, (int)(n6 * 255.0f)) | 0xFF000000, false);
        Initializer.processAll_30(class_332, n, n2, n3, 22, 6, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_10(), n6 * 0.6f));
    }
    
    private void processAll_9(final class_332 class_332, final int n, final int n2, final float n3) {
        Initializer.processAll_20(class_332, n, n2, 30, 30, 6, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(-13421773, n3 * com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getFloat()));
        Initializer.processAll_20(class_332, n, n2, 30, 30, 6, this.getInt());
        Initializer.processAll_30(class_332, n, n2, 30, 30, 6, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_10(), n3 * 0.6f));
    }
    
    private int getInt() {
        final Color color = new Color(Color.HSBtoRGB(this.floatValue, this.floatValue_1, this.floatValue_2));
        return (int)(this.floatValue_3 * 255.0f) << 24 | color.getRed() << 16 | color.getGreen() << 8 | color.getBlue();
    }
    
    private String getString() {
        final int n = -2148;
        final Color color = new Color(Color.HSBtoRGB(this.floatValue, this.floatValue_1, this.floatValue_2));
        return String.format(createString(n, 29244), (int)(this.floatValue_3 * 255.0f), color.getRed(), color.getGreen(), color.getBlue());
    }
    
    private void execute() {
        this.slotJ.setString_2(this.getString());
    }
    
    private void execute_1() {
        try {
            final String trim = this.slotJ.getString_1().replace("#", "").trim();
            if (trim.length() == 8) {
                final int int1 = Integer.parseInt(trim.substring(0, 2), 16);
                final int int2 = Integer.parseInt(trim.substring(2, 4), 16);
                final int int3 = Integer.parseInt(trim.substring(4, 6), 16);
                final int int4 = Integer.parseInt(trim.substring(6, 8), 16);
                final float[] rgBtoHSB = Color.RGBtoHSB(int2, int3, int4, null);
                try {
                    this.floatValue = rgBtoHSB[0];
                    this.floatValue_1 = rgBtoHSB[1];
                    this.floatValue_2 = rgBtoHSB[2];
                    this.floatValue_3 = int1 / 255.0f;
                    if (this.coreD != null) {
                        this.coreD.setColor(new Color(int2, int3, int4, int1));
                    }
                }
                catch (final NumberFormatException ex) {
                    throw computeNumberformatexception(ex);
                }
            }
            else if (trim.length() == 6) {
                final int int5 = Integer.parseInt(trim.substring(0, 2), 16);
                final int int6 = Integer.parseInt(trim.substring(2, 4), 16);
                final int int7 = Integer.parseInt(trim.substring(4, 6), 16);
                final float[] rgBtoHSB2 = Color.RGBtoHSB(int5, int6, int7, null);
                try {
                    this.floatValue = rgBtoHSB2[0];
                    this.floatValue_1 = rgBtoHSB2[1];
                    this.floatValue_2 = rgBtoHSB2[2];
                    this.floatValue_3 = 1.0f;
                    if (this.coreD != null) {
                        this.coreD.setColor(new Color(int5, int6, int7, 255));
                    }
                }
                catch (final NumberFormatException ex2) {
                    throw computeNumberformatexception(ex2);
                }
            }
        }
        catch (final NumberFormatException ex3) {}
    }
    
    public boolean checkCondition(final double p0, final double p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.coreD:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_4;
        //     4: ifnonnull       13
        //     7: iconst_0       
        //     8: ireturn        
        //     9: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    12: athrow         
        //    13: aload_0        
        //    14: dload_1        
        //    15: dload_3        
        //    16: aload_0        
        //    17: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //    20: sipush          180
        //    23: iadd           
        //    24: bipush          20
        //    26: isub           
        //    27: aload_0        
        //    28: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_11:I
        //    31: iconst_4       
        //    32: iadd           
        //    33: bipush          16
        //    35: bipush          16
        //    37: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.checkCondition_4:(DDIIII)Z
        //    40: ifeq            74
        //    43: aload_0        
        //    44: aconst_null    
        //    45: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.coreD:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_4;
        //    48: aload_0        
        //    49: iconst_0       
        //    50: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_1:Z
        //    53: aload_0        
        //    54: iconst_0       
        //    55: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_2:Z
        //    58: aload_0        
        //    59: iconst_0       
        //    60: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_3:Z
        //    63: aload_0        
        //    64: iconst_0       
        //    65: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_4:Z
        //    68: iconst_1       
        //    69: ireturn        
        //    70: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    73: athrow         
        //    74: iload           5
        //    76: ifne            178
        //    79: aload_0        
        //    80: dload_1        
        //    81: dload_3        
        //    82: aload_0        
        //    83: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //    86: aload_0        
        //    87: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_11:I
        //    90: sipush          180
        //    93: bipush          25
        //    95: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.checkCondition_4:(DDIIII)Z
        //    98: ifeq            178
        //   101: goto            108
        //   104: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   107: athrow         
        //   108: aload_0        
        //   109: dload_1        
        //   110: dload_3        
        //   111: aload_0        
        //   112: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //   115: sipush          180
        //   118: iadd           
        //   119: bipush          20
        //   121: isub           
        //   122: aload_0        
        //   123: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_11:I
        //   126: iconst_4       
        //   127: iadd           
        //   128: bipush          16
        //   130: bipush          16
        //   132: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.checkCondition_4:(DDIIII)Z
        //   135: ifne            178
        //   138: goto            145
        //   141: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   144: athrow         
        //   145: aload_0        
        //   146: iconst_1       
        //   147: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag:Z
        //   150: aload_0        
        //   151: dload_1        
        //   152: d2i            
        //   153: aload_0        
        //   154: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //   157: isub           
        //   158: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_12:I
        //   161: aload_0        
        //   162: dload_3        
        //   163: d2i            
        //   164: aload_0        
        //   165: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_11:I
        //   168: isub           
        //   169: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_13:I
        //   172: iconst_1       
        //   173: ireturn        
        //   174: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   177: athrow         
        //   178: aload_0        
        //   179: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //   182: bipush          10
        //   184: iadd           
        //   185: istore          6
        //   187: aload_0        
        //   188: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_11:I
        //   191: bipush          25
        //   193: iadd           
        //   194: bipush          10
        //   196: iadd           
        //   197: istore          7
        //   199: iload           5
        //   201: ifne            247
        //   204: aload_0        
        //   205: dload_1        
        //   206: dload_3        
        //   207: iload           6
        //   209: iload           7
        //   211: bipush          100
        //   213: bipush          100
        //   215: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.checkCondition_4:(DDIIII)Z
        //   218: ifeq            247
        //   221: goto            228
        //   224: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   227: athrow         
        //   228: aload_0        
        //   229: iconst_1       
        //   230: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_1:Z
        //   233: aload_0        
        //   234: dload_1        
        //   235: d2i            
        //   236: dload_3        
        //   237: d2i            
        //   238: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.setIntAndInt:(II)V
        //   241: iconst_1       
        //   242: ireturn        
        //   243: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   246: athrow         
        //   247: iload           6
        //   249: bipush          100
        //   251: iadd           
        //   252: bipush          10
        //   254: iadd           
        //   255: istore          8
        //   257: iload           7
        //   259: istore          9
        //   261: iload           5
        //   263: ifne            307
        //   266: aload_0        
        //   267: dload_1        
        //   268: dload_3        
        //   269: iload           8
        //   271: iload           9
        //   273: bipush          15
        //   275: bipush          100
        //   277: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.checkCondition_4:(DDIIII)Z
        //   280: ifeq            307
        //   283: goto            290
        //   286: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   289: athrow         
        //   290: aload_0        
        //   291: iconst_1       
        //   292: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_2:Z
        //   295: aload_0        
        //   296: dload_3        
        //   297: d2i            
        //   298: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.setInt:(I)V
        //   301: iconst_1       
        //   302: ireturn        
        //   303: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   306: athrow         
        //   307: iload           7
        //   309: bipush          100
        //   311: iadd           
        //   312: bipush          10
        //   314: iadd           
        //   315: istore          10
        //   317: iload           6
        //   319: istore          11
        //   321: bipush          125
        //   323: istore          12
        //   325: iload           5
        //   327: ifne            373
        //   330: aload_0        
        //   331: dload_1        
        //   332: dload_3        
        //   333: iload           11
        //   335: iload           10
        //   337: iload           12
        //   339: bipush          15
        //   341: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.checkCondition_4:(DDIIII)Z
        //   344: ifeq            373
        //   347: goto            354
        //   350: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   353: athrow         
        //   354: aload_0        
        //   355: iconst_1       
        //   356: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_3:Z
        //   359: aload_0        
        //   360: dload_1        
        //   361: d2i            
        //   362: iload           12
        //   364: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.setIntAndInt_1:(II)V
        //   367: iconst_1       
        //   368: ireturn        
        //   369: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   372: athrow         
        //   373: iload           10
        //   375: bipush          15
        //   377: iadd           
        //   378: bipush          10
        //   380: iadd           
        //   381: istore          13
        //   383: aload_0        
        //   384: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //   387: bipush          10
        //   389: iadd           
        //   390: istore          14
        //   392: bipush          125
        //   394: istore          15
        //   396: iload           5
        //   398: ifne            447
        //   401: aload_0        
        //   402: dload_1        
        //   403: dload_3        
        //   404: iload           14
        //   406: iload           13
        //   408: iload           15
        //   410: bipush          22
        //   412: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.checkCondition_4:(DDIIII)Z
        //   415: ifeq            447
        //   418: goto            425
        //   421: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   424: athrow         
        //   425: aload_0        
        //   426: iconst_1       
        //   427: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_4:Z
        //   430: aload_0        
        //   431: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //   434: aload_0        
        //   435: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.getString:()Ljava/lang/String;
        //   438: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.setString:(Ljava/lang/String;)V
        //   441: iconst_1       
        //   442: ireturn        
        //   443: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   446: athrow         
        //   447: aload_0        
        //   448: dload_1        
        //   449: dload_3        
        //   450: iload           14
        //   452: iload           13
        //   454: iload           15
        //   456: bipush          22
        //   458: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.checkCondition_4:(DDIIII)Z
        //   461: ifne            487
        //   464: aload_0        
        //   465: iconst_0       
        //   466: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_4:Z
        //   469: aload_0        
        //   470: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //   473: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.execute:()V
        //   476: aload_0        
        //   477: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.execute_1:()V
        //   480: goto            487
        //   483: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   486: athrow         
        //   487: aload_0        
        //   488: dload_1        
        //   489: dload_3        
        //   490: aload_0        
        //   491: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //   494: aload_0        
        //   495: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_11:I
        //   498: sipush          180
        //   501: sipush          200
        //   504: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.checkCondition_4:(DDIIII)Z
        //   507: ireturn        
        //    StackMapTable: 00 1C 49 07 00 A4 03 78 07 00 A4 03 5D 07 00 A4 03 60 07 00 A4 03 5C 07 00 A4 03 FF 00 2D 00 06 07 00 02 03 03 01 01 01 00 01 07 00 A4 03 4E 07 00 A4 03 FF 00 26 00 08 07 00 02 03 03 01 01 01 01 01 00 01 07 00 A4 03 4C 07 00 A4 03 FF 00 2A 00 0B 07 00 02 03 03 01 01 01 01 01 01 01 01 00 01 07 00 A4 03 4E 07 00 A4 03 FF 00 2F 00 0E 07 00 02 03 03 01 01 01 01 01 01 01 01 01 01 01 00 01 07 00 A4 03 51 07 00 A4 03 63 07 00 A4 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      9      9      13     Ljava/lang/NumberFormatException;
        //  13     70     70     74     Ljava/lang/NumberFormatException;
        //  74     101    104    108    Ljava/lang/NumberFormatException;
        //  79     138    141    145    Ljava/lang/NumberFormatException;
        //  108    174    174    178    Ljava/lang/NumberFormatException;
        //  199    221    224    228    Ljava/lang/NumberFormatException;
        //  204    243    243    247    Ljava/lang/NumberFormatException;
        //  261    283    286    290    Ljava/lang/NumberFormatException;
        //  266    303    303    307    Ljava/lang/NumberFormatException;
        //  325    347    350    354    Ljava/lang/NumberFormatException;
        //  330    369    369    373    Ljava/lang/NumberFormatException;
        //  396    418    421    425    Ljava/lang/NumberFormatException;
        //  401    443    443    447    Ljava/lang/NumberFormatException;
        //  447    480    483    487    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0108:
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
    
    public boolean checkCondition_1(final double p0, final double p1, final int p2, final double p3, final double p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.coreD:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_4;
        //     4: ifnonnull       13
        //     7: iconst_0       
        //     8: ireturn        
        //     9: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    12: athrow         
        //    13: aload_0        
        //    14: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag:Z
        //    17: ifeq            152
        //    20: iload           5
        //    22: ifne            152
        //    25: goto            32
        //    28: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    31: athrow         
        //    32: aload_0        
        //    33: dload_1        
        //    34: d2i            
        //    35: aload_0        
        //    36: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_12:I
        //    39: isub           
        //    40: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //    43: aload_0        
        //    44: dload_3        
        //    45: d2i            
        //    46: aload_0        
        //    47: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_13:I
        //    50: isub           
        //    51: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_11:I
        //    54: aload_0        
        //    55: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.class310:Lnet/minecraft/class_310;
        //    58: ifnull          150
        //    61: goto            68
        //    64: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    67: athrow         
        //    68: aload_0        
        //    69: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.class310:Lnet/minecraft/class_310;
        //    72: invokevirtual   net/minecraft/class_310.method_22683:()Lnet/minecraft/class_1041;
        //    75: ifnull          150
        //    78: goto            85
        //    81: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    84: athrow         
        //    85: aload_0        
        //    86: iconst_0       
        //    87: aload_0        
        //    88: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.class310:Lnet/minecraft/class_310;
        //    91: invokevirtual   net/minecraft/class_310.method_22683:()Lnet/minecraft/class_1041;
        //    94: invokevirtual   net/minecraft/class_1041.method_4480:()I
        //    97: sipush          180
        //   100: isub           
        //   101: aload_0        
        //   102: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //   105: invokestatic    java/lang/Math.min:(II)I
        //   108: invokestatic    java/lang/Math.max:(II)I
        //   111: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_10:I
        //   114: aload_0        
        //   115: iconst_0       
        //   116: aload_0        
        //   117: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.class310:Lnet/minecraft/class_310;
        //   120: invokevirtual   net/minecraft/class_310.method_22683:()Lnet/minecraft/class_1041;
        //   123: invokevirtual   net/minecraft/class_1041.method_4507:()I
        //   126: sipush          200
        //   129: isub           
        //   130: aload_0        
        //   131: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_11:I
        //   134: invokestatic    java/lang/Math.min:(II)I
        //   137: invokestatic    java/lang/Math.max:(II)I
        //   140: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.intValue_11:I
        //   143: goto            150
        //   146: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   149: athrow         
        //   150: iconst_1       
        //   151: ireturn        
        //   152: iload           5
        //   154: ifne            225
        //   157: aload_0        
        //   158: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_1:Z
        //   161: ifeq            185
        //   164: goto            171
        //   167: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   170: athrow         
        //   171: aload_0        
        //   172: dload_1        
        //   173: d2i            
        //   174: dload_3        
        //   175: d2i            
        //   176: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.setIntAndInt:(II)V
        //   179: iconst_1       
        //   180: ireturn        
        //   181: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   184: athrow         
        //   185: aload_0        
        //   186: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_2:Z
        //   189: ifeq            204
        //   192: aload_0        
        //   193: dload_3        
        //   194: d2i            
        //   195: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.setInt:(I)V
        //   198: iconst_1       
        //   199: ireturn        
        //   200: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   203: athrow         
        //   204: aload_0        
        //   205: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_3:Z
        //   208: ifeq            225
        //   211: bipush          125
        //   213: istore          10
        //   215: aload_0        
        //   216: dload_1        
        //   217: d2i            
        //   218: iload           10
        //   220: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.setIntAndInt_1:(II)V
        //   223: iconst_1       
        //   224: ireturn        
        //   225: iconst_0       
        //   226: ireturn        
        //    StackMapTable: 00 12 49 07 00 A4 03 4E 07 00 A4 03 5F 07 00 A4 03 4C 07 00 A4 03 7C 07 00 A4 03 01 4E 07 00 A4 03 49 07 00 A4 03 4E 07 00 A4 03 14
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      9      9      13     Ljava/lang/NumberFormatException;
        //  13     25     28     32     Ljava/lang/NumberFormatException;
        //  20     61     64     68     Ljava/lang/NumberFormatException;
        //  32     78     81     85     Ljava/lang/NumberFormatException;
        //  68     143    146    150    Ljava/lang/NumberFormatException;
        //  152    164    167    171    Ljava/lang/NumberFormatException;
        //  157    181    181    185    Ljava/lang/NumberFormatException;
        //  185    200    200    204    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    public boolean checkCondition_6(final double n, final double n2, final int n3) {
        try {
            if (this.coreD == null) {
                return false;
            }
        }
        catch (final NumberFormatException ex) {
            throw computeNumberformatexception(ex);
        }
        try {
            if (n3 == 0) {
                this.boolFlag = false;
                this.boolFlag_1 = false;
                this.boolFlag_2 = false;
                this.boolFlag_3 = false;
            }
        }
        catch (final NumberFormatException ex2) {
            throw computeNumberformatexception(ex2);
        }
        return false;
    }
    
    private void setIntAndInt(final int n, final int n2) {
        final int n3 = this.intValue_10 + 10;
        final int n4 = this.intValue_11 + 25 + 10;
        final float max = Math.max(0.0f, Math.min(1.0f, (n - n3) / 100.0f));
        final float max2 = Math.max(0.0f, Math.min(1.0f, 1.0f - (n2 - n4) / 100.0f));
        this.floatValue_1 = max;
        this.floatValue_2 = max2;
        this.execute_2();
        this.execute();
    }
    
    private void setInt(final int n) {
        this.floatValue = Math.max(0.0f, Math.min(1.0f, (n - (this.intValue_11 + 25 + 10)) / 100.0f));
        this.execute_2();
        this.execute();
    }
    
    private void setIntAndInt_1(final int n, final int n2) {
        this.floatValue_3 = Math.max(0.0f, Math.min(1.0f, (n - (this.intValue_10 + 10)) / (float)n2));
        this.execute_2();
        this.execute();
    }
    
    private void execute_2() {
        if (this.coreD != null) {
            final Color color = new Color(Color.HSBtoRGB(this.floatValue, this.floatValue_1, this.floatValue_2));
            this.coreD.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)(this.floatValue_3 * 255.0f)));
        }
    }
    
    public boolean checkCondition_2(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.coreD:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_4;
        //     4: ifnonnull       13
        //     7: iconst_0       
        //     8: ireturn        
        //     9: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    12: athrow         
        //    13: aload_0        
        //    14: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_4:Z
        //    17: ifeq            125
        //    20: aload_0        
        //    21: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //    24: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.isEnabled_1:()Z
        //    27: ifeq            125
        //    30: goto            37
        //    33: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    36: athrow         
        //    37: iload_1        
        //    38: sipush          256
        //    41: if_icmpne       73
        //    44: goto            51
        //    47: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    50: athrow         
        //    51: aload_0        
        //    52: iconst_0       
        //    53: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_4:Z
        //    56: aload_0        
        //    57: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //    60: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.execute_1:()V
        //    63: aload_0        
        //    64: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.execute:()V
        //    67: iconst_1       
        //    68: ireturn        
        //    69: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    72: athrow         
        //    73: iload_1        
        //    74: sipush          257
        //    77: if_icmpne       102
        //    80: aload_0        
        //    81: iconst_0       
        //    82: putfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_4:Z
        //    85: aload_0        
        //    86: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //    89: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.execute:()V
        //    92: aload_0        
        //    93: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.execute_1:()V
        //    96: iconst_1       
        //    97: ireturn        
        //    98: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   101: athrow         
        //   102: aload_0        
        //   103: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //   106: iload_1        
        //   107: iload_2        
        //   108: iload_3        
        //   109: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.checkCondition:(III)Z
        //   112: ifeq            125
        //   115: aload_0        
        //   116: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.execute_1:()V
        //   119: iconst_1       
        //   120: ireturn        
        //   121: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   124: athrow         
        //   125: iconst_0       
        //   126: ireturn        
        //    StackMapTable: 00 0C 49 07 00 A4 03 53 07 00 A4 03 49 07 00 A4 03 51 07 00 A4 03 58 07 00 A4 03 52 07 00 A4 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      9      9      13     Ljava/lang/NumberFormatException;
        //  13     30     33     37     Ljava/lang/NumberFormatException;
        //  20     44     47     51     Ljava/lang/NumberFormatException;
        //  37     69     69     73     Ljava/lang/NumberFormatException;
        //  73     98     98     102    Ljava/lang/NumberFormatException;
        //  102    121    121    125    Ljava/lang/NumberFormatException;
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
    
    public boolean checkCondition_3(final char p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.coreD:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_4;
        //     4: ifnull          38
        //     7: aload_0        
        //     8: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.boolFlag_4:Z
        //    11: ifeq            38
        //    14: goto            21
        //    17: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    20: athrow         
        //    21: aload_0        
        //    22: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //    25: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.isEnabled_1:()Z
        //    28: ifne            44
        //    31: goto            38
        //    34: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    37: athrow         
        //    38: iconst_0       
        //    39: ireturn        
        //    40: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    43: athrow         
        //    44: iload_1        
        //    45: invokestatic    java/lang/Character.toUpperCase:(C)C
        //    48: istore_3       
        //    49: iload_3        
        //    50: bipush          48
        //    52: if_icmplt       68
        //    55: iload_3        
        //    56: bipush          57
        //    58: if_icmple       94
        //    61: goto            68
        //    64: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    67: athrow         
        //    68: iload_3        
        //    69: bipush          65
        //    71: if_icmplt       142
        //    74: goto            81
        //    77: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    80: athrow         
        //    81: iload_3        
        //    82: bipush          70
        //    84: if_icmpgt       142
        //    87: goto            94
        //    90: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    93: athrow         
        //    94: aload_0        
        //    95: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //    98: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.getString_1:()Ljava/lang/String;
        //   101: astore          4
        //   103: aload           4
        //   105: invokevirtual   java/lang/String.length:()I
        //   108: bipush          8
        //   110: if_icmpge       142
        //   113: aload_0        
        //   114: getfield        com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.slotJ:Lcom/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8;
        //   117: iload_3        
        //   118: iload_2        
        //   119: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub4/Initializer_8.checkCondition_1:(CI)Z
        //   122: ifeq            142
        //   125: goto            132
        //   128: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   131: athrow         
        //   132: aload_0        
        //   133: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.execute_1:()V
        //   136: iconst_1       
        //   137: ireturn        
        //   138: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   141: athrow         
        //   142: iconst_0       
        //   143: ireturn        
        //    StackMapTable: 00 10 51 07 00 A4 03 4C 07 00 A4 03 41 07 00 A4 03 FF 00 13 00 04 07 00 02 01 01 01 00 01 07 00 A4 03 48 07 00 A4 03 48 07 00 A4 03 FF 00 21 00 05 07 00 02 01 01 01 07 00 CB 00 01 07 00 A4 03 45 07 00 A4 FA 00 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      14     17     21     Ljava/lang/NumberFormatException;
        //  7      31     34     38     Ljava/lang/NumberFormatException;
        //  21     40     40     44     Ljava/lang/NumberFormatException;
        //  49     61     64     68     Ljava/lang/NumberFormatException;
        //  55     74     77     81     Ljava/lang/NumberFormatException;
        //  68     87     90     94     Ljava/lang/NumberFormatException;
        //  103    125    128    132    Ljava/lang/NumberFormatException;
        //  113    138    138    142    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
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
    
    public boolean isEnabled() {
        try {
            if (this.coreD != null) {
                return true;
            }
        }
        catch (final NumberFormatException ex) {
            throw computeNumberformatexception(ex);
        }
        return false;
    }
    
    private boolean checkCondition_4(final double p0, final double p1, final int p2, final int p3, final int p4, final int p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload           5
        //     3: i2d            
        //     4: dcmpl          
        //     5: iflt            67
        //     8: dload_1        
        //     9: iload           5
        //    11: iload           7
        //    13: iadd           
        //    14: i2d            
        //    15: dcmpg          
        //    16: ifgt            67
        //    19: goto            26
        //    22: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    25: athrow         
        //    26: dload_3        
        //    27: iload           6
        //    29: i2d            
        //    30: dcmpl          
        //    31: iflt            67
        //    34: goto            41
        //    37: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    40: athrow         
        //    41: dload_3        
        //    42: iload           6
        //    44: iload           8
        //    46: iadd           
        //    47: i2d            
        //    48: dcmpg          
        //    49: ifgt            67
        //    52: goto            59
        //    55: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    58: athrow         
        //    59: iconst_1       
        //    60: goto            68
        //    63: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub2/Initializer_1.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    66: athrow         
        //    67: iconst_0       
        //    68: ireturn        
        //    StackMapTable: 00 09 56 07 00 A4 03 4A 07 00 A4 03 4D 07 00 A4 03 43 07 00 A4 03 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      19     22     26     Ljava/lang/NumberFormatException;
        //  8      34     37     41     Ljava/lang/NumberFormatException;
        //  26     52     55     59     Ljava/lang/NumberFormatException;
        //  41     63     63     67     Ljava/lang/NumberFormatException;
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
    
    private float method_float(final float n) {
        return 1.0f - (float)Math.pow(1.0f - n, 3.0);
    }
    
    private int getInt_1() {
        return 12;
    }
    
    public boolean checkCondition_5(final double n, final double n2, final double n3, final double n4) {
        try {
            if (this.coreD == null) {
                return false;
            }
        }
        catch (final NumberFormatException ex) {
            throw computeNumberformatexception(ex);
        }
        final int n5 = this.intValue_10 + 10;
        final int n6 = this.intValue_11 + 25 + 10;
        final int n7 = n6 + 100 + 10;
        final int n8 = n5;
        final int n9 = 125;
        Label_0099: {
            try {
                if (!this.checkCondition_4(n, n2, this.intValue_10, this.intValue_11, 180, 200)) {
                    return false;
                }
                final Initializer_1 initializer_1 = this;
                final double n10 = n;
                final double n11 = n2;
                final int n12 = n8;
                final int n13 = n7;
                final int n14 = n9;
                final int n15 = 15;
                final boolean b = initializer_1.checkCondition_4(n10, n11, n12, n13, n14, n15);
                if (b) {
                    break Label_0099;
                }
                break Label_0099;
            }
            catch (final NumberFormatException ex2) {
                throw computeNumberformatexception(ex2);
            }
            try {
                final Initializer_1 initializer_1 = this;
                final double n10 = n;
                final double n11 = n2;
                final int n12 = n8;
                final int n13 = n7;
                final int n14 = n9;
                final int n15 = 15;
                final boolean b = initializer_1.checkCondition_4(n10, n11, n12, n13, n14, n15);
                if (b) {
                    this.floatValue_3 -= (float)(n4 * 0.05000000074505806);
                    this.floatValue_3 = Math.max(0.0f, Math.min(1.0f, this.floatValue_3));
                    this.execute_2();
                    this.execute();
                    return true;
                }
            }
            catch (final NumberFormatException ex3) {
                throw computeNumberformatexception(ex3);
            }
        }
        if (this.checkCondition_4(n, n2, n5, n6, 100, 100)) {
            final float max = Math.max(0.0f, Math.min(1.0f, this.floatValue_1 + (float)(-n4) * 0.05f));
            final float max2 = Math.max(0.0f, Math.min(1.0f, this.floatValue_2 + (float)n4 * 0.05f));
            this.floatValue_1 = max;
            this.floatValue_2 = max2;
            this.execute_2();
            this.execute();
            return true;
        }
        try {
            if (this.checkCondition_4(n, n2, n5 + 100 + 10, n6, 15, 100)) {
                this.floatValue += (float)(n4 * 0.019999999552965164);
                this.floatValue = Math.max(0.0f, Math.min(1.0f, this.floatValue));
                this.execute_2();
                this.execute();
                return true;
            }
        }
        catch (final NumberFormatException ex4) {
            throw computeNumberformatexception(ex4);
        }
        return false;
    }
    
    private static NumberFormatException computeNumberformatexception(final NumberFormatException ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = "\u00841D\u009e\u0002\u0003id]0\u0094k\u0010\u00e4¥¼\u008f\u00df\u00e0\r;¹\u0097\u00d1\u0085\u0019\u0096\u00d9\u00f5").length();
        int char1 = 12;
        int index = -1;
        Label_0023: {
            break Label_0023;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 4);
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
                                case 0 -> 66;
                                case 1 -> 44;
                                case 2 -> 95;
                                case 3 -> 84;
                                case 4 -> 118;
                                case 5 -> 124;
                                default -> 15;
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
        final int n3 = (n ^ 0xFFFFF79D) & 0xFFFF;
        if (Initializer_1.strArr_1[n3] == null) {
            final char[] charArray = Initializer_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 178;
                case 1 -> 115;
                case 2 -> 132;
                case 3 -> 74;
                case 4 -> 247;
                case 5 -> 55;
                case 6 -> 163;
                case 7 -> 33;
                case 8 -> 5;
                case 9 -> 169;
                case 10 -> 116;
                case 11 -> 95;
                case 12 -> 160;
                case 13 -> 173;
                case 14 -> 94;
                case 15 -> 142;
                case 16 -> 26;
                case 17 -> 249;
                case 18 -> 25;
                case 19 -> 158;
                case 20 -> 8;
                case 21 -> 52;
                case 22 -> 238;
                case 23 -> 105;
                case 24 -> 87;
                case 25 -> 79;
                case 26 -> 227;
                case 27 -> 200;
                case 28 -> 67;
                case 29 -> 180;
                case 30 -> 127;
                case 31 -> 176;
                case 32 -> 150;
                case 33 -> 84;
                case 34 -> 149;
                case 35 -> 78;
                case 36 -> 138;
                case 37 -> 13;
                case 38 -> 34;
                case 39 -> 172;
                case 40 -> 255;
                case 41 -> 211;
                case 42 -> 112;
                case 43 -> 154;
                case 44 -> 62;
                case 45 -> 30;
                case 46 -> 63;
                case 47 -> 213;
                case 48 -> 97;
                case 49 -> 100;
                case 50 -> 221;
                case 51 -> 11;
                case 52 -> 99;
                case 53 -> 182;
                case 54 -> 235;
                case 55 -> 129;
                case 56 -> 190;
                case 57 -> 201;
                case 58 -> 20;
                case 59 -> 19;
                case 60 -> 197;
                case 61 -> 148;
                case 62 -> 223;
                case 63 -> 145;
                case 64 -> 36;
                case 65 -> 198;
                case 66 -> 71;
                case 67 -> 7;
                case 68 -> 131;
                case 69 -> 240;
                case 70 -> 56;
                case 71 -> 92;
                case 72 -> 58;
                case 73 -> 202;
                case 74 -> 237;
                case 75 -> 103;
                case 76 -> 2;
                case 77 -> 207;
                case 78 -> 124;
                case 79 -> 108;
                case 80 -> 70;
                case 81 -> 17;
                case 82 -> 229;
                case 83 -> 219;
                case 84 -> 243;
                case 85 -> 216;
                case 86 -> 65;
                case 87 -> 209;
                case 88 -> 21;
                case 89 -> 14;
                case 90 -> 179;
                case 91 -> 214;
                case 92 -> 246;
                case 93 -> 91;
                case 94 -> 161;
                case 95 -> 253;
                case 96 -> 220;
                case 97 -> 43;
                case 98 -> 175;
                case 99 -> 167;
                case 100 -> 185;
                case 101 -> 22;
                case 102 -> 106;
                case 103 -> 196;
                case 104 -> 41;
                case 105 -> 113;
                case 106 -> 45;
                case 107 -> 61;
                case 108 -> 46;
                case 109 -> 194;
                case 110 -> 125;
                case 111 -> 93;
                case 112 -> 82;
                case 113 -> 245;
                case 114 -> 77;
                case 115 -> 141;
                case 116 -> 60;
                case 117 -> 165;
                case 118 -> 16;
                case 119 -> 69;
                case 120 -> 47;
                case 121 -> 174;
                case 122 -> 139;
                case 123 -> 225;
                case 124 -> 44;
                case 125 -> 188;
                case 126 -> 121;
                case 127 -> 248;
                case 128 -> 114;
                case 129 -> 224;
                case 130 -> 29;
                case 131 -> 83;
                case 132 -> 199;
                case 133 -> 9;
                case 134 -> 35;
                case 135 -> 48;
                case 136 -> 80;
                case 137 -> 128;
                case 138 -> 177;
                case 139 -> 4;
                case 140 -> 230;
                case 141 -> 222;
                case 142 -> 53;
                case 143 -> 233;
                case 144 -> 210;
                case 145 -> 32;
                case 146 -> 120;
                case 147 -> 42;
                case 148 -> 134;
                case 149 -> 110;
                case 150 -> 86;
                case 151 -> 234;
                case 152 -> 153;
                case 153 -> 10;
                case 154 -> 57;
                case 155 -> 191;
                case 156 -> 204;
                case 157 -> 1;
                case 158 -> 252;
                case 159 -> 54;
                case 160 -> 231;
                case 161 -> 111;
                case 162 -> 181;
                case 163 -> 195;
                case 164 -> 130;
                case 165 -> 68;
                case 166 -> 170;
                case 167 -> 6;
                case 168 -> 40;
                case 169 -> 186;
                case 170 -> 251;
                case 171 -> 37;
                case 172 -> 107;
                case 173 -> 31;
                case 174 -> 27;
                case 175 -> 226;
                case 176 -> 98;
                case 177 -> 228;
                case 178 -> 85;
                case 179 -> 89;
                case 180 -> 75;
                case 181 -> 187;
                case 182 -> 76;
                case 183 -> 135;
                case 184 -> 208;
                case 185 -> 39;
                case 186 -> 49;
                case 187 -> 193;
                case 188 -> 206;
                case 189 -> 217;
                case 190 -> 218;
                case 191 -> 205;
                case 192 -> 244;
                case 193 -> 59;
                case 194 -> 12;
                case 195 -> 212;
                case 196 -> 90;
                case 197 -> 81;
                case 198 -> 72;
                case 199 -> 203;
                case 200 -> 73;
                case 201 -> 24;
                case 202 -> 232;
                case 203 -> 23;
                case 204 -> 18;
                case 205 -> 183;
                case 206 -> 122;
                case 207 -> 117;
                case 208 -> 189;
                case 209 -> 250;
                case 210 -> 146;
                case 211 -> 155;
                case 212 -> 168;
                case 213 -> 151;
                case 214 -> 137;
                case 215 -> 192;
                case 216 -> 144;
                case 217 -> 239;
                case 218 -> 109;
                case 219 -> 88;
                case 220 -> 64;
                case 221 -> 241;
                case 222 -> 162;
                case 223 -> 126;
                case 224 -> 242;
                case 225 -> 136;
                case 226 -> 157;
                case 227 -> 0;
                case 228 -> 184;
                case 229 -> 102;
                case 230 -> 28;
                case 231 -> 3;
                case 232 -> 118;
                case 233 -> 38;
                case 234 -> 123;
                case 235 -> 104;
                case 236 -> 156;
                case 237 -> 143;
                case 238 -> 236;
                case 239 -> 215;
                case 240 -> 101;
                case 241 -> 140;
                case 242 -> 119;
                case 243 -> 96;
                case 244 -> 15;
                case 245 -> 51;
                case 246 -> 133;
                case 247 -> 166;
                case 248 -> 66;
                case 249 -> 50;
                case 250 -> 171;
                case 251 -> 164;
                case 252 -> 147;
                case 253 -> 254;
                case 254 -> 152;
                default -> 159;
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
            Initializer_1.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_1.strArr_1[n3];
    }
}
