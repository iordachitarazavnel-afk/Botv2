// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2.sub1;

import java.util.Arrays;
import java.util.List;

public class SyncASub_2 extends Initializer
{
    private String strValue;
    private final List<String> list;
    
    public SyncASub_2(final String s, final String strValue, final String... a) {
        super(s);
        this.list = Arrays.asList(a);
        this.strValue = strValue;
    }
    
    @Override
    public String getString() {
        return this.strValue;
    }
    
    @Override
    public void setObject(final Object o) {
        if (o instanceof final String s) {
            this.strValue = s;
        }
    }
    
    public List<String> getList() {
        return this.list;
    }
    
    public void execute() {
        final int n = (this.list.indexOf(this.strValue) + 1) % this.list.size();
        final String string = SyncASub_1.getString();
        this.strValue = this.list.get(n);
        if (string != null) {
            int int_1 = Initializer.getInt_1();
            Initializer.setInt(++int_1);
        }
    }
    
    public boolean checkString(final String anObject) {
        return this.strValue.equals(anObject);
    }
}
