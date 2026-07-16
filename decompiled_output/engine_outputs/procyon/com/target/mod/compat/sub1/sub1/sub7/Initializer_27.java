// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.util.concurrent.atomic.AtomicLong;

public class Initializer_27
{
    private static final AtomicLong atomicLong;
    private static long longValue;
    
    public static long getLong() {
        return Initializer_27.atomicLong.get();
    }
    
    public static void execute() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - Initializer_27.longValue < 1000L) {
            return;
        }
        Initializer_27.longValue = currentTimeMillis;
        new Thread(Initializer_27::lambda$updatePingAsync$0).start();
    }
    
    private static void lambda$updatePingAsync$0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    net/minecraft/class_310.method_1551:()Lnet/minecraft/class_310;
        //     6: astore_1       
        //     7: istore_0       
        //     8: iload_0        
        //     9: ifne            64
        //    12: aload_1        
        //    13: ifnull          48
        //    16: goto            23
        //    19: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_27.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    22: athrow         
        //    23: aload_1        
        //    24: invokevirtual   net/minecraft/class_310.method_1558:()Lnet/minecraft/class_642;
        //    27: iload_0        
        //    28: ifne            69
        //    31: goto            38
        //    34: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_27.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    37: athrow         
        //    38: ifnonnull       65
        //    41: goto            48
        //    44: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_27.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    47: athrow         
        //    48: getstatic       com/target/mod/compat/sub1/sub1/sub7/Initializer_27.atomicLong:Ljava/util/concurrent/atomic/AtomicLong;
        //    51: ldc2_w          -1
        //    54: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //    57: goto            64
        //    60: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_27.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    63: athrow         
        //    64: return         
        //    65: aload_1        
        //    66: invokevirtual   net/minecraft/class_310.method_1558:()Lnet/minecraft/class_642;
        //    69: astore_2       
        //    70: aload_2        
        //    71: getfield        net/minecraft/class_642.field_3761:Ljava/lang/String;
        //    74: astore_3       
        //    75: aload_3        
        //    76: ldc             ":"
        //    78: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    81: astore          4
        //    83: aload           4
        //    85: iconst_0       
        //    86: aaload         
        //    87: astore          5
        //    89: aload           4
        //    91: arraylength    
        //    92: iload_0        
        //    93: ifne            121
        //    96: iconst_1       
        //    97: if_icmple       124
        //   100: goto            107
        //   103: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_27.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   106: athrow         
        //   107: aload           4
        //   109: iconst_1       
        //   110: aaload         
        //   111: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   114: goto            121
        //   117: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_27.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   120: athrow         
        //   121: goto            127
        //   124: sipush          25565
        //   127: istore          6
        //   129: new             Ljava/net/Socket;
        //   132: dup            
        //   133: invokespecial   java/net/Socket.<init>:()V
        //   136: astore          7
        //   138: invokestatic    java/lang/System.nanoTime:()J
        //   141: lstore          8
        //   143: aload           7
        //   145: new             Ljava/net/InetSocketAddress;
        //   148: dup            
        //   149: aload           5
        //   151: iload           6
        //   153: invokespecial   java/net/InetSocketAddress.<init>:(Ljava/lang/String;I)V
        //   156: sipush          1000
        //   159: invokevirtual   java/net/Socket.connect:(Ljava/net/SocketAddress;I)V
        //   162: invokestatic    java/lang/System.nanoTime:()J
        //   165: lstore          10
        //   167: getstatic       com/target/mod/compat/sub1/sub1/sub7/Initializer_27.atomicLong:Ljava/util/concurrent/atomic/AtomicLong;
        //   170: lload           10
        //   172: lload           8
        //   174: lsub           
        //   175: ldc2_w          1000000
        //   178: ldiv           
        //   179: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   182: aload           7
        //   184: invokevirtual   java/net/Socket.close:()V
        //   187: goto            212
        //   190: astore          8
        //   192: aload           7
        //   194: invokevirtual   java/net/Socket.close:()V
        //   197: goto            209
        //   200: astore          9
        //   202: aload           8
        //   204: aload           9
        //   206: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   209: aload           8
        //   211: athrow         
        //   212: goto            226
        //   215: astore          7
        //   217: getstatic       com/target/mod/compat/sub1/sub1/sub7/Initializer_27.atomicLong:Ljava/util/concurrent/atomic/AtomicLong;
        //   220: ldc2_w          -1
        //   223: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   226: return         
        //    StackMapTable: 00 16 FF 00 13 00 02 01 07 00 44 00 01 07 00 3A 03 4A 07 00 3A 43 07 00 52 45 07 00 3A 03 4B 07 00 3A 03 00 43 07 00 52 FF 00 21 00 06 01 07 00 44 07 00 52 07 00 60 07 00 66 07 00 60 00 01 07 00 3A 03 49 07 00 3A 43 01 02 42 01 FF 00 3E 00 08 01 07 00 44 07 00 52 07 00 60 07 00 66 07 00 60 01 07 00 6E 00 01 07 00 3A FF 00 09 00 09 01 07 00 44 07 00 52 07 00 60 07 00 66 07 00 60 01 07 00 6E 07 00 3A 00 01 07 00 3A 08 FF 00 02 00 0A 01 07 00 44 07 00 52 07 00 60 07 00 66 07 00 60 01 07 00 6E 04 04 00 00 FF 00 02 00 07 01 07 00 44 07 00 52 07 00 60 07 00 66 07 00 60 01 00 01 07 00 3C FC 00 0A 07 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  96     114    117    121    Ljava/lang/Throwable;
        //  89     100    103    107    Ljava/lang/Throwable;
        //  38     57     60     64     Ljava/lang/Throwable;
        //  23     41     44     48     Ljava/lang/Throwable;
        //  12     31     34     38     Ljava/lang/Throwable;
        //  8      16     19     23     Ljava/lang/Throwable;
        //  138    182    190    212    Ljava/lang/Throwable;
        //  192    197    200    209    Ljava/lang/Throwable;
        //  129    212    215    226    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
    
    static {
        atomicLong = new AtomicLong(-1L);
        Initializer_27.longValue = 0L;
    }
    
    private static Throwable computeThrowable(final Throwable t) {
        return t;
    }
}
