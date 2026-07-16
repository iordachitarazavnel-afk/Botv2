// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

enum co$State
{
    IDLE, 
    ROTATING_DOWN, 
    THROWING, 
    ROTATING_BACK, 
    REFILLING;
    
    private static final co$State[] co$StateArray;
    
    private static co$State[] getCo$statearrArray() {
        return new co$State[] { co$State.IDLE, co$State.ROTATING_DOWN, co$State.THROWING, co$State.ROTATING_BACK, co$State.REFILLING };
    }
    
    static {
        co$StateArray = getCo$statearrArray();
    }
}
