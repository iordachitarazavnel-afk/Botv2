// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3.sub1;

import java.util.Iterator;
import net.minecraft.class_7923;
import net.minecraft.class_1542;
import net.minecraft.class_238;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_3959;
import net.minecraft.class_3959$class_242;
import net.minecraft.class_3959$class_3960;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_6;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import net.minecraft.class_2246;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_239$class_240;
import net.minecraft.class_3965;
import net.minecraft.class_1799;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import net.minecraft.class_1792;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_4 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_3 initD;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_1 buildC_3;
    private final SyncASub_5 parseB_2;
    private final SyncASub_1 buildC_4;
    private int intValue;
    private int intValue_1;
    private boolean boolFlag;
    private class_2338 class2338;
    private class_2338 class2338_1;
    private float floatValue;
    private float floatValue_1;
    private float floatValue_2;
    private float floatValue_3;
    private boolean boolFlag_1;
    private boolean boolFlag_2;
    private long longValue;
    private float floatValue_4;
    private float floatValue_5;
    private Runnable runnable;
    
    public DataNImpl_4() {
        super("safe_anchor", Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 66, 33, 100, 98, 0, 71, 128, 255, 167, 135, 222, 129, 201, 189, 224, 235, 156, 195, 1, 123, 34, 37, 90, 125, 89 }), Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 222, 129, 212, 114, 178, 213, 242, 145, 52, 26, 112, 23, 54, 47, 118, 94, 14, 81, 120, 237, 176, 138, 204, 146, 181, 100, 160, 231, 230, 159, 198, 14, 126, 33, 38, 93, 0, 90, 60, 99, 110, 27, 66, 143, 250, 157, 184, 22, 174, 241, 222, 141, 208, 236, 108, 50, 21, 132, 64, 7, 85, 63, 102, 116, 30, 65, 136, 253, 160, 188, 220, 131, 204, 187, 226, 233, 154, 61, 31, 121, 28, 63, 151, 45, 112, 65, 12, 83, 118, 235, 178, 143, 202, 140, 183, 102, 190, 225, 230, 157, 192, 6, 124, 35, 45, 148, 80, 119, 80, 15, 86, 110, 238, 177, 135, 205, 144, 180, 172, 243, 214, 139, 210, 254, 106, 45, 30, 73, 12, 47 }), Initializer.cacheE);
        this.initD = new SyncASub_3(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 81, 33, 100, 109, 0, 71, 130, 255, 166, 161, 222, 129, 194, 189, 224, 250, 83, 145, 53, 63, 112, 23, 48, 47, 118, 79 }), 86, false);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 145, 255, 166, 165, 222, 129, 207, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 128, 255, 166, 171, 17, 211, 251, 225, 178, 213, 255, 145, 52, 27, 112, 23, 33 }), 1.0, 9.0, 9.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 66, 33, 100, 106, 0, 71, 130, 255, 166, 163 }), 3.0, 6.0, 4.5, 0.1);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 74, 33, 100, 104, 0, 71, 128, 255, 166, 168, 222, 129, 211, 114, 178, 212, 193, 145, 52, 27, 112, 23, 33, 47, 118, 87, 14, 81, 99, 237, 176, 145, 204, 147, 182, 171, 242, 212, 138, 205, 232 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 78, 33, 100, 107, 0, 71, 138, 255, 166, 178, 222, 129, 207, 114, 178, 212, 193, 145, 52, 27, 112, 23, 33, 47, 118, 87, 14, 81, 99, 237, 176, 145, 204, 147, 182, 171, 242, 212, 138, 205, 232 }), false);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 76, 33, 100, 112, 0, 71, 132, 255, 166, 178, 222, 129, 206, 189, 224, 231, 156, 195, 7, 180, 112, 22, 6, 47, 118, 70, 14, 81, 114, 237, 176, 157, 204, 147, 189 }), 30.0, 360.0, 180.0, 10.0);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 52, 99, 43, 44, 66, 5, 80, 33, 100, 97, 207, 21, 185, 181, 244, 155, 176, 211, 250, 193, 178, 213, 250, 145, 52, 26, 112, 23, 50 }), true);
        this.buildC_4 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 36, 99, 43, 44, 66, 5, 66, 33, 100, 119, 0, 71, 140, 255, 166, 168, 222, 129, 192, 114, 178, 212, 192, 145, 52, 0, 112, 23, 39, 47, 118, 83, 14, 81, 121, 237, 176, 159, 204, 147, 173, 171, 242, 210 }), 1.0, 5.0, 3.0, 0.5);
        this.intValue = 0;
        this.intValue_1 = 0;
        this.boolFlag = false;
        this.class2338 = null;
        this.class2338_1 = null;
        this.floatValue = 0.0f;
        this.floatValue_1 = 0.0f;
        this.floatValue_2 = 0.0f;
        this.floatValue_3 = 0.0f;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.longValue = 0L;
        this.floatValue_4 = 0.0f;
        this.floatValue_5 = 0.0f;
        this.runnable = null;
        this.setSyncaarr(this.initD, this.buildC, this.buildC_1, this.buildC_2, this.parseB, this.parseB_1, this.buildC_3, this.parseB_2, this.buildC_4);
    }
    
    @Override
    public void execute() {
        super.execute();
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.longValue = System.nanoTime();
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.execute_4();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_4.class310.field_1724 == null || DataNImpl_4.class310.field_1687 == null) {
            return;
        }
        if (!this.isEnabled_1()) {
            if (this.boolFlag) {
                this.execute_4();
            }
            return;
        }
        if (!this.boolFlag && !this.isEnabled()) {
            return;
        }
        if (this.intValue < this.buildC.getInt()) {
            ++this.intValue;
            return;
        }
        this.intValue = 0;
        switch (this.intValue_1) {
            case 0: {
                if (!this.isEnabled_2()) {
                    this.execute_4();
                    return;
                }
                ++this.intValue_1;
                break;
            }
            case 1: {
                if (!this.checkCondition(this.class2338, class_1802.field_23141)) {
                    this.execute_4();
                    return;
                }
                ++this.intValue_1;
                break;
            }
            case 2: {
                if (!this.checkClass_2338(this.class2338)) {
                    this.execute_4();
                    return;
                }
                ++this.intValue_1;
                break;
            }
            case 3: {
                if (!this.checkClass_2338_2(this.class2338_1)) {
                    ++this.intValue_1;
                    break;
                }
                if (this.checkClass_2338_2(this.class2338_1.method_10074())) {
                    ++this.intValue_1;
                    break;
                }
                this.checkCondition(this.class2338_1, class_1802.field_8801);
                ++this.intValue_1;
                break;
            }
            case 4: {
                final int n = this.buildC_1.getInt() - 1;
                if (n >= 0 && n < 9) {
                    Initializer_8.setClass_1661AndInt(DataNImpl_4.class310.field_1724.method_31548(), n);
                }
                ++this.intValue_1;
                break;
            }
            case 5: {
                if (this.checkClass_2338_1(this.class2338)) {
                    this.execute_4();
                    return;
                }
                if (!this.checkCondition_1(this.class2338, null)) {
                    this.execute_4();
                    return;
                }
                ++this.intValue_1;
                break;
            }
            case 6: {
                this.execute_4();
                break;
            }
        }
    }
    
    private void execute_3() {
        if (!this.boolFlag || !this.parseB_1.getBoolean()) {
            return;
        }
        System.nanoTime();
        float n = 20.0f;
        if (this.parseB_2.getBoolean()) {
            n *= 1.0f + this.buildC_4.getFloat() * 0.1f;
        }
        final float method_float = this.method_float(this.floatValue_2 - this.floatValue);
        final float a = this.floatValue_3 - this.floatValue_1;
        if (Math.abs(method_float) < n && Math.abs(a) < n) {
            this.floatValue = this.floatValue_2;
            this.floatValue_1 = this.floatValue_3;
            this.boolFlag_2 = true;
            if (!this.parseB.getBoolean()) {
                DataNImpl_4.class310.field_1724.method_36456(this.floatValue);
                DataNImpl_4.class310.field_1724.method_36457(this.floatValue_1);
            }
            if (this.runnable != null) {
                this.runnable.run();
                this.runnable = null;
            }
        }
        else {
            this.floatValue += Math.signum(method_float) * Math.min(Math.abs(method_float), n);
            this.floatValue_1 += Math.signum(a) * Math.min(Math.abs(a), n);
            if (!this.parseB.getBoolean()) {
                DataNImpl_4.class310.field_1724.method_36456(this.floatValue);
                DataNImpl_4.class310.field_1724.method_36457(this.floatValue_1);
            }
        }
    }
    
    private float method_float(float n) {
        n %= 360.0f;
        if (n >= 180.0f) {
            n -= 360.0f;
        }
        if (n < -180.0f) {
            n += 360.0f;
        }
        return n;
    }
    
    private boolean isEnabled() {
        final int int1 = this.initD.getInt();
        if (int1 == -1 || !Initializer_9.checkInt(int1)) {
            return false;
        }
        this.boolFlag = true;
        this.floatValue = DataNImpl_4.class310.field_1724.method_36454();
        this.floatValue_1 = DataNImpl_4.class310.field_1724.method_36455();
        return true;
    }
    
    private void execute_4() {
        this.boolFlag = false;
        this.intValue_1 = 0;
        this.intValue = 0;
        this.class2338 = null;
        this.class2338_1 = null;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.runnable = null;
    }
    
    private boolean isEnabled_1() {
        boolean b = false;
        boolean b2 = false;
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = DataNImpl_4.class310.field_1724.method_31548().method_5438(i);
            if (method_5438.method_7909() == class_1802.field_23141) {
                b = true;
            }
            if (method_5438.method_7909() == class_1802.field_8801) {
                b2 = true;
            }
        }
        return b && b2;
    }
    
    private boolean isEnabled_2() {
        final class_239 field_1765 = DataNImpl_4.class310.field_1765;
        if (!(field_1765 instanceof class_3965)) {
            return false;
        }
        final class_3965 class_3965 = (class_3965)field_1765;
        if (class_3965.method_17783() != class_239$class_240.field_1332) {
            return false;
        }
        final class_2338 method_17777 = class_3965.method_17777();
        if (this.checkClass_2338_2(method_17777)) {
            this.class2338 = method_17777;
        }
        else {
            this.class2338 = method_17777.method_10093(class_3965.method_17780());
        }
        final class_2338 method_17778 = DataNImpl_4.class310.field_1724.method_24515();
        if (this.class2338.equals((Object)method_17778) || this.class2338.equals((Object)method_17778.method_10084())) {
            return false;
        }
        final double method_17779 = DataNImpl_4.class310.field_1724.method_33571().method_1022(class_243.method_24953((class_2382)this.class2338));
        if (method_17779 > this.buildC_2.getDouble() || method_17779 > 4.5) {
            return false;
        }
        final class_243 method_17780 = new class_243(DataNImpl_4.class310.field_1724.method_23317(), DataNImpl_4.class310.field_1724.method_23318(), DataNImpl_4.class310.field_1724.method_23321()).method_1019(class_243.method_24953((class_2382)this.class2338)).method_1021(0.5);
        class_2338 class2338_1 = new class_2338((int)Math.floor(method_17780.field_1352), DataNImpl_4.class310.field_1724.method_31478(), (int)Math.floor(method_17780.field_1350));
        if (class2338_1.equals((Object)this.class2338) || class2338_1.equals((Object)DataNImpl_4.class310.field_1724.method_24515())) {
            class2338_1 = DataNImpl_4.class310.field_1724.method_24515().method_10093(this.computeClass_2350(DataNImpl_4.class310.field_1724.method_36454()));
            if (class2338_1.equals((Object)this.class2338)) {
                class2338_1 = DataNImpl_4.class310.field_1724.method_24515();
            }
        }
        this.class2338_1 = class2338_1;
        return true;
    }
    
    private class_2350 computeClass_2350(float n) {
        n %= 360.0f;
        if (n < 0.0f) {
            n += 360.0f;
        }
        if (n >= 315.0f || n < 45.0f) {
            return class_2350.field_11035;
        }
        if (n >= 45.0f && n < 135.0f) {
            return class_2350.field_11039;
        }
        if (n >= 135.0f && n < 225.0f) {
            return class_2350.field_11043;
        }
        return class_2350.field_11034;
    }
    
    private boolean checkClass_2338_2(final class_2338 class_2338) {
        if (DataNImpl_4.class310.field_1687 == null) {
            return false;
        }
        final class_2680 method_8320 = DataNImpl_4.class310.field_1687.method_8320(class_2338);
        final class_2248 method_8321 = method_8320.method_26204();
        return method_8320.method_26215() || method_8321 == class_2246.field_10479 || method_8321 == class_2246.field_10214 || method_8321 == class_2246.field_10112 || method_8321 == class_2246.field_10313 || method_8321 == class_2246.field_10428 || method_8321 == class_2246.field_10597 || method_8321 == class_2246.field_10036 || method_8321 == class_2246.field_22089 || method_8321 == class_2246.field_10382 || method_8321 == class_2246.field_10164 || method_8321 == class_2246.field_10477 || method_8321 == class_2246.field_10376 || method_8321 == class_2246.field_10238 || method_8321 == class_2246.field_9993 || method_8321 == class_2246.field_10463 || method_8320.method_45474();
    }
    
    private void setClass_243AndRunnable(final class_243 class_243, final Runnable runnable) {
        final double x = class_243.field_1352 - DataNImpl_4.class310.field_1724.method_23317();
        final double y = class_243.field_1351 - DataNImpl_4.class310.field_1724.method_23320();
        final double y2 = class_243.field_1350 - DataNImpl_4.class310.field_1724.method_23321();
        final double sqrt = Math.sqrt(x * x + y2 * y2);
        final float floatValue_2 = (float)(Math.toDegrees(Math.atan2(y2, x)) - 90.0);
        final float floatValue_3 = (float)(-Math.toDegrees(Math.atan2(y, sqrt)));
        this.floatValue_2 = floatValue_2;
        this.floatValue_3 = floatValue_3;
        if (this.parseB_1.getBoolean()) {
            if (!this.boolFlag_1) {
                this.floatValue_4 = DataNImpl_4.class310.field_1724.method_36454();
                this.floatValue_5 = DataNImpl_4.class310.field_1724.method_36455();
                this.floatValue = this.floatValue_4;
                this.floatValue_1 = this.floatValue_5;
            }
            this.boolFlag_1 = true;
            this.boolFlag_2 = false;
            this.runnable = runnable;
        }
        else {
            this.floatValue = this.floatValue_2;
            this.floatValue_1 = this.floatValue_3;
            if (!this.parseB.getBoolean()) {
                DataNImpl_4.class310.field_1724.method_36456(this.floatValue_2);
                DataNImpl_4.class310.field_1724.method_36457(this.floatValue_3);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }
    
    private boolean checkCondition(final class_2338 class_2338, final class_1792 class_2339) {
        if (class_2338 == null || !this.checkClass_2338_2(class_2338)) {
            return false;
        }
        if (!Initializer_10.checkClass_1792(class_2339)) {
            return false;
        }
        final class_3965 computeClass_3965 = this.computeClass_3965(class_2338);
        if (computeClass_3965 == null) {
            return false;
        }
        Initializer_6.setClass_3965AndBool(computeClass_3965, true);
        return true;
    }
    
    private class_3965 computeClass_3965_1(final class_2338 class_2338) {
        final class_3965 method_17742 = DataNImpl_4.class310.field_1687.method_17742(new class_3959(DataNImpl_4.class310.field_1724.method_33571(), class_243.method_24953((class_2382)class_2338), class_3959$class_3960.field_17559, class_3959$class_242.field_1348, (class_1297)DataNImpl_4.class310.field_1724));
        if (method_17742 instanceof class_3965) {
            final class_3965 class_2339 = method_17742;
            if (((class_239)method_17742).method_17783() == class_239$class_240.field_1332) {
                return class_2339;
            }
        }
        final class_239 field_1765 = DataNImpl_4.class310.field_1765;
        if (field_1765 instanceof final class_3965 class_2340) {
            if (DataNImpl_4.class310.field_1765.method_17783() == class_239$class_240.field_1332) {
                return class_2340;
            }
        }
        return null;
    }
    
    private class_3965 computeClass_3965(final class_2338 class_2338) {
        final class_3965 computeClass_3965_1 = this.computeClass_3965_1(class_2338);
        if (computeClass_3965_1 != null && computeClass_3965_1.method_17777().method_10093(computeClass_3965_1.method_17780()).equals((Object)class_2338)) {
            return computeClass_3965_1;
        }
        final class_2350[] array = { class_2350.field_11033, class_2350.field_11036, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034 };
        DataNImpl_4.class310.field_1724.method_33571();
        for (final class_2350 class_2339 : array) {
            final class_2338 method_10093 = class_2338.method_10093(class_2339);
            if (!this.checkClass_2338_2(method_10093)) {
                return new class_3965(class_243.method_24953((class_2382)method_10093).method_1031(class_2339.method_10153().method_62675().method_10263() * 0.5, class_2339.method_10153().method_62675().method_10264() * 0.5, class_2339.method_10153().method_62675().method_10260() * 0.5), class_2339.method_10153(), method_10093, false);
            }
        }
        return null;
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        if (class_2338 == null || this.checkClass_2338_2(class_2338)) {
            return false;
        }
        if (!Initializer_10.checkClass_1792(class_1802.field_8801)) {
            return false;
        }
        class_3965 computeClass_3965_1 = this.computeClass_3965_1(class_2338);
        Label_0086: {
            if (computeClass_3965_1 == null || !computeClass_3965_1.method_17777().equals((Object)class_2338)) {
                final class_239 field_1765 = DataNImpl_4.class310.field_1765;
                if (field_1765 instanceof final class_3965 class_2339) {
                    if (class_2339.method_17777().equals((Object)class_2338)) {
                        computeClass_3965_1 = class_2339;
                        break Label_0086;
                    }
                }
                return false;
            }
        }
        DataNImpl_4.class310.field_1761.method_2896(DataNImpl_4.class310.field_1724, class_1268.field_5808, computeClass_3965_1);
        return true;
    }
    
    private boolean checkCondition_1(final class_2338 class_2338, final class_1792 class_2339) {
        if (class_2338 == null) {
            return false;
        }
        if (class_2339 != null && !Initializer_10.checkClass_1792(class_2339)) {
            return false;
        }
        class_3965 computeClass_3965_1 = this.computeClass_3965_1(class_2338);
        Label_0083: {
            if (computeClass_3965_1 == null || !computeClass_3965_1.method_17777().equals((Object)class_2338)) {
                final class_239 field_1765 = DataNImpl_4.class310.field_1765;
                if (field_1765 instanceof final class_3965 class_2340) {
                    if (class_2340.method_17777().equals((Object)class_2338)) {
                        computeClass_3965_1 = class_2340;
                        break Label_0083;
                    }
                }
                return false;
            }
        }
        DataNImpl_4.class310.field_1761.method_2896(DataNImpl_4.class310.field_1724, class_1268.field_5808, computeClass_3965_1);
        DataNImpl_4.class310.field_1724.method_6104(class_1268.field_5808);
        return true;
    }
    
    private boolean checkClass_2338_1(final class_2338 class_2338) {
        if (DataNImpl_4.class310.field_1687 == null || class_2338 == null) {
            return false;
        }
        final double n = 10.0;
        for (final class_1297 class_2339 : DataNImpl_4.class310.field_1687.method_8335((class_1297)null, new class_238(class_2338.method_10263() - n, class_2338.method_10264() - n, class_2338.method_10260() - n, class_2338.method_10263() + n, class_2338.method_10264() + n, class_2338.method_10260() + n))) {
            if (class_2339 instanceof final class_1542 class_2340) {
                final class_1799 method_6983 = class_2340.method_6983();
                if (method_6983.method_7960()) {
                    continue;
                }
                final String string = class_7923.field_41178.method_10221((Object)method_6983.method_7909()).toString();
                if (this.checkString(string)) {
                    return true;
                }
                if (this.checkString_1(string)) {
                    return true;
                }
                if (method_6983.method_7909() == class_1802.field_8288) {
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    private boolean checkString(final String s) {
        return s.contains("helmet") || s.contains("chestplate") || s.contains("leggings") || s.contains("boots");
    }
    
    private boolean checkString_1(final String s) {
        return s.contains("sword");
    }
}
