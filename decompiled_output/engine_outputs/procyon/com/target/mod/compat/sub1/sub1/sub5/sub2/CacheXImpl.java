// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub2;

import com.target.mod.compat.sub1.sub2.sub7.Initializer_8;
import net.minecraft.class_1792;
import net.minecraft.class_2248;
import net.minecraft.class_239;
import net.minecraft.class_1799;
import net.minecraft.class_437;
import net.minecraft.class_310;
import net.minecraft.class_1268;
import net.minecraft.class_2246;
import net.minecraft.class_239$class_240;
import net.minecraft.class_3965;
import net.minecraft.class_1802;
import net.minecraft.class_7923;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub2.sub2.sub1.SyncASub_5;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_2;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CacheXImpl extends AbstractLoadF implements BlockEImpl_2
{
    public final RenderASub_7 gridH;
    public final RenderASub_1 buffC;
    public final RenderASub bindK;
    public final RenderASub bindK_1;
    public final RenderASub bindK_2;
    public final RenderASub bindK_3;
    public final RenderASub_1 buffC_1;
    public final RenderASub_1 buffC_2;
    public final RenderASub_1 buffC_3;
    public final RenderASub_1 buffC_4;
    private int intValue;
    private int intValue_1;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private boolean boolFlag_2;
    private boolean boolFlag_3;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CacheXImpl() {
        super(createString(20505, -14691), createString(20497, -11556), Initializer.COMBAT);
        this.gridH = new RenderASub_7(createString(20496, -24913), 1);
        this.buffC = new RenderASub_1(createString(20501, 12055), false);
        this.bindK = new RenderASub(createString(20504, -13445), 0.0, 0.0, 20.0, 1.0);
        this.bindK_1 = new RenderASub(createString(20503, -18721), 100.0, 1.0, 100.0, 1.0);
        this.bindK_2 = new RenderASub(createString(20507, 3618), 0.0, 0.0, 20.0, 1.0);
        this.bindK_3 = new RenderASub(createString(20499, -12220), 100.0, 1.0, 100.0, 1.0);
        this.buffC_1 = new RenderASub_1(createString(20502, -23999), false);
        this.buffC_2 = new RenderASub_1(createString(20506, -20647), false);
        this.buffC_3 = new RenderASub_1(createString(20498, 8114), false);
        this.buffC_4 = new RenderASub_1(createString(20509, 17677), true);
        this.intValue = 0;
        this.intValue_1 = 0;
        this.boolFlag_3 = false;
        this.setRenderaarr(this.gridH, this.buffC, this.bindK, this.bindK_1, this.bindK_2, this.bindK_3, this.buffC_1, this.buffC_2, this.buffC_3, this.buffC_4);
    }
    
    @Override
    public void execute() {
        super.execute();
        final com.target.mod.compat.sub1.sub1.sub2.Initializer_1 initd = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getInitd();
        if (initd != null) {
            initd.setClassAndBlocke(BlockEImpl_2.class, this);
        }
        this.execute_3();
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        final com.target.mod.compat.sub1.sub1.sub2.Initializer_1 initd = com.target.mod.compat.sub1.sub1.sub1.Initializer_1.getInitd();
        if (initd != null) {
            initd.setClassAndBlocke_1(BlockEImpl_2.class, this);
        }
        this.execute_3();
    }
    
    @Override
    public void execute_2() {
        final boolean enabled = SyncASub_5.isEnabled();
        class_310 class_311;
        final class_310 class_310 = class_311 = CacheXImpl.class310;
        if (enabled) {
            if (class_310.field_1724 == null) {
                return;
            }
            final class_310 class310;
            class_311 = (class310 = CacheXImpl.class310);
        }
        if (enabled) {
            if (class_310.field_1687 == null) {
                return;
            }
            class_311 = CacheXImpl.class310;
        }
        if (class_311.field_1761 != null) {
            final int n = (int)(Math.random() * 100.0) + 1;
            Object o;
            final class_437 class_312 = (class_437)(o = CacheXImpl.class310.field_1755);
            if (enabled) {
                if (class_312 != null) {
                    return;
                }
                o = ((AbstractSyncA<Object>)this.gridH).getValue();
            }
            final int intValue = (int)o;
            int n3;
            final int n2 = n3 = intValue;
            Label_0104: {
                Label_0103: {
                    if (enabled) {
                        if (n2 == -1) {
                            break Label_0103;
                        }
                        final boolean checkInt;
                        n3 = ((checkInt = Initializer_9.checkInt(intValue)) ? 1 : 0);
                    }
                    if (enabled) {
                        if (n2 == 0) {
                            break Label_0103;
                        }
                        n3 = 1;
                    }
                    break Label_0104;
                }
                n3 = 0;
            }
            if (n3 != 0) {
                final class_1799 method_6047 = CacheXImpl.class310.field_1724.method_6047();
                boolean b4;
                final boolean b3;
                boolean b2;
                final boolean b = b2 = (b3 = (b4 = class_7923.field_41178.method_10221((Object)method_6047.method_7909()).method_12832().contains(createString(20500, -31185))));
                Label_0239: {
                    if (enabled) {
                        if (b) {
                            break Label_0239;
                        }
                        b2 = (b4 = this.buffC_1.getValue());
                    }
                    boolean b5 = false;
                    Label_0209: {
                        if (enabled) {
                            if (b2) {
                                b5 = (b4 = method_6047.method_31574(class_1802.field_8288));
                                if (!enabled) {
                                    break Label_0209;
                                }
                                if (b5) {
                                    break Label_0239;
                                }
                            }
                            this.buffC_2.getValue().booleanValue();
                        }
                    }
                    boolean method_6048 = false;
                    Label_0235: {
                        if (enabled) {
                            if (b5) {
                                method_6048 = method_6047.method_31574(class_1802.field_8301);
                                if (!enabled) {
                                    break Label_0235;
                                }
                                if (method_6048) {
                                    break Label_0239;
                                }
                            }
                            b4 = this.boolFlag;
                        }
                    }
                    if (!method_6048) {
                        return;
                    }
                }
                final class_239 field_1765 = CacheXImpl.class310.field_1765;
                int n7;
                int method_6049;
                int n6;
                int n5;
                final int n4 = n5 = (n6 = (method_6049 = (n7 = ((field_1765 instanceof class_3965) ? 1 : 0))));
                Label_0373: {
                    if (enabled) {
                        Label_0364: {
                            if (n4 != 0) {
                                final class_3965 class_313 = (class_3965)field_1765;
                                final int n8 = n5 = (n6 = (method_6049 = (n7 = (this.boolFlag ? 1 : 0))));
                                if (!enabled) {
                                    break Label_0373;
                                }
                                if (n8 == 0) {
                                    final int n9 = n5 = (n6 = (method_6049 = (n7 = (((boolean)this.buffC_4.getValue()) ? 1 : 0))));
                                    if (!enabled) {
                                        break Label_0373;
                                    }
                                    if (n9 != 0) {
                                        final class_310 class311 = CacheXImpl.class310;
                                        if (enabled) {
                                            if (class311.field_1765.method_17783() != class_239$class_240.field_1332) {
                                                break Label_0364;
                                            }
                                            final class_310 class312 = CacheXImpl.class310;
                                        }
                                        final class_2248 method_6050 = class311.field_1687.method_8320(class_313.method_17777()).method_26204();
                                        final class_2248 field_1766 = class_2246.field_10540;
                                        boolean boolFlag_1 = false;
                                        Label_0361: {
                                            Label_0356: {
                                                if (enabled) {
                                                    if (method_6050 == field_1766) {
                                                        break Label_0356;
                                                    }
                                                    final class_2248 field_1767 = class_2246.field_9987;
                                                }
                                                if (method_6050 != field_1766) {
                                                    boolFlag_1 = false;
                                                    break Label_0361;
                                                }
                                            }
                                            boolFlag_1 = true;
                                        }
                                        this.boolFlag_1 = boolFlag_1;
                                    }
                                }
                            }
                        }
                        this.boolFlag = true;
                        n6 = (n5 = (method_6049 = (n7 = (this.boolFlag_1 ? 1 : 0))));
                    }
                }
                Label_0727: {
                    if (enabled) {
                        Label_0723: {
                            if (n5 == 0) {
                                final int n10 = n6 = (method_6049 = (n7 = (this.boolFlag_3 ? 1 : 0)));
                                if (!enabled) {
                                    break Label_0727;
                                }
                                if (n10 == 0) {
                                    final class_239 field_1768 = CacheXImpl.class310.field_1765;
                                    final int n11 = n6 = (method_6049 = (n7 = ((field_1768 instanceof class_3965) ? 1 : 0)));
                                    if (!enabled) {
                                        break Label_0727;
                                    }
                                    if (n11 != 0) {
                                        final class_3965 class_314 = (class_3965)field_1768;
                                        if (class_314.method_17783() == class_239$class_240.field_1333) {
                                            return;
                                        }
                                        final class_2248 method_6051 = CacheXImpl.class310.field_1687.method_8320(class_314.method_17777()).method_26204();
                                        class_2248 class_315 = null;
                                        class_2248 field_1769 = null;
                                        Label_0487: {
                                            Label_0482: {
                                                if (enabled) {
                                                    if (method_6051 != class_2246.field_10540) {
                                                        class_315 = method_6051;
                                                        field_1769 = class_2246.field_9987;
                                                        if (!enabled) {
                                                            break Label_0487;
                                                        }
                                                        if (class_315 != field_1769) {
                                                            break Label_0482;
                                                        }
                                                    }
                                                    this.boolFlag_1 = true;
                                                }
                                                if (enabled) {
                                                    break Label_0723;
                                                }
                                            }
                                            final class_2248 field_1770 = class_2246.field_23152;
                                        }
                                        if (class_315 != field_1769) {
                                            CacheXImpl.class310.field_1690.field_1904.method_23481(false);
                                            int n13;
                                            final int n12 = n13 = (n6 = (method_6049 = (n7 = (CacheXImpl.class310.field_1724.method_24518(class_1802.field_8281) ? 1 : 0))));
                                            Label_0602: {
                                                if (enabled) {
                                                    if (n12 == 0) {
                                                        final int n14 = n13 = (n6 = (method_6049 = (n7 = this.intValue_1)));
                                                        if (enabled) {
                                                            if (n14 > 0) {
                                                                --this.intValue_1;
                                                                return;
                                                            }
                                                            final int n15;
                                                            n13 = (n15 = (n6 = (method_6049 = (n7 = n))));
                                                        }
                                                        if (!enabled) {
                                                            break Label_0602;
                                                        }
                                                        if (n14 <= this.bindK_1.getValue().intValue()) {
                                                            this.intValue_1 = this.bindK.getValue().intValue();
                                                            this.checkClass_1792(class_1802.field_8281);
                                                        }
                                                    }
                                                    n6 = (n13 = (method_6049 = (n7 = (CacheXImpl.class310.field_1724.method_24518(class_1802.field_8281) ? 1 : 0))));
                                                }
                                            }
                                            if (!enabled) {
                                                break Label_0727;
                                            }
                                            if (n13 != 0) {
                                                final int n16 = n6 = (method_6049 = (n7 = this.intValue));
                                                if (enabled) {
                                                    if (n16 > 0) {
                                                        --this.intValue;
                                                        return;
                                                    }
                                                    final int n17;
                                                    n6 = (n17 = (method_6049 = (n7 = (int)(Math.random() * 100.0) + 1)));
                                                }
                                                if (!enabled) {
                                                    break Label_0727;
                                                }
                                                if (n16 <= this.bindK_3.getValue().intValue()) {
                                                    CacheXImpl.class310.field_1761.method_2896(CacheXImpl.class310.field_1724, class_1268.field_5808, class_314);
                                                    CacheXImpl.class310.field_1724.method_6104(class_1268.field_5808);
                                                    this.intValue = this.bindK_2.getValue().intValue();
                                                    this.boolFlag_3 = true;
                                                    this.boolFlag_1 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        method_6049 = (n6 = (n7 = (this.boolFlag_1 ? 1 : 0)));
                    }
                }
                Label_0925: {
                    if (enabled) {
                        if (n6 == 0) {
                            break Label_0925;
                        }
                        n7 = (method_6049 = (CacheXImpl.class310.field_1724.method_24518(class_1802.field_8301) ? 1 : 0));
                    }
                    class_310 class313 = null;
                    Label_0868: {
                        Label_0862: {
                            if (enabled) {
                                if (method_6049 == 0) {
                                    final boolean b6 = (n7 = (this.boolFlag_2 ? 1 : 0)) != 0;
                                    if (!enabled) {
                                        break Label_0862;
                                    }
                                    if (!b6) {
                                        final int n18 = n7 = this.intValue_1;
                                        if (enabled) {
                                            if (n18 > 0) {
                                                --this.intValue_1;
                                                return;
                                            }
                                            final int n19;
                                            n7 = (n19 = (int)(Math.random() * 100.0) + 1);
                                        }
                                        if (!enabled) {
                                            break Label_0862;
                                        }
                                        if (n18 <= this.bindK_1.getValue().intValue()) {
                                            this.boolFlag_2 = this.checkClass_1792(class_1802.field_8301);
                                            this.intValue_1 = this.bindK.getValue().intValue();
                                        }
                                    }
                                }
                                class313 = CacheXImpl.class310;
                                if (!enabled) {
                                    break Label_0868;
                                }
                                n7 = (class313.field_1724.method_24518(class_1802.field_8301) ? 1 : 0);
                            }
                        }
                        if (n7 == 0) {
                            break Label_0925;
                        }
                        final class_310 class314 = CacheXImpl.class310;
                    }
                    final class_239 field_1771 = class313.field_1765;
                    if (!enabled || field_1771 instanceof class_3965) {
                        CacheXImpl.class310.field_1761.method_2896(CacheXImpl.class310.field_1724, class_1268.field_5808, (class_3965)field_1771);
                        CacheXImpl.class310.field_1724.method_6104(class_1268.field_5808);
                    }
                }
                if (enabled) {
                    return;
                }
            }
            this.execute_3();
        }
    }
    
    public void execute_3() {
        this.intValue = this.bindK_2.getValue().intValue();
        this.intValue_1 = this.bindK.getValue().intValue();
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.boolFlag_3 = false;
    }
    
    private boolean checkClass_1792(final class_1792 class_1792) {
        if (CacheXImpl.class310.field_1724 == null) {
            return false;
        }
        for (int i = 0; i < 9; ++i) {
            if (CacheXImpl.class310.field_1724.method_31548().method_5438(i).method_31574(class_1792)) {
                Initializer_8.setClass_1661AndInt(CacheXImpl.class310.field_1724.method_31548(), i);
                return true;
            }
        }
        return false;
    }
    
    static {
        final String[] strArr2 = new String[13];
        int n = 0;
        String s;
        int n2 = (s = "\u00ef\u0087¶\u009e\u00f1oR\u0083\"\u0003\u00fd\u00f1x'{X(¸,²+S¶@\u009a\u0086\u00cds¸G\u00e3w\u0087\u0092\u000bµ\u00eaW\u00dcy*\u000e\u00e6G\u00cbi\fR´'\u00ce|©\u00dd3\u0000;\u00f4\u0011\u0010[½\u007f\u00efp\u008d\u0083¶\u00d5±\u00cc<S{µ´\u000b\u00d8\u008d\u0003mr\u00dd\u00c0¹\u00d2\u00e3¨\u000509\"\u0016\u0012\r\t\u0092'esa\u0099@\u008e\u0014\u0000\u001c\u0099\u000f\u00e1 ¥7\u0018\u00e8\u0096\u009e\u000f_\n\u0010´=K\u0010l\u00f7\u00c6\u0090²\u0087\u00c3\u008f\u00ed\u001e1!6\u00de\u00f0¼\f\u0096´\u00d4¡\r\u00f9VTz|=§\u000b8nj\u0095\u00d5\u00c2\u00efS¬\u0094\u00d7").length();
        int n3 = 34;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 68));
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
                        Label_0263: {
                            if (length > 1) {
                                break Label_0263;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 5;
                                    case 1 -> 83;
                                    case 2 -> 58;
                                    case 3 -> 124;
                                    case 4 -> 59;
                                    case 5 -> 28;
                                    default -> 115;
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
                            n2 = (s = "\u00dd\u00056\u0087~\u00eaN\u00ca\u0000\u00c1\u00e8\u00ca\u0004\u00da\u00fc\u00c2K\n\u0091+&@\u0086_§\u00e6Iw").length();
                            n3 = 17;
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
                    n5 = (n6 = (n7 = (n8 = 63)));
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
        strArr_1 = new String[13];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x5011) & 0xFFFF;
        if (CacheXImpl.strArr_1[n3] == null) {
            final char[] charArray = CacheXImpl.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 90;
                case 1 -> 108;
                case 2 -> 38;
                case 3 -> 115;
                case 4 -> 52;
                case 5 -> 55;
                case 6 -> 150;
                case 7 -> 0;
                case 8 -> 23;
                case 9 -> 228;
                case 10 -> 100;
                case 11 -> 97;
                case 12 -> 81;
                case 13 -> 208;
                case 14 -> 180;
                case 15 -> 241;
                case 16 -> 17;
                case 17 -> 54;
                case 18 -> 145;
                case 19 -> 1;
                case 20 -> 176;
                case 21 -> 63;
                case 22 -> 119;
                case 23 -> 26;
                case 24 -> 162;
                case 25 -> 129;
                case 26 -> 89;
                case 27 -> 239;
                case 28 -> 189;
                case 29 -> 9;
                case 30 -> 64;
                case 31 -> 246;
                case 32 -> 31;
                case 33 -> 229;
                case 34 -> 210;
                case 35 -> 243;
                case 36 -> 41;
                case 37 -> 57;
                case 38 -> 209;
                case 39 -> 67;
                case 40 -> 141;
                case 41 -> 56;
                case 42 -> 131;
                case 43 -> 164;
                case 44 -> 233;
                case 45 -> 49;
                case 46 -> 234;
                case 47 -> 93;
                case 48 -> 201;
                case 49 -> 135;
                case 50 -> 53;
                case 51 -> 143;
                case 52 -> 104;
                case 53 -> 252;
                case 54 -> 105;
                case 55 -> 221;
                case 56 -> 167;
                case 57 -> 70;
                case 58 -> 227;
                case 59 -> 174;
                case 60 -> 122;
                case 61 -> 28;
                case 62 -> 34;
                case 63 -> 96;
                case 64 -> 99;
                case 65 -> 253;
                case 66 -> 179;
                case 67 -> 204;
                case 68 -> 140;
                case 69 -> 165;
                case 70 -> 226;
                case 71 -> 133;
                case 72 -> 196;
                case 73 -> 42;
                case 74 -> 166;
                case 75 -> 35;
                case 76 -> 153;
                case 77 -> 199;
                case 78 -> 123;
                case 79 -> 98;
                case 80 -> 11;
                case 81 -> 14;
                case 82 -> 242;
                case 83 -> 112;
                case 84 -> 125;
                case 85 -> 127;
                case 86 -> 187;
                case 87 -> 139;
                case 88 -> 168;
                case 89 -> 102;
                case 90 -> 68;
                case 91 -> 40;
                case 92 -> 43;
                case 93 -> 50;
                case 94 -> 190;
                case 95 -> 36;
                case 96 -> 151;
                case 97 -> 59;
                case 98 -> 25;
                case 99 -> 156;
                case 100 -> 12;
                case 101 -> 130;
                case 102 -> 198;
                case 103 -> 235;
                case 104 -> 217;
                case 105 -> 58;
                case 106 -> 158;
                case 107 -> 85;
                case 108 -> 138;
                case 109 -> 109;
                case 110 -> 46;
                case 111 -> 126;
                case 112 -> 170;
                case 113 -> 45;
                case 114 -> 213;
                case 115 -> 248;
                case 116 -> 83;
                case 117 -> 191;
                case 118 -> 121;
                case 119 -> 79;
                case 120 -> 62;
                case 121 -> 249;
                case 122 -> 160;
                case 123 -> 182;
                case 124 -> 65;
                case 125 -> 19;
                case 126 -> 220;
                case 127 -> 111;
                case 128 -> 88;
                case 129 -> 114;
                case 130 -> 195;
                case 131 -> 230;
                case 132 -> 2;
                case 133 -> 80;
                case 134 -> 106;
                case 135 -> 136;
                case 136 -> 163;
                case 137 -> 101;
                case 138 -> 8;
                case 139 -> 37;
                case 140 -> 22;
                case 141 -> 117;
                case 142 -> 183;
                case 143 -> 214;
                case 144 -> 206;
                case 145 -> 188;
                case 146 -> 207;
                case 147 -> 3;
                case 148 -> 128;
                case 149 -> 94;
                case 150 -> 137;
                case 151 -> 18;
                case 152 -> 171;
                case 153 -> 61;
                case 154 -> 134;
                case 155 -> 142;
                case 156 -> 238;
                case 157 -> 72;
                case 158 -> 148;
                case 159 -> 203;
                case 160 -> 74;
                case 161 -> 251;
                case 162 -> 236;
                case 163 -> 51;
                case 164 -> 66;
                case 165 -> 60;
                case 166 -> 146;
                case 167 -> 231;
                case 168 -> 185;
                case 169 -> 39;
                case 170 -> 7;
                case 171 -> 21;
                case 172 -> 181;
                case 173 -> 10;
                case 174 -> 237;
                case 175 -> 48;
                case 176 -> 216;
                case 177 -> 255;
                case 178 -> 175;
                case 179 -> 113;
                case 180 -> 194;
                case 181 -> 78;
                case 182 -> 118;
                case 183 -> 33;
                case 184 -> 218;
                case 185 -> 200;
                case 186 -> 202;
                case 187 -> 186;
                case 188 -> 193;
                case 189 -> 184;
                case 190 -> 161;
                case 191 -> 103;
                case 192 -> 92;
                case 193 -> 77;
                case 194 -> 107;
                case 195 -> 224;
                case 196 -> 232;
                case 197 -> 225;
                case 198 -> 245;
                case 199 -> 159;
                case 200 -> 223;
                case 201 -> 87;
                case 202 -> 155;
                case 203 -> 5;
                case 204 -> 4;
                case 205 -> 24;
                case 206 -> 178;
                case 207 -> 149;
                case 208 -> 219;
                case 209 -> 110;
                case 210 -> 244;
                case 211 -> 205;
                case 212 -> 47;
                case 213 -> 73;
                case 214 -> 157;
                case 215 -> 247;
                case 216 -> 132;
                case 217 -> 20;
                case 218 -> 240;
                case 219 -> 192;
                case 220 -> 172;
                case 221 -> 254;
                case 222 -> 250;
                case 223 -> 147;
                case 224 -> 212;
                case 225 -> 84;
                case 226 -> 197;
                case 227 -> 124;
                case 228 -> 154;
                case 229 -> 222;
                case 230 -> 27;
                case 231 -> 169;
                case 232 -> 86;
                case 233 -> 215;
                case 234 -> 82;
                case 235 -> 152;
                case 236 -> 116;
                case 237 -> 144;
                case 238 -> 16;
                case 239 -> 211;
                case 240 -> 69;
                case 241 -> 95;
                case 242 -> 6;
                case 243 -> 120;
                case 244 -> 15;
                case 245 -> 44;
                case 246 -> 75;
                case 247 -> 13;
                case 248 -> 32;
                case 249 -> 173;
                case 250 -> 29;
                case 251 -> 71;
                case 252 -> 91;
                case 253 -> 30;
                case 254 -> 76;
                default -> 177;
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
            CacheXImpl.strArr_1[n3] = new String(charArray).intern();
        }
        return CacheXImpl.strArr_1[n3];
    }
}
