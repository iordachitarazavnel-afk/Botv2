// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_2561;
import java.io.File;
import java.util.function.Consumer;
import net.minecraft.class_318;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_4;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_8;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub2.sub1.BlockEImpl_2;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CacheXImpl_1 extends AbstractLoadF implements BlockEImpl_2
{
    private final RenderASub_6 eventQ;
    private final RenderASub_1 buffC;
    private final RenderASub_7 gridH;
    private final RenderASub_1 buffC_1;
    private final RenderASub bindK;
    private boolean boolFlag;
    private boolean boolFlag_1;
    private int intValue;
    private boolean boolFlag_2;
    private int intValue_1;
    private long longValue;
    private int intValue_2;
    private boolean boolFlag_3;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CacheXImpl_1() {
        super(createString(23008, -1766), createString(23020, -32509), Initializer.stepF);
        this.eventQ = new RenderASub_6(createString(23018, -3065), "");
        this.buffC = new RenderASub_1(createString(23017, 1148), true);
        this.gridH = new RenderASub_7(createString(23014, -28858), 71);
        this.buffC_1 = new RenderASub_1(createString(23016, -11542), true);
        this.bindK = new RenderASub(createString(23019, -15952), 1.0, 1.0, 5.0, 1.0);
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.intValue = 0;
        this.boolFlag_2 = false;
        this.intValue_1 = 0;
        this.longValue = 0L;
        this.intValue_2 = 0;
        this.boolFlag_3 = false;
        this.setRenderaarr(this.eventQ, this.buffC, this.gridH, this.buffC_1, this.bindK);
    }
    
    @Override
    public void execute() {
        super.execute();
        this.renderA.setClassAndPackd(BlockEImpl_2.class, this);
        this.boolFlag = false;
        this.longValue = 0L;
        this.intValue_2 = 0;
        this.boolFlag_3 = false;
    }
    
    @Override
    public void execute_1() {
        super.execute_1();
        this.renderA.setClassAndPackd_1(BlockEImpl_2.class, this);
        this.boolFlag = false;
        this.boolFlag_1 = false;
        this.intValue = 0;
        this.boolFlag_2 = false;
        this.intValue_1 = 0;
        this.longValue = 0L;
        this.intValue_2 = 0;
        this.boolFlag_3 = false;
    }
    
    @Override
    public void execute_2() {
        if (CacheXImpl_1.class310.field_1755 != null) {
            return;
        }
        if (CacheXImpl_1.class310.field_1724 == null) {
            return;
        }
        if (this.boolFlag_1) {
            --this.intValue;
            if (this.intValue <= 0) {
                this.boolFlag_1 = false;
            }
        }
        if (this.boolFlag_2) {
            --this.intValue_1;
            if (this.intValue_1 <= 0) {
                this.boolFlag_2 = false;
            }
        }
        if (this.boolFlag_3) {
            --this.intValue_2;
            if (this.intValue_2 <= 0) {
                this.execute_3();
                this.boolFlag_3 = false;
            }
        }
        final int intValue = this.gridH.getValue();
        if (intValue == -1) {
            return;
        }
        final boolean checkInt = Initializer_8.checkInt(intValue);
        if (checkInt && !this.boolFlag) {
            this.boolFlag_1 = true;
            this.intValue = 40;
            this.boolFlag_2 = true;
            this.intValue_1 = 40;
            if (this.buffC_1.getValue()) {
                CacheXImpl_1.class310.method_1562().method_45730(createString(23010, 2109) + this.bindK.getValue().intValue());
            }
            this.intValue_2 = 10;
            this.boolFlag_3 = true;
        }
        this.boolFlag = checkInt;
    }
    
    private void execute_3() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        try {
            if (CacheXImpl_1.class310.field_1724 == null) {
                return;
            }
        }
        catch (final InterruptedException ex) {
            throw computeInterruptedexception(ex);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        Label_0090: {
            Label_0051: {
                try {
                    if (stringarrArray == null) {
                        break Label_0090;
                    }
                    final long n = currentTimeMillis;
                    final CacheXImpl_1 cacheXImpl_1 = this;
                    final long n2 = cacheXImpl_1.longValue;
                    final long n3 = n - n2;
                    final long n4 = 500L;
                    final long n5 = lcmp(n3, n4);
                    if (n5 < 0) {
                        return;
                    }
                    break Label_0051;
                }
                catch (final InterruptedException ex2) {
                    throw computeInterruptedexception(ex2);
                }
                try {
                    final long n = currentTimeMillis;
                    final CacheXImpl_1 cacheXImpl_1 = this;
                    final long n2 = cacheXImpl_1.longValue;
                    final long n3 = n - n2;
                    final long n4 = 500L;
                    final long n5 = lcmp(n3, n4);
                    if (n5 < 0) {
                        return;
                    }
                }
                catch (final InterruptedException ex3) {
                    throw computeInterruptedexception(ex3);
                }
            }
            this.longValue = currentTimeMillis;
            CacheXImpl_1.class310.method_1562().method_45730(createString(23015, 11693) + String.valueOf(((AbstractSyncA<Object>)this.bindK).getValue()));
        }
        final String s = this.eventQ.getValue();
        int empty = 0;
        Label_0173: {
            Label_0160: {
                Label_0145: {
                    int startsWith = 0;
                    Label_0124: {
                        int n6;
                        try {
                            n6 = (startsWith = (empty = (s.trim().isEmpty() ? 1 : 0)));
                            if (stringarrArray == null) {
                                break Label_0145;
                            }
                            if (n6 == 0) {
                                break Label_0124;
                            }
                            return;
                        }
                        catch (final InterruptedException ex4) {
                            throw computeInterruptedexception(ex4);
                        }
                        try {
                            if (n6 != 0) {
                                return;
                            }
                            empty = (startsWith = (s.startsWith(createString(23022, 19357)) ? 1 : 0));
                        }
                        catch (final InterruptedException ex5) {
                            throw computeInterruptedexception(ex5);
                        }
                    }
                    try {
                        if (stringarrArray == null) {
                            break Label_0173;
                        }
                        if (startsWith != 0) {
                            break Label_0160;
                        }
                    }
                    catch (final InterruptedException ex6) {
                        throw computeInterruptedexception(ex6);
                    }
                }
                return;
            }
            empty = (int)Math.round(CacheXImpl_1.class310.field_1724.method_23317());
        }
        final String s2 = createString(23021, 8340) + empty + "_" + (int)Math.round(CacheXImpl_1.class310.field_1724.method_23318()) + "_" + (int)Math.round(CacheXImpl_1.class310.field_1724.method_23321()) + "_" + System.currentTimeMillis();
        Label_0305: {
            Label_0267: {
                try {
                    if (stringarrArray == null) {
                        break Label_0305;
                    }
                    final CacheXImpl_1 cacheXImpl_2 = this;
                    final RenderASub_1 renderASub_1 = cacheXImpl_2.buffC;
                    final Boolean b = renderASub_1.getValue();
                    final Boolean b2 = b;
                    final boolean b3 = b2;
                    if (!b3) {
                        break Label_0267;
                    }
                    break Label_0305;
                }
                catch (final InterruptedException ex7) {
                    throw computeInterruptedexception(ex7);
                }
                try {
                    final CacheXImpl_1 cacheXImpl_2 = this;
                    final RenderASub_1 renderASub_1 = cacheXImpl_2.buffC;
                    final Boolean b = renderASub_1.getValue();
                    final Boolean b2 = b;
                    final boolean b3 = b2;
                    if (!b3) {
                        new Initializer_4(s).computeBuildj(createString(23012, -21153)).getBuildj().getBuildj_2().getBuildj_3().execute();
                        return;
                    }
                }
                catch (final InterruptedException ex8) {
                    throw computeInterruptedexception(ex8);
                }
            }
            try {
                class_318.method_22690(CacheXImpl_1.class310.field_1697, s2 + createString(23009, 30968), CacheXImpl_1.class310.method_1522(), 1, (Consumer)CacheXImpl_1::lambda$homeCoords$0);
                Thread.sleep(500L);
            }
            catch (final InterruptedException ex9) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        final File file = new File(CacheXImpl_1.class310.field_1697, createString(23011, 17482) + s2 + createString(23023, -31152));
        try {
            if (file.exists()) {
                new Initializer_4(s).computeBuildj(createString(23013, -31567)).getBuildj().getBuildj_2().getBuildj_3().computeBuildj_2(file).execute();
            }
        }
        catch (final InterruptedException ex10) {
            throw computeInterruptedexception(ex10);
        }
    }
    
    @Override
    public boolean isEnabled() {
        return this.boolFlag_1;
    }
    
    public boolean isEnabled_1() {
        return this.boolFlag_2;
    }
    
    private static void lambda$homeCoords$0(final class_2561 class_2561) {
    }
    
    private static InterruptedException computeInterruptedexception(final InterruptedException ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[16];
        int n = 0;
        String s;
        int n2 = (s = """
                      \u0012 iµZ\u0012¤\u00d7\f\u0081\u00e9\u00f0G¾\u00e3e\u00c2\u00d5\u00e6[\u00f0\u0010{\u001e\u0095\u00f2\u00c4O{	Hi\u008ax°º\u00fc\u00d4\u0004\u0080 :\r\u000b	\u00889Z\u00fd	N½µY\u00fd\b\u00ca"\u009f\u00f5\u009f\u001a\u001c\u00d6\f°?\u0095\u0010«47«>\u00e7\u00cc\u001f\f\u0097\u0099q\u00c47®¤\u00f8L\u008d\u0082R\u000bm\u0012\u00dd\u00f3\u0003\u00d8\u0081\u00cch@®	|6\f1\u0098\u0010S!\u00f4\u0014\u0015"\u00ad\u00f8\u00d9\u001f\u00e9\u000f`qVw±\u00d7²
                      ¬\u001a@\b
                      \u0001\u00c7\u00c4\u00828[µ\u00d5\u00cf\u0004\br¢\u00f0\u00cen1\u00f7\u0001\u0004\u0086\u00e8\u00fa\u0014""").length();
        int n3 = 8;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 66));
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
                                    case 0 -> 87;
                                    case 1 -> 41;
                                    case 2 -> 79;
                                    case 3 -> 63;
                                    case 4 -> 26;
                                    case 5 -> 65;
                                    default -> 65;
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
                            n2 = (s = "\u0002\u00f4k\u00fd\u0087¦5M/\u00c7\u00db(¶\u0094\u0007\u00d3\u00cd\u0080y\u008e±<\u0089H±k\u00ee/\u00f8l\u0019¤\u00f5¤\u00f9\r*\u00ef\u0015$\u00ad\b\u00e4\u00efo4+\u0018-\u00fa\u0003\u001d\u0081°\u00d6{\n\u0001\u000b\u001e±<¶v\u00far,4\u0084\u0090`O/\u009a\u0099X\u00e3\u00da+k\u001e\u0000\u00ec\u00f5\u00f5B$\u0086\u0018©n\u00c1µ\u00da\\\u0005j\u009f#\u00cd\u00cb").length();
                            n3 = 95;
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
                    n5 = (n6 = (n7 = (n8 = 39)));
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
        strArr_1 = new String[16];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x59E2) & 0xFFFF;
        if (CacheXImpl_1.strArr_1[n3] == null) {
            final char[] charArray = CacheXImpl_1.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 166;
                case 1 -> 2;
                case 2 -> 69;
                case 3 -> 181;
                case 4 -> 67;
                case 5 -> 93;
                case 6 -> 95;
                case 7 -> 218;
                case 8 -> 89;
                case 9 -> 117;
                case 10 -> 128;
                case 11 -> 239;
                case 12 -> 107;
                case 13 -> 50;
                case 14 -> 58;
                case 15 -> 209;
                case 16 -> 127;
                case 17 -> 212;
                case 18 -> 59;
                case 19 -> 49;
                case 20 -> 53;
                case 21 -> 197;
                case 22 -> 97;
                case 23 -> 27;
                case 24 -> 205;
                case 25 -> 167;
                case 26 -> 34;
                case 27 -> 241;
                case 28 -> 254;
                case 29 -> 57;
                case 30 -> 47;
                case 31 -> 193;
                case 32 -> 185;
                case 33 -> 170;
                case 34 -> 217;
                case 35 -> 238;
                case 36 -> 120;
                case 37 -> 136;
                case 38 -> 163;
                case 39 -> 103;
                case 40 -> 169;
                case 41 -> 182;
                case 42 -> 192;
                case 43 -> 229;
                case 44 -> 92;
                case 45 -> 247;
                case 46 -> 62;
                case 47 -> 7;
                case 48 -> 210;
                case 49 -> 72;
                case 50 -> 46;
                case 51 -> 23;
                case 52 -> 66;
                case 53 -> 74;
                case 54 -> 235;
                case 55 -> 255;
                case 56 -> 79;
                case 57 -> 177;
                case 58 -> 137;
                case 59 -> 173;
                case 60 -> 28;
                case 61 -> 26;
                case 62 -> 112;
                case 63 -> 56;
                case 64 -> 251;
                case 65 -> 119;
                case 66 -> 222;
                case 67 -> 236;
                case 68 -> 13;
                case 69 -> 178;
                case 70 -> 145;
                case 71 -> 5;
                case 72 -> 131;
                case 73 -> 78;
                case 74 -> 76;
                case 75 -> 237;
                case 76 -> 3;
                case 77 -> 94;
                case 78 -> 133;
                case 79 -> 174;
                case 80 -> 151;
                case 81 -> 30;
                case 82 -> 19;
                case 83 -> 144;
                case 84 -> 219;
                case 85 -> 110;
                case 86 -> 84;
                case 87 -> 233;
                case 88 -> 41;
                case 89 -> 135;
                case 90 -> 153;
                case 91 -> 14;
                case 92 -> 43;
                case 93 -> 191;
                case 94 -> 129;
                case 95 -> 70;
                case 96 -> 101;
                case 97 -> 202;
                case 98 -> 162;
                case 99 -> 176;
                case 100 -> 96;
                case 101 -> 77;
                case 102 -> 160;
                case 103 -> 142;
                case 104 -> 208;
                case 105 -> 143;
                case 106 -> 88;
                case 107 -> 106;
                case 108 -> 188;
                case 109 -> 11;
                case 110 -> 221;
                case 111 -> 234;
                case 112 -> 152;
                case 113 -> 175;
                case 114 -> 226;
                case 115 -> 85;
                case 116 -> 124;
                case 117 -> 48;
                case 118 -> 220;
                case 119 -> 132;
                case 120 -> 216;
                case 121 -> 213;
                case 122 -> 186;
                case 123 -> 200;
                case 124 -> 80;
                case 125 -> 17;
                case 126 -> 105;
                case 127 -> 116;
                case 128 -> 91;
                case 129 -> 125;
                case 130 -> 231;
                case 131 -> 87;
                case 132 -> 35;
                case 133 -> 249;
                case 134 -> 113;
                case 135 -> 172;
                case 136 -> 122;
                case 137 -> 83;
                case 138 -> 179;
                case 139 -> 252;
                case 140 -> 60;
                case 141 -> 51;
                case 142 -> 73;
                case 143 -> 12;
                case 144 -> 248;
                case 145 -> 75;
                case 146 -> 189;
                case 147 -> 147;
                case 148 -> 99;
                case 149 -> 61;
                case 150 -> 180;
                case 151 -> 240;
                case 152 -> 196;
                case 153 -> 18;
                case 154 -> 15;
                case 155 -> 6;
                case 156 -> 158;
                case 157 -> 232;
                case 158 -> 39;
                case 159 -> 36;
                case 160 -> 204;
                case 161 -> 126;
                case 162 -> 54;
                case 163 -> 90;
                case 164 -> 98;
                case 165 -> 114;
                case 166 -> 42;
                case 167 -> 65;
                case 168 -> 227;
                case 169 -> 24;
                case 170 -> 157;
                case 171 -> 156;
                case 172 -> 150;
                case 173 -> 253;
                case 174 -> 71;
                case 175 -> 201;
                case 176 -> 198;
                case 177 -> 81;
                case 178 -> 141;
                case 179 -> 0;
                case 180 -> 102;
                case 181 -> 211;
                case 182 -> 223;
                case 183 -> 9;
                case 184 -> 130;
                case 185 -> 230;
                case 186 -> 159;
                case 187 -> 206;
                case 188 -> 225;
                case 189 -> 244;
                case 190 -> 168;
                case 191 -> 224;
                case 192 -> 228;
                case 193 -> 63;
                case 194 -> 215;
                case 195 -> 100;
                case 196 -> 109;
                case 197 -> 111;
                case 198 -> 203;
                case 199 -> 214;
                case 200 -> 146;
                case 201 -> 194;
                case 202 -> 155;
                case 203 -> 4;
                case 204 -> 250;
                case 205 -> 183;
                case 206 -> 164;
                case 207 -> 108;
                case 208 -> 138;
                case 209 -> 149;
                case 210 -> 55;
                case 211 -> 199;
                case 212 -> 20;
                case 213 -> 190;
                case 214 -> 40;
                case 215 -> 64;
                case 216 -> 31;
                case 217 -> 134;
                case 218 -> 243;
                case 219 -> 207;
                case 220 -> 45;
                case 221 -> 154;
                case 222 -> 86;
                case 223 -> 1;
                case 224 -> 21;
                case 225 -> 123;
                case 226 -> 33;
                case 227 -> 44;
                case 228 -> 29;
                case 229 -> 52;
                case 230 -> 195;
                case 231 -> 16;
                case 232 -> 10;
                case 233 -> 187;
                case 234 -> 245;
                case 235 -> 115;
                case 236 -> 246;
                case 237 -> 184;
                case 238 -> 140;
                case 239 -> 37;
                case 240 -> 32;
                case 241 -> 139;
                case 242 -> 25;
                case 243 -> 148;
                case 244 -> 68;
                case 245 -> 82;
                case 246 -> 38;
                case 247 -> 104;
                case 248 -> 165;
                case 249 -> 161;
                case 250 -> 118;
                case 251 -> 242;
                case 252 -> 22;
                case 253 -> 121;
                case 254 -> 8;
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
            CacheXImpl_1.strArr_1[n3] = new String(charArray).intern();
        }
        return CacheXImpl_1.strArr_1[n3];
    }
}
