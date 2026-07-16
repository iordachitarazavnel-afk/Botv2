// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub4;

import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub2.sub6.BindCSub_11;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_20;
import net.minecraft.class_1802;
import net.minecraft.class_239$class_240;
import net.minecraft.class_239;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_6;
import net.minecraft.class_1642;
import net.minecraft.class_1657;
import net.minecraft.class_3966;
import com.target.mod.compat.sub1.sub2.sub2.Initializer;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_14;
import net.minecraft.class_1297;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_1;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_6;
import com.target.mod.compat.sub1.sub2.sub6.PackDImpl_5;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_3;

public final class DataNImpl_4 extends Initializer_3 implements PackDImpl_5, PackDImpl_6
{
    private final SyncASub_5 parseB;
    private final SyncASub_5 parseB_1;
    private final SyncASub_5 parseB_2;
    private final SyncASub_5 parseB_3;
    private final SyncASub_1 buildC;
    private final SyncASub_1 buildC_1;
    private final SyncASub_1 buildC_2;
    private final SyncASub_1 buildC_3;
    private final SyncASub_5 parseB_4;
    private final SyncASub_5 parseB_5;
    private final SyncASub_5 parseB_6;
    private final SyncASub_5 parseB_7;
    private final SyncASub_5 parseB_8;
    private final SyncASub_5 parseB_9;
    private final SyncASub_5 parseB_10;
    private final SyncASub_5 parseB_11;
    private final SyncASub_5 parseB_12;
    private final SyncASub_1 buildC_4;
    private final SyncASub_5 parseB_13;
    private long longValue;
    private int intValue;
    private int intValue_1;
    private class_1297 class1297;
    
    public DataNImpl_4() {
        super("trigger_bot", Initializer_14.computeString(new int[] { 132, 202, 53, 99, 43, 44, 66, 5, 81, 33, 100, 109, 0, 71, 130, 255, 166, 161, 222, 129, 194, 189, 224, 250, 156, 194, 43, 123, 34, 37, 90, 125, 95 }), "A.utomatically attacks entities in your crosshair", Initializer.cacheE);
        this.parseB = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 76, 33, 100, 118, 0, 71, 142, 48, 244, 154, 152, 211, 250, 220, 125, 135, 207, 205, 102, 41, 28, 69, 8, 82, 36, 107, 100, 3, 74, 135, 226, 165, 173 }), false);
        this.parseB_1 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 75, 33, 100, 109, 0, 71, 137, 255, 166, 163, 17, 211, 251, 231, 178, 213, 224, 145, 52, 17 }), false);
        this.parseB_2 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 238, 54, 88, 67, 21, 184, 149, 244, 155, 183, 211, 250, 198, 125, 135, 207, 221, 102, 41, 19, 69, 8, 73, 36, 107, 98, 3, 74, 137 }), false);
        this.parseB_3 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 79, 33, 100, 104, 207, 21, 185, 185, 244, 155, 165, 211, 250, 215, 178, 213, 254, 145, 52, 7 }), false);
        this.buildC = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 107, 0, 71, 151, 255, 166, 162, 17, 211, 251, 246, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79, 193, 3, 75, 175, 226, 165, 170, 193, 132, 202 }), 0.0, 1000.0, 540.0, 1.0);
        this.buildC_1 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 107, 0, 71, 151, 255, 166, 162, 17, 211, 251, 246, 178, 213, 246, 145, 52, 24, 112, 23, 52, 47, 118, 79, 193, 3, 75, 175, 226, 165, 162, 193, 132, 220 }), 0.0, 1000.0, 550.0, 1.0);
        this.buildC_2 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 91, 33, 100, 97, 207, 21, 185, 180, 244, 155, 180, 211, 250, 222, 178, 213, 242, 145, 52, 13, 191, 69, 9, 109, 36, 107, 104, 3, 74, 140 }), 0.0, 1000.0, 780.0, 1.0);
        this.buildC_3 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 91, 33, 100, 97, 207, 21, 185, 180, 244, 155, 180, 211, 250, 222, 178, 213, 242, 145, 52, 13, 191, 69, 9, 109, 36, 107, 96, 3, 74, 154 }), 0.0, 1000.0, 800.0, 1.0);
        this.parseB_4 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 75, 33, 100, 97, 0, 71, 134, 255, 166, 173, 17, 211, 251, 225, 178, 213, 251, 145, 52, 29, 112, 23, 48, 47, 118, 90, 14, 81, 115 }), false);
        this.parseB_5 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 33, 100, 104, 0, 71, 156, 48, 244, 154, 146, 211, 250, 192, 178, 213, 250, 145, 52, 0, 191, 69, 9, 115, 36, 107, 118, 3, 74, 141, 226, 165, 177, 193, 132, 192 }), false);
        this.parseB_6 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 46, 99, 43, 44, 66, 5, 77, 33, 100, 104, 0, 71, 156, 48, 244, 154, 146, 211, 250, 192, 178, 213, 250, 145, 52, 0, 191, 69, 9, 97, 36, 107, 121, 3, 74, 135 }), false);
        this.parseB_7 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 84, 33, 100, 109, 0, 71, 139, 255, 166, 161, 17, 211, 251, 250, 178, 213, 242, 145, 52, 26, 112, 23, 49 }), true);
        this.parseB_8 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 54, 99, 43, 44, 66, 5, 75, 33, 100, 109, 0, 71, 137, 255, 166, 163, 17, 211, 251, 243, 178, 213, 224, 145, 52, 23, 112, 23, 48, 47, 118, 88, 14, 81, 115, 237, 176, 145, 204, 147, 183, 171, 242, 221 }), false);
        this.parseB_9 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 34, 99, 43, 44, 66, 5, 79, 33, 100, 109, 0, 71, 134, 255, 166, 173, 17, 211, 251, 225, 178, 213, 250, 145, 52, 25, 112, 23, 32, 47, 118, 90, 14, 81, 118, 237, 176, 140, 204, 147, 176, 171, 242, 213, 138, 205, 245 }), false);
        this.parseB_10 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 87, 33, 100, 118, 0, 71, 132, 255, 166, 191, 17, 211, 251, 240, 178, 213, 234, 145, 52, 4, 112, 23, 52, 47, 118, 69, 14, 81, 100 }), false);
        this.parseB_11 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 32, 99, 43, 44, 66, 5, 79, 33, 100, 104, 207, 21, 185, 181, 244, 155, 191, 211, 250, 198, 178, 213, 250, 145, 52, 0, 112, 23, 60, 47, 118, 83, 14, 81, 100 }), false);
        this.parseB_12 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 52, 99, 43, 44, 66, 5, 80, 33, 100, 97, 207, 21, 185, 163, 244, 155, 185, 211, 250, 219, 178, 213, 246, 145, 52, 24, 112, 23, 49 }), false);
        this.buildC_4 = new SyncASub_1(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 75, 33, 100, 109, 0, 71, 128, 255, 166, 170, 222, 129, 195, 114, 178, 212, 199, 145, 52, 29, 112, 23, 56, 47, 118, 83 }), 100.0, 1000.0, 350.0, 1.0);
        this.parseB_13 = new SyncASub_5(Initializer_14.computeString(new int[] { 132, 202, 50, 99, 43, 44, 66, 5, 66, 33, 100, 105, 0, 71, 128, 48, 244, 154, 129, 211, 250, 222, 178, 213, 242, 145, 52, 13, 112, 23, 48, 47, 118, 68 }), false);
        this.longValue = 0L;
        this.class1297 = null;
        this.setSyncaarr(this.parseB, this.parseB_1, this.parseB_2, this.parseB_3, this.buildC, this.buildC_1, this.buildC_2, this.buildC_3, this.parseB_4, this.parseB_8, this.parseB_13, this.parseB_5, this.parseB_6, this.parseB_7, this.parseB_9, this.parseB_10, this.parseB_11, this.parseB_12, this.buildC_4);
    }
    
    @Override
    public void execute() {
        this.intValue = this.method_int(this.buildC.getInt(), this.buildC_1.getInt());
        this.intValue_1 = this.method_int(this.buildC_2.getInt(), this.buildC_3.getInt());
        this.renderA.setClassAndPackd(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd(PackDImpl_6.class, this);
        super.execute();
    }
    
    @Override
    public void execute_1() {
        this.renderA.setClassAndPackd_1(PackDImpl_5.class, this);
        this.renderA.setClassAndPackd_1(PackDImpl_6.class, this);
        super.execute_1();
    }
    
    @Override
    public void execute_2() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //     6: ifnull          18
        //     9: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //    12: getfield        net/minecraft/class_310.field_1687:Lnet/minecraft/class_638;
        //    15: ifnonnull       19
        //    18: return         
        //    19: aload_0        
        //    20: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.parseB:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //    23: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //    26: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    29: ifne            42
        //    32: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //    35: getfield        net/minecraft/class_310.field_1755:Lnet/minecraft/class_437;
        //    38: ifnull          42
        //    41: return         
        //    42: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //    45: ifnull          114
        //    48: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //    51: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getWrapb:()Lcom/target/mod/compat/sub1/sub2/sub3/Initializer_2;
        //    54: ifnull          114
        //    57: goto            64
        //    60: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //    63: athrow         
        //    64: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //    67: getfield        net/minecraft/class_310.field_1765:Lnet/minecraft/class_239;
        //    70: astore_2       
        //    71: aload_2        
        //    72: instanceof      Lnet/minecraft/class_3966;
        //    75: ifeq            114
        //    78: aload_2        
        //    79: checkcast       Lnet/minecraft/class_3966;
        //    82: astore_1       
        //    83: aload_1        
        //    84: invokevirtual   net/minecraft/class_3966.method_17782:()Lnet/minecraft/class_1297;
        //    87: astore_2       
        //    88: aload_2        
        //    89: instanceof      Lnet/minecraft/class_1657;
        //    92: ifeq            114
        //    95: aload_2        
        //    96: checkcast       Lnet/minecraft/class_1657;
        //    99: astore_3       
        //   100: getstatic       com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.sortB:Lcom/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl;
        //   103: invokevirtual   com/target/mod/compat/sub1/sub2/sub1/ClientModInitializerImpl.getWrapb:()Lcom/target/mod/compat/sub1/sub2/sub3/Initializer_2;
        //   106: aload_3        
        //   107: invokevirtual   com/target/mod/compat/sub1/sub2/sub3/Initializer_2.checkClass_1657:(Lnet/minecraft/class_1657;)Z
        //   110: ifeq            114
        //   113: return         
        //   114: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //   117: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   120: invokevirtual   net/minecraft/class_746.method_6047:()Lnet/minecraft/class_1799;
        //   123: invokevirtual   net/minecraft/class_1799.method_7909:()Lnet/minecraft/class_1792;
        //   126: astore_1       
        //   127: aload_0        
        //   128: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.parseB_2:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   131: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //   134: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   137: ifeq            155
        //   140: iconst_0       
        //   141: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_9.checkInt:(I)Z
        //   144: ifne            155
        //   147: goto            154
        //   150: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   153: athrow         
        //   154: return         
        //   155: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //   158: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   161: invokevirtual   net/minecraft/class_746.method_6079:()Lnet/minecraft/class_1799;
        //   164: invokevirtual   net/minecraft/class_1799.method_7909:()Lnet/minecraft/class_1792;
        //   167: invokevirtual   net/minecraft/class_1792.method_57347:()Lnet/minecraft/class_9323;
        //   170: getstatic       net/minecraft/class_9334.field_50075:Lnet/minecraft/class_9331;
        //   173: invokeinterface net/minecraft/class_9323.method_57832:(Lnet/minecraft/class_9331;)Z
        //   178: ifne            206
        //   181: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //   184: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   187: invokevirtual   net/minecraft/class_746.method_6079:()Lnet/minecraft/class_1799;
        //   190: invokevirtual   net/minecraft/class_1799.method_7909:()Lnet/minecraft/class_1792;
        //   193: instanceof      Lnet/minecraft/class_1819;
        //   196: ifeq            241
        //   199: goto            206
        //   202: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   205: athrow         
        //   206: iconst_1       
        //   207: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_9.checkInt:(I)Z
        //   210: ifeq            241
        //   213: goto            220
        //   216: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   219: athrow         
        //   220: aload_0        
        //   221: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.parseB_1:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   224: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //   227: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   230: ifne            241
        //   233: goto            240
        //   236: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   239: athrow         
        //   240: return         
        //   241: aload_0        
        //   242: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.parseB_8:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   245: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //   248: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   251: ifne            338
        //   254: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //   257: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   260: invokevirtual   net/minecraft/class_746.method_24828:()Z
        //   263: ifne            297
        //   266: goto            273
        //   269: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   272: athrow         
        //   273: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //   276: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   279: invokevirtual   net/minecraft/class_746.method_18798:()Lnet/minecraft/class_243;
        //   282: getfield        net/minecraft/class_243.field_1351:D
        //   285: dconst_0       
        //   286: dcmpl          
        //   287: ifgt            337
        //   290: goto            297
        //   293: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   296: athrow         
        //   297: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //   300: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   303: invokevirtual   net/minecraft/class_746.method_24828:()Z
        //   306: ifne            338
        //   309: goto            316
        //   312: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   315: athrow         
        //   316: getstatic       com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.class310:Lnet/minecraft/class_310;
        //   319: getfield        net/minecraft/class_310.field_1724:Lnet/minecraft/class_746;
        //   322: getfield        net/minecraft/class_746.field_6017:D
        //   325: dconst_0       
        //   326: dcmpg          
        //   327: ifgt            338
        //   330: goto            337
        //   333: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   336: athrow         
        //   337: return         
        //   338: aload_0        
        //   339: getfield        com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.parseB_3:Lcom/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5;
        //   342: invokevirtual   com/target/mod/compat/sub1/sub2/sub2/sub1/SyncASub_5.getBoolean:()Ljava/lang/Boolean;
        //   345: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   348: ifne            394
        //   351: aload_1        
        //   352: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_8.checkClass_1792:(Lnet/minecraft/class_1792;)Z
        //   355: ifeq            376
        //   358: goto            365
        //   361: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   364: athrow         
        //   365: aload_0        
        //   366: invokevirtual   com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.execute_3:()V
        //   369: goto            398
        //   372: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   375: athrow         
        //   376: aload_1        
        //   377: invokestatic    com/target/mod/compat/sub1/sub2/sub7/Initializer_8.checkClass_1792_1:(Lnet/minecraft/class_1792;)Z
        //   380: ifeq            398
        //   383: aload_0        
        //   384: invokevirtual   com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.execute_4:()V
        //   387: goto            398
        //   390: invokestatic    com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.computeException:(Ljava/lang/Exception;)Ljava/lang/Exception;
        //   393: athrow         
        //   394: aload_0        
        //   395: invokevirtual   com/target/mod/compat/sub1/sub2/sub4/DataNImpl_4.execute_5:()V
        //   398: goto            402
        //   401: astore_1       
        //   402: return         
        //    StackMapTable: 00 22 12 00 16 51 07 00 A4 03 31 FF 00 23 00 02 07 00 02 07 00 F4 00 01 07 00 A4 03 00 6E 07 00 A4 03 49 07 00 A4 03 4F 07 00 A4 03 00 5B 07 00 A4 03 53 07 00 A4 03 4E 07 00 A4 03 50 07 00 A4 03 00 56 07 00 A4 03 46 07 00 A4 03 4D 07 00 A4 03 03 FF 00 02 00 01 07 00 02 00 01 07 00 A4 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      18     401    402    Ljava/lang/Exception;
        //  19     41     401    402    Ljava/lang/Exception;
        //  42     57     60     64     Ljava/lang/Exception;
        //  42     113    401    402    Ljava/lang/Exception;
        //  127    147    150    154    Ljava/lang/Exception;
        //  114    154    401    402    Ljava/lang/Exception;
        //  206    233    236    240    Ljava/lang/Exception;
        //  181    213    216    220    Ljava/lang/Exception;
        //  155    199    202    206    Ljava/lang/Exception;
        //  155    240    401    402    Ljava/lang/Exception;
        //  297    330    333    337    Ljava/lang/Exception;
        //  273    309    312    316    Ljava/lang/Exception;
        //  254    290    293    297    Ljava/lang/Exception;
        //  241    266    269    273    Ljava/lang/Exception;
        //  241    337    401    402    Ljava/lang/Exception;
        //  376    390    390    394    Ljava/lang/Exception;
        //  351    372    372    376    Ljava/lang/Exception;
        //  338    358    361    365    Ljava/lang/Exception;
        //  338    398    401    402    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0206:
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
    
    private void execute_3() {
        final class_239 field_1765 = DataNImpl_4.class310.field_1765;
        if (field_1765 instanceof final class_3966 class_1658) {
            final class_1297 method_17782 = class_1658.method_17782();
            if (this.parseB_13.getBoolean() && this.class1297 != null && method_17782 != this.class1297) {
                return;
            }
            if (method_17782 instanceof class_1657 || (this.parseB_10.getBoolean() && method_17782 instanceof class_1642) || (this.parseB_11.getBoolean() && method_17782 != null)) {
                if (method_17782 instanceof final class_1657 class_1657) {
                    if (this.parseB_4.getBoolean() && class_1657.method_6039() && !Initializer_6.checkClass_1657(class_1657)) {
                        return;
                    }
                }
                if (this.parseB_5.getBoolean() && (DataNImpl_4.class310.field_1724.method_24828() || DataNImpl_4.class310.field_1724.method_18798().field_1351 >= 0.0)) {
                    return;
                }
                if (this.checkInt(this.intValue)) {
                    this.setClass_1297(method_17782);
                    this.intValue = this.method_int(this.buildC.getInt(), this.buildC_1.getInt());
                    this.longValue = System.currentTimeMillis();
                }
                else {
                    this.execute_6();
                }
            }
        }
    }
    
    private void execute_4() {
        final class_239 field_1765 = DataNImpl_4.class310.field_1765;
        if (field_1765 instanceof final class_3966 class_1658) {
            final class_1297 method_17782 = class_1658.method_17782();
            if (method_17782 instanceof class_1657 || (this.parseB_10.getBoolean() && method_17782 instanceof class_1642) || (this.parseB_11.getBoolean() && method_17782 != null)) {
                if (method_17782 instanceof final class_1657 class_1657) {
                    if (this.parseB_4.getBoolean() && class_1657.method_6039() && !Initializer_6.checkClass_1657(class_1657)) {
                        return;
                    }
                }
                if (this.parseB_6.getBoolean() && (DataNImpl_4.class310.field_1724.method_24828() || DataNImpl_4.class310.field_1724.method_18798().field_1351 >= 0.0)) {
                    return;
                }
                if (this.checkInt(this.intValue_1)) {
                    this.setClass_1297(method_17782);
                    this.intValue_1 = this.method_int(this.buildC_2.getInt(), this.buildC_3.getInt());
                    this.longValue = System.currentTimeMillis();
                }
                else {
                    this.execute_6();
                }
            }
        }
    }
    
    private void execute_5() {
        final class_239 field_1765 = DataNImpl_4.class310.field_1765;
        if (field_1765 instanceof final class_3966 class_3966) {
            if (DataNImpl_4.class310.field_1765.method_17783() == class_239$class_240.field_1331) {
                final class_1297 method_17782 = class_3966.method_17782();
                if (this.parseB_13.getBoolean() && this.class1297 != null && method_17782 != this.class1297) {
                    return;
                }
                if (method_17782 instanceof class_1657 || (this.parseB_10.getBoolean() && method_17782 instanceof class_1642) || (this.parseB_11.getBoolean() && method_17782 != null)) {
                    if (method_17782 instanceof final class_1657 class_3967) {
                        if (this.parseB_4.getBoolean() && class_3967.method_6039() && !Initializer_6.checkClass_1657(class_3967)) {
                            return;
                        }
                    }
                    if (this.parseB_5.getBoolean() && (DataNImpl_4.class310.field_1724.method_24828() || DataNImpl_4.class310.field_1724.method_18798().field_1351 >= 0.0)) {
                        return;
                    }
                    if (this.checkInt(this.intValue)) {
                        this.setClass_1297(method_17782);
                        this.intValue = this.method_int(this.buildC.getInt(), this.buildC_1.getInt());
                        this.longValue = System.currentTimeMillis();
                    }
                    else {
                        this.execute_6();
                    }
                }
            }
        }
    }
    
    private void setClass_1297(final class_1297 class1297) {
        if (this.parseB_12.getBoolean() && DataNImpl_4.class310.field_1724.method_6079().method_7909() == class_1802.field_8255 && DataNImpl_4.class310.field_1724.method_6039()) {
            Initializer_20.setInt_1(1);
        }
        Initializer_6.setClass_1297AndBool(class1297, this.parseB_7.getBoolean());
        this.class1297 = class1297;
        if (this.parseB_9.getBoolean()) {
            Initializer_20.setInt_2(0);
        }
    }
    
    private void execute_6() {
        if (this.parseB_12.getBoolean() && DataNImpl_4.class310.field_1724.method_6079().method_7909() == class_1802.field_8255) {
            Initializer_20.setIntAndInt(1, this.buildC_4.getInt());
        }
    }
    
    private boolean checkInt(final int n) {
        return System.currentTimeMillis() - this.longValue >= n;
    }
    
    private int method_int(final int n, final int n2) {
        if (n >= n2) {
            return n;
        }
        return n + (int)(Math.random() * (n2 - n + 1));
    }
    
    @Override
    public void setSlotf(final BindCSub_11 bindCSub_11) {
        if (!Initializer_9.checkInt(0)) {
            bindCSub_11.execute_2();
        }
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
}
