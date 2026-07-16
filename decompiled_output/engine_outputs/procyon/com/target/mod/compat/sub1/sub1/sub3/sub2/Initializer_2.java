// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub2;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Iterator;
import net.minecraft.class_2378;
import java.util.function.Function;
import java.util.Comparator;
import net.minecraft.class_1887;
import net.minecraft.class_5321;
import net.minecraft.class_7924;
import java.util.ArrayList;
import com.target.mod.compat.sub1.sub1.sub3.Initializer_1;
import net.minecraft.class_332;
import java.util.Collection;
import java.util.HashSet;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_11;
import java.util.Set;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_7;
import com.target.mod.compat.sub1.sub1.sub3.sub1.Initializer;
import java.util.List;

public class Initializer_2
{
    private static final int intValue = 18;
    private static final int intValue_1 = 25;
    private static final List<String> list;
    private static final List<String> list_1;
    private final Initializer blockB;
    private final Initializer_7 parseD;
    private final class_310 class310;
    private final int intValue_2 = 200;
    private final int intValue_3 = 250;
    private final int intValue_4 = 16;
    private final Set<String> set;
    private final Set<String> set_1;
    private RenderASub_11 procF;
    private int intValue_5;
    private int intValue_6;
    private int intValue_7;
    private static String strValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_2() {
        this.class310 = class_310.method_1551();
        this.set = new HashSet<String>();
        this.set_1 = new HashSet<String>();
        this.intValue_5 = 100;
        this.intValue_6 = 100;
        this.intValue_7 = 0;
        this.blockB = new Initializer();
        this.parseD = new Initializer_7();
    }
    
    public RenderASub_11 getProcf() {
        return this.procF;
    }
    
    public void setProcf(final RenderASub_11 procF) {
        this.procF = procF;
        if (procF != null) {
            this.blockB.execute();
            this.intValue_7 = 0;
            this.set.clear();
            this.set.addAll(procF.getSet());
        }
    }
    
    public boolean isEnabled() {
        return this.procF != null;
    }
    
    public void processAll(final class_332 class_332, final int n, final int n2, final float n3) {
        final String string = getString();
        Initializer_2 initializer_2 = this;
        if (string == null) {
            if (this.procF == null) {
                return;
            }
            initializer_2 = this;
        }
        final int[] intarrArray = initializer_2.parseD.getIntarrArray();
        this.intValue_5 = intarrArray[0];
        this.intValue_6 = intarrArray[1];
        final int enabled = this.parseD.isEnabled() ? 1 : 0;
        final int n4 = 12;
        int n5 = Initializer_1.method_int(Initializer_1.getInt_10(), n3 * 0.4f);
        int method_int;
        final int n6 = method_int = enabled;
        if (string == null) {
            if (n6 != 0) {
                n5 = Initializer_1.method_int(Initializer_1.getInt(), n3 * 0.6f);
            }
            com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_30(class_332, this.intValue_5, this.intValue_6, 200, 250, n4, n5);
            method_int = Initializer_1.method_int(Initializer_1.getInt_4(), n3 * 0.3f);
        }
        com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.processAll(class_332, this.intValue_5, this.intValue_6, 200, 18, n4, method_int);
        class_332.method_51433(this.class310.field_1772, createString(-25558, 30493), this.intValue_5 + 8, this.intValue_6 + 6, Initializer_1.method_int_1(Initializer_1.getInt_8(), (int)(n3 * 255.0f)) | 0xFF000000, false);
        final int n7 = this.intValue_5 + 200 - 15;
        final int n8 = this.intValue_6 + 6;
        int n9;
        final boolean b = (n9 = (com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n7 - 2, n8 - 2, 12, 12) ? 1 : 0)) != 0;
        int n10 = 0;
        Label_0286: {
            if (string == null) {
                if (b) {
                    n10 = (Initializer_1.method_int_1(Initializer_1.getInt(), (int)(n3 * 255.0f)) | 0xFF000000);
                    break Label_0286;
                }
                n9 = Initializer_1.method_int_1(-1, (int)(n3 * 255.0f));
            }
            n10 = (n9 | 0xFF000000);
        }
        class_332.method_51433(this.class310.field_1772, "X", n7, n8, n10, false);
        final int n11 = this.intValue_6 + 18 + 5;
        final int n12 = 20;
        final int n13 = 180;
        final int n14 = this.intValue_5 + 10;
        final int enabled2;
        final int n15 = enabled2 = (this.blockB.isEnabled() ? 1 : 0);
        com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.processAll(class_332, n14, n11, n13, n12, 5, (string == null && enabled2 != 0) ? Initializer_1.method_int(Initializer_1.getInt_7(), n3 * 0.15f) : Initializer_1.method_int(enabled2, 0.0f));
        final int n16 = n15;
        Label_0430: {
            if (string == null) {
                if (n16 == 0) {
                    break Label_0430;
                }
                Initializer_1.method_int(Initializer_1.getInt(), n3 * 0.4f);
            }
            com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_30(class_332, n14, n11, n13, n12, 5, n16);
        }
        final String string2 = this.blockB.getString();
        final int n17 = n15;
        String s2 = null;
        Label_0516: {
            String s3 = null;
            Label_0509: {
                if (string == null) {
                    if (n17 != 0) {
                        final String s = string2;
                        if (string == null) {
                            if (s.isEmpty()) {
                                createString(-25595, 3587);
                            }
                        }
                        s2 = s;
                        if (string == null) {
                            break Label_0516;
                        }
                    }
                    s3 = string2;
                    if (string != null) {
                        break Label_0509;
                    }
                    s3.isEmpty();
                }
                if (n17 != 0) {
                    createString(-25561, -22529);
                }
            }
            s2 = s3;
        }
        class_332.method_51433(this.class310.field_1772, s2, n14 + 5, n11 + 6, Initializer_1.method_int_1(-1, (int)(n3 * 255.0f)) | 0xFF000000, false);
        final int n18 = this.intValue_6 + 18 + 25 + 8;
        final int n19 = 194;
        class_332.method_44379(this.intValue_5 + 5, n18, this.intValue_5 + 200 - 5, n18 + n19);
        final List<RecordSub> list = this.getList();
        final int n20 = n19 / 16;
        final int max = Math.max(0, list.size() - n20);
        this.intValue_7 = Math.max(0, Math.min(this.intValue_7, max));
        int i = 0;
        while (true) {
            while (i < n20) {
                final int n21 = i + this.intValue_7;
                if (string != null || string != null) {
                    if (n21 > 0) {
                        this.processAll_2(class_332, n18, n19, this.intValue_7, max, n20, list.size(), n, n2, n3);
                    }
                    return;
                }
                if (n21 >= list.size()) {
                    break;
                }
                this.processAll_1(class_332, (RecordSub)list.get(i + this.intValue_7), this.intValue_5 + 8, n18 + 2 + i * 16, 175, 16, n, n2, n3);
                ++i;
                if (string != null) {
                    break;
                }
            }
            class_332.method_44380();
            continue;
        }
    }
    
    private void processAll_1(final class_332 class_332, final RecordSub recordSub, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        final boolean checkCondition = com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n5, n6, n, n2, n3, n4);
        final boolean checkNodee = this.checkNodee(recordSub);
        if (checkNodee || checkCondition) {
            com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.processAll(class_332, n - 2, n2 - 2, n3 + 4, n4 + 4, 4, checkNodee ? Initializer_1.method_int(Initializer_1.getInt(), n7 * 0.4f) : Initializer_1.method_int(Initializer_1.getInt_7(), n7 * 0.3f));
        }
        if (checkNodee) {
            com.target.mod.compat.sub1.sub1.sub7.sub5.Initializer.processAll_30(class_332, n - 2, n2 - 2, n3 + 4, n4 + 4, 4, Initializer_1.method_int(Initializer_1.getInt(), n7 * 0.9f));
        }
        final int n8 = -1;
        String s = recordSub.boolFlag ? (createString(-25547, 11577) + recordSub.strValue) : recordSub.strValue;
        if (this.class310.field_1772.method_1727(s) > n3 - 10) {
            s = this.class310.field_1772.method_27523(s, n3 - 15) + createString(-25545, 24681);
        }
        class_332.method_51433(this.class310.field_1772, s, n + 3, n2 + 4, n8, true);
    }
    
    private void processAll_2(final class_332 class_332, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final float n9) {
        final int n10 = this.intValue_5 + 200 - 12;
        final int n11 = n + 5;
        final int n12 = n2 - 10;
        final int n13 = 5;
        final float n14 = (n4 > 0) ? (n3 / (float)n4) : 0.0f;
        final int max = Math.max(20, (int)(n5 / (float)n6 * n12));
        final int n15 = n11 + (int)((n12 - max) * n14);
        com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.processAll(class_332, n10, n15, n13, max, 3, com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n7, n8, n10, n15, n13, max) ? Initializer_1.method_int(Initializer_1.getInt(), n9 * 0.8f) : Initializer_1.method_int(Initializer_1.getInt(), n9 * 0.5f));
    }
    
    public boolean checkCondition(final double n, final double n2, final int n3) {
        if (this.procF == null) {
            return false;
        }
        final int n4 = this.intValue_5 + 200 - 15;
        final int n5 = this.intValue_6 + 6;
        final int n6 = 12;
        if (com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n4, n5, n6, n6)) {
            this.procF = null;
            return true;
        }
        if (n3 == 0 && com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, this.intValue_5, this.intValue_6, 200, 18) && !com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, n4, n5, n6, n6)) {
            this.parseD.processAll(n, n2, this.intValue_5, this.intValue_6);
            return true;
        }
        if (this.blockB.checkCondition(n, n2, n3, this.intValue_5 + 10, this.intValue_6 + 18 + 5)) {
            return true;
        }
        final int n7 = this.intValue_6 + 18 + 25 + 8;
        if (com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, this.intValue_5 + 5, n7, 190, 194)) {
            final int n8 = ((int)n2 - (n7 + 2)) / 16;
            final List<RecordSub> list = this.getList();
            if (n8 >= 0 && n8 + this.intValue_7 < list.size()) {
                this.setNodee((RecordSub)list.get(n8 + this.intValue_7));
                return true;
            }
        }
        return com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, this.intValue_5, this.intValue_6, 200, 250);
    }
    
    public boolean checkCondition_1(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (this.procF == null) {
            return false;
        }
        if (this.parseD.isEnabled()) {
            this.parseD.createIntarr(n, n2);
            return true;
        }
        return false;
    }
    
    public boolean checkCondition_5(final double n, final double n2, final int n3) {
        if (this.procF == null) {
            return false;
        }
        if (n3 == 0) {
            this.parseD.execute();
        }
        return false;
    }
    
    public boolean checkCondition_2(final double n, final double n2, final double n3, final double n4) {
        if (this.procF == null) {
            return false;
        }
        final int n5 = this.intValue_6 + 18 + 25 + 8;
        final int n6 = 194;
        if (com.target.mod.compat.sub1.sub1.sub3.sub4.Initializer_1.checkCondition(n, n2, this.intValue_5 + 5, n5, 190, n6)) {
            this.intValue_7 -= (int)n4 * 2;
            this.intValue_7 = Math.max(0, Math.min(this.intValue_7, Math.max(0, this.getList().size() - n6 / 16)));
            return true;
        }
        return false;
    }
    
    public boolean checkCondition_3(final int n, final int n2, final int n3) {
        return this.procF != null && this.blockB.checkCondition_1(n, n2, n3);
    }
    
    public boolean checkCondition_4(final char c, final int n) {
        return this.procF != null && this.blockB.checkCondition_2(c, n);
    }
    
    private boolean checkNodee(final RecordSub recordSub) {
        if (recordSub.boolFlag) {
            return this.set.contains(recordSub.strValue);
        }
        if (recordSub.class5321 == null) {
            return this.set_1.contains(recordSub.strValue);
        }
        return this.procF.getList().contains(recordSub.class5321);
    }
    
    private void setNodee(final RecordSub recordSub) {
        if (recordSub.boolFlag) {
            if (this.set.contains(recordSub.strValue)) {
                this.procF.setString_1(recordSub.strValue);
                this.set.remove(recordSub.strValue);
            }
            else {
                this.procF.setString(recordSub.strValue);
                this.set.add(recordSub.strValue);
            }
        }
        else if (recordSub.class5321 == null) {
            if (this.set_1.contains(recordSub.strValue)) {
                this.set_1.remove(recordSub.strValue);
            }
            else {
                this.set_1.add(recordSub.strValue);
            }
            this.procF.setStringAndObject(createString(-25554, -31514), new ArrayList(this.set_1));
        }
        else if (this.procF.getList().contains(recordSub.class5321)) {
            this.procF.setClass_5321_1(recordSub.class5321);
        }
        else {
            this.procF.setClass_5321(recordSub.class5321);
        }
    }
    
    private List<RecordSub> getList() {
        final ArrayList list = new ArrayList();
        final String lowerCase = this.blockB.getString().toLowerCase();
        class_2378 method_30530 = null;
        if (this.class310.field_1687 != null) {
            try {
                method_30530 = this.class310.field_1687.method_30349().method_30530(class_7924.field_41265);
            }
            catch (final Exception ex) {}
        }
        if (method_30530 == null) {
            for (final String s : Initializer_2.list_1) {
                try {
                    if (!s.toLowerCase().contains(lowerCase)) {
                        continue;
                    }
                    list.add(new RecordSub(s, null, false));
                }
                catch (final Exception ex2) {
                    throw computeException(ex2);
                }
            }
            for (final String s2 : Initializer_2.list) {
                try {
                    if (!s2.toLowerCase().contains(lowerCase)) {
                        continue;
                    }
                    list.add(new RecordSub(s2, null, true));
                }
                catch (final Exception ex3) {
                    throw computeException(ex3);
                }
            }
            list.sort(Comparator.comparing((Function<? super E, ? extends Comparable>)Initializer_2::lambda$getFilteredEntries$0));
            return list;
        }
        final HashSet set = new HashSet();
        for (final class_5321 class_5321 : method_30530.method_42021()) {
            final String computeString = this.computeString((class_5321<class_1887>)class_5321);
            try {
                set.add(computeString.toLowerCase());
                if (!computeString.toLowerCase().contains(lowerCase)) {
                    continue;
                }
                list.add(new RecordSub(computeString, (class_5321<class_1887>)class_5321, false));
            }
            catch (final Exception ex4) {
                throw computeException(ex4);
            }
        }
        for (final String s3 : Initializer_2.list_1) {
            Label_0395: {
                try {
                    if (set.contains(s3.toLowerCase())) {
                        continue;
                    }
                    final String s4 = s3;
                    final String s5 = s4.toLowerCase();
                    final String s6 = lowerCase;
                    final boolean b = s5.contains(s6);
                    if (b) {
                        break Label_0395;
                    }
                    continue;
                }
                catch (final Exception ex5) {
                    throw computeException(ex5);
                }
                try {
                    final String s4 = s3;
                    final String s5 = s4.toLowerCase();
                    final String s6 = lowerCase;
                    final boolean b = s5.contains(s6);
                    if (!b) {
                        continue;
                    }
                    list.add(new RecordSub(s3, null, false));
                }
                catch (final Exception ex6) {
                    throw computeException(ex6);
                }
            }
        }
        for (final String s7 : Initializer_2.list) {
            try {
                if (!s7.toLowerCase().contains(lowerCase)) {
                    continue;
                }
                list.add(new RecordSub(s7, null, true));
            }
            catch (final Exception ex7) {
                throw computeException(ex7);
            }
        }
        list.sort(Comparator.comparing((Function<? super E, ? extends Comparable>)Initializer_2::lambda$getFilteredEntries$1));
        return list;
    }
    
    private String computeString(final class_5321<class_1887> class_5321) {
        return Arrays.stream(class_5321.method_29177().method_12832().split("_")).map((Function<? super String, ?>)Initializer_2::lambda$getEnchantmentName$2).collect((Collector<? super Object, ?, String>)Collectors.joining(" "));
    }
    
    private static String lambda$getEnchantmentName$2(final String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    
    private static String lambda$getFilteredEntries$1(final RecordSub recordSub) {
        return recordSub.strValue;
    }
    
    private static String lambda$getFilteredEntries$0(final RecordSub recordSub) {
        return recordSub.strValue;
    }
    
    static {
        final String[] strArr2 = new String[53];
        int n = 0;
        String s;
        int n2 = (s = """
                      ¥\u000f¾\u00db\u0098^->\u00d0h\u00d8µ®y\u00d6\u0007}\u0003\u0015\rv>~\u0016\u00f7F \u00fd\u00d4M\u009d~±cs\u00ec\u00c3\u008caF\u0084\u00fb®\r\u00ce³\u0005\u00fdf\u0012\u00fej\b«ML\u0011\u00cd\u00d1\u00f0\u00ce\b\u00da	M\u000eUC\r\u009c
                      ¤\u0010A¬E\u0099\u00d1\u009c\u00da\u00dd\u0012:|\u0018©´®\u0018@\u00e9\u00f2\u00f6B\°p*\u0003\u00e8
                      \u00d55\u0089`83\u0092\u00d7\u008f\u00d6\fxc\u001bZ¢\u00c29\u00c3%i\u0000\u009a\u0011¬\u009c\u009f©¼\u0010©\u00f7@Q\u00c7\u0091\u00fb\u00db\bo\u000b\u0016\u00f9\u000eH\u00e3eg\u00ee¥\u001f/5¤r+^\u0083C5\u00e8\u000b\ff\u000bb&!\u00f3¾\u00d4\u00da\u000573B\u000b]s\u00fd\u001fa\u00cf\u00add¡H\u0018\u0007\u00e7¿\u0092I«\u0011|\u0013\u00ea\u00dd\u000e\u0099\u00ad(²mT%\u00cf$T\u0095\u0093e\u00da\u009fe\u0003\u00cf¤C\u0007¢\u00cb\u00d8Z?k\u00ec\u0003qQ\u00ed	{:$	\u0083\u00ea?\u00c7\u0089
                      £¹\u00f9z\u0018\u00c4Ae\u00cap\u000f¯\u0006U\u00fek\u0010\u0007wv¤\u00df?\u00c7\u008ew\u0007¥\u0096\u0018ª\u0006g\u00cb
                      \u00e9Yq®\u00e3µ\u009b\u00c1´\u001d
                      \u00d8\u0080H±&\u00c2§$]1\u0007	\u00fc\u0085«\u0094º\u0087\u00104®\u00eb\u00c9ª¢\u00d7\u00d5\u0087\u00f4\u0099\u00e9(sG\f\u000f\u00d0\u0002\u00f3sµW\u0089\u00d4\u0003\u00d9\f\u00f4¯9\u0001\u0005\u00dd\u001fR\u00e1\u008c\u0006¹\u0001^\u00f3\u008f\u00fd\r\u00009ZU\u001c¬»a¼\u00e4Y\u00f8\u0000\rª\u000b\u00efR\u00056¾A\u00d4½Lxµ\u0016\u009d\u00c1\u00ed\r}S¨½\u0017\u001b§\u00e3Ym2z\u00ee|\u00e3\u00fdg\u00ad\f\u008e\u00fa\u00dbe4\u0089¸\u00c4b%\u009eF\u0005kA_\u001e\u00ce\u0015j\u00f0~\u00c6\u00c6:M\u00f6w\u00f9¡H\u00c4\u0014\u0007-\u007f\u0096g\u00e1\u00ee\u0006¸\u00d2 \u00c3\u0016\u0091\u0005^\u0006\u00e0©\u0019
                      \u009aC\u00c87¼\u001d\u001dP\u0083/\u000f\u00c9E\u00c3\u0007\u008a\u00df/\u0019\u00e5\u00c2«\u000bµ\u00dcK	\u0096m\\u008c\u00ed¾¹rn\u0010\u009d\u001c¹¹x\u00121·SZ©\u009c¼\u00d5>\u00da
                      M\u0084\u00e3\u00f0i
                      Q\u00cay\u00f2\u0010J\u00ce\u0016\u00ffud \u0019\u00ee\u00cd\u001e3E\u0084\u00f9\u00fb\f/c\u0002\u00adX.\u008eWH\u00ca\u0003\u00c3\u0004\f\u00840 \bo&\u00ed\u0080\u0097\u009b\u0099hl\u0017=\u00f7\u0094y\u0019\u00ed\u0080\u0084\u008b\u0005\u0090\u0082DjG\u0012f\u00d6®|¸\u008f}\u0084\f\u00c0\u0012¢lv\u0016k\u00de\u0012\u0007\u0099K\u00c9\u0011\u009e\u0010E""").length();
        final String string = null;
        int n3 = 15;
        setString(string);
        int n4 = -1;
    Label_0028:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 84));
                ++n4;
                final String s2 = s;
                final int beginIndex = n4;
                String s3 = s2.substring(beginIndex, beginIndex + n3);
                int n9 = -1;
                while (true) {
                    final char[] charArray = s3.toCharArray();
                    final int length = charArray.length;
                    int n10 = 0;
                    while (true) {
                        Label_0268: {
                            if (length > 1) {
                                break Label_0268;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 79;
                                    case 1 -> 16;
                                    case 2 -> 49;
                                    case 3 -> 82;
                                    case 4 -> 22;
                                    case 5 -> 50;
                                    default -> 52;
                                }));
                                ++n10;
                            } while (n8 == 0);
                        }
                        if (length > n10) {
                            continue;
                        }
                        break;
                    }
                    final String intern = new String(charArray).intern();
                    switch (n9) {
                        default: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                continue Label_0028;
                            }
                            n2 = (s = "\u00e8\u00ad\u00d1,\u00fe\u009d\u0096K\u00d4D\u009f\t\u00ed\u0004\u00d5/_'\u00ee\u00d5\u0019").length();
                            n3 = 11;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0028;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 100)));
                    ++n4;
                    final String s4 = s;
                    final int beginIndex2 = n4;
                    s3 = s4.substring(beginIndex2, beginIndex2 + n3);
                    n9 = 0;
                }
            }
            break;
        }
        strArr = strArr2;
        strArr_1 = new String[53];
        list = Arrays.asList(createString(-25588, 25589), createString(-25596, 16963), createString(-25553, -18697), createString(-25563, 7927));
        list_1 = Arrays.asList(createString(-25548, -13098), createString(-25597, 1649), createString(-25566, -3320), createString(-25590, 14353), createString(-25537, -31380), createString(-25586, 15439), createString(-25542, -19072), createString(-25538, -32020), createString(-25598, 11352), createString(-25591, -17191), createString(-25594, 1119), createString(-25555, -15522), createString(-25559, 27278), createString(-25585, -14563), createString(-25599, 20296), createString(-25560, 21802), createString(-25580, 11898), createString(-25544, 26127), createString(-25540, 23508), createString(-25551, 8322), createString(-25578, -7240), createString(-25549, -18966), createString(-25562, -9683), createString(-25568, -30480), createString(-25546, 27), createString(-25583, -13239), createString(-25579, -18974), createString(-25541, -1223), createString(-25565, 19446), createString(-25550, 24989), createString(-25543, -5324), createString(-25589, 820), createString(-25564, -19017), createString(-25557, 15191), createString(-25587, 22202), createString(-25567, 27113), createString(-25600, 489), createString(-25593, 6087), createString(-25556, -3374), createString(-25577, -18918), createString(-25552, -4176), createString(-25592, -348), createString(-25539, -7997));
    }
    
    public static void setString(final String strValue) {
        Initializer_2.strValue = strValue;
    }
    
    public static String getString() {
        return Initializer_2.strValue;
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFF9C25) & 0xFFFF;
        if (Initializer_2.strArr_1[n3] == null) {
            final char[] charArray = Initializer_2.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 77;
                case 1 -> 154;
                case 2 -> 48;
                case 3 -> 113;
                case 4 -> 164;
                case 5 -> 198;
                case 6 -> 71;
                case 7 -> 217;
                case 8 -> 4;
                case 9 -> 129;
                case 10 -> 162;
                case 11 -> 101;
                case 12 -> 188;
                case 13 -> 208;
                case 14 -> 158;
                case 15 -> 25;
                case 16 -> 17;
                case 17 -> 216;
                case 18 -> 126;
                case 19 -> 125;
                case 20 -> 108;
                case 21 -> 23;
                case 22 -> 97;
                case 23 -> 73;
                case 24 -> 189;
                case 25 -> 173;
                case 26 -> 50;
                case 27 -> 241;
                case 28 -> 88;
                case 29 -> 94;
                case 30 -> 106;
                case 31 -> 65;
                case 32 -> 146;
                case 33 -> 166;
                case 34 -> 148;
                case 35 -> 53;
                case 36 -> 55;
                case 37 -> 6;
                case 38 -> 26;
                case 39 -> 70;
                case 40 -> 239;
                case 41 -> 230;
                case 42 -> 136;
                case 43 -> 151;
                case 44 -> 30;
                case 45 -> 5;
                case 46 -> 243;
                case 47 -> 255;
                case 48 -> 251;
                case 49 -> 3;
                case 50 -> 210;
                case 51 -> 214;
                case 52 -> 103;
                case 53 -> 84;
                case 54 -> 105;
                case 55 -> 33;
                case 56 -> 193;
                case 57 -> 7;
                case 58 -> 202;
                case 59 -> 201;
                case 60 -> 150;
                case 61 -> 221;
                case 62 -> 187;
                case 63 -> 185;
                case 64 -> 80;
                case 65 -> 144;
                case 66 -> 165;
                case 67 -> 96;
                case 68 -> 219;
                case 69 -> 212;
                case 70 -> 21;
                case 71 -> 234;
                case 72 -> 143;
                case 73 -> 127;
                case 74 -> 183;
                case 75 -> 177;
                case 76 -> 27;
                case 77 -> 112;
                case 78 -> 69;
                case 79 -> 87;
                case 80 -> 66;
                case 81 -> 61;
                case 82 -> 12;
                case 83 -> 75;
                case 84 -> 253;
                case 85 -> 197;
                case 86 -> 24;
                case 87 -> 74;
                case 88 -> 231;
                case 89 -> 41;
                case 90 -> 155;
                case 91 -> 206;
                case 92 -> 130;
                case 93 -> 191;
                case 94 -> 118;
                case 95 -> 152;
                case 96 -> 240;
                case 97 -> 222;
                case 98 -> 91;
                case 99 -> 160;
                case 100 -> 204;
                case 101 -> 28;
                case 102 -> 141;
                case 103 -> 22;
                case 104 -> 20;
                case 105 -> 79;
                case 106 -> 37;
                case 107 -> 56;
                case 108 -> 170;
                case 109 -> 213;
                case 110 -> 163;
                case 111 -> 16;
                case 112 -> 167;
                case 113 -> 62;
                case 114 -> 38;
                case 115 -> 223;
                case 116 -> 247;
                case 117 -> 249;
                case 118 -> 211;
                case 119 -> 43;
                case 120 -> 140;
                case 121 -> 99;
                case 122 -> 34;
                case 123 -> 120;
                case 124 -> 190;
                case 125 -> 59;
                case 126 -> 42;
                case 127 -> 98;
                case 128 -> 179;
                case 129 -> 157;
                case 130 -> 86;
                case 131 -> 54;
                case 132 -> 227;
                case 133 -> 109;
                case 134 -> 46;
                case 135 -> 224;
                case 136 -> 235;
                case 137 -> 124;
                case 138 -> 44;
                case 139 -> 10;
                case 140 -> 82;
                case 141 -> 250;
                case 142 -> 254;
                case 143 -> 119;
                case 144 -> 93;
                case 145 -> 58;
                case 146 -> 244;
                case 147 -> 63;
                case 148 -> 13;
                case 149 -> 111;
                case 150 -> 220;
                case 151 -> 8;
                case 152 -> 0;
                case 153 -> 36;
                case 154 -> 205;
                case 155 -> 147;
                case 156 -> 107;
                case 157 -> 92;
                case 158 -> 90;
                case 159 -> 156;
                case 160 -> 168;
                case 161 -> 149;
                case 162 -> 47;
                case 163 -> 81;
                case 164 -> 89;
                case 165 -> 245;
                case 166 -> 110;
                case 167 -> 238;
                case 168 -> 134;
                case 169 -> 142;
                case 170 -> 178;
                case 171 -> 115;
                case 172 -> 195;
                case 173 -> 209;
                case 174 -> 153;
                case 175 -> 135;
                case 176 -> 9;
                case 177 -> 139;
                case 178 -> 172;
                case 179 -> 29;
                case 180 -> 184;
                case 181 -> 176;
                case 182 -> 2;
                case 183 -> 1;
                case 184 -> 133;
                case 185 -> 226;
                case 186 -> 194;
                case 187 -> 117;
                case 188 -> 138;
                case 189 -> 161;
                case 190 -> 248;
                case 191 -> 14;
                case 192 -> 83;
                case 193 -> 104;
                case 194 -> 232;
                case 195 -> 51;
                case 196 -> 159;
                case 197 -> 137;
                case 198 -> 180;
                case 199 -> 15;
                case 200 -> 237;
                case 201 -> 175;
                case 202 -> 57;
                case 203 -> 95;
                case 204 -> 76;
                case 205 -> 171;
                case 206 -> 192;
                case 207 -> 207;
                case 208 -> 145;
                case 209 -> 102;
                case 210 -> 196;
                case 211 -> 49;
                case 212 -> 78;
                case 213 -> 215;
                case 214 -> 203;
                case 215 -> 32;
                case 216 -> 218;
                case 217 -> 181;
                case 218 -> 132;
                case 219 -> 225;
                case 220 -> 19;
                case 221 -> 45;
                case 222 -> 122;
                case 223 -> 11;
                case 224 -> 114;
                case 225 -> 116;
                case 226 -> 85;
                case 227 -> 52;
                case 228 -> 229;
                case 229 -> 174;
                case 230 -> 131;
                case 231 -> 242;
                case 232 -> 67;
                case 233 -> 128;
                case 234 -> 68;
                case 235 -> 252;
                case 236 -> 64;
                case 237 -> 200;
                case 238 -> 18;
                case 239 -> 246;
                case 240 -> 182;
                case 241 -> 123;
                case 242 -> 236;
                case 243 -> 100;
                case 244 -> 31;
                case 245 -> 35;
                case 246 -> 72;
                case 247 -> 60;
                case 248 -> 40;
                case 249 -> 186;
                case 250 -> 199;
                case 251 -> 121;
                case 252 -> 169;
                case 253 -> 228;
                case 254 -> 233;
                default -> 39;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < '\0') {
                n6 += '\u0100';
            }
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            if (n7 < '\0') {
                n7 += '\u0100';
            }
            for (int i = 0; i < charArray.length; ++i) {
                final int n8 = i % 2;
                final char[] array = charArray;
                final int n9 = i;
                final char c = array[n9];
                if (n8 == 0) {
                    array[n9] = (char)(c ^ n6);
                    n6 = (((n6 >>> 3 | n6 << 5) ^ charArray[i]) & 0xFF);
                }
                else {
                    array[n9] = (char)(c ^ n7);
                    n7 = (((n7 >>> 3 | n7 << 5) ^ charArray[i]) & 0xFF);
                }
            }
            Initializer_2.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_2.strArr_1[n3];
    }
}
