// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_12;
import java.awt.Color;
import net.minecraft.class_332;

public class Initializer_9
{
    public static void processAll(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        Initializer_12.processAll_1(class_332, new Color(0, 0, 0, 100), n, n2, n + n3, n2 + n4, 8.0, 16);
        if (intarrArray != null) {
            int int_1 = Initializer.getInt_1();
            Initializer.setInt(++int_1);
        }
    }
    
    public static void setInt(final int n) {
    }
}
