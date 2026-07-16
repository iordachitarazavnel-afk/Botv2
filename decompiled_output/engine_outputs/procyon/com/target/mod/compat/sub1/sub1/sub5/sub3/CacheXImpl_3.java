// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1735;
import net.minecraft.class_1703;
import net.minecraft.class_437;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_476;
import net.minecraft.class_2248;
import net.minecraft.class_243;
import net.minecraft.class_1743;
import net.minecraft.class_1752;
import net.minecraft.class_2246;
import java.util.function.ToDoubleFunction;
import java.util.Comparator;
import net.minecraft.class_2382;
import net.minecraft.class_1802;
import net.minecraft.class_490;
import net.minecraft.class_1799;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_5;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_1792;
import com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1;
import net.minecraft.class_2338;
import java.util.List;
import java.util.Random;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_2;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CacheXImpl_3 extends AbstractLoadF implements BlockEImpl_2, BlockEImpl_1
{
    private final RenderASub_1 buffC;
    private final RenderASub_1 buffC_1;
    private final int intValue = 5;
    private final int intValue_1 = 4;
    private final int intValue_2 = 3;
    private final Random random;
    private final List<class_2338> list;
    private final int intValue_3 = 16;
    private final int intValue_4 = 400;
    private final int intValue_5 = 3;
    private Initializer_15 procI;
    private class_2338 class2338;
    private int intValue_6;
    private com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1 eventB;
    private int intValue_7;
    private int intValue_8;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private Initializer_16 stepJ;
    private long longValue;
    private class_1792 class1792;
    private int intValue_9;
    private int intValue_10;
    private boolean boolFlag_2;
    private int intValue_11;
    private int intValue_12;
    private int intValue_13;
    private long longValue_1;
    private class_1792 class1792_1;
    private int intValue_14;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CacheXImpl_3() {
        super(createString(-8647, -20944), createString(-8664, -27209), Initializer.stepF);
        this.buffC = new RenderASub_1(createString(-8658, -25947), true);
        this.buffC_1 = new RenderASub_1(createString(-8672, 32732), true);
        this.random = new Random();
        this.list = new ArrayList<class_2338>();
        this.procI = Initializer_15.SEARCHING;
        this.class2338 = null;
        this.intValue_6 = 0;
        this.intValue_7 = 0;
        this.intValue_8 = -1;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.stepJ = Initializer_16.NONE;
        this.longValue = 0L;
        this.class1792 = null;
        this.intValue_9 = 0;
        this.intValue_10 = 0;
        this.boolFlag_2 = false;
        this.intValue_11 = 0;
        this.intValue_12 = -1;
        this.intValue_13 = -1;
        this.longValue_1 = 0L;
        this.class1792_1 = null;
        this.intValue_14 = 0;
        this.setRenderaarr(this.buffC, this.buffC_1);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(BlockEImpl_2.class, this);
        this.renderA.setClassAndPackd(BlockEImpl_1.class, this);
        this.execute_1();
    }
    
    @Override
    public void setCorej(final BuildBSub buildBSub) {
        if (CacheXImpl_3.class310.field_1687 == null || CacheXImpl_3.class310.field_1724 == null) {
            return;
        }
        if (this.eventB.isEnabled()) {
            this.eventB.setBoolAndBool(true, true);
        }
    }
    
    @Override
    public void execute_1() {
        if (CacheXImpl_3.class310.field_1690 == null) {
            return;
        }
        this.list.clear();
        this.class2338 = null;
        this.intValue_6 = 0;
        this.intValue_7 = 0;
        this.intValue_8 = -1;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.procI = Initializer_15.SEARCHING;
        this.eventB = new com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1(com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310);
        this.stepJ = Initializer_16.NONE;
        this.longValue = 0L;
        this.class1792 = null;
        this.intValue_9 = 0;
        this.intValue_10 = 0;
        this.boolFlag_2 = false;
        this.intValue_11 = 0;
        this.intValue_12 = -1;
        this.intValue_13 = -1;
        this.longValue_1 = 0L;
        this.class1792_1 = null;
        this.intValue_14 = 0;
        if (CacheXImpl_3.class310.field_1724 != null) {
            CacheXImpl_3.class310.field_1724.method_31548().field_7545 = ((this.intValue_8 != -1) ? this.intValue_8 : 0);
        }
        Initializer_8.execute();
        CacheXImpl_3.class310.field_1690.field_1904.method_23481(false);
        CacheXImpl_3.class310.field_1690.field_1886.method_23481(false);
        CacheXImpl_3.class310.field_1690.field_1832.method_23481(false);
    }
    
    @Override
    public void execute_2() {
        this.renderA.setClassAndPackd_1(BlockEImpl_2.class, this);
        this.renderA.setClassAndPackd_1(BlockEImpl_1.class, this);
        if (this.intValue_8 != -1 && CacheXImpl_3.class310.field_1724 != null) {
            CacheXImpl_3.class310.field_1724.method_31548().field_7545 = this.intValue_8;
        }
        Initializer_8.execute();
        CacheXImpl_3.class310.field_1690.field_1904.method_23481(false);
        CacheXImpl_3.class310.field_1690.field_1886.method_23481(false);
        CacheXImpl_3.class310.field_1690.field_1832.method_23481(false);
        this.stepJ = Initializer_16.NONE;
        if (this.boolFlag_2) {
            this.execute_5();
        }
    }
    
    private void setString(final String string) {
        Initializer_5.setString(string);
    }
    
    private void setClass_1792AndInt(final class_1792 class_1792, final int n) {
        if (!this.buffC.getValue() || this.boolFlag_2) {
            return;
        }
        int n2 = 0;
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = CacheXImpl_3.class310.field_1724.method_31548().method_5438(i);
            if (!method_5438.method_7960() && method_5438.method_7909() == class_1792) {
                n2 += method_5438.method_7947();
            }
        }
        if (n2 >= n) {
            return;
        }
        final int method_int_2 = this.method_int_2(class_1792);
        if (method_int_2 != -1 && method_int_2 >= 9) {
            final int method_int_3 = this.method_int_1(class_1792);
            if (method_int_3 != -1) {
                this.processAll(method_int_2, method_int_3, class_1792, n);
            }
        }
    }
    
    private int method_int_1(final class_1792 class_1792) {
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = CacheXImpl_3.class310.field_1724.method_31548().method_5438(i);
            if (!method_5438.method_7960() && method_5438.method_7909() == class_1792) {
                return i;
            }
        }
        for (int j = 0; j < 9; ++j) {
            if (CacheXImpl_3.class310.field_1724.method_31548().method_5438(j).method_7960()) {
                return j;
            }
        }
        return -1;
    }
    
    private int method_int_2(final class_1792 class_1792) {
        for (int i = 9; i < CacheXImpl_3.class310.field_1724.method_31548().method_5439(); ++i) {
            final class_1799 method_5438 = CacheXImpl_3.class310.field_1724.method_31548().method_5438(i);
            if (!method_5438.method_7960() && method_5438.method_7909() == class_1792) {
                return i;
            }
        }
        return -1;
    }
    
    private void processAll(final int intValue_12, final int intValue_13, final class_1792 class1792_1, final int intValue_14) {
        this.boolFlag_2 = true;
        this.intValue_11 = 0;
        this.intValue_12 = intValue_12;
        this.intValue_13 = intValue_13;
        this.class1792_1 = class1792_1;
        this.intValue_14 = intValue_14;
        this.longValue_1 = System.currentTimeMillis();
    }
    
    private void execute_4() {
        if (!this.boolFlag_2) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final long n = currentTimeMillis - this.longValue_1;
        final int n2 = 150 + this.random.nextInt(100);
        switch (this.intValue_11) {
            case 0: {
                if (n < 50L) {
                    return;
                }
                CacheXImpl_3.class310.execute(CacheXImpl_3::lambda$handleHotbarRefill$0);
                this.intValue_11 = 1;
                this.longValue_1 = currentTimeMillis;
                break;
            }
            case 1: {
                if (n < n2) {
                    return;
                }
                if (CacheXImpl_3.class310.field_1755 instanceof class_490) {
                    this.intValue_11 = 2;
                    this.longValue_1 = currentTimeMillis;
                    break;
                }
                if (n > 2000L) {
                    this.execute_5();
                    break;
                }
                break;
            }
            case 2: {
                if (n < n2) {
                    return;
                }
                CacheXImpl_3.class310.execute(this::lambda$handleHotbarRefill$1);
                this.intValue_11 = 3;
                this.longValue_1 = currentTimeMillis;
                break;
            }
            case 3: {
                if (n < n2) {
                    return;
                }
                CacheXImpl_3.class310.execute(this::lambda$handleHotbarRefill$2);
                this.intValue_11 = 4;
                this.longValue_1 = currentTimeMillis;
                break;
            }
            case 4: {
                if (n < n2) {
                    return;
                }
                CacheXImpl_3.class310.execute(this::lambda$handleHotbarRefill$3);
                this.intValue_11 = 5;
                this.longValue_1 = currentTimeMillis;
                break;
            }
            case 5: {
                if (n < n2) {
                    return;
                }
                CacheXImpl_3.class310.execute(CacheXImpl_3::lambda$handleHotbarRefill$4);
                this.intValue_11 = 6;
                this.longValue_1 = currentTimeMillis;
                break;
            }
            case 6: {
                if (n < 100L) {
                    return;
                }
                this.execute_6();
                break;
            }
        }
    }
    
    private void execute_5() {
        CacheXImpl_3.class310.execute(CacheXImpl_3::lambda$cancelHotbarRefill$5);
        this.execute_6();
    }
    
    private void execute_6() {
        this.boolFlag_2 = false;
        this.intValue_11 = 0;
        this.intValue_12 = -1;
        this.intValue_13 = -1;
        this.class1792_1 = null;
        this.intValue_14 = 0;
        this.longValue_1 = 0L;
    }
    
    private void execute_7() {
        if (!this.buffC_1.getValue() || this.boolFlag_2 || this.stepJ != Initializer_16.NONE) {
            return;
        }
        if (this.method_int(class_1802.field_8324) == 0) {
            this.setClass_1792(class_1802.field_8324);
        }
        else if (this.method_int(class_1802.field_17536) == 0) {
            this.setClass_1792(class_1802.field_17536);
        }
    }
    
    private void setClass_1792(final class_1792 class1792) {
        if (this.intValue_10 >= 3) {
            this.setString(createString(-8668, 7390) + class1792.method_63680().getString());
            this.intValue_10 = 0;
            return;
        }
        this.class1792 = class1792;
        this.stepJ = Initializer_16.OPEN_ORDERS;
        this.longValue = System.currentTimeMillis();
        this.intValue_9 = 0;
        this.setString(createString(-8667, -1627) + class1792.method_63680().getString());
    }
    
    private int method_int(final class_1792 class_1792) {
        int n = 0;
        for (int i = 0; i < CacheXImpl_3.class310.field_1724.method_31548().method_5439(); ++i) {
            final class_1799 method_5438 = CacheXImpl_3.class310.field_1724.method_31548().method_5438(i);
            if (!method_5438.method_7960() && method_5438.method_7909() == class_1792) {
                n += method_5438.method_7947();
            }
        }
        return n;
    }
    
    public void execute_3() {
        if (CacheXImpl_3.class310.field_1687 == null || CacheXImpl_3.class310.field_1724 == null) {
            return;
        }
        if (this.boolFlag_2) {
            this.execute_4();
            return;
        }
        if (this.stepJ != Initializer_16.NONE) {
            this.execute_13();
            return;
        }
        this.setClass_1792AndInt(class_1802.field_8324, 5);
        this.setClass_1792AndInt(class_1802.field_17536, 4);
        this.execute_7();
        switch (this.procI.ordinal()) {
            case 0: {
                this.execute_8();
                break;
            }
            case 1: {
                this.execute_9();
                break;
            }
            case 2: {
                this.execute_10();
                break;
            }
            case 3: {
                this.execute_11();
                break;
            }
            case 4: {
                this.execute_12();
                break;
            }
        }
    }
    
    private void execute_8() {
        final class_2338 method_24515 = CacheXImpl_3.class310.field_1724.method_24515();
        double n = Double.MAX_VALUE;
        this.class2338 = null;
        for (int i = method_24515.method_10264() - 2; i <= method_24515.method_10264(); ++i) {
            for (int j = -16; j <= 16; ++j) {
                for (int k = -16; k <= 16; ++k) {
                    final class_2338 computeClass_2338 = this.computeClass_2338(new class_2338(method_24515.method_10263() + j, i, method_24515.method_10260() + k));
                    if (computeClass_2338 != null) {
                        final double method_24516 = method_24515.method_10262((class_2382)computeClass_2338);
                        if (method_24516 < n) {
                            n = method_24516;
                            this.class2338 = computeClass_2338;
                        }
                    }
                }
            }
        }
        if (this.class2338 == null) {
            return;
        }
        this.list.clear();
        for (int l = 0; l < 2; ++l) {
            for (int n2 = 0; n2 < 2; ++n2) {
                this.list.add(this.class2338.method_10069(l, 1, n2));
            }
        }
        this.list.sort(Comparator.comparingDouble((ToDoubleFunction<? super class_2338>)CacheXImpl_3::lambda$findPodzol$6));
        this.intValue_6 = 0;
        this.boolFlag_1 = false;
        this.procI = Initializer_15.PLANTING;
        this.setString(createString(-8646, -2634) + this.class2338.method_23854());
    }
    
    private class_2338 computeClass_2338(final class_2338 class_2338) {
        for (int i = -1; i <= 0; ++i) {
            for (int j = -1; j <= 0; ++j) {
                boolean b = true;
                final class_2338 method_10069 = class_2338.method_10069(i, 0, j);
                for (int k = 0; k < 2; ++k) {
                    for (int l = 0; l < 2; ++l) {
                        if (CacheXImpl_3.class310.field_1687.method_8320(method_10069.method_10069(k, 0, l)).method_26204() != class_2246.field_10520) {
                            b = false;
                            break;
                        }
                    }
                    if (!b) {
                        break;
                    }
                }
                if (b) {
                    return method_10069;
                }
            }
        }
        return null;
    }
    
    private int getInt() {
        for (int i = 0; i < 9; ++i) {
            if (CacheXImpl_3.class310.field_1724.method_31548().method_5438(i).method_7909() == class_2246.field_10217.method_8389()) {
                return i;
            }
        }
        return -1;
    }
    
    private int getInt_1() {
        for (int i = 0; i < 9; ++i) {
            if (CacheXImpl_3.class310.field_1724.method_31548().method_5438(i).method_7909() instanceof class_1752) {
                return i;
            }
        }
        return -1;
    }
    
    private int getInt_2() {
        int n = -1;
        int n2 = 0;
        for (int i = 0; i < 9; ++i) {
            final class_1792 method_7909 = CacheXImpl_3.class310.field_1724.method_31548().method_5438(i).method_7909();
            if (method_7909 instanceof final class_1743 class_1743) {
                final int n3 = 1;
                if (n3 > n2) {
                    n2 = n3;
                    n = i;
                }
            }
        }
        return n;
    }
    
    private void setClass_2338(final class_2338 class_2338) {
        final class_243 method_1029 = new class_243(class_2338.method_10263() + 0.5, class_2338.method_10264() + 0.1, class_2338.method_10260() + 0.5).method_1020(CacheXImpl_3.class310.field_1724.method_33571()).method_1029();
        final float n = (float)Math.toDegrees(Math.atan2(method_1029.field_1350, method_1029.field_1352)) - 90.0f;
        final float n2 = (float)(-Math.toDegrees(Math.asin(method_1029.field_1351)));
        if (!this.eventB.isEnabled()) {
            this.eventB.processAll(n, n2, CacheXImpl_3::lambda$rotateTo$7);
        }
        this.eventB.setBoolAndBool(true, true);
    }
    
    private void execute_9() {
        if (this.intValue_6 >= this.list.size()) {
            this.procI = Initializer_15.BONEMEALING;
            this.boolFlag = false;
            return;
        }
        final class_2338 class_2338 = this.list.get(this.intValue_6);
        if (!CacheXImpl_3.class310.field_1687.method_8320(class_2338).method_26215()) {
            ++this.intValue_6;
            this.boolFlag = false;
            return;
        }
        final int int1 = this.getInt();
        if (int1 == -1) {
            this.setString(createString(-8641, 9653));
            this.procI = Initializer_15.SEARCHING;
            this.boolFlag = false;
            return;
        }
        if (this.intValue_8 == -1) {
            this.intValue_8 = CacheXImpl_3.class310.field_1724.method_31548().field_7545;
        }
        CacheXImpl_3.class310.field_1724.method_31548().field_7545 = int1;
        Initializer_8.execute();
        this.setClass_2338(class_2338);
        if (!this.eventB.isEnabled()) {
            CacheXImpl_3.class310.field_1690.field_1904.method_23481(true);
            this.boolFlag = true;
        }
        else {
            CacheXImpl_3.class310.field_1690.field_1904.method_23481(false);
        }
        if (this.boolFlag && CacheXImpl_3.class310.field_1687.method_8320(class_2338).method_26204() != class_2246.field_10124) {
            ++this.intValue_6;
            this.boolFlag = false;
            CacheXImpl_3.class310.field_1690.field_1904.method_23481(false);
        }
    }
    
    private void execute_10() {
        final int int_1 = this.getInt_1();
        if (int_1 == -1) {
            this.setString(createString(-8660, -23560));
            this.procI = Initializer_15.SEARCHING;
            return;
        }
        if (this.intValue_8 == -1) {
            this.intValue_8 = CacheXImpl_3.class310.field_1724.method_31548().field_7545;
        }
        CacheXImpl_3.class310.field_1724.method_31548().field_7545 = int_1;
        Initializer_8.execute();
        this.setClass_2338(this.list.get(0));
        boolean b = false;
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                final class_2248 method_26204 = CacheXImpl_3.class310.field_1687.method_8320(this.class2338.method_10069(i, 1, j)).method_26204();
                if (method_26204 != class_2246.field_10217 && method_26204 != class_2246.field_10124) {
                    b = true;
                    break;
                }
            }
            if (b) {
                break;
            }
        }
        if (b) {
            CacheXImpl_3.class310.field_1690.field_1904.method_23481(false);
            this.procI = Initializer_15.MINING;
            this.setString(createString(-8661, 14045));
            return;
        }
        CacheXImpl_3.class310.field_1690.field_1904.method_23481(!this.eventB.isEnabled());
    }
    
    private void execute_11() {
        CacheXImpl_3.class310.field_1690.field_1904.method_23481(false);
        if (this.boolFlag_1) {
            CacheXImpl_3.class310.field_1690.field_1886.method_23481(false);
            this.intValue_7 = 10;
            this.procI = Initializer_15.WAIT;
            return;
        }
        final class_2338 method_10069 = this.class2338.method_10069(0, 1, 0);
        if (CacheXImpl_3.class310.field_1687.method_8320(method_10069).method_26204() == class_2246.field_10037) {
            this.setClass_2338(method_10069);
            final int int_2 = this.getInt_2();
            if (int_2 == -1) {
                this.setString(createString(-8671, 32022));
                this.procI = Initializer_15.SEARCHING;
                return;
            }
            if (this.intValue_8 == -1) {
                this.intValue_8 = CacheXImpl_3.class310.field_1724.method_31548().field_7545;
            }
            CacheXImpl_3.class310.field_1724.method_31548().field_7545 = int_2;
            Initializer_8.execute();
            CacheXImpl_3.class310.field_1690.field_1886.method_23481(!this.eventB.isEnabled());
        }
        else {
            CacheXImpl_3.class310.field_1690.field_1886.method_23481(false);
            this.boolFlag_1 = true;
            this.intValue_7 = 10;
            this.procI = Initializer_15.WAIT;
        }
    }
    
    private void execute_12() {
        if (this.intValue_7 > 0) {
            --this.intValue_7;
            return;
        }
        this.procI = Initializer_15.SEARCHING;
    }
    
    private void execute_13() {
        final long currentTimeMillis = System.currentTimeMillis();
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        final long n = currentTimeMillis - this.longValue;
        final String[] array = stringarrArray;
        final int n2 = 400 + this.random.nextInt(100);
        long n4;
        final long n3 = n4 = lcmp(n, 5000L);
        if (array != null) {
            if (n3 > 0) {
                this.setString(createString(-8670, -25515));
                if (array != null) {
                    if (CacheXImpl_3.class310.field_1755 != null) {
                        CacheXImpl_3.class310.field_1755.method_25419();
                    }
                    this.execute_1();
                }
                return;
            }
            final int ordinal;
            n4 = (ordinal = this.stepJ.ordinal());
        }
        Label_0740: {
            Label_0619: {
                Label_0577: {
                    Label_0503: {
                        Label_0461: {
                            Label_0387: {
                                Label_0345: {
                                    Label_0237: {
                                        Label_0195: {
                                            if (array != null) {
                                                switch (n3) {
                                                    case 1: {
                                                        n4 = lcmp(n, 100L);
                                                        break;
                                                    }
                                                    case 2: {
                                                        break Label_0195;
                                                    }
                                                    case 3: {
                                                        break Label_0237;
                                                    }
                                                    case 4: {
                                                        break Label_0345;
                                                    }
                                                    case 5: {
                                                        break Label_0387;
                                                    }
                                                    case 6: {
                                                        break Label_0461;
                                                    }
                                                    case 7: {
                                                        break Label_0503;
                                                    }
                                                    case 8: {
                                                        break Label_0577;
                                                    }
                                                    case 9: {
                                                        break Label_0619;
                                                    }
                                                    case 10: {
                                                        break Label_0740;
                                                    }
                                                }
                                            }
                                            if (n4 < 0) {
                                                return;
                                            }
                                            CacheXImpl_3.class310.field_1724.field_3944.method_45730(createString(-8663, 16127));
                                            this.stepJ = Initializer_16.WAIT_ORDERS_GUI;
                                            this.longValue = currentTimeMillis;
                                            if (array != null) {
                                                return;
                                            }
                                        }
                                        final long n5 = lcmp(n, (long)n2);
                                        if (array != null) {
                                            if (n5 < 0) {
                                                return;
                                            }
                                            final boolean b = CacheXImpl_3.class310.field_1755 instanceof class_476;
                                        }
                                        if (n5 == 0) {
                                            return;
                                        }
                                        this.stepJ = Initializer_16.CLICK_SLOT_51;
                                        this.longValue = currentTimeMillis;
                                        if (array != null) {
                                            return;
                                        }
                                    }
                                    if (n < n2) {
                                        return;
                                    }
                                    final class_437 field_1755 = CacheXImpl_3.class310.field_1755;
                                    if (array == null || field_1755 instanceof class_476) {
                                        final class_476 class_476 = (class_476)field_1755;
                                        if (array != null) {
                                            final class_1703 method_17577 = class_476.method_17577();
                                            Label_0341: {
                                                if (array != null) {
                                                    if (method_17577.field_7761.size() <= 51) {
                                                        break Label_0341;
                                                    }
                                                    CacheXImpl_3.class310.field_1761.method_2906(method_17577.field_7763, 51, 0, class_1713.field_7790, (class_1657)CacheXImpl_3.class310.field_1724);
                                                    this.stepJ = Initializer_16.WAIT_SECOND_GUI;
                                                }
                                                this.longValue = currentTimeMillis;
                                            }
                                            if (array == null) {
                                                break Label_0345;
                                            }
                                            return;
                                        }
                                    }
                                    return;
                                }
                                final long n6 = lcmp(n, (long)n2);
                                if (array != null) {
                                    if (n6 < 0) {
                                        return;
                                    }
                                    final boolean b2 = CacheXImpl_3.class310.field_1755 instanceof class_476;
                                }
                                if (n6 == 0) {
                                    return;
                                }
                                this.stepJ = Initializer_16.CLICK_TARGET_ITEM;
                                this.longValue = currentTimeMillis;
                                if (array != null) {
                                    return;
                                }
                            }
                            if (n < n2) {
                                return;
                            }
                            final class_437 field_1756 = CacheXImpl_3.class310.field_1755;
                            if (array == null || field_1756 instanceof class_476) {
                                final class_476 class_477 = (class_476)field_1756;
                                if (array != null) {
                                    CacheXImpl_3 cacheXImpl_3 = this;
                                    Label_0457: {
                                        if (array != null) {
                                            if (!this.checkClass_1703(class_477.method_17577())) {
                                                break Label_0457;
                                            }
                                            this.stepJ = Initializer_16.WAIT_THIRD_GUI;
                                            cacheXImpl_3 = this;
                                        }
                                        cacheXImpl_3.longValue = currentTimeMillis;
                                    }
                                    if (array == null) {
                                        break Label_0461;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        final long n7 = lcmp(n, (long)n2);
                        if (array != null) {
                            if (n7 < 0) {
                                return;
                            }
                            final boolean b3 = CacheXImpl_3.class310.field_1755 instanceof class_476;
                        }
                        if (n7 == 0) {
                            return;
                        }
                        this.stepJ = Initializer_16.CLICK_CHEST_SLOT;
                        this.longValue = currentTimeMillis;
                        if (array != null) {
                            return;
                        }
                    }
                    if (n < n2) {
                        return;
                    }
                    final class_437 field_1757 = CacheXImpl_3.class310.field_1755;
                    if (array == null || field_1757 instanceof class_476) {
                        final class_476 class_478 = (class_476)field_1757;
                        if (array != null) {
                            CacheXImpl_3 cacheXImpl_4 = this;
                            Label_0573: {
                                if (array != null) {
                                    if (!this.checkClass_1703_1(class_478.method_17577())) {
                                        break Label_0573;
                                    }
                                    this.stepJ = Initializer_16.WAIT_ITEMS_GUI;
                                    cacheXImpl_4 = this;
                                }
                                cacheXImpl_4.longValue = currentTimeMillis;
                            }
                            if (array == null) {
                                break Label_0577;
                            }
                            return;
                        }
                    }
                    return;
                }
                final long n8 = lcmp(n, (long)n2);
                if (array != null) {
                    if (n8 < 0) {
                        return;
                    }
                    final boolean b4 = CacheXImpl_3.class310.field_1755 instanceof class_476;
                }
                if (n8 == 0) {
                    return;
                }
                this.stepJ = Initializer_16.COLLECT_ITEMS;
                this.longValue = currentTimeMillis;
                if (array != null) {
                    return;
                }
            }
            if (n < n2) {
                return;
            }
            final class_437 field_1758 = CacheXImpl_3.class310.field_1755;
            if (array == null || field_1758 instanceof class_476) {
                final class_476 class_479 = (class_476)field_1758;
                if (array != null) {
                    final int checkClass_1703_2 = this.checkClass_1703_2(class_479.method_17577()) ? 1 : 0;
                    Label_0736: {
                        CacheXImpl_3 cacheXImpl_6 = null;
                        Label_0724: {
                            if (array != null) {
                                if (checkClass_1703_2 != 0) {
                                    this.longValue = currentTimeMillis;
                                    CacheXImpl_3 cacheXImpl_5 = this;
                                    if (array != null) {
                                        if (this.intValue_9 < 3) {
                                            break Label_0736;
                                        }
                                        cacheXImpl_5 = this;
                                    }
                                    cacheXImpl_5.setBool(true);
                                    if (array != null) {
                                        break Label_0736;
                                    }
                                }
                                cacheXImpl_6 = this;
                                if (array == null) {
                                    break Label_0724;
                                }
                                final int intValue_9 = this.intValue_9;
                            }
                            if (checkClass_1703_2 > 0) {
                                this.setBool(true);
                                if (array != null) {
                                    break Label_0736;
                                }
                            }
                            cacheXImpl_6 = this;
                        }
                        cacheXImpl_6.setString_1(createString(-8662, -12354));
                    }
                    if (array == null) {
                        break Label_0740;
                    }
                    return;
                }
            }
            return;
        }
        final class_437 field_1759 = CacheXImpl_3.class310.field_1755;
        Label_0762: {
            if (array != null) {
                if (field_1759 == null) {
                    break Label_0762;
                }
                final class_437 field_1760 = CacheXImpl_3.class310.field_1755;
            }
            field_1759.method_25419();
        }
        this.setBool(false);
    }
    
    private boolean checkClass_1703(final class_1703 class_1703) {
        for (int i = 0; i < Math.min(class_1703.field_7761.size(), 54); ++i) {
            final class_1735 class_1704 = (class_1735)class_1703.field_7761.get(i);
            if (class_1704.method_7681() && class_1704.method_7677().method_7909() == this.class1792) {
                CacheXImpl_3.class310.field_1761.method_2906(class_1703.field_7763, i, 0, class_1713.field_7790, (class_1657)CacheXImpl_3.class310.field_1724);
                return true;
            }
        }
        return false;
    }
    
    private boolean checkClass_1703_1(final class_1703 class_1703) {
        for (final int n : new int[] { 11, 12, 13, 14, 15, 16, 20, 21, 22, 23, 24 }) {
            if (class_1703.field_7761.size() > n) {
                final class_1735 class_1704 = (class_1735)class_1703.field_7761.get(n);
                if (class_1704.method_7681() && class_1704.method_7677().method_7909() == class_1802.field_8106) {
                    CacheXImpl_3.class310.field_1761.method_2906(class_1703.field_7763, n, 0, class_1713.field_7790, (class_1657)CacheXImpl_3.class310.field_1724);
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean checkClass_1703_2(final class_1703 class_1703) {
        for (int i = 0; i < Math.min(class_1703.field_7761.size(), 54); ++i) {
            final class_1735 class_1704 = (class_1735)class_1703.field_7761.get(i);
            if (class_1704.method_7681() && class_1704.method_7677().method_7909() == this.class1792) {
                CacheXImpl_3.class310.field_1761.method_2906(class_1703.field_7763, i, 0, class_1713.field_7790, (class_1657)CacheXImpl_3.class310.field_1724);
                ++this.intValue_9;
                return true;
            }
        }
        return false;
    }
    
    private void setString_1(final String s) {
        ++this.intValue_10;
        if (this.intValue_10 < 3) {
            this.setString(createString(-8645, 10278) + s + createString(-8659, 30716) + this.intValue_10 + createString(-8648, -4229));
            if (CacheXImpl_3.class310.field_1755 != null) {
                CacheXImpl_3.class310.field_1755.method_25419();
            }
            this.stepJ = Initializer_16.OPEN_ORDERS;
            this.longValue = System.currentTimeMillis() + 800L + this.random.nextInt(400);
        }
        else {
            this.setString(createString(-8666, -3166) + s);
            this.setBool(false);
        }
    }
    
    private void setBool(final boolean b) {
        if (CacheXImpl_3.class310.field_1755 != null) {
            CacheXImpl_3.class310.field_1755.method_25419();
        }
        if (b) {
            this.setString(createString(-8665, -13214) + this.intValue_9 + createString(-8669, -2072) + ((this.class1792 != null) ? this.class1792.method_63680().getString() : createString(-8657, -27095)));
        }
        this.stepJ = Initializer_16.NONE;
        this.class1792 = null;
        this.intValue_9 = 0;
        this.intValue_10 = 0;
    }
    
    private static void lambda$rotateTo$7() {
    }
    
    private static double lambda$findPodzol$6(final class_2338 class_2338) {
        return -CacheXImpl_3.class310.field_1724.method_24515().method_10262((class_2382)class_2338);
    }
    
    private static void lambda$cancelHotbarRefill$5() {
        if (CacheXImpl_3.class310.field_1755 != null) {
            CacheXImpl_3.class310.field_1755.method_25419();
        }
    }
    
    private static void lambda$handleHotbarRefill$4() {
        if (CacheXImpl_3.class310.field_1755 != null) {
            CacheXImpl_3.class310.field_1755.method_25419();
        }
    }
    
    private void lambda$handleHotbarRefill$3() {
        CacheXImpl_3.class310.field_1761.method_2906(CacheXImpl_3.class310.field_1724.field_7512.field_7763, this.intValue_12, 0, class_1713.field_7790, (class_1657)CacheXImpl_3.class310.field_1724);
    }
    
    private void lambda$handleHotbarRefill$2() {
        CacheXImpl_3.class310.field_1761.method_2906(CacheXImpl_3.class310.field_1724.field_7512.field_7763, this.intValue_13, 0, class_1713.field_7790, (class_1657)CacheXImpl_3.class310.field_1724);
    }
    
    private void lambda$handleHotbarRefill$1() {
        CacheXImpl_3.class310.field_1761.method_2906(CacheXImpl_3.class310.field_1724.field_7512.field_7763, this.intValue_12, 0, class_1713.field_7790, (class_1657)CacheXImpl_3.class310.field_1724);
    }
    
    private static void lambda$handleHotbarRefill$0() {
        CacheXImpl_3.class310.method_1507((class_437)new class_490((class_1657)CacheXImpl_3.class310.field_1724));
    }
    
    static {
        final String[] strArr2 = new String[21];
        int n = 0;
        String s;
        int n2 = (s = "M½6\u008d2\bX}\u0003g»r6V\u0006\u0001\u00dd\u00162\u00f6\u008d¹¹\u00c9»i\u00ceD\u00cc,x\u0019K\u00ec\u00ea\u0015\u0010\u0094\u00dd°\u0018I+\u00eb\u009e\u008a\u00c8\u008evh2Qm\\j-\u0093\u0005\u00d9z\u00f9u¸4\bT\u0007G¹º§\u00ef\u00f89Sf;\u00d3\u00f8mT\u00c5\u00c8\u0011~\u0003\u00c7^cQ\"\u00c0M\u001e\u0087\u008e\u007f¬±\u00e4\u001f\u00f5m\u008f`½\u00c5\u00cd(\u0000\u00e8V\u000f\u00f2dR\u0005\u00daQ^\u00del\rZ1Z¥\u00cd\u00ff\u009c\t\u0091{\u00f1´\u0001\u0010\u0012\u00e3J\u00c4\u0015\u00c7Q\u00e3<`\u00c7\u009cJ\u001e\u001aC\r¢-\u00d7&¬\u0093:i H\u00d6±¡\u000b\u0088\u0091e-(\u00941,\u0017\u00e3#/µ¶P\u00ec\u008dc·µ\u00ef2Xs\u00dd´s©\u00d7~Le\u008c£\u00f3\u00ff¡\u0014\u00d6\u0010\u00fb\u00000\u00cfrS\u0095f\u00d2k\u00df;H\u00d8\u0015\u00e6IX\u00f1\r§fwL¯¶\u00ea\u00e1U\u00c7%Z1\f\u00e4\u0005z\u009a\u00c8\u00ad?l\u00da\t\u00fe\u0014\u001c\u001a\u00ca\u0019\u009a\u00f8l\u0096\u0097\u00da´\u00ca'U9\u009e\u00fa\u001f\u00f4¸\u00c2\u0018.\u00c4cF\u001bA\u00c2!½\u0080\u00ed\u00d3fEE·®\u0011\u0097\u001e`b\u001dM¾\u0005B^Q\u0016\u00d1\u008b\\-\u00d4V\u0091\u00d0!\u008a\u0004\u001a\u0013\u00f9\u001e\u00d4\u00e7\u00d8  \u00c4\u00d4\u00ada\u00fb\u00fe\u000e\u00d2¤c)½E\u00eel²6\u00e9\u001f\u00e4s$`\u009cZ\u0081sµb\u0014\u00c2\u00d4X¹\u00dbJ/½\u009d¾v>\u00cf\u00ce\u00e5'z7\u00d4`\u000f4x\u00dc\u00cc@¦\u0081\u00cb6\u009e\u0084\u00ef\u0002\\\u0018\u0014\u00f0g\u00c1c\u009a\u00f8\u00c1\u00db=\b\u00c0W\u0015Z½Q1\u00c9kC\u000e?\u00f4\u00deIh\u00ce\u00fe\u0018\u0013\u008f\u00fd\u00cc\u00f1c").length();
        int n3 = 31;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 57));
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
                        Label_0260: {
                            if (length > 1) {
                                break Label_0260;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 75;
                                    case 1 -> 50;
                                    case 2 -> 83;
                                    case 3 -> 59;
                                    case 4 -> 105;
                                    case 5 -> 110;
                                    default -> 123;
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
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0024;
                            }
                            n2 = (s = "-\u00fcX\u0013\u00df\u0017BJ;\u000b\u001e\u009c\u0004¢c6,\u00950D;\u0001\u00ea").length();
                            n3 = 3;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0024;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 32)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        strArr = strArr2;
        strArr_1 = new String[21];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFDE2B) & 0xFFFF;
        if (CacheXImpl_3.strArr_1[n3] == null) {
            final char[] charArray = CacheXImpl_3.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 61;
                case 1 -> 156;
                case 2 -> 191;
                case 3 -> 152;
                case 4 -> 241;
                case 5 -> 52;
                case 6 -> 221;
                case 7 -> 145;
                case 8 -> 176;
                case 9 -> 243;
                case 10 -> 231;
                case 11 -> 35;
                case 12 -> 195;
                case 13 -> 13;
                case 14 -> 65;
                case 15 -> 131;
                case 16 -> 78;
                case 17 -> 201;
                case 18 -> 6;
                case 19 -> 105;
                case 20 -> 180;
                case 21 -> 22;
                case 22 -> 223;
                case 23 -> 7;
                case 24 -> 199;
                case 25 -> 81;
                case 26 -> 108;
                case 27 -> 102;
                case 28 -> 138;
                case 29 -> 166;
                case 30 -> 159;
                case 31 -> 245;
                case 32 -> 196;
                case 33 -> 24;
                case 34 -> 75;
                case 35 -> 167;
                case 36 -> 95;
                case 37 -> 186;
                case 38 -> 161;
                case 39 -> 9;
                case 40 -> 69;
                case 41 -> 236;
                case 42 -> 169;
                case 43 -> 55;
                case 44 -> 255;
                case 45 -> 67;
                case 46 -> 155;
                case 47 -> 47;
                case 48 -> 234;
                case 49 -> 74;
                case 50 -> 38;
                case 51 -> 233;
                case 52 -> 99;
                case 53 -> 72;
                case 54 -> 44;
                case 55 -> 214;
                case 56 -> 208;
                case 57 -> 71;
                case 58 -> 232;
                case 59 -> 29;
                case 60 -> 177;
                case 61 -> 30;
                case 62 -> 153;
                case 63 -> 114;
                case 64 -> 127;
                case 65 -> 210;
                case 66 -> 136;
                case 67 -> 142;
                case 68 -> 235;
                case 69 -> 137;
                case 70 -> 18;
                case 71 -> 250;
                case 72 -> 110;
                case 73 -> 224;
                case 74 -> 54;
                case 75 -> 79;
                case 76 -> 57;
                case 77 -> 36;
                case 78 -> 252;
                case 79 -> 1;
                case 80 -> 77;
                case 81 -> 198;
                case 82 -> 34;
                case 83 -> 93;
                case 84 -> 143;
                case 85 -> 119;
                case 86 -> 76;
                case 87 -> 84;
                case 88 -> 193;
                case 89 -> 192;
                case 90 -> 203;
                case 91 -> 148;
                case 92 -> 150;
                case 93 -> 132;
                case 94 -> 202;
                case 95 -> 16;
                case 96 -> 179;
                case 97 -> 115;
                case 98 -> 64;
                case 99 -> 94;
                case 100 -> 15;
                case 101 -> 244;
                case 102 -> 91;
                case 103 -> 146;
                case 104 -> 40;
                case 105 -> 230;
                case 106 -> 17;
                case 107 -> 58;
                case 108 -> 100;
                case 109 -> 228;
                case 110 -> 117;
                case 111 -> 80;
                case 112 -> 213;
                case 113 -> 247;
                case 114 -> 68;
                case 115 -> 20;
                case 116 -> 51;
                case 117 -> 197;
                case 118 -> 238;
                case 119 -> 151;
                case 120 -> 21;
                case 121 -> 122;
                case 122 -> 124;
                case 123 -> 19;
                case 124 -> 118;
                case 125 -> 134;
                case 126 -> 12;
                case 127 -> 87;
                case 128 -> 253;
                case 129 -> 82;
                case 130 -> 242;
                case 131 -> 178;
                case 132 -> 50;
                case 133 -> 96;
                case 134 -> 184;
                case 135 -> 174;
                case 136 -> 139;
                case 137 -> 88;
                case 138 -> 165;
                case 139 -> 219;
                case 140 -> 211;
                case 141 -> 10;
                case 142 -> 209;
                case 143 -> 157;
                case 144 -> 207;
                case 145 -> 225;
                case 146 -> 189;
                case 147 -> 154;
                case 148 -> 212;
                case 149 -> 227;
                case 150 -> 3;
                case 151 -> 27;
                case 152 -> 248;
                case 153 -> 25;
                case 154 -> 251;
                case 155 -> 37;
                case 156 -> 175;
                case 157 -> 144;
                case 158 -> 237;
                case 159 -> 89;
                case 160 -> 218;
                case 161 -> 97;
                case 162 -> 194;
                case 163 -> 33;
                case 164 -> 171;
                case 165 -> 113;
                case 166 -> 254;
                case 167 -> 43;
                case 168 -> 104;
                case 169 -> 112;
                case 170 -> 63;
                case 171 -> 59;
                case 172 -> 217;
                case 173 -> 160;
                case 174 -> 126;
                case 175 -> 168;
                case 176 -> 92;
                case 177 -> 239;
                case 178 -> 200;
                case 179 -> 204;
                case 180 -> 187;
                case 181 -> 0;
                case 182 -> 246;
                case 183 -> 188;
                case 184 -> 73;
                case 185 -> 135;
                case 186 -> 116;
                case 187 -> 2;
                case 188 -> 121;
                case 189 -> 86;
                case 190 -> 31;
                case 191 -> 106;
                case 192 -> 183;
                case 193 -> 185;
                case 194 -> 101;
                case 195 -> 11;
                case 196 -> 107;
                case 197 -> 129;
                case 198 -> 149;
                case 199 -> 205;
                case 200 -> 141;
                case 201 -> 172;
                case 202 -> 170;
                case 203 -> 182;
                case 204 -> 128;
                case 205 -> 45;
                case 206 -> 229;
                case 207 -> 5;
                case 208 -> 90;
                case 209 -> 48;
                case 210 -> 216;
                case 211 -> 206;
                case 212 -> 53;
                case 213 -> 123;
                case 214 -> 41;
                case 215 -> 23;
                case 216 -> 32;
                case 217 -> 173;
                case 218 -> 220;
                case 219 -> 190;
                case 220 -> 46;
                case 221 -> 222;
                case 222 -> 111;
                case 223 -> 140;
                case 224 -> 98;
                case 225 -> 8;
                case 226 -> 60;
                case 227 -> 163;
                case 228 -> 249;
                case 229 -> 133;
                case 230 -> 56;
                case 231 -> 83;
                case 232 -> 4;
                case 233 -> 109;
                case 234 -> 226;
                case 235 -> 85;
                case 236 -> 240;
                case 237 -> 215;
                case 238 -> 162;
                case 239 -> 181;
                case 240 -> 147;
                case 241 -> 125;
                case 242 -> 26;
                case 243 -> 28;
                case 244 -> 39;
                case 245 -> 164;
                case 246 -> 120;
                case 247 -> 66;
                case 248 -> 70;
                case 249 -> 42;
                case 250 -> 14;
                case 251 -> 158;
                case 252 -> 62;
                case 253 -> 49;
                case 254 -> 103;
                default -> 130;
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
            CacheXImpl_3.strArr_1[n3] = new String(charArray).intern();
        }
        return CacheXImpl_3.strArr_1[n3];
    }
}
