// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import java.lang.invoke.CallSite;
import java.lang.reflect.UndeclaredThrowableException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.SwitchBootstraps;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2586;
import java.util.Iterator;
import net.minecraft.class_2669;
import net.minecraft.class_2627;
import net.minecraft.class_2595;
import java.util.Objects;
import net.minecraft.class_2636;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub;
import net.minecraft.class_746;
import net.minecraft.class_1707;
import net.minecraft.class_1799;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import net.minecraft.class_239$class_240;
import net.minecraft.class_4050;
import net.minecraft.class_2248;
import net.minecraft.class_2246;
import net.minecraft.class_2661;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_1703;
import net.minecraft.class_437;
import net.minecraft.class_476;
import net.minecraft.class_241;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_490;
import net.minecraft.class_1802;
import net.minecraft.class_2818;
import java.util.function.Consumer;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_9;
import net.minecraft.class_7923;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_2;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3;
import com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_5;
import com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_4;
import net.minecraft.class_2350;
import com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import net.minecraft.class_1792;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_1;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class BuffPImpl_1 extends AbstractLoadF implements BlockEImpl_1
{
    private static final int intValue = -59;
    private static final long longValue = 5000L;
    private static final class_1792[] class_1792Array;
    public final RenderASub_15<Initializer_12> wrapJ;
    public final RenderASub_1 buffC;
    private final RenderASub bindK;
    private final RenderASub bindK_1;
    private final RenderASub bindK_2;
    private final RenderASub bindK_3;
    private final RenderASub_1 buffC_1;
    private final RenderASub bindK_4;
    public Initializer dataA;
    public com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1 eventB;
    public class_2350 class2350;
    public Initializer_4 loadE;
    public Initializer_4 loadE_1;
    boolean boolFlag;
    Initializer_5 syncF;
    int intValue_1;
    com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer cacheD;
    int intValue_2;
    com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3 eventC;
    int intValue_3;
    com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1 configA;
    int intValue_4;
    int intValue_5;
    int intValue_6;
    class_2338 class2338;
    int intValue_7;
    int intValue_8;
    int intValue_9;
    int intValue_10;
    int intValue_11;
    int intValue_12;
    boolean boolFlag_1;
    boolean boolFlag_2;
    boolean boolFlag_3;
    private boolean boolFlag_4;
    private class_2338 class2338_1;
    private boolean boolFlag_5;
    private final int intValue_13 = 0;
    private int intValue_14;
    private int intValue_15;
    private boolean boolFlag_6;
    private boolean boolFlag_7;
    private class_2350 class2350_1;
    private int intValue_16;
    private Initializer_2 dataB;
    private Initializer_18 viewR;
    private long longValue_1;
    private boolean boolFlag_8;
    private class_2338 class2338_2;
    static final boolean boolFlag_9;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public BuffPImpl_1() {
        super(createString(19024, -17932), createString(19033, -13280), com.target.mod.compat.sub1.sub1.sub5.Initializer.stepF);
        this.wrapJ = new RenderASub_15<Initializer_12>(createString(19023, -13763), Initializer_12.AMETHYST, Initializer_12.class);
        this.buffC = new RenderASub_1(createString(19032, -30803), false);
        this.bindK = new RenderASub(createString(19026, 27730), 2.0, 1.0, 9.0, 1.0);
        this.bindK_1 = new RenderASub(createString(19029, 2416), 3.0, 1.0, 9.0, 1.0);
        this.bindK_2 = new RenderASub(createString(19035, 4047), 4.0, 1.0, 9.0, 1.0);
        this.bindK_3 = new RenderASub(createString(19038, -7845), 5.0, 1.0, 9.0, 1.0);
        this.buffC_1 = new RenderASub_1(createString(19034, -31065), true);
        this.bindK_4 = new RenderASub(createString(19019, 17385), 3.0, 0.0, 10.0, 1.0);
        this.loadE = Initializer_4.NONE;
        this.loadE_1 = Initializer_4.NONE;
        this.boolFlag = false;
        this.syncF = Initializer_5.NONE;
        this.intValue_1 = 0;
        this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
        this.intValue_2 = 0;
        this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
        this.intValue_3 = 0;
        this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
        this.intValue_4 = 0;
        this.intValue_5 = 0;
        this.intValue_6 = 0;
        this.intValue_7 = 0;
        this.intValue_8 = 0;
        this.intValue_9 = 0;
        this.intValue_10 = 0;
        this.intValue_11 = 0;
        this.boolFlag_2 = true;
        this.boolFlag_4 = false;
        this.class2338_1 = null;
        this.boolFlag_5 = false;
        this.intValue_14 = 0;
        this.intValue_15 = 0;
        this.boolFlag_6 = false;
        this.boolFlag_7 = false;
        this.intValue_16 = 0;
        this.dataB = Initializer_2.ENSURE;
        this.viewR = Initializer_18.viewR;
        this.longValue_1 = 0L;
        this.boolFlag_8 = false;
        this.class2338_2 = null;
        this.setRenderaarr(this.wrapJ, this.buffC, this.bindK, this.bindK_1, this.bindK_2, this.bindK_3, this.buffC_1, this.bindK_4);
    }
    
    private static int method_int(final int n) {
        if (n < 9) {
            return 36 + n;
        }
        return n;
    }
    
    public static BuffPImpl_1 getSlotr() {
        return com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF.computeCalcg_1(BuffPImpl_1.class);
    }
    
    private int method_int_1(final int n) {
        if (!this.buffC_1.getValue()) {
            return n;
        }
        return Math.max(1, n + ((int)(Math.random() * this.bindK_4.getValue() * 2.0) - this.bindK_4.getValue().intValue()));
    }
    
    private boolean isEnabled() {
        return BuffPImpl_1.class310.field_1724 != null && class_7923.field_41178.method_10221((Object)BuffPImpl_1.class310.field_1724.method_6047().method_7909()).toString().contains(createString(19027, -23379));
    }
    
    private void execute_2() {
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1687 == null) {
            return;
        }
        this.intValue_7 = 0;
        this.intValue_8 = 0;
        this.intValue_9 = 0;
        this.intValue_10 = 0;
        this.intValue_11 = 0;
        this.intValue_12 = 0;
        this.boolFlag_1 = false;
        Initializer_9.getStream().forEach(this::lambda$scanForBase$0);
        boolean b = false;
        String s = "";
        if (this.intValue_7 >= 35) {
            b = true;
            s = createString(19031, 21182);
        }
        else if (this.intValue_11 >= 35) {
            b = true;
            s = createString(19021, -27379);
        }
        else if (this.intValue_12 >= 10) {
            s = createString(19021, -27379);
        }
        else if (this.boolFlag_1 && this.buffC.getValue()) {
            b = true;
            s = createString(19017, 14485);
        }
        if (b) {
            this.setString(createString(19037, 5003) + s);
        }
    }
    
    private int getInt() {
        if (BuffPImpl_1.class310.field_1724 == null) {
            return -1;
        }
        for (int i = 0; i < 9; ++i) {
            if (class_7923.field_41178.method_10221((Object)BuffPImpl_1.class310.field_1724.method_31548().method_5438(i).method_7909()).toString().contains(createString(19036, 9840))) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean isEnabled_1() {
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1761 == null) {
            return false;
        }
        if (this.isEnabled_9()) {
            return true;
        }
        if (!this.isEnabled_7()) {
            return false;
        }
        final int n = this.bindK_2.getValue().intValue() - 1;
        if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(n).method_7909() == class_1802.field_8287) {
            return true;
        }
        int n2 = -1;
        for (int i = 0; i < 36; ++i) {
            if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(i).method_7909() == class_1802.field_8287) {
                n2 = i;
                break;
            }
        }
        if (n2 == -1) {
            this.loadE = Initializer_4.BUYXP;
            return false;
        }
        if (!(BuffPImpl_1.class310.field_1755 instanceof class_490)) {
            BuffPImpl_1.class310.execute(BuffPImpl_1::lambda$ensureXpInHotbarSlot$1);
            return false;
        }
        final int field_7763 = BuffPImpl_1.class310.field_1724.field_7498.field_7763;
        final int method_int = method_int(n2);
        final int method_int2 = method_int(n);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int2, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        this.boolFlag_5 = true;
        return false;
    }
    
    public boolean isEnabled_2() {
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1761 == null) {
            return false;
        }
        final int n = this.bindK_1.getValue().intValue() - 1;
        if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(n).method_7909() == class_1802.field_8634) {
            return true;
        }
        int n2 = -1;
        for (int i = 0; i < 36; ++i) {
            if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(i).method_7909() == class_1802.field_8634) {
                n2 = i;
                break;
            }
        }
        if (n2 == -1) {
            this.loadE = Initializer_4.BUYPEARL;
            return false;
        }
        if (!(BuffPImpl_1.class310.field_1755 instanceof class_490)) {
            BuffPImpl_1.class310.execute(BuffPImpl_1::lambda$ensurePearlInHotbarSlot$2);
            return false;
        }
        final int field_7763 = BuffPImpl_1.class310.field_1724.field_7498.field_7763;
        final int method_int = method_int(n2);
        final int method_int2 = method_int(n);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int2, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        this.boolFlag_5 = true;
        return false;
    }
    
    public boolean isEnabled_3() {
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1761 == null) {
            return false;
        }
        final int n = this.bindK_3.getValue().intValue() - 1;
        if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(n).method_7909() == class_1802.field_8071) {
            return true;
        }
        int n2 = -1;
        for (int i = 0; i < 36; ++i) {
            if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(i).method_7909() == class_1802.field_8071) {
                n2 = i;
                break;
            }
        }
        if (n2 == -1) {
            this.loadE = Initializer_4.BUYCARROT;
            return false;
        }
        if (!(BuffPImpl_1.class310.field_1755 instanceof class_490)) {
            BuffPImpl_1.class310.execute(BuffPImpl_1::lambda$ensureGoldenCarrotInHotbarSlot$3);
            return false;
        }
        final int field_7763 = BuffPImpl_1.class310.field_1724.field_7498.field_7763;
        final int method_int = method_int(n2);
        final int method_int2 = method_int(n);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int2, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        this.boolFlag_5 = true;
        return false;
    }
    
    public boolean isEnabled_4() {
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1761 == null) {
            return false;
        }
        final int n = this.bindK.getValue().intValue() - 1;
        if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(n).method_7909() == class_1802.field_8281) {
            return true;
        }
        int n2 = -1;
        for (int i = 0; i < 36; ++i) {
            if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(i).method_7909() == class_1802.field_8281) {
                n2 = i;
                break;
            }
        }
        if (n2 == -1) {
            this.loadE = Initializer_4.BUYOBI;
            return false;
        }
        if (!(BuffPImpl_1.class310.field_1755 instanceof class_490)) {
            BuffPImpl_1.class310.execute(BuffPImpl_1::lambda$ensureObsidianInHotbarSlot$4);
            return false;
        }
        final int field_7763 = BuffPImpl_1.class310.field_1724.field_7498.field_7763;
        final int method_int = method_int(n2);
        final int method_int2 = method_int(n);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int2, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        this.boolFlag_5 = true;
        return false;
    }
    
    public void execute_3() {
        switch (Initializer_17.intArr[this.dataB.ordinal()]) {
            case 1: {
                if (!this.isEnabled_1()) {
                    return;
                }
                this.dataB = Initializer_2.ROTATE_DOWN;
                break;
            }
            case 2: {
                if (Math.abs(BuffPImpl_1.class310.field_1724.method_36455() - 90.0f) <= 0.05) {
                    this.dataB = Initializer_2.OFFHAND_XP;
                    break;
                }
                if (!this.boolFlag) {
                    this.eventB.processAll(BuffPImpl_1.class310.field_1724.method_36454(), 90.0f, this::lambda$handleMend$5);
                    break;
                }
                break;
            }
            case 3: {
                if (this.isEnabled_9()) {
                    this.dataB = Initializer_2.THROW_XP;
                    return;
                }
                final int field_7763 = BuffPImpl_1.class310.field_1724.field_7498.field_7763;
                final int n = 45;
                this.intValue_16 = 40;
                BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int(this.bindK_2.getValue().intValue() - 1), 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                BuffPImpl_1.class310.field_1761.method_2906(field_7763, n, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                if (BuffPImpl_1.class310.field_1724.field_7512.method_34255().method_7909() == class_1802.field_8288) {
                    BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int(this.bindK_2.getValue().intValue() - 1), 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                }
                this.dataB = Initializer_2.THROW_XP;
                break;
            }
            case 4: {
                if (!this.isEnabled_9()) {
                    this.dataB = Initializer_2.REOFFHAND_TOTEM;
                    return;
                }
                if (this.isEnabled_10()) {
                    this.dataB = Initializer_2.REOFFHAND_TOTEM;
                    return;
                }
                this.intValue_16 = 40;
                this.setBool_1(true);
                BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.getInt();
                Initializer_8.execute();
                break;
            }
            case 5: {
                this.setBool_1(false);
                if (!this.isEnabled_8()) {
                    this.setInt(this.getInt_1());
                    this.intValue_16 = 40;
                    return;
                }
                this.dataB = Initializer_2.ROTATE_BACK;
                break;
            }
            case 6: {
                final class_241 computeClass_241 = this.computeClass_241(this.class2350);
                if (!this.boolFlag) {
                    this.eventB.processAll(computeClass_241.field_1343, computeClass_241.field_1342, this::lambda$handleMend$6);
                }
                break;
            }
            case 7: {
                this.dataB = Initializer_2.ENSURE;
                this.loadE = this.loadE_1;
                this.loadE_1 = Initializer_4.NONE;
                break;
            }
        }
    }
    
    public void execute_4() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        Label_1013: {
            Label_0973: {
                Label_0923: {
                    Label_0883: {
                        Label_0765: {
                            Label_0725: {
                                Label_0683: {
                                    Label_0643: {
                                        Label_0519: {
                                            Label_0479: {
                                                Label_0355: {
                                                    Label_0315: {
                                                        Label_0191: {
                                                            Label_0151: {
                                                                Label_0107: {
                                                                    if (stringarrArray != null) {
                                                                        switch (Initializer_17.intArr_1[this.syncF.ordinal()]) {
                                                                            case 1: {
                                                                                this.syncF = Initializer_5.OPENSHOP;
                                                                                break;
                                                                            }
                                                                            case 2: {
                                                                                break Label_0107;
                                                                            }
                                                                            case 3: {
                                                                                break Label_0151;
                                                                            }
                                                                            case 4: {
                                                                                break Label_0191;
                                                                            }
                                                                            case 5: {
                                                                                break Label_0315;
                                                                            }
                                                                            case 6: {
                                                                                break Label_0355;
                                                                            }
                                                                            case 7: {
                                                                                break Label_0479;
                                                                            }
                                                                            case 8: {
                                                                                break Label_0519;
                                                                            }
                                                                            case 9: {
                                                                                break Label_0643;
                                                                            }
                                                                            case 10: {
                                                                                break Label_0683;
                                                                            }
                                                                            case 11: {
                                                                                break Label_0725;
                                                                            }
                                                                            case 12: {
                                                                                break Label_0765;
                                                                            }
                                                                            case 13: {
                                                                                break Label_0883;
                                                                            }
                                                                            case 14: {
                                                                                break Label_0923;
                                                                            }
                                                                            case 15: {
                                                                                break Label_0973;
                                                                            }
                                                                            case 16: {
                                                                                break Label_1013;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (stringarrArray != null) {
                                                                        return;
                                                                    }
                                                                }
                                                                BuffPImpl_1.class310.method_1562().method_45730(createString(19030, 14165));
                                                                this.intValue_1 = 0;
                                                                this.intValue_5 = this.method_int_1(7);
                                                                this.syncF = Initializer_5.WAIT1;
                                                                if (stringarrArray != null) {
                                                                    return;
                                                                }
                                                            }
                                                            BuffPImpl_1 buffPImpl_1 = this;
                                                            if (stringarrArray != null) {
                                                                if (this.intValue_1 < this.intValue_5) {
                                                                    ++this.intValue_1;
                                                                    if (stringarrArray != null) {
                                                                        return;
                                                                    }
                                                                }
                                                                buffPImpl_1 = this;
                                                            }
                                                            buffPImpl_1.syncF = Initializer_5.CLICKGEAR;
                                                            if (stringarrArray != null) {
                                                                return;
                                                            }
                                                        }
                                                        final class_437 field_1755 = BuffPImpl_1.class310.field_1755;
                                                        if (stringarrArray != null) {
                                                            if (field_1755 instanceof final class_476 class_476) {
                                                                final class_1703 method_17577 = class_476.method_17577();
                                                                if (stringarrArray != null) {
                                                                    if (method_17577.method_7611(11).method_7677().method_31574(class_1802.field_20399)) {
                                                                        BuffPImpl_1.class310.field_1761.method_2906(method_17577.field_7763, 13, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                                                                        if (stringarrArray != null) {
                                                                            this.syncF = Initializer_5.WAIT2;
                                                                            this.intValue_1 = 0;
                                                                            this.intValue_5 = this.method_int_1(7);
                                                                            if (stringarrArray == null) {
                                                                                break Label_0315;
                                                                            }
                                                                            return;
                                                                        }
                                                                    }
                                                                    this.syncF = Initializer_5.NONE;
                                                                }
                                                                return;
                                                            }
                                                            this.syncF = Initializer_5.NONE;
                                                        }
                                                        return;
                                                    }
                                                    BuffPImpl_1 buffPImpl_2 = this;
                                                    if (stringarrArray != null) {
                                                        if (this.intValue_1 < this.intValue_5) {
                                                            ++this.intValue_1;
                                                            if (stringarrArray != null) {
                                                                return;
                                                            }
                                                        }
                                                        buffPImpl_2 = this;
                                                    }
                                                    buffPImpl_2.syncF = Initializer_5.CLICKXP;
                                                    if (stringarrArray != null) {
                                                        return;
                                                    }
                                                }
                                                final class_437 field_1756 = BuffPImpl_1.class310.field_1755;
                                                if (stringarrArray != null) {
                                                    if (field_1756 instanceof final class_476 class_477) {
                                                        final class_1703 method_17578 = class_477.method_17577();
                                                        if (stringarrArray != null) {
                                                            if (method_17578.method_7611(16).method_7677().method_31574(class_1802.field_8287)) {
                                                                BuffPImpl_1.class310.field_1761.method_2906(method_17578.field_7763, 16, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                                                                if (stringarrArray != null) {
                                                                    this.syncF = Initializer_5.WAIT3;
                                                                    this.intValue_1 = 0;
                                                                    this.intValue_5 = this.method_int_1(7);
                                                                    if (stringarrArray == null) {
                                                                        break Label_0479;
                                                                    }
                                                                    return;
                                                                }
                                                            }
                                                            this.syncF = Initializer_5.NONE;
                                                        }
                                                        return;
                                                    }
                                                    this.syncF = Initializer_5.NONE;
                                                }
                                                return;
                                            }
                                            BuffPImpl_1 buffPImpl_3 = this;
                                            if (stringarrArray != null) {
                                                if (this.intValue_1 < this.intValue_5) {
                                                    ++this.intValue_1;
                                                    if (stringarrArray != null) {
                                                        return;
                                                    }
                                                }
                                                buffPImpl_3 = this;
                                            }
                                            buffPImpl_3.syncF = Initializer_5.CLICKSTACK;
                                            if (stringarrArray != null) {
                                                return;
                                            }
                                        }
                                        final class_437 field_1757 = BuffPImpl_1.class310.field_1755;
                                        if (stringarrArray != null) {
                                            if (field_1757 instanceof final class_476 class_478) {
                                                final class_1703 method_17579 = class_478.method_17577();
                                                if (stringarrArray != null) {
                                                    if (method_17579.method_7611(17).method_7677().method_31574(class_1802.field_8581)) {
                                                        BuffPImpl_1.class310.field_1761.method_2906(method_17579.field_7763, 17, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                                                        if (stringarrArray != null) {
                                                            this.syncF = Initializer_5.WAIT4;
                                                            this.intValue_1 = 0;
                                                            this.intValue_5 = this.method_int_1(7);
                                                            if (stringarrArray == null) {
                                                                break Label_0643;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    this.syncF = Initializer_5.NONE;
                                                }
                                                return;
                                            }
                                            this.syncF = Initializer_5.NONE;
                                        }
                                        return;
                                    }
                                    BuffPImpl_1 buffPImpl_4 = this;
                                    if (stringarrArray != null) {
                                        if (this.intValue_1 < this.intValue_5) {
                                            ++this.intValue_1;
                                            if (stringarrArray != null) {
                                                return;
                                            }
                                        }
                                        buffPImpl_4 = this;
                                    }
                                    buffPImpl_4.syncF = Initializer_5.DROPITEMS;
                                    if (stringarrArray != null) {
                                        return;
                                    }
                                }
                                BuffPImpl_1 buffPImpl_5 = this;
                                if (stringarrArray != null) {
                                    if (this.isEnabled_11()) {
                                        this.isEnabled_12();
                                    }
                                    this.syncF = Initializer_5.WAIT5;
                                    this.intValue_1 = 0;
                                    buffPImpl_5 = this;
                                }
                                buffPImpl_5.intValue_5 = this.method_int_1(7);
                                if (stringarrArray != null) {
                                    return;
                                }
                            }
                            BuffPImpl_1 buffPImpl_6 = this;
                            if (stringarrArray != null) {
                                if (this.intValue_1 < this.intValue_5) {
                                    ++this.intValue_1;
                                    if (stringarrArray != null) {
                                        return;
                                    }
                                }
                                buffPImpl_6 = this;
                            }
                            buffPImpl_6.syncF = Initializer_5.syncF;
                            if (stringarrArray != null) {
                                return;
                            }
                        }
                        final class_437 field_1758 = BuffPImpl_1.class310.field_1755;
                        if (stringarrArray != null) {
                            if (field_1758 instanceof final class_476 class_479) {
                                final class_1703 method_17580 = class_479.method_17577();
                                if (stringarrArray != null) {
                                    if (method_17580.method_7611(23).method_7681()) {
                                        BuffPImpl_1.class310.field_1761.method_2906(method_17580.field_7763, 23, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                                        if (stringarrArray != null) {
                                            this.syncF = Initializer_5.WAIT6;
                                            this.intValue_1 = 0;
                                            this.intValue_5 = this.method_int_1(7);
                                            if (stringarrArray == null) {
                                                break Label_0883;
                                            }
                                            return;
                                        }
                                    }
                                    this.syncF = Initializer_5.NONE;
                                }
                                return;
                            }
                            this.syncF = Initializer_5.NONE;
                        }
                        return;
                    }
                    BuffPImpl_1 buffPImpl_7 = this;
                    if (stringarrArray != null) {
                        if (this.intValue_1 < this.intValue_5) {
                            ++this.intValue_1;
                            if (stringarrArray != null) {
                                return;
                            }
                        }
                        buffPImpl_7 = this;
                    }
                    buffPImpl_7.syncF = Initializer_5.CLOSE;
                    if (stringarrArray != null) {
                        return;
                    }
                }
                final class_310 class310 = BuffPImpl_1.class310;
                Label_0947: {
                    if (stringarrArray != null) {
                        if (class310.field_1755 == null) {
                            break Label_0947;
                        }
                        final class_310 class311 = BuffPImpl_1.class310;
                    }
                    class310.execute(BuffPImpl_1::lambda$handleXPBuy$7);
                }
                this.syncF = Initializer_5.WAIT7;
                this.intValue_1 = 0;
                this.intValue_5 = this.method_int_1(7);
                if (stringarrArray != null) {
                    return;
                }
            }
            BuffPImpl_1 buffPImpl_8 = this;
            if (stringarrArray != null) {
                if (this.intValue_1 < this.intValue_5) {
                    ++this.intValue_1;
                    if (stringarrArray != null) {
                        return;
                    }
                }
                buffPImpl_8 = this;
            }
            buffPImpl_8.syncF = Initializer_5.RESET;
            if (stringarrArray != null) {
                return;
            }
        }
        this.syncF = Initializer_5.NONE;
        this.intValue_1 = 0;
        this.loadE = Initializer_4.AUTOMEND;
    }
    
    public void execute_5() {
        switch (Initializer_17.intArr_2[this.cacheD.ordinal()]) {
            case 1: {
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.OPENSHOP;
                break;
            }
            case 2: {
                BuffPImpl_1.class310.method_1562().method_45730(createString(19016, -19216));
                this.intValue_2 = 0;
                this.intValue_5 = this.method_int_1(7);
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.WAIT1;
                break;
            }
            case 3: {
                if (this.intValue_2 < this.intValue_5) {
                    ++this.intValue_2;
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.CLICKGEAR;
                break;
            }
            case 4: {
                final class_437 field_1755 = BuffPImpl_1.class310.field_1755;
                if (!(field_1755 instanceof class_476)) {
                    this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
                    return;
                }
                final class_1703 method_17577 = ((class_476)field_1755).method_17577();
                if (method_17577.method_7611(11).method_7677().method_31574(class_1802.field_20399)) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17577.field_7763, 13, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.WAIT2;
                    this.intValue_2 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
                return;
            }
            case 5: {
                if (this.intValue_2 < this.intValue_5) {
                    ++this.intValue_2;
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.CLICKPEARL;
                break;
            }
            case 6: {
                final class_437 field_1756 = BuffPImpl_1.class310.field_1755;
                if (!(field_1756 instanceof class_476)) {
                    this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
                    return;
                }
                final class_1703 method_17578 = ((class_476)field_1756).method_17577();
                if (method_17578.method_7611(16).method_7677().method_31574(class_1802.field_8287)) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17578.field_7763, 14, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.WAIT3;
                    this.intValue_2 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
                return;
            }
            case 7: {
                if (this.intValue_2 < this.intValue_5) {
                    ++this.intValue_2;
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.CLICKSTACK;
                break;
            }
            case 8: {
                final class_437 field_1757 = BuffPImpl_1.class310.field_1755;
                if (!(field_1757 instanceof class_476)) {
                    this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
                    return;
                }
                final class_1703 method_17579 = ((class_476)field_1757).method_17577();
                if (method_17579.method_7611(17).method_7677().method_31574(class_1802.field_8581)) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17579.field_7763, 17, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.WAIT4;
                    this.intValue_2 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
                return;
            }
            case 9: {
                if (this.intValue_2 < this.intValue_5) {
                    ++this.intValue_2;
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.DROPITEMS;
                break;
            }
            case 10: {
                if (this.isEnabled_11()) {
                    this.isEnabled_12();
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.WAIT5;
                this.intValue_2 = 0;
                this.intValue_5 = this.method_int_1(7);
                break;
            }
            case 11: {
                if (this.intValue_2 < this.intValue_5) {
                    ++this.intValue_2;
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.cacheD;
                break;
            }
            case 12: {
                final class_437 field_1758 = BuffPImpl_1.class310.field_1755;
                if (!(field_1758 instanceof class_476)) {
                    this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
                    return;
                }
                final class_1703 method_17580 = ((class_476)field_1758).method_17577();
                if (method_17580.method_7611(23).method_7681()) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17580.field_7763, 23, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.WAIT6;
                    this.intValue_2 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
                return;
            }
            case 13: {
                if (this.intValue_2 < this.intValue_5) {
                    ++this.intValue_2;
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.CLOSE;
                break;
            }
            case 14: {
                if (BuffPImpl_1.class310.field_1755 != null) {
                    BuffPImpl_1.class310.execute(BuffPImpl_1::lambda$handlePearlBuy$8);
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.WAIT7;
                this.intValue_2 = 0;
                this.intValue_5 = this.method_int_1(7);
                break;
            }
            case 15: {
                if (this.intValue_2 < this.intValue_5) {
                    ++this.intValue_2;
                    break;
                }
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.RESET;
                break;
            }
            case 16: {
                this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
                this.intValue_2 = 0;
                this.loadE = Initializer_4.PEARL;
                break;
            }
        }
    }
    
    public void execute_6() {
        switch (Initializer_17.intArr_3[this.eventC.ordinal()]) {
            case 1: {
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.OPENSHOP;
                break;
            }
            case 2: {
                BuffPImpl_1.class310.method_1562().method_45730(createString(19030, 14165));
                this.intValue_3 = 0;
                this.intValue_5 = this.method_int_1(7);
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.WAIT1;
                break;
            }
            case 3: {
                if (this.intValue_3 < this.intValue_5) {
                    ++this.intValue_3;
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.CLICKGEAR;
                break;
            }
            case 4: {
                final class_437 field_1755 = BuffPImpl_1.class310.field_1755;
                if (!(field_1755 instanceof class_476)) {
                    this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
                    return;
                }
                final class_1703 method_17577 = ((class_476)field_1755).method_17577();
                if (method_17577.method_7611(11).method_7677().method_31574(class_1802.field_20399)) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17577.field_7763, 13, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.WAIT2;
                    this.intValue_3 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
                return;
            }
            case 5: {
                if (this.intValue_3 < this.intValue_5) {
                    ++this.intValue_3;
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.CLICKOBI;
                break;
            }
            case 6: {
                final class_437 field_1756 = BuffPImpl_1.class310.field_1755;
                if (!(field_1756 instanceof class_476)) {
                    this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
                    return;
                }
                final class_1703 method_17578 = ((class_476)field_1756).method_17577();
                if (method_17578.method_7611(16).method_7677().method_31574(class_1802.field_8287)) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17578.field_7763, 9, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.WAIT3;
                    this.intValue_3 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
                return;
            }
            case 7: {
                if (this.intValue_3 < this.intValue_5) {
                    ++this.intValue_3;
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.CLICKSTACK;
                break;
            }
            case 8: {
                final class_437 field_1757 = BuffPImpl_1.class310.field_1755;
                if (!(field_1757 instanceof class_476)) {
                    this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
                    return;
                }
                final class_1703 method_17579 = ((class_476)field_1757).method_17577();
                if (method_17579.method_7611(17).method_7677().method_31574(class_1802.field_8581)) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17579.field_7763, 17, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.WAIT4;
                    this.intValue_3 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
                return;
            }
            case 9: {
                if (this.intValue_3 < this.intValue_5) {
                    ++this.intValue_3;
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.DROPITEMS;
                break;
            }
            case 10: {
                if (this.isEnabled_11()) {
                    this.isEnabled_12();
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.WAIT5;
                this.intValue_3 = 0;
                this.intValue_5 = this.method_int_1(7);
                break;
            }
            case 11: {
                if (this.intValue_3 < this.intValue_5) {
                    ++this.intValue_3;
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.eventC;
                break;
            }
            case 12: {
                final class_437 field_1758 = BuffPImpl_1.class310.field_1755;
                if (!(field_1758 instanceof class_476)) {
                    this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
                    return;
                }
                final class_1703 method_17580 = ((class_476)field_1758).method_17577();
                if (method_17580.method_7611(23).method_7681()) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17580.field_7763, 23, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.WAIT6;
                    this.intValue_3 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
                return;
            }
            case 13: {
                if (this.intValue_3 < this.intValue_5) {
                    ++this.intValue_3;
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.CLOSE;
                break;
            }
            case 14: {
                if (BuffPImpl_1.class310.field_1755 != null) {
                    BuffPImpl_1.class310.execute(BuffPImpl_1::lambda$handleObiBuy$9);
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.WAIT7;
                this.intValue_3 = 0;
                this.intValue_5 = this.method_int_1(7);
                break;
            }
            case 15: {
                if (this.intValue_3 < this.intValue_5) {
                    ++this.intValue_3;
                    break;
                }
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.RESET;
                break;
            }
            case 16: {
                this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
                this.intValue_3 = 0;
                this.loadE = Initializer_4.MINING;
                break;
            }
        }
    }
    
    public void execute_7() {
        switch (Initializer_17.intArr_4[this.configA.ordinal()]) {
            case 1: {
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.OPENSHOP;
                break;
            }
            case 2: {
                BuffPImpl_1.class310.method_1562().method_45730(createString(19030, 14165));
                this.intValue_4 = 0;
                this.intValue_5 = this.method_int_1(7);
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.WAIT1;
                break;
            }
            case 3: {
                if (this.intValue_4 < this.intValue_5) {
                    ++this.intValue_4;
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.CLICKFOOD;
                break;
            }
            case 4: {
                final class_437 field_1755 = BuffPImpl_1.class310.field_1755;
                if (!(field_1755 instanceof class_476)) {
                    this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
                    return;
                }
                final class_1703 method_17577 = ((class_476)field_1755).method_17577();
                if (method_17577.method_7611(11).method_7677().method_31574(class_1802.field_20399)) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17577.field_7763, 14, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.WAIT2;
                    this.intValue_4 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
                return;
            }
            case 5: {
                if (this.intValue_4 < this.intValue_5) {
                    ++this.intValue_4;
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.CLICKCARROT;
                break;
            }
            case 6: {
                final class_437 field_1756 = BuffPImpl_1.class310.field_1755;
                if (!(field_1756 instanceof class_476)) {
                    this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
                    return;
                }
                final class_1703 method_17578 = ((class_476)field_1756).method_17577();
                if (method_17578.method_7611(16).method_7677().method_31574(class_1802.field_8071)) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17578.field_7763, 16, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.WAIT3;
                    this.intValue_4 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
                return;
            }
            case 7: {
                if (this.intValue_4 < this.intValue_5) {
                    ++this.intValue_4;
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.CLICKSTACK;
                break;
            }
            case 8: {
                final class_437 field_1757 = BuffPImpl_1.class310.field_1755;
                if (!(field_1757 instanceof class_476)) {
                    this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
                    return;
                }
                final class_1703 method_17579 = ((class_476)field_1757).method_17577();
                if (method_17579.method_7611(17).method_7677().method_31574(class_1802.field_8581)) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17579.field_7763, 17, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.WAIT4;
                    this.intValue_4 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
                return;
            }
            case 9: {
                if (this.intValue_4 < this.intValue_5) {
                    ++this.intValue_4;
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.DROPITEMS;
                break;
            }
            case 10: {
                if (this.isEnabled_11()) {
                    this.isEnabled_12();
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.WAIT5;
                this.intValue_4 = 0;
                this.intValue_5 = this.method_int_1(7);
                break;
            }
            case 11: {
                if (this.intValue_4 < this.intValue_5) {
                    ++this.intValue_4;
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.configA;
                break;
            }
            case 12: {
                final class_437 field_1758 = BuffPImpl_1.class310.field_1755;
                if (!(field_1758 instanceof class_476)) {
                    this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
                    return;
                }
                final class_1703 method_17580 = ((class_476)field_1758).method_17577();
                if (method_17580.method_7611(23).method_7681()) {
                    BuffPImpl_1.class310.field_1761.method_2906(method_17580.field_7763, 23, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
                    this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.WAIT6;
                    this.intValue_4 = 0;
                    this.intValue_5 = this.method_int_1(7);
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
                return;
            }
            case 13: {
                if (this.intValue_4 < this.intValue_5) {
                    ++this.intValue_4;
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.CLOSE;
                break;
            }
            case 14: {
                if (BuffPImpl_1.class310.field_1755 != null) {
                    BuffPImpl_1.class310.execute(BuffPImpl_1::lambda$handleCarrotBuy$10);
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.WAIT7;
                this.intValue_4 = 0;
                this.intValue_5 = this.method_int_1(7);
                break;
            }
            case 15: {
                if (this.intValue_4 < this.intValue_5) {
                    ++this.intValue_4;
                    break;
                }
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.RESET;
                break;
            }
            case 16: {
                this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
                this.intValue_4 = 0;
                this.loadE = Initializer_4.AUTOEAT;
                break;
            }
        }
    }
    
    @Override
    public void execute() {
        super.execute();
        this.renderA.setClassAndPackd(BlockEImpl_1.class, this);
        this.loadE = Initializer_4.NONE;
        this.loadE_1 = Initializer_4.NONE;
        this.boolFlag = false;
        this.viewR = Initializer_18.viewR;
        this.longValue_1 = 0L;
        this.boolFlag_8 = false;
        this.intValue_16 = 0;
        this.intValue_6 = 0;
        this.class2338 = null;
        this.class2338_2 = null;
        this.boolFlag_4 = false;
        this.class2338_1 = null;
        this.dataB = Initializer_2.ENSURE;
        this.syncF = Initializer_5.NONE;
        this.intValue_1 = 0;
        this.cacheD = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer.NONE;
        this.intValue_2 = 0;
        this.eventC = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_3.NONE;
        this.intValue_3 = 0;
        this.configA = com.target.mod.compat.sub1.sub1.sub7.sub7.Initializer_1.NONE;
        this.intValue_4 = 0;
        this.boolFlag_7 = false;
        this.boolFlag_2 = true;
        if (BuffPImpl_1.class310 != null) {
            this.eventB = new com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1(BuffPImpl_1.class310);
            this.dataA = new Initializer(BuffPImpl_1.class310);
        }
        if (!this.isEnabled()) {
            final int int1 = this.getInt();
            if (int1 == -1) {
                this.setString(createString(19028, -31095));
                return;
            }
            BuffPImpl_1.class310.field_1724.method_31548().field_7545 = int1;
            Initializer_8.execute();
        }
        if (!this.isEnabled_8()) {
            if (this.getInt_1() == -1) {
                this.setString(createString(19022, -4000));
                return;
            }
            this.setInt(this.getInt_1());
        }
        this.class2350 = this.getClass_2350();
        final class_241 computeClass_241 = this.computeClass_241(this.class2350);
        if (!this.boolFlag) {
            this.eventB.processAll(computeClass_241.field_1343, computeClass_241.field_1342, this::lambda$onEnable$11);
        }
    }
    
    private void setString(final String s) {
        if (BuffPImpl_1.class310.field_1724 != null) {
            this.execute_2();
            BuffPImpl_1.class310.field_1724.field_3944.method_52781(new class_2661((class_2561)class_2561.method_43470(createString(19039, -13049) + s)));
        }
    }
    
    private boolean checkCondition(final class_2350 class_2350, final int n) {
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1687 == null || class_2350 == null) {
            return false;
        }
        final class_2338 method_24515 = BuffPImpl_1.class310.field_1724.method_24515();
        final int method_24516 = method_24515.method_10264();
        final int n2 = method_24516 - 1;
        int n3 = 0;
        switch (this.wrapJ.getValue().ordinal()) {
            case 1: {
                n3 = method_24516 + 2;
                break;
            }
            case 0: {
                n3 = method_24516 + 1;
                break;
            }
            default: {
                n3 = method_24516 + 3;
                break;
            }
        }
        final int n4 = 5 + n;
        final int n5 = (this.wrapJ.getValue() == Initializer_12.AMETHYST) ? 2 : 1;
        for (int i = n2; i <= n3; ++i) {
            for (int n6 = (i >= method_24516) ? n5 : 0, j = -n6; j <= n6; ++j) {
                for (int k = 1; k <= n4; ++k) {
                    final class_2338 method_24517 = method_24515.method_10079(class_2350, k);
                    class_2338 class_2351;
                    if (class_2350 == class_2350.field_11043 || class_2350 == class_2350.field_11035) {
                        class_2351 = new class_2338(method_24517.method_10263() + j, i, method_24517.method_10260());
                    }
                    else {
                        class_2351 = new class_2338(method_24517.method_10263(), i, method_24517.method_10260() + j);
                    }
                    final class_2248 method_24518 = BuffPImpl_1.class310.field_1687.method_8320(class_2351).method_26204();
                    if (this.checkClass_2248(method_24518)) {
                        return true;
                    }
                    if (i < method_24516 && method_24518 == class_2246.field_10124 && j == 0) {
                        class_2338 class_2352 = class_2351.method_10074();
                        while (BuffPImpl_1.class310.field_1687.method_8320(class_2352).method_26204() == class_2246.field_10124) {
                            class_2352 = class_2352.method_10074();
                            if (class_2352.method_10264() < -64) {
                                break;
                            }
                        }
                        if (this.checkClass_2248(BuffPImpl_1.class310.field_1687.method_8320(class_2352).method_26204())) {
                            return true;
                        }
                    }
                    if (this.checkClass_2248_1(method_24518) && i > method_24516 && j == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean isEnabled_5() {
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1687 == null) {
            return false;
        }
        final class_2338 method_24515 = BuffPImpl_1.class310.field_1724.method_24515();
        for (int i = 1; i <= 4; ++i) {
            if (this.checkClass_2248(BuffPImpl_1.class310.field_1687.method_8320(method_24515.method_10086(i)).method_26204())) {
                return true;
            }
        }
        return false;
    }
    
    public class_2350 computeClass_2350(final class_2350 class_2350) {
        return switch (Initializer_17.intArr_5[class_2350.ordinal()]) {
            case 1 -> class_2350.field_11039;
            case 2 -> class_2350.field_11035;
            case 3 -> class_2350.field_11034;
            case 4 -> class_2350.field_11043;
            default -> class_2350;
        };
    }
    
    public class_2350 computeClass_2350_1(final class_2350 class_2350) {
        return switch (Initializer_17.intArr_5[class_2350.ordinal()]) {
            case 1 -> class_2350.field_11034;
            case 4 -> class_2350.field_11035;
            case 3 -> class_2350.field_11039;
            case 2 -> class_2350.field_11043;
            default -> class_2350;
        };
    }
    
    public void execute_8() {
        if (!this.isEnabled_2()) {
            return;
        }
        if (this.boolFlag_2) {
            this.setBool_1(false);
            this.boolFlag_2 = false;
            BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.getInt();
            Initializer_8.execute();
            this.eventB.processAll(BuffPImpl_1.class310.field_1724.method_36454(), 0.0f, this::lambda$handlePearl$12);
        }
        final class_2338 method_24515 = BuffPImpl_1.class310.field_1724.method_24515();
        final class_2350 class2350 = this.class2350;
        final class_2338 method_24516 = method_24515.method_10079(class2350, 1);
        final class_2338 method_24517 = method_24516.method_10084().method_10093(class2350);
        final class_2338 method_24518 = method_24516.method_10086(3);
        if (BuffPImpl_1.class310.field_1687.method_8320(method_24516).method_26204() != class_2246.field_10124 && BuffPImpl_1.class310.field_1687.method_8320(method_24518).method_26204() != class_2246.field_10124) {
            BuffPImpl_1.class310.field_1690.field_1894.method_23481(false);
            this.setBool(true);
            if (BuffPImpl_1.class310.field_1687.method_8320(method_24517).method_26204() == class_2246.field_10124 && !this.boolFlag) {
                this.eventB.processAll(BuffPImpl_1.class310.field_1724.method_36454(), 11.0f, this::lambda$handlePearl$13);
            }
        }
        else if (BuffPImpl_1.class310.field_1690 != null) {
            BuffPImpl_1.class310.field_1690.field_1894.method_23481(true);
            this.setBool(true);
        }
        if (this.checkCondition(this.class2350, 0)) {
            if (!this.checkCondition(this.computeClass_2350(this.class2350), 5)) {
                this.class2350 = this.computeClass_2350(this.class2350);
                final class_241 computeClass_241 = this.computeClass_241(this.class2350);
                if (!this.boolFlag) {
                    this.eventB.processAll(computeClass_241.field_1343, computeClass_241.field_1342, this::lambda$handlePearl$14);
                }
            }
            else if (!this.checkCondition(this.computeClass_2350_1(this.class2350), 5)) {
                this.class2350 = this.computeClass_2350_1(this.class2350);
                final class_241 computeClass_242 = this.computeClass_241(this.class2350);
                if (!this.boolFlag) {
                    this.eventB.processAll(computeClass_242.field_1343, computeClass_242.field_1342, this::lambda$handlePearl$15);
                }
            }
            else {
                this.dataA.isEnabled();
                this.loadE = Initializer_4.GOABOVEHAZARD;
            }
        }
        final class_2338 method_24519 = BuffPImpl_1.class310.field_1724.method_24515().method_10093(this.class2350);
        final class_2338 method_24520 = method_24519.method_10084();
        final class_2338 method_24521 = method_24520.method_10084();
        final class_2338 method_24522 = BuffPImpl_1.class310.field_1724.method_24515().method_10086(2);
        if (BuffPImpl_1.class310.field_1687.method_8320(method_24519).method_26204() != class_2246.field_10124 && BuffPImpl_1.class310.field_1687.method_8320(method_24520).method_26204() == class_2246.field_10124 && BuffPImpl_1.class310.field_1687.method_8320(method_24521).method_26204() == class_2246.field_10124 && BuffPImpl_1.class310.field_1687.method_8320(method_24522).method_26204() == class_2246.field_10124) {
            BuffPImpl_1.class310.field_1690.field_1903.method_23481(true);
            this.boolFlag_3 = true;
        }
    }
    
    public void execute_9() {
        if (this.boolFlag) {
            this.execute_15();
            return;
        }
        if (BuffPImpl_1.class310.field_1724 != null && BuffPImpl_1.class310.field_1724.method_24515().method_10264() < -59) {
            this.dataA.isEnabled();
            this.loadE = Initializer_4.YRECOVERY;
            this.class2338_1 = null;
            this.boolFlag_4 = false;
            this.viewR = Initializer_18.viewR;
            this.longValue_1 = System.currentTimeMillis();
            return;
        }
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.getInt();
        Initializer_8.execute();
        if (BuffPImpl_1.class310.field_1724 != null && this.wrapJ.getValue() == Initializer_12.CRAWL && BuffPImpl_1.class310.field_1724.method_18376() != class_4050.field_18079) {
            this.loadE = Initializer_4.PEARL;
        }
        if (BuffPImpl_1.class310.field_1765.method_17783() == class_239$class_240.field_1333) {
            final class_2338 method_24515 = BuffPImpl_1.class310.field_1724.method_24515();
            if (method_24515.equals((Object)this.class2338)) {
                if (this.intValue_6 < 20) {
                    ++this.intValue_6;
                }
                else {
                    this.intValue_6 = 0;
                    if (!this.checkCondition(this.computeClass_2350(this.class2350), 5)) {
                        this.class2350_1 = this.class2350;
                        this.class2350 = this.computeClass_2350(this.class2350);
                        final class_241 computeClass_241 = this.computeClass_241(this.class2350);
                        if (!this.boolFlag) {
                            this.eventB.processAll(computeClass_241.field_1343, computeClass_241.field_1342, this::lambda$handleMining$16);
                        }
                    }
                    else if (!this.checkCondition(this.computeClass_2350_1(this.class2350), 5)) {
                        this.class2350_1 = this.class2350;
                        this.class2350 = this.computeClass_2350_1(this.class2350);
                        final class_241 computeClass_242 = this.computeClass_241(this.class2350);
                        if (!this.boolFlag) {
                            this.eventB.processAll(computeClass_242.field_1343, computeClass_242.field_1342, this::lambda$handleMining$17);
                        }
                    }
                    else {
                        this.dataA.isEnabled();
                        this.loadE = Initializer_4.GOABOVEHAZARD;
                    }
                }
            }
            else {
                this.intValue_6 = 0;
                this.class2338 = method_24515;
            }
        }
        else {
            this.intValue_6 = 0;
            this.class2338 = BuffPImpl_1.class310.field_1724.method_24515();
        }
        final class_2338 method_24516 = BuffPImpl_1.class310.field_1724.method_24515().method_10093(this.class2350);
        final class_2338 method_24517 = method_24516.method_10084();
        final class_2338 method_24518 = method_24517.method_10084();
        final class_2338 method_24519 = BuffPImpl_1.class310.field_1724.method_24515().method_10086(2);
        if (BuffPImpl_1.class310.field_1687.method_8320(method_24516).method_26204() != class_2246.field_10124 && BuffPImpl_1.class310.field_1687.method_8320(method_24517).method_26204() == class_2246.field_10124 && BuffPImpl_1.class310.field_1687.method_8320(method_24518).method_26204() == class_2246.field_10124 && BuffPImpl_1.class310.field_1687.method_8320(method_24519).method_26204() == class_2246.field_10124) {
            BuffPImpl_1.class310.field_1690.field_1903.method_23481(true);
            this.boolFlag_3 = true;
        }
        if (this.boolFlag_7 && !this.checkCondition(this.class2350_1, 0)) {
            this.class2350 = this.class2350_1;
            final class_241 computeClass_243 = this.computeClass_241(this.class2350);
            this.boolFlag_7 = false;
            if (!this.boolFlag) {
                this.eventB.processAll(computeClass_243.field_1343, computeClass_243.field_1342, this::lambda$handleMining$18);
            }
        }
        if (BuffPImpl_1.class310.field_1690 != null) {
            BuffPImpl_1.class310.field_1690.field_1894.method_23481(true);
            if (this.wrapJ.getValue() == Initializer_12.STANDING) {
                final class_239 field_1765 = BuffPImpl_1.class310.field_1765;
                if (field_1765 instanceof final class_3965 class_3965) {
                    this.setBool(class_3965.method_17777().method_10264() >= BuffPImpl_1.class310.field_1724.method_24515().method_10264());
                }
            }
            else {
                this.setBool(true);
            }
        }
        if (this.checkCondition(this.class2350, 0)) {
            if (!this.checkCondition(this.computeClass_2350(this.class2350), 5)) {
                this.boolFlag_7 = true;
                this.class2350_1 = this.class2350;
                this.class2350 = this.computeClass_2350(this.class2350);
                final class_241 computeClass_244 = this.computeClass_241(this.class2350);
                if (!this.boolFlag) {
                    this.eventB.processAll(computeClass_244.field_1343, computeClass_244.field_1342, this::lambda$handleMining$19);
                }
            }
            else if (!this.checkCondition(this.computeClass_2350_1(this.class2350), 5)) {
                this.boolFlag_7 = true;
                this.class2350_1 = this.class2350;
                this.class2350 = this.computeClass_2350_1(this.class2350);
                final class_241 computeClass_245 = this.computeClass_241(this.class2350);
                if (!this.boolFlag) {
                    this.eventB.processAll(computeClass_245.field_1343, computeClass_245.field_1342, this::lambda$handleMining$20);
                }
            }
            else {
                this.dataA.isEnabled();
                this.loadE = Initializer_4.GOABOVEHAZARD;
            }
        }
    }
    
    private boolean isEnabled_6() {
        return System.currentTimeMillis() - this.longValue_1 >= 5000L;
    }
    
    private void setViewr(final Initializer_18 viewR) {
        this.viewR = viewR;
        this.longValue_1 = System.currentTimeMillis();
        this.setBool(this.boolFlag_8 = false);
        this.setBool_1(false);
        BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
    }
    
    private void setClass_2338(final class_2338 class_2338) {
        for (int i = 1; i <= 3; ++i) {
            BuffPImpl_1.class310.field_1687.method_8320(class_2338.method_10086(i));
        }
    }
    
    private void execute_10() {
        this.class2338_2 = null;
        this.boolFlag_8 = false;
        this.viewR = Initializer_18.viewR;
        this.longValue_1 = System.currentTimeMillis();
    }
    
    public void execute_11() {
        if (!this.isEnabled_4()) {
            return;
        }
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1687 == null) {
            return;
        }
        if (this.isEnabled_5()) {
            this.setString(createString(19020, -30588));
            return;
        }
        if (this.class2338_2 == null) {
            this.setClass_2338(this.class2338_2 = BuffPImpl_1.class310.field_1724.method_24515());
            this.viewR = Initializer_18.viewR;
            this.longValue_1 = System.currentTimeMillis();
        }
        if (BuffPImpl_1.class310.field_1687.method_8320(BuffPImpl_1.class310.field_1724.method_24515().method_10074()).method_26204() != class_2246.field_10124 && !this.checkCondition(this.class2350, 0)) {
            final class_241 computeClass_241 = this.computeClass_241(this.class2350);
            if (!this.boolFlag) {
                this.eventB.processAll(computeClass_241.field_1343, computeClass_241.field_1342, this::lambda$handleGoAbove$21);
            }
            this.setBool(false);
            BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
            BuffPImpl_1.class310.field_1690.field_1904.method_23481(false);
            return;
        }
        if (this.boolFlag) {
            this.setBool(false);
            return;
        }
        switch (this.viewR.ordinal()) {
            case 0: {
                BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
                BuffPImpl_1.class310.field_1690.field_1904.method_23481(false);
                if (!this.boolFlag) {
                    this.eventB.processAll(BuffPImpl_1.class310.field_1724.method_36454(), -90.0f, this::lambda$handleGoAbove$22);
                }
                if (this.isEnabled_6()) {
                    this.setBool(false);
                    this.setViewr(Initializer_18.TOWER);
                    break;
                }
                break;
            }
            case 1: {
                this.setBool(false);
                if (!this.boolFlag_8 && !this.boolFlag) {
                    this.boolFlag_8 = true;
                    this.eventB.processAll(BuffPImpl_1.class310.field_1724.method_36454(), 90.0f, this::lambda$handleGoAbove$23);
                    Initializer_8.execute();
                }
                BuffPImpl_1.class310.field_1690.field_1903.method_23481(true);
                this.setBool_1(true);
                if (this.isEnabled_6()) {
                    BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
                    this.setBool_1(false);
                    this.setViewr(Initializer_18.viewR);
                    break;
                }
                break;
            }
        }
    }
    
    public void execute_12() {
        if (!this.isEnabled_4()) {
            return;
        }
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1687 == null) {
            return;
        }
        if (this.class2338_1 == null) {
            this.class2338_1 = BuffPImpl_1.class310.field_1724.method_24515();
            this.viewR = Initializer_18.viewR;
            this.longValue_1 = System.currentTimeMillis();
        }
        final class_2338 method_24515 = BuffPImpl_1.class310.field_1724.method_24515();
        final class_2338 method_24516 = method_24515.method_10074();
        if (method_24515.method_10264() >= -59 && BuffPImpl_1.class310.field_1687.method_8320(method_24516).method_26204() != class_2246.field_10124) {
            final class_241 computeClass_241 = this.computeClass_241(this.class2350);
            if (!this.boolFlag) {
                this.eventB.processAll(computeClass_241.field_1343, computeClass_241.field_1342, this::lambda$handleYRecovery$24);
            }
            this.setBool(false);
            BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
            BuffPImpl_1.class310.field_1690.field_1904.method_23481(false);
            return;
        }
        if (this.boolFlag) {
            this.setBool(false);
            return;
        }
        switch (this.viewR.ordinal()) {
            case 0: {
                BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
                BuffPImpl_1.class310.field_1690.field_1904.method_23481(false);
                if (!this.boolFlag) {
                    this.eventB.processAll(BuffPImpl_1.class310.field_1724.method_36454(), -90.0f, this::lambda$handleYRecovery$25);
                }
                if (this.isEnabled_6()) {
                    this.setBool(false);
                    this.setViewr(Initializer_18.TOWER);
                    break;
                }
                break;
            }
            case 1: {
                this.setBool(false);
                if (!this.boolFlag_4 && !this.boolFlag) {
                    this.boolFlag_4 = true;
                    this.eventB.processAll(BuffPImpl_1.class310.field_1724.method_36454(), 90.0f, this::lambda$handleYRecovery$26);
                    Initializer_8.execute();
                }
                BuffPImpl_1.class310.field_1690.field_1903.method_23481(true);
                BuffPImpl_1.class310.field_1690.field_1904.method_23481(true);
                if (this.isEnabled_6()) {
                    BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
                    BuffPImpl_1.class310.field_1690.field_1904.method_23481(false);
                    this.boolFlag_4 = false;
                    this.setViewr(Initializer_18.viewR);
                    break;
                }
                break;
            }
        }
    }
    
    private boolean isEnabled_7() {
        if (BuffPImpl_1.class310.field_1724 == null) {
            return false;
        }
        final class_1799 method_6047 = BuffPImpl_1.class310.field_1724.method_6047();
        if (!class_7923.field_41178.method_10221((Object)method_6047.method_7909()).toString().contains(createString(19036, 9840))) {
            return false;
        }
        final int method_6048 = method_6047.method_7936();
        final int n = method_6048 - method_6047.method_7919();
        return method_6048 > 0 && n / (double)method_6048 * 100.0 <= 5.0;
    }
    
    public void execute_13() {
        if (!this.isEnabled_3()) {
            return;
        }
        if (!BuffPImpl_1.boolFlag_9 && BuffPImpl_1.class310.field_1724 == null) {
            throw new AssertionError();
        }
        if (BuffPImpl_1.class310.field_1724.method_31548().field_7545 != this.bindK_3.getValue().intValue() - 1) {
            BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.bindK_3.getValue().intValue() - 1;
            Initializer_8.execute();
        }
        else if (BuffPImpl_1.class310.field_1724.method_7344().method_7586() <= 6) {
            this.setBool_1(true);
        }
        else {
            this.setBool_1(false);
            this.loadE = this.loadE_1;
            this.loadE_1 = Initializer_4.NONE;
        }
    }
    
    public void execute_14() {
        super.execute_2();
        if (BuffPImpl_1.class310.field_1724 == null || BuffPImpl_1.class310.field_1687 == null) {
            return;
        }
        if (this.boolFlag_3) {
            this.boolFlag_3 = false;
            BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
        }
        BuffPImpl_1.class310.execute(this::lambda$onTick$27);
    }
    
    private boolean checkClass_2248(final class_2248 class_2248) {
        return class_2248 == class_2246.field_10164 || class_2248 == class_2246.field_10382;
    }
    
    private boolean checkClass_2248_1(final class_2248 class_2248) {
        return class_2248 == class_2246.field_10255;
    }
    
    private boolean isEnabled_8() {
        return BuffPImpl_1.class310.field_1724 != null && BuffPImpl_1.class310.field_1724.method_6079().method_7909() == class_1802.field_8288;
    }
    
    private boolean isEnabled_9() {
        return BuffPImpl_1.class310.field_1724 != null && BuffPImpl_1.class310.field_1724.method_6079().method_7909() == class_1802.field_8287;
    }
    
    private boolean isEnabled_10() {
        return BuffPImpl_1.class310.field_1724 != null && BuffPImpl_1.class310.field_1724.method_6079().method_7960();
    }
    
    private int getInt_1() {
        if (BuffPImpl_1.class310.field_1724 == null) {
            return -1;
        }
        for (int i = 0; i < 36; ++i) {
            if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(i).method_7909() == class_1802.field_8288) {
                return i;
            }
        }
        return -1;
    }
    
    private void setInt(final int n) {
        if (BuffPImpl_1.class310.field_1724 == null) {
            return;
        }
        final int field_7763 = BuffPImpl_1.class310.field_1724.field_7498.field_7763;
        final int method_int = method_int(n);
        final int n2 = 45;
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        BuffPImpl_1.class310.field_1761.method_2906(field_7763, n2, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        if (BuffPImpl_1.class310.field_1724.field_7512.method_34255().method_7909() == class_1802.field_8288) {
            BuffPImpl_1.class310.field_1761.method_2906(field_7763, method_int, 0, class_1713.field_7790, (class_1657)BuffPImpl_1.class310.field_1724);
        }
    }
    
    private void setBool(final boolean b) {
        final boolean b2 = BuffPImpl_1.class310.field_1755 != null;
        if (b) {
            if (this.intValue_14 > 0) {
                --this.intValue_14;
                BuffPImpl_1.class310.field_1690.field_1886.method_23481(false);
                return;
            }
            if (this.boolFlag_6 && !b2) {
                BuffPImpl_1.class310.field_1690.field_1886.method_23481(false);
                this.intValue_14 = 1;
                return;
            }
            BuffPImpl_1.class310.field_1690.field_1886.method_23481(true);
        }
        else {
            this.intValue_14 = 0;
            BuffPImpl_1.class310.field_1690.field_1886.method_23481(false);
        }
    }
    
    private void setBool_1(final boolean b) {
        final boolean b2 = BuffPImpl_1.class310.field_1755 != null;
        if (b) {
            if (this.intValue_15 > 0) {
                --this.intValue_15;
                BuffPImpl_1.class310.field_1690.field_1904.method_23481(false);
                return;
            }
            if (this.boolFlag_6 && !b2) {
                BuffPImpl_1.class310.field_1690.field_1904.method_23481(false);
                this.intValue_15 = 1;
                return;
            }
            BuffPImpl_1.class310.field_1690.field_1904.method_23481(true);
        }
        else {
            this.intValue_15 = 0;
            BuffPImpl_1.class310.field_1690.field_1904.method_23481(false);
        }
    }
    
    private void execute_15() {
        if (BuffPImpl_1.class310.field_1690 != null) {
            BuffPImpl_1.class310.field_1690.field_1894.method_23481(false);
            this.setBool_1(false);
            BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
            this.setBool(false);
        }
    }
    
    private boolean isEnabled_11() {
        if (BuffPImpl_1.class310.field_1724 == null) {
            return true;
        }
        for (int i = 0; i < 36; ++i) {
            if (BuffPImpl_1.class310.field_1724.method_31548().method_5438(i).method_7960()) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isEnabled_12() {
        if (BuffPImpl_1.class310.field_1724 == null) {
            return false;
        }
        final class_1703 field_7512 = BuffPImpl_1.class310.field_1724.field_7512;
        final int field_7513 = field_7512.field_7763;
        boolean b = false;
        for (int i = 0; i < 36; ++i) {
            final class_1799 method_5438 = BuffPImpl_1.class310.field_1724.method_31548().method_5438(i);
            if (!method_5438.method_7960()) {
                boolean b2 = false;
                final class_1792[] class_1792Array = BuffPImpl_1.class_1792Array;
                for (int length = class_1792Array.length, j = 0; j < length; ++j) {
                    if (method_5438.method_7909() == class_1792Array[j]) {
                        b2 = true;
                        break;
                    }
                }
                if (b2) {
                    int method_int;
                    if (field_7512 instanceof final class_1707 class_1707) {
                        final int method_5439 = class_1707.method_17388();
                        if (i < 9) {
                            method_int = method_5439 * 9 + 27 + i;
                        }
                        else {
                            method_int = method_5439 * 9 + (i - 9);
                        }
                    }
                    else {
                        method_int = method_int(i);
                    }
                    BuffPImpl_1.class310.field_1761.method_2906(field_7513, method_int, 1, class_1713.field_7795, (class_1657)BuffPImpl_1.class310.field_1724);
                    b = true;
                }
            }
        }
        return b;
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        this.renderA.setClassAndPackd_1(BlockEImpl_1.class, this);
        if (BuffPImpl_1.class310.field_1690 != null) {
            BuffPImpl_1.class310.field_1690.field_1894.method_23481(false);
            this.setBool(false);
            this.setBool_1(false);
            BuffPImpl_1.class310.field_1690.field_1903.method_23481(false);
        }
        this.loadE = Initializer_4.NONE;
        this.loadE_1 = Initializer_4.NONE;
        this.boolFlag = false;
        this.viewR = Initializer_18.viewR;
        this.longValue_1 = 0L;
        this.boolFlag_8 = false;
        this.class2338_2 = null;
        this.class2350 = null;
        this.boolFlag_4 = false;
        this.class2338_1 = null;
        this.intValue_16 = 0;
        this.boolFlag_6 = false;
        this.intValue_14 = 0;
        this.intValue_15 = 0;
    }
    
    public class_2350 getClass_2350() {
        final class_746 field_1724 = BuffPImpl_1.class310.field_1724;
        if (field_1724 == null) {
            return class_2350.field_11043;
        }
        final float method_36454 = ((class_1657)field_1724).method_36454();
        final float method_36455 = ((class_1657)field_1724).method_36455();
        if (method_36455 > 60.0f) {
            return class_2350.field_11033;
        }
        if (method_36455 < -60.0f) {
            return class_2350.field_11036;
        }
        float n = method_36454 % 360.0f;
        if (n < 0.0f) {
            n += 360.0f;
        }
        if (n >= 45.0f && n < 135.0f) {
            return class_2350.field_11039;
        }
        if (n >= 135.0f && n < 225.0f) {
            return class_2350.field_11043;
        }
        if (n >= 225.0f && n < 315.0f) {
            return class_2350.field_11034;
        }
        return class_2350.field_11035;
    }
    
    public class_241 computeClass_241(final class_2350 class_2350) {
        float n = 0.0f;
        float n2 = (this.wrapJ.getValue() == Initializer_12.STANDING) ? 45.0f : 0.0f;
        switch (Initializer_17.intArr_5[class_2350.ordinal()]) {
            case 1: {
                n = 180.0f;
                break;
            }
            case 3: {
                n = 0.0f;
                break;
            }
            case 2: {
                n = 90.0f;
                break;
            }
            case 4: {
                n = 270.0f;
                break;
            }
            case 5: {
                n = 0.0f;
                n2 = -90.0f;
                break;
            }
            case 6: {
                n = 0.0f;
                n2 = 90.0f;
                break;
            }
        }
        return new class_241(n, n2);
    }
    
    @Override
    public void setCorej(final BuildBSub buildBSub) {
        if (this.eventB.isEnabled()) {
            this.boolFlag = true;
            this.eventB.setBoolAndBool(true, false);
        }
        else {
            this.boolFlag = false;
        }
    }
    
    private void lambda$onTick$27() {
        if (this.boolFlag_5) {
            if (BuffPImpl_1.class310.field_1755 instanceof class_490) {
                BuffPImpl_1.class310.field_1755.method_25419();
            }
            this.boolFlag_5 = false;
        }
        this.execute_2();
        if (this.intValue_16 > 0) {
            --this.intValue_16;
        }
        if (this.loadE != Initializer_4.AUTOMEND && this.loadE != Initializer_4.AUTOEAT && this.loadE != Initializer_4.BUYXP && this.loadE != Initializer_4.BUYPEARL && this.loadE != Initializer_4.BUYCARROT && this.loadE != Initializer_4.BUYOBI) {
            if (this.intValue_16 <= 0 && !this.isEnabled_8()) {
                this.setString(createString(19025, 20256));
            }
            if (this.isEnabled_7() && this.loadE != Initializer_4.BUYXP) {
                this.loadE_1 = this.loadE;
                this.loadE = Initializer_4.AUTOMEND;
            }
            if (BuffPImpl_1.class310.field_1724.method_7344().method_7586() <= 6 && this.loadE != Initializer_4.BUYCARROT) {
                this.loadE_1 = this.loadE;
                this.loadE = Initializer_4.AUTOEAT;
            }
        }
        switch (Initializer_17.intArr_6[this.loadE.ordinal()]) {
            case 2: {
                this.execute_9();
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
            case 5: {
                this.execute_8();
                break;
            }
            case 6: {
                this.execute_3();
                break;
            }
            case 7: {
                this.execute_13();
                break;
            }
            case 8: {
                this.execute_4();
                break;
            }
            case 9: {
                this.execute_5();
                break;
            }
            case 10: {
                this.execute_7();
                break;
            }
            case 11: {
                this.execute_6();
                break;
            }
        }
        if (this.dataA.isEnabled_2()) {
            this.dataA.isEnabled_1();
        }
        this.boolFlag_6 = (BuffPImpl_1.class310.field_1755 != null);
    }
    
    private void lambda$handleYRecovery$26() {
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.bindK.getValue().intValue() - 1;
    }
    
    private void lambda$handleYRecovery$25() {
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.getInt();
        Initializer_8.execute();
        this.setBool(true);
    }
    
    private void lambda$handleYRecovery$24() {
        this.dataA.isEnabled();
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.getInt();
        Initializer_8.execute();
        this.loadE = Initializer_4.MINING;
        this.class2338_1 = null;
        this.boolFlag_4 = false;
        this.viewR = Initializer_18.viewR;
        this.longValue_1 = System.currentTimeMillis();
    }
    
    private void lambda$handleGoAbove$23() {
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.bindK.getValue().intValue() - 1;
    }
    
    private void lambda$handleGoAbove$22() {
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.getInt();
        Initializer_8.execute();
        this.setBool(true);
    }
    
    private void lambda$handleGoAbove$21() {
        this.dataA.isEnabled();
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.getInt();
        Initializer_8.execute();
        this.loadE = Initializer_4.MINING;
        this.execute_10();
    }
    
    private void lambda$handleMining$20() {
        this.dataA.isEnabled();
    }
    
    private void lambda$handleMining$19() {
        this.dataA.isEnabled();
    }
    
    private void lambda$handleMining$18() {
        this.dataA.isEnabled();
    }
    
    private void lambda$handleMining$17() {
        this.dataA.isEnabled();
    }
    
    private void lambda$handleMining$16() {
        this.dataA.isEnabled();
    }
    
    private void lambda$handlePearl$15() {
        this.dataA.isEnabled();
    }
    
    private void lambda$handlePearl$14() {
        this.dataA.isEnabled();
    }
    
    private void lambda$handlePearl$13() {
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.bindK_1.getValue().intValue() - 1;
        Initializer_8.execute();
        this.setBool_1(true);
        this.boolFlag_2 = true;
    }
    
    private void lambda$handlePearl$12() {
        this.loadE = Initializer_4.MINING;
    }
    
    private void lambda$onEnable$11() {
        this.dataA.isEnabled();
        this.loadE = Initializer_4.MINING;
    }
    
    private static void lambda$handleCarrotBuy$10() {
        BuffPImpl_1.class310.field_1755.method_25419();
    }
    
    private static void lambda$handleObiBuy$9() {
        BuffPImpl_1.class310.field_1755.method_25419();
    }
    
    private static void lambda$handlePearlBuy$8() {
        BuffPImpl_1.class310.field_1755.method_25419();
    }
    
    private static void lambda$handleXPBuy$7() {
        BuffPImpl_1.class310.field_1755.method_25419();
    }
    
    private void lambda$handleMend$6() {
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.getInt();
        Initializer_8.execute();
        this.dataB = Initializer_2.RESET;
    }
    
    private void lambda$handleMend$5() {
        BuffPImpl_1.class310.field_1724.method_31548().field_7545 = this.bindK_2.getValue().intValue() - 1;
        Initializer_8.execute();
        this.dataB = Initializer_2.OFFHAND_XP;
    }
    
    private static void lambda$ensureObsidianInHotbarSlot$4() {
        BuffPImpl_1.class310.method_1507((class_437)new class_490((class_1657)BuffPImpl_1.class310.field_1724));
    }
    
    private static void lambda$ensureGoldenCarrotInHotbarSlot$3() {
        BuffPImpl_1.class310.method_1507((class_437)new class_490((class_1657)BuffPImpl_1.class310.field_1724));
    }
    
    private static void lambda$ensurePearlInHotbarSlot$2() {
        BuffPImpl_1.class310.method_1507((class_437)new class_490((class_1657)BuffPImpl_1.class310.field_1724));
    }
    
    private static void lambda$ensureXpInHotbarSlot$1() {
        BuffPImpl_1.class310.method_1507((class_437)new class_490((class_1657)BuffPImpl_1.class310.field_1724));
    }
    
    private void lambda$scanForBase$0(final class_2818 class_2818) {
        final Iterator iterator = class_2818.method_12021().iterator();
        while (iterator.hasNext()) {
            final class_2586 method_8321 = BuffPImpl_1.class310.field_1687.method_8321((class_2338)iterator.next());
            if (method_8321 == null) {
                continue;
            }
            if (method_8321 instanceof class_2636) {
                this.boolFlag_1 = true;
            }
            if (method_8321.method_11016().method_10264() > 0) {
                continue;
            }
            final class_2586 obj = method_8321;
            Objects.requireNonNull(obj);
            final class_2669 class_2819 = (class_2669)obj;
            switch (/* invokedynamic(!) */ProcyonInvokeDynamicHelper_10.invoke(class_2819, false)) {
                case 0: {
                    final class_2595 class_2820 = (class_2595)class_2819;
                    ++this.intValue_7;
                    continue;
                }
                case 1: {
                    final class_2627 class_2821 = (class_2627)class_2819;
                    ++this.intValue_11;
                    continue;
                }
                case 2: {
                    final class_2669 class_2822 = class_2819;
                    ++this.intValue_12;
                    continue;
                }
            }
        }
    }
    
    static {
        final String[] strArr2 = new String[23];
        int n = 0;
        String s;
        int n2 = (s = """
                      =\u00f5\u0092¯w\u00f7²\u001eVv\u00d0V\u0007²\u0007YX\u00d9\u001c\u0094\u0013\u00e3\u00de\u00de\u00f9\u0081\u0099<»EMd\u0095\u0005\u0015n\u00836§^\u0011*\u00ca\u0094(\u008a\u00ea\\u0097i\u00df\u00e9/\u00f6\u00cb\u009e\u0094T%-\u00ea\u001c\u00fd´¢[8\u0007D\u00e3¡\u00d3|\u00c8\u00f5cc_\u00cf\u00fa\u0095|\u00eb;C³¢º\u00cf\u00c6\u00e7@º\u00ca\u0002\u00ca\u0010\u00e1\u00eav\u00c3q\u00edx\\u00cb\u00cf¬-\u00d1»\u0017¯\u000b\u0019"O%\u00e3R:\u00d8´_\u0094\b)£\u001bYQft\u00e5
                      \u0081\u0019\u0019\u000f\u009e\u0094\u00e6\u00d21\u00dd\u0016\u00d9¤\u000e\u0085\u00e6²\u00d9\u00dfS
                      k¸\u0013¼\u00d6\u0091¥¼\u0003\u0094\u009d¶\u0004\u00cc\u00f5\u00d2\u0005\u0004\u00d3\u00fc\u001a\u001d\u0011\u0096§\u00e7\u0097¿\u00d7\u001bx;\u008e=\u00f9¥²J\u00f2E\u00100\u008a¤s\u00ce\u00c8\u00d5\u0091x\b\u00c3=\u00f1\u0000\u00f0!\u0007K®\u00d1'-K3b¡\u009c\u00d1\u00d74\u00d8P\u00f9\u00d5\u00f5F\u0004\u00cb\u00062{\u001b\u00c6\u0095m\u00d0T\f!'"\u0093\u00dd\u00cf,\u0012\u00899F«|_%\u00db\u0092\u000f\u00e3!\u00f6\f\u0001\u00e6¸fF\u0086\u00cc\u0000rRO\u00e5\u00141\u00e1\u0013-E§\u00ad}\u00dd^º2)\u00ed\u0091¿K\u00ea\u0016§\u0007°@|\u00924\u00c3\u00d4""").length();
        int n3 = 12;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 84));
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
                        Label_0259: {
                            if (length > 1) {
                                break Label_0259;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 52;
                                    case 1 -> 98;
                                    case 2 -> 74;
                                    case 3 -> 5;
                                    case 4 -> 11;
                                    case 5 -> 23;
                                    default -> 56;
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
                            n2 = (s = "\\\u00dd\u00ed?\u0010\u009a\u0017\u00e7\u00db\u00feyZd\u0080±M)*\u0001\u009b'").length();
                            n3 = 4;
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
                    n5 = (n6 = (n7 = (n8 = 63)));
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
        strArr_1 = new String[23];
        boolFlag_9 = !BuffPImpl_1.class.desiredAssertionStatus();
        class_1792Array = new class_1792[] { class_1802.field_20391, class_1802.field_20412, class_1802.field_28866, class_1802.field_29025, class_1802.field_20407, class_1802.field_20401, class_1802.field_20394, class_1802.field_27021, class_1802.field_27020, class_1802.field_28043, class_1802.field_28042, class_1802.field_8110, class_1802.field_8145, class_1802.field_8831, class_1802.field_8270, class_1802.field_8460, class_1802.field_28655, class_1802.field_8328, class_1802.field_23843, class_1802.field_22000, class_1802.field_29024, class_1802.field_20399, class_1802.field_8713, class_1802.field_33400, class_1802.field_33401, class_1802.field_8786, class_1802.field_8276, class_1802.field_19060, class_1802.field_8288 };
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x4A5D) & 0xFFFF;
        if (BuffPImpl_1.strArr_1[n3] == null) {
            final char[] charArray = BuffPImpl_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 15;
                case 1 -> 22;
                case 2 -> 222;
                case 3 -> 42;
                case 4 -> 83;
                case 5 -> 114;
                case 6 -> 101;
                case 7 -> 251;
                case 8 -> 212;
                case 9 -> 32;
                case 10 -> 189;
                case 11 -> 237;
                case 12 -> 215;
                case 13 -> 230;
                case 14 -> 176;
                case 15 -> 73;
                case 16 -> 132;
                case 17 -> 140;
                case 18 -> 200;
                case 19 -> 96;
                case 20 -> 254;
                case 21 -> 213;
                case 22 -> 19;
                case 23 -> 246;
                case 24 -> 70;
                case 25 -> 34;
                case 26 -> 35;
                case 27 -> 202;
                case 28 -> 82;
                case 29 -> 93;
                case 30 -> 109;
                case 31 -> 171;
                case 32 -> 89;
                case 33 -> 249;
                case 34 -> 180;
                case 35 -> 9;
                case 36 -> 65;
                case 37 -> 217;
                case 38 -> 28;
                case 39 -> 116;
                case 40 -> 163;
                case 41 -> 159;
                case 42 -> 29;
                case 43 -> 196;
                case 44 -> 67;
                case 45 -> 38;
                case 46 -> 236;
                case 47 -> 243;
                case 48 -> 248;
                case 49 -> 152;
                case 50 -> 194;
                case 51 -> 121;
                case 52 -> 27;
                case 53 -> 150;
                case 54 -> 220;
                case 55 -> 178;
                case 56 -> 184;
                case 57 -> 170;
                case 58 -> 91;
                case 59 -> 242;
                case 60 -> 136;
                case 61 -> 161;
                case 62 -> 45;
                case 63 -> 125;
                case 64 -> 193;
                case 65 -> 90;
                case 66 -> 24;
                case 67 -> 62;
                case 68 -> 122;
                case 69 -> 165;
                case 70 -> 141;
                case 71 -> 234;
                case 72 -> 188;
                case 73 -> 166;
                case 74 -> 78;
                case 75 -> 160;
                case 76 -> 21;
                case 77 -> 23;
                case 78 -> 57;
                case 79 -> 145;
                case 80 -> 240;
                case 81 -> 88;
                case 82 -> 16;
                case 83 -> 54;
                case 84 -> 127;
                case 85 -> 10;
                case 86 -> 199;
                case 87 -> 204;
                case 88 -> 247;
                case 89 -> 226;
                case 90 -> 58;
                case 91 -> 164;
                case 92 -> 138;
                case 93 -> 135;
                case 94 -> 97;
                case 95 -> 142;
                case 96 -> 203;
                case 97 -> 17;
                case 98 -> 99;
                case 99 -> 173;
                case 100 -> 225;
                case 101 -> 177;
                case 102 -> 244;
                case 103 -> 131;
                case 104 -> 205;
                case 105 -> 146;
                case 106 -> 87;
                case 107 -> 216;
                case 108 -> 79;
                case 109 -> 144;
                case 110 -> 41;
                case 111 -> 68;
                case 112 -> 55;
                case 113 -> 69;
                case 114 -> 201;
                case 115 -> 110;
                case 116 -> 182;
                case 117 -> 221;
                case 118 -> 139;
                case 119 -> 39;
                case 120 -> 49;
                case 121 -> 148;
                case 122 -> 12;
                case 123 -> 233;
                case 124 -> 14;
                case 125 -> 192;
                case 126 -> 74;
                case 127 -> 37;
                case 128 -> 59;
                case 129 -> 219;
                case 130 -> 137;
                case 131 -> 48;
                case 132 -> 102;
                case 133 -> 123;
                case 134 -> 119;
                case 135 -> 186;
                case 136 -> 111;
                case 137 -> 107;
                case 138 -> 92;
                case 139 -> 103;
                case 140 -> 26;
                case 141 -> 118;
                case 142 -> 85;
                case 143 -> 13;
                case 144 -> 250;
                case 145 -> 20;
                case 146 -> 4;
                case 147 -> 53;
                case 148 -> 117;
                case 149 -> 253;
                case 150 -> 2;
                case 151 -> 154;
                case 152 -> 174;
                case 153 -> 209;
                case 154 -> 175;
                case 155 -> 112;
                case 156 -> 214;
                case 157 -> 187;
                case 158 -> 98;
                case 159 -> 64;
                case 160 -> 151;
                case 161 -> 129;
                case 162 -> 5;
                case 163 -> 94;
                case 164 -> 106;
                case 165 -> 153;
                case 166 -> 156;
                case 167 -> 231;
                case 168 -> 31;
                case 169 -> 227;
                case 170 -> 0;
                case 171 -> 36;
                case 172 -> 208;
                case 173 -> 6;
                case 174 -> 108;
                case 175 -> 105;
                case 176 -> 126;
                case 177 -> 60;
                case 178 -> 134;
                case 179 -> 149;
                case 180 -> 190;
                case 181 -> 47;
                case 182 -> 84;
                case 183 -> 56;
                case 184 -> 120;
                case 185 -> 169;
                case 186 -> 40;
                case 187 -> 130;
                case 188 -> 1;
                case 189 -> 7;
                case 190 -> 63;
                case 191 -> 158;
                case 192 -> 77;
                case 193 -> 198;
                case 194 -> 133;
                case 195 -> 86;
                case 196 -> 179;
                case 197 -> 50;
                case 198 -> 104;
                case 199 -> 143;
                case 200 -> 239;
                case 201 -> 80;
                case 202 -> 229;
                case 203 -> 124;
                case 204 -> 232;
                case 205 -> 235;
                case 206 -> 218;
                case 207 -> 44;
                case 208 -> 18;
                case 209 -> 25;
                case 210 -> 206;
                case 211 -> 197;
                case 212 -> 211;
                case 213 -> 46;
                case 214 -> 3;
                case 215 -> 8;
                case 216 -> 162;
                case 217 -> 52;
                case 218 -> 228;
                case 219 -> 115;
                case 220 -> 210;
                case 221 -> 66;
                case 222 -> 223;
                case 223 -> 147;
                case 224 -> 168;
                case 225 -> 191;
                case 226 -> 95;
                case 227 -> 11;
                case 228 -> 128;
                case 229 -> 72;
                case 230 -> 255;
                case 231 -> 155;
                case 232 -> 167;
                case 233 -> 76;
                case 234 -> 241;
                case 235 -> 71;
                case 236 -> 33;
                case 237 -> 51;
                case 238 -> 181;
                case 239 -> 61;
                case 240 -> 185;
                case 241 -> 238;
                case 242 -> 252;
                case 243 -> 195;
                case 244 -> 224;
                case 245 -> 207;
                case 246 -> 113;
                case 247 -> 43;
                case 248 -> 81;
                case 249 -> 183;
                case 250 -> 172;
                case 251 -> 75;
                case 252 -> 245;
                case 253 -> 100;
                case 254 -> 157;
                default -> 30;
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
            BuffPImpl_1.strArr_1[n3] = new String(charArray).intern();
        }
        return BuffPImpl_1.strArr_1[n3];
    }
    
    // This helper class was generated by Procyon to approximate the behavior of an
    // 'invokedynamic' instruction that it doesn't know how to interpret.
    private static final class ProcyonInvokeDynamicHelper_10
    {
        private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
        private static MethodHandle handle;
        private static volatile int fence;
        
        private static MethodHandle handle() {
            final MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle != null)
                return handle;
            return ProcyonInvokeDynamicHelper_10.ensureHandle();
        }
        
        private static MethodHandle ensureHandle() {
            ProcyonInvokeDynamicHelper_10.fence = 0;
            MethodHandle handle = ProcyonInvokeDynamicHelper_10.handle;
            if (handle == null) {
                MethodHandles.Lookup lookup = ProcyonInvokeDynamicHelper_10.LOOKUP;
                try {
                    handle = ((CallSite)SwitchBootstraps.typeSwitch(lookup, "typeSwitch", MethodType.methodType(int.class, Object.class, int.class), class_2595.class, class_2627.class, class_2669.class)).dynamicInvoker();
                }
                catch (Throwable t) {
                    throw new UndeclaredThrowableException(t);
                }
                ProcyonInvokeDynamicHelper_10.fence = 1;
                ProcyonInvokeDynamicHelper_10.handle = handle;
                ProcyonInvokeDynamicHelper_10.fence = 0;
            }
            return handle;
        }
        
        private static int invoke(Object p0, int p1) {
            try {
                return ProcyonInvokeDynamicHelper_10.handle().invokeExact(p0, p1);
            }
            catch (Throwable t) {
                throw new UndeclaredThrowableException(t);
            }
        }
    }
}
