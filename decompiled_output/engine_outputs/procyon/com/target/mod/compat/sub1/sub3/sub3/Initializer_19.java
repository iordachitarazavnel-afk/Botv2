// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub3.sub3;

import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.class_1309;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({ class_922.class })
public class Initializer_19
{
    @Inject(method = { "method_4055(Lnet/minecraft/class_1309;D)Z" }, at = { @At("HEAD") }, cancellable = true)
    private void onHasLabel(final class_1309 p0, final double p1, final CallbackInfoReturnable<Boolean> p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lnet/minecraft/class_1657;
        //     4: ifeq            180
        //     7: invokestatic    net/minecraft/class_310.method_1551:()Lnet/minecraft/class_310;
        //    10: astore          5
        //    12: aload           5
        //    14: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //    17: ifnull          90
        //    20: aload_1        
        //    21: aload           5
        //    23: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //    26: if_acmpne       90
        //    29: goto            36
        //    32: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Initializer_19.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    35: athrow         
        //    36: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub5/CalcGSub.getCoreb:()Lcom/target/mod/compat/sub1/sub1/sub5/sub5/CalcGSub;
        //    39: astore          6
        //    41: aload           6
        //    43: ifnull          90
        //    46: aload           6
        //    48: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub5/CalcGSub.isEnabled:()Z
        //    51: ifeq            90
        //    54: goto            61
        //    57: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Initializer_19.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    60: athrow         
        //    61: aload           6
        //    63: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub5/CalcGSub.isEnabled_2:()Z
        //    66: ifeq            90
        //    69: goto            76
        //    72: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Initializer_19.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    75: athrow         
        //    76: aload           4
        //    78: iconst_0       
        //    79: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    82: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //    85: return         
        //    86: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Initializer_19.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    89: athrow         
        //    90: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //    93: ifnull          175
        //    96: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //    99: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //   102: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.getList:()Ljava/util/List;
        //   105: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   110: astore          6
        //   112: aload           6
        //   114: invokeinterface java/util/Iterator.hasNext:()Z
        //   119: ifeq            175
        //   122: aload           6
        //   124: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   129: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   132: astore          7
        //   134: ldc             "nametags"
        //   136: aload           7
        //   138: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString:()Ljava/lang/String;
        //   141: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   144: ifeq            172
        //   147: aload           7
        //   149: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.isEnabled:()Z
        //   152: ifeq            172
        //   155: goto            162
        //   158: invokestatic    com/target/mod/compat/sub1/sub3/sub3/Initializer_19.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   161: athrow         
        //   162: aload           4
        //   164: iconst_0       
        //   165: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   168: invokevirtual   org/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable.setReturnValue:(Ljava/lang/Object;)V
        //   171: return         
        //   172: goto            112
        //   175: goto            180
        //   178: astore          6
        //   180: return         
        //    Signature:
        //  (Lnet/minecraft/class_1309;DLorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable<Ljava/lang/Boolean;>;)V
        //    StackMapTable: 00 0F FF 00 20 00 05 07 00 02 07 00 27 03 07 00 29 07 00 1D 00 01 07 00 19 03 FF 00 14 00 06 07 00 02 07 00 27 03 07 00 29 07 00 1D 07 00 2F 00 01 07 00 19 03 4A 07 00 19 03 49 07 00 19 FA 00 03 FC 00 15 07 00 5C FF 00 2D 00 07 07 00 02 07 00 27 03 07 00 29 07 00 1D 07 00 5C 07 00 65 00 01 07 00 19 03 09 F9 00 02 42 07 00 19 FA 00 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  134    155    158    162    Ljava/lang/Exception;
        //  61     86     86     90     Ljava/lang/Exception;
        //  46     69     72     76     Ljava/lang/Exception;
        //  41     54     57     61     Ljava/lang/Exception;
        //  12     29     32     36     Ljava/lang/Exception;
        //  90     171    178    180    Ljava/lang/Exception;
        //  172    175    178    180    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
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
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
