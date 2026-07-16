// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2;

import java.util.Iterator;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_4;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;
import com.google.gson.JsonElement;
import com.target.mod.compat.sub1.sub2.sub1.ClientModInitializerImpl;
import com.target.mod.compat.sub1.sub2.sub3.sub1.CacheOImpl;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_16;
import com.google.gson.JsonObject;
import java.nio.file.OpenOption;
import java.nio.file.LinkOption;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Paths;
import com.google.gson.GsonBuilder;
import java.nio.file.Path;
import com.google.gson.Gson;

public final class Initializer_1
{
    private final Gson gson;
    private Path path;
    private String strValue;
    private String strValue_1;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_1() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.strValue = System.getProperty(createString(-13133, 30797));
        if (System.getProperty(createString(-13137, -18125)).toLowerCase().contains(createString(-13127, 13344))) {
            this.strValue_1 = createString(-13122, -8939);
        }
        else {
            this.strValue_1 = createString(-13126, -2139);
        }
        this.path = Paths.get(this.strValue, this.strValue_1);
        try {
            Files.createDirectories(this.path, (FileAttribute<?>[])new FileAttribute[0]);
        }
        catch (final Exception ex) {}
    }
    
    public List<String> getList() {
        final ArrayList list = new ArrayList();
        final File file = this.path.toFile();
        if (file.exists() && file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (final File file2 : listFiles) {
                    if (file2.getName().endsWith(createString(-13153, -12691))) {
                        list.add(file2.getName().replace(createString(-13153, -12691), ""));
                    }
                }
            }
        }
        return list;
    }
    
    public boolean checkString(final String s) {
        try {
            return Files.deleteIfExists(this.path.resolve(s + createString(-13153, -12691)));
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public void execute() {
        String string = createString(-13135, 12990);
        try {
            final Path resolve = this.path.resolve(createString(-13160, -5518));
            Label_0098: {
                if (Files.isRegularFile(resolve, new LinkOption[0])) {
                    final String trim = Files.readString(resolve).trim();
                    try {
                        if (trim.isEmpty() || !Files.isRegularFile(this.path.resolve(trim + createString(-13153, -12691)), new LinkOption[0])) {
                            break Label_0098;
                        }
                    }
                    catch (final Exception ex) {
                        throw computeException(ex);
                    }
                    string = trim;
                }
            }
        }
        catch (final Exception ex2) {}
        this.setString(string);
    }
    
    public void setString(final String csq) {
        try {
            final Path resolve = this.path.resolve(csq + createString(-13153, -12691));
            if (!Files.isRegularFile(resolve, new LinkOption[0])) {
                return;
            }
            try {
                Files.writeString(this.path.resolve(createString(-13160, -5518)), csq, new OpenOption[0]);
            }
            catch (final Exception ex) {}
            final JsonObject jsonobject = (JsonObject)this.gson.fromJson(Files.readString(resolve), (Class)JsonObject.class);
            final JsonElement value = jsonobject.get(createString(-13124, -16447));
            Label_0546: {
                try {
                    if (value == null || !value.isJsonObject()) {
                        break Label_0546;
                    }
                }
                catch (final Exception ex2) {
                    throw computeException(ex2);
                }
                final JsonObject asJsonObject = value.getAsJsonObject();
                try {
                    if (asJsonObject.has(createString(-13131, 26681))) {
                        Initializer_16.floatValue = asJsonObject.get(createString(-13131, 26681)).getAsFloat();
                    }
                }
                catch (final Exception ex3) {
                    throw computeException(ex3);
                }
                try {
                    if (asJsonObject.has(createString(-13148, 10557))) {
                        Initializer_16.boolFlag_3 = asJsonObject.get(createString(-13148, 10557)).getAsBoolean();
                    }
                }
                catch (final Exception ex4) {
                    throw computeException(ex4);
                }
                try {
                    if (asJsonObject.has(createString(-13125, 15163))) {
                        Initializer_16.intValue = asJsonObject.get(createString(-13125, 15163)).getAsInt();
                    }
                }
                catch (final Exception ex5) {
                    throw computeException(ex5);
                }
                try {
                    if (asJsonObject.has(createString(-13145, -28597))) {
                        Initializer_16.intValue_1 = asJsonObject.get(createString(-13145, -28597)).getAsInt();
                    }
                }
                catch (final Exception ex6) {
                    throw computeException(ex6);
                }
                try {
                    if (asJsonObject.has(createString(-13150, 4674))) {
                        Initializer_16.intValue_2 = asJsonObject.get(createString(-13150, 4674)).getAsInt();
                    }
                }
                catch (final Exception ex7) {
                    throw computeException(ex7);
                }
                try {
                    if (asJsonObject.has(createString(-13123, 16515))) {
                        Initializer_16.intValue_3 = asJsonObject.get(createString(-13123, 16515)).getAsInt();
                    }
                }
                catch (final Exception ex8) {
                    throw computeException(ex8);
                }
                try {
                    if (asJsonObject.has(createString(-13155, 1803))) {
                        Initializer_16.intValue_4 = asJsonObject.get(createString(-13155, 1803)).getAsInt();
                    }
                }
                catch (final Exception ex9) {
                    throw computeException(ex9);
                }
                try {
                    if (asJsonObject.has(createString(-13152, 9118))) {
                        Initializer_16.intValue_5 = asJsonObject.get(createString(-13152, 9118)).getAsInt();
                    }
                }
                catch (final Exception ex10) {
                    throw computeException(ex10);
                }
                if (asJsonObject.has(createString(-13130, 10512))) {
                    final CacheOImpl cacheOImpl = ClientModInitializerImpl.sortB.getEventd().computeLoadf(CacheOImpl.class);
                    try {
                        if (cacheOImpl != null) {
                            cacheOImpl.setInt(asJsonObject.get(createString(-13130, 10512)).getAsInt());
                        }
                    }
                    catch (final Exception ex11) {
                        throw computeException(ex11);
                    }
                }
            }
            this.setJsonobject(jsonobject);
        }
        catch (final Exception ex12) {}
    }
    
    private void setJsonobject(final JsonObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //     6: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.getList:()Ljava/util/List;
        //     9: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    14: astore_2       
        //    15: aload_2        
        //    16: invokeinterface java/util/Iterator.hasNext:()Z
        //    21: ifeq            54
        //    24: aload_2        
        //    25: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    30: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //    33: astore_3       
        //    34: aload_3        
        //    35: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.isEnabled:()Z
        //    38: ifeq            46
        //    41: aload_3        
        //    42: iconst_0       
        //    43: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.setBool:(Z)V
        //    46: goto            51
        //    49: astore          4
        //    51: goto            15
        //    54: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //    57: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //    60: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.getList:()Ljava/util/List;
        //    63: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    68: astore_2       
        //    69: aload_2        
        //    70: invokeinterface java/util/Iterator.hasNext:()Z
        //    75: ifeq            488
        //    78: aload_2        
        //    79: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    84: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //    87: astore_3       
        //    88: aload_3        
        //    89: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString:()Ljava/lang/String;
        //    92: astore          4
        //    94: aload_1        
        //    95: aload           4
        //    97: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   100: astore          5
        //   102: aload           5
        //   104: ifnull          69
        //   107: aload           5
        //   109: invokevirtual   com/google/gson/JsonElement.isJsonObject:()Z
        //   112: ifne            122
        //   115: goto            69
        //   118: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   121: athrow         
        //   122: aload           5
        //   124: invokevirtual   com/google/gson/JsonElement.getAsJsonObject:()Lcom/google/gson/JsonObject;
        //   127: astore          6
        //   129: aload           6
        //   131: sipush          -13128
        //   134: sipush          -29089
        //   137: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   140: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   143: astore          7
        //   145: aload           7
        //   147: ifnull          192
        //   150: aload           7
        //   152: invokevirtual   com/google/gson/JsonElement.isJsonPrimitive:()Z
        //   155: ifeq            192
        //   158: goto            165
        //   161: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   164: athrow         
        //   165: aload           7
        //   167: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   170: ifeq            192
        //   173: goto            180
        //   176: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   179: athrow         
        //   180: aload_3        
        //   181: iconst_1       
        //   182: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.setBool:(Z)V
        //   185: goto            192
        //   188: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   191: athrow         
        //   192: aload           6
        //   194: sipush          -13149
        //   197: sipush          -22417
        //   200: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   203: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   206: astore          8
        //   208: aload           8
        //   210: ifnull          244
        //   213: aload           8
        //   215: invokevirtual   com/google/gson/JsonElement.isJsonPrimitive:()Z
        //   218: ifeq            244
        //   221: goto            228
        //   224: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   227: athrow         
        //   228: aload_3        
        //   229: aload           8
        //   231: invokevirtual   com/google/gson/JsonElement.getAsInt:()I
        //   234: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.setInt:(I)V
        //   237: goto            244
        //   240: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   243: athrow         
        //   244: aload_3        
        //   245: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //   248: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   253: astore          9
        //   255: aload           9
        //   257: invokeinterface java/util/Iterator.hasNext:()Z
        //   262: ifeq            480
        //   265: aload           9
        //   267: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   272: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/Initializer;
        //   275: astore          10
        //   277: aload           10
        //   279: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //   282: invokevirtual   java/lang/String.toString:()Ljava/lang/String;
        //   285: astore          11
        //   287: aload           6
        //   289: aload           11
        //   291: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   294: astore          12
        //   296: aload           12
        //   298: ifnonnull       308
        //   301: goto            255
        //   304: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   307: athrow         
        //   308: aload           10
        //   310: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   313: ifeq            339
        //   316: aload           10
        //   318: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   321: astore          13
        //   323: aload           13
        //   325: aload           12
        //   327: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   330: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   333: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.setObject:(Ljava/lang/Object;)V
        //   336: goto            472
        //   339: aload           10
        //   341: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   344: ifeq            370
        //   347: aload           10
        //   349: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   352: astore          14
        //   354: aload           14
        //   356: aload           12
        //   358: invokevirtual   com/google/gson/JsonElement.getAsDouble:()D
        //   361: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   364: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.setObject:(Ljava/lang/Object;)V
        //   367: goto            472
        //   370: aload           10
        //   372: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   375: ifeq            419
        //   378: aload           10
        //   380: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   383: astore          15
        //   385: aload           15
        //   387: aload           12
        //   389: invokevirtual   com/google/gson/JsonElement.getAsInt:()I
        //   392: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.setInt:(I)V
        //   395: aload           15
        //   397: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.isEnabled_1:()Z
        //   400: ifeq            472
        //   403: aload_3        
        //   404: aload           12
        //   406: invokevirtual   com/google/gson/JsonElement.getAsInt:()I
        //   409: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.setInt:(I)V
        //   412: goto            472
        //   415: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   418: athrow         
        //   419: aload           10
        //   421: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2;
        //   424: ifeq            447
        //   427: aload           10
        //   429: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2;
        //   432: astore          16
        //   434: aload           16
        //   436: aload           12
        //   438: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   441: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2.setObject:(Ljava/lang/Object;)V
        //   444: goto            472
        //   447: aload           10
        //   449: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //   452: ifeq            472
        //   455: aload           10
        //   457: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //   460: astore          17
        //   462: aload           17
        //   464: aload           12
        //   466: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   469: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4.setObject:(Ljava/lang/Object;)V
        //   472: goto            477
        //   475: astore          13
        //   477: goto            255
        //   480: goto            485
        //   483: astore          7
        //   485: goto            69
        //   488: aload_0        
        //   489: aload_1        
        //   490: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.setJsonobject_1:(Lcom/google/gson/JsonObject;)V
        //   493: return         
        //    StackMapTable: 00 21 FC 00 0F 07 01 0D FC 00 1E 07 01 16 42 07 00 13 01 FA 00 02 0E FF 00 30 00 06 07 00 02 07 00 AE 07 01 0D 07 01 16 07 00 30 07 00 B9 00 01 07 00 13 03 FF 00 26 00 08 07 00 02 07 00 AE 07 01 0D 07 01 16 07 00 30 07 00 B9 07 00 AE 07 00 B9 00 01 07 00 13 03 4A 07 00 13 03 47 07 00 13 03 FF 00 1F 00 09 07 00 02 07 00 AE 07 01 0D 07 01 16 07 00 30 07 00 B9 07 00 AE 07 00 B9 07 00 B9 00 01 07 00 13 03 4B 07 00 13 03 FC 00 0A 07 01 0D FF 00 30 00 0D 07 00 02 07 00 AE 07 01 0D 07 01 16 07 00 30 07 00 B9 07 00 AE 07 00 B9 07 00 B9 07 01 0D 07 01 27 07 00 30 07 00 B9 00 01 07 00 13 03 1E 1E FF 00 2C 00 10 07 00 02 07 00 AE 07 01 0D 07 01 16 07 00 30 07 00 B9 07 00 AE 07 00 B9 07 00 B9 07 01 0D 07 01 27 07 00 30 07 00 B9 00 00 07 01 45 00 01 07 00 13 F8 00 03 1B 18 42 07 00 13 01 F8 00 02 FF 00 02 00 07 07 00 02 07 00 AE 07 01 0D 07 01 16 07 00 30 07 00 B9 07 00 AE 00 01 07 00 13 FC 00 01 07 00 04 FF 00 02 00 02 07 00 02 07 00 AE 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  34     46     49     51     Ljava/lang/Exception;
        //  385    415    415    419    Ljava/lang/Exception;
        //  296    304    304    308    Ljava/lang/Exception;
        //  213    237    240    244    Ljava/lang/Exception;
        //  208    221    224    228    Ljava/lang/Exception;
        //  165    185    188    192    Ljava/lang/Exception;
        //  150    173    176    180    Ljava/lang/Exception;
        //  145    158    161    165    Ljava/lang/Exception;
        //  107    118    118    122    Ljava/lang/Exception;
        //  308    472    475    477    Ljava/lang/Exception;
        //  129    480    483    485    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0165:
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
    
    private void setJsonobject_1(final JsonObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: sipush          -13132
        //     4: sipush          -23573
        //     7: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //    10: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //    13: astore_2       
        //    14: aload_2        
        //    15: ifnull          32
        //    18: aload_2        
        //    19: invokevirtual   com/google/gson/JsonElement.isJsonObject:()Z
        //    22: ifne            37
        //    25: goto            32
        //    28: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    31: athrow         
        //    32: return         
        //    33: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    36: athrow         
        //    37: aload_2        
        //    38: invokevirtual   com/google/gson/JsonElement.getAsJsonObject:()Lcom/google/gson/JsonObject;
        //    41: astore_3       
        //    42: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_1.getConfiga:()Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_1;
        //    45: astore          4
        //    47: aload           4
        //    49: ifnull          65
        //    52: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    55: ifnonnull       70
        //    58: goto            65
        //    61: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    64: athrow         
        //    65: return         
        //    66: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    69: athrow         
        //    70: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    73: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.getList:()Ljava/util/List;
        //    76: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    81: astore          5
        //    83: aload           5
        //    85: invokeinterface java/util/Iterator.hasNext:()Z
        //    90: ifeq            126
        //    93: aload           5
        //    95: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   100: checkcast       Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //   103: astore          6
        //   105: aload           6
        //   107: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.isEnabled:()Z
        //   110: ifeq            118
        //   113: aload           6
        //   115: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.execute_2:()V
        //   118: goto            123
        //   121: astore          7
        //   123: goto            83
        //   126: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   129: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.getList:()Ljava/util/List;
        //   132: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   137: astore          5
        //   139: aload           5
        //   141: invokeinterface java/util/Iterator.hasNext:()Z
        //   146: ifeq            533
        //   149: aload           5
        //   151: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   156: checkcast       Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //   159: astore          6
        //   161: aload_3        
        //   162: aload           6
        //   164: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.getString:()Ljava/lang/String;
        //   167: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   170: astore          7
        //   172: aload           7
        //   174: ifnull          139
        //   177: aload           7
        //   179: invokevirtual   com/google/gson/JsonElement.isJsonObject:()Z
        //   182: ifne            192
        //   185: goto            139
        //   188: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   191: athrow         
        //   192: aload           7
        //   194: invokevirtual   com/google/gson/JsonElement.getAsJsonObject:()Lcom/google/gson/JsonObject;
        //   197: astore          8
        //   199: aload           8
        //   201: sipush          -13140
        //   204: sipush          15479
        //   207: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   210: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   213: ifeq            270
        //   216: aload           8
        //   218: sipush          -13140
        //   221: sipush          15479
        //   224: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   227: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   230: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   233: ifeq            270
        //   236: goto            243
        //   239: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   242: athrow         
        //   243: aload           6
        //   245: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.isEnabled:()Z
        //   248: ifne            270
        //   251: goto            258
        //   254: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   257: athrow         
        //   258: aload           6
        //   260: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.execute_2:()V
        //   263: goto            270
        //   266: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   269: athrow         
        //   270: aload           8
        //   272: sipush          -13146
        //   275: sipush          28552
        //   278: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   281: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   284: ifeq            316
        //   287: aload           6
        //   289: aload           8
        //   291: sipush          -13146
        //   294: sipush          28552
        //   297: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   300: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   303: invokevirtual   com/google/gson/JsonElement.getAsInt:()I
        //   306: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.setInt:(I)V
        //   309: goto            316
        //   312: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   315: athrow         
        //   316: aload           6
        //   318: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.getList:()Ljava/util/List;
        //   321: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   326: astore          9
        //   328: aload           9
        //   330: invokeinterface java/util/Iterator.hasNext:()Z
        //   335: ifeq            525
        //   338: aload           9
        //   340: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   345: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA;
        //   348: astore          10
        //   350: aload           8
        //   352: aload           10
        //   354: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   357: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   360: astore          11
        //   362: aload           11
        //   364: ifnonnull       374
        //   367: goto            328
        //   370: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   373: athrow         
        //   374: aload           10
        //   376: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   379: ifeq            405
        //   382: aload           10
        //   384: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   387: astore          12
        //   389: aload           12
        //   391: aload           11
        //   393: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   396: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   399: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.setObject:(Ljava/lang/Object;)V
        //   402: goto            517
        //   405: aload           10
        //   407: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   410: ifeq            436
        //   413: aload           10
        //   415: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   418: astore          13
        //   420: aload           13
        //   422: aload           11
        //   424: invokevirtual   com/google/gson/JsonElement.getAsDouble:()D
        //   427: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   430: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.setObject:(Ljava/lang/Object;)V
        //   433: goto            517
        //   436: aload           10
        //   438: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_7;
        //   441: ifeq            464
        //   444: aload           10
        //   446: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_7;
        //   449: astore          14
        //   451: aload           14
        //   453: aload           11
        //   455: invokevirtual   com/google/gson/JsonElement.getAsInt:()I
        //   458: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_7.setInt:(I)V
        //   461: goto            517
        //   464: aload           10
        //   466: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   469: ifeq            492
        //   472: aload           10
        //   474: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   477: astore          15
        //   479: aload           15
        //   481: aload           11
        //   483: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   486: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.setString:(Ljava/lang/String;)V
        //   489: goto            517
        //   492: aload           10
        //   494: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   497: ifeq            517
        //   500: aload           10
        //   502: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   505: astore          16
        //   507: aload           16
        //   509: aload           11
        //   511: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   514: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.setObject:(Ljava/lang/Object;)V
        //   517: goto            522
        //   520: astore          12
        //   522: goto            328
        //   525: goto            530
        //   528: astore          9
        //   530: goto            139
        //   533: return         
        //    StackMapTable: 00 26 FF 00 1C 00 03 07 00 02 07 00 AE 07 00 B9 00 01 07 00 13 03 40 07 00 13 03 FF 00 17 00 05 07 00 02 07 00 AE 07 00 B9 07 00 AE 07 01 57 00 01 07 00 13 03 40 07 00 13 03 FC 00 0C 07 01 0D FC 00 22 07 01 64 42 07 00 13 01 FA 00 02 0C FF 00 30 00 08 07 00 02 07 00 AE 07 00 B9 07 00 AE 07 01 57 07 01 0D 07 01 64 07 00 B9 00 01 07 00 13 03 FF 00 2E 00 09 07 00 02 07 00 AE 07 00 B9 07 00 AE 07 01 57 07 01 0D 07 01 64 07 00 B9 07 00 AE 00 01 07 00 13 03 4A 07 00 13 03 47 07 00 13 03 69 07 00 13 03 FC 00 0B 07 01 0D FF 00 29 00 0C 07 00 02 07 00 AE 07 00 B9 07 00 AE 07 01 57 07 01 0D 07 01 64 07 00 B9 07 00 AE 07 01 0D 07 01 6D 07 00 B9 00 01 07 00 13 03 1E 1E 1B 1B 18 42 07 00 13 01 F9 00 02 FF 00 02 00 09 07 00 02 07 00 AE 07 00 B9 07 00 AE 07 01 57 07 01 0D 07 01 64 07 00 B9 07 00 AE 00 01 07 00 13 FC 00 01 07 00 04 FF 00 02 00 01 07 00 02 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  52     66     66     70     Ljava/lang/Exception;
        //  47     58     61     65     Ljava/lang/Exception;
        //  18     33     33     37     Ljava/lang/Exception;
        //  14     25     28     32     Ljava/lang/Exception;
        //  105    118    121    123    Ljava/lang/Exception;
        //  362    370    370    374    Ljava/lang/Exception;
        //  270    309    312    316    Ljava/lang/Exception;
        //  243    263    266    270    Ljava/lang/Exception;
        //  216    251    254    258    Ljava/lang/Exception;
        //  199    236    239    243    Ljava/lang/Exception;
        //  177    188    188    192    Ljava/lang/Exception;
        //  374    517    520    522    Ljava/lang/Exception;
        //  199    525    528    530    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0243:
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
    
    public void execute_1() {
        this.setString_1(createString(-13156, 27595));
    }
    
    public void setString_1(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: iload_2        
        //     5: ifne            38
        //     8: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_21.isEnabled_2:()Z
        //    11: ifne            26
        //    14: goto            21
        //    17: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    20: athrow         
        //    21: return         
        //    22: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    25: athrow         
        //    26: aload_0        
        //    27: getfield        com/target/mod/compat/sub1/sub2/sub2/Initializer_1.path:Ljava/nio/file/Path;
        //    30: iconst_0       
        //    31: anewarray       Ljava/nio/file/attribute/FileAttribute;
        //    34: invokestatic    java/nio/file/Files.createDirectories:(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
        //    37: pop            
        //    38: aload_0        
        //    39: getfield        com/target/mod/compat/sub1/sub2/sub2/Initializer_1.path:Ljava/nio/file/Path;
        //    42: aload_1        
        //    43: sipush          -13129
        //    46: sipush          -31959
        //    49: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //    52: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    57: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //    62: astore_3       
        //    63: new             Lcom/google/gson/JsonObject;
        //    66: dup            
        //    67: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    70: astore          4
        //    72: new             Lcom/google/gson/JsonObject;
        //    75: dup            
        //    76: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    79: astore          5
        //    81: aload           5
        //    83: sipush          -13138
        //    86: sipush          -5965
        //    89: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //    92: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.floatValue:F
        //    95: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    98: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   101: aload           5
        //   103: sipush          -13144
        //   106: sipush          -15203
        //   109: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   112: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.boolFlag_3:Z
        //   115: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   118: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   121: aload           5
        //   123: sipush          -13136
        //   126: sipush          -26892
        //   129: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   132: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.intValue:I
        //   135: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   138: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   141: aload           5
        //   143: sipush          -13154
        //   146: sipush          28316
        //   149: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   152: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.intValue_1:I
        //   155: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   158: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   161: aload           5
        //   163: sipush          -13134
        //   166: sipush          11354
        //   169: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   172: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.intValue_2:I
        //   175: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   178: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   181: aload           5
        //   183: sipush          -13142
        //   186: sipush          11246
        //   189: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   192: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.intValue_3:I
        //   195: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   198: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   201: aload           5
        //   203: sipush          -13143
        //   206: sipush          11941
        //   209: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   212: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.intValue_4:I
        //   215: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   218: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   221: aload           5
        //   223: sipush          -13141
        //   226: sipush          27546
        //   229: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   232: getstatic       com/target/mod/compat/sub1/sub2/sub7/Initializer_16.intValue_5:I
        //   235: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   238: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   241: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   244: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //   247: ldc             Lcom/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl;.class
        //   249: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.computeLoadf:(Ljava/lang/Class;)Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   252: checkcast       Lcom/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl;
        //   255: astore          6
        //   257: iload_2        
        //   258: ifne            318
        //   261: aload           6
        //   263: ifnull          302
        //   266: goto            273
        //   269: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   272: athrow         
        //   273: aload           5
        //   275: sipush          -13139
        //   278: sipush          5103
        //   281: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   284: aload           6
        //   286: invokevirtual   com/target/mod/compat/sub1/sub2/sub3/sub1/CacheOImpl.getInt_2:()I
        //   289: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   292: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   295: goto            302
        //   298: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   301: athrow         
        //   302: aload           4
        //   304: sipush          -13151
        //   307: sipush          -7686
        //   310: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   313: aload           5
        //   315: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   318: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   321: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getEventd:()Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_2;
        //   324: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_2.getList:()Ljava/util/List;
        //   327: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   332: astore          7
        //   334: aload           7
        //   336: invokeinterface java/util/Iterator.hasNext:()Z
        //   341: ifeq            723
        //   344: aload           7
        //   346: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   351: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/Initializer_3;
        //   354: astore          8
        //   356: new             Lcom/google/gson/JsonObject;
        //   359: dup            
        //   360: invokespecial   com/google/gson/JsonObject.<init>:()V
        //   363: astore          9
        //   365: aload           9
        //   367: sipush          -13140
        //   370: sipush          15479
        //   373: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   376: aload           8
        //   378: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.isEnabled:()Z
        //   381: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   384: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   387: aload           9
        //   389: sipush          -13146
        //   392: sipush          28552
        //   395: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   398: aload           8
        //   400: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getInt:()I
        //   403: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   406: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   409: iload_2        
        //   410: ifne            774
        //   413: aload           8
        //   415: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getList:()Ljava/util/List;
        //   418: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   423: astore          10
        //   425: aload           10
        //   427: invokeinterface java/util/Iterator.hasNext:()Z
        //   432: ifeq            707
        //   435: aload           10
        //   437: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   442: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/Initializer;
        //   445: astore          11
        //   447: aload           11
        //   449: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getString:()Ljava/lang/String;
        //   452: invokevirtual   java/lang/String.toString:()Ljava/lang/String;
        //   455: astore          12
        //   457: aload           11
        //   459: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   462: iload_2        
        //   463: ifne            341
        //   466: iload_2        
        //   467: ifne            515
        //   470: ifeq            503
        //   473: goto            480
        //   476: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   479: athrow         
        //   480: aload           11
        //   482: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   485: astore          13
        //   487: aload           9
        //   489: aload           12
        //   491: aload           13
        //   493: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //   496: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   499: iload_2        
        //   500: ifeq            698
        //   503: aload           11
        //   505: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   508: goto            515
        //   511: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   514: athrow         
        //   515: iload_2        
        //   516: ifne            564
        //   519: ifeq            552
        //   522: goto            529
        //   525: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   528: athrow         
        //   529: aload           11
        //   531: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1;
        //   534: astore          14
        //   536: aload           9
        //   538: aload           12
        //   540: aload           14
        //   542: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_1.getDouble:()Ljava/lang/Double;
        //   545: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   548: iload_2        
        //   549: ifeq            698
        //   552: aload           11
        //   554: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   557: goto            564
        //   560: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   563: athrow         
        //   564: iload_2        
        //   565: ifne            616
        //   568: ifeq            604
        //   571: goto            578
        //   574: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   577: athrow         
        //   578: aload           11
        //   580: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3;
        //   583: astore          15
        //   585: aload           9
        //   587: aload           12
        //   589: aload           15
        //   591: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_3.getInt:()I
        //   594: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   597: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   600: iload_2        
        //   601: ifeq            698
        //   604: aload           11
        //   606: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2;
        //   609: goto            616
        //   612: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   615: athrow         
        //   616: iload_2        
        //   617: ifne            676
        //   620: ifeq            653
        //   623: goto            630
        //   626: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   629: athrow         
        //   630: aload           11
        //   632: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2;
        //   635: astore          16
        //   637: aload           9
        //   639: aload           12
        //   641: aload           16
        //   643: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_2.getString:()Ljava/lang/String;
        //   646: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   649: iload_2        
        //   650: ifeq            698
        //   653: aload           11
        //   655: iload_2        
        //   656: ifne            681
        //   659: goto            666
        //   662: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   665: athrow         
        //   666: instanceof      Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //   669: goto            676
        //   672: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   675: athrow         
        //   676: ifeq            698
        //   679: aload           11
        //   681: checkcast       Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4;
        //   684: astore          17
        //   686: aload           9
        //   688: aload           12
        //   690: aload           17
        //   692: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_4.getString:()Ljava/lang/String;
        //   695: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   698: goto            703
        //   701: astore          13
        //   703: iload_2        
        //   704: ifeq            425
        //   707: aload           4
        //   709: aload           8
        //   711: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_3.getString:()Ljava/lang/String;
        //   714: aload           9
        //   716: invokevirtual   com/google/gson/JsonObject.add:(Ljava/lang/String;Lcom/google/gson/JsonElement;)V
        //   719: iload_2        
        //   720: ifeq            334
        //   723: aload_0        
        //   724: aload           4
        //   726: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/Initializer_1.setJsonobject_2:(Lcom/google/gson/JsonObject;)V
        //   729: aload_3        
        //   730: aload_0        
        //   731: getfield        com/target/mod/compat/sub1/sub2/sub2/Initializer_1.gson:Lcom/google/gson/Gson;
        //   734: aload           4
        //   736: invokevirtual   com/google/gson/Gson.toJson:(Lcom/google/gson/JsonElement;)Ljava/lang/String;
        //   739: iconst_0       
        //   740: anewarray       Ljava/nio/file/OpenOption;
        //   743: invokestatic    java/nio/file/Files.writeString:(Ljava/nio/file/Path;Ljava/lang/CharSequence;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
        //   746: pop            
        //   747: aload_0        
        //   748: getfield        com/target/mod/compat/sub1/sub2/sub2/Initializer_1.path:Ljava/nio/file/Path;
        //   751: sipush          -13121
        //   754: sipush          -5966
        //   757: invokestatic    com/target/mod/compat/sub1/sub2/sub2/Initializer_1.createString:(II)Ljava/lang/String;
        //   760: invokeinterface java/nio/file/Path.resolve:(Ljava/lang/String;)Ljava/nio/file/Path;
        //   765: aload_1        
        //   766: iconst_0       
        //   767: anewarray       Ljava/nio/file/OpenOption;
        //   770: invokestatic    java/nio/file/Files.writeString:(Ljava/nio/file/Path;Ljava/lang/CharSequence;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
        //   773: pop            
        //   774: goto            779
        //   777: astore          7
        //   779: goto            783
        //   782: astore_3       
        //   783: return         
        //    StackMapTable: 00 2E FF 00 11 00 03 07 00 02 07 00 30 01 00 01 07 00 13 03 40 07 00 13 03 0B FF 00 E6 00 07 07 00 02 07 00 30 01 07 00 52 07 00 AE 07 00 AE 07 00 F7 00 01 07 00 13 03 58 07 00 13 03 0F FC 00 0F 07 01 0D 46 01 FE 00 53 07 01 16 07 00 AE 07 01 0D FF 00 32 00 0D 07 00 02 07 00 30 01 07 00 52 07 00 AE 07 00 AE 07 00 F7 07 01 0D 07 01 16 07 00 AE 07 01 0D 07 01 27 07 00 30 00 01 07 00 13 03 16 47 07 00 13 43 01 49 07 00 13 03 16 47 07 00 13 43 01 49 07 00 13 03 19 47 07 00 13 43 01 49 07 00 13 03 16 48 07 00 13 43 07 01 27 45 07 00 13 43 01 44 07 01 27 10 42 07 00 13 01 F9 00 03 F8 00 0F 32 42 07 00 13 FF 00 01 00 08 07 00 02 07 00 30 01 07 00 52 07 00 AE 07 00 AE 07 00 F7 07 00 04 00 00 FF 00 02 00 03 07 00 02 07 00 30 01 00 01 07 00 13 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  653    669    672    676    Ljava/lang/Exception;
        //  637    659    662    666    Ljava/lang/Exception;
        //  616    623    626    630    Ljava/lang/Exception;
        //  585    609    612    616    Ljava/lang/Exception;
        //  564    571    574    578    Ljava/lang/Exception;
        //  536    557    560    564    Ljava/lang/Exception;
        //  515    522    525    529    Ljava/lang/Exception;
        //  487    508    511    515    Ljava/lang/Exception;
        //  466    473    476    480    Ljava/lang/Exception;
        //  261    295    298    302    Ljava/lang/Exception;
        //  257    266    269    273    Ljava/lang/Exception;
        //  8      22     22     26     Ljava/lang/Exception;
        //  4      14     17     21     Ljava/lang/Exception;
        //  457    698    701    703    Ljava/lang/Exception;
        //  747    774    777    779    Ljava/lang/Exception;
        //  26     779    782    783    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0653:
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
    
    public String computeString(final String s) {
        try {
            final Path resolve = this.path.resolve(s + createString(-13153, -12691));
            if (Files.isRegularFile(resolve, new LinkOption[0])) {
                return Files.readString(resolve);
            }
        }
        catch (final Exception ex) {}
        return null;
    }
    
    public Path getPath() {
        return this.path;
    }
    
    private void setJsonobject_2(final JsonObject jsonObject) {
        final com.target.mod.compat.sub1.sub1.sub1.Initializer_1 configa = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getConfiga();
        Label_0026: {
            try {
                if (configa == null) {
                    return;
                }
                final Initializer_4 initializer_4 = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF;
                if (initializer_4 == null) {
                    return;
                }
                break Label_0026;
            }
            catch (final Exception ex) {
                throw computeException(ex);
            }
            try {
                final Initializer_4 initializer_4 = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF;
                if (initializer_4 == null) {
                    return;
                }
            }
            catch (final Exception ex2) {
                throw computeException(ex2);
            }
        }
        final JsonObject jsonObject2 = new JsonObject();
        for (final AbstractLoadF abstractLoadF : com.target.mod.compat.sub1.sub1.sub1.Initializer_1.syncF.getList()) {
            final JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(createString(-13140, 15479), Boolean.valueOf(abstractLoadF.isEnabled()));
            jsonObject3.addProperty(createString(-13146, 28552), (Number)abstractLoadF.getInt_7());
            for (final AbstractSyncA abstractSyncA : abstractLoadF.getList()) {
                try {
                    if (abstractSyncA instanceof final RenderASub_1 renderASub_17) {
                        jsonObject3.addProperty(abstractSyncA.getString(), Boolean.valueOf(renderASub_17.getValue()));
                    }
                    else if (abstractSyncA instanceof final RenderASub renderASub) {
                        jsonObject3.addProperty(abstractSyncA.getString(), (Number)renderASub.getValue());
                    }
                    else if (abstractSyncA instanceof final RenderASub_7 renderASub_16) {
                        jsonObject3.addProperty(abstractSyncA.getString(), (Number)renderASub_16.getValue());
                    }
                    else if (abstractSyncA instanceof final RenderASub_15 renderASub_15) {
                        jsonObject3.addProperty(abstractSyncA.getString(), renderASub_15.getValue().toString());
                    }
                    else {
                        if (!(abstractSyncA instanceof RenderASub_6)) {
                            continue;
                        }
                        jsonObject3.addProperty(abstractSyncA.getString(), (String)((RenderASub_6)abstractSyncA).getValue());
                    }
                }
                catch (final Exception ex3) {}
            }
            jsonObject2.add(abstractLoadF.getString(), (JsonElement)jsonObject3);
        }
        jsonObject.add(createString(-13147, 7275), (JsonElement)jsonObject2);
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[37];
        int n = 0;
        String s;
        int n2 = (s = """
                      \u00f5¬2\u0015\u009e\u008c\u0013k\u00d1 \u00e2\u0005s\u00e2|º
                      3\u00f8¸h%\u00eb\u007f,S½¡\u00c6"\u009f\u0097¹Y\u00fc\u0084\u00e4]\u00c0\u0002\u0084@\u00c2\u00c8¾°\u0019¹\u00ce\bl\u001bY\u00ca\u00cd¼\u0012Y\u00f9\u00d8´;z\u00c1\u00c5)\u00f4h\u000e(R\u00f9{¸\u0099\u000b¾\u008ct\u00f3\u0088\u008e\u00e2\u0007\u00f4\u0099X\u00fa\u00d3w\u0082\u0003£\u00c8\u00ed#\u009d!_\u00823\u00f3 yix "\u00d0±\u00f0r2\u00c2\u0095\u0086A1\u00e2\u001a\u00f9|\u00c6^\u00ff\b\u00ce\u00e0LZ\u009e\b\u00ea´k\u0014\u0013¦\u00f2.\r;? h{³\u00dc\u00c4\u0018\u0001\u008fg\u0000\r9®/_3\u00c0h·¢¿\u0004m\u00cb\u0006£\u00e3\u00f8\u00e4\u00c7¤\u0005´\u00d7`º\u0086\b\u00fd\u001d\u0089!O\u0000y\u00fa\u0007\u00f5)^\u0085\u00ed\u00f2o	\u0011`\u0017\u0080\u0083\u00d5J>\u00fd	\u0011«\u00f2\u0012@u\u00f1\u00cf\u00fe\u0007\u0010\u001f\u00c4*@m\u00f0\u0006\u00cd\u00f25\u00c6~\u00e0\r,§\u008d~g\u00e4\u00e23\u00f3/.\u007f\u008e\u0007C\u0088ªj&\u00e0\u0091\f\u00c5\u00e0\u0099¼¾\u0088\u0080a\u00fc\u00f9\u009fj\u0007\u00e7"\u00fbµL\u008cS\u0005¿6\u00e5 9\u0006\u0017j\u00e0¢\u009a³\f){\u0004\u00cf\r\u00e6\u00f6¬2@F]\r\u00cbp>\u0081¸\u008e¤c\u0017\u00f5n\u00f9<\u0007\u00d7\u0089\u00eb²»Q*
                      \u0097\fr\u00d0\u0010\u00f3³P¼\u00f7\u0006¸O\u0015\u0006$'\u000bp\u00c0\u0082\u0098\u0088=\u00d1]\u0089\u00e6\u00e9	\u0098\u00ef&q¥\u00eb\u008e\u00f9e\u0007\u00fa\u00e4N\u001f\u000f\u00e4¼\u0007\u00191\u00c3\u0086^\u0092\u0019\u0007£\u0093s\u0083]Jq
                      o\u00e1mm\u00f3D\u00cf¦3)""").length();
        int n3 = 11;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 117));
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
                                    case 0 -> 116;
                                    case 1 -> 61;
                                    case 2 -> 59;
                                    case 3 -> 116;
                                    case 4 -> 69;
                                    case 5 -> 54;
                                    default -> 14;
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
                            n2 = (s = "\"\u008e¥\u0086)\u000e\u009e\"8b\u0097\u00ad\u00f9/\u00c5Q\u00cd;^\u0083").length();
                            n3 = 5;
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
                    n5 = (n6 = (n7 = (n8 = 68)));
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
        strArr_1 = new String[37];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFCCBC) & 0xFFFF;
        if (Initializer_1.strArr_1[n3] == null) {
            final char[] charArray = Initializer_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 219;
                case 1 -> 43;
                case 2 -> 37;
                case 3 -> 60;
                case 4 -> 143;
                case 5 -> 4;
                case 6 -> 137;
                case 7 -> 190;
                case 8 -> 56;
                case 9 -> 217;
                case 10 -> 15;
                case 11 -> 69;
                case 12 -> 215;
                case 13 -> 66;
                case 14 -> 59;
                case 15 -> 54;
                case 16 -> 232;
                case 17 -> 3;
                case 18 -> 49;
                case 19 -> 116;
                case 20 -> 34;
                case 21 -> 57;
                case 22 -> 38;
                case 23 -> 148;
                case 24 -> 79;
                case 25 -> 158;
                case 26 -> 67;
                case 27 -> 171;
                case 28 -> 188;
                case 29 -> 191;
                case 30 -> 146;
                case 31 -> 233;
                case 32 -> 55;
                case 33 -> 17;
                case 34 -> 197;
                case 35 -> 64;
                case 36 -> 16;
                case 37 -> 226;
                case 38 -> 204;
                case 39 -> 187;
                case 40 -> 227;
                case 41 -> 109;
                case 42 -> 252;
                case 43 -> 221;
                case 44 -> 96;
                case 45 -> 101;
                case 46 -> 29;
                case 47 -> 163;
                case 48 -> 78;
                case 49 -> 138;
                case 50 -> 184;
                case 51 -> 229;
                case 52 -> 65;
                case 53 -> 107;
                case 54 -> 113;
                case 55 -> 167;
                case 56 -> 222;
                case 57 -> 161;
                case 58 -> 144;
                case 59 -> 51;
                case 60 -> 236;
                case 61 -> 8;
                case 62 -> 201;
                case 63 -> 235;
                case 64 -> 169;
                case 65 -> 112;
                case 66 -> 6;
                case 67 -> 209;
                case 68 -> 160;
                case 69 -> 230;
                case 70 -> 118;
                case 71 -> 77;
                case 72 -> 39;
                case 73 -> 20;
                case 74 -> 44;
                case 75 -> 175;
                case 76 -> 132;
                case 77 -> 131;
                case 78 -> 130;
                case 79 -> 12;
                case 80 -> 213;
                case 81 -> 210;
                case 82 -> 73;
                case 83 -> 199;
                case 84 -> 242;
                case 85 -> 120;
                case 86 -> 94;
                case 87 -> 31;
                case 88 -> 25;
                case 89 -> 178;
                case 90 -> 248;
                case 91 -> 89;
                case 92 -> 127;
                case 93 -> 181;
                case 94 -> 81;
                case 95 -> 11;
                case 96 -> 121;
                case 97 -> 241;
                case 98 -> 114;
                case 99 -> 247;
                case 100 -> 198;
                case 101 -> 136;
                case 102 -> 208;
                case 103 -> 254;
                case 104 -> 224;
                case 105 -> 119;
                case 106 -> 24;
                case 107 -> 124;
                case 108 -> 193;
                case 109 -> 95;
                case 110 -> 147;
                case 111 -> 150;
                case 112 -> 200;
                case 113 -> 228;
                case 114 -> 115;
                case 115 -> 30;
                case 116 -> 99;
                case 117 -> 98;
                case 118 -> 214;
                case 119 -> 186;
                case 120 -> 155;
                case 121 -> 129;
                case 122 -> 165;
                case 123 -> 251;
                case 124 -> 0;
                case 125 -> 62;
                case 126 -> 14;
                case 127 -> 103;
                case 128 -> 159;
                case 129 -> 110;
                case 130 -> 5;
                case 131 -> 183;
                case 132 -> 85;
                case 133 -> 212;
                case 134 -> 28;
                case 135 -> 174;
                case 136 -> 237;
                case 137 -> 194;
                case 138 -> 140;
                case 139 -> 100;
                case 140 -> 10;
                case 141 -> 218;
                case 142 -> 9;
                case 143 -> 111;
                case 144 -> 35;
                case 145 -> 83;
                case 146 -> 13;
                case 147 -> 74;
                case 148 -> 80;
                case 149 -> 63;
                case 150 -> 90;
                case 151 -> 135;
                case 152 -> 189;
                case 153 -> 71;
                case 154 -> 164;
                case 155 -> 151;
                case 156 -> 243;
                case 157 -> 21;
                case 158 -> 122;
                case 159 -> 220;
                case 160 -> 126;
                case 161 -> 173;
                case 162 -> 75;
                case 163 -> 172;
                case 164 -> 250;
                case 165 -> 157;
                case 166 -> 106;
                case 167 -> 216;
                case 168 -> 196;
                case 169 -> 48;
                case 170 -> 206;
                case 171 -> 128;
                case 172 -> 7;
                case 173 -> 240;
                case 174 -> 176;
                case 175 -> 40;
                case 176 -> 125;
                case 177 -> 244;
                case 178 -> 180;
                case 179 -> 246;
                case 180 -> 117;
                case 181 -> 142;
                case 182 -> 47;
                case 183 -> 45;
                case 184 -> 234;
                case 185 -> 195;
                case 186 -> 88;
                case 187 -> 92;
                case 188 -> 108;
                case 189 -> 70;
                case 190 -> 18;
                case 191 -> 1;
                case 192 -> 238;
                case 193 -> 245;
                case 194 -> 87;
                case 195 -> 154;
                case 196 -> 231;
                case 197 -> 249;
                case 198 -> 27;
                case 199 -> 84;
                case 200 -> 19;
                case 201 -> 202;
                case 202 -> 192;
                case 203 -> 185;
                case 204 -> 68;
                case 205 -> 26;
                case 206 -> 139;
                case 207 -> 182;
                case 208 -> 91;
                case 209 -> 133;
                case 210 -> 168;
                case 211 -> 76;
                case 212 -> 53;
                case 213 -> 123;
                case 214 -> 203;
                case 215 -> 61;
                case 216 -> 152;
                case 217 -> 156;
                case 218 -> 211;
                case 219 -> 42;
                case 220 -> 205;
                case 221 -> 255;
                case 222 -> 179;
                case 223 -> 72;
                case 224 -> 104;
                case 225 -> 166;
                case 226 -> 22;
                case 227 -> 253;
                case 228 -> 170;
                case 229 -> 52;
                case 230 -> 33;
                case 231 -> 141;
                case 232 -> 86;
                case 233 -> 82;
                case 234 -> 105;
                case 235 -> 162;
                case 236 -> 145;
                case 237 -> 177;
                case 238 -> 23;
                case 239 -> 32;
                case 240 -> 97;
                case 241 -> 50;
                case 242 -> 149;
                case 243 -> 134;
                case 244 -> 46;
                case 245 -> 207;
                case 246 -> 239;
                case 247 -> 41;
                case 248 -> 58;
                case 249 -> 93;
                case 250 -> 153;
                case 251 -> 223;
                case 252 -> 102;
                case 253 -> 36;
                case 254 -> 225;
                default -> 2;
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
