// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub1;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import com.target.mod.compat.sub1.sub1.sub5.sub1.CalcGSub;
import net.minecraft.class_310;

public final class Initializer_1
{
    public static Initializer_4 syncF;
    public static Initializer_3 eventC;
    public static com.target.mod.compat.sub1.sub1.sub2.Initializer_1 initD;
    public static Initializer cacheD;
    public static class_310 class310;
    public static volatile Initializer_1 configA;
    public static String strValue;
    public static String strValue_1;
    public static Initializer_2 dataB;
    public static String strValue_2;
    private static CalcGSub gridF;
    private final Object objValue;
    private boolean boolFlag;
    private final boolean boolFlag_1 = false;
    private final ExecutorService executorService;
    private static int[] intArr;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_1() {
        this.objValue = new Object();
        this.boolFlag = false;
        Initializer_1.configA = this;
        (this.executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), Initializer_1::lambda$new$0, new ThreadPoolExecutor.AbortPolicy())).submit(this::execute_1);
        synchronized (this.objValue) {
            final long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                try {
                    if (this.boolFlag || System.currentTimeMillis() - currentTimeMillis >= 10000L) {
                        break;
                    }
                }
                catch (final InterruptedException ex) {
                    throw computeInterruptedexception(ex);
                }
                try {
                    this.objValue.wait(1000L);
                    continue;
                }
                catch (final InterruptedException ex2) {
                    Thread.currentThread().interrupt();
                }
                break;
            }
            if (!this.boolFlag) {}
        }
    }
    
    public static Initializer_1 getConfiga() {
        return Initializer_1.configA;
    }
    
    public static Initializer_4 getSyncf() {
        return Initializer_1.syncF;
    }
    
    public static com.target.mod.compat.sub1.sub1.sub2.Initializer_1 getInitd() {
        return Initializer_1.initD;
    }
    
    public static Initializer_3 getEventc() {
        return Initializer_1.eventC;
    }
    
    public static Initializer getCached() {
        return Initializer_1.cacheD;
    }
    
    public static Initializer_2 getDatab() {
        return Initializer_1.dataB;
    }
    
    public static CalcGSub getGridf() {
        return Initializer_1.gridF;
    }
    
    public static void execute() {
    }
    
    public void execute_1() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: invokestatic    net/minecraft/class_310.method_1551:()Lnet/minecraft/class_310;
        //     7: putstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //    10: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //    13: ifnull          36
        //    16: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //    19: aload_1        
        //    20: ifnull          55
        //    23: getfield        net/minecraft/class_310.field_1697:Ljava/io/File;
        //    26: ifnonnull       62
        //    29: goto            36
        //    32: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_1.computeInterruptedexception:(Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
        //    35: athrow         
        //    36: ldc2_w          100
        //    39: invokestatic    java/lang/Thread.sleep:(J)V
        //    42: goto            52
        //    45: astore_2       
        //    46: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    49: invokevirtual   java/lang/Thread.interrupt:()V
        //    52: invokestatic    net/minecraft/class_310.method_1551:()Lnet/minecraft/class_310;
        //    55: putstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //    58: aload_1        
        //    59: ifnonnull       10
        //    62: new             Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    65: dup            
        //    66: invokespecial   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.<init>:()V
        //    69: putstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    72: new             Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_3;
        //    75: dup            
        //    76: invokespecial   com/target/mod/compat/sub1/sub1/sub1/Initializer_3.<init>:()V
        //    79: putstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.eventC:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_3;
        //    82: new             Lcom/target/mod/compat/sub1/sub1/sub2/Initializer_1;
        //    85: dup            
        //    86: invokespecial   com/target/mod/compat/sub1/sub1/sub2/Initializer_1.<init>:()V
        //    89: putstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.initD:Lcom/target/mod/compat/sub1/sub1/sub2/Initializer_1;
        //    92: new             Lcom/target/mod/compat/sub1/sub1/sub1/Initializer;
        //    95: dup            
        //    96: invokespecial   com/target/mod/compat/sub1/sub1/sub1/Initializer.<init>:()V
        //    99: putstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.cacheD:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer;
        //   102: new             Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_2;
        //   105: dup            
        //   106: invokespecial   com/target/mod/compat/sub1/sub1/sub1/Initializer_2.<init>:()V
        //   109: putstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.dataB:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_2;
        //   112: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   115: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CacheXImpl;
        //   118: dup            
        //   119: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CacheXImpl.<init>:()V
        //   122: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   125: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   128: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_12;
        //   131: dup            
        //   132: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_12.<init>:()V
        //   135: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   138: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   141: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub5/CalcGSub;
        //   144: dup            
        //   145: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub5/CalcGSub.<init>:()V
        //   148: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   151: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   154: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_10;
        //   157: dup            
        //   158: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_10.<init>:()V
        //   161: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   164: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   167: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_16;
        //   170: dup            
        //   171: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_16.<init>:()V
        //   174: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   177: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   180: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_14;
        //   183: dup            
        //   184: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_14.<init>:()V
        //   187: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   190: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   193: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3;
        //   196: dup            
        //   197: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.<init>:()V
        //   200: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   203: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   206: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CacheXImpl_3;
        //   209: dup            
        //   210: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CacheXImpl_3.<init>:()V
        //   213: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   216: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   219: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_15;
        //   222: dup            
        //   223: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_15.<init>:()V
        //   226: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   229: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   232: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_4;
        //   235: dup            
        //   236: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_4.<init>:()V
        //   239: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   242: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   245: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8;
        //   248: dup            
        //   249: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.<init>:()V
        //   252: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   255: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   258: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/BuffPImpl;
        //   261: dup            
        //   262: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/BuffPImpl.<init>:()V
        //   265: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   268: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   271: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub;
        //   274: dup            
        //   275: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub.<init>:()V
        //   278: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   281: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   284: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1;
        //   287: dup            
        //   288: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl_1.<init>:()V
        //   291: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   294: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   297: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl;
        //   300: dup            
        //   301: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub2/CacheXImpl.<init>:()V
        //   304: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   307: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   310: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub5/RenderVImpl;
        //   313: dup            
        //   314: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub5/RenderVImpl.<init>:()V
        //   317: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   320: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   323: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub4/CalcGSub;
        //   326: dup            
        //   327: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub4/CalcGSub.<init>:()V
        //   330: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   333: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   336: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17;
        //   339: dup            
        //   340: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_17.<init>:()V
        //   343: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   346: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   349: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_13;
        //   352: dup            
        //   353: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_13.<init>:()V
        //   356: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   359: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   362: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_7;
        //   365: dup            
        //   366: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_7.<init>:()V
        //   369: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   372: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   375: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_5;
        //   378: dup            
        //   379: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_5.<init>:()V
        //   382: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   385: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   388: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/BuffPImpl_1;
        //   391: dup            
        //   392: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/BuffPImpl_1.<init>:()V
        //   395: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   398: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   401: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CacheXImpl_1;
        //   404: dup            
        //   405: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CacheXImpl_1.<init>:()V
        //   408: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   411: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   414: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_2;
        //   417: dup            
        //   418: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_2.<init>:()V
        //   421: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   424: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   427: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_1;
        //   430: dup            
        //   431: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_1.<init>:()V
        //   434: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   437: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   440: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_11;
        //   443: dup            
        //   444: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_11.<init>:()V
        //   447: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   450: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   453: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_9;
        //   456: dup            
        //   457: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_9.<init>:()V
        //   460: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   463: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   466: new             Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_6;
        //   469: dup            
        //   470: invokespecial   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_6.<init>:()V
        //   473: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.setCalcg:(Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;)V
        //   476: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   479: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.getList:()Ljava/util/List;
        //   482: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   487: astore_2       
        //   488: aload_2        
        //   489: invokeinterface java/util/Iterator.hasNext:()Z
        //   494: ifeq            589
        //   497: aload_2        
        //   498: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   503: checkcast       Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //   506: astore_3       
        //   507: ldc_w           Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;.class
        //   510: sipush          14560
        //   513: sipush          -6396
        //   516: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_1.createString:(II)Ljava/lang/String;
        //   519: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   522: astore          4
        //   524: aload           4
        //   526: iconst_1       
        //   527: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //   530: aload_1        
        //   531: ifnull          580
        //   534: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //   537: aload_1        
        //   538: ifnull          632
        //   541: goto            548
        //   544: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_1.computeInterruptedexception:(Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
        //   547: athrow         
        //   548: ifnonnull       571
        //   551: goto            558
        //   554: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_1.computeInterruptedexception:(Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
        //   557: athrow         
        //   558: invokestatic    net/minecraft/class_310.method_1551:()Lnet/minecraft/class_310;
        //   561: putstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //   564: goto            571
        //   567: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_1.computeInterruptedexception:(Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
        //   570: athrow         
        //   571: aload           4
        //   573: aload_3        
        //   574: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //   577: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   580: goto            585
        //   583: astore          4
        //   585: aload_1        
        //   586: ifnonnull       488
        //   589: getstatic       net/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents.END_CLIENT_TICK:Lnet/fabricmc/fabric/api/event/Event;
        //   592: invokedynamic   BootstrapMethod #2, onEndTick:()Lnet/fabricmc/fabric/api/client/event/lifecycle/v1/ClientTickEvents$EndTick;
        //   597: invokevirtual   net/fabricmc/fabric/api/event/Event.register:(Ljava/lang/Object;)V
        //   600: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.eventC:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_3;
        //   603: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_3.execute:()V
        //   606: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.eventC:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_3;
        //   609: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_3.execute_5:()V
        //   612: aload_0        
        //   613: getfield        com/target/mod/compat/sub1/sub1/sub1/Initializer_1.objValue:Ljava/lang/Object;
        //   616: dup            
        //   617: astore_2       
        //   618: monitorenter   
        //   619: aload_0        
        //   620: iconst_1       
        //   621: putfield        com/target/mod/compat/sub1/sub1/sub1/Initializer_1.boolFlag:Z
        //   624: aload_0        
        //   625: getfield        com/target/mod/compat/sub1/sub1/sub1/Initializer_1.objValue:Ljava/lang/Object;
        //   628: invokevirtual   java/lang/Object.notifyAll:()V
        //   631: aload_2        
        //   632: monitorexit    
        //   633: goto            643
        //   636: astore          5
        //   638: aload_2        
        //   639: monitorexit    
        //   640: aload           5
        //   642: athrow         
        //   643: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //   646: invokedynamic   BootstrapMethod #3, run:()Ljava/lang/Runnable;
        //   651: invokevirtual   net/minecraft/class_310.execute:(Ljava/lang/Runnable;)V
        //   654: goto            658
        //   657: astore_2       
        //   658: return         
        //    StackMapTable: 00 17 FC 00 0A 07 00 B1 55 07 00 2A 03 48 07 00 2A 06 42 07 00 AA 06 FC 01 A9 07 01 2D FF 00 37 00 05 07 00 02 07 00 B1 07 01 2D 07 01 37 07 01 43 00 01 07 00 2A 43 07 00 AA 45 07 00 2A 03 48 07 00 2A 03 08 FF 00 02 00 04 07 00 02 07 00 B1 07 01 2D 07 01 37 00 01 07 00 A4 FC 00 01 07 00 04 F9 00 03 FF 00 2A 00 03 07 00 02 07 00 B1 07 00 04 00 01 07 00 04 43 07 00 87 06 FF 00 0D 00 02 07 00 02 07 00 B1 00 01 07 00 A4 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  16     29     32     36     Ljava/lang/InterruptedException;
        //  36     42     45     52     Ljava/lang/InterruptedException;
        //  548    564    567    571    Ljava/lang/InterruptedException;
        //  534    551    554    558    Ljava/lang/InterruptedException;
        //  524    541    544    548    Ljava/lang/InterruptedException;
        //  507    580    583    585    Ljava/lang/Exception;
        //  619    633    636    643    Any
        //  636    640    636    643    Any
        //  4      654    657    658    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0548:
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
    
    private static void lambda$initialize$3() {
        final Thread thread = new Thread(Initializer_1::lambda$initialize$2);
        thread.setDaemon(true);
        thread.setName(createString(14563, -3035));
        thread.start();
    }
    
    private static void lambda$initialize$2() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (Initializer_1.syncF != null) {
                        Initializer_1.syncF.execute();
                    }
                }
                catch (final InterruptedException ex) {
                    throw computeInterruptedexception(ex);
                }
                Thread.sleep(50L);
            }
            catch (final InterruptedException ex2) {
                Thread.currentThread().interrupt();
            }
            catch (final Exception ex3) {}
        }
    }
    
    private static void lambda$initialize$1(final class_310 class_310) {
        if (Initializer_1.cacheD != null) {
            Initializer_1.cacheD.execute();
        }
    }
    
    private static Thread lambda$new$0(final Runnable target) {
        final Thread thread = new Thread(null, target, createString(14562, -17877), 8388608L);
        thread.setDaemon(true);
        thread.setPriority(5);
        return thread;
    }
    
    static {
        final String[] strArr2 = new String[3];
        final int[] intarr = { 0 };
        int n = 0;
        final String s;
        final int length = (s = "\b\u00d0N\u00144Pj+[{H\u000fXvO\u0093K\u0011\u009c$\u00dc\u008af\u0083 Q\u00124a\u00e6}K\u00eb4\u00df\u0002J5").length();
        int char1 = 17;
        int index = -1;
        setIntarr(intarr);
        Label_0029: {
            break Label_0029;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 90);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0208: {
                        if (length2 > 1) {
                            break Label_0208;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 27;
                                case 1 -> 69;
                                case 2 -> 67;
                                case 3 -> 27;
                                case 4 -> 92;
                                case 5 -> 12;
                                default -> 36;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                strArr2[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr = strArr2;
        strArr_1 = new String[3];
        Initializer_1.strValue_2 = "";
    }
    
    public static void setIntarr(final int[] intArr) {
        Initializer_1.intArr = intArr;
    }
    
    public static int[] getIntarrArray() {
        return Initializer_1.intArr;
    }
    
    private static InterruptedException computeInterruptedexception(final InterruptedException ex) {
        return ex;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x38E2) & 0xFFFF;
        if (Initializer_1.strArr_1[n3] == null) {
            final char[] charArray = Initializer_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 84;
                case 1 -> 87;
                case 2 -> 211;
                case 3 -> 29;
                case 4 -> 181;
                case 5 -> 44;
                case 6 -> 144;
                case 7 -> 219;
                case 8 -> 223;
                case 9 -> 30;
                case 10 -> 62;
                case 11 -> 158;
                case 12 -> 227;
                case 13 -> 120;
                case 14 -> 46;
                case 15 -> 191;
                case 16 -> 221;
                case 17 -> 32;
                case 18 -> 3;
                case 19 -> 108;
                case 20 -> 178;
                case 21 -> 50;
                case 22 -> 241;
                case 23 -> 48;
                case 24 -> 22;
                case 25 -> 47;
                case 26 -> 138;
                case 27 -> 74;
                case 28 -> 23;
                case 29 -> 7;
                case 30 -> 26;
                case 31 -> 161;
                case 32 -> 183;
                case 33 -> 247;
                case 34 -> 238;
                case 35 -> 53;
                case 36 -> 116;
                case 37 -> 95;
                case 38 -> 12;
                case 39 -> 163;
                case 40 -> 143;
                case 41 -> 19;
                case 42 -> 184;
                case 43 -> 79;
                case 44 -> 77;
                case 45 -> 233;
                case 46 -> 136;
                case 47 -> 250;
                case 48 -> 152;
                case 49 -> 159;
                case 50 -> 220;
                case 51 -> 126;
                case 52 -> 121;
                case 53 -> 61;
                case 54 -> 249;
                case 55 -> 128;
                case 56 -> 98;
                case 57 -> 125;
                case 58 -> 65;
                case 59 -> 180;
                case 60 -> 34;
                case 61 -> 237;
                case 62 -> 85;
                case 63 -> 118;
                case 64 -> 218;
                case 65 -> 4;
                case 66 -> 99;
                case 67 -> 37;
                case 68 -> 255;
                case 69 -> 82;
                case 70 -> 91;
                case 71 -> 130;
                case 72 -> 244;
                case 73 -> 16;
                case 74 -> 27;
                case 75 -> 235;
                case 76 -> 64;
                case 77 -> 210;
                case 78 -> 21;
                case 79 -> 212;
                case 80 -> 103;
                case 81 -> 105;
                case 82 -> 71;
                case 83 -> 230;
                case 84 -> 228;
                case 85 -> 252;
                case 86 -> 189;
                case 87 -> 240;
                case 88 -> 109;
                case 89 -> 182;
                case 90 -> 193;
                case 91 -> 172;
                case 92 -> 49;
                case 93 -> 36;
                case 94 -> 123;
                case 95 -> 113;
                case 96 -> 24;
                case 97 -> 226;
                case 98 -> 119;
                case 99 -> 202;
                case 100 -> 97;
                case 101 -> 111;
                case 102 -> 141;
                case 103 -> 166;
                case 104 -> 186;
                case 105 -> 10;
                case 106 -> 102;
                case 107 -> 170;
                case 108 -> 38;
                case 109 -> 139;
                case 110 -> 129;
                case 111 -> 117;
                case 112 -> 68;
                case 113 -> 17;
                case 114 -> 190;
                case 115 -> 209;
                case 116 -> 115;
                case 117 -> 171;
                case 118 -> 33;
                case 119 -> 251;
                case 120 -> 51;
                case 121 -> 66;
                case 122 -> 216;
                case 123 -> 195;
                case 124 -> 35;
                case 125 -> 52;
                case 126 -> 157;
                case 127 -> 229;
                case 128 -> 39;
                case 129 -> 198;
                case 130 -> 1;
                case 131 -> 239;
                case 132 -> 11;
                case 133 -> 206;
                case 134 -> 114;
                case 135 -> 204;
                case 136 -> 185;
                case 137 -> 177;
                case 138 -> 90;
                case 139 -> 94;
                case 140 -> 246;
                case 141 -> 162;
                case 142 -> 207;
                case 143 -> 176;
                case 144 -> 201;
                case 145 -> 92;
                case 146 -> 151;
                case 147 -> 146;
                case 148 -> 31;
                case 149 -> 2;
                case 150 -> 147;
                case 151 -> 224;
                case 152 -> 131;
                case 153 -> 203;
                case 154 -> 164;
                case 155 -> 160;
                case 156 -> 215;
                case 157 -> 89;
                case 158 -> 208;
                case 159 -> 8;
                case 160 -> 59;
                case 161 -> 73;
                case 162 -> 5;
                case 163 -> 88;
                case 164 -> 9;
                case 165 -> 225;
                case 166 -> 83;
                case 167 -> 145;
                case 168 -> 188;
                case 169 -> 173;
                case 170 -> 179;
                case 171 -> 222;
                case 172 -> 148;
                case 173 -> 174;
                case 174 -> 153;
                case 175 -> 96;
                case 176 -> 167;
                case 177 -> 122;
                case 178 -> 28;
                case 179 -> 78;
                case 180 -> 100;
                case 181 -> 72;
                case 182 -> 127;
                case 183 -> 81;
                case 184 -> 25;
                case 185 -> 104;
                case 186 -> 213;
                case 187 -> 110;
                case 188 -> 106;
                case 189 -> 45;
                case 190 -> 56;
                case 191 -> 196;
                case 192 -> 107;
                case 193 -> 168;
                case 194 -> 40;
                case 195 -> 200;
                case 196 -> 199;
                case 197 -> 55;
                case 198 -> 69;
                case 199 -> 175;
                case 200 -> 133;
                case 201 -> 80;
                case 202 -> 57;
                case 203 -> 142;
                case 204 -> 0;
                case 205 -> 42;
                case 206 -> 14;
                case 207 -> 169;
                case 208 -> 54;
                case 209 -> 140;
                case 210 -> 217;
                case 211 -> 192;
                case 212 -> 197;
                case 213 -> 20;
                case 214 -> 67;
                case 215 -> 156;
                case 216 -> 124;
                case 217 -> 63;
                case 218 -> 254;
                case 219 -> 93;
                case 220 -> 13;
                case 221 -> 150;
                case 222 -> 70;
                case 223 -> 187;
                case 224 -> 134;
                case 225 -> 75;
                case 226 -> 58;
                case 227 -> 243;
                case 228 -> 43;
                case 229 -> 231;
                case 230 -> 155;
                case 231 -> 132;
                case 232 -> 112;
                case 233 -> 194;
                case 234 -> 253;
                case 235 -> 214;
                case 236 -> 205;
                case 237 -> 41;
                case 238 -> 149;
                case 239 -> 18;
                case 240 -> 60;
                case 241 -> 86;
                case 242 -> 135;
                case 243 -> 15;
                case 244 -> 101;
                case 245 -> 6;
                case 246 -> 234;
                case 247 -> 154;
                case 248 -> 248;
                case 249 -> 137;
                case 250 -> 236;
                case 251 -> 232;
                case 252 -> 242;
                case 253 -> 165;
                case 254 -> 245;
                default -> 76;
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
            Initializer_1.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_1.strArr_1[n3];
    }
}
