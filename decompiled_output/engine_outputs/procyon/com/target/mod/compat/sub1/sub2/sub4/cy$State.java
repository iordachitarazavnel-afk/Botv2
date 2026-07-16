// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

enum cy$State
{
    IDLE, 
    AXE_SWAPPED, 
    MACE_SWAPPED;
    
    private static final cy$State[] cy$StateArray;
    
    private static cy$State[] getCy$statearrArray() {
        return new cy$State[] { cy$State.IDLE, cy$State.AXE_SWAPPED, cy$State.MACE_SWAPPED };
    }
    
    static {
        cy$StateArray = getCy$statearrArray();
    }
}
