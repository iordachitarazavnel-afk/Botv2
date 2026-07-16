// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import java.util.List;

public class RenderASub_9 extends AbstractSyncA<String>
{
    private List<String> list;
    private boolean boolFlag;
    
    public RenderASub_9(final String s, final String s2, final List<String> list) {
        super(s, s2);
        this.boolFlag = false;
        this.list = list;
    }
    
    public List<String> getList() {
        return this.list;
    }
    
    public void setList(final List<String> list) {
        this.list = list;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public void setBool(final boolean boolFlag) {
        this.boolFlag = boolFlag;
    }
}
