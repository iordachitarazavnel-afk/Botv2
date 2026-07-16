// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2.sub1;

import java.util.function.Consumer;
import java.util.ArrayList;
import net.minecraft.class_4587;
import com.target.mod.compat.sub1.sub1.sub2.Initializer;

public class BuildBSub extends Initializer<BlockEImpl_1>
{
    public class_4587 class4587;
    public float floatValue;
    private static String strValue;
    
    public BuildBSub(final class_4587 class4587, final float floatValue) {
        getString();
        this.class4587 = class4587;
        this.floatValue = floatValue;
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
            setString("a4fqn");
        }
    }
    
    @Override
    public void setArraylist(final ArrayList<BlockEImpl_1> list) {
        list.forEach(this::lambda$fire$0);
    }
    
    @Override
    public Class<BlockEImpl_1> getClass() {
        return BlockEImpl_1.class;
    }
    
    private void lambda$fire$0(final BlockEImpl_1 blockEImpl_1) {
        blockEImpl_1.setCorej(this);
    }
    
    public static void setString(final String strValue) {
        BuildBSub.strValue = strValue;
    }
    
    public static String getString() {
        return BuildBSub.strValue;
    }
    
    static {
        if (getString() == null) {
            setString("SQg2u");
        }
    }
}
