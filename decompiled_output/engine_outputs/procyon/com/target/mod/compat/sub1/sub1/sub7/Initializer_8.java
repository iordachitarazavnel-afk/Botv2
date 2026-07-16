// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import org.lwjgl.glfw.GLFW;
import com.target.mod.compat.sub1.sub1.sub1.Initializer;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;

public final class Initializer_8
{
    public static boolean checkInt(final int n) {
        final int int_1 = Initializer_21.getInt_1();
        if (Initializer_1.class310.method_22683() == null) {
            return false;
        }
        int n4;
        final int n3;
        final int n2 = n3 = (n4 = (Initializer.checkInt(n) ? 1 : 0));
        int n5 = 0;
        Label_0067: {
            if (int_1 != 0) {
                if (n2 != 0) {
                    final int method_int_1 = Initializer.method_int_1(n);
                    n5 = (n4 = method_int_1);
                    if (int_1 == 0) {
                        break Label_0067;
                    }
                    if (n5 >= 0) {
                        final int glfwGetMouseButton = GLFW.glfwGetMouseButton(Initializer_1.class310.method_22683().method_4490(), method_int_1);
                        if (int_1 != 0 && glfwGetMouseButton != 1) {}
                        return glfwGetMouseButton != 0;
                    }
                }
                n4 = n;
            }
        }
        final int n6 = 8;
        if (int_1 != 0) {
            if (n5 <= n6) {
                final int glfwGetMouseButton2 = GLFW.glfwGetMouseButton(Initializer_1.class310.method_22683().method_4490(), n);
                if (int_1 != 0 && glfwGetMouseButton2 != 1) {}
                return glfwGetMouseButton2 != 0;
            }
            final int n7 = n4 = GLFW.glfwGetKey(Initializer_1.class310.method_22683().method_4490(), n);
            if (int_1 == 0) {
                return n7 != 0;
            }
        }
        int n7;
        if (n4 == n6) {
            n7 = (true ? 1 : 0);
        }
        else {
            n7 = (false ? 1 : 0);
        }
        return n7 != 0;
    }
}
