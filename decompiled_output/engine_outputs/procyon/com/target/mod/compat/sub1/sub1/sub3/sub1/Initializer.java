// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub1;

import com.target.mod.compat.sub1.sub1.sub3.Initializer_1;
import net.minecraft.class_332;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_8;

public class Initializer
{
    private final Initializer_8 slotJ;
    private final class_310 class310;
    private int intValue;
    private static com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] SyncAArray;
    private static final String strValue;
    
    public Initializer() {
        this.slotJ = new Initializer_8();
        this.class310 = class_310.method_1551();
        this.intValue = 180;
    }
    
    public void processAll(final class_332 class_332, final int n, final int n2, final int n3, final float n4) {
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncaarrArray = getSyncaarrArray();
        final int n5 = 20;
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] array = syncaarrArray;
        final int enabled_1 = this.slotJ.isEnabled_1() ? 1 : 0;
        int n6 = 0;
        Label_0050: {
            if (array != null) {
                if (enabled_1 != 0) {
                    n6 = Initializer_1.method_int(Initializer_1.getInt_7(), n4 * 0.3f);
                    break Label_0050;
                }
                Initializer_1.getInt_5();
            }
            n6 = Initializer_1.method_int(enabled_1, n4 * Initializer_1.getFloat());
        }
        com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.processAll(class_332, n, n2, n3, n5, 5, n6);
        String s2;
        final String s = s2 = this.slotJ.getString_1();
        int enabled_2;
        final int n7 = enabled_2 = (this.slotJ.isEnabled_1() ? 1 : 0);
        Label_0170: {
            Label_0155: {
                if (array != null) {
                    if (n7 != 0) {
                        final int int_2 = this.slotJ.getInt_2();
                        s2 = s.substring(0, int_2) + "_" + s.substring(int_2);
                        if (array != null) {
                            break Label_0155;
                        }
                    }
                    final boolean empty;
                    enabled_2 = ((empty = s.isEmpty()) ? 1 : 0);
                }
                if (array == null) {
                    break Label_0170;
                }
                if (n7 != 0) {
                    s2 = Initializer.strValue;
                }
            }
            enabled_2 = (Initializer_1.method_int_1(Initializer_1.getInt_8(), (int)(n4 * 255.0f)) | 0xFF000000);
        }
        class_332.method_51433(this.class310.field_1772, s2, n + 5, n2 + 6, enabled_2, false);
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt() == 0) {
            setSyncaarr(new com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[2]);
        }
    }
    
    public void setInt(final int intValue) {
        this.intValue = intValue;
    }
    
    public boolean checkCondition(final double n, final double n2, final int n3, final int n4, final int n5) {
        if (n3 == 0 && com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n4, n5, this.intValue, 20)) {
            if (!this.slotJ.isEnabled_1()) {
                this.slotJ.setString(this.slotJ.getString_1());
            }
            return true;
        }
        if (this.slotJ.isEnabled_1() && !com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n4, n5, this.intValue, 20)) {
            this.slotJ.execute();
        }
        return false;
    }
    
    public boolean checkCondition_1(final int n, final int n2, final int n3) {
        return this.slotJ.checkCondition(n, n2, n3);
    }
    
    public boolean checkCondition_2(final char c, final int n) {
        return this.slotJ.checkCondition_1(c, n);
    }
    
    public String getString() {
        return this.slotJ.getString_1();
    }
    
    public void execute() {
        this.slotJ.setString_2("");
        this.slotJ.execute();
    }
    
    public boolean isEnabled() {
        return this.slotJ.isEnabled_1();
    }
    
    public static void setSyncaarr(final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncAArray) {
        Initializer.SyncAArray = syncAArray;
    }
    
    public static com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] getSyncaarrArray() {
        return Initializer.SyncAArray;
    }
    
    static {
        if (getSyncaarrArray() == null) {
            setSyncaarr(new com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[4]);
        }
        int n3;
        int n2;
        final int n = n2 = (n3 = 80);
        final char[] charArray = "\u0019b\b0\u0006|~,h\u001bb\u0004z~#s\f/K:p".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0140: {
                if (length > 1) {
                    break Label_0140;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 26;
                        case 1 -> 87;
                        case 2 -> 57;
                        case 3 -> 18;
                        case 4 -> 53;
                        case 5 -> 68;
                        default -> 14;
                    }));
                    ++n4;
                } while (n == 0);
            }
            if (length <= n4) {
                strValue = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
