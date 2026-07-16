// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

enum cn$MacroState
{
    IDLE, 
    PLACE_OBI, 
    WAIT_OBI, 
    PLACE_CRYSTAL, 
    BREAK_CRYSTAL;
    
    private static final cn$MacroState[] cn$MacroStateArray;
    
    private static cn$MacroState[] getCn$macrostatearrArray() {
        return new cn$MacroState[] { cn$MacroState.IDLE, cn$MacroState.PLACE_OBI, cn$MacroState.WAIT_OBI, cn$MacroState.PLACE_CRYSTAL, cn$MacroState.BREAK_CRYSTAL };
    }
    
    static {
        cn$MacroStateArray = getCn$macrostatearrArray();
    }
}
