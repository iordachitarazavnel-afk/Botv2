// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import java.util.function.BiConsumer;
import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;

public abstract class AbstractSyncA<T> extends Initializer
{
    protected String strValue;
    protected T objValue;
    protected T objValue_1;
    protected BiConsumer<T, T> biConsumer;
    private boolean boolFlag;
    private static boolean boolFlag_1;
    
    public AbstractSyncA(final String strValue, final T t) {
        super(strValue);
        this.boolFlag = false;
        this.strValue = strValue;
        this.objValue = t;
        this.objValue_1 = t;
    }
    
    @Override
    public String getString() {
        return this.strValue;
    }
    
    @Override
    public T getValue() {
        return this.objValue;
    }
    
    public T getValue_1() {
        return this.objValue;
    }
    
    @Override
    public void setObject(final Object object_1) {
        try {
            if (this.boolFlag) {
                return;
            }
        }
        catch (final ClassCastException ex) {
            throw computeClasscastexception(ex);
        }
        this.boolFlag = true;
        try {
            this.setObject_1(object_1);
        }
        catch (final ClassCastException ex2) {}
        finally {
            this.boolFlag = false;
        }
    }
    
    public void setObject_1(final T p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.boolFlag:Z
        //     8: iload_2        
        //     9: ifne            57
        //    12: ifeq            53
        //    15: goto            22
        //    18: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.computeClasscastexception:(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
        //    21: athrow         
        //    22: aload_0        
        //    23: iload_2        
        //    24: ifne            54
        //    27: goto            34
        //    30: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.computeClasscastexception:(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
        //    33: athrow         
        //    34: getfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.objValue:Ljava/lang/Object;
        //    37: aload_1        
        //    38: if_acmpne       53
        //    41: goto            48
        //    44: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.computeClasscastexception:(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
        //    47: athrow         
        //    48: return         
        //    49: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.computeClasscastexception:(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
        //    52: athrow         
        //    53: aload_0        
        //    54: getfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.boolFlag:Z
        //    57: istore_3       
        //    58: aload_0        
        //    59: iconst_1       
        //    60: putfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.boolFlag:Z
        //    63: aload_0        
        //    64: getfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.objValue:Ljava/lang/Object;
        //    67: astore          4
        //    69: aload_0        
        //    70: aload_1        
        //    71: putfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.objValue:Ljava/lang/Object;
        //    74: aload_0        
        //    75: iload_2        
        //    76: ifne            112
        //    79: getfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.biConsumer:Ljava/util/function/BiConsumer;
        //    82: ifnull          111
        //    85: goto            92
        //    88: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.computeClasscastexception:(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
        //    91: athrow         
        //    92: aload_0        
        //    93: getfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.biConsumer:Ljava/util/function/BiConsumer;
        //    96: aload           4
        //    98: aload_1        
        //    99: invokeinterface java/util/function/BiConsumer.accept:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   104: goto            111
        //   107: invokestatic    com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.computeClasscastexception:(Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
        //   110: athrow         
        //   111: aload_0        
        //   112: iload_3        
        //   113: putfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.boolFlag:Z
        //   116: goto            129
        //   119: astore          5
        //   121: aload_0        
        //   122: iload_3        
        //   123: putfield        com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.boolFlag:Z
        //   126: aload           5
        //   128: athrow         
        //   129: return         
        //    Signature:
        //  (TT;)V
        //    StackMapTable: 00 11 FF 00 12 00 03 07 00 02 07 00 3A 01 00 01 07 00 2A 03 47 07 00 2A 43 07 00 02 49 07 00 2A 03 40 07 00 2A 03 40 07 00 02 42 01 FF 00 1E 00 05 07 00 02 07 00 3A 01 01 07 00 3A 00 01 07 00 2A 03 4E 07 00 2A 03 40 07 00 02 FF 00 06 00 04 07 00 02 07 00 3A 01 01 00 01 07 00 33 09
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  79     104    107    111    Ljava/lang/ClassCastException;
        //  69     85     88     92     Ljava/lang/ClassCastException;
        //  34     49     49     53     Ljava/lang/ClassCastException;
        //  22     41     44     48     Ljava/lang/ClassCastException;
        //  12     27     30     34     Ljava/lang/ClassCastException;
        //  4      15     18     22     Ljava/lang/ClassCastException;
        //  63     111    119    129    Any
        //  119    121    119    129    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setBiconsumer(final BiConsumer<T, T> biConsumer) {
        this.biConsumer = biConsumer;
    }
    
    public T getValue_2() {
        return this.objValue_1;
    }
    
    public void execute() {
        this.setObject(this.objValue_1);
    }
    
    public static void setBool(final boolean boolFlag_1) {
        AbstractSyncA.boolFlag_1 = boolFlag_1;
    }
    
    public static boolean isEnabled() {
        return AbstractSyncA.boolFlag_1;
    }
    
    public static boolean isEnabled_1() {
        return !isEnabled();
    }
    
    private static ClassCastException computeClasscastexception(final ClassCastException ex) {
        return ex;
    }
    
    static {
        if (isEnabled_1()) {
            setBool(true);
        }
    }
}
