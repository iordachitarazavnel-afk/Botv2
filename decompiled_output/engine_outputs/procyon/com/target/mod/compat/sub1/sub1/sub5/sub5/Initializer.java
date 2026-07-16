// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub5;

import com.google.gson.JsonObject;
import java.util.function.Function;
import java.net.http.HttpResponse;
import java.net.URI;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_21;
import java.net.http.HttpRequest;
import net.minecraft.class_1297;
import java.util.Iterator;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_4;
import net.minecraft.class_742;
import com.target.mod.compat.sub1.sub1.sub5.sub3.CacheXImpl_2;
import com.target.mod.compat.sub1.sub1.sub1.Initializer_1;
import net.minecraft.class_310;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap;
import com.google.gson.Gson;
import java.net.http.HttpClient;
import java.util.Set;
import java.util.Map;

public class Initializer
{
    private static final Initializer buffA;
    private final Map<String, Long> map;
    private final Set<String> set;
    private final Set<String> set_1;
    private final HttpClient httpClient;
    private final Gson gson;
    private static boolean boolFlag;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    private Initializer() {
        this.map = new ConcurrentHashMap<String, Long>();
        this.set = (Set<String>)ConcurrentHashMap.newKeySet();
        this.set_1 = (Set<String>)ConcurrentHashMap.newKeySet();
        this.gson = new Gson();
        this.httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
    }
    
    public static Initializer getBuffa() {
        return Initializer.buffA;
    }
    
    public static void execute() {
    }
    
    public void setClass_310(final class_310 class_310) {
        final boolean enabled = isEnabled();
        class_310 class_311 = class_310;
        if (enabled) {
            if (class_310.field_1687 == null) {
                return;
            }
            class_311 = class_310;
        }
        if (class_311.field_1724 != null) {
            final Initializer_4 syncf = Initializer_1.getSyncf();
            CacheXImpl_2 cacheXImpl_2 = null;
            Label_0048: {
                if (enabled) {
                    if (syncf == null) {
                        cacheXImpl_2 = null;
                        break Label_0048;
                    }
                    Initializer_1.getSyncf();
                }
                cacheXImpl_2 = syncf.computeCalcg_1(CacheXImpl_2.class);
            }
            final CacheXImpl_2 cacheXImpl_4;
            final CacheXImpl_2 cacheXImpl_3 = cacheXImpl_4 = cacheXImpl_2;
            if (!enabled || cacheXImpl_4 != null) {
                final boolean enabled2 = cacheXImpl_4.isEnabled();
                if (enabled) {
                    if (!enabled2) {
                        return;
                    }
                    cacheXImpl_3.getString().isEmpty();
                }
                if (enabled2) {
                    return;
                }
                for (final class_742 class_312 : class_310.field_1687.method_18456()) {
                    if (class_312 == null) {
                        continue;
                    }
                    class_742 class_314 = null;
                    Label_0149: {
                        if (!cacheXImpl_3.isEnabled_1()) {
                            final class_742 class_313 = class_314 = class_312;
                            if (!enabled) {
                                break Label_0149;
                            }
                            if (class_313 == class_310.field_1724) {
                                continue;
                            }
                        }
                        class_314 = class_312;
                    }
                    final String name;
                    final String s = name = class_314.method_7334().name();
                    if (enabled && name == null) {
                        continue;
                    }
                    boolean b3;
                    boolean contains;
                    boolean b2;
                    final boolean b = b2 = (contains = (b3 = name.isEmpty()));
                    if (enabled) {
                        if (b) {
                            continue;
                        }
                        contains = (b2 = (b3 = this.map.containsKey(s)));
                    }
                    Label_0242: {
                        if (enabled) {
                            if (b2) {
                                break Label_0242;
                            }
                            b3 = (contains = this.set.contains(s));
                        }
                        Initializer initializer = null;
                        Label_0236: {
                            if (enabled) {
                                if (contains) {
                                    break Label_0242;
                                }
                                initializer = this;
                                if (!enabled) {
                                    break Label_0236;
                                }
                                b3 = this.set_1.contains(s);
                            }
                            if (b3) {
                                break Label_0242;
                            }
                            initializer = this;
                        }
                        initializer.setStringAndGride(s, cacheXImpl_3);
                    }
                    if (!enabled) {
                        break;
                    }
                }
            }
        }
    }
    
    public boolean checkClass_1297(final class_1297 class_1297) {
        return false;
    }
    
    public void setObject(final Object o) {
    }
    
    private void setStringAndGride(final String s, final CacheXImpl_2 cacheXImpl_2) {
        if (cacheXImpl_2.getString().isEmpty()) {
            return;
        }
        this.set.add(s);
        this.httpClient.sendAsync(HttpRequest.newBuilder().uri(URI.create(Initializer_21.computeString(createString_1(-28895, 2974)) + s)).header(createString_1(-28894, -9271), createString_1(-28896, 22933)).header(createString_1(-28891, 13991), cacheXImpl_2.getString()).timeout(Duration.ofSeconds(10L)).GET().build(), HttpResponse.BodyHandlers.ofString()).thenAccept(this::lambda$fetchPlayerMoney$0).exceptionally((Function<Throwable, ? extends Void>)this::lambda$fetchPlayerMoney$1);
    }
    
    public void execute_1() {
        this.map.clear();
        this.set.clear();
        this.set_1.clear();
    }
    
    public Long computeLong(final String s) {
        return this.map.get(s);
    }
    
    public String computeString(final long n) {
        if (n >= 1000000000L) {
            return this.createString(n / 1.0E9, "B");
        }
        if (n >= 1000000L) {
            return this.createString(n / 1000000.0, "M");
        }
        if (n >= 1000L) {
            return this.createString(n / 1000.0, "k");
        }
        return "$" + n;
    }
    
    private String createString(final double d, final String s) {
        String s2 = String.format(createString_1(-28889, 14581), d);
        if (s2.endsWith(createString_1(-28892, -25765))) {
            s2 = s2.substring(0, s2.length() - 2);
        }
        return "$" + s2 + s;
    }
    
    private Void lambda$fetchPlayerMoney$1(final String s, final Throwable t) {
        this.set.remove(s);
        this.set_1.add(s);
        return null;
    }
    
    private void lambda$fetchPlayerMoney$0(final String s, final HttpResponse httpResponse) {
        this.set.remove(s);
        if (httpResponse.statusCode() == 200) {
            try {
                this.map.put(s, (long)Double.parseDouble(((JsonObject)this.gson.fromJson((String)httpResponse.body(), (Class)JsonObject.class)).getAsJsonObject(createString_1(-28890, -12364)).get(createString_1(-28893, -11920)).getAsString()));
            }
            catch (final Exception ex) {
                this.set_1.add(s);
            }
        }
        else {
            this.set_1.add(s);
        }
    }
    
    static {
        final String[] strArr2 = new String[8];
        final boolean bool = true;
        int n = 0;
        setBool(bool);
        String s;
        int n2 = (s = "<\u008b\u00c5If74\u00e76\u0016\u00c6¦\u008d°\u0083\u00f10\u00c3F/\u008aV¢\u00e2\u0010¬\u0086\u009f\u00cd\t\u0012\u0019\u001c(\u0095\u0087·\rg:¨§£hcU\u00c7\u0094\u0003\u0013o)O\u00f6\u0094\u00cb\nFYrª\u00f9\u0000\u00c8\u00da\u0006]'\u00fa¤\u00e9µ\u0005\u00ca=\u0088j\u0002\u0002\u00cd\u00f9\r\u00ee\u00c1¿¡«¿C\u00cb\u00d9G5´\u0010").length();
        int n3 = 16;
        int n4 = -1;
    Label_0028:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 18));
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
                        Label_0267: {
                            if (length > 1) {
                                break Label_0267;
                            }
                            n7 = (n6 = n10);
                            do {
                                final char c = charArray[n6];
                                charArray[n7] = (char)(c ^ (n5 ^ switch (n10 % 7) {
                                    case 0 -> 74;
                                    case 1 -> 32;
                                    case 2 -> 102;
                                    case 3 -> 126;
                                    case 4 -> 85;
                                    case 5 -> 3;
                                    default -> 39;
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
                                continue Label_0028;
                            }
                            n2 = (s = "X\u0018v\u00d8;e\u0004\u00d4v\u0018$").length();
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
                            break Label_0028;
                        }
                    }
                    n5 = (n6 = (n7 = (n8 = 115)));
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
        buffA = new Initializer();
    }
    
    public static void setBool(final boolean boolFlag) {
        Initializer.boolFlag = boolFlag;
    }
    
    public static boolean isEnabled() {
        return Initializer.boolFlag;
    }
    
    public static boolean isEnabled_1() {
        return !isEnabled();
    }
    
    private static String createString_1(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFF8F20) & 0xFFFF;
        if (Initializer.strArr_1[n3] == null) {
            final char[] charArray = Initializer.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 225;
                case 1 -> 41;
                case 2 -> 120;
                case 3 -> 238;
                case 4 -> 150;
                case 5 -> 101;
                case 6 -> 202;
                case 7 -> 146;
                case 8 -> 179;
                case 9 -> 34;
                case 10 -> 84;
                case 11 -> 232;
                case 12 -> 13;
                case 13 -> 199;
                case 14 -> 149;
                case 15 -> 79;
                case 16 -> 14;
                case 17 -> 171;
                case 18 -> 190;
                case 19 -> 87;
                case 20 -> 94;
                case 21 -> 29;
                case 22 -> 138;
                case 23 -> 18;
                case 24 -> 240;
                case 25 -> 60;
                case 26 -> 159;
                case 27 -> 236;
                case 28 -> 4;
                case 29 -> 42;
                case 30 -> 226;
                case 31 -> 134;
                case 32 -> 148;
                case 33 -> 108;
                case 34 -> 58;
                case 35 -> 1;
                case 36 -> 37;
                case 37 -> 128;
                case 38 -> 20;
                case 39 -> 217;
                case 40 -> 56;
                case 41 -> 156;
                case 42 -> 216;
                case 43 -> 109;
                case 44 -> 181;
                case 45 -> 2;
                case 46 -> 91;
                case 47 -> 141;
                case 48 -> 126;
                case 49 -> 100;
                case 50 -> 208;
                case 51 -> 81;
                case 52 -> 247;
                case 53 -> 162;
                case 54 -> 172;
                case 55 -> 142;
                case 56 -> 203;
                case 57 -> 201;
                case 58 -> 135;
                case 59 -> 36;
                case 60 -> 136;
                case 61 -> 26;
                case 62 -> 163;
                case 63 -> 173;
                case 64 -> 155;
                case 65 -> 15;
                case 66 -> 52;
                case 67 -> 132;
                case 68 -> 127;
                case 69 -> 188;
                case 70 -> 239;
                case 71 -> 191;
                case 72 -> 228;
                case 73 -> 165;
                case 74 -> 95;
                case 75 -> 231;
                case 76 -> 67;
                case 77 -> 245;
                case 78 -> 38;
                case 79 -> 73;
                case 80 -> 63;
                case 81 -> 249;
                case 82 -> 8;
                case 83 -> 157;
                case 84 -> 35;
                case 85 -> 223;
                case 86 -> 11;
                case 87 -> 204;
                case 88 -> 254;
                case 89 -> 182;
                case 90 -> 6;
                case 91 -> 111;
                case 92 -> 89;
                case 93 -> 205;
                case 94 -> 122;
                case 95 -> 62;
                case 96 -> 174;
                case 97 -> 161;
                case 98 -> 133;
                case 99 -> 218;
                case 100 -> 144;
                case 101 -> 137;
                case 102 -> 192;
                case 103 -> 143;
                case 104 -> 129;
                case 105 -> 168;
                case 106 -> 169;
                case 107 -> 44;
                case 108 -> 119;
                case 109 -> 39;
                case 110 -> 32;
                case 111 -> 200;
                case 112 -> 125;
                case 113 -> 21;
                case 114 -> 197;
                case 115 -> 110;
                case 116 -> 166;
                case 117 -> 27;
                case 118 -> 92;
                case 119 -> 30;
                case 120 -> 0;
                case 121 -> 230;
                case 122 -> 48;
                case 123 -> 224;
                case 124 -> 75;
                case 125 -> 243;
                case 126 -> 178;
                case 127 -> 22;
                case 128 -> 115;
                case 129 -> 69;
                case 130 -> 10;
                case 131 -> 131;
                case 132 -> 72;
                case 133 -> 86;
                case 134 -> 167;
                case 135 -> 23;
                case 136 -> 97;
                case 137 -> 219;
                case 138 -> 252;
                case 139 -> 71;
                case 140 -> 233;
                case 141 -> 180;
                case 142 -> 130;
                case 143 -> 17;
                case 144 -> 214;
                case 145 -> 25;
                case 146 -> 113;
                case 147 -> 105;
                case 148 -> 83;
                case 149 -> 160;
                case 150 -> 183;
                case 151 -> 220;
                case 152 -> 116;
                case 153 -> 61;
                case 154 -> 96;
                case 155 -> 213;
                case 156 -> 158;
                case 157 -> 185;
                case 158 -> 12;
                case 159 -> 187;
                case 160 -> 16;
                case 161 -> 9;
                case 162 -> 46;
                case 163 -> 212;
                case 164 -> 147;
                case 165 -> 65;
                case 166 -> 184;
                case 167 -> 57;
                case 168 -> 54;
                case 169 -> 170;
                case 170 -> 7;
                case 171 -> 70;
                case 172 -> 206;
                case 173 -> 222;
                case 174 -> 5;
                case 175 -> 164;
                case 176 -> 3;
                case 177 -> 102;
                case 178 -> 241;
                case 179 -> 104;
                case 180 -> 139;
                case 181 -> 229;
                case 182 -> 176;
                case 183 -> 195;
                case 184 -> 82;
                case 185 -> 74;
                case 186 -> 33;
                case 187 -> 40;
                case 188 -> 106;
                case 189 -> 121;
                case 190 -> 211;
                case 191 -> 68;
                case 192 -> 242;
                case 193 -> 193;
                case 194 -> 98;
                case 195 -> 53;
                case 196 -> 251;
                case 197 -> 210;
                case 198 -> 152;
                case 199 -> 153;
                case 200 -> 194;
                case 201 -> 221;
                case 202 -> 255;
                case 203 -> 114;
                case 204 -> 59;
                case 205 -> 19;
                case 206 -> 248;
                case 207 -> 154;
                case 208 -> 107;
                case 209 -> 55;
                case 210 -> 189;
                case 211 -> 118;
                case 212 -> 24;
                case 213 -> 31;
                case 214 -> 64;
                case 215 -> 80;
                case 216 -> 51;
                case 217 -> 49;
                case 218 -> 47;
                case 219 -> 186;
                case 220 -> 28;
                case 221 -> 227;
                case 222 -> 43;
                case 223 -> 175;
                case 224 -> 209;
                case 225 -> 237;
                case 226 -> 250;
                case 227 -> 215;
                case 228 -> 123;
                case 229 -> 145;
                case 230 -> 77;
                case 231 -> 112;
                case 232 -> 234;
                case 233 -> 124;
                case 234 -> 196;
                case 235 -> 99;
                case 236 -> 66;
                case 237 -> 45;
                case 238 -> 117;
                case 239 -> 207;
                case 240 -> 85;
                case 241 -> 93;
                case 242 -> 103;
                case 243 -> 88;
                case 244 -> 235;
                case 245 -> 177;
                case 246 -> 90;
                case 247 -> 140;
                case 248 -> 78;
                case 249 -> 253;
                case 250 -> 244;
                case 251 -> 50;
                case 252 -> 198;
                case 253 -> 151;
                case 254 -> 246;
                default -> 76;
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
            Initializer.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer.strArr_1[n3];
    }
}
