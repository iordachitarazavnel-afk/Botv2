// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_640;
import com.target.mod.compat.sub1.sub2.sub3.Initializer_2;
import org.joml.Vector4f;
import java.util.Objects;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_13;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import java.util.Iterator;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_332;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_9;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public class StepXImpl extends Initializer_3 implements PackDImpl_9
{
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_1 buildC;
    
    public StepXImpl() {
        super("nametags", Initializer_14.computeString(new int[] { 132, 202, 47, 99, 43, 44, 66, 5, 66, 33, 100, 105, 0, 71, 128, 255, 167, 146, 222, 129, 198, 189, 224, 239, 156, 195, 26 }), "Renders custom nametags above players", Initializer.RENDER);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 56, 30, 238, 251, 183, 234, 200, 217, 175, 186, 177 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 56, 30, 238, 251, 183, 230, 196, 203, 183, 175, 183, 135, 138 }), true);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 56, 30, 238, 251, 183, 242, 196, 214, 164 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 35, 19, 224, 224, 227, 202, 141, 250, 162, 188 }), true);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 35, 31, 230, 228, 251, 203, 202, 208, 183, 238, 159, 150, 134, 159, 107, 116, 104 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 42, 92, 198, 218, 255, 207, 238, 208, 190 }), 0.0, 3.0, 0.5, 0.1);
        this.setSyncaarr(this.parseB, this.parseB_1, this.parseB_2, this.parseB_3, this.parseB_4, this.buildC);
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
        if (StepXImpl.class310.field_1724 == null || StepXImpl.class310.field_1687 == null) {
            return;
        }
        for (final class_1657 class_333 : StepXImpl.class310.field_1687.method_18456()) {
            if (class_333 == StepXImpl.class310.field_1724) {
                continue;
            }
            if (class_333.method_5858((class_1297)StepXImpl.class310.field_1724) > 4096.0) {
                continue;
            }
            this.processAll(class_332, class_333, n);
        }
    }
    
    private void processAll(final class_332 class_332, final class_1657 class_333, final float n) {
        final Vector4f computeVector4f = Initializer_13.computeVector4f(new class_243(class_3532.method_16436((double)n, class_333.field_6038, class_333.method_23317()), class_3532.method_16436((double)n, class_333.field_5971, class_333.method_23318()) + class_333.method_17682() + this.buildC.getDouble(), class_3532.method_16436((double)n, class_333.field_5989, class_333.method_23321())));
        Label_0105: {
            try {
                if (computeVector4f == null) {
                    return;
                }
                final Vector4f vector4f = computeVector4f;
                final boolean b = Initializer_13.checkVector4f(vector4f);
                if (!b) {
                    return;
                }
                break Label_0105;
            }
            catch (final Exception ex) {
                throw computeException(ex);
            }
            try {
                final Vector4f vector4f = computeVector4f;
                final boolean b = Initializer_13.checkVector4f(vector4f);
                if (!b) {
                    return;
                }
            }
            catch (final Exception ex2) {
                throw computeException(ex2);
            }
        }
        final int n2 = (int)computeVector4f.floatValue_1;
        final int n3 = (int)computeVector4f.floatValue_2;
        final String string = class_333.method_5477().getString();
        final float f = class_333.method_6032() + class_333.method_6067();
        final float method_15363 = class_3532.method_15363(f / class_333.method_6063(), 0.0f, 1.0f);
        int n4 = -1;
        boolean b2 = false;
        if (this.parseB_4.getBoolean()) {
            try {
                Label_0230: {
                    Label_0202: {
                        try {
                            if (ClientModInitializerImpl.sortB == null) {
                                break Label_0230;
                            }
                            final ClientModInitializerImpl clientModInitializerImpl = ClientModInitializerImpl.sortB;
                            final Initializer_2 initializer_2 = clientModInitializerImpl.getWrapb();
                            if (initializer_2 != null) {
                                break Label_0202;
                            }
                            break Label_0230;
                        }
                        catch (final Exception ex3) {
                            throw computeException(ex3);
                        }
                        try {
                            final ClientModInitializerImpl clientModInitializerImpl = ClientModInitializerImpl.sortB;
                            final Initializer_2 initializer_2 = clientModInitializerImpl.getWrapb();
                            if (initializer_2 == null) {
                                break Label_0230;
                            }
                            if (!ClientModInitializerImpl.sortB.getWrapb().checkClass_1657(class_333)) {
                                break Label_0230;
                            }
                        }
                        catch (final Exception ex4) {
                            throw computeException(ex4);
                        }
                    }
                    n4 = -16718337;
                    b2 = true;
                }
            }
            catch (final Exception ex5) {}
        }
        final int method_int = this.method_int(method_15363);
        int method_15364;
        final int n5 = method_15364 = StepXImpl.class310.field_1772.method_1727(string);
        String format = null;
        if (this.parseB.getBoolean()) {
            format = String.format(" %.1f", f);
            method_15364 += StepXImpl.class310.field_1772.method_1727(format);
        }
        String s = null;
        if (this.parseB_1.getBoolean()) {
            s = " " + (int)Math.sqrt(class_333.method_5858((class_1297)StepXImpl.class310.field_1724));
            method_15364 += StepXImpl.class310.field_1772.method_1727(s);
        }
        String s2 = null;
        if (this.parseB_2.getBoolean()) {
            try {
                final class_640 method_15365 = StepXImpl.class310.method_1562().method_2871(class_333.method_5667());
                if (method_15365 != null) {
                    s2 = " " + method_15365.method_2959() + "ms";
                    method_15364 += StepXImpl.class310.field_1772.method_1727(s2);
                }
            }
            catch (final Exception ex6) {}
        }
        Objects.requireNonNull(StepXImpl.class310.field_1772);
        final int n6 = 9;
        final int n7 = 5;
        final int n8 = 3;
        int n9 = 0;
        Label_0480: {
            try {
                if (this.parseB_3.getBoolean()) {
                    n9 = 2;
                    break Label_0480;
                }
            }
            catch (final Exception ex7) {
                throw computeException(ex7);
            }
            n9 = 0;
        }
        final int n10 = n9;
        int n11 = 0;
        Label_0504: {
            try {
                if (this.parseB_3.getBoolean()) {
                    n11 = 2;
                    break Label_0504;
                }
            }
            catch (final Exception ex8) {
                throw computeException(ex8);
            }
            n11 = 0;
        }
        final int n12 = n11;
        final int n13 = method_15364 + n7 * 2;
        final int n14 = n6 + n8 * 2 + n10 + n12;
        final int n15 = n2 - n13 / 2;
        final int n16 = n3 - n14;
        try {
            class_332.method_25294(n15, n16, n15 + n13, n16 + n14, -871296734);
            if (b2) {
                class_332.method_25294(n15, n16, n15 + 2, n16 + n14, -16718337);
            }
        }
        catch (final Exception ex9) {
            throw computeException(ex9);
        }
        class_332.method_25294(n15, n16, n15 + n13, n16 + 1, 872415231);
        final int n17 = n16 + n8;
        final int n18 = n2 - method_15364 / 2;
        class_332.method_51433(StepXImpl.class310.field_1772, string, n18, n17, n4, true);
        int n19 = n18 + n5;
        if (format != null) {
            class_332.method_51433(StepXImpl.class310.field_1772, format, n19, n17, method_int, true);
            n19 += StepXImpl.class310.field_1772.method_1727(format);
        }
        if (s != null) {
            class_332.method_51433(StepXImpl.class310.field_1772, s, n19, n17, -7829351, true);
            n19 += StepXImpl.class310.field_1772.method_1727(s);
        }
        if (s2 != null) {
            class_332.method_51433(StepXImpl.class310.field_1772, s2, n19, n17, this.method_int_1(s2), true);
        }
        if (this.parseB_3.getBoolean()) {
            final int n20 = n17 + n6 + 1;
            final int n21 = n13 - n7 * 2;
            final int n22 = n15 + n7;
            class_332.method_25294(n22, n20, n22 + n21, n20 + n10, -14540230);
            final int n23 = (int)(n21 * method_15363);
            try {
                if (n23 > 0) {
                    class_332.method_25294(n22, n20, n22 + n23, n20 + n10, method_int);
                }
            }
            catch (final Exception ex10) {
                throw computeException(ex10);
            }
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
    
    private int method_int_1(final String s) {
        try {
            final int int1 = Integer.parseInt(s.replace("ms", "").trim());
            if (int1 < 80) {
                return -16718218;
            }
            if (int1 < 150) {
                return -21760;
            }
            return -59580;
        }
        catch (final Exception ex) {
            return -7829351;
        }
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
