// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5;

import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import java.util.List;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public abstract class AbstractLoadF extends Initializer_3
{
    public static class_310 class310;
    protected String strValue;
    protected Initializer stepF;
    protected List<AbstractSyncA<?>> list;
    private static int intValue;
    
    public AbstractLoadF(final String s, final String strValue, final Initializer stepF) {
        super(s, s, strValue, computeCachee(stepF));
        this.list = new ArrayList<AbstractSyncA<?>>();
        this.strValue = strValue;
        this.stepF = stepF;
    }
    
    private static com.target.mod.compat.sub1.sub2.sub2.Initializer computeCachee(final Initializer initializer) {
        switch (initializer.ordinal()) {
            case 0: {
                return com.target.mod.compat.sub1.sub2.sub2.Initializer.cacheE;
            }
            case 1: {
                return com.target.mod.compat.sub1.sub2.sub2.Initializer.RENDER;
            }
            case 2: {
                return com.target.mod.compat.sub1.sub2.sub2.Initializer.MISC;
            }
            case 4: {
                return com.target.mod.compat.sub1.sub2.sub2.Initializer.MISC;
            }
            case 3: {
                return com.target.mod.compat.sub1.sub2.sub2.Initializer.cacheE_3;
            }
            case 5: {
                return com.target.mod.compat.sub1.sub2.sub2.Initializer.CART;
            }
            default: {
                return com.target.mod.compat.sub1.sub2.sub2.Initializer.MISC;
            }
        }
    }
    
    @Override
    public void execute() {
    }
    
    @Override
    public void execute_1() {
    }
    
    @Override
    public void execute_2() {
    }
    
    @Override
    public String getString() {
        return super.getString_1();
    }
    
    @Override
    public String getString_1() {
        return super.getString_2();
    }
    
    public Initializer getStepf() {
        return this.stepF;
    }
    
    @Override
    public List<AbstractSyncA<?>> getList() {
        return this.list;
    }
    
    public void setRenderaarr(final AbstractSyncA<?>... elements) {
        final int int1 = getInt();
        Collections.addAll(this.list, elements);
        final int n = int1;
        final int length = elements.length;
        int i = 0;
        while (i < length) {
            final AbstractSyncA<?> abstractSyncA = elements[i];
            boolean b5;
            boolean b4;
            boolean b3;
            boolean b2;
            final boolean b = b2 = (b3 = (b4 = (b5 = (abstractSyncA instanceof RenderASub_1))));
            Label_0337: {
                if (n != 0) {
                    if (b) {
                        final RenderASub_1 renderASub_1 = (RenderASub_1)abstractSyncA;
                        super.setSyncaarr(new ParseBSub(this, renderASub_1.getString(), renderASub_1.getValue(), renderASub_1));
                        if (n != 0) {
                            break Label_0337;
                        }
                        int int_1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1();
                        com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int_1);
                    }
                    b3 = (b2 = (b4 = (b5 = (abstractSyncA instanceof RenderASub))));
                }
                if (n != 0) {
                    if (b2) {
                        final RenderASub renderASub = (RenderASub)abstractSyncA;
                        super.setSyncaarr(new BuildCSub(this, renderASub.getString(), renderASub.getDouble(), renderASub.getDouble_1(), renderASub.getValue(), renderASub.getDouble_2(), renderASub));
                        if (n != 0) {
                            break Label_0337;
                        }
                    }
                    b4 = (b3 = (b5 = (abstractSyncA instanceof RenderASub_15)));
                }
                if (n != 0) {
                    if (b3) {
                        final RenderASub_15 renderASub_2 = (RenderASub_15)abstractSyncA;
                        if (n != 0) {
                            break Label_0337;
                        }
                    }
                    b5 = (b4 = (abstractSyncA instanceof RenderASub_6));
                }
                RenderASub_6 renderASub_4 = null;
                Label_0290: {
                    if (n != 0) {
                        if (b4) {
                            final RenderASub_6 renderASub_3 = (RenderASub_6)abstractSyncA;
                            super.setSyncaarr(new ItemGSub(this, renderASub_3.getString(), renderASub_3.getValue(), renderASub_3));
                            if (n != 0) {
                                break Label_0337;
                            }
                        }
                        renderASub_4 = (RenderASub_6)abstractSyncA;
                        if (n == 0) {
                            break Label_0290;
                        }
                        b5 = (renderASub_4 instanceof RenderASub_7);
                    }
                    if (!b5) {
                        break Label_0337;
                    }
                }
                final RenderASub_7 renderASub_5 = (RenderASub_7)renderASub_4;
                super.setSyncaarr(new InitDSub(this, renderASub_5.getString(), renderASub_5.getValue(), false, renderASub_5));
            }
            ++i;
            if (n == 0) {
                break;
            }
        }
    }
    
    static {
        final int int1 = 33;
        AbstractLoadF.class310 = Initializer_1.class310;
        setInt(int1);
    }
    
    public static void setInt(final int intValue) {
        AbstractLoadF.intValue = intValue;
    }
    
    public static int getInt() {
        return AbstractLoadF.intValue;
    }
    
    public static int getInt_1() {
        if (getInt() == 0) {
            return 99;
        }
        return 0;
    }
}
