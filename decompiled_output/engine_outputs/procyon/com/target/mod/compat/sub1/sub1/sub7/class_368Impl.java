// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import net.minecraft.class_10799;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_1113;
import net.minecraft.class_1109;
import net.minecraft.class_3417;
import net.minecraft.class_374;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_368$class_369;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_368;

public class class_368Impl implements class_368
{
    private static final class_2960 class2960;
    private static final int intValue = 5000;
    private final class_1799 class1799;
    private final String strValue;
    private final String strValue_1;
    private final boolean boolFlag;
    private boolean boolFlag_1;
    private long longValue;
    private class_368$class_369 class368class369;
    
    public class_368Impl(final class_1935 class_1935, final String strValue, final String strValue_1, final boolean boolFlag) {
        this.longValue = -1L;
        this.class368class369 = class_368$class_369.field_2210;
        this.class1799 = new class_1799(class_1935);
        this.strValue = strValue;
        this.strValue_1 = strValue_1;
        this.boolFlag = boolFlag;
    }
    
    public class_368Impl(final String s, final String s2, final boolean b) {
        this((class_1935)class_1802.field_8106, s, s2, b);
    }
    
    public class_368$class_369 method_61988() {
        return this.class368class369;
    }
    
    public void method_61989(final class_374 class_374, final long longValue) {
        final int int1 = Initializer_21.getInt();
        boolean boolFlag_1;
        final long n = (boolFlag_1 = lcmp(this.longValue, -1L)) ? 1 : 0;
        if (int1 == 0) {
            if (n == 0) {
                this.longValue = longValue;
            }
            final boolean boolFlag;
            boolFlag_1 = (boolFlag = this.boolFlag);
        }
        Label_0073: {
            class_368Impl class_368Impl = null;
            Label_0069: {
                if (int1 == 0) {
                    if (n == 0) {
                        break Label_0073;
                    }
                    class_368Impl = this;
                    if (int1 != 0) {
                        break Label_0069;
                    }
                    boolFlag_1 = this.boolFlag_1;
                }
                if (boolFlag_1) {
                    break Label_0073;
                }
                class_374.method_1995().method_1483().method_4873((class_1113)class_1109.method_4758(class_3417.field_14627, 1.0f));
                class_368Impl = this;
            }
            class_368Impl.boolFlag_1 = true;
        }
        if (longValue - this.longValue >= 5000.0 * class_374.method_48221()) {
            this.class368class369 = class_368$class_369.field_2209;
        }
    }
    
    public void method_1986(final class_332 class_332, final class_327 class_333, final long n) {
        class_332.method_52706(class_10799.field_56883, class_368Impl.class2960, 0, 0, this.method_29049(), this.method_29050());
        class_332.method_51433(class_333, this.strValue, 30, 7, -256, false);
        class_332.method_51433(class_333, this.strValue_1, 30, 18, -1, false);
        class_332.method_51445(this.class1799, 8, 8);
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 22);
        final char[] charArray = "\u0003px4\r\u0015\u0016\u0013ix)\u001a_\u001a\u0012qm".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0128: {
                if (length > 1) {
                    break Label_0128;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 97;
                        case 1 -> 9;
                        case 2 -> 15;
                        case 3 -> 81;
                        case 4 -> 111;
                        case 5 -> 44;
                        default -> 97;
                    }));
                    ++n4;
                } while (n == 0);
            }
            if (length <= n4) {
                class2960 = class_2960.method_60656(new String(charArray).intern());
                return;
            }
            continue;
        }
    }
}
