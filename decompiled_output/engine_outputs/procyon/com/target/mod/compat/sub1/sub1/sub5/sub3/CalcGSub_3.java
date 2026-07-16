// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_3 extends AbstractLoadF
{
    private static final int intValue = 15;
    private final RenderASub_6 eventQ;
    private final RenderASub bindK;
    private int intValue_1;
    private Initializer_2 cacheA;
    private int intValue_2;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_3() {
        super(createString(11245, 26453), createString(11242, -13006), Initializer.stepF);
        this.eventQ = new RenderASub_6(createString(11243, -28187), createString(11247, -15501));
        this.bindK = new RenderASub(createString(11240, 10477), 20.0, 5.0, 100.0, 1.0);
        this.intValue_1 = 0;
        this.cacheA = Initializer_2.IDLE;
        this.intValue_2 = 0;
        this.setRenderaarr(this.eventQ, this.bindK);
    }
    
    @Override
    public void execute() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //     7: aload_1        
        //     8: ifnull          34
        //    11: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //    14: ifnull          67
        //    17: goto            24
        //    20: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    23: athrow         
        //    24: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //    27: goto            34
        //    30: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    33: athrow         
        //    34: aload_1        
        //    35: ifnull          61
        //    38: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    41: ifnull          67
        //    44: goto            51
        //    47: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    50: athrow         
        //    51: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //    54: goto            61
        //    57: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    60: athrow         
        //    61: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //    64: ifnonnull       72
        //    67: return         
        //    68: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    71: athrow         
        //    72: aload_0        
        //    73: aload_1        
        //    74: ifnull          106
        //    77: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_1:I
        //    80: ifle            105
        //    83: goto            90
        //    86: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //    89: athrow         
        //    90: aload_0        
        //    91: dup            
        //    92: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_1:I
        //    95: iconst_1       
        //    96: isub           
        //    97: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_1:I
        //   100: return         
        //   101: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   104: athrow         
        //   105: aload_0        
        //   106: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.cacheA:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   109: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2.WAITING_FOR_GUI:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   112: aload_1        
        //   113: ifnull          226
        //   116: if_acmpne       219
        //   119: goto            126
        //   122: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   125: athrow         
        //   126: aload_0        
        //   127: dup            
        //   128: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_2:I
        //   131: iconst_1       
        //   132: isub           
        //   133: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_2:I
        //   136: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //   139: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //   142: instanceof      Lnet/minecraft/class_476;
        //   145: aload_1        
        //   146: ifnull          211
        //   149: goto            156
        //   152: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   155: athrow         
        //   156: ifeq            189
        //   159: goto            166
        //   162: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   165: athrow         
        //   166: aload_0        
        //   167: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2.CLICKING_CONFIRM:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   170: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.cacheA:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   173: aload_0        
        //   174: iconst_2       
        //   175: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_2:I
        //   178: aload_1        
        //   179: ifnonnull       218
        //   182: goto            189
        //   185: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   188: athrow         
        //   189: aload_0        
        //   190: aload_1        
        //   191: ifnull          215
        //   194: goto            201
        //   197: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   200: athrow         
        //   201: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_2:I
        //   204: goto            211
        //   207: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   210: athrow         
        //   211: ifgt            218
        //   214: aload_0        
        //   215: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.execute_1:()V
        //   218: return         
        //   219: aload_0        
        //   220: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.cacheA:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   223: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2.CLICKING_CONFIRM:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   226: aload_1        
        //   227: ifnull          360
        //   230: if_acmpne       353
        //   233: goto            240
        //   236: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   239: athrow         
        //   240: aload_0        
        //   241: dup            
        //   242: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_2:I
        //   245: iconst_1       
        //   246: isub           
        //   247: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_2:I
        //   250: aload_0        
        //   251: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_2:I
        //   254: aload_1        
        //   255: ifnull          296
        //   258: goto            265
        //   261: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   264: athrow         
        //   265: ifle            276
        //   268: goto            275
        //   271: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   274: athrow         
        //   275: return         
        //   276: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //   279: aload_1        
        //   280: ifnull          342
        //   283: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //   286: instanceof      Lnet/minecraft/class_476;
        //   289: goto            296
        //   292: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   295: athrow         
        //   296: ifeq            348
        //   299: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //   302: getfield        net/minecraft/class_310.field_1761:Lnet/minecraft/class_636;
        //   305: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //   308: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   311: getfield        net/minecraft/class_746.field_7512:Lnet/minecraft/class_1703;
        //   314: getfield        net/minecraft/class_1703.field_7763:I
        //   317: bipush          15
        //   319: iconst_0       
        //   320: getstatic       net/minecraft/class_1713.field_7790:Lnet/minecraft/class_1713;
        //   323: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //   326: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   329: invokevirtual   net/minecraft/class_636.method_2906:(IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
        //   332: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //   335: goto            342
        //   338: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   341: athrow         
        //   342: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   345: invokevirtual   net/minecraft/class_746.method_7346:()V
        //   348: aload_0        
        //   349: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.execute_1:()V
        //   352: return         
        //   353: aload_0        
        //   354: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.cacheA:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   357: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2.IDLE:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   360: if_acmpne       573
        //   363: iconst_m1      
        //   364: istore_2       
        //   365: iconst_0       
        //   366: istore_3       
        //   367: iload_3        
        //   368: bipush          9
        //   370: if_icmpge       438
        //   373: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //   376: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   379: invokevirtual   net/minecraft/class_746.method_31548:()Lnet/minecraft/class_1661;
        //   382: iload_3        
        //   383: invokevirtual   net/minecraft/class_1661.method_5438:(I)Lnet/minecraft/class_1799;
        //   386: astore          4
        //   388: aload_1        
        //   389: ifnull          434
        //   392: aload           4
        //   394: invokevirtual   net/minecraft/class_1799.method_7960:()Z
        //   397: aload_1        
        //   398: ifnull          439
        //   401: goto            408
        //   404: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   407: athrow         
        //   408: ifne            424
        //   411: goto            418
        //   414: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   417: athrow         
        //   418: iload_3        
        //   419: istore_2       
        //   420: aload_1        
        //   421: ifnonnull       438
        //   424: iinc            3, 1
        //   427: goto            434
        //   430: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   433: athrow         
        //   434: aload_1        
        //   435: ifnonnull       367
        //   438: iload_2        
        //   439: aload_1        
        //   440: ifnull          483
        //   443: iconst_m1      
        //   444: if_icmpeq       557
        //   447: goto            454
        //   450: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.computeNumberformatexception:(Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
        //   453: athrow         
        //   454: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //   457: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   460: invokevirtual   net/minecraft/class_746.method_31548:()Lnet/minecraft/class_1661;
        //   463: iload_2        
        //   464: putfield        net/minecraft/class_1661.field_7545:I
        //   467: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_8.execute:()V
        //   470: aload_0        
        //   471: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.eventQ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   474: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //   477: checkcast       Ljava/lang/String;
        //   480: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   483: pop            
        //   484: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.class310:Lnet/minecraft/class_310;
        //   487: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   490: getfield        net/minecraft/class_746.field_3944:Lnet/minecraft/class_634;
        //   493: aload_0        
        //   494: getfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.eventQ:Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   497: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.getValue:()Ljava/lang/Object;
        //   500: checkcast       Ljava/lang/String;
        //   503: sipush          11241
        //   506: sipush          -17262
        //   509: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.createString:(II)Ljava/lang/String;
        //   512: swap           
        //   513: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   518: invokevirtual   net/minecraft/class_634.method_45730:(Ljava/lang/String;)V
        //   521: aload_0        
        //   522: getstatic       com/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2.WAITING_FOR_GUI:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   525: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.cacheA:Lcom/target/mod/compat/sub1/sub1/sub5/sub3/Initializer_2;
        //   528: aload_0        
        //   529: bipush          10
        //   531: putfield        com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.intValue_2:I
        //   534: goto            573
        //   537: astore_3       
        //   538: sipush          11244
        //   541: sipush          -19093
        //   544: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.createString:(II)Ljava/lang/String;
        //   547: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString_2:(Ljava/lang/String;)V
        //   550: aload_0        
        //   551: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.execute_2:()V
        //   554: goto            573
        //   557: sipush          11246
        //   560: sipush          19614
        //   563: invokestatic    com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.createString:(II)Ljava/lang/String;
        //   566: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_5.setString:(Ljava/lang/String;)V
        //   569: aload_0        
        //   570: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/sub3/CalcGSub_3.execute_2:()V
        //   573: return         
        //    StackMapTable: 00 3E FF 00 14 00 02 07 00 02 07 00 5B 00 01 07 00 4A 03 45 07 00 4A 43 07 00 56 4C 07 00 4A 03 45 07 00 4A 43 07 00 56 05 40 07 00 4A 03 4D 07 00 4A 03 4A 07 00 4A 03 40 07 00 02 4F 07 00 4A 03 59 07 00 4A 43 01 45 07 00 4A 03 52 07 00 4A 03 47 07 00 4A 43 07 00 02 45 07 00 4A 43 01 43 07 00 02 02 00 FF 00 06 00 02 07 00 02 07 00 5B 00 02 07 00 07 07 00 07 49 07 00 4A 03 54 07 00 4A 43 01 45 07 00 4A 03 00 4F 07 00 4A 43 01 69 07 00 4A 43 07 00 56 05 04 FF 00 06 00 02 07 00 02 07 00 5B 00 02 07 00 07 07 00 07 FD 00 06 01 01 FF 00 24 00 05 07 00 02 07 00 5B 01 01 07 00 9C 00 01 07 00 4A 43 01 45 07 00 4A 03 05 45 07 00 4A 03 FA 00 03 40 01 4A 07 00 4A 03 5C 01 75 07 00 4A 13 F9 00 0F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  439    447    450    454    Ljava/lang/NumberFormatException;
        //  420    427    430    434    Ljava/lang/NumberFormatException;
        //  392    411    414    418    Ljava/lang/NumberFormatException;
        //  388    401    404    408    Ljava/lang/NumberFormatException;
        //  296    335    338    342    Ljava/lang/NumberFormatException;
        //  276    289    292    296    Ljava/lang/NumberFormatException;
        //  240    268    271    275    Ljava/lang/NumberFormatException;
        //  230    258    261    265    Ljava/lang/NumberFormatException;
        //  226    233    236    240    Ljava/lang/NumberFormatException;
        //  189    204    207    211    Ljava/lang/NumberFormatException;
        //  166    194    197    201    Ljava/lang/NumberFormatException;
        //  156    182    185    189    Ljava/lang/NumberFormatException;
        //  126    159    162    166    Ljava/lang/NumberFormatException;
        //  116    149    152    156    Ljava/lang/NumberFormatException;
        //  106    119    122    126    Ljava/lang/NumberFormatException;
        //  77     101    101    105    Ljava/lang/NumberFormatException;
        //  72     83     86     90     Ljava/lang/NumberFormatException;
        //  61     68     68     72     Ljava/lang/NumberFormatException;
        //  38     54     57     61     Ljava/lang/NumberFormatException;
        //  34     44     47     51     Ljava/lang/NumberFormatException;
        //  11     27     30     34     Ljava/lang/NumberFormatException;
        //  4      17     20     24     Ljava/lang/NumberFormatException;
        //  454    534    537    557    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0126:
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
    
    private void execute_1() {
        this.cacheA = Initializer_2.IDLE;
        this.intValue_1 = this.bindK.getValue().intValue();
    }
    
    @Override
    public void execute_2() {
        this.execute_1();
    }
    
    public void execute_3() {
        this.execute_1();
    }
    
    private static NumberFormatException computeNumberformatexception(final NumberFormatException ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[8];
        int n = 0;
        String s;
        int n2 = (s = "+^\u00c7\u00e2,\u001b\u00d6.j¯\u0004\u00c6\u0099\u00cf\u0004\u0018r\u0098\u0098\u00d3V\u00ce9\u00fc¸OF\u00d4\u0089X4\u00fad\u0006\u0090\u0086\u00adZ2\u0081\u001e1¡µ|°\u00c4\u00e7¾\u0007\u0013\u001b\u0015\u00cdG\u00ad\u009foX\u001e\u008d\u0018¾\u00dcwn\u001d\u00e5X\u00dd\u00e6\n\u00c5^h\u00e4\u001eB\u00e19\u0003\u0083+\u000b\u0095\u00f9\u008cz\u001d\u008f\u00c5\b\u0018\u00e8\u00f0\u00ea«:T³¥6\u001a\u00c6Q\u00998\u00035t\u0084\t¡\u0006\u0007Y¬¯,\u00c1K£[\u0080C1").length();
        int n3 = 5;
        int n4 = -1;
    Label_0022:
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
                        Label_0258: {
                            if (length > 1) {
                                break Label_0258;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 5;
                                    case 1 -> 4;
                                    case 2 -> 70;
                                    case 3 -> 105;
                                    case 4 -> 121;
                                    case 5 -> 33;
                                    default -> 56;
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
                                continue Label_0022;
                            }
                            n2 = (s = "&\u0000\u0007·X\u00c3\u00f1\u00d0\r\u00e5>²\u00ce7\u00f0\u00c7'\u00f7\u00d3p\u00ffe").length();
                            n3 = 8;
                            n4 = -1;
                            break;
                        }
                        case 0: {
                            strArr2[n++] = intern;
                            if ((n4 += n3) < n2) {
                                n3 = s.charAt(n4);
                                break;
                            }
                            break Label_0022;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 64)));
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
        strArr_1 = new String[8];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x2BEF) & 0xFFFF;
        if (CalcGSub_3.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_3.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 203;
                case 1 -> 2;
                case 2 -> 54;
                case 3 -> 69;
                case 4 -> 234;
                case 5 -> 232;
                case 6 -> 188;
                case 7 -> 123;
                case 8 -> 43;
                case 9 -> 60;
                case 10 -> 35;
                case 11 -> 75;
                case 12 -> 33;
                case 13 -> 230;
                case 14 -> 215;
                case 15 -> 224;
                case 16 -> 129;
                case 17 -> 161;
                case 18 -> 170;
                case 19 -> 255;
                case 20 -> 236;
                case 21 -> 99;
                case 22 -> 149;
                case 23 -> 235;
                case 24 -> 57;
                case 25 -> 29;
                case 26 -> 17;
                case 27 -> 32;
                case 28 -> 10;
                case 29 -> 19;
                case 30 -> 55;
                case 31 -> 31;
                case 32 -> 209;
                case 33 -> 18;
                case 34 -> 214;
                case 35 -> 183;
                case 36 -> 46;
                case 37 -> 106;
                case 38 -> 181;
                case 39 -> 8;
                case 40 -> 248;
                case 41 -> 242;
                case 42 -> 162;
                case 43 -> 121;
                case 44 -> 150;
                case 45 -> 87;
                case 46 -> 168;
                case 47 -> 196;
                case 48 -> 12;
                case 49 -> 4;
                case 50 -> 20;
                case 51 -> 66;
                case 52 -> 61;
                case 53 -> 147;
                case 54 -> 41;
                case 55 -> 237;
                case 56 -> 218;
                case 57 -> 97;
                case 58 -> 84;
                case 59 -> 193;
                case 60 -> 38;
                case 61 -> 40;
                case 62 -> 176;
                case 63 -> 160;
                case 64 -> 165;
                case 65 -> 91;
                case 66 -> 118;
                case 67 -> 153;
                case 68 -> 221;
                case 69 -> 243;
                case 70 -> 93;
                case 71 -> 206;
                case 72 -> 244;
                case 73 -> 204;
                case 74 -> 180;
                case 75 -> 185;
                case 76 -> 252;
                case 77 -> 26;
                case 78 -> 83;
                case 79 -> 30;
                case 80 -> 7;
                case 81 -> 212;
                case 82 -> 131;
                case 83 -> 226;
                case 84 -> 94;
                case 85 -> 251;
                case 86 -> 45;
                case 87 -> 53;
                case 88 -> 186;
                case 89 -> 21;
                case 90 -> 164;
                case 91 -> 117;
                case 92 -> 86;
                case 93 -> 192;
                case 94 -> 199;
                case 95 -> 125;
                case 96 -> 16;
                case 97 -> 135;
                case 98 -> 138;
                case 99 -> 144;
                case 100 -> 36;
                case 101 -> 233;
                case 102 -> 246;
                case 103 -> 250;
                case 104 -> 139;
                case 105 -> 51;
                case 106 -> 197;
                case 107 -> 253;
                case 108 -> 62;
                case 109 -> 195;
                case 110 -> 238;
                case 111 -> 15;
                case 112 -> 159;
                case 113 -> 184;
                case 114 -> 198;
                case 115 -> 154;
                case 116 -> 88;
                case 117 -> 134;
                case 118 -> 191;
                case 119 -> 182;
                case 120 -> 101;
                case 121 -> 5;
                case 122 -> 169;
                case 123 -> 128;
                case 124 -> 173;
                case 125 -> 122;
                case 126 -> 174;
                case 127 -> 187;
                case 128 -> 254;
                case 129 -> 58;
                case 130 -> 178;
                case 131 -> 228;
                case 132 -> 76;
                case 133 -> 175;
                case 134 -> 189;
                case 135 -> 119;
                case 136 -> 107;
                case 137 -> 137;
                case 138 -> 114;
                case 139 -> 133;
                case 140 -> 11;
                case 141 -> 0;
                case 142 -> 229;
                case 143 -> 222;
                case 144 -> 145;
                case 145 -> 216;
                case 146 -> 63;
                case 147 -> 223;
                case 148 -> 148;
                case 149 -> 14;
                case 150 -> 126;
                case 151 -> 239;
                case 152 -> 140;
                case 153 -> 151;
                case 154 -> 47;
                case 155 -> 241;
                case 156 -> 225;
                case 157 -> 37;
                case 158 -> 70;
                case 159 -> 13;
                case 160 -> 9;
                case 161 -> 240;
                case 162 -> 155;
                case 163 -> 194;
                case 164 -> 23;
                case 165 -> 27;
                case 166 -> 249;
                case 167 -> 64;
                case 168 -> 247;
                case 169 -> 65;
                case 170 -> 89;
                case 171 -> 127;
                case 172 -> 82;
                case 173 -> 213;
                case 174 -> 96;
                case 175 -> 73;
                case 176 -> 163;
                case 177 -> 59;
                case 178 -> 143;
                case 179 -> 202;
                case 180 -> 245;
                case 181 -> 207;
                case 182 -> 81;
                case 183 -> 77;
                case 184 -> 142;
                case 185 -> 92;
                case 186 -> 172;
                case 187 -> 158;
                case 188 -> 171;
                case 189 -> 112;
                case 190 -> 156;
                case 191 -> 124;
                case 192 -> 22;
                case 193 -> 95;
                case 194 -> 120;
                case 195 -> 85;
                case 196 -> 48;
                case 197 -> 166;
                case 198 -> 72;
                case 199 -> 105;
                case 200 -> 98;
                case 201 -> 109;
                case 202 -> 111;
                case 203 -> 79;
                case 204 -> 52;
                case 205 -> 141;
                case 206 -> 103;
                case 207 -> 130;
                case 208 -> 6;
                case 209 -> 132;
                case 210 -> 34;
                case 211 -> 78;
                case 212 -> 67;
                case 213 -> 24;
                case 214 -> 102;
                case 215 -> 90;
                case 216 -> 49;
                case 217 -> 200;
                case 218 -> 146;
                case 219 -> 227;
                case 220 -> 39;
                case 221 -> 220;
                case 222 -> 217;
                case 223 -> 42;
                case 224 -> 231;
                case 225 -> 100;
                case 226 -> 50;
                case 227 -> 1;
                case 228 -> 115;
                case 229 -> 74;
                case 230 -> 152;
                case 231 -> 104;
                case 232 -> 190;
                case 233 -> 211;
                case 234 -> 25;
                case 235 -> 108;
                case 236 -> 56;
                case 237 -> 136;
                case 238 -> 179;
                case 239 -> 80;
                case 240 -> 113;
                case 241 -> 177;
                case 242 -> 28;
                case 243 -> 116;
                case 244 -> 219;
                case 245 -> 210;
                case 246 -> 68;
                case 247 -> 71;
                case 248 -> 208;
                case 249 -> 201;
                case 250 -> 44;
                case 251 -> 157;
                case 252 -> 167;
                case 253 -> 110;
                case 254 -> 205;
                default -> 3;
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
            CalcGSub_3.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_3.strArr_1[n3];
    }
}
