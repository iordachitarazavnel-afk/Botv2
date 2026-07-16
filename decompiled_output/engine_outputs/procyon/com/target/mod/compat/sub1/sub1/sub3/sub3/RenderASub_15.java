// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;

public class RenderASub_15<T extends Enum<T>> extends AbstractSyncA<T>
{
    private final Class<T> class;
    private String strValue;
    
    public RenderASub_15(final String s, final T t, final Class<T> class1) {
        super(s, t);
        this.class = class1;
    }
    
    @Override
    public String getString() {
        return this.strValue;
    }
    
    public RenderASub_15<T> computeWrapj(final String strValue) {
        this.strValue = strValue;
        return this;
    }
    
    public boolean checkEnum(final T t) {
        return this.getValue() == t;
    }
    
    public T[] getEnumarrArray() {
        return this.class.getEnumConstants();
    }
    
    @Override
    public void execute() {
        final boolean enabled = AbstractSyncA.isEnabled();
        final T[] enumarrArray = this.getEnumarrArray();
        final boolean b = enabled;
        final Enum<T> enum1 = this.getValue();
        int n = -1;
        int i = 0;
        while (i < enumarrArray.length) {
            if (!b) {
                return;
            }
            if (enumarrArray[i] == enum1) {
                n = i;
                if (b) {
                    break;
                }
            }
            ++i;
            if (!b) {
                break;
            }
        }
        final int n2 = n;
        final int n3 = -1;
        if (b) {
            if (n2 == n3) {
                return;
            }
            final int length = enumarrArray.length;
        }
        this.setObject(enumarrArray[n2 % n3]);
    }
    
    public void setString(final String s) {
        final boolean enabled_1 = AbstractSyncA.isEnabled_1();
        try {
            if (s == null) {
                return;
            }
        }
        catch (final Exception ex) {
            throw computeException(ex);
        }
        try {
            this.setObject(Enum.valueOf(this.class, s.toUpperCase()));
        }
        catch (final Exception ex2) {
            final T[] array = this.class.getEnumConstants();
            final int length = array.length;
            int i = 0;
            while (i < length) {
                final Enum<T> object = array[i];
                Label_0100: {
                    Label_0086: {
                        try {
                            if (enabled_1) {
                                break Label_0100;
                            }
                            final Enum<T> enum1 = object;
                            final String s2 = enum1.toString();
                            final String s3 = s;
                            final boolean b = s2.equalsIgnoreCase(s3);
                            if (b) {
                                break Label_0086;
                            }
                            break Label_0086;
                        }
                        catch (final Exception ex3) {
                            throw computeException(ex3);
                        }
                        try {
                            final Enum<T> enum1 = object;
                            final String s2 = enum1.toString();
                            final String s3 = s;
                            final boolean b = s2.equalsIgnoreCase(s3);
                            if (b) {
                                this.setObject(object);
                                return;
                            }
                        }
                        catch (final Exception ex4) {
                            throw computeException(ex4);
                        }
                    }
                    ++i;
                }
                if (enabled_1) {
                    break;
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return this.getValue().name();
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
