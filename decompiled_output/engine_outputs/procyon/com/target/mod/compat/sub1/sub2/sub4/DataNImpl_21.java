// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import net.minecraft.class_1268;
import net.minecraft.class_3532;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_9334;
import net.minecraft.class_1844;
import net.minecraft.class_1802;
import net.minecraft.class_1799;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_21 extends Initializer_3 implements PackDImpl_5
{
    private co$State coState;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_5 parseB;
    private final SyncASub_1 buildC_3;
    private final com.target.mod.compat.sub1.sub2.sub7.Initializer_1 buffT;
    private int intValue;
    private float floatValue;
    private float floatValue_1;
    private int intValue_1;
    private boolean boolFlag;
    
    public DataNImpl_21() {
        super("auto_neth_pot", Initializer_14.computeString(new int[] { 132, 202, 47, 99, 43, 44, 66, 5, 70, 33, 100, 112, 0, 71, 141, 255, 167, 150, 222, 129, 200, 189, 224, 252 }), "A.utomatically throws healing splash potions when health is low", Initializer.cacheE_2);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 81, 33, 100, 109, 0, 71, 130, 48, 244, 154, 153, 211, 250, 215, 178, 213, 242, 145, 52, 24, 112, 23, 33, 47, 118, 94 }), 1.0, 20.0, 10.0, 0.5);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 49, 99, 43, 44, 66, 5, 76, 33, 100, 112, 207, 21, 185, 179, 244, 155, 190, 211, 250, 199, 178, 213, 253, 145, 52, 0 }), 1.0, 5.0, 2.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 75, 33, 100, 118, 0, 71, 138, 255, 166, 177, 17, 211, 251, 246, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79 }), 50.0, 500.0, 150.0, 10.0);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 86, 33, 100, 112, 0, 71, 138, 48, 244, 154, 131, 211, 250, 215, 178, 213, 245, 145, 52, 29, 112, 23, 57, 47, 118, 90 }), true);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 51, 99, 43, 44, 66, 5, 70, 33, 100, 98, 0, 71, 140, 255, 166, 170, 222, 129, 203, 114, 178, 212, 192, 145, 52, 24, 112, 23, 58, 47, 118, 66 }), 0.0, 8.0, 8.0, 1.0);
        this.buffT = new com.target.mod.compat.sub1.sub2.sub7.Initializer_1();
        this.intValue = -1;
        this.coState = co$State.IDLE;
        this.setSyncaarr(this.buildC, this.buildC_1, this.buildC_2, this.parseB, this.buildC_3);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.execute_2();
        super.execute_1();
    }
    
    private void execute_2() {
        if (this.boolFlag && ClientModInitializerImpl.sortB != null) {
            final DataNImpl_20 dataNImpl_20 = ClientModInitializerImpl.sortB.getEventd().computeLoadf(DataNImpl_20.class);
            if (dataNImpl_20 != null) {
                dataNImpl_20.setBool(true);
            }
        }
        if (this.intValue != -1 && DataNImpl_21.class310.field_1724 != null) {
            Initializer_8.setClass_1661AndInt(DataNImpl_21.class310.field_1724.method_31548(), this.intValue);
        }
        this.coState = co$State.IDLE;
        this.intValue = -1;
        this.boolFlag = false;
    }
    
    public void execute_3() {
        if (DataNImpl_21.class310.field_1724 == null || DataNImpl_21.class310.field_1687 == null) {
            this.execute_2();
            return;
        }
        switch (this.coState.ordinal()) {
            case 0: {
                if (DataNImpl_21.class310.field_1724.method_6032() <= this.buildC.getFloat()) {
                    this.execute_4();
                    break;
                }
                break;
            }
            case 1: {
                DataNImpl_21.class310.execute(this::lambda$onTick$0);
                if (Math.abs(DataNImpl_21.class310.field_1724.method_36455() - 90.0f) < 1.0f) {
                    this.coState = co$State.THROWING;
                    this.buffT.execute();
                    break;
                }
                break;
            }
            case 2: {
                if (this.intValue_1 > 0 && this.buffT.checkFloat((float)this.buildC_2.getInt())) {
                    DataNImpl_21.class310.execute(DataNImpl_21::lambda$onTick$1);
                    --this.intValue_1;
                    this.buffT.execute();
                }
                if (this.intValue_1 <= 0) {
                    this.coState = co$State.ROTATING_BACK;
                    break;
                }
                break;
            }
            case 3: {
                DataNImpl_21.class310.execute(this::lambda$onTick$2);
                if (Math.abs(DataNImpl_21.class310.field_1724.method_36454() - this.floatValue) < 1.0f && Math.abs(DataNImpl_21.class310.field_1724.method_36455() - this.floatValue_1) < 1.0f) {
                    this.execute_2();
                    break;
                }
                break;
            }
            case 4: {
                final int int_1 = this.getInt_1();
                if (int_1 != -1) {
                    DataNImpl_21.class310.execute(DataNImpl_21::lambda$onTick$3);
                }
                this.coState = co$State.IDLE;
                break;
            }
        }
    }
    
    private void execute_4() {
        final int int1 = this.getInt();
        if (int1 == -1) {
            if (this.parseB.getBoolean()) {
                this.coState = co$State.REFILLING;
            }
            return;
        }
        if (ClientModInitializerImpl.sortB != null) {
            final DataNImpl_20 dataNImpl_20 = ClientModInitializerImpl.sortB.getEventd().computeLoadf(DataNImpl_20.class);
            if (dataNImpl_20 != null && dataNImpl_20.isEnabled()) {
                this.boolFlag = true;
                dataNImpl_20.setBool(false);
            }
        }
        this.intValue = Initializer_8.method_int(DataNImpl_21.class310.field_1724.method_31548());
        this.floatValue = DataNImpl_21.class310.field_1724.method_36454();
        this.floatValue_1 = DataNImpl_21.class310.field_1724.method_36455();
        this.intValue_1 = this.buildC_1.getInt();
        Initializer_8.setClass_1661AndInt(DataNImpl_21.class310.field_1724.method_31548(), int1);
        this.coState = co$State.ROTATING_DOWN;
    }
    
    private int getInt() {
        for (int i = 0; i < 9; ++i) {
            if (this.checkClass_1799(DataNImpl_21.class310.field_1724.method_31548().method_5438(i))) {
                return i;
            }
        }
        return -1;
    }
    
    private int getInt_1() {
        for (int i = 9; i < 36; ++i) {
            if (this.checkClass_1799(DataNImpl_21.class310.field_1724.method_31548().method_5438(i))) {
                return i;
            }
        }
        return -1;
    }
    
    private boolean checkClass_1799(final class_1799 class_1799) {
        if (class_1799.method_7909() != class_1802.field_8436) {
            return false;
        }
        final class_1844 class_1800 = (class_1844)class_1799.method_58694(class_9334.field_49651);
        if (class_1800 != null) {
            final String string = class_1800.method_57397().toString();
            return string.contains("instant_health") || string.contains("INSTANT_HEALTH") || string.contains("healing");
        }
        return false;
    }
    
    private static void lambda$onTick$3(final int n, final int n2) {
        if (DataNImpl_21.class310.field_1724 == null || DataNImpl_21.class310.field_1761 == null) {
            return;
        }
        DataNImpl_21.class310.field_1761.method_2906(DataNImpl_21.class310.field_1724.field_7498.field_7763, n, 0, class_1713.field_7790, (class_1657)DataNImpl_21.class310.field_1724);
        DataNImpl_21.class310.field_1761.method_2906(DataNImpl_21.class310.field_1724.field_7498.field_7763, n2 + 36, 0, class_1713.field_7790, (class_1657)DataNImpl_21.class310.field_1724);
    }
    
    private void lambda$onTick$2() {
        if (DataNImpl_21.class310.field_1724 == null) {
            return;
        }
        DataNImpl_21.class310.field_1724.method_36456(class_3532.method_16439(0.5f, DataNImpl_21.class310.field_1724.method_36454(), this.floatValue));
        DataNImpl_21.class310.field_1724.method_36457(class_3532.method_16439(0.5f, DataNImpl_21.class310.field_1724.method_36455(), this.floatValue_1));
    }
    
    private static void lambda$onTick$1() {
        if (DataNImpl_21.class310.field_1724 != null && DataNImpl_21.class310.field_1761 != null) {
            DataNImpl_21.class310.field_1761.method_2919((class_1657)DataNImpl_21.class310.field_1724, class_1268.field_5808);
        }
    }
    
    private void lambda$onTick$0() {
        if (DataNImpl_21.class310.field_1724 == null) {
            return;
        }
        DataNImpl_21.class310.field_1724.method_36456(class_3532.method_16439(0.5f, DataNImpl_21.class310.field_1724.method_36454(), this.floatValue));
        DataNImpl_21.class310.field_1724.method_36457(class_3532.method_16439(0.5f, DataNImpl_21.class310.field_1724.method_36455(), 90.0f));
    }
}
