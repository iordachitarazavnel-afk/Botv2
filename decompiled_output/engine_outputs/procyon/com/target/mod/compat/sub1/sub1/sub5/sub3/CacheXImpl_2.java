// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_642;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_21;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import java.awt.Color;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_4;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_2;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CacheXImpl_2 extends AbstractLoadF implements BlockEImpl_2
{
    private final RenderASub_6 eventQ;
    private final RenderASub_1 buffC;
    private final RenderASub_4 coreD;
    private boolean boolFlag;
    private int intValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CacheXImpl_2() {
        super(createString(7607, 2379), createString(7602, 9025), Initializer.stepF);
        this.eventQ = new RenderASub_6(createString(7600, -3164), "");
        this.buffC = new RenderASub_1(createString(7604, 22858), false);
        this.coreD = new RenderASub_4(createString(7606, 11693), new Color(65280));
        this.boolFlag = false;
        this.intValue = 0;
        this.setRenderaarr(this.eventQ, this.buffC, this.coreD);
        com.target.mod.compat.sub1.sub1.sub5.sub5.Initializer.execute();
    }
    
    @Override
    public void execute() {
        super.execute();
        this.renderA.setClassAndPackd(BlockEImpl_2.class, this);
        this.boolFlag = false;
        this.intValue = 0;
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        this.renderA.setClassAndPackd_1(BlockEImpl_2.class, this);
        com.target.mod.compat.sub1.sub1.sub5.sub5.Initializer.getBuffa().execute_1();
    }
    
    @Override
    public void execute_2() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        if (stringarrArray != null) {
            if (CacheXImpl_2.class310.field_1687 == null || CacheXImpl_2.class310.field_1724 == null) {
                this.boolFlag = false;
                this.intValue = 0;
            }
            else {
                final boolean enabled;
                final boolean b = enabled = this.isEnabled();
                if (stringarrArray != null) {
                    if (!b) {
                        return;
                    }
                    this.eventQ.getValue().isEmpty();
                }
                boolean boolFlag = false;
                Label_0143: {
                    if (stringarrArray != null) {
                        if (b) {
                            boolFlag = this.boolFlag;
                            if (stringarrArray == null) {
                                break Label_0143;
                            }
                            if (!boolFlag) {
                                CacheXImpl_2 cacheXImpl_2 = this;
                                if (stringarrArray != null) {
                                    if (this.intValue < 60) {
                                        ++this.intValue;
                                        return;
                                    }
                                    cacheXImpl_2 = this;
                                }
                                cacheXImpl_2.boolFlag = true;
                                CacheXImpl_2.class310.field_1724.field_3944.method_45730(createString(7603, 27040));
                            }
                        }
                        this.eventQ.getValue().isEmpty();
                    }
                }
                if (boolFlag) {
                    return;
                }
                com.target.mod.compat.sub1.sub1.sub5.sub5.Initializer.getBuffa().setClass_310(CacheXImpl_2.class310);
            }
        }
    }
    
    @Override
    public boolean isEnabled() {
        final class_310 method_1551 = class_310.method_1551();
        if (method_1551 == null) {
            return false;
        }
        final class_642 method_1552 = method_1551.method_1558();
        return method_1552 != null && method_1552.field_3761.toLowerCase().contains(Initializer_21.computeString(createString(7605, -4376)));
    }
    
    @Override
    public String getString() {
        return this.eventQ.getValue();
    }
    
    public boolean isEnabled_1() {
        return this.buffC.getValue();
    }
    
    @Override
    public int getInt() {
        return this.coreD.getColor().getRGB();
    }
    
    public RenderASub_6 getEventq() {
        return this.eventQ;
    }
    
    static {
        final String[] strArr2 = new String[7];
        int n = 0;
        String s;
        int n2 = (s = "\u00f1w\u00c0\u00ce\u009d\u0089L\u0092¥\u00cb\u00e0\b¶\u007fH\u0000\u00e2\u0011+\u00f4\t\u0081\u00ef\u0012(¿v\\sO\u0010\u00ef\u00d8\u0004\u00e1\u00e7IU¬½\u0002\u001e\u001f\u00d6\u0081\u001aB$\b;l»\u00c2cbLR¼\u0089s±\u00cb\u0004n¾#\u000bX\u00c0M\u0094\u0007¼\u009de\u0083¨^¯$\u001e\u0095´d").length();
        int n3 = 11;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 33));
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
                                    case 0 -> 66;
                                    case 1 -> 102;
                                    case 2 -> 57;
                                    case 3 -> 14;
                                    case 4 -> 125;
                                    case 5 -> 125;
                                    default -> 64;
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
                            n2 = (s = "\u00fc\u0092:\u00072V\u00e7\u0082}]\u00eb").length();
                            n3 = 3;
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
                    n5 = (n6 = (n7 = (n8 = 54)));
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
        strArr_1 = new String[7];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x1DB6) & 0xFFFF;
        if (CacheXImpl_2.strArr_1[n3] == null) {
            final char[] charArray = CacheXImpl_2.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 233;
                case 1 -> 28;
                case 2 -> 36;
                case 3 -> 147;
                case 4 -> 137;
                case 5 -> 187;
                case 6 -> 59;
                case 7 -> 202;
                case 8 -> 216;
                case 9 -> 237;
                case 10 -> 245;
                case 11 -> 160;
                case 12 -> 38;
                case 13 -> 205;
                case 14 -> 86;
                case 15 -> 223;
                case 16 -> 110;
                case 17 -> 120;
                case 18 -> 207;
                case 19 -> 83;
                case 20 -> 164;
                case 21 -> 47;
                case 22 -> 229;
                case 23 -> 238;
                case 24 -> 122;
                case 25 -> 213;
                case 26 -> 100;
                case 27 -> 255;
                case 28 -> 193;
                case 29 -> 156;
                case 30 -> 75;
                case 31 -> 194;
                case 32 -> 19;
                case 33 -> 76;
                case 34 -> 162;
                case 35 -> 172;
                case 36 -> 146;
                case 37 -> 170;
                case 38 -> 220;
                case 39 -> 33;
                case 40 -> 199;
                case 41 -> 73;
                case 42 -> 249;
                case 43 -> 89;
                case 44 -> 9;
                case 45 -> 18;
                case 46 -> 31;
                case 47 -> 144;
                case 48 -> 112;
                case 49 -> 87;
                case 50 -> 118;
                case 51 -> 228;
                case 52 -> 136;
                case 53 -> 78;
                case 54 -> 84;
                case 55 -> 43;
                case 56 -> 114;
                case 57 -> 91;
                case 58 -> 123;
                case 59 -> 177;
                case 60 -> 139;
                case 61 -> 132;
                case 62 -> 46;
                case 63 -> 225;
                case 64 -> 57;
                case 65 -> 67;
                case 66 -> 42;
                case 67 -> 242;
                case 68 -> 250;
                case 69 -> 64;
                case 70 -> 157;
                case 71 -> 24;
                case 72 -> 15;
                case 73 -> 173;
                case 74 -> 241;
                case 75 -> 85;
                case 76 -> 105;
                case 77 -> 66;
                case 78 -> 97;
                case 79 -> 17;
                case 80 -> 62;
                case 81 -> 79;
                case 82 -> 214;
                case 83 -> 248;
                case 84 -> 171;
                case 85 -> 93;
                case 86 -> 58;
                case 87 -> 168;
                case 88 -> 48;
                case 89 -> 174;
                case 90 -> 96;
                case 91 -> 142;
                case 92 -> 55;
                case 93 -> 95;
                case 94 -> 218;
                case 95 -> 154;
                case 96 -> 143;
                case 97 -> 138;
                case 98 -> 22;
                case 99 -> 81;
                case 100 -> 27;
                case 101 -> 41;
                case 102 -> 231;
                case 103 -> 230;
                case 104 -> 11;
                case 105 -> 68;
                case 106 -> 234;
                case 107 -> 23;
                case 108 -> 227;
                case 109 -> 226;
                case 110 -> 254;
                case 111 -> 1;
                case 112 -> 135;
                case 113 -> 217;
                case 114 -> 50;
                case 115 -> 104;
                case 116 -> 106;
                case 117 -> 8;
                case 118 -> 145;
                case 119 -> 14;
                case 120 -> 222;
                case 121 -> 235;
                case 122 -> 124;
                case 123 -> 53;
                case 124 -> 209;
                case 125 -> 163;
                case 126 -> 101;
                case 127 -> 54;
                case 128 -> 10;
                case 129 -> 221;
                case 130 -> 116;
                case 131 -> 49;
                case 132 -> 12;
                case 133 -> 103;
                case 134 -> 72;
                case 135 -> 203;
                case 136 -> 183;
                case 137 -> 25;
                case 138 -> 180;
                case 139 -> 149;
                case 140 -> 32;
                case 141 -> 133;
                case 142 -> 166;
                case 143 -> 82;
                case 144 -> 219;
                case 145 -> 35;
                case 146 -> 206;
                case 147 -> 4;
                case 148 -> 239;
                case 149 -> 92;
                case 150 -> 3;
                case 151 -> 185;
                case 152 -> 98;
                case 153 -> 150;
                case 154 -> 159;
                case 155 -> 131;
                case 156 -> 186;
                case 157 -> 99;
                case 158 -> 198;
                case 159 -> 113;
                case 160 -> 165;
                case 161 -> 109;
                case 162 -> 247;
                case 163 -> 251;
                case 164 -> 134;
                case 165 -> 117;
                case 166 -> 243;
                case 167 -> 111;
                case 168 -> 2;
                case 169 -> 244;
                case 170 -> 181;
                case 171 -> 140;
                case 172 -> 80;
                case 173 -> 65;
                case 174 -> 128;
                case 175 -> 191;
                case 176 -> 70;
                case 177 -> 208;
                case 178 -> 125;
                case 179 -> 167;
                case 180 -> 253;
                case 181 -> 192;
                case 182 -> 26;
                case 183 -> 246;
                case 184 -> 5;
                case 185 -> 200;
                case 186 -> 210;
                case 187 -> 102;
                case 188 -> 121;
                case 189 -> 51;
                case 190 -> 204;
                case 191 -> 6;
                case 192 -> 45;
                case 193 -> 108;
                case 194 -> 77;
                case 195 -> 252;
                case 196 -> 40;
                case 197 -> 63;
                case 198 -> 151;
                case 199 -> 129;
                case 200 -> 169;
                case 201 -> 158;
                case 202 -> 115;
                case 203 -> 161;
                case 204 -> 148;
                case 205 -> 182;
                case 206 -> 141;
                case 207 -> 0;
                case 208 -> 44;
                case 209 -> 39;
                case 210 -> 88;
                case 211 -> 189;
                case 212 -> 52;
                case 213 -> 176;
                case 214 -> 127;
                case 215 -> 224;
                case 216 -> 7;
                case 217 -> 13;
                case 218 -> 126;
                case 219 -> 178;
                case 220 -> 215;
                case 221 -> 29;
                case 222 -> 190;
                case 223 -> 152;
                case 224 -> 195;
                case 225 -> 37;
                case 226 -> 153;
                case 227 -> 212;
                case 228 -> 94;
                case 229 -> 201;
                case 230 -> 240;
                case 231 -> 155;
                case 232 -> 184;
                case 233 -> 30;
                case 234 -> 16;
                case 235 -> 90;
                case 236 -> 197;
                case 237 -> 21;
                case 238 -> 74;
                case 239 -> 236;
                case 240 -> 175;
                case 241 -> 20;
                case 242 -> 179;
                case 243 -> 56;
                case 244 -> 119;
                case 245 -> 71;
                case 246 -> 69;
                case 247 -> 232;
                case 248 -> 196;
                case 249 -> 211;
                case 250 -> 61;
                case 251 -> 60;
                case 252 -> 34;
                case 253 -> 188;
                case 254 -> 107;
                default -> 130;
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
            CacheXImpl_2.strArr_1[n3] = new String(charArray).intern();
        }
        return CacheXImpl_2.strArr_1[n3];
    }
}
