// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub3.sub1;

import net.minecraft.class_640;
import net.minecraft.class_1799;
import java.util.List;
import java.util.Comparator;
import java.util.function.Predicate;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_6;
import java.util.Objects;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import java.awt.Color;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_2;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_3;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_3;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class CacheOImpl extends Initializer_3 implements PackDImpl_3
{
    private final SyncASub_3 initD;
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_5 parseB_5;
    private final SyncASub_5 parseB_6;
    private final SyncASub_2 checkE;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private float floatValue;
    
    public CacheOImpl() {
        super("hud", Initializer_14.computeString(new int[] { 35, 35, 197 }), "Controls the heads-up display rendering", Initializer.RENDER);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 60, 23, 245, 233, 229, 207, 204, 202, 168 }), true);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 34, 24, 231, 227, 183, 224, 204, 202 }), true);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 42, 4, 243, 237, 238, 130, 225, 209, 176, 186 }), true);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 42, 4, 236, 227, 229, 130, 229, 237, 135 }), true);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 63, 19, 249, 248, 183, 241, 197, 217, 167, 161, 174 }), true);
        this.parseB_5 = new SyncASub_5(Initializer_14.computeString(new int[] { 57, 23, 232, 226, 245, 205, 218 }), true);
        this.parseB_6 = new SyncASub_5(Initializer_14.computeString(new int[] { 36, 3, 245, 224, 254, 204, 200, 203 }), true);
        this.checkE = new SyncASub_2(Initializer_14.computeString(new int[] { 39, 31, 242, 248, 183, 241, 196, 220, 166 }), Initializer_14.computeString(new int[] { 57, 31, 230, 228, 227 }), new String[] { Initializer_14.computeString(new int[] { 57, 31, 230, 228, 227 }), Initializer_14.computeString(new int[] { 39, 19, 231, 248 }) });
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 39, 31, 242, 248, 183, 241, 221, 217, 160, 167, 183, 131 }), 0.0, 4.0, 0.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 42, 21, 226, 233, 249, 214, 141, 240, 182, 171 }), 0.0, 360.0, 220.0, 1.0);
        this.floatValue = 0.0f;
        this.initD = new SyncASub_3(Initializer_14.computeString(new int[] { 46, 21, 242, 190, 192, 198, 218 }), 301, false);
        this.setSyncaarr(this.initD, this.parseB, this.parseB_1, this.parseB_2, this.parseB_3, this.parseB_4, this.parseB_5, this.parseB_6, this.checkE, this.buildC, this.buildC_1);
    }
    
    @Override
    public void execute() {
        this.renderA.setClassAndPackd(PackDImpl_3.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_3.class, this);
        super.execute_1();
    }
    
    private static int method_int(final int n, final int n2, final int n3, final int n4) {
        return n4 << 24 | n << 16 | n2 << 8 | n3;
    }
    
    private int method_int_3(final int n) {
        if (this.parseB_5.getBoolean()) {
            return Color.getHSBColor((this.floatValue + n * 10) % 360.0f / 360.0f, 0.65f, 1.0f).getRGB() | 0xFF000000;
        }
        return Color.getHSBColor((float)(this.buildC_1.getDouble() / 360.0), 0.65f, 1.0f).getRGB() | 0xFF000000;
    }
    
    private int method_int_1(final int n, final int n2) {
        return (this.method_int_3(n) & 0xFFFFFF) | n2 << 24;
    }
    
    private void processAll(final class_332 class_332, final String s, final int n, final int n2, final int n3) {
        if (this.parseB_4.getBoolean()) {
            class_332.method_25303(CacheOImpl.class310.field_1772, s, n, n2, n3);
        }
        else {
            class_332.method_51439(CacheOImpl.class310.field_1772, (class_2561)class_2561.method_43470(s), n, n2, n3, false);
        }
    }
    
    private int method_int_2(final String s) {
        return CacheOImpl.class310.field_1772.method_1727(s);
    }
    
    private int getInt() {
        Objects.requireNonNull(CacheOImpl.class310.field_1772);
        return 9;
    }
    
    @Override
    public void setLoadb(final BindCSub_6 bindCSub_6) {
        if (CacheOImpl.class310.field_1724 == null || CacheOImpl.class310.field_1687 == null) {
            return;
        }
        if (CacheOImpl.class310.method_53526().method_53536()) {
            return;
        }
        final class_332 class_332 = bindCSub_6.getClass_332();
        final int method_4486 = CacheOImpl.class310.method_22683().method_4486();
        final int method_4487 = CacheOImpl.class310.method_22683().method_4502();
        this.floatValue += 0.5f;
        if (this.parseB.getBoolean()) {
            this.setClass_332AndInt(class_332, method_4486);
        }
        if (this.parseB_1.getBoolean()) {
            this.setClass_332AndInt_1(class_332, method_4486);
        }
        if (this.parseB_2.getBoolean()) {
            this.processAll_1(class_332, method_4486, method_4487);
        }
        if (this.parseB_3.getBoolean()) {
            this.processAll_2(class_332, method_4486, method_4487);
        }
    }
    
    private void setClass_332AndInt(final class_332 v1, final int i2) {
        final int i3 = 3;
        final int i4 = 3;
        final Object v2 = new String(new char[] { 'T', 'r', 'i', 'l', 'l', 'i', 'u', 'm', 'S', 'o', 'l', 'u', 't', 'i', 'o', 'n', 's' });
        final Object v3 = "";
        final int i5 = this.method_int_2((String)v2) + this.method_int_2((String)v3);
        v1.method_25294(i3, i4, i3 + i5 + 8, i4 + this.getInt() + 5, method_int(10, 10, 15, 180));
        for (int i6 = 0; i6 < i5 + 8; ++i6) {
            final int i7 = this.method_int_3(i6 / 6);
            v1.method_25294(i3 + i6, i4, i3 + i6 + 1, i4 + 1, i7);
        }
        v1.method_25294(i3, i4, i3 + 1, i4 + this.getInt() + 5, this.method_int_3(0));
        this.processAll(v1, (String)v2, i3 + 4, i4 + 3, this.method_int_3(0));
        this.processAll(v1, (String)v3, i3 + 4 + this.method_int_2((String)v2), i4 + 3, method_int(180, 185, 200, 255));
    }
    
    private void setClass_332AndInt_1(final class_332 class_332, final int n) {
        final int method_47599 = CacheOImpl.class310.method_47599();
        final String s = method_47599 + " FPS";
        final String string = this.getString();
        final String string_1 = this.getString_1();
        final String s2 = " \u2503 ";
        final int method_int_2 = this.method_int_2(s + s2 + string + s2 + string_1);
        final int n2 = 3;
        final int n3 = this.parseB.getBoolean() ? (this.getInt() + 11) : 3;
        class_332.method_25294(n2, n3, n2 + method_int_2 + 8, n3 + this.getInt() + 5, method_int(10, 10, 15, 160));
        class_332.method_25294(n2, n3 + this.getInt() + 4, n2 + method_int_2 + 8, n3 + this.getInt() + 5, method_int(40, 45, 60, 180));
        final int n4 = n2 + 4;
        this.processAll(class_332, s, n4, n3 + 3, (method_47599 > 120) ? method_int(100, 230, 150, 255) : ((method_47599 > 60) ? method_int(140, 220, 100, 255) : ((method_47599 > 30) ? method_int(230, 200, 60, 255) : method_int(230, 70, 70, 255))));
        final int n5 = n4 + this.method_int_2(s);
        this.processAll(class_332, s2, n5, n3 + 3, method_int(50, 55, 70, 255));
        final int n6 = n5 + this.method_int_2(s2);
        this.processAll(class_332, string, n6, n3 + 3, this.getInt_1());
        final int n7 = n6 + this.method_int_2(string);
        this.processAll(class_332, s2, n7, n3 + 3, method_int(50, 55, 70, 255));
        this.processAll(class_332, string_1, n7 + this.method_int_2(s2), n3 + 3, method_int(150, 155, 170, 255));
    }
    
    private void processAll_1(final class_332 class_332, final int n, final int n2) {
        final List<Object> list = (List<Object>)ClientModInitializerImpl.sortB.getEventd().getList().stream().filter(Initializer_3::isEnabled).filter(this::lambda$drawArrayList$0).sorted(this::lambda$drawArrayList$1).toList();
        if (list.isEmpty()) {
            return;
        }
        final boolean equals = this.checkE.getString().equals("Right");
        final int n3 = (int)(double)this.buildC.getDouble();
        int n4 = 2;
        for (int i = 0; i < list.size(); ++i) {
            final String computeString = this.computeString(list.get(i).getString_1());
            final int method_int_2 = this.method_int_2(computeString);
            final int n5 = this.getInt() + 2 + n3;
            if (equals) {
                final int n6 = n - method_int_2 - 6;
                class_332.method_25294(n6, n4, n, n4 + n5, method_int(10, 10, 18, 145));
                class_332.method_25294(n - 2, n4, n, n4 + n5, this.method_int_3(i));
                if (i > 0) {
                    class_332.method_25294(n6, n4, n - 2, n4 + 1, method_int(30, 32, 45, 120));
                }
                if (this.parseB_6.getBoolean()) {
                    class_332.method_25294(n6, n4, n6 + 1, n4 + n5, method_int(25, 28, 40, 100));
                }
                this.processAll(class_332, computeString, n - method_int_2 - 4, n4 + 1 + n3 / 2, this.method_int_3(i));
            }
            else {
                class_332.method_25294(0, n4, method_int_2 + 6, n4 + n5, method_int(10, 10, 18, 145));
                class_332.method_25294(0, n4, 2, n4 + n5, this.method_int_3(i));
                if (i > 0) {
                    class_332.method_25294(2, n4, method_int_2 + 6, n4 + 1, method_int(30, 32, 45, 120));
                }
                if (this.parseB_6.getBoolean()) {
                    class_332.method_25294(method_int_2 + 5, n4, method_int_2 + 6, n4 + n5, method_int(25, 28, 40, 100));
                }
                this.processAll(class_332, computeString, 4, n4 + 1 + n3 / 2, this.method_int_3(i));
            }
            n4 += n5;
        }
        if (!list.isEmpty()) {
            final int n7 = this.method_int_2(this.computeString(list.get(list.size() - 1).getString_1())) + 6;
            if (equals) {
                class_332.method_25294(n - n7, n4, n, n4 + 1, this.method_int_1(list.size(), 120));
            }
            else {
                class_332.method_25294(0, n4, n7, n4 + 1, this.method_int_1(list.size(), 120));
            }
        }
    }
    
    private void processAll_2(final class_332 class_332, final int n, final int n2) {
        final int n3 = n / 2 + 12;
        final int n4 = n2 - 54;
        int n5 = n3;
        for (int i = 3; i >= 0; --i) {
            final class_1799 method_5438 = CacheOImpl.class310.field_1724.method_31548().method_5438(36 + i);
            if (!method_5438.method_7960()) {
                class_332.method_51427(method_5438, n5, n4);
                if (method_5438.method_7963()) {
                    final float n6 = 1.0f - method_5438.method_7919() / (float)method_5438.method_7936();
                    final int n7 = 13;
                    final int max = Math.max(1, (int)(n6 * n7));
                    final int n8 = n4 + 17;
                    class_332.method_25294(n5 + 2, n8, n5 + 2 + n7, n8 + 2, method_int(10, 10, 10, 200));
                    class_332.method_25294(n5 + 2, n8, n5 + 2 + max, n8 + 2, (n6 > 0.55f) ? method_int(80, 210, 120, 255) : ((n6 > 0.25f) ? method_int(230, 200, 50, 255) : method_int(230, 60, 60, 255)));
                }
                n5 += 18;
            }
        }
        final class_1799 method_5439 = CacheOImpl.class310.field_1724.method_6047();
        if (!method_5439.method_7960() && method_5439.method_7963()) {
            final int method_5440 = method_5439.method_7936();
            final int n9 = method_5440 - method_5439.method_7919();
            final float n10 = n9 / (float)method_5440;
            final String s = "" + n9;
            this.processAll(class_332, s, n / 2 - this.method_int_2(s) / 2, n2 - 56, (n10 > 0.55f) ? method_int(80, 210, 120, 255) : ((n10 > 0.25f) ? method_int(230, 200, 50, 255) : method_int(230, 60, 60, 255)));
        }
    }
    
    private String computeString(final String s) {
        if (s == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char char1 = s.charAt(i);
            if (char1 >= '\uff01' && char1 <= '\uff5e') {
                char1 -= '\ufee0';
            }
            else if (char1 == '\u3000') {
                char1 = ' ';
            }
            if (char1 == '.' && i + 1 < s.length()) {
                final char char2 = s.charAt(i + 1);
                if (char2 >= '\uff41' && char2 <= '\uff5a') {
                    continue;
                }
                if (char2 >= 'a' && char2 <= 'z') {
                    continue;
                }
            }
            sb.append(char1);
        }
        return sb.toString();
    }
    
    private String getString() {
        if (CacheOImpl.class310.field_1724 != null && CacheOImpl.class310.method_1562() != null) {
            final class_640 method_2871 = CacheOImpl.class310.method_1562().method_2871(CacheOImpl.class310.field_1724.method_5667());
            if (method_2871 != null) {
                return method_2871.method_2959() + "ms";
            }
        }
        return "N/A";
    }
    
    private int getInt_1() {
        if (CacheOImpl.class310.field_1724 != null && CacheOImpl.class310.method_1562() != null) {
            final class_640 method_2871 = CacheOImpl.class310.method_1562().method_2871(CacheOImpl.class310.field_1724.method_5667());
            if (method_2871 != null) {
                final int method_2872 = method_2871.method_2959();
                if (method_2872 < 50) {
                    return method_int(100, 230, 150, 255);
                }
                if (method_2872 < 100) {
                    return method_int(230, 220, 60, 255);
                }
                if (method_2872 < 200) {
                    return method_int(230, 140, 50, 255);
                }
                return method_int(230, 60, 60, 255);
            }
        }
        return method_int(150, 155, 170, 255);
    }
    
    private String getString_1() {
        if (CacheOImpl.class310.method_1558() != null) {
            final String field_3761 = CacheOImpl.class310.method_1558().field_3761;
            return (field_3761.length() > 22) ? (field_3761.substring(0, 19) + "...") : field_3761;
        }
        return "Singleplayer";
    }
    
    public int getInt_2() {
        return this.initD.getInt();
    }
    
    @Override
    public void setInt(final int int1) {
        this.initD.setInt(int1);
    }
    
    @Override
    public SyncASub_3 getInitd() {
        return this.initD;
    }
    
    private int lambda$drawArrayList$1(final Initializer_3 initializer_3, final Initializer_3 initializer_4) {
        return Integer.compare(this.method_int_2(this.computeString(initializer_4.getString_1())), this.method_int_2(this.computeString(initializer_3.getString_1())));
    }
    
    private boolean lambda$drawArrayList$0(final Initializer_3 initializer_3) {
        return initializer_3 != this;
    }
}
