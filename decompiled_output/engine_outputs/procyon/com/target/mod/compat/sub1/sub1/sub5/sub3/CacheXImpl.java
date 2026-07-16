// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_1268;
import net.minecraft.class_3965;
import net.minecraft.class_2350;
import net.minecraft.class_2661;
import net.minecraft.class_2561;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_4;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_310;
import net.minecraft.class_2248;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_7924;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.minecraft.class_2246;
import java.util.Iterator;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import com.target.mod.compat.sub1.sub1.sub5.sub4.CalcGSub;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_5;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1;
import net.minecraft.class_2338;
import java.util.List;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_2;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CacheXImpl extends AbstractLoadF implements BlockEImpl_2, BlockEImpl_1
{
    private final RenderASub_1 buffC;
    private final RenderASub bindK;
    private final RenderASub_1 buffC_1;
    private final RenderASub_6 eventQ;
    private final RenderASub_1 buffC_2;
    private final RenderASub_6 eventQ_1;
    Initializer_10 itemP;
    boolean boolFlag;
    List<class_2338> list;
    int intValue;
    int intValue_1;
    int intValue_2;
    boolean boolFlag_1;
    int intValue_3;
    class_2338 class2338;
    int intValue_4;
    int intValue_5;
    boolean boolFlag_2;
    int intValue_6;
    boolean boolFlag_3;
    com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1 eventB;
    private class_2338 class2338_1;
    private boolean boolFlag_4;
    private int intValue_7;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CacheXImpl() {
        super(createString(-30507, 17261), createString(-30497, -12828), Initializer.stepF);
        this.buffC = new RenderASub_1(createString(-30479, -17470), true);
        this.bindK = new RenderASub(createString(-30472, 19205), 5.0, 1.0, 50.0, 0.5);
        this.buffC_1 = new RenderASub_1(createString(-30520, -27583), false);
        this.eventQ = new RenderASub_6(createString(-30505, 25484), "");
        this.buffC_2 = new RenderASub_1(createString(-30527, 6857), false);
        this.eventQ_1 = new RenderASub_6(createString(-30471, -26288), "");
        this.itemP = Initializer_10.CHECKING;
        this.boolFlag = false;
        this.list = new ArrayList<class_2338>();
        this.intValue = 10;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.boolFlag_1 = false;
        this.intValue_3 = -1;
        this.class2338 = null;
        this.intValue_4 = 0;
        this.intValue_5 = 0;
        this.boolFlag_2 = false;
        this.intValue_6 = 0;
        this.boolFlag_3 = false;
        this.class2338_1 = null;
        this.boolFlag_4 = false;
        this.intValue_7 = 0;
        this.setRenderaarr(this.buffC, this.bindK, this.buffC_1, this.eventQ, this.buffC_2, this.eventQ_1);
    }
    
    @Override
    public void execute() {
        if (CacheXImpl.class310.field_1724 == null) {
            return;
        }
        if (this.getInt() == -1) {
            Initializer_5.setString_2(createString(-30510, 521));
            this.execute_2();
            return;
        }
        if (CacheXImpl.class310.field_1755 != null) {
            CacheXImpl.class310.execute(CacheXImpl::lambda$onEnable$0);
        }
        final int int1 = this.getInt();
        if (int1 != -1) {
            this.intValue_3 = CacheXImpl.class310.field_1724.method_31548().field_7545;
            CacheXImpl.class310.field_1724.method_31548().field_7545 = int1;
            Initializer_8.execute();
        }
        this.boolFlag = false;
        this.list.clear();
        this.renderA.setClassAndPackd(BlockEImpl_2.class, this);
        this.renderA.setClassAndPackd(BlockEImpl_1.class, this);
        this.itemP = Initializer_10.CHECKING;
        this.eventB = new com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1(com.target.mod.compat.sub1.sub1.sub1.Initializer_1.class310);
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.boolFlag_1 = false;
        this.class2338 = null;
        this.intValue_4 = 0;
        this.intValue_5 = 0;
        this.boolFlag_2 = false;
        this.intValue_6 = 0;
        this.boolFlag_3 = false;
        if (CacheXImpl.class310.field_1724 != null) {
            this.class2338_1 = CacheXImpl.class310.field_1724.method_24515();
        }
        this.boolFlag_4 = false;
        this.intValue_7 = 0;
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(BlockEImpl_2.class, this);
        this.renderA.setClassAndPackd_1(BlockEImpl_1.class, this);
        if (this.intValue_3 != -1 && CacheXImpl.class310.field_1724 != null) {
            CacheXImpl.class310.field_1724.method_31548().field_7545 = this.intValue_3;
            Initializer_8.execute();
        }
        CacheXImpl.class310.field_1724.method_5660(false);
        CacheXImpl.class310.field_1690.field_1832.method_23481(false);
    }
    
    @Override
    public void setCorej(final BuildBSub buildBSub) {
        if (CacheXImpl.class310.field_1687 == null || CacheXImpl.class310.field_1724 == null) {
            return;
        }
        if (this.itemP == Initializer_10.MINING || this.itemP == Initializer_10.OPENENDERCHEST) {
            this.eventB.setBoolAndBool(true, this.buffC.getValue());
        }
    }
    
    void execute_2() {
        if (CacheXImpl.class310.field_1724 == null) {
            return;
        }
        final class_2338 method_24515 = CacheXImpl.class310.field_1724.method_24515();
        if (this.class2338_1 != null && !method_24515.equals((Object)this.class2338_1)) {
            this.boolFlag_4 = !this.boolFlag_4;
            if (this.boolFlag_4) {
                Initializer_5.setString_1(createString(-30517, -11013));
                this.itemP = Initializer_10.CHECKING;
                this.boolFlag = false;
                this.list.clear();
                this.intValue_1 = 0;
                this.boolFlag_1 = false;
                if (this.intValue_3 != -1) {
                    CacheXImpl.class310.field_1724.method_31548().field_7545 = this.intValue_3;
                    Initializer_8.execute();
                    this.intValue_3 = -1;
                }
                CacheXImpl.class310.field_1690.field_1886.method_23481(false);
            }
            else {
                Initializer_5.setString(createString(-30516, -25561));
            }
            this.intValue_7 = 40;
        }
        this.class2338_1 = method_24515;
        if (this.intValue_7 > 0) {
            --this.intValue_7;
        }
    }
    
    void execute_3() {
        if (this.boolFlag_4) {
            return;
        }
        final String name = CacheXImpl.class310.field_1724.method_7334().name();
        final CalcGSub calcGSub = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF.computeCalcg_1(CalcGSub.class);
        for (class_1657 class_1657 : CacheXImpl.class310.field_1687.method_18456()) {
            if (class_1657 == CacheXImpl.class310.field_1724) {
                continue;
            }
            final String name2 = class_1657.method_7334().name();
            if (name2.equalsIgnoreCase(name)) {
                continue;
            }
            if (name2.equalsIgnoreCase(createString(-30473, 23389))) {
                continue;
            }
            if (class_1657.method_7325()) {
                continue;
            }
            if (class_1657 == null) {
                continue;
            }
            if (calcGSub != null && calcGSub.isEnabled()) {
                calcGSub.execute_2();
            }
            final double d = CacheXImpl.class310.field_1724.method_5739((class_1297)class_1657);
            if (this.bindK.getValue() > 0.0 && d <= this.bindK.getValue()) {
                this.setStringAndDouble(name2, d);
                this.setString(createString(-30528, -28485) + name2 + createString(-30526, -6937) + String.format(createString(-30506, -13283), d) + createString(-30504, 2986));
                return;
            }
            Initializer_5.setString(createString(-30512, -17393) + name2);
            this.setStringAndDouble(name2, d);
            this.boolFlag = true;
            this.itemP = Initializer_10.FINDSPAWNER;
        }
    }
    
    void execute_4() {
        this.list.clear();
        final class_2338 method_24515 = CacheXImpl.class310.field_1724.method_24515();
        for (int i = -this.intValue; i <= this.intValue; ++i) {
            for (int j = -this.intValue; j <= this.intValue; ++j) {
                for (int k = -this.intValue; k <= this.intValue; ++k) {
                    final class_2338 method_24516 = method_24515.method_10069(i, j, k);
                    if (CacheXImpl.class310.field_1687.method_8320(method_24516).method_26204() == class_2246.field_10260) {
                        this.list.add(method_24516);
                    }
                }
            }
        }
        if (this.list.isEmpty()) {
            Initializer_5.setString_1(createString(-30514, 17645));
            this.setString(createString(-30509, 3035));
            this.itemP = Initializer_10.CHECKING;
        }
        else {
            Initializer_5.setString(createString(-30475, -27675) + this.list.size() + createString(-30523, 30175));
            this.intValue_1 = 0;
            this.itemP = Initializer_10.MINING;
        }
    }
    
    int getInt() {
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = CacheXImpl.class310.field_1724.method_31548().method_5438(i);
            if (class_7923.field_41178.method_10221((Object)method_5438.method_7909()).toString().contains(createString(-30478, -28499))) {
                final class_6880 class_6880 = CacheXImpl.class310.field_1687.method_30349().method_30530(class_7924.field_41265).method_10223(class_2960.method_60655(createString(-30469, -30033), createString(-30498, -13218))).orElse(null);
                if (class_6880 != null && method_5438.method_58657().method_57536(class_6880) > 0) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    void execute_5() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        Object value = this;
        if (stringarrArray != null) {
            if (this.intValue_1 >= this.list.size()) {
                Initializer_5.setString(createString(-30511, -12819));
                CacheXImpl cacheXImpl = this;
                if (stringarrArray != null) {
                    if (this.intValue_3 != -1) {
                        CacheXImpl.class310.field_1724.method_31548().field_7545 = this.intValue_3;
                        Initializer_8.execute();
                        this.intValue_3 = -1;
                    }
                    CacheXImpl.class310.field_1690.field_1886.method_23481(false);
                    this.itemP = Initializer_10.FINDENDERCHEST;
                    this.list.clear();
                    cacheXImpl = this;
                }
                cacheXImpl.intValue_1 = 0;
                return;
            }
            value = this.list.get(this.intValue_1);
        }
        final class_2338 class_2338 = (class_2338)value;
        int n3 = 0;
        int intValue_3 = 0;
        int n2 = 0;
        boolean b = false;
        Label_0184: {
            if (CacheXImpl.class310.field_1687.method_8320(class_2338).method_26204() != class_2246.field_10260) {
                final int n = (b = ((n2 = (intValue_3 = (n3 = (this.boolFlag_3 ? 1 : 0)))) != 0)) ? 1 : 0;
                if (stringarrArray == null) {
                    break Label_0184;
                }
                if (n == 0) {
                    this.boolFlag_3 = true;
                    this.intValue_6 = 0;
                    CacheXImpl.class310.field_1690.field_1886.method_23481(false);
                    return;
                }
            }
            n2 = ((b = ((intValue_3 = (n3 = (this.boolFlag_3 ? 1 : 0))) != 0)) ? 1 : 0);
        }
        if (stringarrArray != null) {
            if (b) {
                ++this.intValue_6;
                if (this.intValue_6 < 10) {
                    return;
                }
                final class_2248 method_26204 = CacheXImpl.class310.field_1687.method_8320(class_2338).method_26204();
                if (stringarrArray != null) {
                    if (method_26204 != class_2246.field_10260) {
                        Initializer_5.setString(createString(-30501, 28620) + (this.intValue_1 + 1) + createString(-30474, 4799));
                        ++this.intValue_1;
                        this.boolFlag_1 = false;
                        this.intValue_2 = 0;
                        this.boolFlag_3 = false;
                        this.intValue_6 = 0;
                        return;
                    }
                    Initializer_5.setString(createString(-30470, -22364) + (this.intValue_1 + 1) + createString(-30500, 17960));
                    this.boolFlag_3 = false;
                    this.intValue_6 = 0;
                }
                this.boolFlag_1 = false;
            }
            intValue_3 = (n2 = (n3 = (this.boolFlag_1 ? 1 : 0)));
        }
        Label_0455: {
            if (stringarrArray != null) {
                if (n2 != 0) {
                    break Label_0455;
                }
                n3 = (intValue_3 = this.intValue_3);
            }
            if (stringarrArray != null) {
                if (intValue_3 != -1) {
                    break Label_0455;
                }
                n3 = this.getInt();
            }
            final int field_7545 = n3;
            if (stringarrArray != null) {
                if (field_7545 == -1) {
                    Initializer_5.setString_2(createString(-30476, -18789));
                    this.setString(createString(-30518, -5883));
                    this.itemP = Initializer_10.CHECKING;
                    return;
                }
                this.intValue_3 = CacheXImpl.class310.field_1724.method_31548().field_7545;
                CacheXImpl.class310.field_1724.method_31548().field_7545 = field_7545;
            }
            Initializer_8.execute();
        }
        final class_243 method_26205 = class_243.method_24953((class_2382)class_2338).method_1020(CacheXImpl.class310.field_1724.method_33571()).method_1029();
        final float n4 = (float)Math.toDegrees(Math.atan2(method_26205.field_1350, method_26205.field_1352)) - 90.0f;
        final float n5 = (float)(-Math.toDegrees(Math.asin(method_26205.field_1351)));
        int boolFlag_1;
        final boolean b2 = (boolFlag_1 = (this.boolFlag_1 ? 1 : 0)) != 0;
        class_310 class310 = null;
        Label_0620: {
            if (stringarrArray != null) {
                if (!b2) {
                    CacheXImpl.class310.field_1690.field_1886.method_23481(false);
                    final com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1 eventB = this.eventB;
                    if (stringarrArray != null) {
                        if (eventB.isEnabled()) {
                            return;
                        }
                        final com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1 eventB2 = this.eventB;
                    }
                    eventB.processAll(n4, n5, this::lambda$mineSpawners$1);
                    if (stringarrArray != null) {
                        return;
                    }
                }
                ++this.intValue_2;
                class310 = CacheXImpl.class310;
                if (stringarrArray == null) {
                    break Label_0620;
                }
                class310.field_1690.field_1886.method_23481(true);
                boolFlag_1 = this.intValue_2 % 5;
            }
            if (boolFlag_1 != 0) {
                return;
            }
            final class_310 class311 = CacheXImpl.class310;
        }
        final class_2248 method_26206 = class310.field_1687.method_8320(class_2338).method_26204();
        if (stringarrArray != null) {
            if (method_26206 == class_2246.field_10260) {
                return;
            }
            Initializer_5.setString(createString(-30499, 7957) + (this.intValue_1 + 1) + "/" + this.list.size());
            CacheXImpl.class310.field_1690.field_1886.method_23481(false);
            ++this.intValue_1;
            this.boolFlag_1 = false;
        }
        this.intValue_2 = 0;
    }
    
    void execute_6() {
        final class_2338 method_24515 = CacheXImpl.class310.field_1724.method_24515();
        class_2338 class2338 = null;
        double n = Double.MAX_VALUE;
        for (int i = -this.intValue; i <= this.intValue; ++i) {
            for (int j = -this.intValue; j <= this.intValue; ++j) {
                for (int k = -this.intValue; k <= this.intValue; ++k) {
                    final class_2338 method_24516 = method_24515.method_10069(i, j, k);
                    if (CacheXImpl.class310.field_1687.method_8320(method_24516).method_26204() == class_2246.field_10443) {
                        final double method_24517 = method_24515.method_10262((class_2382)method_24516);
                        if (method_24517 < n) {
                            n = method_24517;
                            class2338 = method_24516;
                        }
                    }
                }
            }
        }
        if (class2338 == null) {
            this.setString(createString(-30503, -8714));
            this.itemP = Initializer_10.CHECKING;
        }
        else {
            this.class2338 = class2338;
            Initializer_5.setString(createString(-30524, -32458) + class2338.method_23854());
            CacheXImpl.class310.field_1724.method_5660(false);
            CacheXImpl.class310.field_1690.field_1832.method_23481(false);
            this.itemP = Initializer_10.OPENENDERCHEST;
        }
    }
    
    void execute_7() {
        if (this.class2338 == null) {
            this.itemP = Initializer_10.CHECKING;
            return;
        }
        if (CacheXImpl.class310.field_1687.method_8320(this.class2338).method_26204() != class_2246.field_10443) {
            this.setString(createString(-30519, 1477));
            this.itemP = Initializer_10.CHECKING;
            return;
        }
        final class_243 method_1029 = class_243.method_24953((class_2382)this.class2338).method_1020(CacheXImpl.class310.field_1724.method_33571()).method_1029();
        final float n = (float)Math.toDegrees(Math.atan2(method_1029.field_1350, method_1029.field_1352)) - 90.0f;
        final float n2 = (float)(-Math.toDegrees(Math.asin(method_1029.field_1351)));
        if (!this.eventB.isEnabled() && !this.boolFlag_2) {
            this.eventB.processAll(n, n2, this::lambda$openEnderChest$2);
        }
        if (this.boolFlag_2 && this.intValue_5 > 0) {
            --this.intValue_5;
        }
        else if (this.boolFlag_2 && this.intValue_5 == 0) {
            this.itemP = Initializer_10.DUMPINVENTORY;
            this.intValue_4 = 0;
        }
    }
    
    void execute_8() {
        final class_1703 field_7512 = CacheXImpl.class310.field_1724.field_7512;
        if (field_7512 == null || field_7512 == CacheXImpl.class310.field_1724.field_7498) {
            Initializer_5.setString_2(createString(-30525, -3950));
            this.boolFlag_2 = false;
            this.itemP = Initializer_10.OPENENDERCHEST;
            return;
        }
        final int n = field_7512.field_7761.size() - 36;
        if (this.intValue_4 < 36) {
            CacheXImpl.class310.field_1761.method_2906(field_7512.field_7763, n + this.intValue_4, 0, class_1713.field_7794, (class_1657)CacheXImpl.class310.field_1724);
            ++this.intValue_4;
        }
        else {
            Initializer_5.setString(createString(-30515, -14937));
            CacheXImpl.class310.execute(CacheXImpl::lambda$dumpInventory$3);
            this.class2338 = null;
            this.boolFlag_2 = false;
            this.intValue_4 = 0;
            this.itemP = Initializer_10.CHECKING;
            this.setString(createString(-30480, 16808));
        }
    }
    
    private void setStringAndDouble(final String s, final double d) {
        if (!this.buffC_1.getValue() || this.eventQ.getValue().trim().isEmpty()) {
            return;
        }
        String trim = "";
        if (this.buffC_2.getValue() && !this.eventQ_1.getValue().trim().isEmpty()) {
            trim = this.eventQ_1.getValue().trim();
        }
        new Initializer_4(this.eventQ.getValue()).computeBuildj(createString(-30521, -12143)).computeBuildj_3(createString(-30522, -1347)).computeBuildj_4(trim).computeBuildj_5(s).computeBuildj_1(CacheXImpl.class310.field_1724.method_24515()).createBuildj(createString(-30513, -15578), String.format(createString(-30508, 935), d), true).getBuildj_2().getBuildj_3().execute();
    }
    
    private void setString(final String s) {
        this.execute_2();
        CacheXImpl.class310.field_1724.field_3944.method_52781(new class_2661((class_2561)class_2561.method_43470(createString(-30502, 1109) + s)));
    }
    
    public void execute_9() {
        if (CacheXImpl.class310.field_1687 == null || CacheXImpl.class310.field_1724 == null) {
            return;
        }
        this.execute_2();
        if (this.itemP == Initializer_10.CHECKING || this.itemP == Initializer_10.FINDSPAWNER || this.itemP == Initializer_10.MINING) {
            CacheXImpl.class310.field_1724.method_5660(true);
            CacheXImpl.class310.field_1690.field_1832.method_23481(true);
        }
        switch (this.itemP.ordinal()) {
            case 0: {
                this.execute_3();
                break;
            }
            case 1: {
                this.execute_4();
                break;
            }
            case 2: {
                this.execute_5();
                break;
            }
            case 3: {
                this.execute_6();
                break;
            }
            case 4: {
                this.execute_7();
                break;
            }
            case 5: {
                this.execute_8();
                break;
            }
        }
    }
    
    private static void lambda$dumpInventory$3() {
        if (CacheXImpl.class310.field_1724 != null) {
            CacheXImpl.class310.field_1724.method_7346();
        }
    }
    
    private void lambda$openEnderChest$2() {
        final int n = -30477;
        final class_3965 class_3965 = new class_3965(class_243.method_24953((class_2382)this.class2338), class_2350.field_11036, this.class2338, false);
        final int n2 = 16060;
        CacheXImpl.class310.field_1761.method_2896(CacheXImpl.class310.field_1724, class_1268.field_5808, class_3965);
        this.boolFlag_2 = true;
        this.intValue_5 = 10;
        Initializer_5.setString(createString(n, n2));
    }
    
    private void lambda$mineSpawners$1() {
        this.boolFlag_1 = true;
        this.intValue_2 = 0;
    }
    
    private static void lambda$onEnable$0() {
        CacheXImpl.class310.field_1755.method_25419();
    }
    
    static {
        final String[] strArr2 = new String[44];
        int n = 0;
        String s;
        int n2 = (s = """
                      \u0084s/\u00ed\u0006D8m\u00c4\u0091/`\u0085w³\u009f:\u000e\u00c0\u00f2\u0016d\u00ce¸s\u00de´V®\u00fd\u00d9\u0014 F\u0005s;\u001f\u0092\u00cfA:wµ\u009eo\u00f8=\u00c8\f\u00c3\u0018\u00ee¹¡\u0006\u009f\u00eeu9\u0090\u00d4\u00ee6\u0090\u0011\u00eck¾§Hq\u0011\u0090\G*?\u00c3½\u001e\u00d9\u00f8\u000b}d\u0098\u001a\u008cV\u00c8\u0016\u0019¯D\u000e\u008d\u000em\u00d3E[ho\u00c1\k§)X\u0004j\u00c6yN\u000b\u00c8\u00d5B\u0000\u00c2\u00d7 \u00c5\u00c5J\u0010\b1\u00fa\u00ea\u0005\u0014\u0094\u00ef \u0011$\§W6\u00997\u00e0r%h\u00d3\u009b\u0090\u0002/F\u0011¸<\u00cb\u0095\u0091\u0093\u00f2v\u0092\u007f\u0001\u00c3d\u00d4>\u009eG\b\u00e8\u00d0\u00c1\b\u00d0 \u00dap\u001c\r\u00fdd\u001c\u00eb\u00c7\u00d1\u000f&\u008cv\u0018\u000e\u00dd\u00d4\u00d0t@«u>\u001e\u008cb\u00f1£vO\u000eO'\u00e7\u00de\u00f0\u00ef´4L\u000b±V:2
                      \u00e7y	\u001bT\u00cc@\u008bkF]{
                      \u0084\u0007\u00f9\u0003\b\u0081\u00cb\u0095£\u00eb\u00fd\u0010+£\u001d¾\u00d2\u00167	F\u00ec?\u00e9¹½\u00e1\u0016\u001au\u00c4\u008f\u0082\u0085\u0001|$\u00dcq®	K\u00d9$\u00d8E\u00adt\u00f5±\u008a¸\u00821\u0087\u008d\u00f7&d\u009c6½\u001aW\u0013\u0002Oª!\u009d\u0092nO\u00ad4 \u00ff\u008c\u00db\u0010\u00c2\u00d1\u008f\u00d5³¨\u0017(\u0099\u008e\f&§\u00d4\u00f83z\u00e2»k/\u00c6\u00ec^\u00ff\u00ea\u001eKi´\u00c9\u00d6~\u00f0\u0016¹7\u0005\u0097\u00e9\u0087w!½\u00d4\u00f2£\u00e7\u0005d	\u00e0s\u00cd\u00da³|*&\u00e4\u0002\u00c6µ\u0012;{M\u0094,Y)\u008b\u0013¾\u008a¾9\u0092y\u00c0\u0007\u00c4\u0011\u00e5\u000f\u00c3\u0016\f\u009c=\u0007\u008b\u0084$M\u00e4\u0085\u009abº	\u0096\u0005\u0002\u00e3\u0082\u0082½\u001c\u008f#\u0094\u00c0\u000fK5,\u009f<\u0098HM(\u0019m\u00ff³\u00d7\u00f4\u008c)\u001eQ\u00c7\u00ef!\u008d\u0094\u00ef[\u0003\u00e6X\u00eb\u0007\u00d6\u0010\f\u0005>#$\u009d|VL\u00f6>\u008c§\u00ea\u00f77\u0007\u00e4\r\u00c7\u001br´¶\u0011|¢¥¯1>\u008ag_-&J\u00c9t\u00dc\r\u00f7&\u00c6\u00fd\u00fbu\u00f9&\u0001\u0098\u00f0\u00dc®±»\b\u00df\u00ceF\u00edm\u001e\u0094	\u009f\u00ee\u0013\u00fa\u0000\u00cd<qC\u00de\u00e83\u00ec`C\u00e4\u0010\u00ff\u0081\u0010\u0096µ\u0087\u009eq\u00ef\u00eb^\u001a\u008f\u00ef\u0006\u00e1\b\u00d5\u0003U\u00c7\u0011\u0097\u009dL\u0010\u00c4¡½\u0084\u00d9W\u00c3\u00d6°H\u00cb\u0014\u0019_6\u0092\u0011\u00fb\u0005\j\u0014\u00c8\u009a§-¡\u0004\u00e3\u0006&¦ª\u00ef\bµ\r\u008d\u008a\u0006\u0018\u00ffX\u000f*\u0098\u0099\u0001\u00db\u0001»\u0007\u00e9*c\u00c1\u0099\u00f5F	\u0013M\u001b\u008b\u0095\u001b\u00e8~x\u0007\u00c9\u008b E±\u000b\u000f\u000f*\u00e5\u0002·+\u00e6W\u00c2¦\u00d5a\u0091¿5\u00d7&J2j\u008c\u00cb\u0019G\u007f8 ·.\u0098\u00fb»°\u00ca"\u00fc\u00e7¦6\u00d9	\u00db\u0006\u0019R\u001f\u0082' d\u00fc}\u0099q\u00db\u0006\u0015\u00fc\u00ddh\u00cfS\u001f¹s\u00fbn0Mº\u0000\u001d\u0090\u00ee¼Wa\u001fK\u00e4\u0096\u001c\u009dy\u00f8\u008e\u0018\u0015\u0083\u0081\u00ad\u00ec\u00c8¤\u0005\u0014w\u00d0S\u001f\u0012c\u00fb`\u00d6i^\u00d9\u00fcc4e\u0000\u00ce!82\u00ad\u009b
                      \u00eb{FSq\u00ca\u00d9\u00d8\u0018\u00ff""").length();
        int n3 = 17;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 19));
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
                        Label_0264: {
                            if (length > 1) {
                                break Label_0264;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 77;
                                    case 1 -> 59;
                                    case 2 -> 92;
                                    case 3 -> 13;
                                    case 4 -> 49;
                                    case 5 -> 13;
                                    default -> 70;
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
                            n2 = (s = "«\u00fa'\u00c3\u0082\u00d7\u001e\u0000\t¦©p\u0081\u008b\u00d8\u0080R%").length();
                            n3 = 8;
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
                    n5 = (n6 = (n7 = (n8 = 85)));
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
        strArr_1 = new String[44];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFF88D0) & 0xFFFF;
        if (CacheXImpl.strArr_1[n3] == null) {
            final char[] charArray = CacheXImpl.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 46;
                case 1 -> 103;
                case 2 -> 20;
                case 3 -> 159;
                case 4 -> 64;
                case 5 -> 215;
                case 6 -> 239;
                case 7 -> 62;
                case 8 -> 63;
                case 9 -> 17;
                case 10 -> 77;
                case 11 -> 207;
                case 12 -> 115;
                case 13 -> 219;
                case 14 -> 188;
                case 15 -> 52;
                case 16 -> 166;
                case 17 -> 185;
                case 18 -> 217;
                case 19 -> 178;
                case 20 -> 65;
                case 21 -> 109;
                case 22 -> 59;
                case 23 -> 173;
                case 24 -> 193;
                case 25 -> 142;
                case 26 -> 45;
                case 27 -> 150;
                case 28 -> 55;
                case 29 -> 182;
                case 30 -> 214;
                case 31 -> 16;
                case 32 -> 186;
                case 33 -> 13;
                case 34 -> 94;
                case 35 -> 161;
                case 36 -> 243;
                case 37 -> 125;
                case 38 -> 228;
                case 39 -> 130;
                case 40 -> 39;
                case 41 -> 163;
                case 42 -> 212;
                case 43 -> 117;
                case 44 -> 105;
                case 45 -> 88;
                case 46 -> 28;
                case 47 -> 208;
                case 48 -> 164;
                case 49 -> 73;
                case 50 -> 85;
                case 51 -> 111;
                case 52 -> 12;
                case 53 -> 27;
                case 54 -> 126;
                case 55 -> 229;
                case 56 -> 10;
                case 57 -> 187;
                case 58 -> 75;
                case 59 -> 175;
                case 60 -> 250;
                case 61 -> 141;
                case 62 -> 118;
                case 63 -> 106;
                case 64 -> 37;
                case 65 -> 131;
                case 66 -> 120;
                case 67 -> 233;
                case 68 -> 34;
                case 69 -> 158;
                case 70 -> 154;
                case 71 -> 32;
                case 72 -> 11;
                case 73 -> 134;
                case 74 -> 33;
                case 75 -> 216;
                case 76 -> 67;
                case 77 -> 183;
                case 78 -> 93;
                case 79 -> 135;
                case 80 -> 149;
                case 81 -> 99;
                case 82 -> 143;
                case 83 -> 181;
                case 84 -> 69;
                case 85 -> 138;
                case 86 -> 254;
                case 87 -> 204;
                case 88 -> 226;
                case 89 -> 191;
                case 90 -> 61;
                case 91 -> 18;
                case 92 -> 30;
                case 93 -> 29;
                case 94 -> 200;
                case 95 -> 121;
                case 96 -> 179;
                case 97 -> 168;
                case 98 -> 6;
                case 99 -> 251;
                case 100 -> 23;
                case 101 -> 114;
                case 102 -> 80;
                case 103 -> 174;
                case 104 -> 79;
                case 105 -> 83;
                case 106 -> 162;
                case 107 -> 92;
                case 108 -> 132;
                case 109 -> 252;
                case 110 -> 234;
                case 111 -> 91;
                case 112 -> 107;
                case 113 -> 31;
                case 114 -> 48;
                case 115 -> 38;
                case 116 -> 129;
                case 117 -> 172;
                case 118 -> 68;
                case 119 -> 184;
                case 120 -> 96;
                case 121 -> 225;
                case 122 -> 194;
                case 123 -> 70;
                case 124 -> 165;
                case 125 -> 97;
                case 126 -> 176;
                case 127 -> 199;
                case 128 -> 90;
                case 129 -> 180;
                case 130 -> 232;
                case 131 -> 190;
                case 132 -> 236;
                case 133 -> 249;
                case 134 -> 104;
                case 135 -> 146;
                case 136 -> 171;
                case 137 -> 189;
                case 138 -> 156;
                case 139 -> 78;
                case 140 -> 87;
                case 141 -> 170;
                case 142 -> 24;
                case 143 -> 246;
                case 144 -> 242;
                case 145 -> 21;
                case 146 -> 218;
                case 147 -> 25;
                case 148 -> 42;
                case 149 -> 51;
                case 150 -> 203;
                case 151 -> 198;
                case 152 -> 47;
                case 153 -> 177;
                case 154 -> 201;
                case 155 -> 211;
                case 156 -> 9;
                case 157 -> 127;
                case 158 -> 26;
                case 159 -> 169;
                case 160 -> 153;
                case 161 -> 8;
                case 162 -> 56;
                case 163 -> 81;
                case 164 -> 241;
                case 165 -> 2;
                case 166 -> 240;
                case 167 -> 253;
                case 168 -> 108;
                case 169 -> 76;
                case 170 -> 113;
                case 171 -> 3;
                case 172 -> 36;
                case 173 -> 14;
                case 174 -> 7;
                case 175 -> 221;
                case 176 -> 101;
                case 177 -> 35;
                case 178 -> 223;
                case 179 -> 196;
                case 180 -> 40;
                case 181 -> 95;
                case 182 -> 231;
                case 183 -> 41;
                case 184 -> 43;
                case 185 -> 148;
                case 186 -> 84;
                case 187 -> 57;
                case 188 -> 66;
                case 189 -> 213;
                case 190 -> 220;
                case 191 -> 71;
                case 192 -> 128;
                case 193 -> 72;
                case 194 -> 89;
                case 195 -> 230;
                case 196 -> 137;
                case 197 -> 44;
                case 198 -> 157;
                case 199 -> 110;
                case 200 -> 247;
                case 201 -> 4;
                case 202 -> 50;
                case 203 -> 206;
                case 204 -> 19;
                case 205 -> 0;
                case 206 -> 82;
                case 207 -> 102;
                case 208 -> 74;
                case 209 -> 192;
                case 210 -> 210;
                case 211 -> 237;
                case 212 -> 238;
                case 213 -> 202;
                case 214 -> 197;
                case 215 -> 112;
                case 216 -> 205;
                case 217 -> 140;
                case 218 -> 133;
                case 219 -> 152;
                case 220 -> 58;
                case 221 -> 98;
                case 222 -> 155;
                case 223 -> 147;
                case 224 -> 224;
                case 225 -> 144;
                case 226 -> 195;
                case 227 -> 116;
                case 228 -> 235;
                case 229 -> 86;
                case 230 -> 160;
                case 231 -> 248;
                case 232 -> 53;
                case 233 -> 22;
                case 234 -> 227;
                case 235 -> 119;
                case 236 -> 151;
                case 237 -> 136;
                case 238 -> 222;
                case 239 -> 145;
                case 240 -> 15;
                case 241 -> 123;
                case 242 -> 139;
                case 243 -> 5;
                case 244 -> 60;
                case 245 -> 100;
                case 246 -> 49;
                case 247 -> 122;
                case 248 -> 54;
                case 249 -> 255;
                case 250 -> 167;
                case 251 -> 124;
                case 252 -> 1;
                case 253 -> 209;
                case 254 -> 245;
                default -> 244;
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
            CacheXImpl.strArr_1[n3] = new String(charArray).intern();
        }
        return CacheXImpl.strArr_1[n3];
    }
}
