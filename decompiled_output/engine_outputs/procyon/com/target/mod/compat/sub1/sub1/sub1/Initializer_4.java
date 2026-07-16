// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub1;

import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Objects;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub_1;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import java.util.concurrent.CopyOnWriteArrayList;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;
import java.util.List;

public class Initializer_4
{
    private final List<AbstractLoadF> list;
    private static int intValue;
    
    public Initializer_4() {
        this.list = new CopyOnWriteArrayList<AbstractLoadF>();
    }
    
    public void setCalcg(final AbstractLoadF abstractLoadF) {
        try {
            if (abstractLoadF == null) {
                return;
            }
        }
        catch (final Exception ex) {
            throw computeException(ex);
        }
        this.list.add(abstractLoadF);
        try {
            if (ClientModInitializerImpl.sortB != null) {
                try {
                    if (ClientModInitializerImpl.sortB.getEventd() != null) {
                        ClientModInitializerImpl.sortB.getEventd().getList().add(abstractLoadF);
                    }
                }
                catch (final Exception ex2) {
                    throw computeException(ex2);
                }
            }
        }
        catch (final Exception ex3) {}
    }
    
    public void execute() {
        final int[] intarrArray = Initializer_1.getIntarrArray();
        final Iterator<AbstractLoadF> iterator = this.list.iterator();
        final int[] array = intarrArray;
        Label_0107: {
            while (iterator.hasNext()) {
                final AbstractLoadF abstractLoadF = iterator.next();
                try {
                    Label_0088: {
                        AbstractLoadF abstractLoadF4 = null;
                        Label_0077: {
                            AbstractLoadF abstractLoadF2 = null;
                            Label_0060: {
                                Label_0049: {
                                    try {
                                        if (array == null) {
                                            break Label_0107;
                                        }
                                        final AbstractLoadF abstractLoadF3;
                                        abstractLoadF2 = (abstractLoadF3 = (abstractLoadF4 = abstractLoadF));
                                        final int[] array2 = array;
                                        if (array2 != null) {
                                            break Label_0049;
                                        }
                                        break Label_0060;
                                    }
                                    catch (final Exception ex) {
                                        throw computeException(ex);
                                    }
                                    try {
                                        final AbstractLoadF abstractLoadF3;
                                        abstractLoadF2 = (abstractLoadF3 = (abstractLoadF4 = abstractLoadF));
                                        final int[] array2 = array;
                                        if (array2 == null) {
                                            break Label_0060;
                                        }
                                        if (abstractLoadF3 == null) {
                                            break Label_0088;
                                        }
                                    }
                                    catch (final Exception ex2) {
                                        throw computeException(ex2);
                                    }
                                }
                                abstractLoadF4 = (abstractLoadF2 = abstractLoadF);
                                try {
                                    if (array == null) {
                                        break Label_0077;
                                    }
                                    final boolean b = abstractLoadF2.isEnabled();
                                    if (b) {
                                        break Label_0077;
                                    }
                                    break Label_0088;
                                }
                                catch (final Exception ex3) {
                                    throw computeException(ex3);
                                }
                            }
                            try {
                                final boolean b = abstractLoadF2.isEnabled();
                                if (!b) {
                                    break Label_0088;
                                }
                                abstractLoadF4 = abstractLoadF;
                            }
                            catch (final Exception ex4) {
                                throw computeException(ex4);
                            }
                        }
                        abstractLoadF4.execute_2();
                    }
                }
                catch (final Exception ex5) {}
                if (array == null) {
                    break;
                }
            }
            try {
                com.target.mod.compat.sub1.sub1.sub2.Initializer_1.setBuildb(new BuildBSub_1());
            }
            catch (final Exception ex6) {}
        }
    }
    
    public List<AbstractLoadF> getList() {
        return new ArrayList<AbstractLoadF>(this.list);
    }
    
    public List<AbstractLoadF> computeList(final Initializer initializer) {
        return this.list.stream().filter(Initializer_4::lambda$getModulesByCategory$0).toList();
    }
    
    public AbstractLoadF computeCalcg(final String s) {
        return this.list.stream().filter(Initializer_4::lambda$getModule$1).findFirst().orElse(null);
    }
    
    public <T extends AbstractLoadF> T computeCalcg_1(final Class<T> clazz) {
        final Stream<Object> stream = this.list.stream();
        Objects.requireNonNull(clazz);
        final Stream<Object> filter = stream.filter(clazz::isInstance);
        Objects.requireNonNull(clazz);
        return filter.map((Function<? super Object, ?>)clazz::cast).findFirst().orElse(null);
    }
    
    private static boolean lambda$getModule$1(final String anotherString, final AbstractLoadF abstractLoadF) {
        return abstractLoadF.getString().equalsIgnoreCase(anotherString);
    }
    
    private static boolean lambda$getModulesByCategory$0(final Initializer initializer, final AbstractLoadF abstractLoadF) {
        return abstractLoadF.getStepf() == initializer;
    }
    
    public static void setInt(final int intValue) {
        Initializer_4.intValue = intValue;
    }
    
    public static int getInt() {
        return Initializer_4.intValue;
    }
    
    public static int getInt_1() {
        if (getInt() == 0) {
            return 6;
        }
        return 0;
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        if (getInt_1() != 0) {
            setInt(75);
        }
    }
}
