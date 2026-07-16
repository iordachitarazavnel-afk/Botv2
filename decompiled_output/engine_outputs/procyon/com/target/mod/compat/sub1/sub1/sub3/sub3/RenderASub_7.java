// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import com.target.mod.compat.sub1.sub1.sub1.Initializer;

public class RenderASub_7 extends AbstractSyncA<Integer>
{
    private boolean boolFlag;
    private static final String strValue;
    
    public RenderASub_7(final String s, final int i) {
        super(s, i);
        this.boolFlag = false;
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public void setBool(final boolean boolFlag) {
        this.boolFlag = boolFlag;
    }
    
    @Override
    public String getString() {
        final boolean enabled = AbstractSyncA.isEnabled();
        final int boolFlag = this.boolFlag ? 1 : 0;
        if (enabled) {
            if (boolFlag != 0) {
                return RenderASub_7.strValue;
            }
            this.getValue().intValue();
        }
        return com.target.mod.compat.sub1.sub1.sub1.Initializer.computeString(boolFlag);
    }
    
    public void setInt(final int i) {
        this.setObject(i);
        this.setBool(false);
    }
    
    @Override
    public void execute() {
        this.setObject(-1);
        this.setBool(false);
    }
    
    static {
        int n3;
        int n2;
        final int n = n2 = (n3 = 126);
        final char[] charArray = "\n{_\n8v2zb_\u0000ex}".toCharArray();
        final int length = charArray.length;
        int n4 = 0;
        while (true) {
            Label_0128: {
                if (length > 1) {
                    break Label_0128;
                }
                n3 = (n2 = n4);
                do {
                    final char c = charArray[n2];
                    charArray[n3] = (char)(c ^ (n ^ switch (n4 % 7) {
                        case 0 -> 36;
                        case 1 -> 119;
                        case 2 -> 68;
                        case 3 -> 7;
                        case 4 -> 53;
                        case 5 -> 40;
                        default -> 45;
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
