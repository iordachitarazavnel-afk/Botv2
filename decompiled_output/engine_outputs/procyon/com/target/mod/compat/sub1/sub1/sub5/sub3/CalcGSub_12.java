// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_12 extends AbstractLoadF
{
    public final RenderASub_6 eventQ;
    public final RenderASub_6 eventQ_1;
    public final RenderASub_6 eventQ_2;
    public final RenderASub_6 eventQ_3;
    public final RenderASub_6 eventQ_4;
    public final RenderASub_6 eventQ_5;
    public final RenderASub_6 eventQ_6;
    public final RenderASub_6 eventQ_7;
    public final RenderASub_6 eventQ_8;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_12() {
        super(createString(-11031, 9227), createString(-11030, -24565), Initializer.stepF);
        this.eventQ = new RenderASub_6(createString(-11009, -19085), createString(-11017, -3977));
        Initializer_13.getStringarrArray();
        this.eventQ_1 = new RenderASub_6(createString(-11029, -23972), createString(-11019, -15823));
        this.eventQ_2 = new RenderASub_6(createString(-11010, 11523), createString(-11015, -8865));
        this.eventQ_3 = new RenderASub_6(createString(-11012, 23569), createString(-11016, -5311));
        this.eventQ_4 = new RenderASub_6(createString(-11021, 5149), createString(-11013, 15981));
        this.eventQ_5 = new RenderASub_6(createString(-11022, 32090), createString(-11032, -19869));
        this.eventQ_6 = new RenderASub_6(createString(-11020, 11849), createString(-11018, -29224));
        this.eventQ_7 = new RenderASub_6(createString(-11024, 5181), createString(-11023, -18098));
        this.eventQ_8 = new RenderASub_6(createString(-11014, 30377), createString(-11011, 5686));
        this.setRenderaarr(this.eventQ, this.eventQ_1, this.eventQ_2, this.eventQ_3, this.eventQ_4, this.eventQ_5, this.eventQ_6, this.eventQ_7, this.eventQ_8);
        if (com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt() == 0) {
            Initializer_13.setStringarr(new String[5]);
        }
    }
    
    public static CalcGSub_12 getSorth() {
        return Initializer_1.syncF.computeCalcg_1(CalcGSub_12.class);
    }
    
    @Override
    public void execute() {
        super.execute();
    }
    
    static {
        final String[] strArr2 = new String[20];
        int n = 0;
        String s;
        int n2 = (s = "\u0099y\u001e\u008a\u0007\u00d7\u00c3~\u000f\u0013\u009e \u0003\u00c8\u001c\u0083\u0003\u00cbl\u00c0\u0005?O°G®\u0005\u0098\u00d0\u0080{\u00e0\u0006a\u00d3\u0098A\u001c\u00cd\u0002 b\b¬\u00c9·'\u00e5·\u00ea¨\u0007c`.c\u00f8H\u00db\u0006\\&\u00ed\u00e2s\u001a\u0005]\u00cf\u00eavT\u0006§}i¼&r\u0007\u00d9a¶\u0091}\u00c5\u000b\u0004\u00c0¾¾\u00f5\u0004\u001aU\u001d\u008c\u0018²X\u0019\u009f\u00f8&¢¿!«cw&\u0095\u00fc\u009e\u00fb²\u000b\u009c\u00ef\u001c\u008a\u0088\u0006\u0086\u00d3\u0091\u00eb1^").length();
        int n3 = 4;
        int n4 = -1;
    Label_0022:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 87));
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
                        Label_0259: {
                            if (length > 1) {
                                break Label_0259;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 4;
                                    case 1 -> 32;
                                    case 2 -> 36;
                                    case 3 -> 63;
                                    case 4 -> 19;
                                    case 5 -> 54;
                                    default -> 30;
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
                            n2 = (s = "*\u00ff\u0098\u00f9<\u00cb\u000e\u0089£\u0019\u000e\u0088\u00d3R¬'\u0006\u0010qJ\u0012").length();
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
                            break Label_0022;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 65)));
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
        final int n3 = (n ^ 0xFFFFD4FA) & 0xFFFF;
        if (CalcGSub_12.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_12.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 70;
                case 1 -> 152;
                case 2 -> 67;
                case 3 -> 239;
                case 4 -> 195;
                case 5 -> 38;
                case 6 -> 30;
                case 7 -> 52;
                case 8 -> 118;
                case 9 -> 75;
                case 10 -> 27;
                case 11 -> 172;
                case 12 -> 232;
                case 13 -> 244;
                case 14 -> 241;
                case 15 -> 224;
                case 16 -> 76;
                case 17 -> 254;
                case 18 -> 137;
                case 19 -> 145;
                case 20 -> 7;
                case 21 -> 37;
                case 22 -> 163;
                case 23 -> 121;
                case 24 -> 51;
                case 25 -> 229;
                case 26 -> 123;
                case 27 -> 128;
                case 28 -> 126;
                case 29 -> 82;
                case 30 -> 169;
                case 31 -> 219;
                case 32 -> 225;
                case 33 -> 251;
                case 34 -> 77;
                case 35 -> 188;
                case 36 -> 196;
                case 37 -> 240;
                case 38 -> 66;
                case 39 -> 158;
                case 40 -> 252;
                case 41 -> 64;
                case 42 -> 43;
                case 43 -> 33;
                case 44 -> 28;
                case 45 -> 44;
                case 46 -> 113;
                case 47 -> 10;
                case 48 -> 162;
                case 49 -> 131;
                case 50 -> 155;
                case 51 -> 22;
                case 52 -> 149;
                case 53 -> 84;
                case 54 -> 17;
                case 55 -> 5;
                case 56 -> 62;
                case 57 -> 176;
                case 58 -> 191;
                case 59 -> 185;
                case 60 -> 174;
                case 61 -> 34;
                case 62 -> 160;
                case 63 -> 49;
                case 64 -> 125;
                case 65 -> 46;
                case 66 -> 100;
                case 67 -> 92;
                case 68 -> 32;
                case 69 -> 112;
                case 70 -> 42;
                case 71 -> 236;
                case 72 -> 211;
                case 73 -> 182;
                case 74 -> 166;
                case 75 -> 203;
                case 76 -> 74;
                case 77 -> 65;
                case 78 -> 222;
                case 79 -> 235;
                case 80 -> 88;
                case 81 -> 189;
                case 82 -> 86;
                case 83 -> 161;
                case 84 -> 127;
                case 85 -> 1;
                case 86 -> 159;
                case 87 -> 167;
                case 88 -> 110;
                case 89 -> 55;
                case 90 -> 12;
                case 91 -> 150;
                case 92 -> 134;
                case 93 -> 200;
                case 94 -> 233;
                case 95 -> 206;
                case 96 -> 13;
                case 97 -> 114;
                case 98 -> 221;
                case 99 -> 106;
                case 100 -> 61;
                case 101 -> 63;
                case 102 -> 248;
                case 103 -> 120;
                case 104 -> 202;
                case 105 -> 255;
                case 106 -> 98;
                case 107 -> 109;
                case 108 -> 220;
                case 109 -> 168;
                case 110 -> 94;
                case 111 -> 6;
                case 112 -> 36;
                case 113 -> 99;
                case 114 -> 117;
                case 115 -> 245;
                case 116 -> 243;
                case 117 -> 25;
                case 118 -> 3;
                case 119 -> 181;
                case 120 -> 223;
                case 121 -> 21;
                case 122 -> 135;
                case 123 -> 72;
                case 124 -> 20;
                case 125 -> 190;
                case 126 -> 71;
                case 127 -> 90;
                case 128 -> 16;
                case 129 -> 198;
                case 130 -> 56;
                case 131 -> 95;
                case 132 -> 187;
                case 133 -> 227;
                case 134 -> 4;
                case 135 -> 35;
                case 136 -> 143;
                case 137 -> 0;
                case 138 -> 201;
                case 139 -> 249;
                case 140 -> 170;
                case 141 -> 151;
                case 142 -> 79;
                case 143 -> 48;
                case 144 -> 57;
                case 145 -> 73;
                case 146 -> 41;
                case 147 -> 130;
                case 148 -> 140;
                case 149 -> 53;
                case 150 -> 157;
                case 151 -> 226;
                case 152 -> 178;
                case 153 -> 80;
                case 154 -> 50;
                case 155 -> 146;
                case 156 -> 87;
                case 157 -> 242;
                case 158 -> 101;
                case 159 -> 40;
                case 160 -> 231;
                case 161 -> 132;
                case 162 -> 153;
                case 163 -> 204;
                case 164 -> 228;
                case 165 -> 68;
                case 166 -> 58;
                case 167 -> 96;
                case 168 -> 104;
                case 169 -> 85;
                case 170 -> 107;
                case 171 -> 119;
                case 172 -> 165;
                case 173 -> 47;
                case 174 -> 29;
                case 175 -> 184;
                case 176 -> 164;
                case 177 -> 207;
                case 178 -> 213;
                case 179 -> 108;
                case 180 -> 97;
                case 181 -> 253;
                case 182 -> 217;
                case 183 -> 142;
                case 184 -> 205;
                case 185 -> 83;
                case 186 -> 210;
                case 187 -> 148;
                case 188 -> 216;
                case 189 -> 115;
                case 190 -> 136;
                case 191 -> 18;
                case 192 -> 199;
                case 193 -> 60;
                case 194 -> 208;
                case 195 -> 8;
                case 196 -> 209;
                case 197 -> 173;
                case 198 -> 102;
                case 199 -> 91;
                case 200 -> 116;
                case 201 -> 2;
                case 202 -> 15;
                case 203 -> 237;
                case 204 -> 129;
                case 205 -> 246;
                case 206 -> 197;
                case 207 -> 218;
                case 208 -> 122;
                case 209 -> 234;
                case 210 -> 11;
                case 211 -> 81;
                case 212 -> 212;
                case 213 -> 214;
                case 214 -> 105;
                case 215 -> 192;
                case 216 -> 238;
                case 217 -> 59;
                case 218 -> 19;
                case 219 -> 156;
                case 220 -> 183;
                case 221 -> 250;
                case 222 -> 177;
                case 223 -> 139;
                case 224 -> 133;
                case 225 -> 89;
                case 226 -> 247;
                case 227 -> 180;
                case 228 -> 9;
                case 229 -> 26;
                case 230 -> 31;
                case 231 -> 230;
                case 232 -> 78;
                case 233 -> 103;
                case 234 -> 69;
                case 235 -> 141;
                case 236 -> 215;
                case 237 -> 147;
                case 238 -> 14;
                case 239 -> 194;
                case 240 -> 111;
                case 241 -> 193;
                case 242 -> 186;
                case 243 -> 23;
                case 244 -> 39;
                case 245 -> 144;
                case 246 -> 138;
                case 247 -> 154;
                case 248 -> 45;
                case 249 -> 54;
                case 250 -> 124;
                case 251 -> 93;
                case 252 -> 175;
                case 253 -> 179;
                case 254 -> 24;
                default -> 171;
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
            CalcGSub_12.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_12.strArr_1[n3];
    }
}
