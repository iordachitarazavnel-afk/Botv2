// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub3.sub3;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1887;
import net.minecraft.class_5321;
import java.util.List;

public class RenderASub_11 extends AbstractSyncA<List<class_5321<class_1887>>>
{
    private final Set<String> set;
    private final Map<String, Object> map;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public RenderASub_11(final String s) {
        super(s, new ArrayList());
        this.set = new HashSet<String>();
        this.map = new HashMap<String, Object>();
    }
    
    public List<class_5321<class_1887>> getList() {
        return this.getValue();
    }
    
    public boolean isEnabled() {
        return ((AbstractSyncA<List>)this).getValue().isEmpty() && this.set.isEmpty();
    }
    
    public void setClass_5321(final class_5321<class_1887> class_5321) {
        if (!((AbstractSyncA<List>)this).getValue().contains(class_5321)) {
            this.getValue().add(class_5321);
        }
    }
    
    public void setClass_5321_1(final class_5321<class_1887> class_5321) {
        ((AbstractSyncA<List>)this).getValue().remove(class_5321);
    }
    
    @Override
    public void execute() {
        ((AbstractSyncA<List>)this).getValue().clear();
        this.set.clear();
    }
    
    public void setString(final String s) {
        this.set.add(s);
        this.execute_2();
    }
    
    public void setString_1(final String s) {
        this.set.remove(s);
        this.execute_2();
    }
    
    public boolean checkString(final String s) {
        return this.set.contains(s);
    }
    
    public Set<String> getSet() {
        return new HashSet<String>(this.set);
    }
    
    public boolean isEnabled_1() {
        return this.set.contains(createString(-7868, 28223));
    }
    
    public boolean isEnabled_2() {
        return this.set.contains(createString(-7865, 28841));
    }
    
    public boolean isEnabled_3() {
        return this.set.contains(createString(-7872, 15968));
    }
    
    public boolean isEnabled_4() {
        return this.set.contains(createString(-7871, 26791));
    }
    
    public int getInt() {
        return ((AbstractSyncA<List>)this).getValue().size() + this.set.size();
    }
    
    public void setStringAndObject(final String s, final Object o) {
        this.map.put(s, o);
    }
    
    public <T> T computeObject(final String s) {
        return (T)this.map.get(s);
    }
    
    public List<String> computeList(final String s) {
        final boolean enabled = AbstractSyncA.isEnabled();
        final List value = this.map.get(s);
        final boolean b = enabled;
        final List list = value;
        if (b && !(list instanceof List)) {
            return new ArrayList<String>();
        }
        final List list2 = list;
        final ArrayList list3 = new ArrayList();
        for (final Object next : list2) {
            final boolean b2 = next instanceof String;
            if (b) {
                if (b2) {
                    list3.add(next);
                }
            }
            if (!b) {
                break;
            }
        }
        return list3;
    }
    
    public void execute_1() {
        final List<String> computeList = this.computeList(createString(-7866, -2395));
        this.set.clear();
        this.set.addAll(computeList);
    }
    
    private void execute_2() {
        this.setStringAndObject(createString(-7867, -10034), new ArrayList(this.set));
    }
    
    static {
        final String[] strArr2 = new String[6];
        int n = 0;
        String s;
        int n2 = (s = "Tmr\u0005p´\u0013\u0012:\u001c\u0016%z\u00c1\u0097u\u0018m\u0001(\u0090\u00188b?¡\u0096$\u00f9²·\u00e6±p¾\u001f\u008b\u0086\u00dc\u008c¿\u0018½>2w[\u00c4\n ¬e\u0085\u0087\u0086x`H \u0081\u0005l\u00c5 \u00e4 \f¸\u00e9\u00ef\u0095\u00c3¦eP\u00f4E\u00de;").length();
        int n3 = 16;
        int n4 = -1;
    Label_0023:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 70));
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
                                    case 1 -> 6;
                                    case 2 -> 50;
                                    case 3 -> 82;
                                    case 4 -> 87;
                                    case 5 -> 83;
                                    default -> 111;
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
                            n2 = (s = "\u0017]³ª\u00e1\u00e8\u00880\u00e0\u00f2\u00e8=\u0086\u00c4\u007f\b¾\u000f\u001b22G\u00d1U\u008e\u0087 \u0004\u00fd\u00e0\u0092Y\u0089").length();
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
                            break Label_0023;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 106)));
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
        strArr_1 = new String[6];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFE144) & 0xFFFF;
        if (RenderASub_11.strArr_1[n3] == null) {
            final char[] charArray = RenderASub_11.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 73;
                case 1 -> 253;
                case 2 -> 6;
                case 3 -> 139;
                case 4 -> 17;
                case 5 -> 103;
                case 6 -> 7;
                case 7 -> 251;
                case 8 -> 215;
                case 9 -> 131;
                case 10 -> 8;
                case 11 -> 201;
                case 12 -> 196;
                case 13 -> 148;
                case 14 -> 79;
                case 15 -> 178;
                case 16 -> 55;
                case 17 -> 216;
                case 18 -> 225;
                case 19 -> 42;
                case 20 -> 82;
                case 21 -> 147;
                case 22 -> 93;
                case 23 -> 220;
                case 24 -> 74;
                case 25 -> 16;
                case 26 -> 27;
                case 27 -> 52;
                case 28 -> 184;
                case 29 -> 222;
                case 30 -> 69;
                case 31 -> 132;
                case 32 -> 159;
                case 33 -> 95;
                case 34 -> 164;
                case 35 -> 153;
                case 36 -> 233;
                case 37 -> 34;
                case 38 -> 26;
                case 39 -> 177;
                case 40 -> 189;
                case 41 -> 118;
                case 42 -> 223;
                case 43 -> 44;
                case 44 -> 244;
                case 45 -> 18;
                case 46 -> 255;
                case 47 -> 154;
                case 48 -> 146;
                case 49 -> 158;
                case 50 -> 125;
                case 51 -> 53;
                case 52 -> 20;
                case 53 -> 138;
                case 54 -> 162;
                case 55 -> 32;
                case 56 -> 94;
                case 57 -> 36;
                case 58 -> 91;
                case 59 -> 70;
                case 60 -> 25;
                case 61 -> 237;
                case 62 -> 161;
                case 63 -> 226;
                case 64 -> 144;
                case 65 -> 100;
                case 66 -> 141;
                case 67 -> 174;
                case 68 -> 59;
                case 69 -> 249;
                case 70 -> 66;
                case 71 -> 37;
                case 72 -> 10;
                case 73 -> 87;
                case 74 -> 181;
                case 75 -> 116;
                case 76 -> 160;
                case 77 -> 40;
                case 78 -> 206;
                case 79 -> 213;
                case 80 -> 46;
                case 81 -> 210;
                case 82 -> 145;
                case 83 -> 88;
                case 84 -> 156;
                case 85 -> 21;
                case 86 -> 45;
                case 87 -> 209;
                case 88 -> 235;
                case 89 -> 168;
                case 90 -> 98;
                case 91 -> 89;
                case 92 -> 254;
                case 93 -> 134;
                case 94 -> 252;
                case 95 -> 120;
                case 96 -> 30;
                case 97 -> 197;
                case 98 -> 248;
                case 99 -> 33;
                case 100 -> 176;
                case 101 -> 80;
                case 102 -> 194;
                case 103 -> 173;
                case 104 -> 28;
                case 105 -> 180;
                case 106 -> 107;
                case 107 -> 239;
                case 108 -> 212;
                case 109 -> 187;
                case 110 -> 241;
                case 111 -> 51;
                case 112 -> 208;
                case 113 -> 242;
                case 114 -> 193;
                case 115 -> 1;
                case 116 -> 111;
                case 117 -> 60;
                case 118 -> 150;
                case 119 -> 49;
                case 120 -> 41;
                case 121 -> 109;
                case 122 -> 104;
                case 123 -> 112;
                case 124 -> 167;
                case 125 -> 97;
                case 126 -> 157;
                case 127 -> 31;
                case 128 -> 199;
                case 129 -> 137;
                case 130 -> 232;
                case 131 -> 2;
                case 132 -> 135;
                case 133 -> 149;
                case 134 -> 230;
                case 135 -> 234;
                case 136 -> 245;
                case 137 -> 96;
                case 138 -> 11;
                case 139 -> 188;
                case 140 -> 228;
                case 141 -> 57;
                case 142 -> 231;
                case 143 -> 155;
                case 144 -> 117;
                case 145 -> 29;
                case 146 -> 3;
                case 147 -> 35;
                case 148 -> 163;
                case 149 -> 247;
                case 150 -> 142;
                case 151 -> 14;
                case 152 -> 75;
                case 153 -> 127;
                case 154 -> 15;
                case 155 -> 243;
                case 156 -> 200;
                case 157 -> 128;
                case 158 -> 65;
                case 159 -> 86;
                case 160 -> 240;
                case 161 -> 110;
                case 162 -> 47;
                case 163 -> 211;
                case 164 -> 39;
                case 165 -> 217;
                case 166 -> 133;
                case 167 -> 24;
                case 168 -> 50;
                case 169 -> 224;
                case 170 -> 119;
                case 171 -> 221;
                case 172 -> 203;
                case 173 -> 9;
                case 174 -> 182;
                case 175 -> 99;
                case 176 -> 76;
                case 177 -> 171;
                case 178 -> 71;
                case 179 -> 22;
                case 180 -> 175;
                case 181 -> 67;
                case 182 -> 48;
                case 183 -> 122;
                case 184 -> 64;
                case 185 -> 219;
                case 186 -> 63;
                case 187 -> 229;
                case 188 -> 172;
                case 189 -> 72;
                case 190 -> 121;
                case 191 -> 192;
                case 192 -> 214;
                case 193 -> 165;
                case 194 -> 190;
                case 195 -> 115;
                case 196 -> 85;
                case 197 -> 68;
                case 198 -> 185;
                case 199 -> 114;
                case 200 -> 169;
                case 201 -> 108;
                case 202 -> 126;
                case 203 -> 106;
                case 204 -> 179;
                case 205 -> 113;
                case 206 -> 246;
                case 207 -> 218;
                case 208 -> 19;
                case 209 -> 90;
                case 210 -> 92;
                case 211 -> 236;
                case 212 -> 140;
                case 213 -> 84;
                case 214 -> 81;
                case 215 -> 151;
                case 216 -> 56;
                case 217 -> 43;
                case 218 -> 250;
                case 219 -> 123;
                case 220 -> 207;
                case 221 -> 38;
                case 222 -> 12;
                case 223 -> 152;
                case 224 -> 58;
                case 225 -> 227;
                case 226 -> 129;
                case 227 -> 170;
                case 228 -> 61;
                case 229 -> 136;
                case 230 -> 13;
                case 231 -> 238;
                case 232 -> 54;
                case 233 -> 183;
                case 234 -> 0;
                case 235 -> 5;
                case 236 -> 102;
                case 237 -> 130;
                case 238 -> 4;
                case 239 -> 198;
                case 240 -> 143;
                case 241 -> 124;
                case 242 -> 83;
                case 243 -> 78;
                case 244 -> 204;
                case 245 -> 23;
                case 246 -> 166;
                case 247 -> 101;
                case 248 -> 105;
                case 249 -> 202;
                case 250 -> 186;
                case 251 -> 191;
                case 252 -> 195;
                case 253 -> 62;
                case 254 -> 205;
                default -> 77;
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
            RenderASub_11.strArr_1[n3] = new String(charArray).intern();
        }
        return RenderASub_11.strArr_1[n3];
    }
}
