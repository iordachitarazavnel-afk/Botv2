// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import java.util.LinkedHashSet;
import java.util.Iterator;
import org.lwjgl.glfw.GLFW;
import net.minecraft.class_239;
import net.minecraft.class_1268;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1802;
import net.minecraft.class_3965;
import net.minecraft.class_1657;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_12;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_8;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_6 extends Initializer_3 implements PackDImpl_5, PackDImpl_8
{
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_5 parseB_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_1 buildC_3;
    private final SyncASub_1 buildC_4;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_5 parseB_5;
    private final com.target.mod.compat.sub1.sub2.sub7.Initializer_1 buffT;
    private class_2338 class2338;
    
    public DataNImpl_6() {
        super("auto_web", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 255, 167, 145, 222, 129, 194, 189, 224, 234 }), Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 222, 129, 212, 114, 178, 212, 196, 145, 52, 17, 112, 23, 55, 47, 118, 69, 193, 3, 75, 173, 226, 165, 173, 14, 214, 248, 234, 181, 216, 254, 148, 59, 20, 115, 26, 63, 82, 117, 90, 49, 84, 113, 16, 183, 134 }), Initializer.cacheE_2);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 74, 33, 100, 104, 0, 71, 128, 255, 166, 168, 222, 129, 211, 114, 178, 212, 193, 145, 52, 27, 112, 23, 33, 47, 118, 87, 14, 81, 99, 237, 176, 145, 204, 147, 182, 171, 242, 212, 138, 205, 232 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 41, 99, 43, 44, 66, 5, 76, 33, 100, 118, 0, 71, 140, 255, 166, 188, 222, 129, 200, 189, 224, 230, 156, 195, 29, 123, 34, 43, 90, 125, 71, 246, 14, 80, 86, 237, 176, 145, 204, 147, 180, 100, 160, 230, 214, 159, 198, 22, 126, 33, 34, 93, 0, 77, 60, 99, 109 }), 0.0, 100.0, 30.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 55, 99, 43, 44, 66, 5, 70, 33, 100, 118, 0, 71, 145, 255, 166, 175, 222, 129, 196, 189, 224, 233, 156, 195, 5, 180, 112, 22, 20, 47, 118, 95, 14, 81, 122, 34, 226, 164, 144, 193, 132, 212, 160, 231, 224, 159, 198, 3, 126, 33, 35 }), 0.0, 100.0, 30.0, 1.0);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 40, 99, 43, 44, 66, 5, 77, 33, 100, 103, 0, 71, 137, 255, 166, 179, 222, 129, 195, 189, 224, 237, 83, 145, 53, 60, 112, 23, 48, 47, 118, 87, 14, 81, 115 }), false);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 130, 255, 166, 163 }), 0.0, 12.0, 3.5, 0.1);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 70, 33, 100, 102, 207, 21, 185, 180, 244, 155, 180, 211, 250, 222, 178, 213, 242, 145, 52, 13 }), 0.0, 100.0, 10.0, 1.0);
        this.buildC_4 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 39, 99, 43, 44, 66, 4, 108, 33, 101, 82 }), 0.0, 360.0, 90.0, 5.0);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 41, 99, 43, 44, 66, 5, 76, 33, 100, 104, 0, 71, 129, 255, 166, 175, 222, 129, 201, 189, 224, 239, 83, 145, 53, 35, 112, 23, 48, 47, 118, 84 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 79, 33, 100, 109, 0, 71, 134, 255, 166, 173, 222, 129, 206, 189, 224, 230, 156, 195, 14 }), false);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 132, 255, 166, 173, 17, 211, 251, 240, 178, 213, 255, 145, 52, 27, 112, 23, 54, 47, 118, 93, 14, 81, 100 }), false);
        this.parseB_5 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 47, 99, 43, 44, 66, 5, 76, 33, 100, 112, 207, 21, 185, 167, 244, 155, 185, 211, 250, 215, 178, 213, 253, 94, 102, 40, 62, 69, 8, 70, 36, 107, 103, 3, 74, 135, 226, 165, 160, 193, 132, 208, 160, 231, 246, 80, 148, 58, 33, 115, 26, 62, 82, 117, 82, 49, 84, 109, 16, 183, 144, 207, 150, 164 }), true);
        this.buffT = new com.target.mod.compat.sub1.sub2.sub7.Initializer_1();
        this.setSyncaarr(this.parseB, this.buildC, this.buildC_1, this.parseB_1, this.buildC_2, this.buildC_3, this.buildC_4, this.parseB_2, this.parseB_3, this.parseB_4, this.parseB_5);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_8.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_8.class, this);
        super.execute_1();
    }
    
    @Override
    public void setWrapl(final BindCSub_12 bindCSub_12) {
        if (DataNImpl_6.class310.field_1724 == null || DataNImpl_6.class310.field_1687 == null) {
            return;
        }
        final class_1657 class_1657 = this.getClass_1657();
        if (class_1657 == null) {
            this.class2338 = null;
            return;
        }
        final class_243 class_1658 = this.createClass_243(class_1657, true);
        final class_243 class_1659 = this.createClass_243(class_1657, false);
        boolean b = false;
        if (class_1658 == null && class_1659 == null) {
            b = true;
        }
        if (class_1657.method_5739((class_1297)DataNImpl_6.class310.field_1724) > this.buildC_2.getDouble() || class_1657.method_5739((class_1297)DataNImpl_6.class310.field_1724) < 1.0) {
            b = true;
        }
        if (Math.acos(new class_243(class_1657.method_23317(), class_1657.method_23318(), class_1657.method_23321()).method_1031(0.0, (double)class_1657.method_5751(), 0.0).method_1020(DataNImpl_6.class310.field_1724.method_33571()).method_1029().method_1026(DataNImpl_6.class310.field_1724.method_5828(1.0f))) * 180.0 / 3.141592653589793 >= this.buildC_4.getDouble() / 2.0) {
            b = true;
        }
        if (this.parseB_5.getBoolean()) {
            if (class_1658 != null && DataNImpl_6.class310.field_1724.method_5829().method_994(new class_238(class_1658.field_1352 - 0.5, class_1658.field_1351, class_1658.field_1350 - 0.5, class_1658.field_1352 + 0.5, class_1658.field_1351 + 1.0, class_1658.field_1350 + 0.5))) {
                b = true;
            }
            if (this.parseB_1.getBoolean() && class_1659 != null && DataNImpl_6.class310.field_1724.method_5829().method_994(new class_238(class_1659.field_1352 - 0.5, class_1659.field_1351, class_1659.field_1350 - 0.5, class_1659.field_1352 + 0.5, class_1659.field_1351 + 1.0, class_1659.field_1350 + 0.5))) {
                b = true;
            }
        }
        if (!this.buffT.checkDouble(this.buildC_3.getInt() * 50.0)) {
            b = true;
        }
        if (this.isEnabled()) {
            b = true;
        }
        if (b) {
            if (ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.getLinkv() != null) {
                ClientModInitializerImpl.sortB.getLinkv().setDoubleAndDouble(DataNImpl_6.class310.field_1724.method_36454(), DataNImpl_6.class310.field_1724.method_36455());
            }
            return;
        }
        if (class_1658 != null && !b) {
            final class_243 class_1660 = (class_1659 != null && this.parseB_1.getBoolean()) ? class_1659 : class_1658;
            final class_2338 method_10074 = class_2338.method_49638((class_2374)class_1660).method_10074();
            if (DataNImpl_6.class310.field_1687.method_8320(method_10074.method_10084()).method_45474()) {
                final float[] floatarr = this.createFloatarr(class_1660.method_1031(0.0, 1.5, 0.0), class_2350.field_11036, class_1657);
                if (floatarr != null && this.parseB.getBoolean() && ClientModInitializerImpl.sortB != null && ClientModInitializerImpl.sortB.getLinkv() != null) {
                    ClientModInitializerImpl.sortB.getLinkv().setDoubleAndDouble(floatarr[0], floatarr[1]);
                }
                this.class2338 = method_10074;
            }
        }
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_6.class310.field_1724 == null || DataNImpl_6.class310.field_1687 == null) {
            return;
        }
        if (this.class2338 != null && DataNImpl_6.class310.field_1724.field_6012 % 2 != 0) {
            final class_239 field_1765 = DataNImpl_6.class310.field_1765;
            if (field_1765 instanceof final class_3965 class_3965) {
                if (this.buffT.checkDouble(this.buildC_3.getInt() * 50.0) && class_3965.method_17777().equals((Object)this.class2338) && class_3965.method_17780() == class_2350.field_11036 && Initializer_10.checkClass_1792(class_1802.field_8786)) {
                    DataNImpl_6.class310.field_1761.method_2896(DataNImpl_6.class310.field_1724, class_1268.field_5808, class_3965);
                    this.buffT.execute();
                }
            }
        }
    }
    
    private boolean isEnabled() {
        return (this.parseB_2.getBoolean() && DataNImpl_6.class310.field_1724.method_6047().method_7909() != class_1802.field_8786) || (this.parseB_3.getBoolean() && GLFW.glfwGetMouseButton(DataNImpl_6.class310.method_22683().method_4490(), 1) != 1) || (this.parseB_4.getBoolean() && DataNImpl_6.class310.field_1761.method_2923());
    }
    
    private class_1657 getClass_1657() {
        if (ClientModInitializerImpl.sortB == null || ClientModInitializerImpl.sortB.getWrapb() == null) {
            return null;
        }
        for (final class_1657 class_1657 : DataNImpl_6.class310.field_1687.method_18456()) {
            if (class_1657 != DataNImpl_6.class310.field_1724 && !class_1657.method_29504() && !ClientModInitializerImpl.sortB.getWrapb().checkClass_1657(class_1657)) {
                return class_1657;
            }
        }
        return null;
    }
    
    public class_243 createClass_243(final class_1657 class_1657, final boolean b) {
        final class_243 class_1658 = new class_243(class_1657.method_23317(), class_1657.method_23318(), class_1657.method_23321());
        final class_243 method_1031 = new class_243(class_1657.method_23317(), class_1657.method_23318(), class_1657.method_23321()).method_1031(0.0, (double)class_1657.method_5751(), 0.0);
        final LinkedHashSet set = new LinkedHashSet();
        final LinkedHashSet set2 = new LinkedHashSet();
        final class_238 method_1032 = class_1657.method_5829();
        for (float n = -5.0f; n <= 5.0f; ++n) {
            for (float n2 = -5.0f; n2 <= 5.0f; ++n2) {
                final float n3 = (float)((method_1032.field_1320 - method_1032.field_1323) / 2.0);
                final class_2338 method_1033 = class_2338.method_49638((class_2374)new class_243(class_1658.field_1352 + n, class_1658.field_1351, class_1658.field_1350 + n2));
                final class_2338 method_1034 = class_2338.method_49638((class_2374)new class_243(method_1031.field_1352 + n, method_1031.field_1351, method_1031.field_1350 + n2));
                final class_243 method_1035 = method_1033.method_46558();
                final class_243 method_1036 = method_1034.method_46558();
                if (method_1032.method_1003(method_1035.field_1352 - n3, method_1035.field_1351 - n3, method_1035.field_1350 - n3, method_1035.field_1352 + n3, method_1035.field_1351 + n3, method_1035.field_1350 + n3)) {
                    set.add(method_1033.method_46558());
                }
                if (method_1032.method_1003(method_1036.field_1352 - n3, method_1036.field_1351 - n3, method_1036.field_1350 - n3, method_1036.field_1352 + n3, method_1036.field_1351 + n3, method_1036.field_1350 + n3)) {
                    set2.add(method_1034.method_46558());
                }
            }
        }
        class_243 class_1659 = null;
        if (!set.isEmpty()) {
            double n4 = Double.MAX_VALUE;
            for (final class_243 class_1660 : set) {
                if (DataNImpl_6.class310.field_1687.method_8320(class_2338.method_49638((class_2374)class_1660)).method_45474()) {
                    final double method_1037 = class_1660.method_1022(new class_243(class_1657.method_23317(), class_1657.method_23318(), class_1657.method_23321()));
                    if (method_1037 >= n4 || method_1037 <= 0.5) {
                        continue;
                    }
                    class_1659 = class_1660;
                    n4 = method_1037;
                }
            }
        }
        class_243 class_1661 = null;
        if (!set2.isEmpty()) {
            double n5 = Double.MAX_VALUE;
            for (final class_243 class_1662 : set2) {
                if (!DataNImpl_6.class310.field_1687.method_8320(class_2338.method_49638((class_2374)class_1662).method_10074()).method_45474()) {
                    final double method_1038 = class_1662.method_1022(new class_243(class_1657.method_23317(), class_1657.method_23318(), class_1657.method_23321()));
                    if (method_1038 >= n5) {
                        continue;
                    }
                    class_1661 = class_1662;
                    n5 = method_1038;
                }
            }
        }
        return b ? class_1659 : class_1661;
    }
    
    public float[] createFloatarr(final class_243 class_243, final class_2350 class_244, final class_1657 class_245) {
        final class_243 method_1031 = new class_243(DataNImpl_6.class310.field_1724.method_23317(), DataNImpl_6.class310.field_1724.method_23318(), DataNImpl_6.class310.field_1724.method_23321()).method_1031(0.0, (double)DataNImpl_6.class310.field_1724.method_5751(), 0.0);
        class_243 class_246 = null;
        final class_238 method_1032 = class_245.method_5829();
        double method_1033 = Double.MAX_VALUE;
        for (float n = -0.45f; n <= 0.45f; n += 0.05f) {
            for (float n2 = -0.45f; n2 <= 0.45f; n2 += 0.05f) {
                final class_243 method_1034 = class_243.method_1031((double)(class_244.method_10148() - n), (double)(class_244.method_10164() + 0.05f), (double)(class_244.method_10165() - n2));
                if (!method_1032.method_1003(method_1034.field_1352, method_1034.field_1351, method_1034.field_1350, method_1034.field_1352, method_1034.field_1351 + 1.0, method_1034.field_1350) && method_1031.method_1022(method_1034) < method_1033) {
                    method_1033 = method_1031.method_1022(method_1034);
                    class_246 = method_1034;
                }
            }
        }
        if (class_246 == null) {
            return null;
        }
        final class_243 method_1035 = class_246.method_1020(method_1031);
        return new float[] { (float)Math.toDegrees(Math.atan2(method_1035.field_1350, method_1035.field_1352)) - 90.0f, (float)(-Math.toDegrees(Math.atan2(method_1035.field_1351, Math.sqrt(method_1035.field_1352 * method_1035.field_1352 + method_1035.field_1350 * method_1035.field_1350)))) };
    }
}
