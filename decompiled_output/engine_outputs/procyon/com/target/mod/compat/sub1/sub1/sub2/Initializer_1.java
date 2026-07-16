// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.Objects;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;

public final class Initializer_1
{
    private final HashMap<Class<? extends PackDImpl>, ArrayList<RecordSub<? extends PackDImpl>>> hashMap;
    
    public Initializer_1() {
        this.hashMap = new HashMap<Class<? extends PackDImpl>, ArrayList<RecordSub<? extends PackDImpl>>>();
    }
    
    public static <L extends PackDImpl, E extends Initializer<L>> void setBuildb(final E buildb_1) {
        final Initializer_1 initd = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getInitd();
        if (initd != null) {
            initd.setBuildb_1((Initializer)buildb_1);
        }
    }
    
    private <L extends PackDImpl, E extends Initializer<L>> void setBuildb_1(final E e) {
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncaarrArray = Initializer.getSyncaarrArray();
        final Class<? extends Initializer> class1 = e.getClass();
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] array = syncaarrArray;
        final ArrayList c = this.hashMap.get(class1);
        ArrayList list2;
        final ArrayList list = list2 = c;
        if (array == null) {
            if (list == null) {
                return;
            }
            final ArrayList list3;
            list2 = (list3 = c);
        }
        if (array == null) {
            if (list.isEmpty()) {
                return;
            }
            list2 = new ArrayList(c);
        }
        final ArrayList list4 = list2;
        list4.removeIf(Objects::isNull);
        list4.sort(Comparator.comparing((Function<? super E, ? extends Comparable>)Initializer_1::lambda$fireImpl$0));
        final ArrayList arraylist = new ArrayList();
        list4.forEach(Initializer_1::lambda$fireImpl$1);
        e.setArraylist(arraylist);
    }
    
    public <L extends PackDImpl> void setClassAndBlocke(final Class<L> clazz, final L l) {
        this.processAll(clazz, l, 0);
    }
    
    public <L extends PackDImpl> void processAll(final Class<L> clazz, final L l, final int n) {
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncaarrArray = Initializer.getSyncaarrArray();
        ArrayList list = this.hashMap.get(clazz);
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] array = syncaarrArray;
        final ArrayList list2 = list;
        if (array == null && list2 == null) {
            list = new ArrayList();
            this.hashMap.put(clazz, list);
            goto Label_0051;
        }
        list2.add(new RecordSub(l, n));
        if (array != null) {
            int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
        }
    }
    
    public <L extends PackDImpl> void setClassAndBlocke_1(final Class<L> key, final L l) {
        final ArrayList list = this.hashMap.get(key);
        if (list != null) {
            list.removeIf(Initializer_1::lambda$remove$2);
        }
    }
    
    private static boolean lambda$remove$2(final PackDImpl obj, final RecordSub recordSub) {
        return recordSub.getBlocke().equals(obj);
    }
    
    private static void lambda$fireImpl$1(final ArrayList list, final RecordSub recordSub) {
        list.add(recordSub.getBlocke());
    }
    
    private static Integer lambda$fireImpl$0(final RecordSub recordSub) {
        return Integer.MAX_VALUE - recordSub.getInt();
    }
}
