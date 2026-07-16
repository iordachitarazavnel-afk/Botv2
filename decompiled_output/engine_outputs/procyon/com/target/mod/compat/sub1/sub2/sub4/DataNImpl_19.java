// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import com.target.mod.compat.sub1.sub2.sub6.BindCSub;
import net.minecraft.class_239;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_2769;
import net.minecraft.class_4969;
import net.minecraft.class_2350;
import net.minecraft.class_1268;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_20;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_17;
import net.minecraft.class_2246;
import net.minecraft.class_239$class_240;
import net.minecraft.class_3965;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_6;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import net.minecraft.class_1819;
import net.minecraft.class_9334;
import java.util.HashSet;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_2338;
import java.util.Set;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_4;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public class DataNImpl_19 extends Initializer_3 implements PackDImpl_5, PackDImpl_4
{
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_1 buildC_3;
    private final SyncASub_1 buildC_4;
    private final SyncASub_1 buildC_5;
    private final SyncASub_1 buildC_6;
    private final SyncASub_1 buildC_7;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_5 parseB_5;
    private final SyncASub_1 buildC_8;
    private final SyncASub_1 buildC_9;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private final Set<class_2338> set;
    
    public DataNImpl_19() {
        super(Initializer_14.computeString(new int[] { 10, 24, 226, 228, 248, 208, 242, 213, 162, 173, 171, 139, 176, 140, 55 }), Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 77, 33, 100, 103, 0, 71, 141, 255, 166, 169, 222, 129, 213, 114, 178, 212, 222, 145, 52, 21, 112, 23, 54, 47, 118, 68, 14, 81, 120, 34, 226, 164, 149, 193, 133, 214 }), "Advanced placement macro", Initializer.cacheE_1);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 75, 33, 100, 109, 0, 71, 137, 255, 166, 163, 17, 211, 251, 231, 178, 213, 224, 145, 52, 17 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 87, 33, 100, 107, 0, 71, 149, 48, 244, 155, 190, 211, 250, 220, 125, 135, 207, 213, 102, 41, 22, 69, 8, 76, 36, 107, 109 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 79, 33, 100, 109, 0, 71, 134, 255, 166, 173, 17, 211, 251, 225, 178, 213, 250, 145, 52, 25, 112, 23, 32, 47, 118, 90, 14, 81, 118, 237, 176, 140, 204, 147, 176, 171, 242, 213, 138, 205, 245 }), false);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 208, 145, 52, 28, 112, 23, 52, 47, 118, 88, 14, 81, 116, 237, 176, 157 }), 0.0, 100.0, 100.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 17, 211, 251, 241, 178, 213, 251, 145, 52, 21, 112, 23, 59, 47, 118, 85, 14, 81, 114 }), 0.0, 100.0, 100.0, 1.0);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 38, 99, 43, 44, 66, 5, 79, 33, 100, 107, 0, 71, 146, 255, 166, 181, 222, 129, 211, 189, 224, 231, 156, 195, 7, 123, 34, 47, 149, 47, 119, 114, 14, 81, 114, 237, 176, 148, 204, 147, 184, 171, 242, 195 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_4 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 38, 99, 43, 44, 66, 5, 79, 33, 100, 107, 0, 71, 146, 255, 166, 181, 222, 129, 211, 189, 224, 231, 156, 195, 7, 123, 34, 47, 149, 47, 119, 117, 14, 81, 127, 237, 176, 153, 204, 147, 183, 171, 242, 217, 138, 205, 254 }), 0.0, 100.0, 100.0, 1.0);
        this.buildC_5 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 36, 99, 43, 44, 66, 5, 91, 33, 100, 116, 0, 71, 137, 255, 166, 169, 222, 129, 195, 189, 224, 237, 83, 145, 53, 48, 112, 23, 48, 47, 118, 90, 14, 81, 118, 237, 176, 129 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_6 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 36, 99, 43, 44, 66, 5, 91, 33, 100, 116, 0, 71, 137, 255, 166, 169, 222, 129, 195, 189, 224, 237, 83, 145, 53, 55, 112, 23, 61, 47, 118, 87, 14, 81, 121, 237, 176, 155, 204, 147, 188 }), 0.0, 100.0, 100.0, 1.0);
        this.buildC_7 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 36, 99, 43, 44, 66, 5, 91, 33, 100, 116, 0, 71, 137, 255, 166, 169, 222, 129, 195, 189, 224, 237, 83, 145, 53, 39, 112, 23, 57, 47, 118, 89, 14, 81, 99 }), 1.0, 9.0, 1.0, 1.0);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 33, 100, 104, 0, 71, 156, 48, 244, 154, 158, 211, 250, 197, 178, 213, 253 }), false);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 33, 100, 104, 0, 71, 156, 48, 244, 154, 146, 211, 250, 218, 178, 213, 242, 145, 52, 6, 112, 23, 50, 47, 118, 83 }), false);
        this.parseB_5 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 129, 255, 166, 169, 222, 129, 202, 114, 178, 212, 212, 145, 52, 24, 112, 23, 58, 47, 118, 65, 14, 81, 100, 237, 176, 140, 204, 147, 182, 171, 242, 212, 138, 205, 254 }), false);
        this.buildC_8 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 129, 48, 244, 154, 150, 211, 250, 222, 178, 213, 252, 145, 52, 3, 191, 69, 9, 109, 36, 107, 104, 3, 74, 140 }), 1.0, 4.0, 1.0, 1.0);
        this.buildC_9 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 129, 48, 244, 154, 150, 211, 250, 222, 178, 213, 252, 145, 52, 3, 191, 69, 9, 109, 36, 107, 96, 3, 74, 154 }), 1.0, 4.0, 4.0, 1.0);
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.set = new HashSet<class_2338>();
        this.setSyncaarr(this.parseB, this.parseB_1, this.parseB_2, this.buildC_2, this.buildC, this.buildC_1, this.buildC_3, this.buildC_4, this.buildC_5, this.buildC_6, this.buildC_7, this.parseB_3, this.parseB_4, this.parseB_5, this.buildC_8, this.buildC_9);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_4.class, this);
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_4.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_19.class310.field_1724 == null || DataNImpl_19.class310.field_1687 == null || DataNImpl_19.class310.field_1755 != null) {
            return;
        }
        if ((DataNImpl_19.class310.field_1724.method_6047().method_7909().method_57347().method_57832(class_9334.field_50075) || DataNImpl_19.class310.field_1724.method_6047().method_7909() instanceof class_1819 || DataNImpl_19.class310.field_1724.method_6079().method_7909() instanceof class_1819 || DataNImpl_19.class310.field_1724.method_6079().method_7909().method_57347().method_57832(class_9334.field_50075)) && Initializer_9.checkInt(1) && !this.parseB.getBoolean()) {
            return;
        }
        if (!this.parseB.getBoolean() && DataNImpl_19.class310.field_1724.method_6115()) {
            return;
        }
        if (this.parseB_1.getBoolean() && Initializer_6.isEnabled()) {
            return;
        }
        if (!Initializer_9.checkInt(1)) {
            this.boolFlag = false;
            this.boolFlag_1 = false;
            return;
        }
        final class_239 field_1765 = DataNImpl_19.class310.field_1765;
        if (!(field_1765 instanceof class_3965)) {
            return;
        }
        class_3965 class_3965 = (class_3965)field_1765;
        if (field_1765.method_17783() != class_239$class_240.field_1332) {
            return;
        }
        DataNImpl_19.class310.field_1690.field_1904.method_23481(false);
        while (DataNImpl_19.class310.field_1690.field_1904.method_1436()) {}
        class_2338 method_17777 = class_3965.method_17777();
        if (DataNImpl_19.class310.field_1687.method_8320(method_17777).method_27852(class_2246.field_10036) || DataNImpl_19.class310.field_1687.method_8320(method_17777).method_27852(class_2246.field_22089)) {
            final class_2338 method_17778 = method_17777.method_10074();
            if (DataNImpl_19.class310.field_1687.method_8320(method_17778).method_27852(class_2246.field_23152)) {
                method_17777 = method_17778;
                class_3965 = new class_3965(class_3965.method_17784(), class_3965.method_17780(), method_17777, class_3965.method_17781());
            }
        }
        if (!DataNImpl_19.class310.field_1687.method_8320(method_17777).method_27852(class_2246.field_23152)) {
            final class_2338 method_17779 = class_3965.method_17777().method_10093(class_3965.method_17780());
            if (!DataNImpl_19.class310.field_1687.method_8320(method_17779).method_45474() && !DataNImpl_19.class310.field_1687.method_8320(method_17779).method_26215()) {
                return;
            }
            if (Initializer_17.method_int(1, 100) > this.buildC_2.getInt()) {
                return;
            }
            if (!DataNImpl_19.class310.field_1724.method_6047().method_31574(class_1802.field_23141)) {
                if (this.intValue != this.buildC.getInt()) {
                    ++this.intValue;
                    return;
                }
                if (Initializer_17.method_int(1, 100) <= this.buildC_1.getInt()) {
                    this.intValue = 0;
                    Initializer_10.checkClass_1792(class_1802.field_23141);
                }
            }
            if (DataNImpl_19.class310.field_1724.method_6047().method_31574(class_1802.field_23141)) {
                if (this.parseB_2.getBoolean()) {
                    Initializer_20.setInt_2(1);
                }
                DataNImpl_19.class310.field_1761.method_2896(DataNImpl_19.class310.field_1724, class_1268.field_5808, class_3965);
                DataNImpl_19.class310.field_1724.method_6104(class_1268.field_5808);
                this.set.add(method_17779);
                final class_3965 class_3966 = new class_3965(class_3965.method_17784(), class_2350.field_11036, method_17779, false);
                this.intValue = 0;
                this.intValue_1 = 0;
                this.intValue_2 = 0;
            }
        }
        else {
            if (this.parseB_3.getBoolean() && !this.set.contains(method_17777)) {
                return;
            }
            int n = Initializer_17.method_int(1, 100);
            boolean b = false;
            if ((int)DataNImpl_19.class310.field_1687.method_8320(method_17777).method_11654((class_2769)class_4969.field_23153) == 0 && n <= this.buildC_2.getInt()) {
                if (!DataNImpl_19.class310.field_1724.method_6047().method_31574(class_1802.field_8801)) {
                    if (this.intValue != this.buildC.getInt()) {
                        ++this.intValue;
                        return;
                    }
                    n = Initializer_17.method_int(1, 100);
                    if (n <= this.buildC_1.getInt()) {
                        this.intValue = 0;
                        Initializer_10.checkClass_1792(class_1802.field_8801);
                    }
                }
                if (DataNImpl_19.class310.field_1724.method_6047().method_31574(class_1802.field_8801)) {
                    if (this.intValue_1 != this.buildC_3.getInt()) {
                        ++this.intValue_1;
                        return;
                    }
                    n = Initializer_17.method_int(1, 100);
                    if (n <= this.buildC_4.getInt()) {
                        this.intValue_1 = 0;
                        if (this.parseB_2.getBoolean()) {
                            Initializer_20.setInt_2(1);
                        }
                        DataNImpl_19.class310.field_1761.method_2896(DataNImpl_19.class310.field_1724, class_1268.field_5808, class_3965);
                        DataNImpl_19.class310.field_1724.method_6104(class_1268.field_5808);
                        b = true;
                    }
                }
            }
            if (b || (int)DataNImpl_19.class310.field_1687.method_8320(method_17777).method_11654((class_2769)class_4969.field_23153) > 0) {
                final int n2 = this.buildC_7.getInt() - 1;
                if (Initializer_8.method_int(DataNImpl_19.class310.field_1724.method_31548()) != n2) {
                    if (this.intValue != this.buildC.getInt()) {
                        ++this.intValue;
                        return;
                    }
                    if (n <= this.buildC_1.getInt()) {
                        this.intValue = 0;
                        Initializer_8.setClass_1661AndInt(DataNImpl_19.class310.field_1724.method_31548(), n2);
                    }
                }
                if (Initializer_8.method_int(DataNImpl_19.class310.field_1724.method_31548()) == n2) {
                    if (this.intValue_2 != this.buildC_5.getInt()) {
                        ++this.intValue_2;
                        return;
                    }
                    if (Initializer_17.method_int(1, 100) <= this.buildC_6.getInt()) {
                        this.intValue_2 = 0;
                        if (!this.parseB_4.getBoolean()) {
                            if (this.parseB_2.getBoolean()) {
                                Initializer_20.setInt_2(1);
                            }
                            DataNImpl_19.class310.field_1761.method_2896(DataNImpl_19.class310.field_1724, class_1268.field_5808, class_3965);
                            DataNImpl_19.class310.field_1724.method_6104(class_1268.field_5808);
                            this.set.remove(method_17777);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void setBlocke(final BindCSub bindCSub) {
        if (DataNImpl_19.class310.field_1724 == null || DataNImpl_19.class310.field_1687 == null) {
            return;
        }
        final class_239 field_1765 = DataNImpl_19.class310.field_1765;
        if (!(field_1765 instanceof class_3965)) {
            return;
        }
        final class_3965 class_3965 = (class_3965)field_1765;
        if (class_3965.method_17783() != class_239$class_240.field_1332) {
            return;
        }
        if (DataNImpl_19.class310.field_1724.method_6047().method_31574(class_1802.field_23141)) {
            final class_2350 method_17780 = class_3965.method_17780();
            final class_2338 method_17781 = class_3965.method_17777();
            if (!DataNImpl_19.class310.field_1687.method_8320(method_17781).method_26215()) {
                switch (cm$1.intArr[method_17780.ordinal()]) {
                    case 1: {
                        this.set.add(method_17781.method_10084());
                        break;
                    }
                    case 2: {
                        this.set.add(method_17781.method_10074());
                        break;
                    }
                    case 3: {
                        this.set.add(method_17781.method_10078());
                        break;
                    }
                    case 4: {
                        this.set.add(method_17781.method_10067());
                        break;
                    }
                    case 5: {
                        this.set.add(method_17781.method_10095());
                        break;
                    }
                    case 6: {
                        this.set.add(method_17781.method_10072());
                        break;
                    }
                }
            }
            else {
                this.set.add(method_17781);
            }
        }
        final class_2338 method_17782 = class_3965.method_17777();
        if (DataNImpl_19.class310.field_1687.method_8320(method_17782).method_27852(class_2246.field_23152) && (int)DataNImpl_19.class310.field_1687.method_8320(method_17782).method_11654((class_2769)class_4969.field_23153) > 0) {
            this.set.remove(method_17782);
        }
    }
}
