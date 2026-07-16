// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub1;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;
import java.util.List;
import com.target.mod.compat.sub1.sub2.sub3.Initializer_2;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_11;
import net.minecraft.class_437;
import net.minecraft.class_310;

public final class Initializer
{
    public static final Initializer utilC;
    public static final class_310 class310;
    private ClientModInitializerImpl sortB;
    private class_437 class437;
    public Initializer_11 linkV;
    
    private Initializer() {
    }
    
    public void execute() {
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncaarrArray = ClientModInitializerImpl.getSyncaarrArray();
        final ClientModInitializerImpl sortB = this.sortB;
        Label_0044: {
            Initializer initializer = null;
            Label_0034: {
                if (syncaarrArray != null) {
                    if (sortB == null) {
                        this.sortB = ClientModInitializerImpl.sortB;
                    }
                    initializer = this;
                    if (syncaarrArray == null) {
                        break Label_0034;
                    }
                    final ClientModInitializerImpl sortB2 = this.sortB;
                }
                if (sortB == null) {
                    break Label_0044;
                }
                initializer = this;
            }
            initializer.linkV = this.sortB.getLinkv();
        }
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1() != 0) {
            ClientModInitializerImpl.setSyncaarr(new com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[3]);
        }
    }
    
    public Initializer_11 getLinkv() {
        if (this.linkV == null) {
            this.execute();
        }
        return this.linkV;
    }
    
    public Initializer_2 getWrapb() {
        if (this.sortB == null) {
            this.sortB = ClientModInitializerImpl.sortB;
        }
        return (this.sortB != null) ? this.sortB.getWrapb() : null;
    }
    
    public com.target.mod.compat.sub1.sub2.sub2.Initializer_2 getEventd() {
        if (this.sortB == null) {
            this.sortB = ClientModInitializerImpl.sortB;
        }
        return (this.sortB != null) ? this.sortB.getEventd() : null;
    }
    
    public class_437 getClass_437() {
        return this.class437;
    }
    
    public void setClass_437(final class_437 class437) {
        this.class437 = class437;
    }
    
    public Object getValue() {
        return null;
    }
    
    public List<Initializer_3> computeList(final com.target.mod.compat.sub1.sub2.sub2.Initializer initializer) {
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncaarrArray = ClientModInitializerImpl.getSyncaarrArray();
        final com.target.mod.compat.sub1.sub2.sub2.Initializer_2 eventd = this.getEventd();
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] array = syncaarrArray;
        Object collect;
        final com.target.mod.compat.sub1.sub2.sub2.Initializer_2 initializer_2 = (com.target.mod.compat.sub1.sub2.sub2.Initializer_2)(collect = eventd);
        if (array != null) {
            if (initializer_2 == null) {
                return new ArrayList<Initializer_3>();
            }
            collect = eventd.getList().stream().filter(Initializer::lambda$a$0).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        }
        final List<Initializer_3> list = (List<Initializer_3>)collect;
        if (array == null) {
            int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
        }
        return list;
    }
    
    public class_437 getClass_437_1() {
        return this.getClass_437();
    }
    
    private static boolean lambda$a$0(final com.target.mod.compat.sub1.sub2.sub2.Initializer initializer, final Initializer_3 initializer_3) {
        return initializer_3.getCachee() == initializer;
    }
    
    static {
        utilC = new Initializer();
        class310 = class_310.method_1551();
    }
}
