// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub4;

import org.lwjgl.glfw.GLFW;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import net.minecraft.class_310;

public class Initializer_5
{
    private final class_310 class310;
    private RenderASub_6 eventQ;
    private String strValue;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    
    public Initializer_5() {
        this.class310 = class_310.method_1551();
        this.eventQ = null;
        this.strValue = "";
        this.intValue = 0;
        this.intValue_1 = -1;
        this.intValue_2 = -1;
    }
    
    public void setEventq(final RenderASub_6 eventQ) {
        this.eventQ = eventQ;
        this.strValue = eventQ.getValue();
        this.intValue = this.strValue.length();
        this.intValue_1 = -1;
        this.intValue_2 = -1;
    }
    
    public void execute() {
        if (this.eventQ != null) {
            this.eventQ.setObject(this.strValue);
            this.eventQ = null;
            this.strValue = "";
            this.intValue = 0;
            this.intValue_1 = -1;
            this.intValue_2 = -1;
        }
    }
    
    public void execute_1() {
        this.eventQ = null;
        this.strValue = "";
        this.intValue = 0;
        this.intValue_1 = -1;
        this.intValue_2 = -1;
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
    
    private void setString(final String s) {
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
        if (this.eventQ == null) {
            return false;
        }
        final int n4 = n3 & 0x2;
        if (intarrArray == null && n4 == 0) {}
        final boolean b = n4 != 0;
        final int n5 = n3 & 0x1;
        if (intarrArray == null && n5 == 0) {}
        final int n6 = n5;
        boolean glfwGetKey;
        boolean b2;
        int n10;
        int n9;
        int n8;
        final int n7 = n8 = (n9 = (n10 = ((b2 = (glfwGetKey = b)) ? 1 : 0)));
        Label_0102: {
            if (intarrArray == null) {
                if (n7 != 0) {
                    glfwGetKey = (n != 0);
                    n10 = n;
                    n9 = n;
                    n8 = n;
                    if (intarrArray != null) {
                        break Label_0102;
                    }
                    if (n == 65) {
                        this.intValue_1 = 0;
                        this.intValue_2 = this.strValue.length();
                        this.intValue = this.strValue.length();
                        return true;
                    }
                }
                n9 = (n8 = (n10 = ((b2 = (glfwGetKey = b)) ? 1 : 0)));
            }
        }
        Label_0155: {
            if (intarrArray == null) {
                if (n8 != 0) {
                    glfwGetKey = (n != 0);
                    n10 = n;
                    n9 = n;
                    if (intarrArray != null) {
                        break Label_0155;
                    }
                    if (n == 67) {
                        final boolean enabled = this.isEnabled();
                        if (intarrArray == null && enabled) {
                            this.class310.field_1774.method_1455(this.getString());
                            goto Label_0151;
                        }
                        return enabled;
                    }
                }
                n10 = (n9 = ((b2 = (glfwGetKey = b)) ? 1 : 0));
            }
        }
        int n12 = 0;
        Label_0271: {
            int n11 = 0;
            Label_0218: {
                if (intarrArray == null) {
                    if (n9 != 0) {
                        n10 = n;
                        n11 = 88;
                        if (intarrArray != null) {
                            break Label_0218;
                        }
                        if (n == n11) {
                            final boolean enabled2 = this.isEnabled();
                            if (intarrArray == null && enabled2) {
                                this.class310.field_1774.method_1455(this.getString());
                                this.execute_2();
                                goto Label_0208;
                            }
                            return enabled2;
                        }
                    }
                    glfwGetKey = (n != 0);
                    n10 = n;
                }
                if (intarrArray != null) {
                    break Label_0271;
                }
            }
            if (n10 == n11) {
                n12 = ((glfwGetKey = (GLFW.glfwGetKey(class_310.method_1551().method_22683().method_4490(), 341) != 0)) ? 1 : 0);
                if (intarrArray != null) {
                    break Label_0271;
                }
                if (n12 == 1) {
                    final String method_1460 = this.class310.field_1774.method_1460();
                    if (method_1460 != null) {
                        this.setString(method_1460);
                    }
                    return true;
                }
            }
            glfwGetKey = (n != 0);
        }
        if (intarrArray == null) {
            switch (n12) {
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
                    final int n13 = enabled3 = (this.isEnabled() ? 1 : 0);
                    if (intarrArray == null) {
                        if (n13 != 0) {
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
                    if (n13 > 0) {
                        this.strValue = this.strValue.substring(0, this.intValue - 1) + this.strValue.substring(this.intValue);
                        --this.intValue;
                    }
                    enabled3 = 1;
                    return enabled3 != 0;
                }
                case 261: {
                    int enabled4;
                    final int n14 = enabled4 = (this.isEnabled() ? 1 : 0);
                    if (intarrArray == null) {
                        if (n14 != 0) {
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
                    if (n14 < this.strValue.length()) {
                        this.strValue = this.strValue.substring(0, this.intValue) + this.strValue.substring(this.intValue + 1);
                    }
                    enabled4 = 1;
                    return enabled4 != 0;
                }
                case 263: {
                    this.setIntAndBool(-1, (boolean)(n6 != 0));
                    return true;
                }
                case 262: {
                    this.setIntAndBool(1, (boolean)(n6 != 0));
                    return true;
                }
                case 268: {
                    final int n15 = n6;
                    Label_0584: {
                        Label_0574: {
                            Initializer_5 initializer_5 = null;
                            Label_0565: {
                                if (intarrArray == null) {
                                    if (n15 == 0) {
                                        break Label_0574;
                                    }
                                    initializer_5 = this;
                                    if (intarrArray != null) {
                                        break Label_0565;
                                    }
                                    final int intValue_1 = this.intValue_1;
                                }
                                if (n15 == -1) {
                                    this.intValue_1 = this.intValue;
                                }
                                initializer_5 = this;
                            }
                            initializer_5.intValue_2 = 0;
                            if (intarrArray == null) {
                                break Label_0584;
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
                    final int n16 = intValue_2 = n6;
                    Label_0648: {
                        Label_0638: {
                            Initializer_5 initializer_6 = null;
                            Label_0623: {
                                if (intarrArray == null) {
                                    if (n16 == 0) {
                                        break Label_0638;
                                    }
                                    initializer_6 = this;
                                    if (intarrArray != null) {
                                        break Label_0623;
                                    }
                                    intValue_2 = this.intValue_1;
                                }
                                if (intValue_2 == -1) {
                                    this.intValue_1 = this.intValue;
                                }
                                initializer_6 = this;
                            }
                            initializer_6.intValue_2 = this.strValue.length();
                            if (intarrArray == null) {
                                break Label_0648;
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
        if (this.eventQ == null) {
            return false;
        }
        if (c >= ' ' && c != '\u007f') {
            this.setString(String.valueOf(c));
            return true;
        }
        return false;
    }
    
    public boolean isEnabled_1() {
        return this.eventQ != null;
    }
    
    public boolean checkEventq(final RenderASub_6 renderASub_6) {
        return this.eventQ == renderASub_6;
    }
    
    public String getString_1() {
        return this.strValue;
    }
    
    public RenderASub_6 getEventq() {
        return this.eventQ;
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
