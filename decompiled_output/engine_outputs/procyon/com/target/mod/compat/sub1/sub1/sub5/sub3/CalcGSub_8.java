// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.net.http.HttpResponse;
import java.net.URI;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_21;
import java.net.http.HttpRequest;
import java.util.function.Consumer;
import net.minecraft.class_6880;
import net.minecraft.class_1792;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_1799;
import net.minecraft.class_1713;
import net.minecraft.class_1657;
import net.minecraft.class_1836;
import net.minecraft.class_1792$class_9635;
import net.minecraft.class_746;
import net.minecraft.class_310;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_1887;
import java.util.Iterator;
import net.minecraft.class_5321;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Arrays;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_2561;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import java.time.Duration;
import java.util.HashMap;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import java.util.Map;
import com.google.gson.Gson;
import java.net.http.HttpClient;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_11;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_13;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_8 extends AbstractLoadF
{
    private final RenderASub_13 stepG;
    private final RenderASub_6 eventQ;
    private final RenderASub_15<Initializer_1> wrapJ;
    private final RenderASub_6 eventQ_1;
    private final RenderASub bindK;
    private final RenderASub bindK_1;
    private final RenderASub bindK_2;
    private final RenderASub_1 buffC;
    private final RenderASub_11 procF;
    private final RenderASub_11 procF_1;
    private final RenderASub bindK_3;
    private final RenderASub_1 buffC_1;
    private final RenderASub_6 eventQ_2;
    private final HttpClient httpClient;
    private final Gson gson;
    private final Map<String, Double> map;
    private int intValue;
    private boolean boolFlag;
    private long longValue;
    private boolean boolFlag_1;
    private boolean boolFlag_2;
    private int intValue_1;
    private String strValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_8() {
        super(createString(-1615, -22237), createString(-1612, -7825), Initializer.stepF);
        this.stepG = new RenderASub_13(createString(-1629, -15148), class_1802.field_8162);
        this.eventQ = new RenderASub_6(createString(-1601, -26666), createString(-1663, -19145));
        this.wrapJ = new RenderASub_15<Initializer_1>(createString(-1613, -29133), Initializer_1.MANUAL, Initializer_1.class).computeWrapj(createString(-1619, 20557));
        this.eventQ_1 = new RenderASub_6(createString(-1605, 1596), "");
        this.bindK = new RenderASub(createString(-1609, 31303), 2.0, 0.0, 100.0, 1.0);
        this.bindK_1 = new RenderASub(createString(-1628, 1985), 2.0, 0.0, 100.0, 1.0);
        this.bindK_2 = new RenderASub(createString(-1640, 18528), 250.0, 10.0, 5000.0, 10.0);
        this.buffC = new RenderASub_1(createString(-1635, -28251), true);
        this.procF = new RenderASub_11(createString(-1636, -3667));
        this.procF_1 = new RenderASub_11(createString(-1650, -3787));
        this.bindK_3 = new RenderASub(createString(-1602, -29418), 1.0, 1.0, 10.0, 1.0);
        this.buffC_1 = new RenderASub_1(createString(-1648, -15438), false);
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        this.eventQ_2 = new RenderASub_6(createString(-1662, -30089), "0");
        this.map = new HashMap<String, Double>();
        this.longValue = 0L;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.intValue_1 = -1;
        this.strValue = "";
        this.httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
        this.gson = new Gson();
        this.setRenderaarr(this.stepG, this.eventQ, this.wrapJ, this.eventQ_1, this.bindK, this.bindK_1, this.bindK_2, this.buffC, this.procF, this.procF_1, this.bindK_3, this.buffC_1, this.eventQ_2);
        if (stringarrArray == null) {
            int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
            com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
        }
    }
    
    @Override
    public void execute() {
        super.execute();
        final double method_double_1 = this.method_double_1(this.eventQ.getValue());
        Label_0072: {
            Label_0067: {
                try {
                    if (method_double_1 != -1.0) {
                        break Label_0072;
                    }
                    if (CalcGSub_8.class310.field_1724 == null) {
                        break Label_0067;
                    }
                }
                catch (final NumberFormatException ex) {
                    throw computeThrowable(ex);
                }
                CalcGSub_8.class310.field_1724.method_7353(class_2561.method_30163(createString(-1621, -27069)), true);
            }
            this.execute_2();
            return;
        }
        if (this.stepG.getClass_1792() != class_1802.field_8162) {
            this.map.put(this.stepG.getClass_1792().toString(), method_double_1);
        }
        this.longValue = 0L;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.strValue = "";
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        this.boolFlag_2 = false;
    }
    
    @Override
    public void execute_2() {
        try {
            if (CalcGSub_8.class310.field_1724 == null) {
                return;
            }
        }
        catch (final NumberFormatException ex) {
            throw computeThrowable(ex);
        }
        try {
            if (this.intValue > 0) {
                --this.intValue;
                return;
            }
        }
        catch (final NumberFormatException ex2) {
            throw computeThrowable(ex2);
        }
        try {
            if (this.wrapJ.checkEnum(Initializer_1.buildB)) {
                this.execute_3();
                return;
            }
        }
        catch (final NumberFormatException ex3) {
            throw computeThrowable(ex3);
        }
        try {
            if (!this.wrapJ.checkEnum(Initializer_1.MANUAL)) {
                return;
            }
        }
        catch (final NumberFormatException ex4) {
            throw computeThrowable(ex4);
        }
        final class_1703 field_7512 = CalcGSub_8.class310.field_1724.field_7512;
        if (!(CalcGSub_8.class310.field_1724.field_7512 instanceof class_1707)) {
            CalcGSub_8.class310.method_1562().method_45730(this.getString());
            this.intValue = 20;
            return;
        }
        try {
            if (((class_1707)field_7512).method_17388() == 6) {
                this.setClass_1707((class_1707)field_7512);
                return;
            }
        }
        catch (final NumberFormatException ex5) {
            throw computeThrowable(ex5);
        }
        try {
            if (((class_1707)field_7512).method_17388() == 3) {
                this.setClass_1707_1((class_1707)field_7512);
            }
        }
        catch (final NumberFormatException ex6) {
            throw computeThrowable(ex6);
        }
    }
    
    private String getString() {
        if (!this.procF.getSet().isEmpty()) {
            return createString(-1644, 17250) + (String)this.procF.getSet().iterator().next();
        }
        final String[] split = this.stepG.getClass_1792().method_7876().split(createString(-1616, -5983));
        final String s = Arrays.stream(split[split.length - 1].replace("_", " ").split(" ")).map((Function<? super String, ?>)CalcGSub_8::lambda$constructSearchCommand$0).collect((Collector<? super Object, ?, String>)Collectors.joining(" "));
        if (!this.procF.isEnabled()) {
            final ArrayList elements = new ArrayList();
            final Iterator<class_5321<class_1887>> iterator = this.procF.getList().iterator();
            while (iterator.hasNext()) {
                final String string = iterator.next().method_29177().toString();
                String s2;
                if (string.contains(":")) {
                    s2 = string.substring(string.lastIndexOf(58) + 1);
                }
                else {
                    s2 = string.substring(string.lastIndexOf(47) + 1);
                }
                elements.add(Arrays.stream(s2.replace("_", " ").split(" ")).map((Function<? super String, ?>)CalcGSub_8::lambda$constructSearchCommand$1).collect((Collector<? super Object, ?, String>)Collectors.joining(" ")));
            }
            return createString(-1631, -21963) + s + " " + String.join(" ", elements);
        }
        return createString(-1631, -21963) + s;
    }
    
    private void execute_3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.boolFlag_2:Z
        //     4: ifne            105
        //     7: aload_0        
        //     8: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.intValue_1:I
        //    11: iconst_m1      
        //    12: if_icmpeq       69
        //    15: goto            22
        //    18: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    21: athrow         
        //    22: aload_0        
        //    23: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.intValue_1:I
        //    26: bipush          40
        //    28: if_icmpgt       55
        //    31: goto            38
        //    34: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    37: athrow         
        //    38: aload_0        
        //    39: dup            
        //    40: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.intValue_1:I
        //    43: iconst_1       
        //    44: iadd           
        //    45: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.intValue_1:I
        //    48: goto            408
        //    51: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    54: athrow         
        //    55: aload_0        
        //    56: iconst_0       
        //    57: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.boolFlag_2:Z
        //    60: aload_0        
        //    61: ldc             ""
        //    63: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.strValue:Ljava/lang/String;
        //    66: goto            408
        //    69: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.class310:Lnet/minecraft/class_310;
        //    72: invokevirtual   net/minecraft/class_310.method_1562:()Lnet/minecraft/class_634;
        //    75: aload_0        
        //    76: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.strValue:Ljava/lang/String;
        //    79: sipush          -1631
        //    82: sipush          -21963
        //    85: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //    88: swap           
        //    89: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    94: invokevirtual   net/minecraft/class_634.method_45730:(Ljava/lang/String;)V
        //    97: aload_0        
        //    98: iconst_0       
        //    99: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.intValue_1:I
        //   102: goto            408
        //   105: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.class310:Lnet/minecraft/class_310;
        //   108: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   111: getfield        net/minecraft/class_746.field_7512:Lnet/minecraft/class_1703;
        //   114: astore_1       
        //   115: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.class310:Lnet/minecraft/class_310;
        //   118: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   121: getfield        net/minecraft/class_746.field_7512:Lnet/minecraft/class_1703;
        //   124: instanceof      Lnet/minecraft/class_1707;
        //   127: ifne            350
        //   130: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.class310:Lnet/minecraft/class_310;
        //   133: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   136: getfield        net/minecraft/class_746.field_7512:Lnet/minecraft/class_1703;
        //   139: instanceof      Lnet/minecraft/class_1707;
        //   142: ifeq            208
        //   145: goto            152
        //   148: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   151: athrow         
        //   152: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.class310:Lnet/minecraft/class_310;
        //   155: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //   158: invokevirtual   net/minecraft/class_437.method_25440:()Lnet/minecraft/class_2561;
        //   161: invokeinterface net/minecraft/class_2561.getString:()Ljava/lang/String;
        //   166: sipush          -1625
        //   169: sipush          -10061
        //   172: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //   175: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   178: ifeq            208
        //   181: goto            188
        //   184: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   187: athrow         
        //   188: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.class310:Lnet/minecraft/class_310;
        //   191: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   194: invokevirtual   net/minecraft/class_746.method_7346:()V
        //   197: aload_0        
        //   198: bipush          20
        //   200: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.intValue:I
        //   203: return         
        //   204: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   207: athrow         
        //   208: aload_0        
        //   209: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.boolFlag_1:Z
        //   212: ifeq            220
        //   215: return         
        //   216: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   219: athrow         
        //   220: invokestatic    java/lang/System.currentTimeMillis:()J
        //   223: lstore_2       
        //   224: lload_2        
        //   225: aload_0        
        //   226: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.longValue:J
        //   229: lsub           
        //   230: lstore          4
        //   232: lload           4
        //   234: aload_0        
        //   235: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.bindK_2:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   238: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.getValue:()Ljava/lang/Object;
        //   241: checkcast       Ljava/lang/Double;
        //   244: invokevirtual   java/lang/Double.intValue:()I
        //   247: i2l            
        //   248: lcmp           
        //   249: ifle            349
        //   252: aload_0        
        //   253: lload_2        
        //   254: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.longValue:J
        //   257: aload_0        
        //   258: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.eventQ_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   261: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //   264: checkcast       Ljava/lang/String;
        //   267: invokevirtual   java/lang/String.isEmpty:()Z
        //   270: ifeq            330
        //   273: goto            280
        //   276: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   279: athrow         
        //   280: aload_0        
        //   281: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.buffC:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   284: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //   287: checkcast       Ljava/lang/Boolean;
        //   290: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   293: ifeq            329
        //   296: goto            303
        //   299: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   302: athrow         
        //   303: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.class310:Lnet/minecraft/class_310;
        //   306: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   309: astore          6
        //   311: aload           6
        //   313: sipush          -1661
        //   316: sipush          -15148
        //   319: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //   322: invokestatic    net/minecraft/class_2561.method_30163:(Ljava/lang/String;)Lnet/minecraft/class_2561;
        //   325: iconst_0       
        //   326: invokevirtual   net/minecraft/class_746.method_7353:(Lnet/minecraft/class_2561;Z)V
        //   329: return         
        //   330: aload_0        
        //   331: iconst_1       
        //   332: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.boolFlag_1:Z
        //   335: aload_0        
        //   336: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.getCompletablefuture:()Ljava/util/concurrent/CompletableFuture;
        //   339: aload_0        
        //   340: invokedynamic   BootstrapMethod #4, accept:(Lcom/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8;)Ljava/util/function/Consumer;
        //   345: invokevirtual   java/util/concurrent/CompletableFuture.thenAccept:(Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;
        //   348: pop            
        //   349: return         
        //   350: aload_0        
        //   351: iconst_m1      
        //   352: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.intValue_1:I
        //   355: aload_1        
        //   356: checkcast       Lnet/minecraft/class_1707;
        //   359: invokevirtual   net/minecraft/class_1707.method_17388:()I
        //   362: bipush          6
        //   364: if_icmpne       382
        //   367: aload_0        
        //   368: aload_1        
        //   369: checkcast       Lnet/minecraft/class_1707;
        //   372: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.setClass_1707:(Lnet/minecraft/class_1707;)V
        //   375: goto            408
        //   378: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   381: athrow         
        //   382: aload_1        
        //   383: checkcast       Lnet/minecraft/class_1707;
        //   386: invokevirtual   net/minecraft/class_1707.method_17388:()I
        //   389: iconst_3       
        //   390: if_icmpne       408
        //   393: aload_0        
        //   394: aload_1        
        //   395: checkcast       Lnet/minecraft/class_1707;
        //   398: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.setClass_1707_1:(Lnet/minecraft/class_1707;)V
        //   401: goto            408
        //   404: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   407: athrow         
        //   408: return         
        //    StackMapTable: 00 1C 52 07 00 E1 03 4B 07 00 E1 03 4C 07 00 E1 03 0D 23 FF 00 2A 00 02 07 00 02 07 01 44 00 01 07 00 E1 03 5F 07 00 E1 03 4F 07 00 E1 03 47 07 00 E1 03 FF 00 37 00 04 07 00 02 07 01 44 04 04 00 01 07 00 E1 03 52 07 00 E1 03 19 00 12 F9 00 00 5B 07 00 E1 03 55 07 00 E1 FA 00 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      15     18     22     Ljava/lang/NumberFormatException;
        //  7      31     34     38     Ljava/lang/NumberFormatException;
        //  22     51     51     55     Ljava/lang/NumberFormatException;
        //  115    145    148    152    Ljava/lang/NumberFormatException;
        //  130    181    184    188    Ljava/lang/NumberFormatException;
        //  152    204    204    208    Ljava/lang/NumberFormatException;
        //  208    216    216    220    Ljava/lang/NumberFormatException;
        //  232    273    276    280    Ljava/lang/NumberFormatException;
        //  252    296    299    303    Ljava/lang/NumberFormatException;
        //  350    378    378    382    Ljava/lang/NumberFormatException;
        //  382    401    404    408    Ljava/lang/NumberFormatException;
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
    
    private CompletableFuture<List<JsonObject>> getCompletablefuture() {
        return (CompletableFuture<List<JsonObject>>)CompletableFuture.supplyAsync(this::lambda$queryApi$2);
    }
    
    private void setList(final List<JsonObject> list) {
        for (JsonObject jsonObject : list) {
            try {
                double doubleValue = 0.0;
                String s = "";
                final String asString = jsonObject.getAsJsonObject(createString(-1618, 30175)).get(createString(-1652, -26897)).getAsString();
                final long asLong = jsonObject.get(createString(-1633, 25801)).getAsLong();
                final String asString2 = jsonObject.getAsJsonObject(createString(-1645, 31330)).get(createString(-1610, -19611)).getAsString();
                final Iterator<Map.Entry<String, Double>> iterator2 = this.map.entrySet().iterator();
                do {
                    if (!iterator2.hasNext()) {
                        continue;
                    }
                    final Map.Entry<String, V> entry = iterator2.next();
                    s = entry.getKey();
                    doubleValue = (double)entry.getValue();
                } while (!asString.contains(s) || asLong > doubleValue);
                Label_0321: {
                    try {
                        if (!this.buffC.getValue() || CalcGSub_8.class310.field_1724 == null) {
                            break Label_0321;
                        }
                    }
                    catch (final Exception ex) {
                        throw computeThrowable(ex);
                    }
                    CalcGSub_8.class310.field_1724.method_7353(class_2561.method_30163(createString(-1647, -18619) + asString + createString(-1611, 3554) + this.computeString((double)asLong) + createString(-1606, -7148) + this.computeString(doubleValue) + createString(-1604, 20057) + asString2), false);
                }
                this.boolFlag_2 = true;
                this.strValue = asString2;
                return;
            }
            catch (final Exception ex2) {
                Label_0367: {
                    try {
                        if (!this.buffC.getValue()) {
                            break Label_0367;
                        }
                        final class_310 class_310 = CalcGSub_8.class310;
                        final class_746 class_311 = class_310.field_1724;
                        if (class_311 == null) {
                            break Label_0367;
                        }
                        break Label_0367;
                    }
                    catch (final Exception ex3) {
                        throw computeThrowable(ex3);
                    }
                    try {
                        final class_310 class_310 = CalcGSub_8.class310;
                        final class_746 class_311 = class_310.field_1724;
                        if (class_311 == null) {
                            continue;
                        }
                    }
                    catch (final Exception ex4) {
                        throw computeThrowable(ex4);
                    }
                }
                CalcGSub_8.class310.field_1724.method_7353(class_2561.method_30163(createString(-1664, -14748) + ex2.getMessage()), false);
                continue;
            }
            break;
        }
    }
    
    private void setClass_1707(final class_1707 class_1707) {
        final class_1799 method_7677 = class_1707.method_7611(47).method_7677();
        try {
            if (method_7677.method_31574(class_1802.field_8162)) {
                this.intValue = 2;
                return;
            }
        }
        catch (final NumberFormatException ex) {
            throw computeThrowable(ex);
        }
        for (final Object next : method_7677.method_7950(class_1792$class_9635.field_51353, (class_1657)CalcGSub_8.class310.field_1724, (class_1836)class_1836.field_41070)) {
            final String string = next.toString();
            if (string.contains(createString(-1660, -1600))) {
                Label_0145: {
                    try {
                        if (((class_2561)next).method_10866().toString().contains(createString(-1638, 22415))) {
                            break Label_0145;
                        }
                        final String s = string;
                        final int n = -1632;
                        final int n2 = -14106;
                        final String s2 = createString(n, n2);
                        final boolean b = s.contains(s2);
                        if (!b) {
                            break Label_0145;
                        }
                        break Label_0145;
                    }
                    catch (final NumberFormatException ex2) {
                        throw computeThrowable(ex2);
                    }
                    try {
                        final String s = string;
                        final int n = -1632;
                        final int n2 = -14106;
                        final String s2 = createString(n, n2);
                        final boolean b = s.contains(s2);
                        if (!b) {
                            continue;
                        }
                    }
                    catch (final NumberFormatException ex3) {
                        throw computeThrowable(ex3);
                    }
                }
                CalcGSub_8.class310.field_1761.method_2906(CalcGSub_8.class310.field_1724.field_7512.field_7763, 47, 1, class_1713.field_7794, (class_1657)CalcGSub_8.class310.field_1724);
                this.intValue = 5;
                return;
            }
        }
        int i = 0;
        while (i < 44) {
            final class_1799 method_7678 = class_1707.method_7611(i).method_7677();
            Block_7: {
                Label_0297: {
                    try {
                        if (!this.checkClass_1799(method_7678)) {
                            break Label_0297;
                        }
                    }
                    catch (final NumberFormatException ex4) {
                        throw computeThrowable(ex4);
                    }
                    break Block_7;
                }
                ++i;
                continue;
            }
            try {
                if (this.boolFlag) {
                    CalcGSub_8.class310.field_1761.method_2906(CalcGSub_8.class310.field_1724.field_7512.field_7763, i, 1, class_1713.field_7794, (class_1657)CalcGSub_8.class310.field_1724);
                    this.boolFlag = false;
                    return;
                }
            }
            catch (final NumberFormatException ex5) {
                throw computeThrowable(ex5);
            }
            this.boolFlag = true;
            this.intValue = this.bindK_1.getValue().intValue();
            return;
        }
        try {
            if (this.boolFlag_2) {
                this.boolFlag_2 = false;
                this.strValue = "";
                CalcGSub_8.class310.field_1724.method_7346();
                return;
            }
        }
        catch (final NumberFormatException ex6) {
            throw computeThrowable(ex6);
        }
        CalcGSub_8.class310.field_1761.method_2906(CalcGSub_8.class310.field_1724.field_7512.field_7763, 49, 1, class_1713.field_7794, (class_1657)CalcGSub_8.class310.field_1724);
        this.intValue = this.bindK.getValue().intValue();
    }
    
    private void setClass_1707_1(final class_1707 class_1707) {
        final class_1799 method_7677 = class_1707.method_7611(13).method_7677();
        Label_0081: {
            Label_0035: {
                try {
                    if (method_7677.method_31574(class_1802.field_8162)) {
                        break Label_0081;
                    }
                    final CalcGSub_8 calcGSub_8 = this;
                    final class_1799 class_1708 = method_7677;
                    final boolean b = calcGSub_8.checkClass_1799(class_1708);
                    if (b) {
                        break Label_0035;
                    }
                    break Label_0081;
                }
                catch (final NumberFormatException ex) {
                    throw computeThrowable(ex);
                }
                try {
                    final CalcGSub_8 calcGSub_8 = this;
                    final class_1799 class_1708 = method_7677;
                    final boolean b = calcGSub_8.checkClass_1799(class_1708);
                    if (b) {
                        CalcGSub_8.class310.field_1761.method_2906(CalcGSub_8.class310.field_1724.field_7512.field_7763, 15, 0, class_1713.field_7790, (class_1657)CalcGSub_8.class310.field_1724);
                        this.intValue = 20;
                    }
                }
                catch (final NumberFormatException ex2) {
                    throw computeThrowable(ex2);
                }
            }
            try {
                if (this.boolFlag_2) {
                    this.boolFlag_2 = false;
                    this.strValue = "";
                }
            }
            catch (final NumberFormatException ex3) {
                throw computeThrowable(ex3);
            }
        }
    }
    
    private double method_double_2(final List<class_2561> list) {
        String s = "";
        String group = "";
        Label_0034: {
            try {
                if (list == null) {
                    return -1.0;
                }
                final List<class_2561> list2 = list;
                final boolean b = list2.isEmpty();
                if (b) {
                    return -1.0;
                }
                break Label_0034;
            }
            catch (final NumberFormatException ex) {
                throw computeThrowable(ex);
            }
            try {
                final List<class_2561> list2 = list;
                final boolean b = list2.isEmpty();
                if (b) {
                    return -1.0;
                }
            }
            catch (final NumberFormatException ex2) {
                throw computeThrowable(ex2);
            }
        }
        final Iterator<class_2561> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String string = iterator.next().getString();
            try {
                if (!string.matches(createString(-1642, 15761))) {
                    continue;
                }
            }
            catch (final NumberFormatException ex3) {
                throw computeThrowable(ex3);
            }
            final Matcher matcher = Pattern.compile(createString(-1646, 16727), 2).matcher(string.replaceAll(createString(-1623, 27666), ""));
            try {
                if (!matcher.find()) {
                    continue;
                }
            }
            catch (final NumberFormatException ex4) {
                throw computeThrowable(ex4);
            }
            group = matcher.group(1);
            String upperCase = null;
            Label_0180: {
                try {
                    if (matcher.group(2) != null) {
                        upperCase = matcher.group(2).toUpperCase();
                        break Label_0180;
                    }
                }
                catch (final NumberFormatException ex5) {
                    throw computeThrowable(ex5);
                }
                upperCase = "";
            }
            s = upperCase;
            break;
        }
        return this.method_double_1(group + s);
    }
    
    private boolean checkClass_1799(final class_1799 class_1799) {
        final List method_7950 = class_1799.method_7950(class_1792$class_9635.field_51353, (class_1657)CalcGSub_8.class310.field_1724, (class_1836)class_1836.field_41070);
        if (!this.procF.getSet().isEmpty()) {
            return this.checkCondition(class_1799, method_7950);
        }
        Label_0078: {
            try {
                if (this.procF.isEnabled()) {
                    break Label_0078;
                }
                final class_1799 class_1800 = class_1799;
                final CalcGSub_8 calcGSub_8 = this;
                final RenderASub_13 renderASub_13 = calcGSub_8.stepG;
                final class_1792 class_1801 = renderASub_13.getClass_1792();
                final boolean b = class_1800.method_31574(class_1801);
                if (!b) {
                    return false;
                }
                break Label_0078;
            }
            catch (final NumberFormatException ex) {
                throw computeThrowable(ex);
            }
            try {
                final class_1799 class_1800 = class_1799;
                final CalcGSub_8 calcGSub_8 = this;
                final RenderASub_13 renderASub_13 = calcGSub_8.stepG;
                final class_1792 class_1801 = renderASub_13.getClass_1792();
                final boolean b = class_1800.method_31574(class_1801);
                if (!b) {
                    return false;
                }
                break Label_0078;
            }
            catch (final NumberFormatException ex2) {
                throw computeThrowable(ex2);
            }
            try {
                if (!class_1799.method_31574(this.stepG.getClass_1792())) {
                    return false;
                }
            }
            catch (final NumberFormatException ex3) {
                throw computeThrowable(ex3);
            }
        }
        final double n = this.method_double_2(method_7950) / class_1799.method_7947();
        final double method_double_1 = this.method_double_1(this.eventQ.getValue());
        boolean b2 = false;
        Label_0255: {
            Label_0239: {
                Label_0233: {
                    Label_0183: {
                        Label_0177: {
                            try {
                                if (method_double_1 != -1.0) {
                                    break Label_0183;
                                }
                                if (CalcGSub_8.class310.field_1724 == null) {
                                    break Label_0177;
                                }
                            }
                            catch (final NumberFormatException ex4) {
                                throw computeThrowable(ex4);
                            }
                            CalcGSub_8.class310.field_1724.method_7353(class_2561.method_30163(createString(-1657, -7878)), true);
                        }
                        this.execute_2();
                        return false;
                        try {
                            if (n != -1.0) {
                                break Label_0239;
                            }
                            if (CalcGSub_8.class310.field_1724 == null) {
                                break Label_0233;
                            }
                        }
                        catch (final NumberFormatException ex5) {
                            throw computeThrowable(ex5);
                        }
                    }
                    CalcGSub_8.class310.field_1724.method_7353(class_2561.method_30163(createString(-1627, 15432)), true);
                }
                this.execute_2();
                return false;
                try {
                    if (n <= method_double_1) {
                        b2 = true;
                        break Label_0255;
                    }
                }
                catch (final NumberFormatException ex6) {
                    throw computeThrowable(ex6);
                }
            }
            b2 = false;
        }
        final boolean b3 = b2;
        try {
            if (!b3) {
                return false;
            }
        }
        catch (final NumberFormatException ex7) {
            throw computeThrowable(ex7);
        }
        return this.checkClass_1799_1(class_1799);
    }
    
    private boolean checkCondition(final class_1799 p0, final List<class_2561> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   net/minecraft/class_1799.method_7909:()Lnet/minecraft/class_1792;
        //     4: astore_3       
        //     5: aload_3        
        //     6: getstatic       net/minecraft/class_1802.field_22024:Lnet/minecraft/class_1792;
        //     9: if_acmpne       20
        //    12: iconst_1       
        //    13: goto            21
        //    16: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    19: athrow         
        //    20: iconst_0       
        //    21: istore          4
        //    23: aload_3        
        //    24: getstatic       net/minecraft/class_1802.field_22025:Lnet/minecraft/class_1792;
        //    27: if_acmpne       38
        //    30: iconst_1       
        //    31: goto            39
        //    34: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    37: athrow         
        //    38: iconst_0       
        //    39: istore          5
        //    41: aload_3        
        //    42: getstatic       net/minecraft/class_1802.field_22023:Lnet/minecraft/class_1792;
        //    45: if_acmpne       56
        //    48: iconst_1       
        //    49: goto            57
        //    52: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    55: athrow         
        //    56: iconst_0       
        //    57: istore          6
        //    59: aload_1        
        //    60: invokevirtual   net/minecraft/class_1799.method_7964:()Lnet/minecraft/class_2561;
        //    63: invokeinterface net/minecraft/class_2561.getString:()Ljava/lang/String;
        //    68: astore          7
        //    70: aload_0        
        //    71: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //    74: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.isEnabled_1:()Z
        //    77: ifeq            122
        //    80: iload           4
        //    82: ifeq            116
        //    85: goto            92
        //    88: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    91: athrow         
        //    92: aload           7
        //    94: sipush          -1639
        //    97: sipush          1667
        //   100: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //   103: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   106: ifne            421
        //   109: goto            116
        //   112: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   115: athrow         
        //   116: iconst_0       
        //   117: ireturn        
        //   118: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   121: athrow         
        //   122: aload_0        
        //   123: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   126: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.isEnabled_2:()Z
        //   129: ifeq            174
        //   132: iload           5
        //   134: ifeq            168
        //   137: goto            144
        //   140: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   143: athrow         
        //   144: aload           7
        //   146: sipush          -1607
        //   149: sipush          -1544
        //   152: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //   155: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   158: ifne            421
        //   161: goto            168
        //   164: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   167: athrow         
        //   168: iconst_0       
        //   169: ireturn        
        //   170: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   173: athrow         
        //   174: aload_0        
        //   175: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   178: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.isEnabled_3:()Z
        //   181: ifeq            226
        //   184: iload           5
        //   186: ifeq            220
        //   189: goto            196
        //   192: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   195: athrow         
        //   196: aload           7
        //   198: sipush          -1607
        //   201: sipush          -1544
        //   204: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //   207: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   210: ifne            421
        //   213: goto            220
        //   216: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   219: athrow         
        //   220: iconst_0       
        //   221: ireturn        
        //   222: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   225: athrow         
        //   226: aload_0        
        //   227: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   230: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.isEnabled_4:()Z
        //   233: ifeq            278
        //   236: iload           6
        //   238: ifeq            272
        //   241: goto            248
        //   244: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   247: athrow         
        //   248: aload           7
        //   250: sipush          -1607
        //   253: sipush          -1544
        //   256: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //   259: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   262: ifne            421
        //   265: goto            272
        //   268: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   271: athrow         
        //   272: iconst_0       
        //   273: ireturn        
        //   274: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   277: athrow         
        //   278: aload_0        
        //   279: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   282: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.getSet:()Ljava/util/Set;
        //   285: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   290: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   295: checkcast       Ljava/lang/String;
        //   298: astore          8
        //   300: aload           7
        //   302: aload           8
        //   304: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   307: ifne            316
        //   310: iconst_0       
        //   311: ireturn        
        //   312: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   315: athrow         
        //   316: aload           8
        //   318: sipush          -1608
        //   321: sipush          -22153
        //   324: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //   327: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   330: ifeq            351
        //   333: iload           4
        //   335: ifne            351
        //   338: goto            345
        //   341: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   344: athrow         
        //   345: iconst_0       
        //   346: ireturn        
        //   347: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   350: athrow         
        //   351: aload           8
        //   353: sipush          -1637
        //   356: sipush          9680
        //   359: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //   362: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   365: ifeq            386
        //   368: iload           5
        //   370: ifne            386
        //   373: goto            380
        //   376: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   379: athrow         
        //   380: iconst_0       
        //   381: ireturn        
        //   382: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   385: athrow         
        //   386: aload           8
        //   388: sipush          -1617
        //   391: sipush          6376
        //   394: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.createString:(II)Ljava/lang/String;
        //   397: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   400: ifeq            421
        //   403: iload           6
        //   405: ifne            421
        //   408: goto            415
        //   411: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   414: athrow         
        //   415: iconst_0       
        //   416: ireturn        
        //   417: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   420: athrow         
        //   421: aload_0        
        //   422: aload_0        
        //   423: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.eventQ_2:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   426: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //   429: checkcast       Ljava/lang/String;
        //   432: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.method_double_1:(Ljava/lang/String;)D
        //   435: dstore          8
        //   437: dload           8
        //   439: dconst_0       
        //   440: dcmpl          
        //   441: ifle            465
        //   444: aload_0        
        //   445: aload_2        
        //   446: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.method_double:(Ljava/util/List;)D
        //   449: dstore          10
        //   451: dload           10
        //   453: dload           8
        //   455: dcmpg          
        //   456: ifge            465
        //   459: iconst_0       
        //   460: ireturn        
        //   461: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   464: athrow         
        //   465: aload_0        
        //   466: aload_2        
        //   467: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.method_double_2:(Ljava/util/List;)D
        //   470: aload_1        
        //   471: invokevirtual   net/minecraft/class_1799.method_7947:()I
        //   474: i2d            
        //   475: ddiv           
        //   476: dstore          10
        //   478: aload_0        
        //   479: aload_0        
        //   480: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.eventQ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   483: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //   486: checkcast       Ljava/lang/String;
        //   489: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.method_double_1:(Ljava/lang/String;)D
        //   492: dstore          12
        //   494: dload           10
        //   496: ldc2_w          -1.0
        //   499: dcmpl          
        //   500: ifeq            542
        //   503: dload           12
        //   505: ldc2_w          -1.0
        //   508: dcmpl          
        //   509: ifeq            542
        //   512: goto            519
        //   515: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   518: athrow         
        //   519: dload           10
        //   521: dload           12
        //   523: dcmpg          
        //   524: ifgt            542
        //   527: goto            534
        //   530: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   533: athrow         
        //   534: iconst_1       
        //   535: goto            543
        //   538: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   541: athrow         
        //   542: iconst_0       
        //   543: istore          14
        //   545: iload           14
        //   547: ireturn        
        //    Signature:
        //  (Lnet/minecraft/class_1799;Ljava/util/List<Lnet/minecraft/class_2561;>;)Z
        //    StackMapTable: 00 38 FF 00 10 00 04 07 00 02 07 02 57 07 01 B0 07 01 12 00 01 07 00 E1 03 40 01 FF 00 0C 00 05 07 00 02 07 02 57 07 01 B0 07 01 12 01 00 01 07 00 E1 03 40 01 FF 00 0C 00 06 07 00 02 07 02 57 07 01 B0 07 01 12 01 01 00 01 07 00 E1 03 40 01 FF 00 1E 00 08 07 00 02 07 02 57 07 01 B0 07 01 12 01 01 01 07 00 E9 00 01 07 00 E1 03 53 07 00 E1 03 41 07 00 E1 03 51 07 00 E1 03 53 07 00 E1 03 41 07 00 E1 03 51 07 00 E1 03 53 07 00 E1 03 41 07 00 E1 03 51 07 00 E1 03 53 07 00 E1 03 41 07 00 E1 03 FF 00 21 00 09 07 00 02 07 02 57 07 01 B0 07 01 12 01 01 01 07 00 E9 07 00 E9 00 01 07 00 E1 03 58 07 00 E1 03 41 07 00 E1 03 58 07 00 E1 03 41 07 00 E1 03 58 07 00 E1 03 41 07 00 E1 FA 00 03 FF 00 27 00 0A 07 00 02 07 02 57 07 01 B0 07 01 12 01 01 01 07 00 E9 03 03 00 01 07 00 E1 FA 00 03 FF 00 31 00 0B 07 00 02 07 02 57 07 01 B0 07 01 12 01 01 01 07 00 E9 03 03 03 00 01 07 00 E1 03 4A 07 00 E1 03 43 07 00 E1 03 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      16     16     20     Ljava/lang/NumberFormatException;
        //  23     34     34     38     Ljava/lang/NumberFormatException;
        //  41     52     52     56     Ljava/lang/NumberFormatException;
        //  70     85     88     92     Ljava/lang/NumberFormatException;
        //  80     109    112    116    Ljava/lang/NumberFormatException;
        //  92     118    118    122    Ljava/lang/NumberFormatException;
        //  122    137    140    144    Ljava/lang/NumberFormatException;
        //  132    161    164    168    Ljava/lang/NumberFormatException;
        //  144    170    170    174    Ljava/lang/NumberFormatException;
        //  174    189    192    196    Ljava/lang/NumberFormatException;
        //  184    213    216    220    Ljava/lang/NumberFormatException;
        //  196    222    222    226    Ljava/lang/NumberFormatException;
        //  226    241    244    248    Ljava/lang/NumberFormatException;
        //  236    265    268    272    Ljava/lang/NumberFormatException;
        //  248    274    274    278    Ljava/lang/NumberFormatException;
        //  300    312    312    316    Ljava/lang/NumberFormatException;
        //  316    338    341    345    Ljava/lang/NumberFormatException;
        //  333    347    347    351    Ljava/lang/NumberFormatException;
        //  351    373    376    380    Ljava/lang/NumberFormatException;
        //  368    382    382    386    Ljava/lang/NumberFormatException;
        //  386    408    411    415    Ljava/lang/NumberFormatException;
        //  403    417    417    421    Ljava/lang/NumberFormatException;
        //  451    461    461    465    Ljava/lang/NumberFormatException;
        //  494    512    515    519    Ljava/lang/NumberFormatException;
        //  503    527    530    534    Ljava/lang/NumberFormatException;
        //  519    538    538    542    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0092:
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
    
    private double method_double(final List<class_2561> list) {
        final Pattern compile = Pattern.compile(createString(-1643, 12038));
        final Pattern compile2 = Pattern.compile(createString(-1651, 692));
        boolean b = false;
        final Iterator<class_2561> iterator = list.iterator();
        while (iterator.hasNext()) {
            final String string = iterator.next().getString();
            if (compile.matcher(string).find()) {
                b = true;
            }
            else {
                if (!b) {
                    continue;
                }
                final Matcher matcher = compile2.matcher(string);
                if (matcher.find()) {
                    return Integer.parseInt(matcher.group(1)) * 24 * 60 + Integer.parseInt(matcher.group(2)) * 60 + Integer.parseInt(matcher.group(3));
                }
                break;
            }
        }
        return 0.0;
    }
    
    private boolean checkClass_1799_1(final class_1799 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //     8: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.getList:()Ljava/util/List;
        //    11: invokeinterface java/util/List.isEmpty:()Z
        //    16: aload_2        
        //    17: ifnull          44
        //    20: ifeq            60
        //    23: goto            30
        //    26: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    29: athrow         
        //    30: aload_0        
        //    31: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //    34: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.isEnabled:()Z
        //    37: goto            44
        //    40: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    43: athrow         
        //    44: aload_2        
        //    45: ifnull          59
        //    48: ifeq            60
        //    51: goto            58
        //    54: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    57: athrow         
        //    58: iconst_1       
        //    59: ireturn        
        //    60: new             Ljava/util/HashMap;
        //    63: dup            
        //    64: invokespecial   java/util/HashMap.<init>:()V
        //    67: astore_3       
        //    68: aload_1        
        //    69: invokevirtual   net/minecraft/class_1799.method_58657:()Lnet/minecraft/class_9304;
        //    72: invokevirtual   net/minecraft/class_9304.method_57534:()Ljava/util/Set;
        //    75: aload_3        
        //    76: aload_1        
        //    77: invokedynamic   BootstrapMethod #7, accept:(Ljava/util/Map;Lnet/minecraft/class_1799;)Ljava/util/function/Consumer;
        //    82: invokeinterface java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        //    87: aload_3        
        //    88: aload_2        
        //    89: ifnull          115
        //    92: invokeinterface java/util/Map.isEmpty:()Z
        //    97: ifne            164
        //   100: goto            107
        //   103: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   106: athrow         
        //   107: aload_3        
        //   108: goto            115
        //   111: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   114: athrow         
        //   115: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   120: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   125: astore          4
        //   127: aload           4
        //   129: invokeinterface java/util/Iterator.hasNext:()Z
        //   134: ifeq            164
        //   137: aload           4
        //   139: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   144: checkcast       Ljava/util/Map$Entry;
        //   147: astore          5
        //   149: aload_2        
        //   150: ifnull          178
        //   153: aload_2        
        //   154: ifnonnull       127
        //   157: goto            164
        //   160: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   163: athrow         
        //   164: aload_0        
        //   165: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   168: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.getList:()Ljava/util/List;
        //   171: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   176: astore          4
        //   178: aload           4
        //   180: invokeinterface java/util/Iterator.hasNext:()Z
        //   185: ifeq            239
        //   188: aload           4
        //   190: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   195: checkcast       Lnet/minecraft/class_5321;
        //   198: astore          5
        //   200: aload_3        
        //   201: aload           5
        //   203: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   208: aload_2        
        //   209: ifnull          251
        //   212: aload_2        
        //   213: ifnull          234
        //   216: goto            223
        //   219: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   222: athrow         
        //   223: ifeq            235
        //   226: goto            233
        //   229: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   232: athrow         
        //   233: iconst_0       
        //   234: ireturn        
        //   235: aload_2        
        //   236: ifnonnull       178
        //   239: aload_0        
        //   240: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   243: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.getList:()Ljava/util/List;
        //   246: invokeinterface java/util/List.isEmpty:()Z
        //   251: aload_2        
        //   252: ifnull          640
        //   255: ifne            639
        //   258: goto            265
        //   261: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   264: athrow         
        //   265: aload_0        
        //   266: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.buffC_1:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   269: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //   272: checkcast       Ljava/lang/Boolean;
        //   275: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   278: aload_2        
        //   279: ifnull          488
        //   282: goto            289
        //   285: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   288: athrow         
        //   289: ifeq            480
        //   292: goto            299
        //   295: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   298: athrow         
        //   299: aload_3        
        //   300: invokeinterface java/util/Map.size:()I
        //   305: aload_2        
        //   306: ifnull          346
        //   309: goto            316
        //   312: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   315: athrow         
        //   316: aload_0        
        //   317: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   320: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.getList:()Ljava/util/List;
        //   323: invokeinterface java/util/List.size:()I
        //   328: if_icmpeq       347
        //   331: goto            338
        //   334: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   337: athrow         
        //   338: iconst_0       
        //   339: goto            346
        //   342: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   345: athrow         
        //   346: ireturn        
        //   347: aload_0        
        //   348: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   351: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.getList:()Ljava/util/List;
        //   354: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   359: astore          4
        //   361: aload           4
        //   363: invokeinterface java/util/Iterator.hasNext:()Z
        //   368: ifeq            476
        //   371: aload           4
        //   373: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   378: checkcast       Lnet/minecraft/class_5321;
        //   381: astore          5
        //   383: aload_3        
        //   384: aload           5
        //   386: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   391: aload_2        
        //   392: ifnull          640
        //   395: aload_2        
        //   396: ifnull          432
        //   399: goto            406
        //   402: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   405: athrow         
        //   406: ifne            418
        //   409: goto            416
        //   412: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   415: athrow         
        //   416: iconst_0       
        //   417: ireturn        
        //   418: aload_3        
        //   419: aload           5
        //   421: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   426: checkcast       Ljava/lang/Integer;
        //   429: invokevirtual   java/lang/Integer.intValue:()I
        //   432: istore          6
        //   434: iload           6
        //   436: aload_2        
        //   437: ifnull          471
        //   440: aload_0        
        //   441: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.bindK_3:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   444: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.getValue:()Ljava/lang/Object;
        //   447: checkcast       Ljava/lang/Double;
        //   450: invokevirtual   java/lang/Double.intValue:()I
        //   453: if_icmpge       472
        //   456: goto            463
        //   459: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   462: athrow         
        //   463: iconst_0       
        //   464: goto            471
        //   467: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   470: athrow         
        //   471: ireturn        
        //   472: aload_2        
        //   473: ifnonnull       361
        //   476: aload_2        
        //   477: ifnonnull       639
        //   480: iconst_0       
        //   481: goto            488
        //   484: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   487: athrow         
        //   488: istore          4
        //   490: aload_0        
        //   491: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.procF:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   494: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.getList:()Ljava/util/List;
        //   497: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   502: astore          5
        //   504: aload           5
        //   506: invokeinterface java/util/Iterator.hasNext:()Z
        //   511: ifeq            636
        //   514: aload           5
        //   516: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   521: checkcast       Lnet/minecraft/class_5321;
        //   524: astore          6
        //   526: aload_3        
        //   527: aload           6
        //   529: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   534: aload_2        
        //   535: ifnull          638
        //   538: aload_2        
        //   539: ifnull          580
        //   542: goto            549
        //   545: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   548: athrow         
        //   549: ifeq            625
        //   552: goto            559
        //   555: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   558: athrow         
        //   559: aload_3        
        //   560: aload           6
        //   562: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   567: checkcast       Ljava/lang/Integer;
        //   570: invokevirtual   java/lang/Integer.intValue:()I
        //   573: goto            580
        //   576: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   579: athrow         
        //   580: istore          7
        //   582: iload           7
        //   584: aload_2        
        //   585: ifnull          619
        //   588: aload_0        
        //   589: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.bindK_3:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   592: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.getValue:()Ljava/lang/Object;
        //   595: checkcast       Ljava/lang/Double;
        //   598: invokevirtual   java/lang/Double.intValue:()I
        //   601: if_icmplt       625
        //   604: goto            611
        //   607: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   610: athrow         
        //   611: iconst_1       
        //   612: goto            619
        //   615: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   618: athrow         
        //   619: istore          4
        //   621: aload_2        
        //   622: ifnonnull       636
        //   625: aload_2        
        //   626: ifnonnull       504
        //   629: goto            636
        //   632: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_8.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   635: athrow         
        //   636: iload           4
        //   638: ireturn        
        //   639: iconst_1       
        //   640: ireturn        
        //   641: astore_3       
        //   642: iconst_0       
        //   643: ireturn        
        //    StackMapTable: 00 47 FF 00 1A 00 03 07 00 02 07 02 57 07 02 E6 00 01 07 02 21 03 49 07 02 21 43 01 49 07 02 21 03 40 01 00 FF 00 2A 00 04 07 00 02 07 02 57 07 02 E6 07 00 A1 00 01 07 02 21 03 43 07 02 21 43 07 00 A1 FC 00 0B 07 01 5E FF 00 20 00 06 07 00 02 07 02 57 07 02 E6 07 00 A1 07 01 5E 07 02 37 00 01 07 02 21 F9 00 03 FC 00 0D 07 01 5E FF 00 28 00 06 07 00 02 07 02 57 07 02 E6 07 00 A1 07 01 5E 07 01 B6 00 01 07 02 21 43 01 45 07 02 21 03 40 01 00 FA 00 03 4B 01 49 07 02 21 03 53 07 02 21 43 01 45 07 02 21 03 4C 07 02 21 43 01 51 07 02 21 03 43 07 02 21 43 01 00 0D FF 00 28 00 06 07 00 02 07 02 57 07 02 E6 07 00 A1 07 01 5E 07 01 B6 00 01 07 02 21 43 01 45 07 02 21 03 01 4D 01 FF 00 1A 00 07 07 00 02 07 02 57 07 02 E6 07 00 A1 07 01 5E 07 01 B6 01 00 01 07 02 21 03 43 07 02 21 43 01 00 F9 00 03 03 43 07 02 21 43 01 FF 00 0F 00 06 07 00 02 07 02 57 07 02 E6 07 00 A1 01 07 01 5E 00 00 FF 00 28 00 07 07 00 02 07 02 57 07 02 E6 07 00 A1 01 07 01 5E 07 01 B6 00 01 07 02 21 43 01 45 07 02 21 03 50 07 02 21 43 01 FF 00 1A 00 08 07 00 02 07 02 57 07 02 E6 07 00 A1 01 07 01 5E 07 01 B6 01 00 01 07 02 21 03 43 07 02 21 43 01 FA 00 05 46 07 02 21 FA 00 03 41 01 FF 00 00 00 05 07 00 02 07 02 57 07 02 E6 07 00 A1 07 01 5E 00 00 40 01 FF 00 00 00 01 07 00 02 00 01 07 02 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  44     51     54     58     Ljava/lang/Exception;
        //  20     37     40     44     Ljava/lang/Exception;
        //  4      23     26     30     Ljava/lang/Exception;
        //  4      59     641    644    Ljava/lang/Exception;
        //  212    226    229    233    Ljava/lang/Exception;
        //  200    216    219    223    Ljava/lang/Exception;
        //  149    157    160    164    Ljava/lang/Exception;
        //  92     108    111    115    Ljava/lang/Exception;
        //  68     100    103    107    Ljava/lang/Exception;
        //  60     234    641    644    Ljava/lang/Exception;
        //  316    339    342    346    Ljava/lang/Exception;
        //  299    331    334    338    Ljava/lang/Exception;
        //  289    309    312    316    Ljava/lang/Exception;
        //  265    292    295    299    Ljava/lang/Exception;
        //  255    282    285    289    Ljava/lang/Exception;
        //  251    258    261    265    Ljava/lang/Exception;
        //  235    346    641    644    Ljava/lang/Exception;
        //  395    409    412    416    Ljava/lang/Exception;
        //  383    399    402    406    Ljava/lang/Exception;
        //  347    417    641    644    Ljava/lang/Exception;
        //  440    464    467    471    Ljava/lang/Exception;
        //  434    456    459    463    Ljava/lang/Exception;
        //  418    471    641    644    Ljava/lang/Exception;
        //  621    629    632    636    Ljava/lang/Exception;
        //  588    612    615    619    Ljava/lang/Exception;
        //  582    604    607    611    Ljava/lang/Exception;
        //  549    573    576    580    Ljava/lang/Exception;
        //  538    552    555    559    Ljava/lang/Exception;
        //  526    542    545    549    Ljava/lang/Exception;
        //  476    481    484    488    Ljava/lang/Exception;
        //  472    638    641    644    Ljava/lang/Exception;
        //  639    640    641    644    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0265:
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
    
    private double method_double_1(final String s) {
        try {
            if (s == null) {
                return -1.0;
            }
        }
        catch (final NumberFormatException ex) {
            throw computeThrowable(ex);
        }
        try {
            if (s.isEmpty()) {
                return -1.0;
            }
        }
        catch (final NumberFormatException ex2) {
            throw computeThrowable(ex2);
        }
        String s2 = s.trim().toUpperCase();
        double n = 1.0;
        if (s2.endsWith("B")) {
            n = 1.0E9;
            s2 = s2.substring(0, s2.length() - 1);
        }
        else if (s2.endsWith("M")) {
            n = 1000000.0;
            s2 = s2.substring(0, s2.length() - 1);
        }
        else if (s2.endsWith("K")) {
            n = 1000.0;
            s2 = s2.substring(0, s2.length() - 1);
        }
        try {
            return Double.parseDouble(s2) * n;
        }
        catch (final NumberFormatException ex3) {
            return -1.0;
        }
    }
    
    private String computeString(final double d) {
        if (d >= 1.0E9) {
            return String.format(createString(-1622, -29075), d / 1.0E9);
        }
        if (d >= 1000000.0) {
            return String.format(createString(-1630, -19719), d / 1000000.0);
        }
        if (d >= 1000.0) {
            return String.format(createString(-1641, 30312), d / 1000.0);
        }
        return String.format(createString(-1614, -21546), d);
    }
    
    private static void lambda$checkEnchantmentFilter$4(final Map map, final class_1799 class_1799, final class_6880 class_1800) {
        class_1800.method_40230().ifPresent(CalcGSub_8::lambda$checkEnchantmentFilter$3);
    }
    
    private static void lambda$checkEnchantmentFilter$3(final Map map, final class_1799 class_1799, final class_6880 class_1800, final class_5321 class_1801) {
        map.put(class_1801, class_1799.method_58657().method_57536(class_1800));
    }
    
    private List lambda$queryApi$2() {
        try {
            final HttpResponse<String> send = this.httpClient.send(HttpRequest.newBuilder().uri(URI.create(Initializer_21.computeString(createString(-1626, 1077)))).header(createString(-1624, -17225), createString(-1659, -17882) + (String)this.eventQ_1.getValue()).header(createString(-1603, 13284), createString(-1620, -12112)).POST(HttpRequest.BodyPublishers.ofString(createString(-1658, 20678))).build(), HttpResponse.BodyHandlers.ofString());
            Label_0222: {
                Label_0207: {
                    Label_0155: {
                        try {
                            if (send.statusCode() == 200) {
                                break Label_0222;
                            }
                            final CalcGSub_8 calcGSub_8 = this;
                            final RenderASub_1 renderASub_1 = calcGSub_8.buffC;
                            final Boolean b = renderASub_1.getValue();
                            final Boolean b2 = b;
                            final boolean b3 = b2;
                            if (b3) {
                                break Label_0155;
                            }
                            break Label_0207;
                        }
                        catch (final Throwable t) {
                            throw computeThrowable(t);
                        }
                        try {
                            final CalcGSub_8 calcGSub_8 = this;
                            final RenderASub_1 renderASub_1 = calcGSub_8.buffC;
                            final Boolean b = renderASub_1.getValue();
                            final Boolean b2 = b;
                            final boolean b3 = b2;
                            if (!b3) {
                                break Label_0207;
                            }
                            if (CalcGSub_8.class310.field_1724 == null) {
                                break Label_0207;
                            }
                        }
                        catch (final Throwable t2) {
                            throw computeThrowable(t2);
                        }
                    }
                    CalcGSub_8.class310.field_1724.method_7353(class_2561.method_30163(createString(-1649, -3141) + send.statusCode()), false);
                }
                final ArrayList list = new ArrayList();
                this.boolFlag_1 = false;
                return list;
            }
            final JsonArray asJsonArray = ((JsonObject)this.gson.fromJson((String)send.body(), (Class)JsonObject.class)).getAsJsonArray(createString(-1634, 2772));
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = asJsonArray.iterator();
            while (iterator.hasNext()) {
                list2.add(((JsonElement)iterator.next()).getAsJsonObject());
            }
            this.boolFlag_1 = false;
            return list2;
        }
        catch (final Throwable t3) {
            return List.of();
        }
    }
    
    private static String lambda$constructSearchCommand$1(final String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
    
    private static String lambda$constructSearchCommand$0(final String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
    
    private static Throwable computeThrowable(final Throwable t) {
        return t;
    }
    
    static {
        final String[] strArr2 = new String[60];
        int n = 0;
        String s;
        int n2 = (s = "K¬\u0092\u00d0\u009a'\u001c\u00c9cw'²\u0019\u00df\u001cj\u0089\u009d\u0080\u00d5§w\u0086\"\u0094º\u00e0?Y\u00f5}\u009f\u00ee\u0016\u009e\u0090\u00cc\u00c4+k.\u00dc\u00c0/<\r+©«\u0013\u00d0|¯O»\u0018J\u00c1\u0080\u0004 «z\u00c0\r/\u00e7_\u00ce\u00e7\u001d\u00c2\u008f\u00fa\u0011\u0011i\u007f\u0002\u00d7 \u0004\u0018\u009f3\u0089\u0004bfO\u00dc\fqv\u00db¥\u00d7qS]«\u00eaF\u0004\u0012\u001f[\u009du\"\u00caoa\u00d3>T\u00ecª,,y\u00c6®\u0005,3\u0006¤\u008b\u0015\u0007\u00d0\u00da\u00e3\u00d7g`\u00da\r\u00e0\u0005¸n\u00ad\u008dY·\u00f7/\u0003%\u0014\u00e2\u00cc\u209d\u00c7T\u00f9]J\u2038:+\u20ca\u00dc\u0163?µ·´5\u2020\u0007\u00e9\u00e4´.\u0092\u00ean\u0007\u00daK\u00ebª\u0018EL\u0010\u0096\u00de\u00e1®-\u00cc\u00f4\u00ec\u00f1b\u0002T\u0018x%¨\u001a¢\u00f3\u00f2!\u00e0Q\u008d³w\u0097y7\u0018g\u00d4!\u00c0\u00e9w\u00fb\u0013\u0012[\u00c1©s\tst\u00ad\u00e8\u00cd\r\r\u00f4V\u00042\u0096\u00cbg<¥\u00f8h\u00c2¦=\u0098²8\u008e\u0087|a\u001f¸\u0087\u00e4$D\u001bW5¥\u00c2OD\u00faV\u00d6\u0099!7n\\\u00d6M\u007ffrl=¦\u001bj\u009bC\u008f\u00e1¢\u00c3\u0004\u0099¾\u009cF\u0092\u00fdB1\u0093\u0003\u00ef\u000b \u0005r\u00f1\u000e²\u008a\f\u0081¶\u00d0\u0098]R\u009c4>f_1\u0005\u0000¨\u0003\u00053G¨\u00f9/\u009aMµ\u00d0\u00c3\"¬¢º\u00dcz\u001e¨\u009a\u00d6h\u00d1\u00e2\\g\u001f/©\u00ff¬\u00f3]§µ\u0016¦\u009b\u0095*«\u00f9\u0003\u00c6%\u000bd·\u0084¶c\u0006\u00c0MS\u001fTU\u008e\u00fby&;\u00e6\u0017\t\u008a\u0002~\u0098\u0018\u000f\u0080=\u0010f-A*U\u0096\u009bT8¯°2\u008e\u00ebda\u0006\u0011\u0080\u00c4\u009e\u0015V\u0004\u00d2[\u00cba\u0004r\u00d9\u00eaR\r\u00ed\u00d8\u00105\u00fd\u00e0@§B\u0005\u00f1_E\r\u00d0\u00e2¼\u0003)\u0015´;A\u0081\u0086\u0005 \u0005\u00c9_:\u00fb\u001b\u000e)\u009e\u00c0\u00e1³\u0083#2¶\u0099\u00c4\u0006f\u00e1\u0003 2\u00d9\u0005\u00f6\u0091\u00dd\"\u00ee\u0016\u00867$\u008a\u0084&\u001f$\u009bk\u00cfT\u0012c\u00980\u00adf\u009e\u00d6>\u00ad\t\u0019\u00f4h\u0016EhPO\u00e6\u0017O;\u00d5\u00ee\u00e9£\u0096\u00c33\u0003\u0095\u0001\u00da\u00fa9\u009e*\u00cd\u0098\u00ad\u0097f\u000f\u0006\u0014\u0080C(\u0086\u00c7\u001e\u00e3\u00f0½\u00d7Wh \u0081|\u0004Af\u00ce\u008c®=ºK\u0018¼h\u0097Wv\u0011\u00d9\u0013\u0096¼t\u0016\u00c1t\u00de\u0001\u0013©\u0002\u00e8U\u0083|\u00e95µv\u0010[\u00e4%X\u009a\u0007\u0015bc\u0095M\u00eeQ\u00e8\u008f\u009b\u00ec¤y\u000eU7\u00fc\u0098\u009d\u00d7_>\u0005\u00fc)8\u00e7L\u0006´\u000fi\u00c06\u00e6\u0014\u00c8\u0018\u20d8]\u00fcªH \u209aw\u007f\u2063V\u0156n\u0013\u009d`p\u20ba\u0010[\u00c8\u00fb\u00fe'\u00cf\u008e¿q\b\u0012V$\u009b\u00154\u0003f\u0090p\u0005ª\u0097\u0015~\u00e9\u00071\u00f0\u00fd8\u00fd\u0018B\u000f§\u0013?S\u00ec\u0086F®f\u007f\u001c3\u00e2\n?\r\" \u00e2[\u00e2\u001e\u00cdZn\u00adc\u0080\u001c\u001b|\u00d5X.\u000eb\u00cbqP\u00c1\u00c1Q6\u0092Z\u00804\u000eRª\u0083:/\u008f\u00e6p\u0018\u0002#\u0085\u001d´\t\u00dfª\u00ec\u009b\u00da\u00c0\u0096\u00e4\u0019\u00e7-\u000f$4@hA\u00df\u00d6W\u009b\u00f5\u0088Aj\u008431\u0083\u008c9\u001e\u0012², «\u00db\u0001.&µJ\u0092.m&½¹\u00ad\u0082½\u008c\u0090)\u0095\u0088¹.\u00fd\u001d\u009d\u0094\u00cdYL\f\u00c7\u008e\u00c1f>¸³\u009b\u000f\u0089\u0011K S\u00fd\u00f0¯_§Eªt\u0080bk>]\u00d8\u0018\u00fe>&¦o¯©\u0093§\u00f7Z\u00dd\u00e6n\u0007\u00f2F>\u0097¥¯µ[%\u0002\u0004(").length();
        int n3 = 5;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 3));
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
                        Label_0260: {
                            if (length > 1) {
                                break Label_0260;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 20;
                                    case 1 -> 110;
                                    case 2 -> 81;
                                    case 3 -> 51;
                                    case 4 -> 35;
                                    case 5 -> 84;
                                    default -> 19;
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
                                continue Label_0023;
                            }
                            n2 = (s = "!\u00c6\u00fb\u00c1\u00dc\u00dfcµ\u00c3\u000f S{\u00f4\u0016'\b>\u00ean\u00d0o\u00fc\u0092P¿¼¾\u00de\u00d2)E\u00e0\u00cbuF\u0015").length();
                            n3 = 14;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 23)));
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
        strArr_1 = new String[60];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFF9B5) & 0xFFFF;
        if (CalcGSub_8.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_8.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 159;
                case 1 -> 150;
                case 2 -> 25;
                case 3 -> 242;
                case 4 -> 54;
                case 5 -> 37;
                case 6 -> 147;
                case 7 -> 205;
                case 8 -> 56;
                case 9 -> 178;
                case 10 -> 21;
                case 11 -> 23;
                case 12 -> 79;
                case 13 -> 52;
                case 14 -> 121;
                case 15 -> 241;
                case 16 -> 185;
                case 17 -> 253;
                case 18 -> 8;
                case 19 -> 117;
                case 20 -> 90;
                case 21 -> 39;
                case 22 -> 204;
                case 23 -> 199;
                case 24 -> 38;
                case 25 -> 207;
                case 26 -> 6;
                case 27 -> 179;
                case 28 -> 36;
                case 29 -> 116;
                case 30 -> 42;
                case 31 -> 47;
                case 32 -> 146;
                case 33 -> 106;
                case 34 -> 219;
                case 35 -> 122;
                case 36 -> 211;
                case 37 -> 62;
                case 38 -> 194;
                case 39 -> 112;
                case 40 -> 96;
                case 41 -> 77;
                case 42 -> 215;
                case 43 -> 44;
                case 44 -> 221;
                case 45 -> 144;
                case 46 -> 100;
                case 47 -> 143;
                case 48 -> 145;
                case 49 -> 183;
                case 50 -> 131;
                case 51 -> 78;
                case 52 -> 50;
                case 53 -> 190;
                case 54 -> 87;
                case 55 -> 12;
                case 56 -> 170;
                case 57 -> 186;
                case 58 -> 152;
                case 59 -> 107;
                case 60 -> 217;
                case 61 -> 53;
                case 62 -> 153;
                case 63 -> 86;
                case 64 -> 162;
                case 65 -> 135;
                case 66 -> 232;
                case 67 -> 248;
                case 68 -> 74;
                case 69 -> 187;
                case 70 -> 4;
                case 71 -> 130;
                case 72 -> 240;
                case 73 -> 2;
                case 74 -> 133;
                case 75 -> 34;
                case 76 -> 83;
                case 77 -> 20;
                case 78 -> 214;
                case 79 -> 193;
                case 80 -> 73;
                case 81 -> 203;
                case 82 -> 124;
                case 83 -> 64;
                case 84 -> 58;
                case 85 -> 223;
                case 86 -> 119;
                case 87 -> 110;
                case 88 -> 149;
                case 89 -> 231;
                case 90 -> 92;
                case 91 -> 14;
                case 92 -> 102;
                case 93 -> 70;
                case 94 -> 49;
                case 95 -> 142;
                case 96 -> 0;
                case 97 -> 255;
                case 98 -> 140;
                case 99 -> 233;
                case 100 -> 155;
                case 101 -> 212;
                case 102 -> 191;
                case 103 -> 71;
                case 104 -> 75;
                case 105 -> 22;
                case 106 -> 184;
                case 107 -> 182;
                case 108 -> 125;
                case 109 -> 68;
                case 110 -> 19;
                case 111 -> 209;
                case 112 -> 137;
                case 113 -> 160;
                case 114 -> 245;
                case 115 -> 239;
                case 116 -> 158;
                case 117 -> 134;
                case 118 -> 45;
                case 119 -> 65;
                case 120 -> 246;
                case 121 -> 41;
                case 122 -> 161;
                case 123 -> 177;
                case 124 -> 10;
                case 125 -> 202;
                case 126 -> 40;
                case 127 -> 80;
                case 128 -> 188;
                case 129 -> 115;
                case 130 -> 229;
                case 131 -> 111;
                case 132 -> 24;
                case 133 -> 154;
                case 134 -> 230;
                case 135 -> 109;
                case 136 -> 118;
                case 137 -> 105;
                case 138 -> 129;
                case 139 -> 167;
                case 140 -> 180;
                case 141 -> 227;
                case 142 -> 27;
                case 143 -> 16;
                case 144 -> 66;
                case 145 -> 216;
                case 146 -> 104;
                case 147 -> 95;
                case 148 -> 126;
                case 149 -> 113;
                case 150 -> 15;
                case 151 -> 157;
                case 152 -> 57;
                case 153 -> 1;
                case 154 -> 206;
                case 155 -> 97;
                case 156 -> 213;
                case 157 -> 99;
                case 158 -> 67;
                case 159 -> 208;
                case 160 -> 225;
                case 161 -> 81;
                case 162 -> 198;
                case 163 -> 3;
                case 164 -> 29;
                case 165 -> 251;
                case 166 -> 224;
                case 167 -> 88;
                case 168 -> 174;
                case 169 -> 165;
                case 170 -> 254;
                case 171 -> 168;
                case 172 -> 237;
                case 173 -> 138;
                case 174 -> 169;
                case 175 -> 175;
                case 176 -> 222;
                case 177 -> 28;
                case 178 -> 61;
                case 179 -> 84;
                case 180 -> 101;
                case 181 -> 76;
                case 182 -> 234;
                case 183 -> 7;
                case 184 -> 148;
                case 185 -> 250;
                case 186 -> 196;
                case 187 -> 98;
                case 188 -> 172;
                case 189 -> 197;
                case 190 -> 13;
                case 191 -> 91;
                case 192 -> 5;
                case 193 -> 235;
                case 194 -> 35;
                case 195 -> 226;
                case 196 -> 166;
                case 197 -> 51;
                case 198 -> 9;
                case 199 -> 181;
                case 200 -> 33;
                case 201 -> 17;
                case 202 -> 127;
                case 203 -> 200;
                case 204 -> 195;
                case 205 -> 176;
                case 206 -> 43;
                case 207 -> 171;
                case 208 -> 141;
                case 209 -> 93;
                case 210 -> 132;
                case 211 -> 103;
                case 212 -> 11;
                case 213 -> 139;
                case 214 -> 32;
                case 215 -> 244;
                case 216 -> 18;
                case 217 -> 128;
                case 218 -> 120;
                case 219 -> 218;
                case 220 -> 85;
                case 221 -> 63;
                case 222 -> 114;
                case 223 -> 69;
                case 224 -> 94;
                case 225 -> 164;
                case 226 -> 247;
                case 227 -> 59;
                case 228 -> 48;
                case 229 -> 55;
                case 230 -> 26;
                case 231 -> 189;
                case 232 -> 108;
                case 233 -> 243;
                case 234 -> 151;
                case 235 -> 46;
                case 236 -> 60;
                case 237 -> 173;
                case 238 -> 30;
                case 239 -> 249;
                case 240 -> 210;
                case 241 -> 163;
                case 242 -> 31;
                case 243 -> 192;
                case 244 -> 123;
                case 245 -> 228;
                case 246 -> 136;
                case 247 -> 238;
                case 248 -> 156;
                case 249 -> 89;
                case 250 -> 252;
                case 251 -> 220;
                case 252 -> 72;
                case 253 -> 236;
                case 254 -> 201;
                default -> 82;
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
            CalcGSub_8.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_8.strArr_1[n3];
    }
}
