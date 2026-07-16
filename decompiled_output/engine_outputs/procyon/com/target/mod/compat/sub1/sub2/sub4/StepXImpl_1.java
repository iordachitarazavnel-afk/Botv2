// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import org.joml.Vector4f;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_13;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import java.util.Iterator;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1297;
import net.minecraft.class_332;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_9;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public class StepXImpl_1 extends Initializer_3 implements PackDImpl_9
{
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_5 parseB_5;
    private final SyncASub_5 parseB_6;
    private final SyncASub_1 buildC;
    
    public StepXImpl_1() {
        super("esp", Initializer_14.computeString(new int[] { 46, 37, 209 }), "Renders entities through walls", Initializer.RENDER);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 59, 26, 224, 245, 242, 208, 222 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 34, 2, 228, 225, 228 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 63, 4, 224, 239, 242, 208, 222 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 35, 19, 224, 224, 227, 202, 141, 250, 162, 188 }), true);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 47, 31, 242, 248, 246, 204, 206, 221 }), true);
        this.parseB_5 = new SyncASub_5(Initializer_14.computeString(new int[] { 40, 25, 243, 226, 242, 208, 141, 250, 172, 182 }), true);
        this.parseB_6 = new SyncASub_5(Initializer_14.computeString(new int[] { 35, 31, 230, 228, 251, 203, 202, 208, 183, 238, 159, 150, 134, 159, 107, 116, 104 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 41, 25, 249, 172, 214, 206, 221, 208, 162 }), 0.0, 1.0, 0.15, 0.05);
        this.setSyncaarr(this.parseB, this.parseB_1, this.parseB_2, this.parseB_5, this.parseB_3, this.parseB_4, this.parseB_6, this.buildC);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_9.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_9.class, this);
        super.execute_1();
    }
    
    @Override
    public void setClass_332AndFloat(final class_332 class_332, final float n) {
        if (StepXImpl_1.class310.field_1724 == null || StepXImpl_1.class310.field_1687 == null) {
            return;
        }
        for (final class_1297 class_333 : StepXImpl_1.class310.field_1687.method_18112()) {
            if (class_333 == StepXImpl_1.class310.field_1724) {
                continue;
            }
            if (class_333.method_5858((class_1297)StepXImpl_1.class310.field_1724) > 16384.0) {
                continue;
            }
            if (this.parseB.getBoolean() && class_333 instanceof class_1657) {
                this.processAll(class_332, (class_1657)class_333, n);
            }
            if (!this.parseB_1.getBoolean() || !(class_333 instanceof class_1542)) {
                continue;
            }
            this.processAll_1(class_332, (class_1542)class_333, n);
        }
    }
    
    private void processAll(final class_332 class_332, final class_1657 class_333, final float n) {
        final double method_16436 = class_3532.method_16436((double)n, class_333.field_6038, class_333.method_23317());
        final double method_16437 = class_3532.method_16436((double)n, class_333.field_5971, class_333.method_23318());
        final double method_16438 = class_3532.method_16436((double)n, class_333.field_5989, class_333.method_23321());
        final double n2 = class_333.method_17681() / 2.0;
        final double n3 = class_333.method_17682();
        final class_243[] array = { new class_243(method_16436 - n2, method_16437, method_16438 - n2), new class_243(method_16436 + n2, method_16437, method_16438 - n2), new class_243(method_16436 + n2, method_16437, method_16438 + n2), new class_243(method_16436 - n2, method_16437, method_16438 + n2), new class_243(method_16436 - n2, method_16437 + n3, method_16438 - n2), new class_243(method_16436 + n2, method_16437 + n3, method_16438 - n2), new class_243(method_16436 + n2, method_16437 + n3, method_16438 + n2), new class_243(method_16436 - n2, method_16437 + n3, method_16438 + n2) };
        float min = Float.MAX_VALUE;
        float min2 = Float.MAX_VALUE;
        float max = -3.4028235E38f;
        float max2 = -3.4028235E38f;
        boolean b = true;
        final class_243[] array2 = array;
        for (int length = array2.length, i = 0; i < length; ++i) {
            final Vector4f computeVector4f = Initializer_13.computeVector4f(array2[i]);
            if (computeVector4f == null) {
                b = false;
                break;
            }
            min = Math.min(min, computeVector4f.floatValue_1);
            min2 = Math.min(min2, computeVector4f.floatValue_2);
            max = Math.max(max, computeVector4f.floatValue_1);
            max2 = Math.max(max2, computeVector4f.floatValue_2);
        }
        try {
            if (!b) {
                return;
            }
        }
        catch (final Exception ex) {
            throw computeException(ex);
        }
        final int n4 = (int)min;
        final int n5 = (int)min2;
        final int n6 = (int)max;
        final int n7 = (int)max2;
        final int n8 = n6 - n4;
        final int n9 = n7 - n5;
        Label_0445: {
            try {
                if (n8 < 2) {
                    return;
                }
                final int n10 = n9;
                final int n11 = 2;
                if (n10 < n11) {
                    return;
                }
                break Label_0445;
            }
            catch (final Exception ex2) {
                throw computeException(ex2);
            }
            try {
                final int n10 = n9;
                final int n11 = 2;
                if (n10 < n11) {
                    return;
                }
            }
            catch (final Exception ex3) {
                throw computeException(ex3);
            }
        }
        int n12 = -1;
        boolean b2 = false;
        if (this.parseB_6.getBoolean()) {
            try {
                Label_0500: {
                    try {
                        if (ClientModInitializerImpl.sortB.getWrapb() == null || !ClientModInitializerImpl.sortB.getWrapb().checkClass_1657(class_333)) {
                            break Label_0500;
                        }
                    }
                    catch (final Exception ex4) {
                        throw computeException(ex4);
                    }
                    n12 = -16718337;
                    b2 = true;
                }
            }
            catch (final Exception ex5) {}
        }
        class_332.method_25294(n4, n5, n6, n7, (int)(this.buildC.getDouble() * 255.0) << 24 | (n12 & 0xFFFFFF));
        final int n13 = n12;
        final int n14 = -2013265920;
        if (this.parseB_5.getBoolean()) {
            final int max3 = Math.max(4, Math.min(n8 / 3, n9 / 3));
            this.processAll_2(class_332, n4 - 1, n5 - 1, n6 + 1, n7 + 1, max3 + 1, n14);
            this.processAll_2(class_332, n4, n5, n6, n7, max3, n13);
        }
        else {
            this.processAll_3(class_332, n4 - 1, n5 - 1, n6 + 1, n7 + 1, n14);
            this.processAll_3(class_332, n4, n5, n6, n7, n13);
        }
        if (this.parseB_3.getBoolean()) {
            final float method_16439 = class_3532.method_15363((class_333.method_6032() + class_333.method_6067()) / class_333.method_6063(), 0.0f, 1.0f);
            final int n15 = n4 - 4;
            final int n16 = 2;
            final int n17 = (int)(n9 * method_16439);
            class_332.method_25294(n15 - 1, n5 - 1, n15 + n16 + 1, n7 + 1, -2013265920);
            class_332.method_25294(n15, n5, n15 + n16, n7, -15066578);
            final int method_int = this.method_int(method_16439);
            try {
                class_332.method_25294(n15, n7 - n17, n15 + n16, n7, method_int);
                if (n17 > 0) {
                    class_332.method_25294(n15, n7 - n17, n15 + n16, n7 - n17 + 1, this.method_int_1(method_int, 60));
                }
            }
            catch (final Exception ex6) {
                throw computeException(ex6);
            }
        }
        if (this.parseB_4.getBoolean()) {
            final String s = "" + (int)Math.sqrt(class_333.method_5858((class_1297)StepXImpl_1.class310.field_1724));
            class_332.method_51433(StepXImpl_1.class310.field_1772, s, n4 + (n8 - StepXImpl_1.class310.field_1772.method_1727(s)) / 2, n7 + 2, -5588020, true);
        }
        if (this.parseB_2.getBoolean()) {
            final int n18 = StepXImpl_1.class310.method_22683().method_4486() / 2;
            final int n19 = StepXImpl_1.class310.method_22683().method_4502() / 2;
            final int n20 = n4 + n8 / 2;
            final int n21 = n5;
            int n22 = 0;
            Label_1012: {
                try {
                    if (b2) {
                        n22 = -2013207041;
                        break Label_1012;
                    }
                }
                catch (final Exception ex7) {
                    throw computeException(ex7);
                }
                n22 = -1996488705;
            }
            this.processAll_4(class_332, n18, n19, n20, n21, n22);
        }
    }
    
    private void processAll_1(final class_332 class_332, final class_1542 class_333, final float n) {
        final double method_16436 = class_3532.method_16436((double)n, class_333.field_6038, class_333.method_23317());
        final double method_16437 = class_3532.method_16436((double)n, class_333.field_5971, class_333.method_23318());
        final double method_16438 = class_3532.method_16436((double)n, class_333.field_5989, class_333.method_23321());
        final double n2 = class_333.method_17681() / 2.0;
        final double n3 = class_333.method_17682();
        final class_243 class_334 = new class_243(method_16436, method_16437, method_16438);
        final class_243 class_335 = new class_243(method_16436, method_16437 + n3, method_16438);
        final Vector4f computeVector4f = Initializer_13.computeVector4f(class_334);
        final Vector4f computeVector4f2 = Initializer_13.computeVector4f(class_335);
        if (computeVector4f == null || computeVector4f2 == null) {
            return;
        }
        final int max = Math.max(4, (int)Math.abs(computeVector4f.floatValue_2 - computeVector4f2.floatValue_2));
        final int n4 = (int)((computeVector4f.floatValue_1 + computeVector4f2.floatValue_1) / 2.0f);
        final int n5 = (int)((computeVector4f.floatValue_2 + computeVector4f2.floatValue_2) / 2.0f);
        final int n6 = n4 - max / 2;
        final int n7 = n5 - max / 2;
        final int n8 = n4 + max / 2;
        final int n9 = n5 + max / 2;
        final int n10 = -10496;
        class_332.method_25294(n6, n7, n8, n9, (int)(this.buildC.getDouble() * 255.0) << 24 | (n10 & 0xFFFFFF));
        this.processAll_2(class_332, n6, n7, n8, n9, Math.max(2, max / 3), n10);
        if (this.parseB_2.getBoolean()) {
            this.processAll_4(class_332, StepXImpl_1.class310.method_22683().method_4486() / 2, StepXImpl_1.class310.method_22683().method_4502() / 2, n4, n5, -1996499200);
        }
    }
    
    private void processAll_2(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        class_332.method_25294(n, n2, n + n5, n2 + 1, n6);
        class_332.method_25294(n, n2, n + 1, n2 + n5, n6);
        class_332.method_25294(n3 - n5, n2, n3, n2 + 1, n6);
        class_332.method_25294(n3 - 1, n2, n3, n2 + n5, n6);
        class_332.method_25294(n, n4 - 1, n + n5, n4, n6);
        class_332.method_25294(n, n4 - n5, n + 1, n4, n6);
        class_332.method_25294(n3 - n5, n4 - 1, n3, n4, n6);
        class_332.method_25294(n3 - 1, n4 - n5, n3, n4, n6);
    }
    
    private void processAll_3(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        class_332.method_25294(n, n2, n3, n2 + 1, n5);
        class_332.method_25294(n, n4 - 1, n3, n4, n5);
        class_332.method_25294(n, n2, n + 1, n4, n5);
        class_332.method_25294(n3 - 1, n2, n3, n4, n5);
    }
    
    private void processAll_4(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = n3 - n;
        final int n7 = n4 - n2;
        final double sqrt = Math.sqrt(n6 * n6 + n7 * n7);
        if (sqrt < 1.0) {
            return;
        }
        int min = Math.min((int)(sqrt / 4.0), 200);
        if (min < 2) {
            min = 2;
        }
        for (int i = 0; i < min; ++i) {
            final float n8 = i / (float)min;
            final float n9 = (i + 1) / (float)min;
            final int n10 = (int)(n + n6 * n8);
            final int n11 = (int)(n2 + n7 * n8);
            final int n12 = (int)(n + n6 * n9);
            final int n13 = (int)(n2 + n7 * n9);
            class_332.method_25294(Math.min(n10, n12), Math.min(n11, n13), Math.max(n10, n12) + 1, Math.max(n11, n13) + 1, n5);
        }
    }
    
    private int method_int(final float n) {
        if (n > 0.6f) {
            return -16718218;
        }
        if (n > 0.3f) {
            return -21760;
        }
        return -59580;
    }
    
    private int method_int_1(final int n, final int n2) {
        return (n >> 24 & 0xFF) << 24 | Math.min(255, (n >> 16 & 0xFF) + n2) << 16 | Math.min(255, (n >> 8 & 0xFF) + n2) << 8 | Math.min(255, (n & 0xFF) + n2);
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
