// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_2586;
import java.util.Iterator;
import net.minecraft.class_2627;
import net.minecraft.class_2611;
import net.minecraft.class_2601;
import net.minecraft.class_2614;
import net.minecraft.class_2595;
import net.minecraft.class_2636;
import net.minecraft.class_2338;
import net.minecraft.class_2661;
import net.minecraft.class_2561;
import net.minecraft.class_1802;
import net.minecraft.class_2818;
import java.util.function.Consumer;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BuildBSub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_1;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class BuffPImpl extends AbstractLoadF implements BlockEImpl_1
{
    private final RenderASub_15<com.target.mod.compat.sub1.sub1.sub5.sub3.Initializer_3> wrapJ;
    int intValue;
    int intValue_1;
    int intValue_2;
    int intValue_3;
    int intValue_4;
    boolean boolFlag;
    boolean boolFlag_1;
    com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1 eventB;
    boolean boolFlag_2;
    boolean boolFlag_3;
    private long longValue;
    private boolean boolFlag_4;
    private boolean boolFlag_5;
    private boolean boolFlag_6;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public BuffPImpl() {
        super(createString(17444, 10889), createString(17440, 27546), Initializer.stepF);
        this.wrapJ = new RenderASub_15<com.target.mod.compat.sub1.sub1.sub5.sub3.Initializer_3>(createString(17465, -23077), com.target.mod.compat.sub1.sub1.sub5.sub3.Initializer_3.random, com.target.mod.compat.sub1.sub1.sub5.sub3.Initializer_3.class);
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.intValue_3 = 0;
        this.intValue_4 = 0;
        this.boolFlag_1 = false;
        this.boolFlag_2 = false;
        this.boolFlag_3 = false;
        this.longValue = -1L;
        this.boolFlag_4 = true;
        this.boolFlag_5 = false;
        this.boolFlag_6 = true;
        this.setRenderaarr(this.wrapJ);
    }
    
    @Override
    public void execute() {
        super.execute();
        BuffPImpl.class310.execute(BuffPImpl::lambda$onEnable$0);
        this.renderA.setClassAndPackd(BlockEImpl_1.class, this);
        this.longValue = -1L;
        this.boolFlag_4 = true;
        this.boolFlag_5 = false;
        this.boolFlag_6 = true;
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        this.renderA.setClassAndPackd_1(BlockEImpl_1.class, this);
    }
    
    @Override
    public void setCorej(final BuildBSub buildBSub) {
        if (this.boolFlag_3 && !this.eventB.isEnabled()) {
            this.eventB.processAll(BuffPImpl.class310.field_1724.method_36454(), 85.45357f, this::lambda$onGameRender$1);
        }
        if (this.boolFlag_3 && this.eventB.isEnabled()) {
            this.eventB.setBoolAndBool(true, false);
        }
    }
    
    void execute_2() {
        Label_0354: {
            switch (this.wrapJ.getValue().ordinal()) {
                case 1: {
                    BuffPImpl.class310.method_1562().method_45730(createString(17453, 3049));
                    break;
                }
                case 2: {
                    BuffPImpl.class310.method_1562().method_45730(createString(17443, -32396));
                    break;
                }
                case 3: {
                    BuffPImpl.class310.method_1562().method_45730(createString(17441, -23127));
                    break;
                }
                case 4: {
                    BuffPImpl.class310.method_1562().method_45730(createString(17450, -27785));
                    break;
                }
                case 5: {
                    BuffPImpl.class310.method_1562().method_45730(createString(17445, -10918));
                    break;
                }
                case 6: {
                    BuffPImpl.class310.method_1562().method_45730(createString(17442, -1133));
                    break;
                }
                case 0: {
                    switch ((int)(Math.random() * 6.0)) {
                        case 0: {
                            BuffPImpl.class310.method_1562().method_45730(createString(17452, -93));
                            break Label_0354;
                        }
                        case 1: {
                            BuffPImpl.class310.method_1562().method_45730(createString(17466, -29786));
                            break Label_0354;
                        }
                        case 2: {
                            BuffPImpl.class310.method_1562().method_45730(createString(17455, 28437));
                            break Label_0354;
                        }
                        case 3: {
                            BuffPImpl.class310.method_1562().method_45730(createString(17448, 5300));
                            break Label_0354;
                        }
                        case 4: {
                            BuffPImpl.class310.method_1562().method_45730(createString(17454, 32060));
                            break Label_0354;
                        }
                        case 5: {
                            BuffPImpl.class310.method_1562().method_45730(createString(17464, 28239));
                            break Label_0354;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public void execute_3() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        super.execute_2();
        final String[] array = stringarrArray;
        BuffPImpl buffPImpl = this;
        Label_0033: {
            if (array != null) {
                if (this.eventB != null) {
                    break Label_0033;
                }
                buffPImpl = this;
            }
            buffPImpl.eventB = new com.target.mod.compat.sub1.sub1.sub7.sub1.Initializer_1(BuffPImpl.class310);
        }
        boolean b;
        int boolFlag_3;
        int n5;
        int n4;
        int n3;
        int n2;
        final int n = n2 = (n3 = (n4 = (n5 = (boolFlag_3 = ((b = (BuffPImpl.class310.field_1687 == null)) ? 1 : 0)))));
        Label_0104: {
            Label_0100: {
                if (array != null) {
                    if (n != 0) {
                        this.longValue = -1L;
                        this.boolFlag_4 = true;
                        this.boolFlag_5 = false;
                        if (array != null) {
                            break Label_0100;
                        }
                    }
                    n3 = (n2 = (n4 = (n5 = (boolFlag_3 = ((b = this.boolFlag_4) ? 1 : 0)))));
                }
                if (array == null) {
                    break Label_0104;
                }
                if (n2 != 0) {
                    this.longValue = System.currentTimeMillis();
                    this.boolFlag_4 = false;
                }
            }
            n4 = (n3 = (n5 = (boolFlag_3 = ((b = this.boolFlag_5) ? 1 : 0))));
        }
        Label_0166: {
            if (array != null) {
                if (n3 != 0) {
                    final int n6 = n4 = (n5 = (boolFlag_3 = ((b = lcmp(this.longValue, -1L)) ? 1 : 0)));
                    if (array == null) {
                        break Label_0166;
                    }
                    if (n6 != 0) {
                        final int n7 = n4 = (n5 = (boolFlag_3 = ((b = lcmp(System.currentTimeMillis() - this.longValue, 2500L)) ? 1 : 0)));
                        if (array == null) {
                            break Label_0166;
                        }
                        if (n7 >= 0) {
                            this.boolFlag_5 = false;
                            this.boolFlag_3 = true;
                            this.boolFlag_6 = false;
                        }
                    }
                }
                n5 = (n4 = (boolFlag_3 = ((b = this.isEnabled()) ? 1 : 0)));
            }
        }
        if (array != null) {
            if (n4 == 0) {
                this.setString(createString(17449, -31010));
            }
            this.execute_4();
            boolFlag_3 = (n5 = ((b = ((int)BuffPImpl.class310.field_1724.method_36455() != 0)) ? 1 : 0));
        }
        if (array != null) {
            if (n5 == 85) {
                this.boolFlag_3 = false;
                final double n8 = dcmpl(BuffPImpl.class310.field_1724.method_23318(), 0.0);
                BuffPImpl buffPImpl2 = null;
                Label_0304: {
                    if (array != null) {
                        if (n8 > 0) {
                            BuffPImpl.class310.field_1690.field_1886.method_23481(true);
                            BuffPImpl.class310.field_1690.field_1832.method_23481(true);
                            if (array != null) {
                                return;
                            }
                        }
                        BuffPImpl.class310.field_1690.field_1886.method_23481(false);
                        BuffPImpl.class310.field_1690.field_1832.method_23481(false);
                        buffPImpl2 = this;
                        if (array == null) {
                            break Label_0304;
                        }
                        final boolean boolFlag_4 = this.boolFlag_2;
                    }
                    if (n8 != 0) {
                        return;
                    }
                    this.execute_2();
                    buffPImpl2 = this;
                }
                buffPImpl2.boolFlag_2 = true;
                if (array != null) {
                    return;
                }
            }
            this.boolFlag_2 = false;
            b = ((boolFlag_3 = (this.boolFlag_3 ? 1 : 0)) != 0);
        }
        Label_0358: {
            BuffPImpl buffPImpl3 = null;
            Label_0350: {
                if (array != null) {
                    if (boolFlag_3 != 0) {
                        return;
                    }
                    buffPImpl3 = this;
                    if (array == null) {
                        break Label_0350;
                    }
                    b = this.boolFlag_6;
                }
                if (!b) {
                    break Label_0358;
                }
                this.boolFlag_3 = true;
                this.boolFlag_6 = false;
                buffPImpl3 = this;
            }
            buffPImpl3.boolFlag_5 = false;
            if (array != null) {
                return;
            }
        }
        long longValue = 0L;
        long n9 = 0L;
        Label_0398: {
            Label_0391: {
                if (BuffPImpl.class310.field_1687 != null) {
                    longValue = this.longValue;
                    n9 = -1L;
                    if (array == null) {
                        break Label_0398;
                    }
                    if (longValue != n9) {
                        break Label_0391;
                    }
                }
                this.boolFlag_5 = true;
                if (array != null) {
                    return;
                }
            }
            System.currentTimeMillis();
            final long longValue2 = this.longValue;
        }
        final long n10 = longValue - n9;
        Label_0426: {
            if (array != null) {
                if (n10 < 2500L) {
                    break Label_0426;
                }
                this.boolFlag_3 = true;
                this.boolFlag_5 = false;
            }
            if (array != null) {
                return;
            }
        }
        this.boolFlag_5 = true;
    }
    
    private void execute_4() {
        if (BuffPImpl.class310.field_1724 == null || BuffPImpl.class310.field_1687 == null) {
            return;
        }
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.intValue_3 = 0;
        this.intValue_4 = 0;
        this.boolFlag = false;
        Initializer_9.getStream().forEach(this::lambda$scanForBase$2);
        boolean b = false;
        String string = "";
        if (this.intValue >= 20) {
            b = true;
            string = createString(17467, 4503);
        }
        else if (this.intValue_4 >= 20) {
            b = true;
            string = createString(17446, -1851);
        }
        else if (this.boolFlag) {
            b = true;
            string = createString(17451, 8654);
        }
        if (b) {
            this.setString(string);
        }
    }
    
    private boolean isEnabled() {
        return BuffPImpl.class310.field_1724 != null && BuffPImpl.class310.field_1724.method_6079().method_7909() == class_1802.field_8288;
    }
    
    private void setString(final String s) {
        if (BuffPImpl.class310.field_1687 == null || this.longValue == -1L) {
            return;
        }
        if (System.currentTimeMillis() - this.longValue < 2500L) {
            return;
        }
        this.execute_2();
        if (BuffPImpl.class310.field_1724 != null && BuffPImpl.class310.field_1724.field_3944 != null) {
            BuffPImpl.class310.field_1724.field_3944.method_52781(new class_2661((class_2561)class_2561.method_43470(createString(17447, -32293) + s)));
        }
    }
    
    private void lambda$scanForBase$2(final class_2818 class_2818) {
        final Iterator iterator = class_2818.method_12021().iterator();
        while (iterator.hasNext()) {
            final class_2586 method_8321 = BuffPImpl.class310.field_1687.method_8321((class_2338)iterator.next());
            if (method_8321 == null) {
                continue;
            }
            if (method_8321 instanceof class_2636) {
                this.boolFlag = true;
            }
            if (method_8321.method_11016().method_10264() > 0) {
                continue;
            }
            if (method_8321 instanceof class_2595) {
                ++this.intValue;
            }
            else if (method_8321 instanceof class_2614) {
                ++this.intValue_1;
            }
            else if (method_8321 instanceof class_2601) {
                ++this.intValue_2;
            }
            else if (method_8321 instanceof class_2611) {
                ++this.intValue_3;
            }
            else {
                if (!(method_8321 instanceof class_2627)) {
                    continue;
                }
                ++this.intValue_4;
            }
        }
    }
    
    private void lambda$onGameRender$1() {
        this.boolFlag_3 = false;
    }
    
    private static void lambda$onEnable$0() {
        BuffPImpl.class310.field_1755.method_25419();
    }
    
    static {
        final String[] strArr2 = new String[20];
        int n = 0;
        String s;
        int n2 = (s = "\u00d8\u008fm\u00fc\f\u009b\u00e0\u00c7:£-\u001fk;\r\u00f0K|·\u0016_\u009b\u000eN°\u00c1@\u00d2\u000e°[`f\u00ad\u00c8\u00d4\u00ad¼\u00ee\u00fd¶q\u000e\f\u000f\u0091q\u0002\u0003\u00fcx\u00d8B\u00d3\u0084\u00da\bW\u00c3\u009cu6¬j\u00e5\u000b\u00e8\u0019k.\u00cc\u00c1\u00f8\u00989\u00c3M\b\u00cdb\u00cfAX892\b\u00e7r\u008aC\u00f0x,:\u000b{\u0098\u0019\u001e\u0088\u00d1~X\u000f\u0015\u00f4\b>`±\u0001\u00854\u00d27\u001bh[\u00d7\u009c\u0090\u000e\u00e5\u0088\u0086\u0003i3\u0007³\u00e2#+<\u00fc0\u00f2)º\u00f0\u00cb;\u00c0\u000b¯\u00e0\u0083\u0011\u00d1&[dM\\\u00c3\u0019½\u00f8\u00c1\u00c12\u00e9º\u00d8xmP\u0017\u0010\u00cb|\u0017S\u00f4J\u008a\u009c\u00f7\u00d1®\u00ec\u0010\f©\u00f3~\u00ff\u00e3_+,¿r\u008b\u0081\u0010|a\rw\u0083\u009c;\u0012K\u00e2>\u009b\u001d\u0084\u00df_\b\u00e2&*\u00c9\u00e0;°\u0017\b\u00e0\u008ej\u00dc\u00fe\u008f½@\u0017I\u0095]s¬\u0006\u0093\u0080\u009d*+^BJ¢\u00ef\u00f4ky\u0092\u008246").length();
        int n3 = 14;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 65));
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
                                    case 0 -> 43;
                                    case 1 -> 102;
                                    case 2 -> 54;
                                    case 3 -> 114;
                                    case 4 -> 21;
                                    case 5 -> 114;
                                    default -> 67;
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
                            n2 = (s = "\u00ad\u00c5H>)^\u00c1\"s\u00d1\u00f0\u0006=\ti\u00dd\u00f8O").length();
                            n3 = 11;
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
                    n5 = (n6 = (n7 = (n8 = 38)));
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
        strArr_1 = new String[20];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x442A) & 0xFFFF;
        if (BuffPImpl.strArr_1[n3] == null) {
            final char[] charArray = BuffPImpl.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 87;
                case 1 -> 228;
                case 2 -> 86;
                case 3 -> 103;
                case 4 -> 243;
                case 5 -> 45;
                case 6 -> 109;
                case 7 -> 216;
                case 8 -> 143;
                case 9 -> 22;
                case 10 -> 6;
                case 11 -> 240;
                case 12 -> 46;
                case 13 -> 23;
                case 14 -> 225;
                case 15 -> 24;
                case 16 -> 244;
                case 17 -> 48;
                case 18 -> 31;
                case 19 -> 158;
                case 20 -> 213;
                case 21 -> 44;
                case 22 -> 189;
                case 23 -> 181;
                case 24 -> 229;
                case 25 -> 248;
                case 26 -> 153;
                case 27 -> 119;
                case 28 -> 20;
                case 29 -> 58;
                case 30 -> 199;
                case 31 -> 42;
                case 32 -> 108;
                case 33 -> 29;
                case 34 -> 222;
                case 35 -> 55;
                case 36 -> 254;
                case 37 -> 123;
                case 38 -> 155;
                case 39 -> 205;
                case 40 -> 75;
                case 41 -> 219;
                case 42 -> 95;
                case 43 -> 98;
                case 44 -> 80;
                case 45 -> 15;
                case 46 -> 35;
                case 47 -> 138;
                case 48 -> 121;
                case 49 -> 113;
                case 50 -> 170;
                case 51 -> 61;
                case 52 -> 122;
                case 53 -> 160;
                case 54 -> 187;
                case 55 -> 4;
                case 56 -> 177;
                case 57 -> 130;
                case 58 -> 124;
                case 59 -> 188;
                case 60 -> 84;
                case 61 -> 237;
                case 62 -> 33;
                case 63 -> 39;
                case 64 -> 255;
                case 65 -> 126;
                case 66 -> 186;
                case 67 -> 249;
                case 68 -> 144;
                case 69 -> 154;
                case 70 -> 9;
                case 71 -> 184;
                case 72 -> 210;
                case 73 -> 192;
                case 74 -> 165;
                case 75 -> 157;
                case 76 -> 25;
                case 77 -> 194;
                case 78 -> 137;
                case 79 -> 246;
                case 80 -> 41;
                case 81 -> 250;
                case 82 -> 147;
                case 83 -> 232;
                case 84 -> 78;
                case 85 -> 112;
                case 86 -> 34;
                case 87 -> 100;
                case 88 -> 133;
                case 89 -> 85;
                case 90 -> 135;
                case 91 -> 218;
                case 92 -> 198;
                case 93 -> 32;
                case 94 -> 72;
                case 95 -> 30;
                case 96 -> 166;
                case 97 -> 178;
                case 98 -> 200;
                case 99 -> 142;
                case 100 -> 127;
                case 101 -> 173;
                case 102 -> 167;
                case 103 -> 13;
                case 104 -> 8;
                case 105 -> 224;
                case 106 -> 190;
                case 107 -> 241;
                case 108 -> 150;
                case 109 -> 226;
                case 110 -> 238;
                case 111 -> 129;
                case 112 -> 99;
                case 113 -> 203;
                case 114 -> 204;
                case 115 -> 231;
                case 116 -> 247;
                case 117 -> 172;
                case 118 -> 21;
                case 119 -> 67;
                case 120 -> 89;
                case 121 -> 28;
                case 122 -> 104;
                case 123 -> 52;
                case 124 -> 151;
                case 125 -> 208;
                case 126 -> 191;
                case 127 -> 163;
                case 128 -> 16;
                case 129 -> 236;
                case 130 -> 37;
                case 131 -> 60;
                case 132 -> 227;
                case 133 -> 102;
                case 134 -> 162;
                case 135 -> 3;
                case 136 -> 96;
                case 137 -> 105;
                case 138 -> 174;
                case 139 -> 152;
                case 140 -> 193;
                case 141 -> 234;
                case 142 -> 94;
                case 143 -> 212;
                case 144 -> 50;
                case 145 -> 239;
                case 146 -> 76;
                case 147 -> 10;
                case 148 -> 82;
                case 149 -> 145;
                case 150 -> 71;
                case 151 -> 110;
                case 152 -> 136;
                case 153 -> 195;
                case 154 -> 5;
                case 155 -> 182;
                case 156 -> 156;
                case 157 -> 215;
                case 158 -> 57;
                case 159 -> 7;
                case 160 -> 125;
                case 161 -> 27;
                case 162 -> 17;
                case 163 -> 220;
                case 164 -> 251;
                case 165 -> 53;
                case 166 -> 131;
                case 167 -> 206;
                case 168 -> 11;
                case 169 -> 43;
                case 170 -> 179;
                case 171 -> 115;
                case 172 -> 140;
                case 173 -> 107;
                case 174 -> 70;
                case 175 -> 73;
                case 176 -> 26;
                case 177 -> 175;
                case 178 -> 183;
                case 179 -> 180;
                case 180 -> 97;
                case 181 -> 171;
                case 182 -> 69;
                case 183 -> 111;
                case 184 -> 209;
                case 185 -> 217;
                case 186 -> 54;
                case 187 -> 148;
                case 188 -> 90;
                case 189 -> 49;
                case 190 -> 230;
                case 191 -> 77;
                case 192 -> 252;
                case 193 -> 0;
                case 194 -> 81;
                case 195 -> 197;
                case 196 -> 19;
                case 197 -> 242;
                case 198 -> 169;
                case 199 -> 235;
                case 200 -> 207;
                case 201 -> 211;
                case 202 -> 106;
                case 203 -> 38;
                case 204 -> 202;
                case 205 -> 221;
                case 206 -> 168;
                case 207 -> 185;
                case 208 -> 64;
                case 209 -> 134;
                case 210 -> 1;
                case 211 -> 139;
                case 212 -> 62;
                case 213 -> 196;
                case 214 -> 176;
                case 215 -> 65;
                case 216 -> 223;
                case 217 -> 164;
                case 218 -> 12;
                case 219 -> 68;
                case 220 -> 74;
                case 221 -> 117;
                case 222 -> 14;
                case 223 -> 132;
                case 224 -> 101;
                case 225 -> 245;
                case 226 -> 159;
                case 227 -> 141;
                case 228 -> 47;
                case 229 -> 88;
                case 230 -> 59;
                case 231 -> 128;
                case 232 -> 118;
                case 233 -> 93;
                case 234 -> 161;
                case 235 -> 36;
                case 236 -> 66;
                case 237 -> 91;
                case 238 -> 79;
                case 239 -> 2;
                case 240 -> 83;
                case 241 -> 92;
                case 242 -> 120;
                case 243 -> 114;
                case 244 -> 214;
                case 245 -> 40;
                case 246 -> 146;
                case 247 -> 116;
                case 248 -> 51;
                case 249 -> 18;
                case 250 -> 201;
                case 251 -> 253;
                case 252 -> 233;
                case 253 -> 149;
                case 254 -> 63;
                default -> 56;
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
            BuffPImpl.strArr_1[n3] = new String(charArray).intern();
        }
        return BuffPImpl.strArr_1[n3];
    }
}
