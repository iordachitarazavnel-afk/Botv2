// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class RenderASub_5 extends AbstractSyncA<List<String>>
{
    public RenderASub_5(final String s) {
        super(s, new ArrayList());
    }
    
    public RenderASub_5(final String s, final List<String> c) {
        super(s, new ArrayList(c));
    }
    
    public List<String> getList() {
        return this.getValue();
    }
    
    public boolean isEnabled() {
        return ((AbstractSyncA<List>)this).getValue().isEmpty();
    }
    
    public void setString(final String s) {
        if (s != null && !s.trim().isEmpty() && !((AbstractSyncA<List>)this).getValue().contains(s)) {
            this.getValue().add(s);
        }
    }
    
    public void setString_1(final String s) {
        ((AbstractSyncA<List>)this).getValue().remove(s);
    }
    
    public void setInt(final int n) {
        if (n >= 0 && n < ((AbstractSyncA<List>)this).getValue().size()) {
            ((AbstractSyncA<List>)this).getValue().remove(n);
        }
    }
    
    @Override
    public void execute() {
        ((AbstractSyncA<List>)this).getValue().clear();
    }
    
    public boolean checkString(final String s) {
        return ((AbstractSyncA<List>)this).getValue().contains(s);
    }
    
    public int getInt() {
        return ((AbstractSyncA<List>)this).getValue().size();
    }
    
    public String computeString(final int n) {
        if (n >= 0 && n < ((AbstractSyncA<List>)this).getValue().size()) {
            return this.getValue().get(n);
        }
        return null;
    }
    
    public void setIntAndString(final int n, final String s) {
        final boolean enabled = AbstractSyncA.isEnabled();
        int n2 = n;
        if (enabled) {
            if (n < 0) {
                return;
            }
            n2 = n;
        }
        if (n2 < ((AbstractSyncA<List>)this).getValue().size()) {
            String trim = s;
            if (enabled) {
                if (s == null) {
                    return;
                }
                trim = s.trim();
            }
            if (enabled) {
                if (!trim.isEmpty()) {
                    this.getValue().set(n, s);
                }
            }
        }
    }
}
