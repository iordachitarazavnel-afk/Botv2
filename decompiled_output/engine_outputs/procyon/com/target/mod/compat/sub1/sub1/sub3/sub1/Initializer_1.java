// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub1;

import net.minecraft.class_1802;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import net.minecraft.class_7923;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_13;
import net.minecraft.class_1935;
import net.minecraft.class_1799;
import java.util.List;
import net.minecraft.class_1792;
import net.minecraft.class_332;
import net.minecraft.class_310;

public class Initializer_1
{
    private final class_310 class310;
    private final int intValue = 24;
    private int intValue_1;
    
    public Initializer_1() {
        this.class310 = class_310.method_1551();
        this.intValue_1 = 0;
    }
    
    public void processAll(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final String s, final float n5) {
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncaarrArray = Initializer.getSyncaarrArray();
        com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.processAll(class_332, n, n2, n3, n4, 5, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_12(), n5 * com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getFloat()));
        class_332.method_44379(n, n2, n + n3, n2 + n4);
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] array = syncaarrArray;
        final List<class_1792> computeList = this.computeList(s);
        final int n6 = n4 / 24;
        this.intValue_1 = Math.max(0, Math.min(this.intValue_1, Math.max(0, computeList.size() - n6)));
        int i = 0;
        while (true) {
            while (i < n6) {
                final int n7 = i + this.intValue_1;
                if (array == null || array == null) {
                    if (n7 > 0) {
                        this.processAll_2(class_332, n, n2, n3, n4, computeList.size(), n6, n5);
                    }
                    return;
                }
                if (n7 >= computeList.size()) {
                    break;
                }
                this.processAll_1(class_332, (class_1792)computeList.get(i + this.intValue_1), n + 5, n2 + 5 + i * 24, n3 - 20, 24, n5);
                ++i;
                if (array == null) {
                    int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
                    com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
                    break;
                }
            }
            class_332.method_44380();
            continue;
        }
    }
    
    private void processAll_1(final class_332 class_332, final class_1792 class_333, final int n, final int n2, final int n3, final int n4, final float n5) {
        com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.processAll(class_332, n, n2, n3, n4, 3, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(0, 0.0f));
        class_332.method_51427(new class_1799((class_1935)class_333), n + 4, n2 + 4);
        class_332.method_51433(this.class310.field_1772, class_333.method_63680().getString(), n + 28, n2 + 8, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int_1(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt_8(), (int)(n5 * 255.0f)) | 0xFF000000, false);
    }
    
    private void processAll_2(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        final int n8 = n + n3 - 15;
        final int n9 = n2 + 5;
        final int n10 = n4 - 10;
        final int n11 = 8;
        com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.processAll(class_332, n8, n9, n11, n10, 4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(1342177280, n7));
        final float n12 = this.intValue_1 / (float)(n5 - n6);
        final int max = Math.max(20, (int)(n6 / (float)n5 * n10));
        com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.processAll(class_332, n8, n9 + (int)((n10 - max) * n12), n11, max, 4, com.target.mod.compat.sub1.sub1.sub3.Initializer_1.method_int(com.target.mod.compat.sub1.sub1.sub3.Initializer_1.getInt(), n7));
    }
    
    public boolean checkCondition(final double n, final double n2, final int n3, final int n4, final int n5, final RenderASub_13 renderASub_13) {
        if (n3 != 0) {
            return false;
        }
        final int n6 = 180;
        final List<class_1792> computeList = this.computeList("");
        final int n7 = n6 / 24;
        if (com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n4, n5, 190, n6)) {
            final int n8 = ((int)n2 - (n5 + 5)) / 24;
            if (n8 >= 0 && n8 < n7 && n8 + this.intValue_1 < computeList.size()) {
                renderASub_13.setObject(computeList.get(n8 + this.intValue_1));
                return true;
            }
        }
        return false;
    }
    
    public boolean checkCondition_1(final double n, final double n2, final double n3, final double n4, final int n5, final int n6) {
        if (com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n5, n6, 200, 180)) {
            this.intValue_1 -= (int)n4 * 3;
            return true;
        }
        return false;
    }
    
    private List<class_1792> computeList(final String s) {
        return class_7923.field_41178.method_10220().filter(Initializer_1::lambda$getFilteredItems$0).collect((Collector<? super Object, ?, List<class_1792>>)Collectors.toList());
    }
    
    public void execute() {
        this.intValue_1 = 0;
    }
    
    private static boolean lambda$getFilteredItems$0(final String s, final class_1792 class_1792) {
        return class_1792 != class_1802.field_8162 && class_1792.method_63680().getString().toLowerCase().contains(s.toLowerCase());
    }
}
