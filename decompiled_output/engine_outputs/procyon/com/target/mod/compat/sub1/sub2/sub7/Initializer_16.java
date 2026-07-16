// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub7;

import java.awt.Color;

public class Initializer_16
{
    public static final Color color;
    public static int intValue;
    public static int intValue_1;
    public static int intValue_2;
    public static int intValue_3;
    public static int intValue_4;
    public static int intValue_5;
    public static boolean boolFlag;
    public static boolean boolFlag_1;
    public static int intValue_6;
    public static Initializer_5 configA;
    public static boolean boolFlag_2;
    public static boolean boolFlag_3;
    public static float floatValue;
    public static boolean boolFlag_4;
    
    public static boolean checkConfiga(final Initializer_5 initializer_5) {
        return Initializer_16.configA == initializer_5;
    }
    
    public static boolean isEnabled() {
        return Initializer_21.isEnabled_3();
    }
    
    static {
        color = new Color(88, 166, 255);
        Initializer_16.intValue = 88;
        Initializer_16.intValue_1 = 166;
        Initializer_16.intValue_2 = 255;
        Initializer_16.intValue_3 = 20;
        Initializer_16.intValue_4 = 25;
        Initializer_16.intValue_5 = 40;
        Initializer_16.boolFlag = false;
        Initializer_16.boolFlag_1 = true;
        Initializer_16.intValue_6 = 220;
        Initializer_16.configA = Initializer_5.POSITIVE;
        Initializer_16.boolFlag_2 = true;
        Initializer_16.boolFlag_3 = false;
        Initializer_16.floatValue = 1.0f;
        Initializer_16.boolFlag_4 = false;
    }
}
