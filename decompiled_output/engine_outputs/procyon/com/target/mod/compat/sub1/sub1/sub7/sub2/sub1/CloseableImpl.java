// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub2.sub1;

import java.util.Iterator;
import net.minecraft.class_287;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.joml.Matrix4f;
import com.target.mod.compat.sub1.sub1.sub7.sub2.sub2.Initializer_1;
import org.joml.Matrix4fc;
import net.minecraft.class_290;
import com.mojang.blaze3d.vertex.VertexFormat$class_5596;
import net.minecraft.class_289;
import java.util.List;
import org.lwjgl.opengl.GL11;
import java.awt.Color;
import net.minecraft.class_4587;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import com.target.mod.compat.sub1.sub1.sub7.sub2.sub2.Initializer_2;
import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Font;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectList;
import net.minecraft.class_2960;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.chars.Char2IntArrayMap;
import java.io.Closeable;

public class CloseableImpl implements Closeable
{
    private static final Char2IntArrayMap char2IntArrayMap;
    private static final Object2ObjectArrayMap<class_2960, ObjectList<RecordSub_1>> object2ObjectArrayMap;
    private final float floatValue;
    private final ObjectList<Initializer> objectList;
    private final Char2ObjectArrayMap<RecordSub> char2ObjectArrayMap;
    private final int intValue;
    private final int intValue_1;
    private int intValue_2;
    private Font[] FontArray;
    private int intValue_3;
    private static String[] strArr;
    private static final String[] strArr_1;
    private static final String[] strArr_2;
    
    public CloseableImpl(final Font[] array, final float floatValue, final int intValue, final int intValue_1) {
        this.objectList = (ObjectList<Initializer>)new ObjectArrayList();
        this.char2ObjectArrayMap = (Char2ObjectArrayMap<RecordSub>)new Char2ObjectArrayMap();
        this.intValue_2 = 0;
        this.intValue_3 = -1;
        Preconditions.checkArgument(array.length > 0, (Object)createString(31900, -1619));
        Preconditions.checkArgument(intValue > 4, (Object)createString(31903, 10267));
        Preconditions.checkArgument(intValue_1 > 0, (Object)createString(31902, -23503));
        this.floatValue = floatValue;
        this.intValue = intValue;
        this.intValue_1 = intValue_1;
        this.setFontarrAndFloat(array, floatValue);
    }
    
    public CloseableImpl(final Font[] array, final float n) {
        this(array, n, 256, 5);
    }
    
    private static int method_int(final int n, final int n2) {
        return n2 * (int)Math.floor(n / (double)n2);
    }
    
    public static String computeString(final String s) {
        final char[] charArray = s.toCharArray();
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; ++i) {
            final char c = charArray[i];
            if (c == '§') {
                ++i;
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    private void execute() {
        if (Initializer_2.getInt() != this.intValue_3) {
            this.close();
            this.setFontarrAndFloat(this.FontArray, this.floatValue);
        }
    }
    
    private void setFontarrAndFloat(final Font[] array, final float n) {
        this.intValue_3 = Initializer_2.getInt();
        this.intValue_2 = this.intValue_3;
        this.FontArray = new Font[array.length];
        for (int i = 0; i < array.length; ++i) {
            this.FontArray[i] = array[i].deriveFont(n * this.intValue_2);
        }
    }
    
    private Initializer createViewc(final char c, final char c2) {
        final Initializer initializer = new Initializer(c, c2, this.FontArray, Initializer_2.getClass_2960(), this.intValue_1);
        this.objectList.add((Object)initializer);
        return initializer;
    }
    
    private RecordSub computeNodee(final char c) {
        for (final Initializer initializer : this.objectList) {
            if (initializer.checkChar(c)) {
                return initializer.computeNodee(c);
            }
        }
        final int method_int = method_int(c, this.intValue);
        return this.createViewc((char)method_int, (char)(method_int + this.intValue)).computeNodee(c);
    }
    
    private RecordSub computeNodee_1(final char c) {
        return (RecordSub)this.char2ObjectArrayMap.computeIfAbsent(c, this::computeNodee);
    }
    
    public void processAll(final class_4587 class_4587, final String s, final float n, final float n2, final Color color) {
        final float n3 = color.getRed() / 255.0f;
        final float n4 = color.getGreen() / 255.0f;
        final float n5 = color.getBlue() / 255.0f;
        final float n6 = color.getAlpha() / 255.0f;
        this.execute();
        float n7 = n3;
        float n8 = n4;
        float n9 = n5;
        class_4587.method_22903();
        class_4587.method_46416(n, n2, 0.0f);
        class_4587.method_22905(1.0f / this.intValue_2, 1.0f / this.intValue_2, 1.0f);
        GL11.glEnable(3042);
        final String[] stringarrArray = getStringarrArray();
        GL11.glBlendFunc(770, 771);
        final String[] array = stringarrArray;
        GL11.glDisable(2884);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        final Matrix4f method_23761 = class_4587.method_23760().method_23761();
        final char[] charArray = s.toCharArray();
        float n10 = 0.0f;
        float n11 = 0.0f;
        int n12 = 0;
        int beginIndex = 0;
        int i = 0;
        while (i < charArray.length) {
            final char ch = charArray[i];
            int n15;
            int n14;
            final int n13 = n14 = (n15 = n12);
            Label_0470: {
                if (array != null) {
                    if (n13 != 0) {
                        n12 = 0;
                        final char upperCase = Character.toUpperCase(ch);
                        char containsKey;
                        final boolean b = (containsKey = (char)(CloseableImpl.char2IntArrayMap.containsKey(upperCase) ? 1 : 0)) != '\0';
                        if (array != null) {
                            if (b) {
                                final int[] computeIntarr_2 = com.target.mod.compat.sub1.sub1.sub7.sub2.sub2.Initializer.computeIntarr_2(CloseableImpl.char2IntArrayMap.get(upperCase));
                                n7 = computeIntarr_2[0] / 255.0f;
                                n8 = computeIntarr_2[1] / 255.0f;
                                n9 = computeIntarr_2[2] / 255.0f;
                                if (array != null) {
                                    break Label_0470;
                                }
                                int int1 = com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.getInt();
                                com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer.setInt(++int1);
                            }
                            containsKey = upperCase;
                        }
                        if (containsKey != 'R') {
                            break Label_0470;
                        }
                        n7 = n3;
                        n8 = n4;
                        n9 = n5;
                        if (array != null) {
                            break Label_0470;
                        }
                    }
                    final char c;
                    n14 = (c = (char)(n15 = ch));
                }
                int n17;
                final int n16 = n17 = 167;
                if (array != null) {
                    if (n13 == n16) {
                        n12 = 1;
                        if (array != null) {
                            break Label_0470;
                        }
                    }
                    n15 = (n14 = ch);
                    final int n18;
                    n17 = (n18 = 10);
                }
                Label_0381: {
                    if (array != null) {
                        if (n14 != n16) {
                            break Label_0381;
                        }
                        n11 += this.method_float_1(s.substring(beginIndex, i)) * this.intValue_2;
                        n10 = 0.0f;
                        n15 = i;
                        n17 = 1;
                    }
                    beginIndex = n15 + n17;
                    if (array != null) {
                        break Label_0470;
                    }
                }
                final RecordSub computeNodee_1;
                final RecordSub recordSub = computeNodee_1 = this.computeNodee_1(ch);
                if (array == null || computeNodee_1.getChar() != ' ') {
                    ((ObjectList)CloseableImpl.object2ObjectArrayMap.computeIfAbsent((Object)computeNodee_1.getViewc().class2960, CloseableImpl::lambda$drawString$0)).add((Object)new RecordSub_1(n10, n11, n7, n8, n9, recordSub));
                }
                n10 += recordSub.getInt_2();
            }
            ++i;
            if (array == null) {
                break;
            }
        }
        final ObjectIterator iterator = CloseableImpl.object2ObjectArrayMap.keySet().iterator();
    Label_0888_Outer:
        while (((Iterator)iterator).hasNext()) {
            final List list = (List)CloseableImpl.object2ObjectArrayMap.get((Object)((Iterator)iterator).next());
            final class_287 method_23762 = class_289.method_1348().method_60827(VertexFormat$class_5596.field_27382, class_290.field_1575);
            if (array != null) {
                while (true) {
                    for (final RecordSub_1 recordSub_1 : list) {
                        final float floatValue = recordSub_1.floatValue;
                        final float floatValue_1 = recordSub_1.floatValue_1;
                        final float floatValue_2 = recordSub_1.floatValue_2;
                        final float floatValue_3 = recordSub_1.floatValue_3;
                        final float floatValue_4 = recordSub_1.floatValue_4;
                        final RecordSub nodeE = recordSub_1.nodeE;
                        final Initializer viewc = nodeE.getViewc();
                        final float n19 = (float)nodeE.getInt_2();
                        final float n20 = (float)nodeE.getInt_3();
                        final float n21 = nodeE.getInt() / (float)viewc.intValue_1;
                        final float n22 = nodeE.getInt_1() / (float)viewc.intValue_2;
                        final float n23 = (nodeE.getInt() + nodeE.getInt_2()) / (float)viewc.intValue_1;
                        final float n24 = (nodeE.getInt_1() + nodeE.getInt_3()) / (float)viewc.intValue_2;
                        method_23762.method_22918((Matrix4fc)method_23761, floatValue + 0.0f, floatValue_1 + n20, 0.0f).method_22913(n21, n24).method_22915(floatValue_2, floatValue_3, floatValue_4, n6);
                        method_23762.method_22918((Matrix4fc)method_23761, floatValue + n19, floatValue_1 + n20, 0.0f).method_22913(n23, n24).method_22915(floatValue_2, floatValue_3, floatValue_4, n6);
                        method_23762.method_22918((Matrix4fc)method_23761, floatValue + n19, floatValue_1 + 0.0f, 0.0f).method_22913(n23, n22).method_22915(floatValue_2, floatValue_3, floatValue_4, n6);
                        method_23762.method_22918((Matrix4fc)method_23761, floatValue + 0.0f, floatValue_1 + 0.0f, 0.0f).method_22913(n21, n22).method_22915(floatValue_2, floatValue_3, floatValue_4, n6);
                        if (array != null) {
                            if (array == null) {
                                break;
                            }
                            continue Label_0888_Outer;
                        }
                        else {
                            if (array == null) {
                                break Label_0888_Outer;
                            }
                            continue Label_0888_Outer;
                        }
                    }
                    Initializer_1.setClass_287(method_23762);
                    continue;
                }
            }
            return;
        }
        class_4587.method_22909();
        CloseableImpl.object2ObjectArrayMap.clear();
    }
    
    public int method_int_1(final class_4587 class_4587, final String s, final float n, final float n2, final int rgba, final boolean b) {
        if (b) {
            this.processAll(class_4587, s, n + 1.0f, n2 + 1.0f, new Color((rgba & 0xFCFCFC) >> 2 | (rgba & 0xFF000000), true));
        }
        this.processAll(class_4587, s, n, n2, new Color(rgba, true));
        return (int)(n + this.method_float(s));
    }
    
    public void processAll_1(final class_4587 class_4587, final String s, final float n, final float n2, final Color color) {
        this.processAll(class_4587, s, n - this.method_float(s) / 2.0f, n2, color);
    }
    
    public float method_float(final String s) {
        final char[] charArray = computeString(s).toCharArray();
        float n = 0.0f;
        float max = 0.0f;
        for (final char c : charArray) {
            if (c == '\n') {
                max = Math.max(n, max);
                n = 0.0f;
            }
            else {
                n += this.computeNodee_1(c).getInt_2() / (float)this.intValue_2;
            }
        }
        return Math.max(n, max);
    }
    
    public float method_float_1(final String s) {
        char[] charArray = computeString(s).toCharArray();
        if (charArray.length == 0) {
            charArray = new char[] { ' ' };
        }
        float max = 0.0f;
        float n = 0.0f;
        for (final char c : charArray) {
            if (c == '\n') {
                if (max == 0.0f) {
                    max = this.computeNodee_1(' ').getInt_3() / (float)this.intValue_2;
                }
                n += max;
                max = 0.0f;
            }
            else {
                max = Math.max(this.computeNodee_1(c).getInt_3() / (float)this.intValue_2, max);
            }
        }
        return max + n;
    }
    
    public int getInt() {
        return (int)(this.method_float_1("A") / 2.0f);
    }
    
    @Override
    public void close() {
        final ObjectListIterator iterator = this.objectList.iterator();
        while (((Iterator)iterator).hasNext()) {
            ((Initializer)((Iterator)iterator).next()).execute();
        }
        this.objectList.clear();
        this.char2ObjectArrayMap.clear();
    }
    
    private static ObjectList lambda$drawString$0(final Object o) {
        return (ObjectList)new ObjectArrayList();
    }
    
    static {
        final String[] strArr_3 = new String[3];
        final String[] stringarr = new String[2];
        int n = 0;
        setStringarr(stringarr);
        final String s;
        final int length = (s = """
                                ¯Y\u00e7<y\u001aD\u008c\u0002\u00e7\u00c0g\u00ff\u0003[\u00cf)\u00d0\r^\u00d0\u008f\u00f6C\u00fcO\u0080h$\u00f7·{\u000e6`¬Q\u0012\u00e3]3q\u0084L\u009a\u0096A\u0089
                                \u0013\u00e7¼\u0098\u00d1?¸\u00f2\u0004\u0012#\u00d6+»\u00c1\u00f6\u0011"\u0097\u0088:\u00c5\u0088\u0081±\u00db\u0090\u0092\u00f5\u0093®E\u000b
                                """).length();
        int char1 = 28;
        int index = -1;
        Label_0030: {
            break Label_0030;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 112);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0208: {
                        if (length2 > 1) {
                            break Label_0208;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 113;
                                case 1 -> 25;
                                case 2 -> 88;
                                case 3 -> 99;
                                case 4 -> 113;
                                case 5 -> 9;
                                default -> 24;
                            }));
                            ++n5;
                        } while (n2 == 0);
                    }
                    if (length2 > n5) {
                        continue;
                    }
                    break;
                }
                strArr_3[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr_1 = strArr_3;
        strArr_2 = new String[3];
        char2IntArrayMap = new Char2IntArrayMapSub();
        object2ObjectArrayMap = new Object2ObjectArrayMap();
    }
    
    public static void setStringarr(final String[] strArr) {
        CloseableImpl.strArr = strArr;
    }
    
    public static String[] getStringarrArray() {
        return CloseableImpl.strArr;
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x7C9E) & 0xFFFF;
        if (CloseableImpl.strArr_2[n3] == null) {
            final char[] charArray = CloseableImpl.strArr_1[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 76;
                case 1 -> 114;
                case 2 -> 164;
                case 3 -> 248;
                case 4 -> 56;
                case 5 -> 42;
                case 6 -> 250;
                case 7 -> 57;
                case 8 -> 125;
                case 9 -> 148;
                case 10 -> 109;
                case 11 -> 208;
                case 12 -> 133;
                case 13 -> 25;
                case 14 -> 205;
                case 15 -> 5;
                case 16 -> 73;
                case 17 -> 135;
                case 18 -> 39;
                case 19 -> 1;
                case 20 -> 185;
                case 21 -> 97;
                case 22 -> 172;
                case 23 -> 80;
                case 24 -> 32;
                case 25 -> 96;
                case 26 -> 40;
                case 27 -> 68;
                case 28 -> 45;
                case 29 -> 43;
                case 30 -> 107;
                case 31 -> 252;
                case 32 -> 176;
                case 33 -> 86;
                case 34 -> 92;
                case 35 -> 104;
                case 36 -> 30;
                case 37 -> 27;
                case 38 -> 122;
                case 39 -> 170;
                case 40 -> 238;
                case 41 -> 212;
                case 42 -> 160;
                case 43 -> 37;
                case 44 -> 132;
                case 45 -> 44;
                case 46 -> 82;
                case 47 -> 22;
                case 48 -> 187;
                case 49 -> 186;
                case 50 -> 41;
                case 51 -> 143;
                case 52 -> 150;
                case 53 -> 7;
                case 54 -> 94;
                case 55 -> 14;
                case 56 -> 50;
                case 57 -> 2;
                case 58 -> 174;
                case 59 -> 26;
                case 60 -> 224;
                case 61 -> 189;
                case 62 -> 157;
                case 63 -> 234;
                case 64 -> 154;
                case 65 -> 216;
                case 66 -> 20;
                case 67 -> 38;
                case 68 -> 128;
                case 69 -> 0;
                case 70 -> 131;
                case 71 -> 244;
                case 72 -> 139;
                case 73 -> 130;
                case 74 -> 31;
                case 75 -> 199;
                case 76 -> 101;
                case 77 -> 124;
                case 78 -> 237;
                case 79 -> 171;
                case 80 -> 145;
                case 81 -> 110;
                case 82 -> 4;
                case 83 -> 158;
                case 84 -> 178;
                case 85 -> 182;
                case 86 -> 75;
                case 87 -> 223;
                case 88 -> 134;
                case 89 -> 60;
                case 90 -> 123;
                case 91 -> 112;
                case 92 -> 138;
                case 93 -> 206;
                case 94 -> 98;
                case 95 -> 247;
                case 96 -> 215;
                case 97 -> 179;
                case 98 -> 229;
                case 99 -> 106;
                case 100 -> 121;
                case 101 -> 65;
                case 102 -> 78;
                case 103 -> 243;
                case 104 -> 61;
                case 105 -> 47;
                case 106 -> 74;
                case 107 -> 196;
                case 108 -> 100;
                case 109 -> 251;
                case 110 -> 9;
                case 111 -> 146;
                case 112 -> 58;
                case 113 -> 184;
                case 114 -> 23;
                case 115 -> 85;
                case 116 -> 11;
                case 117 -> 91;
                case 118 -> 151;
                case 119 -> 207;
                case 120 -> 228;
                case 121 -> 118;
                case 122 -> 246;
                case 123 -> 236;
                case 124 -> 71;
                case 125 -> 115;
                case 126 -> 10;
                case 127 -> 222;
                case 128 -> 19;
                case 129 -> 213;
                case 130 -> 49;
                case 131 -> 6;
                case 132 -> 226;
                case 133 -> 59;
                case 134 -> 255;
                case 135 -> 142;
                case 136 -> 13;
                case 137 -> 195;
                case 138 -> 35;
                case 139 -> 17;
                case 140 -> 28;
                case 141 -> 67;
                case 142 -> 16;
                case 143 -> 69;
                case 144 -> 119;
                case 145 -> 46;
                case 146 -> 36;
                case 147 -> 209;
                case 148 -> 62;
                case 149 -> 72;
                case 150 -> 108;
                case 151 -> 88;
                case 152 -> 218;
                case 153 -> 3;
                case 154 -> 233;
                case 155 -> 211;
                case 156 -> 79;
                case 157 -> 33;
                case 158 -> 64;
                case 159 -> 242;
                case 160 -> 12;
                case 161 -> 210;
                case 162 -> 181;
                case 163 -> 254;
                case 164 -> 113;
                case 165 -> 127;
                case 166 -> 140;
                case 167 -> 147;
                case 168 -> 214;
                case 169 -> 129;
                case 170 -> 225;
                case 171 -> 190;
                case 172 -> 198;
                case 173 -> 241;
                case 174 -> 83;
                case 175 -> 192;
                case 176 -> 81;
                case 177 -> 102;
                case 178 -> 202;
                case 179 -> 220;
                case 180 -> 126;
                case 181 -> 217;
                case 182 -> 93;
                case 183 -> 52;
                case 184 -> 24;
                case 185 -> 175;
                case 186 -> 15;
                case 187 -> 227;
                case 188 -> 162;
                case 189 -> 66;
                case 190 -> 230;
                case 191 -> 90;
                case 192 -> 89;
                case 193 -> 197;
                case 194 -> 152;
                case 195 -> 103;
                case 196 -> 159;
                case 197 -> 194;
                case 198 -> 84;
                case 199 -> 180;
                case 200 -> 201;
                case 201 -> 166;
                case 202 -> 137;
                case 203 -> 105;
                case 204 -> 54;
                case 205 -> 221;
                case 206 -> 163;
                case 207 -> 99;
                case 208 -> 21;
                case 209 -> 53;
                case 210 -> 141;
                case 211 -> 245;
                case 212 -> 156;
                case 213 -> 51;
                case 214 -> 173;
                case 215 -> 116;
                case 216 -> 153;
                case 217 -> 232;
                case 218 -> 219;
                case 219 -> 55;
                case 220 -> 203;
                case 221 -> 188;
                case 222 -> 117;
                case 223 -> 18;
                case 224 -> 168;
                case 225 -> 177;
                case 226 -> 155;
                case 227 -> 70;
                case 228 -> 183;
                case 229 -> 144;
                case 230 -> 169;
                case 231 -> 29;
                case 232 -> 249;
                case 233 -> 48;
                case 234 -> 204;
                case 235 -> 200;
                case 236 -> 240;
                case 237 -> 111;
                case 238 -> 8;
                case 239 -> 161;
                case 240 -> 253;
                case 241 -> 34;
                case 242 -> 136;
                case 243 -> 63;
                case 244 -> 239;
                case 245 -> 193;
                case 246 -> 120;
                case 247 -> 77;
                case 248 -> 167;
                case 249 -> 149;
                case 250 -> 87;
                case 251 -> 95;
                case 252 -> 235;
                case 253 -> 231;
                case 254 -> 165;
                default -> 191;
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
            CloseableImpl.strArr_2[n3] = new String(charArray).intern();
        }
        return CloseableImpl.strArr_2[n3];
    }
}
