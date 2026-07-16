// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_2246;
import net.minecraft.class_1802;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_476;
import net.minecraft.class_3965;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_1268;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;
import net.minecraft.class_310;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_3;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_4 extends AbstractLoadF
{
    private final RenderASub_3 configO;
    private final RenderASub_1 buffC;
    private Initializer_6 checkO;
    private class_2338 class2338;
    private int intValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_4() {
        super(createString(5523, -23500), createString(5522, 23479), Initializer.stepF);
        this.configO = new RenderASub_3(createString(5521, 6036), 10.0, 1.0, 40.0, 1.0);
        this.buffC = new RenderASub_1(createString(5520, -25665), false);
        this.checkO = Initializer_6.IDLE;
        this.intValue = 0;
        this.setRenderaarr(this.configO, this.buffC);
    }
    
    @Override
    public void execute() {
        if (CalcGSub_4.class310.field_1724 == null || CalcGSub_4.class310.field_1687 == null) {
            this.execute_2();
            return;
        }
        this.checkO = Initializer_6.FINDING_SPAWNER;
        this.class2338 = null;
        this.intValue = 0;
    }
    
    @Override
    public void execute_1() {
        this.checkO = Initializer_6.IDLE;
        this.class2338 = null;
        this.intValue = 0;
    }
    
    @Override
    public void execute_2() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        if (stringarrArray != null) {
            Label_0039: {
                if (CalcGSub_4.class310.field_1724 != null) {
                    final class_310 class310 = CalcGSub_4.class310;
                    if (stringarrArray != null) {
                        if (class310.field_1687 == null) {
                            break Label_0039;
                        }
                        final class_310 class311 = CalcGSub_4.class310;
                    }
                    if (class310.field_1761 != null) {
                        final int intValue = this.intValue;
                        while (true) {
                            CalcGSub_4 calcGSub_4 = null;
                            Label_0141: {
                                if (stringarrArray != null) {
                                    if (intValue > 0) {
                                        --this.intValue;
                                        return;
                                    }
                                    calcGSub_4 = this;
                                    if (stringarrArray == null) {
                                        break Label_0141;
                                    }
                                    this.checkO.ordinal();
                                }
                                switch (intValue) {
                                    case 1: {
                                        calcGSub_4 = this;
                                        break;
                                    }
                                    case 2: {
                                        this.execute_4();
                                        if (stringarrArray == null)
                                        return;
                                    }
                                    case 3: {
                                        this.execute_5();
                                        if (stringarrArray == null)
                                        return;
                                    }
                                    case 4: {
                                        this.execute_6();
                                        if (stringarrArray == null)
                                        return;
                                    }
                                    case 5: {
                                        this.execute_7();
                                        if (stringarrArray == null)
                                        return;
                                    }
                                    case 6: {
                                        this.execute_8();
                                        if (stringarrArray == null)
                                        return;
                                    }
                                    case 7: {
                                        this.execute_9();
                                        if (stringarrArray == null)
                                        return;
                                    }
                                    case 8: {
                                        this.execute_10();
                                        if (stringarrArray == null)
                                        return;
                                    }
                                    case 9: {
                                        this.execute_11();
                                        if (stringarrArray == null)
                                        return;
                                    }
                                    case 10: {
                                        this.execute_12();
                                        if (stringarrArray == null)
                                        return;
                                    }
                                    case 11: {
                                        this.execute_13();
                                        return;
                                    }
                                }
                            }
                            calcGSub_4.execute_3();
                            if (stringarrArray == null) {
                                continue;
                            }
                            break;
                        }
                        return;
                    }
                }
            }
            this.execute_2();
        }
    }
    
    private void execute_3() {
        this.class2338 = StreamSupport.stream(class_2338.method_10097(CalcGSub_4.class310.field_1724.method_24515().method_10069(-8, -8, -8), CalcGSub_4.class310.field_1724.method_24515().method_10069(8, 8, 8)).spliterator(), false).filter((Predicate<? super Object>)CalcGSub_4::lambda$findSpawner$0).min(Comparator.comparingDouble((ToDoubleFunction<? super Object>)CalcGSub_4::lambda$findSpawner$1)).map((Function<? super Object, ? extends class_2338>)class_2338::method_10062).orElse(null);
        if (this.class2338 != null) {
            this.checkO = Initializer_6.OPENING_SPAWNER;
        }
        else {
            this.execute_2();
        }
    }
    
    private void execute_4() {
        if (this.class2338 == null) {
            this.checkO = Initializer_6.FINDING_SPAWNER;
            return;
        }
        CalcGSub_4.class310.field_1761.method_2896(CalcGSub_4.class310.field_1724, class_1268.field_5808, new class_3965(class_243.method_24953((class_2382)this.class2338), class_2350.field_11036, this.class2338, false));
        this.checkO = Initializer_6.WAITING_FOR_GUI;
        this.intValue = 600;
    }
    
    private void execute_5() {
        if (CalcGSub_4.class310.field_1755 instanceof class_476) {
            if (this.buffC.getValue()) {
                this.checkO = Initializer_6.CHECKING_SLOTS_FOR_ARROWS;
                this.intValue = 2;
            }
            else {
                this.checkO = Initializer_6.CLICKING_SLOT_46;
                this.intValue = 2;
            }
        }
        else if (this.intValue <= 1) {
            this.execute_2();
        }
    }
    
    private void execute_6() {
        if (!(CalcGSub_4.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        CalcGSub_4.class310.field_1761.method_2906(CalcGSub_4.class310.field_1724.field_7512.field_7763, 46, 0, class_1713.field_7790, (class_1657)CalcGSub_4.class310.field_1724);
        this.checkO = Initializer_6.WAITING_DELAY;
    }
    
    private void execute_7() {
        this.intValue = this.configO.getValue().intValue();
        this.checkO = Initializer_6.CLICKING_SLOT_50;
    }
    
    private void execute_8() {
        if (!(CalcGSub_4.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        CalcGSub_4.class310.field_1761.method_2906(CalcGSub_4.class310.field_1724.field_7512.field_7763, 50, 0, class_1713.field_7790, (class_1657)CalcGSub_4.class310.field_1724);
        this.checkO = Initializer_6.CHECKING_SLOT_50;
        this.intValue = 2;
    }
    
    private void execute_9() {
        if (!(CalcGSub_4.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        if (CalcGSub_4.class310.field_1724.field_7512.method_7611(50).method_7677().method_7909() != class_1802.field_8107) {
            CalcGSub_4.class310.field_1724.method_7346();
            this.execute_2();
        }
        else {
            this.checkO = Initializer_6.CLICKING_SLOT_46;
        }
    }
    
    private void execute_10() {
        if (!(CalcGSub_4.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        for (int i = 0; i <= 44; ++i) {
            if (CalcGSub_4.class310.field_1724.field_7512.method_7611(i).method_7677().method_7909() == class_1802.field_8107) {
                CalcGSub_4.class310.field_1724.method_7346();
                this.execute_2();
                return;
            }
        }
        this.checkO = Initializer_6.CLICKING_DROP_ALL;
        this.intValue = 2;
    }
    
    private void execute_11() {
        if (!(CalcGSub_4.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        CalcGSub_4.class310.field_1761.method_2906(CalcGSub_4.class310.field_1724.field_7512.field_7763, 50, 0, class_1713.field_7790, (class_1657)CalcGSub_4.class310.field_1724);
        this.checkO = Initializer_6.CLICKING_NEXT_PAGE;
        this.intValue = 2;
    }
    
    private void execute_12() {
        if (!(CalcGSub_4.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        CalcGSub_4.class310.field_1761.method_2906(CalcGSub_4.class310.field_1724.field_7512.field_7763, 53, 0, class_1713.field_7790, (class_1657)CalcGSub_4.class310.field_1724);
        this.checkO = Initializer_6.RE_CHECKING_SLOTS;
        this.intValue = 2;
    }
    
    private void execute_13() {
        if (!(CalcGSub_4.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        for (int i = 0; i <= 44; ++i) {
            if (CalcGSub_4.class310.field_1724.field_7512.method_7611(i).method_7677().method_7909() == class_1802.field_8107) {
                CalcGSub_4.class310.field_1724.method_7346();
                this.execute_2();
                return;
            }
        }
        this.checkO = Initializer_6.CLICKING_DROP_ALL;
        this.intValue = 2;
    }
    
    private static double lambda$findSpawner$1(final class_2338 class_2338) {
        return CalcGSub_4.class310.field_1724.method_73189().method_1025(class_243.method_24953((class_2382)class_2338));
    }
    
    private static boolean lambda$findSpawner$0(final class_2338 class_2338) {
        return CalcGSub_4.class310.field_1687.method_8320(class_2338).method_27852(class_2246.field_10260);
    }
    
    static {
        final String[] strArr2 = new String[4];
        int n = 0;
        String s;
        int n2 = (s = "\u0002\u00f0i\u00ad\u00e1¸\u00ea)\u0001\u00f8^\u0012¢l°O2\u00cd\u009eµ\u00e1\u0081~¾(\u00f7½Y\u00f0\\\u008b\u0088\u0014«\u009cje\u0085z\f\u000e\u00ef\u001e\u0091\u00cdJ«\u00fa\u00ee\u00c4J\u00d3\u00e0\u008fr").length();
        int n3 = 40;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 9));
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
                                    case 0 -> 114;
                                    case 1 -> 80;
                                    case 2 -> 82;
                                    case 3 -> 37;
                                    case 4 -> 57;
                                    case 5 -> 98;
                                    default -> 109;
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
                            n2 = (s = "(\u00cb-\u00e1\u0005,\u00f0!i\r\u0087\u0001\u001c\u00f78\u0005c\u009e\u0085\u0006\u00e0\u009f¥").length();
                            n3 = 9;
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
                    n5 = (n6 = (n7 = (n8 = 18)));
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
        strArr_1 = new String[4];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x1592) & 0xFFFF;
        if (CalcGSub_4.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_4.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 236;
                case 1 -> 117;
                case 2 -> 36;
                case 3 -> 171;
                case 4 -> 53;
                case 5 -> 192;
                case 6 -> 51;
                case 7 -> 186;
                case 8 -> 28;
                case 9 -> 101;
                case 10 -> 8;
                case 11 -> 113;
                case 12 -> 121;
                case 13 -> 172;
                case 14 -> 143;
                case 15 -> 104;
                case 16 -> 82;
                case 17 -> 159;
                case 18 -> 96;
                case 19 -> 196;
                case 20 -> 79;
                case 21 -> 128;
                case 22 -> 187;
                case 23 -> 0;
                case 24 -> 49;
                case 25 -> 91;
                case 26 -> 112;
                case 27 -> 151;
                case 28 -> 6;
                case 29 -> 201;
                case 30 -> 230;
                case 31 -> 63;
                case 32 -> 95;
                case 33 -> 179;
                case 34 -> 12;
                case 35 -> 213;
                case 36 -> 10;
                case 37 -> 226;
                case 38 -> 140;
                case 39 -> 27;
                case 40 -> 44;
                case 41 -> 65;
                case 42 -> 149;
                case 43 -> 138;
                case 44 -> 216;
                case 45 -> 152;
                case 46 -> 142;
                case 47 -> 153;
                case 48 -> 166;
                case 49 -> 136;
                case 50 -> 212;
                case 51 -> 163;
                case 52 -> 169;
                case 53 -> 220;
                case 54 -> 208;
                case 55 -> 155;
                case 56 -> 223;
                case 57 -> 246;
                case 58 -> 39;
                case 59 -> 137;
                case 60 -> 38;
                case 61 -> 234;
                case 62 -> 248;
                case 63 -> 252;
                case 64 -> 224;
                case 65 -> 2;
                case 66 -> 160;
                case 67 -> 134;
                case 68 -> 239;
                case 69 -> 250;
                case 70 -> 133;
                case 71 -> 235;
                case 72 -> 181;
                case 73 -> 59;
                case 74 -> 60;
                case 75 -> 72;
                case 76 -> 41;
                case 77 -> 103;
                case 78 -> 14;
                case 79 -> 238;
                case 80 -> 245;
                case 81 -> 69;
                case 82 -> 83;
                case 83 -> 205;
                case 84 -> 33;
                case 85 -> 222;
                case 86 -> 233;
                case 87 -> 249;
                case 88 -> 188;
                case 89 -> 34;
                case 90 -> 29;
                case 91 -> 90;
                case 92 -> 119;
                case 93 -> 147;
                case 94 -> 175;
                case 95 -> 98;
                case 96 -> 184;
                case 97 -> 219;
                case 98 -> 67;
                case 99 -> 13;
                case 100 -> 78;
                case 101 -> 165;
                case 102 -> 190;
                case 103 -> 125;
                case 104 -> 176;
                case 105 -> 46;
                case 106 -> 200;
                case 107 -> 4;
                case 108 -> 55;
                case 109 -> 40;
                case 110 -> 52;
                case 111 -> 114;
                case 112 -> 47;
                case 113 -> 193;
                case 114 -> 139;
                case 115 -> 108;
                case 116 -> 141;
                case 117 -> 61;
                case 118 -> 25;
                case 119 -> 56;
                case 120 -> 131;
                case 121 -> 127;
                case 122 -> 24;
                case 123 -> 146;
                case 124 -> 247;
                case 125 -> 243;
                case 126 -> 202;
                case 127 -> 198;
                case 128 -> 214;
                case 129 -> 185;
                case 130 -> 254;
                case 131 -> 237;
                case 132 -> 132;
                case 133 -> 93;
                case 134 -> 21;
                case 135 -> 3;
                case 136 -> 80;
                case 137 -> 232;
                case 138 -> 15;
                case 139 -> 85;
                case 140 -> 231;
                case 141 -> 228;
                case 142 -> 20;
                case 143 -> 99;
                case 144 -> 150;
                case 145 -> 203;
                case 146 -> 218;
                case 147 -> 7;
                case 148 -> 109;
                case 149 -> 54;
                case 150 -> 16;
                case 151 -> 154;
                case 152 -> 177;
                case 153 -> 66;
                case 154 -> 215;
                case 155 -> 207;
                case 156 -> 22;
                case 157 -> 74;
                case 158 -> 158;
                case 159 -> 118;
                case 160 -> 11;
                case 161 -> 77;
                case 162 -> 62;
                case 163 -> 204;
                case 164 -> 167;
                case 165 -> 115;
                case 166 -> 97;
                case 167 -> 209;
                case 168 -> 35;
                case 169 -> 9;
                case 170 -> 253;
                case 171 -> 122;
                case 172 -> 18;
                case 173 -> 170;
                case 174 -> 37;
                case 175 -> 43;
                case 176 -> 23;
                case 177 -> 182;
                case 178 -> 221;
                case 179 -> 242;
                case 180 -> 81;
                case 181 -> 42;
                case 182 -> 120;
                case 183 -> 217;
                case 184 -> 105;
                case 185 -> 189;
                case 186 -> 191;
                case 187 -> 102;
                case 188 -> 123;
                case 189 -> 164;
                case 190 -> 86;
                case 191 -> 255;
                case 192 -> 50;
                case 193 -> 45;
                case 194 -> 84;
                case 195 -> 107;
                case 196 -> 161;
                case 197 -> 251;
                case 198 -> 194;
                case 199 -> 94;
                case 200 -> 26;
                case 201 -> 178;
                case 202 -> 195;
                case 203 -> 58;
                case 204 -> 110;
                case 205 -> 76;
                case 206 -> 124;
                case 207 -> 106;
                case 208 -> 144;
                case 209 -> 126;
                case 210 -> 229;
                case 211 -> 227;
                case 212 -> 111;
                case 213 -> 197;
                case 214 -> 225;
                case 215 -> 30;
                case 216 -> 100;
                case 217 -> 32;
                case 218 -> 57;
                case 219 -> 19;
                case 220 -> 92;
                case 221 -> 129;
                case 222 -> 240;
                case 223 -> 135;
                case 224 -> 244;
                case 225 -> 71;
                case 226 -> 156;
                case 227 -> 17;
                case 228 -> 89;
                case 229 -> 210;
                case 230 -> 70;
                case 231 -> 241;
                case 232 -> 75;
                case 233 -> 183;
                case 234 -> 130;
                case 235 -> 180;
                case 236 -> 1;
                case 237 -> 68;
                case 238 -> 173;
                case 239 -> 87;
                case 240 -> 157;
                case 241 -> 206;
                case 242 -> 31;
                case 243 -> 88;
                case 244 -> 174;
                case 245 -> 48;
                case 246 -> 5;
                case 247 -> 211;
                case 248 -> 116;
                case 249 -> 162;
                case 250 -> 168;
                case 251 -> 148;
                case 252 -> 73;
                case 253 -> 145;
                case 254 -> 199;
                default -> 64;
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
            CalcGSub_4.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_4.strArr_1[n3];
    }
}
