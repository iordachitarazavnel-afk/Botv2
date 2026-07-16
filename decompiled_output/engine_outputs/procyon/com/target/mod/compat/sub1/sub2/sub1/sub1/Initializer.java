// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub1.sub1;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.Comparator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.Iterator;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import java.util.concurrent.CopyOnWriteArrayList;
import com.target.mod.compat.sub1.sub2.sub3.Initializer_1;
import java.util.HashMap;

public final class Initializer
{
    private final HashMap<Class<? extends Initializer_1>, CopyOnWriteArrayList<RecordSub<? extends Initializer_1>>> hashMap;
    private static String[] strArr;
    
    public Initializer() {
        this.hashMap = new HashMap<Class<? extends Initializer_1>, CopyOnWriteArrayList<RecordSub<? extends Initializer_1>>>();
    }
    
    public static <L extends Initializer_1, E extends com.target.mod.compat.sub1.sub2.sub3.Initializer<L>> void setBindc(final E bindc_1) {
        final Initializer rendera = ClientModInitializerImpl.sortB.getRendera();
        if (rendera != null) {
            rendera.setBindc_1((com.target.mod.compat.sub1.sub2.sub3.Initializer)bindc_1);
        }
    }
    
    private <L extends Initializer_1, E extends com.target.mod.compat.sub1.sub2.sub3.Initializer<L>> void setBindc_1(final E e) {
        final Class<? extends com.target.mod.compat.sub1.sub2.sub3.Initializer> class1 = e.getClass();
        final String[] stringarrArray = getStringarrArray();
        final CopyOnWriteArrayList list = this.hashMap.get(class1);
        final String[] array = stringarrArray;
        final CopyOnWriteArrayList list2 = list;
        if (array == null || list2 != null) {
            final Iterator iterator = list2.iterator();
            while (iterator.hasNext()) {
                e.setPackd((L)((RecordSub)iterator.next()).packD);
                if (array == null) {
                    break;
                }
            }
        }
    }
    
    public <L extends Initializer_1> void setClassAndPackd(final Class<L> clazz, final L l) {
        this.processAll(clazz, l, 0);
    }
    
    public <L extends Initializer_1> void processAll(final Class<L> clazz, final L l, final int n) {
        this.hashMap.computeIfAbsent(clazz, Initializer::lambda$add$0).add((Object)new RecordSub(l, n));
        final String[] stringarrArray = getStringarrArray();
        final List c = this.hashMap.get(clazz);
        final ArrayList list = new ArrayList(c);
        list.sort(Comparator.comparingInt((ToIntFunction<? super E>)Initializer::lambda$add$1));
        c.clear();
        final String[] array = stringarrArray;
        c.addAll(list);
        if (array == null) {
            int int_1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt_1();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int_1);
        }
    }
    
    public <L extends Initializer_1> void setClassAndPackd_1(final Class<L> key, final L l) {
        final String[] stringarrArray = getStringarrArray();
        final CopyOnWriteArrayList list = this.hashMap.get(key);
        final String[] array = stringarrArray;
        final CopyOnWriteArrayList list2 = list;
        if (array == null || list2 != null) {
            list2.removeIf(Initializer::lambda$remove$2);
        }
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt() == 0) {
            setStringarr(new String[5]);
        }
    }
    
    private static boolean lambda$remove$2(final Initializer_1 b, final RecordSub recordSub) {
        return Objects.equals(recordSub.packD, b);
    }
    
    private static int lambda$add$1(final RecordSub recordSub) {
        return recordSub.intValue;
    }
    
    private static CopyOnWriteArrayList lambda$add$0(final Class clazz) {
        return new CopyOnWriteArrayList();
    }
    
    public static void setStringarr(final String[] strArr) {
        Initializer.strArr = strArr;
    }
    
    public static String[] getStringarrArray() {
        return Initializer.strArr;
    }
    
    static {
        if (getStringarrArray() == null) {
            setStringarr(new String[4]);
        }
    }
}
