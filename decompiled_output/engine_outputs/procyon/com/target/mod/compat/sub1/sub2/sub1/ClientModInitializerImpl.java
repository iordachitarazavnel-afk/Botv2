// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub1;

import java.util.Iterator;
import net.minecraft.class_437;
import com.target.mod.compat.sub1.sub2.sub5.class_437Sub;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_9;
import com.target.mod.compat.sub1.sub2.sub3.sub1.CacheOImpl;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_21;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import java.nio.charset.StandardCharsets;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_16;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_7;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_3;
import java.util.HashMap;
import java.util.Map;
import com.target.mod.compat.sub1.sub2.sub7.Initializer_11;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_1;
import com.target.mod.compat.sub1.sub2.sub2.Initializer_2;
import com.target.mod.compat.sub1.sub2.sub1.sub1.Initializer;
import net.minecraft.class_310;
import net.fabricmc.api.ClientModInitializer;

public class ClientModInitializerImpl implements ClientModInitializer
{
    public static final String strValue;
    public static final String strValue_1;
    public static ClientModInitializerImpl sortB;
    public static final class_310 class310;
    private Initializer renderA;
    private Initializer_2 eventD;
    private Initializer_1 dataB;
    private com.target.mod.compat.sub1.sub2.sub3.Initializer_2 wrapB;
    private Initializer_11 linkV;
    private boolean boolFlag;
    private final Map<Integer, Boolean> map;
    private boolean boolFlag_1;
    private int intValue;
    private static com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] SyncAArray;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public ClientModInitializerImpl() {
        this.boolFlag = false;
        this.map = new HashMap<Integer, Boolean>();
        this.boolFlag_1 = false;
        this.intValue = 0;
    }
    
    public void onInitializeClient() {
        Label_0084: {
            Label_0040: {
                try {
                    Initializer_3.method_double_5(0.0, 0.0);
                    Initializer_7.method_int_1(0);
                    if (this.boolFlag = Initializer_16.isEnabled()) {
                        break Label_0084;
                    }
                    final byte[][] array = com.target.mod.compat.sub1.sub2.sub3.Initializer_1.byteArray;
                    final int n = 0;
                    final byte[] array2 = array[n];
                    if (array2 != null) {
                        break Label_0040;
                    }
                    return;
                }
                catch (final Exception ex) {
                    throw computeException(ex);
                }
                try {
                    final byte[][] array = com.target.mod.compat.sub1.sub2.sub3.Initializer_1.byteArray;
                    final int n = 0;
                    final byte[] array2 = array[n];
                    if (array2 != null) {
                        System.out.println(createString(12536, -3537) + new String(com.target.mod.compat.sub1.sub2.sub3.Initializer_1.byteArray[0], StandardCharsets.UTF_8));
                    }
                }
                catch (final Exception ex2) {
                    throw computeException(ex2);
                }
            }
            return;
        }
        ClientModInitializerImpl.sortB = this;
        this.renderA = new Initializer();
        this.eventD = new Initializer_2();
        this.dataB = new Initializer_1();
        this.wrapB = new com.target.mod.compat.sub1.sub2.sub3.Initializer_2();
        this.linkV = new Initializer_11();
        try {
            new com.target.mod.compat.sub1.sub1.sub1.Initializer_1();
        }
        catch (final Exception ex3) {}
        ClientTickEvents.END_CLIENT_TICK.register((Object)this::lambda$onInitializeClient$0);
        this.dataB.execute();
        ClientLifecycleEvents.CLIENT_STOPPING.register((Object)this::lambda$onInitializeClient$1);
    }
    
    public boolean isEnabled() {
        return this.boolFlag;
    }
    
    public Initializer getRendera() {
        return this.renderA;
    }
    
    public Initializer_2 getEventd() {
        return this.eventD;
    }
    
    public Initializer_1 getDatab() {
        return this.dataB;
    }
    
    public com.target.mod.compat.sub1.sub2.sub3.Initializer_2 getWrapb() {
        return this.wrapB;
    }
    
    public Initializer_11 getLinkv() {
        return this.linkV;
    }
    
    public static Initializer getRendera_1() {
        if (ClientModInitializerImpl.sortB == null || !ClientModInitializerImpl.sortB.boolFlag) {
            return null;
        }
        return ClientModInitializerImpl.sortB.renderA;
    }
    
    private void lambda$onInitializeClient$1(final class_310 class_310) {
        if (this.boolFlag && this.dataB != null) {
            this.dataB.execute_1();
        }
    }
    
    private void lambda$onInitializeClient$0(final class_310 class_310) {
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncaarrArray = getSyncaarrArray();
        int n3;
        int n2;
        final int n = n2 = (n3 = (this.boolFlag ? 1 : 0));
        if (syncaarrArray != null) {
            if (n == 0) {
                return;
            }
            ++this.intValue;
            n3 = (n2 = this.intValue % 600);
        }
        Label_0070: {
            if (syncaarrArray != null) {
                Label_0067: {
                    if (n2 == 0) {
                        boolean enabled_4;
                        final int n4 = (enabled_4 = ((n3 = (Initializer_21.isEnabled_3() ? 1 : 0)) != 0)) ? 1 : 0;
                        Label_0061: {
                            if (syncaarrArray != null) {
                                if (n4 == 0) {
                                    break Label_0061;
                                }
                                n3 = ((enabled_4 = Initializer_21.isEnabled_4()) ? 1 : 0);
                            }
                            if (syncaarrArray == null) {
                                break Label_0070;
                            }
                            if (enabled_4) {
                                break Label_0067;
                            }
                        }
                        this.boolFlag = false;
                        return;
                    }
                }
                n3 = (Initializer_16.boolFlag_4 ? 1 : 0);
            }
        }
        if (n3 != 0) {
            return;
        }
        final CacheOImpl cacheOImpl = this.eventD.computeLoadf(CacheOImpl.class);
        Label_0213: {
            if (syncaarrArray == null || cacheOImpl != null) {
                final int int_2;
                final int n5 = int_2 = cacheOImpl.getInt_2();
                if (syncaarrArray != null) {
                    if (int_2 == -1) {
                        break Label_0213;
                    }
                    Initializer_9.checkInt(n5);
                }
                final int n6;
                final int boolFlag_1 = n6 = int_2;
                ClientModInitializerImpl clientModInitializerImpl = null;
                Label_0208: {
                    Label_0207: {
                        if (syncaarrArray != null) {
                            if (n6 == 0) {
                                break Label_0207;
                            }
                            clientModInitializerImpl = this;
                            if (syncaarrArray == null) {
                                break Label_0208;
                            }
                            final boolean boolFlag_2 = this.boolFlag_1;
                        }
                        if (n6 == 0) {
                            final class_437 field_1755 = class_310.field_1755;
                            if (syncaarrArray != null) {
                                if (!(field_1755 instanceof class_437Sub)) {
                                    com.target.mod.compat.sub1.sub2.sub1.Initializer.utilC.setClass_437(class_310.field_1755);
                                    class_310.method_1507((class_437)new class_437Sub());
                                    if (syncaarrArray != null) {
                                        break Label_0207;
                                    }
                                }
                                final class_437 field_1756 = class_310.field_1755;
                            }
                            final class_437 class_311 = field_1755;
                            if (syncaarrArray == null || class_311 instanceof class_437Sub) {
                                ((class_437Sub)class_311).execute_2();
                            }
                        }
                    }
                    clientModInitializerImpl = this;
                }
                clientModInitializerImpl.boolFlag_1 = (boolFlag_1 != 0);
            }
        }
        if (class_310.field_1755 == null) {
            for (final com.target.mod.compat.sub1.sub2.sub2.Initializer_3 initializer_3 : this.eventD.getList()) {
                final int int1;
                final int n7 = int1 = initializer_3.getInt();
                Label_0345: {
                    if (syncaarrArray != null) {
                        if (int1 == -1) {
                            break Label_0345;
                        }
                        Initializer_9.checkInt(n7);
                    }
                    final int b = int1;
                    final boolean booleanValue = this.map.getOrDefault(n7, false);
                    int n9;
                    final int n8 = n9 = b;
                    Label_0325: {
                        if (syncaarrArray != null) {
                            if (n8 == 0) {
                                break Label_0325;
                            }
                            n9 = (booleanValue ? 1 : 0);
                        }
                        if (n9 == 0) {
                            initializer_3.execute_2();
                        }
                    }
                    this.map.put(n7, (boolean)(b != 0));
                }
                if (syncaarrArray == null) {
                    break;
                }
            }
        }
    }
    
    static {
        final String[] strArr2 = new String[3];
        int n = 0;
        final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncaarr = new com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[2];
        final String s;
        final int length = (s = "_\u0082´\u00f7\u000f\u008ba®\u00ca\u00e7H1\\{\u00f6\u0099\u00d5\u0006*\u00c6\u00fc6@D\u0003\\0\u00f2").length();
        int char1 = 17;
        setSyncaarr(syncaarr);
        int index = -1;
        Label_0030: {
            break Label_0030;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 79);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0232: {
                        if (length2 > 1) {
                            break Label_0232;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 50;
                                case 1 -> 60;
                                case 2 -> 81;
                                case 3 -> 54;
                                case 4 -> 9;
                                case 5 -> 14;
                                default -> 66;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                strArr2[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr = strArr2;
        strArr_1 = new String[3];
        strValue_1 = createString(12537, 30294);
        strValue = createString(12539, -20520);
        class310 = class_310.method_1551();
    }
    
    public static void setSyncaarr(final com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] syncAArray) {
        ClientModInitializerImpl.SyncAArray = syncAArray;
    }
    
    public static com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer[] getSyncaarrArray() {
        return ClientModInitializerImpl.SyncAArray;
    }
    
    private static Exception computeException(final Exception ex) {
        return ex;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x30F9) & 0xFFFF;
        if (ClientModInitializerImpl.strArr_1[n3] == null) {
            final char[] charArray = ClientModInitializerImpl.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 81;
                case 1 -> 35;
                case 2 -> 223;
                case 3 -> 249;
                case 4 -> 110;
                case 5 -> 72;
                case 6 -> 104;
                case 7 -> 53;
                case 8 -> 61;
                case 9 -> 176;
                case 10 -> 146;
                case 11 -> 57;
                case 12 -> 174;
                case 13 -> 48;
                case 14 -> 75;
                case 15 -> 229;
                case 16 -> 122;
                case 17 -> 205;
                case 18 -> 227;
                case 19 -> 204;
                case 20 -> 77;
                case 21 -> 225;
                case 22 -> 234;
                case 23 -> 100;
                case 24 -> 112;
                case 25 -> 115;
                case 26 -> 84;
                case 27 -> 207;
                case 28 -> 116;
                case 29 -> 36;
                case 30 -> 196;
                case 31 -> 148;
                case 32 -> 179;
                case 33 -> 129;
                case 34 -> 226;
                case 35 -> 202;
                case 36 -> 69;
                case 37 -> 97;
                case 38 -> 13;
                case 39 -> 172;
                case 40 -> 164;
                case 41 -> 126;
                case 42 -> 248;
                case 43 -> 46;
                case 44 -> 208;
                case 45 -> 253;
                case 46 -> 0;
                case 47 -> 136;
                case 48 -> 152;
                case 49 -> 236;
                case 50 -> 241;
                case 51 -> 114;
                case 52 -> 166;
                case 53 -> 15;
                case 54 -> 59;
                case 55 -> 187;
                case 56 -> 55;
                case 57 -> 214;
                case 58 -> 108;
                case 59 -> 96;
                case 60 -> 107;
                case 61 -> 159;
                case 62 -> 151;
                case 63 -> 149;
                case 64 -> 2;
                case 65 -> 192;
                case 66 -> 24;
                case 67 -> 7;
                case 68 -> 42;
                case 69 -> 23;
                case 70 -> 25;
                case 71 -> 150;
                case 72 -> 54;
                case 73 -> 167;
                case 74 -> 106;
                case 75 -> 34;
                case 76 -> 94;
                case 77 -> 124;
                case 78 -> 155;
                case 79 -> 14;
                case 80 -> 180;
                case 81 -> 240;
                case 82 -> 101;
                case 83 -> 255;
                case 84 -> 194;
                case 85 -> 235;
                case 86 -> 83;
                case 87 -> 16;
                case 88 -> 219;
                case 89 -> 102;
                case 90 -> 135;
                case 91 -> 144;
                case 92 -> 239;
                case 93 -> 173;
                case 94 -> 5;
                case 95 -> 91;
                case 96 -> 51;
                case 97 -> 6;
                case 98 -> 182;
                case 99 -> 105;
                case 100 -> 251;
                case 101 -> 139;
                case 102 -> 224;
                case 103 -> 137;
                case 104 -> 175;
                case 105 -> 78;
                case 106 -> 201;
                case 107 -> 252;
                case 108 -> 161;
                case 109 -> 68;
                case 110 -> 103;
                case 111 -> 132;
                case 112 -> 43;
                case 113 -> 45;
                case 114 -> 40;
                case 115 -> 117;
                case 116 -> 133;
                case 117 -> 113;
                case 118 -> 30;
                case 119 -> 20;
                case 120 -> 230;
                case 121 -> 216;
                case 122 -> 27;
                case 123 -> 109;
                case 124 -> 17;
                case 125 -> 221;
                case 126 -> 247;
                case 127 -> 87;
                case 128 -> 8;
                case 129 -> 213;
                case 130 -> 140;
                case 131 -> 210;
                case 132 -> 56;
                case 133 -> 206;
                case 134 -> 157;
                case 135 -> 70;
                case 136 -> 65;
                case 137 -> 171;
                case 138 -> 31;
                case 139 -> 89;
                case 140 -> 121;
                case 141 -> 4;
                case 142 -> 190;
                case 143 -> 160;
                case 144 -> 162;
                case 145 -> 12;
                case 146 -> 243;
                case 147 -> 66;
                case 148 -> 238;
                case 149 -> 232;
                case 150 -> 98;
                case 151 -> 10;
                case 152 -> 177;
                case 153 -> 32;
                case 154 -> 127;
                case 155 -> 143;
                case 156 -> 73;
                case 157 -> 231;
                case 158 -> 178;
                case 159 -> 218;
                case 160 -> 99;
                case 161 -> 228;
                case 162 -> 74;
                case 163 -> 181;
                case 164 -> 130;
                case 165 -> 92;
                case 166 -> 28;
                case 167 -> 138;
                case 168 -> 119;
                case 169 -> 38;
                case 170 -> 76;
                case 171 -> 193;
                case 172 -> 3;
                case 173 -> 47;
                case 174 -> 169;
                case 175 -> 197;
                case 176 -> 9;
                case 177 -> 118;
                case 178 -> 244;
                case 179 -> 1;
                case 180 -> 26;
                case 181 -> 19;
                case 182 -> 163;
                case 183 -> 120;
                case 184 -> 50;
                case 185 -> 165;
                case 186 -> 22;
                case 187 -> 18;
                case 188 -> 186;
                case 189 -> 158;
                case 190 -> 203;
                case 191 -> 88;
                case 192 -> 147;
                case 193 -> 52;
                case 194 -> 79;
                case 195 -> 95;
                case 196 -> 111;
                case 197 -> 123;
                case 198 -> 184;
                case 199 -> 217;
                case 200 -> 39;
                case 201 -> 128;
                case 202 -> 170;
                case 203 -> 215;
                case 204 -> 82;
                case 205 -> 80;
                case 206 -> 198;
                case 207 -> 246;
                case 208 -> 245;
                case 209 -> 211;
                case 210 -> 11;
                case 211 -> 195;
                case 212 -> 64;
                case 213 -> 191;
                case 214 -> 185;
                case 215 -> 212;
                case 216 -> 250;
                case 217 -> 85;
                case 218 -> 67;
                case 219 -> 233;
                case 220 -> 125;
                case 221 -> 41;
                case 222 -> 220;
                case 223 -> 142;
                case 224 -> 44;
                case 225 -> 145;
                case 226 -> 153;
                case 227 -> 58;
                case 228 -> 183;
                case 229 -> 21;
                case 230 -> 237;
                case 231 -> 86;
                case 232 -> 222;
                case 233 -> 156;
                case 234 -> 62;
                case 235 -> 189;
                case 236 -> 242;
                case 237 -> 188;
                case 238 -> 29;
                case 239 -> 33;
                case 240 -> 199;
                case 241 -> 168;
                case 242 -> 131;
                case 243 -> 37;
                case 244 -> 200;
                case 245 -> 134;
                case 246 -> 49;
                case 247 -> 254;
                case 248 -> 141;
                case 249 -> 63;
                case 250 -> 60;
                case 251 -> 209;
                case 252 -> 154;
                case 253 -> 90;
                case 254 -> 93;
                default -> 71;
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
            ClientModInitializerImpl.strArr_1[n3] = new String(charArray).intern();
        }
        return ClientModInitializerImpl.strArr_1[n3];
    }
}
