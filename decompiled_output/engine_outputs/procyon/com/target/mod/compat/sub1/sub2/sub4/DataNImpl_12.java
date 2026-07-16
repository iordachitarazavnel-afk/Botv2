// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import java.util.Iterator;
import net.minecraft.class_1657;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_3966;
import net.minecraft.class_1268;
import net.minecraft.class_243;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_6;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_20;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_10;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_17;
import net.minecraft.class_239;
import net.minecraft.class_2246;
import net.minecraft.class_2350;
import net.minecraft.class_3965;
import net.minecraft.class_239$class_240;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_12 extends Initializer_3 implements PackDImpl_5
{
    private final SyncASub_3 initD;
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_1 buildC_3;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_1 buildC_4;
    private int intValue;
    private int intValue_1;
    private cn$MacroState cnMacroState;
    private class_2338 class2338;
    
    public DataNImpl_12() {
        super("macro_198", Initializer_14.computeString(new int[] { 132, 203, 14, 99, 43, 44, 66, 5, 77, 33, 100, 97, 207, 21, 184, 158, 244, 155, 184, 211, 250, 220, 178, 213, 246, 94, 102, 41, 26, 69, 8, 73, 36, 107, 102, 3, 74, 138, 226, 165, 183, 14, 214, 248, 226, 181, 216, 241, 148, 59, 18, 115, 26, 32, 82, 117, 92 }), "C.ombat macro for 1.9.8 style gameplay", Initializer.cacheE_1);
        this.initD = new SyncASub_3(Initializer_14.computeString(new int[] { 132, 202, 44, 99, 43, 44, 66, 5, 66, 33, 100, 103, 0, 71, 151, 255, 166, 169, 17, 211, 251, 249, 178, 213, 246, 145, 52, 13 }), 3, false);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 145, 255, 166, 167, 222, 129, 201, 189, 224, 252, 83, 145, 53, 57, 112, 23, 58, 47, 118, 82, 14, 81, 114 }), true);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 17, 211, 250, 214, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 132, 255, 166, 173, 17, 211, 250, 214, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79 }), 0.0, 20.0, 0.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 79, 33, 100, 101, 0, 71, 134, 255, 166, 163, 17, 211, 250, 209, 178, 213, 251, 145, 52, 21, 112, 23, 59, 47, 118, 85, 14, 81, 114 }), 0.0, 100.0, 100.0, 1.0);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 35, 99, 43, 44, 66, 5, 81, 33, 100, 97, 0, 71, 132, 255, 166, 173, 17, 211, 250, 209, 178, 213, 251, 145, 52, 21, 112, 23, 59, 47, 118, 85, 14, 81, 114 }), 0.0, 100.0, 100.0, 1.0);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 79, 33, 100, 109, 0, 71, 134, 255, 166, 173, 17, 211, 251, 225, 178, 213, 250, 145, 52, 25, 112, 23, 32, 47, 118, 90, 14, 81, 118, 237, 176, 140, 204, 147, 176, 171, 242, 213, 138, 205, 245 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 39, 99, 43, 44, 66, 5, 66, 33, 100, 111, 0, 71, 128, 48, 244, 155, 161, 211, 250, 199, 178, 213, 253, 145, 52, 23, 112, 23, 61 }), false);
        this.buildC_4 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 66, 33, 100, 118, 0, 71, 145, 255, 166, 175, 222, 129, 196, 189, 224, 228, 156, 195, 12, 180, 112, 22, 22, 47, 118, 94, 14, 81, 118, 237, 176, 150, 204, 147, 186, 171, 242, 223 }), 0.0, 100.0, 20.0, 1.0);
        this.intValue = 0;
        this.intValue_1 = 0;
        this.cnMacroState = cn$MacroState.IDLE;
        this.class2338 = null;
        this.setSyncaarr(this.initD, this.parseB, this.buildC, this.buildC_1, this.buildC_2, this.buildC_3, this.parseB_1, this.parseB_2, this.buildC_4);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.execute_2();
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        super.execute_1();
    }
    
    private void execute_2() {
        this.intValue = 0;
        this.intValue_1 = 0;
        this.cnMacroState = cn$MacroState.IDLE;
        this.class2338 = null;
    }
    
    public void execute_3() {
        if (DataNImpl_12.class310.field_1724 == null || DataNImpl_12.class310.field_1687 == null || DataNImpl_12.class310.field_1755 != null) {
            return;
        }
        if (!Initializer_9.checkInt(this.initD.getInt())) {
            this.execute_2();
            return;
        }
        if (this.intValue > 0) {
            --this.intValue;
        }
        if (this.intValue_1 > 0) {
            --this.intValue_1;
        }
        this.execute_9();
        for (int i = 0; i < 4; ++i) {
            final cn$MacroState cnMacroState = this.cnMacroState;
            switch (this.cnMacroState.ordinal()) {
                case 0: {
                    this.execute_4();
                    break;
                }
                case 1: {
                    this.execute_5();
                    break;
                }
                case 2: {
                    this.execute_6();
                    break;
                }
                case 3: {
                    this.execute_7();
                    break;
                }
                case 4: {
                    this.execute_8();
                    break;
                }
            }
            if (this.cnMacroState == cnMacroState) {
                break;
            }
        }
    }
    
    private void execute_4() {
        final class_239 method_5745 = DataNImpl_12.class310.field_1724.method_5745(4.5, 1.0f, false);
        if (method_5745.method_17783() != class_239$class_240.field_1332) {
            return;
        }
        final class_3965 class_3965 = (class_3965)method_5745;
        final class_2338 method_5746 = class_3965.method_17777();
        if (DataNImpl_12.class310.field_1687.method_8320(method_5746).method_26215()) {
            return;
        }
        if (DataNImpl_12.class310.field_1724.method_33571().method_1022(class_3965.method_17784()) > 4.5) {
            return;
        }
        if (class_3965.method_17780() != class_2350.field_11036) {
            return;
        }
        if (DataNImpl_12.class310.field_1687.method_8320(method_5746).method_27852(class_2246.field_10540) || DataNImpl_12.class310.field_1687.method_8320(method_5746).method_27852(class_2246.field_9987)) {
            this.class2338 = method_5746;
            this.cnMacroState = cn$MacroState.PLACE_CRYSTAL;
        }
        else {
            this.class2338 = method_5746.method_10084();
            this.cnMacroState = cn$MacroState.PLACE_OBI;
        }
    }
    
    private void execute_5() {
        if (this.intValue > 0) {
            return;
        }
        if (Initializer_17.method_int(1, 100) > this.buildC_2.getInt()) {
            return;
        }
        final class_239 method_5745 = DataNImpl_12.class310.field_1724.method_5745(4.5, 1.0f, false);
        if (method_5745.method_17783() != class_239$class_240.field_1332) {
            this.cnMacroState = cn$MacroState.IDLE;
            return;
        }
        final class_3965 class_3965 = (class_3965)method_5745;
        if (DataNImpl_12.class310.field_1724.method_33571().method_1022(class_3965.method_17784()) > 4.5) {
            this.cnMacroState = cn$MacroState.IDLE;
            return;
        }
        Initializer_10.checkClass_1792(class_1802.field_8281);
        if (this.parseB_1.getBoolean()) {
            Initializer_20.setInt_2(1);
        }
        Initializer_6.setClass_3965AndBool(class_3965, true);
        this.intValue = this.buildC.getInt();
        this.cnMacroState = cn$MacroState.WAIT_OBI;
    }
    
    private void execute_6() {
        if (DataNImpl_12.class310.field_1687.method_8320(this.class2338).method_27852(class_2246.field_10540)) {
            this.cnMacroState = cn$MacroState.PLACE_CRYSTAL;
        }
        else {
            final class_2338 method_10074 = this.class2338.method_10074();
            if (DataNImpl_12.class310.field_1687.method_8320(method_10074).method_27852(class_2246.field_10540)) {
                this.class2338 = method_10074;
                this.cnMacroState = cn$MacroState.PLACE_CRYSTAL;
            }
            else {
                this.cnMacroState = cn$MacroState.IDLE;
            }
        }
    }
    
    private void execute_7() {
        if (this.intValue > 0) {
            return;
        }
        if (!DataNImpl_12.class310.field_1687.method_8320(this.class2338).method_27852(class_2246.field_10540) && !DataNImpl_12.class310.field_1687.method_8320(this.class2338).method_27852(class_2246.field_9987)) {
            this.cnMacroState = cn$MacroState.IDLE;
            return;
        }
        if (!com.target.mod.compat.sub1.sub2.sub7.Initializer.checkClass_2338(this.class2338)) {
            this.cnMacroState = cn$MacroState.BREAK_CRYSTAL;
            return;
        }
        if (Initializer_17.method_int(1, 100) > this.buildC_2.getInt()) {
            return;
        }
        Initializer_10.checkClass_1792(class_1802.field_8301);
        final class_3965 class_3965 = new class_3965(new class_243(this.class2338.method_10263() + 0.5, this.class2338.method_10264() + 1.0, this.class2338.method_10260() + 0.5), class_2350.field_11036, this.class2338, false);
        if (this.parseB_1.getBoolean()) {
            Initializer_20.setInt_2(1);
        }
        Initializer_6.setClass_3965AndBool(class_3965, true);
        if (!this.parseB_2.getBoolean() || Initializer_17.method_int(1, 100) <= this.buildC_4.getInt()) {}
        this.intValue = this.buildC.getInt();
        this.cnMacroState = cn$MacroState.BREAK_CRYSTAL;
    }
    
    private void execute_8() {
        if (this.parseB.getBoolean()) {
            this.cnMacroState = cn$MacroState.IDLE;
        }
        else if (DataNImpl_12.class310.field_1687.method_8320(this.class2338).method_27852(class_2246.field_10540) || DataNImpl_12.class310.field_1687.method_8320(this.class2338).method_27852(class_2246.field_9987)) {
            this.cnMacroState = cn$MacroState.PLACE_CRYSTAL;
        }
        else {
            this.cnMacroState = cn$MacroState.IDLE;
        }
        if (this.parseB_2.getBoolean() && DataNImpl_12.class310.field_1765 != null && DataNImpl_12.class310.field_1765.method_17783() == class_239$class_240.field_1333) {
            final int method_int = Initializer_17.method_int(1, 100);
            if (this.intValue_1 == 0 && method_int <= this.buildC_3.getInt()) {
                if (DataNImpl_12.class310.field_1761.method_2924()) {
                    DataNImpl_12.class310.field_1771 = 10;
                }
                if (this.parseB_1.getBoolean()) {
                    Initializer_20.setInt_2(0);
                }
                DataNImpl_12.class310.field_1724.method_6104(class_1268.field_5808);
                this.intValue_1 = this.buildC_1.getInt();
            }
        }
    }
    
    private void execute_9() {
        if (this.intValue_1 > 0) {
            return;
        }
        if (Initializer_17.method_int(1, 100) > this.buildC_3.getInt()) {
            return;
        }
        final class_239 field_1765 = DataNImpl_12.class310.field_1765;
        if (field_1765 instanceof final class_3966 class_1298) {
            final class_1297 method_17782 = class_1298.method_17782();
            if (method_17782 instanceof class_1511) {
                if (this.parseB_1.getBoolean()) {
                    Initializer_20.setInt_2(0);
                }
                Initializer_6.setClass_1297AndBool(method_17782, true);
                this.intValue_1 = this.buildC_1.getInt();
                return;
            }
        }
        for (final class_1297 class_1297 : DataNImpl_12.class310.field_1687.method_18112()) {
            if (class_1297 instanceof class_1511 && class_1297.method_5739((class_1297)DataNImpl_12.class310.field_1724) < 9.0) {
                if (this.parseB_1.getBoolean()) {
                    Initializer_20.setInt_2(0);
                }
                DataNImpl_12.class310.field_1761.method_2918((class_1657)DataNImpl_12.class310.field_1724, class_1297);
                DataNImpl_12.class310.field_1724.method_6104(class_1268.field_5808);
                this.intValue_1 = this.buildC_1.getInt();
                break;
            }
        }
    }
}
