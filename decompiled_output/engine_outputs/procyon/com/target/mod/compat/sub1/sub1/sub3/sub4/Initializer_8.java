// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import org.lwjgl.glfw.GLFW;
import net.minecraft.class_310;

public class Initializer_8
{
    private final class_310 class310;
    private String strValue;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    private boolean boolFlag;
    
    public Initializer_8() {
        this.class310 = class_310.method_1551();
        this.strValue = "";
        this.intValue = 0;
        this.intValue_1 = -1;
        this.intValue_2 = -1;
        this.boolFlag = false;
    }
    
    public void setString(final String s) {
        this.strValue = ((s != null) ? s : "");
        this.intValue = this.strValue.length();
        this.intValue_1 = -1;
        this.intValue_2 = -1;
        this.boolFlag = true;
    }
    
    public void execute() {
        this.boolFlag = false;
    }
    
    public void execute_1() {
        this.strValue = "";
        this.intValue = 0;
        this.intValue_1 = -1;
        this.intValue_2 = -1;
        this.boolFlag = false;
    }
    
    private boolean isEnabled() {
        return this.intValue_1 != -1 && this.intValue_2 != -1 && this.intValue_1 != this.intValue_2;
    }
    
    private int getInt() {
        if (!this.isEnabled()) {
            return this.intValue;
        }
        return Math.min(this.intValue_1, this.intValue_2);
    }
    
    private int getInt_1() {
        if (!this.isEnabled()) {
            return this.intValue;
        }
        return Math.max(this.intValue_1, this.intValue_2);
    }
    
    private String getString() {
        if (!this.isEnabled()) {
            return "";
        }
        return this.strValue.substring(this.getInt(), this.getInt_1());
    }
    
    private void execute_2() {
        if (!this.isEnabled()) {
            return;
        }
        final int int1 = this.getInt();
        this.strValue = this.strValue.substring(0, int1) + this.strValue.substring(this.getInt_1());
        this.intValue = int1;
        this.intValue_1 = -1;
        this.intValue_2 = -1;
    }
    
    private void setString_1(final String s) {
        if (this.isEnabled()) {
            this.execute_2();
        }
        this.strValue = this.strValue.substring(0, this.intValue) + s + this.strValue.substring(this.intValue);
        this.intValue += s.length();
    }
    
    private void setIntAndBool(final int n, final boolean b) {
        if (b) {
            if (this.intValue_1 == -1) {
                this.intValue_1 = this.intValue;
            }
            this.intValue_2 = this.intValue;
        }
        else {
            this.intValue_1 = -1;
            this.intValue_2 = -1;
        }
        this.intValue = Math.max(0, Math.min(this.strValue.length(), this.intValue + n));
        if (b) {
            this.intValue_2 = this.intValue;
        }
    }
    
    public boolean checkCondition(final int n, final int n2, final int n3) {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        int boolFlag;
        int n5;
        final int n4 = n5 = (boolFlag = (this.boolFlag ? 1 : 0));
        if (intarrArray == null) {
            if (n4 == 0) {
                return false;
            }
            boolFlag = (n5 = (n3 & 0x2));
        }
        if (intarrArray == null) {
            if (n5 != 0) {
                boolFlag = 1;
            }
            else {
                boolFlag = 0;
            }
        }
        final boolean b = boolFlag != 0;
        final int n6 = n3 & 0x1;
        if (intarrArray == null && n6 == 0) {}
        final int n7 = n6;
        boolean glfwGetKey;
        boolean b2;
        int n11;
        int n10;
        int n9;
        final int n8 = n9 = (n10 = (n11 = ((b2 = (glfwGetKey = b)) ? 1 : 0)));
        Label_0107: {
            if (intarrArray == null) {
                if (n8 != 0) {
                    glfwGetKey = (n != 0);
                    n11 = n;
                    n10 = n;
                    n9 = n;
                    if (intarrArray != null) {
                        break Label_0107;
                    }
                    if (n == 65) {
                        this.intValue_1 = 0;
                        this.intValue_2 = this.strValue.length();
                        this.intValue = this.strValue.length();
                        return true;
                    }
                }
                n10 = (n9 = (n11 = ((b2 = (glfwGetKey = b)) ? 1 : 0)));
            }
        }
        Label_0160: {
            if (intarrArray == null) {
                if (n9 != 0) {
                    glfwGetKey = (n != 0);
                    n11 = n;
                    n10 = n;
                    if (intarrArray != null) {
                        break Label_0160;
                    }
                    if (n == 67) {
                        final boolean enabled = this.isEnabled();
                        if (intarrArray == null && enabled) {
                            this.class310.field_1774.method_1455(this.getString());
                            goto Label_0156;
                        }
                        return enabled;
                    }
                }
                n11 = (n10 = ((b2 = (glfwGetKey = b)) ? 1 : 0));
            }
        }
        int n13 = 0;
        Label_0276: {
            int n12 = 0;
            Label_0223: {
                if (intarrArray == null) {
                    if (n10 != 0) {
                        n11 = n;
                        n12 = 88;
                        if (intarrArray != null) {
                            break Label_0223;
                        }
                        if (n == n12) {
                            final boolean enabled2 = this.isEnabled();
                            if (intarrArray == null && enabled2) {
                                this.class310.field_1774.method_1455(this.getString());
                                this.execute_2();
                                goto Label_0213;
                            }
                            return enabled2;
                        }
                    }
                    glfwGetKey = (n != 0);
                    n11 = n;
                }
                if (intarrArray != null) {
                    break Label_0276;
                }
            }
            if (n11 == n12) {
                n13 = ((glfwGetKey = (GLFW.glfwGetKey(class_310.method_1551().method_22683().method_4490(), 341) != 0)) ? 1 : 0);
                if (intarrArray != null) {
                    break Label_0276;
                }
                if (n13 == 1) {
                    final String method_1460 = this.class310.field_1774.method_1460();
                    if (method_1460 != null) {
                        this.setString_1(method_1460);
                    }
                    return true;
                }
            }
            glfwGetKey = (n != 0);
        }
        if (intarrArray == null) {
            switch (n13) {
                case 256: {
                    this.execute_1();
                    return true;
                }
                case 257: {
                    this.execute();
                    return true;
                }
                case 259: {
                    int enabled3;
                    final int n14 = enabled3 = (this.isEnabled() ? 1 : 0);
                    if (intarrArray == null) {
                        if (n14 != 0) {
                            this.execute_2();
                            if (intarrArray == null) {
                                return true;
                            }
                        }
                        final int intValue;
                        enabled3 = (intValue = this.intValue);
                    }
                    if (intarrArray != null) {
                        return enabled3 != 0;
                    }
                    if (n14 > 0) {
                        this.strValue = this.strValue.substring(0, this.intValue - 1) + this.strValue.substring(this.intValue);
                        --this.intValue;
                    }
                    enabled3 = (true ? 1 : 0);
                    return enabled3 != 0;
                }
                case 261: {
                    int enabled4;
                    final int n15 = enabled4 = (this.isEnabled() ? 1 : 0);
                    if (intarrArray == null) {
                        if (n15 != 0) {
                            this.execute_2();
                            if (intarrArray == null) {
                                return true;
                            }
                        }
                        final int intValue2;
                        enabled4 = (intValue2 = this.intValue);
                    }
                    if (intarrArray != null) {
                        return enabled4 != 0;
                    }
                    if (n15 < this.strValue.length()) {
                        this.strValue = this.strValue.substring(0, this.intValue) + this.strValue.substring(this.intValue + 1);
                    }
                    enabled4 = (true ? 1 : 0);
                    return enabled4 != 0;
                }
                case 263: {
                    this.setIntAndBool(-1, (boolean)(n7 != 0));
                    return true;
                }
                case 262: {
                    this.setIntAndBool(1, (boolean)(n7 != 0));
                    return true;
                }
                case 268: {
                    final int n16 = n7;
                    Label_0588: {
                        Label_0578: {
                            Initializer_8 initializer_8 = null;
                            Label_0569: {
                                if (intarrArray == null) {
                                    if (n16 == 0) {
                                        break Label_0578;
                                    }
                                    initializer_8 = this;
                                    if (intarrArray != null) {
                                        break Label_0569;
                                    }
                                    final int intValue_1 = this.intValue_1;
                                }
                                if (n16 == -1) {
                                    this.intValue_1 = this.intValue;
                                }
                                initializer_8 = this;
                            }
                            initializer_8.intValue_2 = 0;
                            if (intarrArray == null) {
                                break Label_0588;
                            }
                        }
                        this.intValue_1 = -1;
                        this.intValue_2 = -1;
                    }
                    this.intValue = 0;
                    return true;
                }
                case 269: {
                    int intValue_2;
                    final int n17 = intValue_2 = n7;
                    Label_0652: {
                        Label_0642: {
                            Initializer_8 initializer_9 = null;
                            Label_0627: {
                                if (intarrArray == null) {
                                    if (n17 == 0) {
                                        break Label_0642;
                                    }
                                    initializer_9 = this;
                                    if (intarrArray != null) {
                                        break Label_0627;
                                    }
                                    intValue_2 = this.intValue_1;
                                }
                                if (intValue_2 == -1) {
                                    this.intValue_1 = this.intValue;
                                }
                                initializer_9 = this;
                            }
                            initializer_9.intValue_2 = this.strValue.length();
                            if (intarrArray == null) {
                                break Label_0652;
                            }
                        }
                        this.intValue_1 = -1;
                        this.intValue_2 = -1;
                    }
                    this.intValue = this.strValue.length();
                    return true;
                }
                default: {
                    glfwGetKey = false;
                    break;
                }
            }
        }
        return glfwGetKey;
    }
    
    public boolean checkCondition_1(final char c, final int n) {
        if (!this.boolFlag) {
            return false;
        }
        if (c >= ' ' && c != '\u007f') {
            this.setString_1(String.valueOf(c));
            return true;
        }
        return false;
    }
    
    public String getString_1() {
        return this.strValue;
    }
    
    public void setString_2(final String s) {
        this.strValue = ((s != null) ? s : "");
        this.intValue = Math.min(this.intValue, this.strValue.length());
    }
    
    public boolean isEnabled_1() {
        return this.boolFlag;
    }
    
    public int getInt_2() {
        return this.intValue;
    }
    
    public int getInt_3() {
        return this.intValue_1;
    }
    
    public int getInt_4() {
        return this.intValue_2;
    }
    
    public boolean isEnabled_2() {
        return this.isEnabled();
    }
}
