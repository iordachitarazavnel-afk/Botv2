// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

public class Initializer
{
    private final String strValue;
    private final String strValue_1;
    private final Initializer_18 packH;
    private final long longValue;
    private final long longValue_1;
    private float floatValue;
    private float floatValue_1;
    
    public Initializer(final String strValue, final String strValue_1, final Initializer_18 packH, final long longValue_1) {
        this.floatValue = 0.0f;
        this.floatValue_1 = 1.0f;
        this.strValue = strValue;
        this.strValue_1 = strValue_1;
        this.packH = packH;
        this.longValue_1 = longValue_1;
        this.longValue = System.currentTimeMillis();
    }
    
    public Initializer(final String s, final String s2, final Initializer_18 initializer_18) {
        this(s, s2, initializer_18, 3000L);
    }
    
    public String getString() {
        return this.strValue;
    }
    
    public String getString_1() {
        return this.strValue_1;
    }
    
    public Initializer_18 getPackh() {
        return this.packH;
    }
    
    public long getLong() {
        return this.longValue;
    }
    
    public long getLong_1() {
        return this.longValue_1;
    }
    
    public boolean isEnabled() {
        final int int_1 = Initializer_21.getInt_1();
        long n = 0L;
        Label_0035: {
            try {
                n = lcmp(System.currentTimeMillis() - this.longValue, this.longValue_1);
                if (int_1 == 0) {
                    return n != 0L;
                }
                if (n < 0) {
                    break Label_0035;
                }
            }
            catch (final MatchException ex) {
                throw computeMatchexception(ex);
            }
            return n != 0L;
        }
        return n != 0L;
    }
    
    public float getFloat() {
        return Math.max(0.0f, 1.0f - (System.currentTimeMillis() - this.longValue) / (float)this.longValue_1);
    }
    
    public float getFloat_1() {
        return this.floatValue;
    }
    
    public void setFloat(final float floatValue) {
        this.floatValue = floatValue;
    }
    
    public float getFloat_2() {
        return this.floatValue_1;
    }
    
    public void setFloat_1(final float floatValue_1) {
        this.floatValue_1 = floatValue_1;
    }
    
    public int getInt() {
        try {
            switch (this.packH.ordinal()) {
                default: {
                    throw new MatchException((String)null, (Throwable)null);
                }
                case 0:
                case 4:
                case 6:
                case 7:
                case 9: {
                    break;
                }
                case 1:
                case 5:
                case 10: {
                    return -769226;
                }
                case 2:
                case 11: {
                    return -26624;
                }
                case 3:
                case 8:
                case 12: {
                    return -14575885;
                }
            }
        }
        catch (final MatchException ex) {
            throw computeMatchexception(ex);
        }
        return -11751600;
        n = -769226;
        return n;
        n = -26624;
        return n;
        n = -14575885;
        return n;
    }
    
    private static MatchException computeMatchexception(final MatchException ex) {
        return ex;
    }
}
