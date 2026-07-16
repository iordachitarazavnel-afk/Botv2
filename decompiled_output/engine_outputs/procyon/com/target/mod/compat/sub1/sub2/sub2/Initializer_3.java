// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2;

import com.target.mod.compat.sub1.sub2.sub7.Initializer_21;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import java.util.List;
import com.target.mod.compat.sub1.sub2.sub1.sub1.Initializer;
import net.minecraft.class_310;

public abstract class Initializer_3
{
    protected static final class_310 class310;
    protected final Initializer renderA;
    private final String strValue;
    private final String strValue_1;
    private final String strValue_2;
    private final com.target.mod.compat.sub1.sub2.sub2.Initializer cacheE;
    protected boolean boolFlag;
    private int intValue;
    protected final List<com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer> list;
    private final SyncASub_3 initD;
    private static int intValue_1;
    
    public Initializer_3(final String strValue, final String strValue_1, final String strValue_2, final com.target.mod.compat.sub1.sub2.sub2.Initializer cacheE) {
        this.boolFlag = false;
        final int int_2 = getInt_2();
        this.intValue = -1;
        this.list = new ArrayList<com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer>();
        this.strValue = strValue;
        int n = int_2;
        this.strValue_1 = strValue_1;
        this.strValue_2 = strValue_2;
        this.cacheE = cacheE;
        this.renderA = ClientModInitializerImpl.sortB.getRendera();
        this.initD = new SyncASub_3(Initializer_14.computeString(new int[] { 132, 202, 42, 99, 43, 44, 66, 5, 70, 33, 100, 125, 0, 71, 135, 255, 166, 175, 222, 129, 201, 189, 224, 236 }), -1, true);
        this.list.add(this.initD);
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
            setInt_1(++n);
        }
    }
    
    public void execute() {
    }
    
    public void execute_1() {
    }
    
    public void execute_2() {
        if (!Initializer_21.isEnabled()) {
            return;
        }
        this.setBool(!this.boolFlag);
    }
    
    public void setBool(final boolean boolFlag) {
        final int int_1 = getInt_1();
        boolean boolFlag2;
        final boolean b = boolFlag2 = this.boolFlag;
        Initializer_3 initializer_3 = null;
        Label_0038: {
            if (int_1 != 0) {
                if (b == boolFlag) {
                    return;
                }
                initializer_3 = this;
                if (int_1 == 0) {
                    break Label_0038;
                }
                this.boolFlag = boolFlag;
                boolFlag2 = boolFlag;
            }
            if (boolFlag2) {
                this.execute();
                if (int_1 != 0) {
                    return;
                }
            }
            initializer_3 = this;
        }
        initializer_3.execute_1();
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public String getString() {
        return this.strValue;
    }
    
    public String getString_1() {
        return this.strValue_1;
    }
    
    public String getString_2() {
        return this.strValue_2;
    }
    
    public com.target.mod.compat.sub1.sub2.sub2.Initializer getCachee() {
        return this.cacheE;
    }
    
    public int getInt() {
        return this.initD.getInt();
    }
    
    public void setInt(final int int1) {
        this.initD.setInt(int1);
    }
    
    public List<com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer> getList() {
        return this.list;
    }
    
    public void setSyncaarr(final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer... array) {
        final int int_2 = getInt_2();
        final int length = array.length;
        final int n = int_2;
        int i = 0;
        while (i < length) {
            this.list.add(array[i]);
            ++i;
            if (n != 0) {
                break;
            }
        }
    }
    
    public SyncASub_3 getInitd() {
        return this.initD;
    }
    
    static {
        final int int_1 = 80;
        class310 = class_310.method_1551();
        setInt_1(int_1);
    }
    
    public static void setInt_1(final int intValue_1) {
        Initializer_3.intValue_1 = intValue_1;
    }
    
    public static int getInt_1() {
        return Initializer_3.intValue_1;
    }
    
    public static int getInt_2() {
        if (getInt_1() == 0) {
            return 77;
        }
        return 0;
    }
}
