// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3.sub1;

import net.minecraft.class_1792;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_1268;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_20;
import net.minecraft.class_1802;
import java.util.Iterator;
import net.minecraft.class_332;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import java.util.List;
import net.minecraft.class_1657;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_9;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_6 extends Initializer_3 implements PackDImpl_5, PackDImpl_9
{
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_1 buildC_3;
    private final SyncASub_1 buildC_4;
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_5 parseB_5;
    private final SyncASub_5 parseB_6;
    private final SyncASub_5 parseB_7;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private boolean boolFlag_2;
    private class_1657 class1657;
    private List<String> list;
    private long longValue;
    private int intValue_3;
    
    public DataNImpl_6() {
        super("auto_mace", Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 156, 211, 250, 211, 178, 213, 240, 145, 52, 17 }), "A.utomatically attacks with mace on fall", Initializer.cacheE);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 101, 0, 71, 134, 255, 166, 174, 17, 211, 251, 246, 178, 213, 250, 145, 52, 7, 112, 23, 33, 47, 118, 87, 14, 81, 121, 237, 176, 155, 204, 147, 188 }), 1.0, 6.0, 4.5, 0.1);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 74, 33, 100, 106, 207, 21, 185, 184, 244, 155, 180, 211, 250, 219, 178, 213, 244, 145, 52, 28, 112, 23, 33 }), 1.0, 10.0, 3.0, 0.1);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 74, 33, 100, 106, 207, 21, 185, 182, 244, 155, 176, 211, 250, 222, 178, 213, 255, 94, 102, 40, 44, 69, 8, 80, 36, 107, 100, 3, 74, 135, 226, 165, 167 }), 0.1, 2.0, 0.3, 0.1);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 87, 33, 100, 112, 0, 71, 132, 255, 166, 165, 222, 129, 204, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 0.0, 10.0, 1.0, 1.0);
        this.buildC_4 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 132, 255, 166, 165, 222, 129, 207, 114, 178, 212, 215, 145, 52, 17, 112, 23, 57, 47, 118, 87, 14, 81, 110 }), 1.0, 5.0, 2.0, 1.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 117, 0, 71, 144, 255, 166, 175, 222, 129, 213, 189, 224, 237, 83, 145, 53, 49, 112, 23, 57, 47, 118, 79, 14, 81, 99, 237, 176, 138, 204, 147, 184 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 130, 211, 250, 197, 178, 213, 250, 145, 52, 0, 112, 23, 54, 47, 118, 94, 14, 80, 121, 34, 226, 164, 129, 193, 132, 197, 160, 231, 230, 159, 198, 13 }), true);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 79, 33, 100, 109, 0, 71, 134, 255, 166, 173, 17, 211, 251, 225, 178, 213, 250, 145, 52, 25, 112, 23, 32, 47, 118, 90, 14, 81, 118, 237, 176, 140, 204, 147, 176, 171, 242, 213, 138, 205, 245 }), true);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 75, 33, 100, 97, 0, 71, 134, 255, 166, 173, 17, 211, 251, 254, 178, 213, 250, 145, 52, 26, 112, 23, 48, 224, 36, 107, 110, 3, 74, 132, 45, 247, 159, 157, 214, 249, 198, 181, 216, 247, 148, 59, 25, 115, 26, 38 }), true);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 33, 100, 104, 0, 71, 156, 48, 244, 154, 134, 211, 250, 218, 178, 213, 246, 145, 52, 26, 191, 69, 9, 102, 36, 107, 96, 3, 74, 142, 226, 165, 175, 193, 132, 205, 160, 231, 235, 159, 198, 1 }), true);
        this.parseB_5 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 117, 0, 71, 144, 255, 166, 175, 222, 129, 213, 189, 224, 237, 83, 145, 53, 55, 112, 23, 39, 47, 118, 95, 14, 81, 99 }), true);
        this.parseB_6 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 147, 211, 250, 192, 178, 213, 246, 145, 52, 21, 112, 23, 54, 47, 118, 94 }), false);
        this.parseB_7 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 75, 33, 100, 107, 0, 71, 146, 48, 244, 154, 130, 211, 250, 198, 178, 213, 242, 145, 52, 0, 112, 23, 32, 47, 118, 69, 193, 3, 75, 166, 226, 165, 170, 193, 132, 215, 160, 231, 245, 159, 198, 10, 126, 33, 38, 93, 0, 81 }), true);
        this.intValue = -1;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.class1657 = null;
        this.list = new ArrayList<String>();
        this.longValue = 0L;
        this.intValue_3 = 0;
        this.setSyncaarr(this.buildC, this.buildC_1, this.buildC_2, this.buildC_3, this.buildC_4, this.parseB, this.parseB_1, this.parseB_2, this.parseB_3, this.parseB_4, this.parseB_5, this.parseB_6, this.parseB_7);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_9.class, this);
        this.execute_8();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_9.class, this);
        this.execute_6();
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        if (DataNImpl_6.class310.field_1724 == null || DataNImpl_6.class310.field_1687 == null || DataNImpl_6.class310.field_1755 != null) {
            return;
        }
        this.execute_5();
        if (this.intValue_1 > 0) {
            --this.intValue_1;
        }
        if (this.intValue_2 > 0) {
            --this.intValue_2;
        }
        this.execute_3();
        if (!Initializer_10.checkPredicate(DataNImpl_6::lambda$onTick$0)) {
            return;
        }
        if (!this.isEnabled()) {
            if (this.intValue != -1 && this.parseB_1.getBoolean()) {
                this.execute_6();
            }
            return;
        }
        final class_1657 class_1657 = this.getClass_1657();
        if (class_1657 == null) {
            if (this.intValue != -1 && this.parseB_1.getBoolean()) {
                this.execute_6();
            }
            if (this.isEnabled()) {
                this.setString("Waiting for player...");
            }
            return;
        }
        this.class1657 = class_1657;
        final double d = DataNImpl_6.class310.field_1724.method_5739((class_1297)class_1657);
        this.setString("Found player: " + class_1657.method_5477().getString());
        if (d <= this.buildC.getDouble()) {
            if (this.parseB_6.getBoolean() && this.isEnabled_1() && this.checkClass_1657_1(class_1657)) {
                this.setClass_1657_2(class_1657);
            }
            else {
                this.setClass_1657(class_1657);
            }
        }
        else {
            this.setString("Approaching target... (" + String.format("%.1f", d) + "m)");
        }
    }
    
    private boolean isEnabled() {
        return DataNImpl_6.class310.field_1724 != null && (!this.parseB.getBoolean() || DataNImpl_6.class310.field_1724.method_6128()) && (!this.parseB_4.getBoolean() || Math.abs(DataNImpl_6.class310.field_1724.method_18798().field_1351) >= this.buildC_2.getDouble()) && this.getDouble() >= this.buildC_1.getDouble();
    }
    
    private void execute_3() {
        if (!this.parseB_7.getBoolean()) {
            return;
        }
        final boolean boolFlag_2 = this.getDouble() >= 5.0;
        if (boolFlag_2 && !this.boolFlag_2) {
            this.list.clear();
            this.setString("Mace mode activated - searching for targets...");
            this.intValue_2 = 0;
        }
        if (!boolFlag_2 && this.boolFlag_2) {
            this.intValue_2 = 60;
        }
        if (!boolFlag_2 && this.intValue_2 == 0 && !this.list.isEmpty()) {
            this.list.clear();
        }
        this.boolFlag_2 = boolFlag_2;
    }
    
    private void setString(final String s) {
        if (!this.parseB_7.getBoolean()) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.longValue > 100L) {
            if (!this.list.contains(s)) {
                this.list.add(s);
                if (this.list.size() > 5) {
                    this.list.remove(0);
                }
            }
            this.longValue = currentTimeMillis;
        }
    }
    
    @Override
    public void setClass_332AndFloat(final class_332 class_332, final float n) {
        if (!this.parseB_7.getBoolean() || this.list.isEmpty()) {
            return;
        }
        if (DataNImpl_6.class310.field_1724 == null || DataNImpl_6.class310.field_1687 == null) {
            return;
        }
        final int n2 = 10;
        final int n3 = 10;
        int n4 = 0;
        final Iterator<String> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            final int method_1727 = DataNImpl_6.class310.field_1772.method_1727((String)iterator.next());
            if (method_1727 > n4) {
                n4 = method_1727;
            }
        }
        final int n5 = this.list.size() * 12 + 8;
        class_332.method_25294(n3 - 4, n2 - 4, n3 + n4 + 8, n2 + n5, Integer.MIN_VALUE);
        class_332.method_25294(n3 - 4, n2 - 4, n4 + 12, n5 + 4, -16711936);
        for (int i = 0; i < this.list.size(); ++i) {
            class_332.method_51433(DataNImpl_6.class310.field_1772, (String)this.list.get(i), n3, n2 + i * 12, 16777215, true);
        }
    }
    
    private boolean isEnabled_1() {
        return Initializer_10.checkPredicate(DataNImpl_6::lambda$hasAxeInHotbar$1);
    }
    
    private boolean checkClass_1657_1(final class_1657 class_1657) {
        if (class_1657 == null) {
            return false;
        }
        final boolean method_6115 = class_1657.method_6115();
        final boolean b = class_1657.method_6047().method_7909().toString().contains("shield") || class_1657.method_6079().method_7909().toString().contains("shield");
        final boolean method_6116 = class_1657.method_6039();
        return (b && method_6115) || method_6116;
    }
    
    private void setClass_1657_2(final class_1657 class_1657_1) {
        if (this.intValue_1 > 0) {
            return;
        }
        if (!this.boolFlag_1) {
            if (!this.isEnabled_4()) {
                this.setString("No axe found - using mace only");
                this.setClass_1657(class_1657_1);
                return;
            }
            this.setString(new String(new byte[] { 66, 114, 101, 97, 107, 105, 110, 103, 32, 115, 104, 105, 101, 108, 100, 32, 119, 105, 116, 104, 32, 97, 120, 101, 46, 46, 46 }));
            this.setClass_1657_1(class_1657_1);
            if (!this.isEnabled_3()) {
                this.setString(new String(new byte[] { 70, 97, 105, 108, 101, 100, 32, 116, 111, 32, 115, 119, 105, 116, 99, 104, 32, 116, 111, 32, 109, 97, 99, 101, 32, 97, 102, 116, 101, 114, 32, 97, 120, 101, 33 }));
                this.boolFlag_1 = false;
                return;
            }
            this.setString("Macing target for high damage!");
            this.setClass_1657_1(class_1657_1);
            this.boolFlag = true;
            this.boolFlag_1 = false;
            this.intValue_1 = Math.max(this.buildC_3.getInt(), 20);
            if (this.parseB_1.getBoolean()) {
                this.execute_4();
            }
        }
    }
    
    private class_1657 getClass_1657() {
        class_1657 class_1657 = null;
        double doubleValue = this.buildC.getDouble();
        for (final class_1657 class_1658 : DataNImpl_6.class310.field_1687.method_18456()) {
            if (!this.checkClass_1657(class_1658)) {
                continue;
            }
            final double n = DataNImpl_6.class310.field_1724.method_5739((class_1297)class_1658);
            if (n > doubleValue) {
                continue;
            }
            if (this.parseB_3.getBoolean() && !DataNImpl_6.class310.field_1724.method_6057((class_1297)class_1658)) {
                continue;
            }
            doubleValue = n;
            class_1657 = class_1658;
        }
        return class_1657;
    }
    
    private boolean checkClass_1657(final class_1657 class_1657) {
        return class_1657 != null && class_1657 != DataNImpl_6.class310.field_1724 && !class_1657.method_29504() && !class_1657.method_31481() && !class_1657.method_68878() && !class_1657.method_7325();
    }
    
    private void setClass_1657(final class_1657 class_1657_1) {
        if (this.intValue_1 > 0) {
            return;
        }
        if (this.parseB_5.getBoolean() && !this.isEnabled_2()) {
            this.setString("Waiting for crit opportunity...");
            return;
        }
        if (!DataNImpl_6.class310.field_1724.method_6047().method_31574(class_1802.field_49814) && !this.isEnabled_3()) {
            return;
        }
        this.setString("Macing " + class_1657_1.method_5477().getString());
        this.setClass_1657_1(class_1657_1);
        this.intValue_1 = Math.max(this.buildC_3.getInt(), 10);
        this.boolFlag = true;
        if (this.parseB_1.getBoolean()) {
            this.execute_4();
        }
    }
    
    private void setClass_1657_1(final class_1657 class_1657) {
        if (this.parseB_2.getBoolean()) {
            Initializer_20.setIntAndInt(0, 100);
        }
        DataNImpl_6.class310.field_1761.method_2918((class_1657)DataNImpl_6.class310.field_1724, (class_1297)class_1657);
        DataNImpl_6.class310.field_1724.method_6104(class_1268.field_5808);
    }
    
    private boolean isEnabled_2() {
        if (DataNImpl_6.class310.field_1724 == null) {
            return false;
        }
        final boolean b = !DataNImpl_6.class310.field_1724.method_24828() && DataNImpl_6.class310.field_1724.method_18798().field_1351 < 0.0;
        final boolean b2 = !DataNImpl_6.class310.field_1724.method_5799() && !DataNImpl_6.class310.field_1724.method_5771();
        final boolean b3 = !DataNImpl_6.class310.field_1724.method_6101();
        final boolean b4 = !DataNImpl_6.class310.field_1724.method_5765();
        return b && b2 && b3 && b4;
    }
    
    private void execute_4() {
        this.intValue_3 = 4;
    }
    
    private void execute_5() {
        if (this.intValue_3 > 0) {
            --this.intValue_3;
            if (this.intValue_3 == 0) {
                this.execute_6();
            }
        }
    }
    
    private boolean isEnabled_3() {
        if (this.intValue == -1) {
            this.intValue = Initializer_8.method_int(DataNImpl_6.class310.field_1724.method_31548());
        }
        for (int i = 0; i < 9; ++i) {
            if (DataNImpl_6.class310.field_1724.method_31548().method_5438(i).method_31574(class_1802.field_49814)) {
                Initializer_8.setClass_1661AndInt(DataNImpl_6.class310.field_1724.method_31548(), i);
                return true;
            }
        }
        return false;
    }
    
    private boolean isEnabled_4() {
        if (this.intValue == -1) {
            this.intValue = Initializer_8.method_int(DataNImpl_6.class310.field_1724.method_31548());
        }
        for (int i = 0; i < 9; ++i) {
            if (DataNImpl_6.class310.field_1724.method_31548().method_5438(i).method_7909().toString().contains("axe")) {
                Initializer_8.setClass_1661AndInt(DataNImpl_6.class310.field_1724.method_31548(), i);
                return true;
            }
        }
        return false;
    }
    
    private void execute_6() {
        if (this.intValue != -1 && this.intValue != Initializer_8.method_int(DataNImpl_6.class310.field_1724.method_31548())) {
            Initializer_8.setClass_1661AndInt(DataNImpl_6.class310.field_1724.method_31548(), this.intValue);
            this.intValue = -1;
        }
    }
    
    private void execute_7() {
        this.boolFlag_1 = false;
    }
    
    private double getDouble() {
        if (DataNImpl_6.class310.field_1724 == null || DataNImpl_6.class310.field_1687 == null) {
            return 0.0;
        }
        final double method_23318 = DataNImpl_6.class310.field_1724.method_23318();
        for (int i = 1; i <= 256; ++i) {
            final int n = (int)(method_23318 - i);
            if (n < DataNImpl_6.class310.field_1687.method_31607()) {
                break;
            }
            if (!DataNImpl_6.class310.field_1687.method_8320(DataNImpl_6.class310.field_1724.method_24515().method_33096(n)).method_26215()) {
                return i;
            }
        }
        return method_23318 - DataNImpl_6.class310.field_1687.method_31607();
    }
    
    private void execute_8() {
        this.intValue = -1;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.class1657 = null;
        this.list.clear();
    }
    
    public class_1657 getClass_1657_1() {
        return this.class1657;
    }
    
    public boolean isEnabled_5() {
        return this.isEnabled() && this.isEnabled() && this.class1657 != null;
    }
    
    public boolean isEnabled_6() {
        return this.boolFlag;
    }
    
    public boolean isEnabled_7() {
        return this.boolFlag_1;
    }
    
    public double getDouble_1() {
        return this.getDouble();
    }
    
    private static boolean lambda$hasAxeInHotbar$1(final class_1792 class_1792) {
        return class_1792.toString().contains("axe");
    }
    
    private static boolean lambda$onTick$0(final class_1792 class_1792) {
        return class_1792 == class_1802.field_49814;
    }
}
