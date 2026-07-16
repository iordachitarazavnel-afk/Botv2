// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub2;

import java.util.Iterator;
import net.minecraft.class_7923;
import net.minecraft.class_1542;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_8;
import net.minecraft.class_1799;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_9;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_13;
import net.minecraft.class_1792;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import net.minecraft.class_2246;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_2382;
import net.minecraft.class_3965;
import net.minecraft.class_243;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_10;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_1;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_2;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public final class CacheXImpl_1 extends AbstractLoadF implements BlockEImpl_2, BlockEImpl_1
{
    private final RenderASub_7 gridH;
    private final RenderASub bindK;
    private final RenderASub bindK_1;
    private final RenderASub bindK_2;
    private final RenderASub bindK_3;
    private final RenderASub_1 buffC;
    private final RenderASub_1 buffC_1;
    private final RenderASub bindK_4;
    private final RenderASub_1 buffC_2;
    private final RenderASub bindK_5;
    private long longValue;
    private int intValue;
    private volatile boolean boolFlag;
    private volatile class_2338 class2338;
    private volatile class_2338 class2338_1;
    private volatile float floatValue;
    private volatile float floatValue_1;
    private volatile float floatValue_2;
    private volatile float floatValue_3;
    private volatile boolean boolFlag_1;
    private volatile boolean boolFlag_2;
    private volatile long longValue_1;
    private volatile long longValue_2;
    private float floatValue_4;
    private float floatValue_5;
    private volatile float floatValue_6;
    private volatile float floatValue_7;
    private volatile Runnable runnable;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CacheXImpl_1() {
        super(createString(19199, 19563), createString(19195, 3886), Initializer.COMBAT);
        this.gridH = new RenderASub_7(createString(19189, 7399), 71);
        this.bindK = new RenderASub(createString(19197, 31493), 100.0, 0.0, 500.0, 25.0);
        this.bindK_1 = new RenderASub(createString(19192, 22367), 2.0, 0.0, 20.0, 1.0);
        this.bindK_2 = new RenderASub(createString(19186, -11666), 9.0, 1.0, 9.0, 1.0);
        this.bindK_3 = new RenderASub(createString(19188, -28101), 4.5, 3.0, 6.0, 0.1);
        this.buffC = new RenderASub_1(createString(19194, 28562), false);
        this.buffC_1 = new RenderASub_1(createString(19191, 6379), true);
        this.bindK_4 = new RenderASub(createString(19190, 21689), 180.0, 30.0, 360.0, 10.0);
        this.buffC_2 = new RenderASub_1(createString(19183, -31946), true);
        this.bindK_5 = new RenderASub(createString(19184, -32353), 3.0, 1.0, 5.0, 0.5);
        this.longValue = 0L;
        this.intValue = 0;
        this.boolFlag = false;
        this.class2338 = null;
        this.class2338_1 = null;
        this.floatValue = 0.0f;
        this.floatValue_1 = 0.0f;
        this.floatValue_2 = 0.0f;
        this.floatValue_3 = 0.0f;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.longValue_1 = 0L;
        this.longValue_2 = 0L;
        this.floatValue_4 = 0.0f;
        this.floatValue_5 = 0.0f;
        this.floatValue_6 = 0.0f;
        this.floatValue_7 = 0.0f;
        this.runnable = null;
        this.setRenderaarr(this.gridH, this.bindK, this.bindK_1, this.bindK_2, this.bindK_3, this.buffC, this.buffC_1, this.bindK_4, this.buffC_2, this.bindK_5);
    }
    
    @Override
    public void execute() {
        super.execute();
        final com.target.mod.compat.sub1.sub1.sub2.Initializer_1 initd = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getInitd();
        if (initd != null) {
            initd.setClassAndBlocke(BlockEImpl_2.class, this);
            initd.setClassAndBlocke(BlockEImpl_1.class, this);
        }
        this.longValue_1 = System.nanoTime();
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        final com.target.mod.compat.sub1.sub1.sub2.Initializer_1 initd = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getInitd();
        if (initd != null) {
            initd.setClassAndBlocke_1(BlockEImpl_2.class, this);
            initd.setClassAndBlocke_1(BlockEImpl_1.class, this);
        }
        this.execute_4();
    }
    
    @Override
    public void setCorej(final BuildBSub buildBSub) {
        try {
            this.longValue_2 = System.nanoTime();
            this.execute_2();
        }
        catch (final Exception ex) {}
    }
    
    private void execute_2() {
        final boolean enabled_1 = SyncASub_5.isEnabled_1();
        if (CacheXImpl_1.class310.field_1724 != null) {
            final boolean boolFlag = this.boolFlag;
            if (!enabled_1) {
                if (!boolFlag) {
                    return;
                }
                this.buffC_1.getValue().booleanValue();
            }
            if (boolFlag) {
                final long nanoTime = System.nanoTime();
                final float a = (nanoTime - this.longValue_1) / 1.0E9f;
                this.longValue_1 = nanoTime;
                final float min = Math.min(a, 0.05f);
                final boolean boolFlag_1 = this.boolFlag_1;
                Object value = null;
                Label_0100: {
                    if (!enabled_1) {
                        if (!boolFlag_1) {
                            return;
                        }
                        value = this;
                        if (enabled_1) {
                            break Label_0100;
                        }
                        final boolean boolFlag_2 = this.boolFlag_2;
                    }
                    if (boolFlag_1) {
                        return;
                    }
                    value = ((AbstractSyncA<Object>)this.bindK_4).getValue();
                }
                float n = ((Double)value).floatValue();
                final long longValue = this.bindK.getValue().longValue();
                if (longValue < 150L) {
                    n = Math.min(n * (1.0f + (150.0f - longValue) / 50.0f), 2000.0f);
                }
                float n2 = Math.max(0.05f, Math.min(1.0f - (float)Math.pow(1.0f - n / 1200.0f, min * 60.0f), 1.0f));
                CacheXImpl_1 cacheXImpl_1 = this;
                if (!enabled_1) {
                    if (this.buffC_2.getValue()) {
                        n2 = Math.max(n2 * (float)Math.pow(1.0f - this.floatValue_6, 1.0f / this.bindK_5.getValue().floatValue()), 0.02f);
                    }
                    cacheXImpl_1 = this;
                }
                final float method_float = Initializer_10.method_float(cacheXImpl_1.floatValue_2 - this.floatValue);
                final float n3 = this.floatValue_3 - this.floatValue_1;
                this.floatValue = Initializer_10.method_float(this.floatValue + method_float * n2);
                this.floatValue_1 += n3 * n2;
                this.floatValue_1 = Math.max(-90.0f, Math.min(90.0f, this.floatValue_1));
                final float n4 = (float)Math.sqrt(method_float * method_float + n3 * n3);
                final float n5 = fcmpl(this.floatValue_7, 0.0f);
                Label_0464: {
                    Label_0438: {
                        CacheXImpl_1 cacheXImpl_2 = null;
                        Label_0424: {
                            if (!enabled_1) {
                                if (n5 > 0) {
                                    this.floatValue_6 = 1.0f - n4 / this.floatValue_7;
                                    this.floatValue_6 = Math.max(0.0f, Math.min(1.0f, this.floatValue_6));
                                }
                                cacheXImpl_2 = this;
                                if (enabled_1) {
                                    break Label_0424;
                                }
                                this.buffC.getValue().booleanValue();
                            }
                            if (n5 == 0) {
                                break Label_0438;
                            }
                            cacheXImpl_2 = this;
                        }
                        Initializer_10.setFloatAndFloat(cacheXImpl_2.floatValue, this.floatValue_1);
                        if (!enabled_1) {
                            break Label_0464;
                        }
                    }
                    CacheXImpl_1.class310.field_1724.method_36456(this.floatValue);
                    CacheXImpl_1.class310.field_1724.method_36457(this.floatValue_1);
                }
                final float abs = Math.abs(Initializer_10.method_float(this.floatValue_2 - this.floatValue));
                final float abs2 = Math.abs(this.floatValue_3 - this.floatValue_1);
                float booleanValue;
                final float n6 = booleanValue = fcmpg(abs, 0.5f);
                if (!enabled_1) {
                    if (n6 >= 0) {
                        return;
                    }
                    final int n7;
                    booleanValue = (n7 = fcmpg(abs2, 0.5f));
                }
                Label_0603: {
                    Label_0590: {
                        if (!enabled_1) {
                            if (n6 >= 0) {
                                return;
                            }
                            this.boolFlag_2 = true;
                            this.floatValue = this.floatValue_2;
                            this.floatValue_1 = this.floatValue_3;
                            if (enabled_1) {
                                break Label_0590;
                            }
                            booleanValue = (((boolean)this.buffC.getValue()) ? 1 : 0);
                        }
                        if (booleanValue != 0) {
                            Initializer_10.setFloatAndFloat(this.floatValue, this.floatValue_1);
                            if (!enabled_1) {
                                break Label_0603;
                            }
                        }
                        CacheXImpl_1.class310.field_1724.method_36456(this.floatValue);
                    }
                    CacheXImpl_1.class310.field_1724.method_36457(this.floatValue_1);
                }
                final Runnable runnable = this.runnable;
                if (!enabled_1) {
                    if (runnable == null) {
                        return;
                    }
                    final Runnable runnable2 = this.runnable;
                }
                runnable.run();
                this.runnable = null;
            }
        }
    }
    
    private float method_float(final float n, final float n2) {
        return 1.0f - (float)Math.pow(1.0f - n, n2);
    }
    
    public void execute_3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //     6: ifnonnull       57
        //     9: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class310:Lnet/minecraft/class_310;
        //    12: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //    15: ifnull          57
        //    18: goto            25
        //    21: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    24: athrow         
        //    25: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class310:Lnet/minecraft/class_310;
        //    28: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    31: ifnull          57
        //    34: goto            41
        //    37: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    40: athrow         
        //    41: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class310:Lnet/minecraft/class_310;
        //    44: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //    47: ifnonnull       58
        //    50: goto            57
        //    53: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    56: athrow         
        //    57: return         
        //    58: invokestatic    java/lang/System.nanoTime:()J
        //    61: lstore_1       
        //    62: aload_0        
        //    63: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.boolFlag:Z
        //    66: ifeq            151
        //    69: aload_0        
        //    70: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //    73: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //    76: checkcast       Ljava/lang/Boolean;
        //    79: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    82: ifeq            151
        //    85: goto            92
        //    88: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    91: athrow         
        //    92: aload_0        
        //    93: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.boolFlag_1:Z
        //    96: ifeq            151
        //    99: goto            106
        //   102: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   105: athrow         
        //   106: aload_0        
        //   107: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.boolFlag_2:Z
        //   110: ifne            151
        //   113: goto            120
        //   116: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   119: athrow         
        //   120: lload_1        
        //   121: aload_0        
        //   122: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.longValue_2:J
        //   125: lsub           
        //   126: ldc2_w          100000000
        //   129: lcmp           
        //   130: ifle            151
        //   133: goto            140
        //   136: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   139: athrow         
        //   140: aload_0        
        //   141: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.execute_2:()V
        //   144: goto            151
        //   147: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   150: athrow         
        //   151: aload_0        
        //   152: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.isEnabled_1:()Z
        //   155: ifne            184
        //   158: aload_0        
        //   159: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.boolFlag:Z
        //   162: ifeq            183
        //   165: goto            172
        //   168: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   171: athrow         
        //   172: aload_0        
        //   173: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.execute_4:()V
        //   176: goto            183
        //   179: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   182: athrow         
        //   183: return         
        //   184: aload_0        
        //   185: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.boolFlag:Z
        //   188: ifne            199
        //   191: aload_0        
        //   192: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.isEnabled_2:()Z
        //   195: ifne            199
        //   198: return         
        //   199: aload_0        
        //   200: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.bindK:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   203: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.getValue:()Ljava/lang/Object;
        //   206: checkcast       Ljava/lang/Double;
        //   209: invokevirtual   java/lang/Double.longValue:()J
        //   212: lstore_3       
        //   213: aload_0        
        //   214: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.boolFlag_1:Z
        //   217: ifeq            273
        //   220: aload_0        
        //   221: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.boolFlag_2:Z
        //   224: ifne            273
        //   227: goto            234
        //   230: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   233: athrow         
        //   234: aload_0        
        //   235: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   238: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //   241: checkcast       Ljava/lang/Boolean;
        //   244: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   247: ifeq            273
        //   250: goto            257
        //   253: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   256: athrow         
        //   257: lload_3        
        //   258: ldc2_w          50
        //   261: lcmp           
        //   262: ifle            273
        //   265: goto            272
        //   268: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   271: athrow         
        //   272: return         
        //   273: invokestatic    java/lang/System.currentTimeMillis:()J
        //   276: lstore          5
        //   278: lload           5
        //   280: aload_0        
        //   281: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.longValue:J
        //   284: lsub           
        //   285: lload_3        
        //   286: lcmp           
        //   287: ifge            291
        //   290: return         
        //   291: aload_0        
        //   292: lload           5
        //   294: putfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.longValue:J
        //   297: aload_0        
        //   298: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   301: tableswitch {
        //                0: 344
        //                1: 376
        //                2: 408
        //                3: 437
        //                4: 525
        //                5: 560
        //                6: 606
        //          default: 610
        //        }
        //   344: aload_0        
        //   345: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.isEnabled:()Z
        //   348: ifne            363
        //   351: goto            358
        //   354: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   357: athrow         
        //   358: aload_0        
        //   359: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.execute_4:()V
        //   362: return         
        //   363: aload_0        
        //   364: dup            
        //   365: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   368: iconst_1       
        //   369: iadd           
        //   370: putfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   373: goto            610
        //   376: aload_0        
        //   377: aload_0        
        //   378: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class2338:Lnet/minecraft/class_2338;
        //   381: getstatic       net/minecraft/class_1802.field_23141:Lnet/minecraft/class_1792;
        //   384: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.checkCondition:(Lnet/minecraft/class_2338;Lnet/minecraft/class_1792;)Z
        //   387: ifne            395
        //   390: aload_0        
        //   391: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.execute_4:()V
        //   394: return         
        //   395: aload_0        
        //   396: dup            
        //   397: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   400: iconst_1       
        //   401: iadd           
        //   402: putfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   405: goto            610
        //   408: aload_0        
        //   409: aload_0        
        //   410: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class2338:Lnet/minecraft/class_2338;
        //   413: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.checkClass_2338_2:(Lnet/minecraft/class_2338;)Z
        //   416: ifne            424
        //   419: aload_0        
        //   420: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.execute_4:()V
        //   423: return         
        //   424: aload_0        
        //   425: dup            
        //   426: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   429: iconst_1       
        //   430: iadd           
        //   431: putfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   434: goto            610
        //   437: aload_0        
        //   438: aload_0        
        //   439: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class2338_1:Lnet/minecraft/class_2338;
        //   442: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.checkClass_2338_1:(Lnet/minecraft/class_2338;)Z
        //   445: ifne            465
        //   448: aload_0        
        //   449: dup            
        //   450: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   453: iconst_1       
        //   454: iadd           
        //   455: putfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   458: goto            610
        //   461: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   464: athrow         
        //   465: aload_0        
        //   466: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class2338_1:Lnet/minecraft/class_2338;
        //   469: invokevirtual   net/minecraft/class_2338.method_10074:()Lnet/minecraft/class_2338;
        //   472: astore          7
        //   474: aload_0        
        //   475: aload           7
        //   477: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.checkClass_2338_1:(Lnet/minecraft/class_2338;)Z
        //   480: ifeq            500
        //   483: aload_0        
        //   484: dup            
        //   485: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   488: iconst_1       
        //   489: iadd           
        //   490: putfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   493: goto            610
        //   496: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   499: athrow         
        //   500: aload_0        
        //   501: aload_0        
        //   502: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class2338_1:Lnet/minecraft/class_2338;
        //   505: getstatic       net/minecraft/class_1802.field_8801:Lnet/minecraft/class_1792;
        //   508: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.checkCondition:(Lnet/minecraft/class_2338;Lnet/minecraft/class_1792;)Z
        //   511: pop            
        //   512: aload_0        
        //   513: dup            
        //   514: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   517: iconst_1       
        //   518: iadd           
        //   519: putfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   522: goto            610
        //   525: aload_0        
        //   526: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.bindK_2:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   529: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.getValue:()Ljava/lang/Object;
        //   532: checkcast       Ljava/lang/Double;
        //   535: invokevirtual   java/lang/Double.doubleValue:()D
        //   538: invokestatic    java/lang/Math.round:(D)J
        //   541: l2i            
        //   542: iconst_1       
        //   543: isub           
        //   544: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_13.setInt:(I)V
        //   547: aload_0        
        //   548: dup            
        //   549: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   552: iconst_1       
        //   553: iadd           
        //   554: putfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   557: goto            610
        //   560: aload_0        
        //   561: aload_0        
        //   562: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class2338:Lnet/minecraft/class_2338;
        //   565: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.checkClass_2338:(Lnet/minecraft/class_2338;)Z
        //   568: ifeq            576
        //   571: aload_0        
        //   572: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.execute_4:()V
        //   575: return         
        //   576: aload_0        
        //   577: aload_0        
        //   578: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.class2338:Lnet/minecraft/class_2338;
        //   581: aconst_null    
        //   582: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.checkCondition_1:(Lnet/minecraft/class_2338;Lnet/minecraft/class_1792;)Z
        //   585: ifne            593
        //   588: aload_0        
        //   589: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.execute_4:()V
        //   592: return         
        //   593: aload_0        
        //   594: dup            
        //   595: getfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   598: iconst_1       
        //   599: iadd           
        //   600: putfield        com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.intValue:I
        //   603: goto            610
        //   606: aload_0        
        //   607: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.execute_4:()V
        //   610: goto            618
        //   613: astore_1       
        //   614: aload_0        
        //   615: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.execute_4:()V
        //   618: return         
        //    StackMapTable: 00 34 55 07 00 D5 03 4B 07 00 D5 03 4B 07 00 D5 03 00 FF 00 1D 00 02 07 00 02 04 00 01 07 00 D5 03 49 07 00 D5 03 49 07 00 D5 03 4F 07 00 D5 03 46 07 00 D5 03 50 07 00 D5 03 46 07 00 D5 03 00 0E FF 00 1E 00 03 07 00 02 04 04 00 01 07 00 D5 03 52 07 00 D5 03 4A 07 00 D5 03 00 FC 00 11 04 34 49 07 00 D5 03 04 0C 12 0C 0F 0C 57 07 00 D5 03 FF 00 1E 00 05 07 00 02 04 04 04 07 01 64 00 01 07 00 D5 03 FA 00 18 22 0F 10 0C 03 FF 00 02 00 01 07 00 02 00 01 07 00 D5 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  25     50     53     57     Ljava/lang/Exception;
        //  9      34     37     41     Ljava/lang/Exception;
        //  0      18     21     25     Ljava/lang/Exception;
        //  0      57     613    618    Ljava/lang/Exception;
        //  158    176    179    183    Ljava/lang/Exception;
        //  151    165    168    172    Ljava/lang/Exception;
        //  120    144    147    151    Ljava/lang/Exception;
        //  106    133    136    140    Ljava/lang/Exception;
        //  92     113    116    120    Ljava/lang/Exception;
        //  69     99     102    106    Ljava/lang/Exception;
        //  62     85     88     92     Ljava/lang/Exception;
        //  58     183    613    618    Ljava/lang/Exception;
        //  184    198    613    618    Ljava/lang/Exception;
        //  234    265    268    272    Ljava/lang/Exception;
        //  220    250    253    257    Ljava/lang/Exception;
        //  213    227    230    234    Ljava/lang/Exception;
        //  199    272    613    618    Ljava/lang/Exception;
        //  273    290    613    618    Ljava/lang/Exception;
        //  291    351    354    358    Ljava/lang/Exception;
        //  291    362    613    618    Ljava/lang/Exception;
        //  363    394    613    618    Ljava/lang/Exception;
        //  395    423    613    618    Ljava/lang/Exception;
        //  474    496    496    500    Ljava/lang/Exception;
        //  437    461    461    465    Ljava/lang/Exception;
        //  424    575    613    618    Ljava/lang/Exception;
        //  576    592    613    618    Ljava/lang/Exception;
        //  593    610    613    618    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    private void setClass_243AndRunnable(final class_243 class_243, final Runnable runnable) {
        final float[] floatarr = Initializer_10.createFloatarr(CacheXImpl_1.class310.field_1724.method_33571(), class_243);
        this.floatValue_2 = floatarr[0];
        this.floatValue_3 = floatarr[1];
        final boolean booleanValue = this.buffC_1.getValue();
        final boolean b = this.bindK.getValue().longValue() <= 50L;
        if (booleanValue) {
            if (!this.boolFlag_1) {
                if (this.buffC.getValue()) {
                    this.floatValue = Initializer_10.getFloat();
                    this.floatValue_1 = Initializer_10.getFloat_1();
                }
                else {
                    this.floatValue = CacheXImpl_1.class310.field_1724.method_36454();
                    this.floatValue_1 = CacheXImpl_1.class310.field_1724.method_36455();
                }
            }
            else {
                this.floatValue_4 = this.floatValue;
                this.floatValue_5 = this.floatValue_1;
            }
            if (!this.boolFlag_1) {
                this.floatValue_4 = this.floatValue;
                this.floatValue_5 = this.floatValue_1;
            }
            this.floatValue_6 = 0.0f;
            final float abs = Math.abs(Initializer_10.method_float(this.floatValue_2 - this.floatValue_4));
            final float abs2 = Math.abs(this.floatValue_3 - this.floatValue_5);
            this.floatValue_7 = (float)Math.sqrt(abs * abs + abs2 * abs2);
            if (this.floatValue_7 < 0.1f) {
                this.floatValue_7 = 0.1f;
            }
            this.boolFlag_1 = true;
            this.boolFlag_2 = false;
            if (b) {
                this.runnable = null;
                if (runnable != null) {
                    runnable.run();
                }
            }
            else {
                this.runnable = runnable;
            }
        }
        else {
            this.floatValue = this.floatValue_2;
            this.floatValue_1 = this.floatValue_3;
            if (this.buffC.getValue()) {
                Initializer_10.setFloatAndFloat(this.floatValue_2, this.floatValue_3);
            }
            else {
                CacheXImpl_1.class310.field_1724.method_36456(this.floatValue_2);
                CacheXImpl_1.class310.field_1724.method_36457(this.floatValue_3);
            }
            this.boolFlag_1 = false;
            this.boolFlag_2 = true;
            this.runnable = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
    
    private boolean isEnabled() {
        final class_239 field_1765 = CacheXImpl_1.class310.field_1765;
        if (!(field_1765 instanceof class_3965)) {
            return false;
        }
        final class_3965 class_3965 = (class_3965)field_1765;
        final class_2338 method_17777 = class_3965.method_17777();
        if (this.checkClass_2338_1(method_17777)) {
            this.class2338 = method_17777;
        }
        else {
            this.class2338 = method_17777.method_10093(class_3965.method_17780());
        }
        if (new class_243(CacheXImpl_1.class310.field_1724.method_23317(), CacheXImpl_1.class310.field_1724.method_23318(), CacheXImpl_1.class310.field_1724.method_23321()).method_1022(class_243.method_24953((class_2382)this.class2338)) > this.bindK_3.getValue()) {
            return false;
        }
        final class_243 method_17778 = new class_243(CacheXImpl_1.class310.field_1724.method_23317(), CacheXImpl_1.class310.field_1724.method_23318(), CacheXImpl_1.class310.field_1724.method_23321()).method_1019(class_243.method_24953((class_2382)this.class2338)).method_1021(0.5);
        class_2338 class2338_1 = new class_2338((int)Math.floor(method_17778.field_1352), CacheXImpl_1.class310.field_1724.method_31478(), (int)Math.floor(method_17778.field_1350));
        if (class2338_1.equals((Object)this.class2338) || class2338_1.equals((Object)CacheXImpl_1.class310.field_1724.method_24515())) {
            class2338_1 = CacheXImpl_1.class310.field_1724.method_24515().method_10093(this.computeClass_2350(CacheXImpl_1.class310.field_1724.method_36454()));
            if (class2338_1.equals((Object)this.class2338)) {
                class2338_1 = CacheXImpl_1.class310.field_1724.method_24515();
            }
        }
        this.class2338_1 = class2338_1;
        return true;
    }
    
    private class_2350 computeClass_2350(float n) {
        n %= 360.0f;
        if (n < 0.0f) {
            n += 360.0f;
        }
        if (n >= 315.0f || n < 45.0f) {
            return class_2350.field_11035;
        }
        if (n >= 45.0f && n < 135.0f) {
            return class_2350.field_11039;
        }
        if (n >= 135.0f && n < 225.0f) {
            return class_2350.field_11043;
        }
        return class_2350.field_11034;
    }
    
    private boolean checkClass_2338_1(final class_2338 class_2338) {
        if (CacheXImpl_1.class310.field_1687 == null) {
            return false;
        }
        final class_2680 method_8320 = CacheXImpl_1.class310.field_1687.method_8320(class_2338);
        final class_2248 method_8321 = method_8320.method_26204();
        return method_8320.method_26215() || method_8321 == class_2246.field_10479 || method_8321 == class_2246.field_10214 || method_8321 == class_2246.field_10112 || method_8321 == class_2246.field_10313 || method_8321 == class_2246.field_10428 || method_8321 == class_2246.field_10597 || method_8321 == class_2246.field_10036 || method_8321 == class_2246.field_22089 || method_8321 == class_2246.field_10382 || method_8321 == class_2246.field_10164 || method_8321 == class_2246.field_10477 || method_8321 == class_2246.field_10376 || method_8321 == class_2246.field_10238 || method_8321 == class_2246.field_9993 || method_8321 == class_2246.field_10463 || method_8320.method_45474();
    }
    
    private boolean checkCondition(final class_2338 class_2338, final class_1792 class_2339) {
        if (class_2338 == null || !this.checkClass_2338_1(class_2338) || CacheXImpl_1.class310.field_1761 == null || CacheXImpl_1.class310.field_1724 == null) {
            return false;
        }
        if (!Initializer_13.checkClass_1792(class_2339)) {
            return false;
        }
        final class_3965 computeClass_3965 = this.computeClass_3965(class_2338);
        if (computeClass_3965 == null) {
            return false;
        }
        if (class_2339 == class_1802.field_23141) {
            Initializer_9.setClass_3965AndBool(computeClass_3965, true);
        }
        else {
            this.setClass_243AndRunnable(computeClass_3965.method_17784(), CacheXImpl_1::lambda$placeBlock$0);
        }
        return true;
    }
    
    private class_3965 computeClass_3965(final class_2338 class_2338) {
        for (final class_2350 class_2339 : new class_2350[] { class_2350.field_11033, class_2350.field_11036, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034 }) {
            final class_2338 method_10093 = class_2338.method_10093(class_2339);
            if (!this.checkClass_2338_1(method_10093)) {
                return new class_3965(class_243.method_24953((class_2382)method_10093).method_1031(class_2339.method_10153().method_62675().method_10263() * 0.5, class_2339.method_10153().method_62675().method_10264() * 0.5, class_2339.method_10153().method_62675().method_10260() * 0.5), class_2339.method_10153(), method_10093, false);
            }
        }
        return null;
    }
    
    private boolean checkCondition_1(final class_2338 class_2338, final class_1792 class_2339) {
        if (class_2338 == null || CacheXImpl_1.class310.field_1724 == null || CacheXImpl_1.class310.field_1761 == null) {
            return false;
        }
        if (class_2339 != null) {
            Initializer_13.checkClass_1792(class_2339);
        }
        final class_2350 field_11036 = class_2350.field_11036;
        class_243 class_2340 = class_243.method_24953((class_2382)class_2338).method_1031(field_11036.method_10148() * 0.5, field_11036.method_10164() * 0.5, field_11036.method_10165() * 0.5);
        if (class_2340.field_1351 > CacheXImpl_1.class310.field_1724.method_33571().field_1351) {
            class_2340 = class_243.method_24953((class_2382)class_2338);
        }
        this.setClass_243AndRunnable(class_2340, CacheXImpl_1::lambda$interactWithBlock$1);
        return true;
    }
    
    private boolean checkClass_2338_2(final class_2338 class_2338) {
        if (class_2338 == null || this.checkClass_2338_1(class_2338) || CacheXImpl_1.class310.field_1761 == null || CacheXImpl_1.class310.field_1724 == null) {
            return false;
        }
        if (!Initializer_13.checkClass_1792(class_1802.field_8801)) {
            return false;
        }
        Initializer_9.setClass_3965AndBool(new class_3965(class_243.method_24953((class_2382)class_2338), class_2350.field_11036, class_2338, false), false);
        return true;
    }
    
    private boolean isEnabled_1() {
        boolean b = false;
        boolean b2 = false;
        for (int i = 0; i < 9; ++i) {
            final class_1799 method_5438 = CacheXImpl_1.class310.field_1724.method_31548().method_5438(i);
            if (method_5438.method_7909().equals(class_1802.field_23141)) {
                b = true;
            }
            if (method_5438.method_7909().equals(class_1802.field_8801)) {
                b2 = true;
            }
        }
        return b && b2;
    }
    
    private boolean isEnabled_2() {
        final int intValue = this.gridH.getValue();
        return intValue != -1 && Initializer_8.checkInt(intValue) && (this.boolFlag = true);
    }
    
    private void execute_4() {
        this.boolFlag = false;
        this.intValue = 0;
        this.longValue = 0L;
        this.class2338 = null;
        this.class2338_1 = null;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.runnable = null;
        this.floatValue_6 = 0.0f;
        if (this.buffC.getValue()) {
            Initializer_10.execute();
        }
    }
    
    public boolean isEnabled_3() {
        return this.boolFlag;
    }
    
    private boolean checkClass_2338(final class_2338 class_2338) {
        if (CacheXImpl_1.class310.field_1687 == null || class_2338 == null) {
            return false;
        }
        final double n = 10.0;
        for (final class_1297 class_2339 : CacheXImpl_1.class310.field_1687.method_8335((class_1297)null, new class_238(class_2338.method_10263() - n, class_2338.method_10264() - n, class_2338.method_10260() - n, class_2338.method_10263() + n, class_2338.method_10264() + n, class_2338.method_10260() + n))) {
            if (class_2339 instanceof final class_1542 class_2340) {
                final class_1799 method_6983 = class_2340.method_6983();
                if (method_6983.method_7960()) {
                    continue;
                }
                final String string = class_7923.field_41178.method_10221((Object)method_6983.method_7909()).toString();
                if (string.contains(createString(19198, 24355)) || string.contains(createString(19187, 12905)) || string.contains(createString(19193, -25257)) || string.contains(createString(19185, 9912))) {
                    return true;
                }
                if (string.contains(createString(19196, 24660))) {
                    return true;
                }
                if (method_6983.method_7909() == class_1802.field_8288) {
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    private static void lambda$interactWithBlock$1(final class_2338 class_2338) {
        Initializer_9.setClass_3965AndBool(new class_3965(class_243.method_24953((class_2382)class_2338), class_2350.field_11036, class_2338, false), true);
    }
    
    private static void lambda$placeBlock$0(final class_3965 class_3965) {
        Initializer_9.setClass_3965AndBool(class_3965, true);
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[17];
        int n = 0;
        String s;
        int n2 = (s = """
                      \u0017¶\u001ays\u00ea\u0086\u0094\u0088"\u0006\u008b°\u00df5¤p\f\u00db\u0015\u00c1Cv \u008e\u00f6½%+\u00d2\u0005\u0093\u00f1§R\u00c9D\u00c1\u0090¤\u0017g\u00fc\u00e7\u00e1\u008eµ\u009d\r\u00c6\u00ed\u00c6O3\u0000ªH\u00ee\u00f3\f\u00adV\u0006r\u00fb\u001aV¬ª\u00d7\u008ad\u0089\u00d0\u00dd¾\u00c2\u0019\u00f7\u00cc\u00ea\u00e4\u00d8\u000f\u009d\u0095@g\u00dd\u00ff\u0087\u0012\u00fb\u0088\r\u009f¥¥\u008a\u00efH\u00d4+\u00fa%\u0010\u00e8\u0087\u00efV©\u0015T\b\u00f9\u00ca[\f-\u00f6\u008d\u0017\b{\u00c6N\u00f1\u00f0¹\u00df\u00e5\f\u00f5«I\u001f\u00d5\u0013wA\u0097/\u00dd¦\u0010\u008f\u00ee\u0000\u00f5-6\u009d\u00f3\u00c0µ|\u00e3\u00c9\u000b\u0011¨\u000eH¼\u00c2\u00f3\r8\u00d6/@²\u00db\u00d1\u0002u\u000b·¬\u00e6I$¥\u009f_¼\rK\u0005\u0080®\u00c1x%
                      R\u001c\u0087\u0012\u0096M¦´y\u0019
                      \u0017"\u00ef$±\u000fG«\u0086G\u0005\u00e7j\u001a<i""").length();
        int n3 = 10;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 94));
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
                        Label_0264: {
                            if (length > 1) {
                                break Label_0264;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 16;
                                    case 1 -> 98;
                                    case 2 -> 48;
                                    case 3 -> 94;
                                    case 4 -> 72;
                                    case 5 -> 60;
                                    default -> 126;
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
                                continue Label_0024;
                            }
                            n2 = (s = "\u0012¦r~\u00ef\u0087\u0095#\u00d3\u0081k°¨*\u00fd\n\u008d¬\u0085&\u00ee\u00ea¨rW\u00c3").length();
                            n3 = 15;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0024;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 86)));
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
        strArr_1 = new String[17];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x4AFF) & 0xFFFF;
        if (CacheXImpl_1.strArr_1[n3] == null) {
            final char[] charArray = CacheXImpl_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 132;
                case 1 -> 139;
                case 2 -> 151;
                case 3 -> 170;
                case 4 -> 183;
                case 5 -> 129;
                case 6 -> 101;
                case 7 -> 94;
                case 8 -> 67;
                case 9 -> 102;
                case 10 -> 120;
                case 11 -> 46;
                case 12 -> 130;
                case 13 -> 225;
                case 14 -> 241;
                case 15 -> 188;
                case 16 -> 137;
                case 17 -> 235;
                case 18 -> 229;
                case 19 -> 195;
                case 20 -> 204;
                case 21 -> 96;
                case 22 -> 251;
                case 23 -> 43;
                case 24 -> 39;
                case 25 -> 177;
                case 26 -> 55;
                case 27 -> 148;
                case 28 -> 234;
                case 29 -> 228;
                case 30 -> 138;
                case 31 -> 103;
                case 32 -> 61;
                case 33 -> 218;
                case 34 -> 247;
                case 35 -> 99;
                case 36 -> 134;
                case 37 -> 117;
                case 38 -> 19;
                case 39 -> 20;
                case 40 -> 41;
                case 41 -> 23;
                case 42 -> 200;
                case 43 -> 252;
                case 44 -> 70;
                case 45 -> 233;
                case 46 -> 191;
                case 47 -> 54;
                case 48 -> 47;
                case 49 -> 125;
                case 50 -> 239;
                case 51 -> 206;
                case 52 -> 24;
                case 53 -> 254;
                case 54 -> 108;
                case 55 -> 100;
                case 56 -> 189;
                case 57 -> 215;
                case 58 -> 248;
                case 59 -> 114;
                case 60 -> 85;
                case 61 -> 245;
                case 62 -> 33;
                case 63 -> 104;
                case 64 -> 174;
                case 65 -> 250;
                case 66 -> 221;
                case 67 -> 255;
                case 68 -> 14;
                case 69 -> 140;
                case 70 -> 16;
                case 71 -> 18;
                case 72 -> 44;
                case 73 -> 253;
                case 74 -> 192;
                case 75 -> 28;
                case 76 -> 2;
                case 77 -> 231;
                case 78 -> 173;
                case 79 -> 205;
                case 80 -> 40;
                case 81 -> 160;
                case 82 -> 34;
                case 83 -> 154;
                case 84 -> 142;
                case 85 -> 51;
                case 86 -> 224;
                case 87 -> 65;
                case 88 -> 83;
                case 89 -> 97;
                case 90 -> 11;
                case 91 -> 26;
                case 92 -> 87;
                case 93 -> 115;
                case 94 -> 17;
                case 95 -> 27;
                case 96 -> 187;
                case 97 -> 240;
                case 98 -> 37;
                case 99 -> 182;
                case 100 -> 230;
                case 101 -> 36;
                case 102 -> 77;
                case 103 -> 88;
                case 104 -> 238;
                case 105 -> 6;
                case 106 -> 171;
                case 107 -> 95;
                case 108 -> 121;
                case 109 -> 220;
                case 110 -> 48;
                case 111 -> 135;
                case 112 -> 175;
                case 113 -> 201;
                case 114 -> 7;
                case 115 -> 145;
                case 116 -> 180;
                case 117 -> 223;
                case 118 -> 71;
                case 119 -> 82;
                case 120 -> 143;
                case 121 -> 98;
                case 122 -> 29;
                case 123 -> 64;
                case 124 -> 246;
                case 125 -> 155;
                case 126 -> 110;
                case 127 -> 181;
                case 128 -> 3;
                case 129 -> 68;
                case 130 -> 63;
                case 131 -> 12;
                case 132 -> 141;
                case 133 -> 123;
                case 134 -> 243;
                case 135 -> 42;
                case 136 -> 208;
                case 137 -> 86;
                case 138 -> 112;
                case 139 -> 73;
                case 140 -> 56;
                case 141 -> 60;
                case 142 -> 212;
                case 143 -> 79;
                case 144 -> 227;
                case 145 -> 106;
                case 146 -> 105;
                case 147 -> 214;
                case 148 -> 150;
                case 149 -> 49;
                case 150 -> 232;
                case 151 -> 190;
                case 152 -> 124;
                case 153 -> 127;
                case 154 -> 10;
                case 155 -> 169;
                case 156 -> 45;
                case 157 -> 217;
                case 158 -> 80;
                case 159 -> 176;
                case 160 -> 164;
                case 161 -> 203;
                case 162 -> 22;
                case 163 -> 116;
                case 164 -> 15;
                case 165 -> 178;
                case 166 -> 157;
                case 167 -> 81;
                case 168 -> 172;
                case 169 -> 237;
                case 170 -> 194;
                case 171 -> 25;
                case 172 -> 72;
                case 173 -> 66;
                case 174 -> 21;
                case 175 -> 168;
                case 176 -> 147;
                case 177 -> 133;
                case 178 -> 69;
                case 179 -> 9;
                case 180 -> 186;
                case 181 -> 193;
                case 182 -> 5;
                case 183 -> 91;
                case 184 -> 163;
                case 185 -> 167;
                case 186 -> 31;
                case 187 -> 119;
                case 188 -> 209;
                case 189 -> 219;
                case 190 -> 236;
                case 191 -> 113;
                case 192 -> 222;
                case 193 -> 89;
                case 194 -> 126;
                case 195 -> 52;
                case 196 -> 198;
                case 197 -> 118;
                case 198 -> 244;
                case 199 -> 50;
                case 200 -> 90;
                case 201 -> 158;
                case 202 -> 249;
                case 203 -> 152;
                case 204 -> 184;
                case 205 -> 149;
                case 206 -> 159;
                case 207 -> 207;
                case 208 -> 213;
                case 209 -> 146;
                case 210 -> 57;
                case 211 -> 226;
                case 212 -> 210;
                case 213 -> 92;
                case 214 -> 131;
                case 215 -> 84;
                case 216 -> 59;
                case 217 -> 144;
                case 218 -> 4;
                case 219 -> 93;
                case 220 -> 35;
                case 221 -> 166;
                case 222 -> 199;
                case 223 -> 196;
                case 224 -> 30;
                case 225 -> 128;
                case 226 -> 179;
                case 227 -> 76;
                case 228 -> 153;
                case 229 -> 185;
                case 230 -> 53;
                case 231 -> 8;
                case 232 -> 136;
                case 233 -> 62;
                case 234 -> 162;
                case 235 -> 122;
                case 236 -> 202;
                case 237 -> 197;
                case 238 -> 111;
                case 239 -> 242;
                case 240 -> 107;
                case 241 -> 75;
                case 242 -> 216;
                case 243 -> 13;
                case 244 -> 78;
                case 245 -> 211;
                case 246 -> 74;
                case 247 -> 109;
                case 248 -> 32;
                case 249 -> 58;
                case 250 -> 1;
                case 251 -> 0;
                case 252 -> 165;
                case 253 -> 156;
                case 254 -> 38;
                default -> 161;
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
            CacheXImpl_1.strArr_1[n3] = new String(charArray).intern();
        }
        return CacheXImpl_1.strArr_1[n3];
    }
}
