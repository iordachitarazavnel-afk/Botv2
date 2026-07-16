// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub2.sub2;

import java.util.Iterator;
import com.target.mod.compat.sub1.sub2.sub2.sub1.Initializer;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_16;
import com.target.mod.compat.sub1.sub2.sub4.QuickStrike;
import com.target.mod.compat.sub1.sub2.sub4.SyncPImpl_1;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_22;
import com.target.mod.compat.sub1.sub2.sub4.LoadFSub;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_17;
import com.target.mod.compat.sub1.sub2.sub4.ItemSImpl_1;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_10;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_4;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_21;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_12;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_19;
import com.target.mod.compat.sub1.sub2.sub4.CheckRImpl_1;
import com.target.mod.compat.sub1.sub2.sub4.ItemSImpl;
import com.target.mod.compat.sub1.sub2.sub4.StepXImpl;
import com.target.mod.compat.sub1.sub2.sub4.StepXImpl_1;
import com.target.mod.compat.sub1.sub2.sub4.CheckRImpl;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_13;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_18;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_11;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_14;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_20;
import com.target.mod.compat.sub1.sub2.sub4.DataNImpl_15;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_5;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_2;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_7;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_6;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_3;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_1;
import com.target.mod.compat.sub1.sub2.sub3.sub1.CacheOImpl;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_9;
import com.target.mod.compat.sub1.sub2.sub3.sub1.DataNImpl_8;
import java.util.ArrayList;
import java.util.List;

public class Initializer_2
{
    private final List<Initializer_3> list;
    private static final String strValue;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_2() {
        final int int_2 = Initializer_3.getInt_2();
        this.list = new ArrayList<Initializer_3>();
        final int n = int_2;
        try {
            final Class[] array = { DataNImpl_8.class, DataNImpl_9.class, DataNImpl.class, CacheOImpl.class, DataNImpl_1.class, DataNImpl_3.class, DataNImpl_6.class, DataNImpl_7.class, DataNImpl_2.class, DataNImpl_5.class, DataNImpl_15.class, DataNImpl_20.class, DataNImpl_14.class, com.target.mod.compat.sub1.sub2.sub4.DataNImpl_5.class, com.target.mod.compat.sub1.sub2.sub4.DataNImpl_7.class, com.target.mod.compat.sub1.sub2.sub4.DataNImpl_8.class, com.target.mod.compat.sub1.sub2.sub4.DataNImpl_3.class, DataNImpl_11.class, DataNImpl_18.class, DataNImpl_13.class, CheckRImpl.class, StepXImpl_1.class, StepXImpl.class, ItemSImpl.class, CheckRImpl_1.class, DataNImpl_19.class, DataNImpl_12.class, DataNImpl_21.class, DataNImpl_4.class, com.target.mod.compat.sub1.sub2.sub4.DataNImpl_2.class, com.target.mod.compat.sub1.sub2.sub4.DataNImpl_6.class, DataNImpl_10.class, ItemSImpl_1.class, DataNImpl_17.class, com.target.mod.compat.sub1.sub2.sub4.DataNImpl_9.class, LoadFSub.class, DataNImpl_22.class, com.target.mod.compat.sub1.sub2.sub4.DataNImpl_1.class, SyncPImpl_1.class, QuickStrike.class, DataNImpl_16.class };
            final int length = array.length;
            int i = 0;
            while (i < length) {
                final Class clazz = array[i];
                try {
                    this.list.add(clazz.getDeclaredConstructor((Class[])new Class[0]).newInstance(new Object[0]));
                    if (n != 0) {
                        break;
                    }
                }
                catch (final Exception ex) {}
                ++i;
                if (n != 0) {
                    int int1 = Initializer.getInt();
                    Initializer.setInt(++int1);
                    break;
                }
            }
        }
        catch (final Exception cause) {
            throw new RuntimeException(createString(8687, -23601), cause);
        }
    }
    
    public List<Initializer_3> getList() {
        return this.list;
    }
    
    public <T extends Initializer_3> T computeLoadf(final Class<T> clazz) {
        for (final Initializer_3 initializer_3 : this.list) {
            try {
                if (clazz.isInstance(initializer_3)) {
                    return (T)initializer_3;
                }
                continue;
            }
            catch (final RuntimeException ex) {
                throw computeRuntimeexception(ex);
            }
        }
        return null;
    }
    
    public Initializer_3 computeLoadf_1(final String s) {
        final int int_1 = Initializer_3.getInt_1();
        final Iterator<Initializer_3> iterator = this.list.iterator();
        final int n = int_1;
        while (iterator.hasNext()) {
            final Initializer_3 initializer_3 = iterator.next();
            Label_0067: {
                Initializer_3 initializer_5 = null;
                Label_0057: {
                    Initializer_3 initializer_4;
                    try {
                        initializer_4 = (initializer_5 = initializer_3);
                        if (n == 0) {
                            return initializer_5;
                        }
                        final String s2 = initializer_4.getString_1();
                        final String s3 = s;
                        final boolean b = s2.equalsIgnoreCase(s3);
                        if (b) {
                            break Label_0057;
                        }
                        break Label_0067;
                    }
                    catch (final RuntimeException ex) {
                        throw computeRuntimeexception(ex);
                    }
                    try {
                        final String s2 = initializer_4.getString_1();
                        final String s3 = s;
                        final boolean b = s2.equalsIgnoreCase(s3);
                        if (!b) {
                            break Label_0067;
                        }
                        initializer_5 = initializer_3;
                    }
                    catch (final RuntimeException ex2) {
                        throw computeRuntimeexception(ex2);
                    }
                }
                return initializer_5;
            }
            if (n == 0) {
                break;
            }
        }
        return null;
    }
    
    private static RuntimeException computeRuntimeexception(final RuntimeException ex) {
        return ex;
    }
    
    static {
        final String[] strArr2 = new String[2];
        int n = 0;
        final String s;
        final int length = (s = """
                                £\u00f2\u0015\u0006\u0005©)-±$\u0094\b\u00d8WK\u0015t;\u00cc\u00cd\u00d6\u00fe\u00f0\u00db¤^\u00e9s¶z\u00d0\u001d\u00d2sk\u0091\u00ce;®\u00ea\u00ee	²²\u00c4\u00ee\u00f2\u00fe¤\u0098\u0081:\u00ca$@º93m\u00ec\u00fb\u00ee\u00d2\u007f\u00949`]\u00f6\f\u0086\u00c0´}©\u0097z\u00fd\u0085\u00cdL\u000b§_Q\u00ca^\u00ec;d\u00d4w¸_®h\o\u00f2\u00dd;.\u0006l¼p¦\u00ed\u0081\u0012Y\u001f\b\u00e2dg\u009d\u00dd\u00ad\u00e0£\u0000=X\u00df\u00f5\u00d4\r\u00f6\u00e0\u0097A\u0092l\u0004\u00de}\u0016f:\u001bng\u0094|\u00d9T¿\u0006\u00fd¨vNU\u00f0\u0095¶
                                o\u00d2\u00c0\u0081\u000eA\\u008e,\u00ed¼\u00d2\u0099:\u00e8\u00ec\u0012f\u0018h`\u00eb#\u00e2\f\u00d0v]p\u0095\u0081\u0003ME6\u0017*\u0019\u00d4	\u00caC\u0084\u009a\u0093\u00c9;\u007f\u00993\u00d8\u00eb\u00e3 |b\u001d\u0096\u00c8Ra\u0003"\u00cd\u00c3\u00dc;¦)2Q\u00e7\u0016\u001b\u0083\u00cfP+¯\u00de\u0099¿D¾\u0091af¦\u0001i\u00dc)\u00f3	}\u000f\u00c9MsKXª Y¨\u001c\u00e6GE p¼q\u0007§	N\u0013\u00f2\u00d6\u00f5\u00c7R\u00e9;\u009cf\u00f2\u008e\u0097Y\u0010\u00f0\u009d
                                \f\u0089c\u00c6
                                g®\u00e6zX\r\b\u0018\u00cb\u00fa¾?\u00d6°·*"\u009au#\u00e1\u008f:*q\u0001@Z²\u0095GQt*\u00dcµ\u00ca\u00df\u00cc7\u00edA©g}m\u00eb\u00da\u00d6N\u009bm3\u007f.\u0004\u0015\u00f2#\u0088\u0001X@!\u00ffR%iOU\u001fG\u0093\u00f9K0\u001b\u001e\u00e9\u00c3\]\u00f4[ªS,ID\u00c1,/0\u001d\u0001µt\u0006´\u00d4'5\u007f*\u00e3\u00f9\u00ee\u0014\u00e4w«\u00de\u00cb\u00fe\u00c1\u00df\u0081E\u00f5{
                                \u009d\u009c\u0084\u0019·\u001f\u00fb½<\u00cc\u00e4\u00f5\u00f5~\u001c©\u0088Sg\u0082\u00caf\u00e6\u00c6\u00c3¡\u0007\u00fe\u00ff_\u0010\u00f1\u0015\u00f6\u00fa\u00d9\u00e3\u0099¸J\u0013\u00f9t\u0015\u00d4º·\u0001\u0088\u008d¬\u00df\u00e2\u001a¢m\u0081n\u00ed\u0019\u0092\u00c2\u00c3\u00ccHFM\u00e2\u00ff)\u00ee\u00f5©\u00f9J
                                f\u00c4\u00c1\b\u009a\u00cbrh\u0081\u0015\u0012\u0085_]b¿\u007f\u000b±\u009a\u00ce\u00eaM\u001a\u0002\u00c0\u00e1\u00c1\u0000A\u0006\u0019´|#°\u0093\u00e5z\u00e5&\u00c1):\u00d4\u00d4³²\u0088\u0014+E\u00d2G",®j\u0098_~\u00e8zNd\u00d9\u0083\u0005\f\u00c5\u00d7\u00f1_v\u009d\u0002¼\m^:\u00d4O#\u001a\u00c35\u001a^"*D\u00fd\u00f7\u009f³S6¬\u00198	\u0087y\u00e9\u00d4M'¶\u00d4H\u0097\u0099\u00eb\u00c5\u0095 O\u0013K\u009f\u00e1\u0003-\u00f46+Q\u0083\u00ee\u009cE²\u0093\u00f5\u00f4\u00c8¬\u008eUbW²¥\u008e\u008cALd\u00e0\u00d2-$»\u00d5qO#¡¡\u00ee¤9\u0000 T{\u00d7C\u0091\u00e8JTG'o\u0081®\r\u009bG\u0007I\u00dc\u00ce\u00dauyG¶\u0011l\u00ee\u0005lE\fYu\u00c6F\u00e96\u0094'\u0007\u008eV?ª\u0084\u00fb\u008a\u0088OQ-\u00d90©\u00fb6½\u0081\u009f\u0000\u00e6R\\r\u0084\u001e\u0092\u0094W	·\u0003\u009c.\u00ff³\u00f0I\u00e49\u00e8\u0015P´W´\u00ca\u0016\u00ad\u00d8\u00140\u00ff\u0012±¨n\u00f2\u000e\u00fc\u0099)t0\\u0082	x6£#\u0082\u00cfe$ªT\u00fe\u00d0\u00f4¢\u00c7^\u00d9_\u009f\u0099%\u00df\u0091cVd¡\u0016§\u00e8t¾@r\u0090A\u00e8±\u00c9M\u00d4\u0013h\u00fa\u008fo\u000e\u00eb\u00dfU\u00c7\u009b\u008b\u00c5l\u00fb7q\u00c3\u00da\u001a\u00193\u00869rW\u00c9´\u00ea\u00e6¹\u0080R\u00c7§_`\u00e9\u00e5\u0095\u008b}\u0099*\u009f¹\u001d{\u00e0\u008c\u00ceG¢°A\u0002\u00f2\u001d\u0084I/¬x\u0099ba\u008dq"\u0086\u0084\u00eeS3{WW\u0012G\u0005\u0097\u00f1\u00d13\u00e5\u00f0H\u00cfX\b\u0013»3\u0005\u00849($q\u00e3\u008d\u00cf(\u00f6§\u00cd\u009dV\u00f6t2o\u008b\u0092}\u00ccz\u00f8l=\u0000\u001f\u00cd\u0097\u00d5\u00d1\u0017\u00cd~fm\u00c8\u0085Y\u00ad©¾a=@\u0014D\u0013\u00e6T\u0088[x\u00deN\u00e4\u0080Ya\u001a\u0084k\u00c2\u00de\u0000\u001b²\\u00d5@»\u009e\u001f\u00c4\u00c0\u00fcI\u00caH\u00f6q\u008a¸©\u00ca\u00de\u0013ª£\u001e\u00fam¢4\u0082\u008f\u0083;¯\u00ef\u00e9\u0019\u0018\u00fb\u00ca\u0093\u00d2]\u0002W\u00c3F\u0080\u0003¤J\u0011\u00e3\u0014¹\u00c4Y\u000e9!Z\u00d5\u009ch\u0002W´\u00ea\u0000R\u001d\u00c4\u0087\u0095	\u00fe\u0018\u00ed¸FX\u0011\f\u00f0K6R\u0014,\u00e6\u0014¬\u0081N´z«\u0018°"[\u00dd\u0088kq\u00cc\u00ca\u00f4qªq\u009bnHe }g¤n1\u00e6¬a\u00f2~\u009c\u00ee\u00e4Z\u000fºds4\u008a\u001dvf<\u009b¯\u00ecJ\u008f°>*«\u00870,y¤µ2E#'#{\u00cd*v \u0080\u00e1\u0091\u009dwV\u009e\u00c9h\u00d1\u0090v\u0099\u009dW\rH\u00c4\u00d24\u0084¡¼\u00c5I9}D\u0000Ao¿\u00c9&-f\u00d07\u009a\u00f2\u007f=O\u007f\u0090\u00f7u©^%\u008b
                                ;«Y\u0015^\u001e¬ ¥cV\u0087NAB\u001c\u00ef\u00e5]C:\u009b\u00ee«»
                                K\u00f6\u0005\u0016:\u008b\u00fb»\u00f0F\u0084\u0095\u0090O\u00fe\u0016v\u00e7\u00e5\u00e2W\u00c6¼\u00cb\u0087¯[\u00f0G¥+\u0015ts\u0094\u00cd\u00eb}4S\u00adskEs£&\f\u008bwj¦Gg\u00f9\u00ce¼\u00ff\u00d6U\u000e\u0003µVu\u00f2\u0094\u00dc%\u00ff¹?\u0018\u0015h\u00f4¸\u00e4\u00fb\u00ea\u00dfNj\u00fc\u00e0§\u00ce2\u0088\u00c9\u0099~\u008a\u00d2\u00df\u00dd\u0016K\u0000\u00c1\u0097\u00f82\u0016¶\u00e0|\u00c6\u0003-\u00c6\u00fd¤Ps2\u0097<A\u0006\u008f\u0099\u008e\u00dd'{\u00e5´\u0098\u00ce\u008e\u009f\u0089\u00ee\u00c6H\u00dc\u00ad\u0088¼\u00f8\u008a 6¡QU\u0013\u00fb:\u00ca\u00f7\u0000?\u00dau\u0087\u00e3Er\u00c3\u0000\u0090\u00feY\u0010\u0083R7Q¶&j\u00e2\u0085\u00d8\u0085©\u0010-I\u0015\u0094\u00ebE|\u00f1\u00dc\u0002\u0012\bR\u00c6)\u0014\u009eP\u0085A\u0091R\u00ed>U\u0089\u00ca&¹«a\u00db\u00c8h\u00feF"©¤¸\u0019¤I^\u0085a\u00da:\u00c6§3ª§<¶\u0017*X«\u00f7!\u0006T\u0006<\u00f9\f[´º"1&\u0000\b\u008b¸\u009a«m%\ a\u00ad\u00ff\u00e1Z\u00ed\u00ef#:º\u0000\u00f8\u00e9D\u00c8\u00efyn\u00fd\u008a\u00cfB\u00c6!®^¦\u0007©£L\u0096cGzr\u00f9\u00cbu"\u00cf\u00c6$\u009e\u00e0¾O\u00fb=}\u008e\u00d6n\u0007\u009e\u0017\u00f9±-Ff\u00c7\u00ef\u00d1\u00fa\u0097e\u00d5\u0096\u00c8\u00f7\u00f7~\u0018¦e7\u0091\u00ff¾£&\u00cf\u0006\u0098n£\u00e0\u00e2\u001b?tT[S.G\u00f2\u007f·:\u008b\u009cP\u000f[\u00d5"ªn\u008c\u0013\u00e3\u00e3\u001b\u0097m\u00d5\u00c4L""").length();
        int char1 = 1580;
        int index = -1;
        Label_0023: {
            break Label_0023;
            do {
                char1 = s.charAt(index);
                int n4;
                int n3;
                final int n2 = n3 = (n4 = 40);
                ++index;
                final String s2 = s;
                final int beginIndex = index;
                final char[] charArray = s2.substring(beginIndex, beginIndex + char1).toCharArray();
                final int length2 = charArray.length;
                int n5 = 0;
                while (true) {
                    Label_0212: {
                        if (length2 > 1) {
                            break Label_0212;
                        }
                        n4 = (n3 = n5);
                        do {
                            final char c = charArray[n3];
                            charArray[n4] = (char)(c ^ (n2 ^ switch (n5 % 7) {
                                case 0 -> 50;
                                case 1 -> 98;
                                case 2 -> 104;
                                case 3 -> 100;
                                case 4 -> 120;
                                case 5 -> 61;
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
                strArr2[n++] = new String(charArray).intern();
            } while ((index += char1) < length);
        }
        strArr = strArr2;
        strArr_1 = new String[2];
        strValue = createString(8686, -60);
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x21EE) & 0xFFFF;
        if (Initializer_2.strArr_1[n3] == null) {
            final char[] charArray = Initializer_2.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 66;
                case 1 -> 132;
                case 2 -> 207;
                case 3 -> 86;
                case 4 -> 150;
                case 5 -> 120;
                case 6 -> 64;
                case 7 -> 199;
                case 8 -> 244;
                case 9 -> 227;
                case 10 -> 152;
                case 11 -> 154;
                case 12 -> 151;
                case 13 -> 80;
                case 14 -> 43;
                case 15 -> 77;
                case 16 -> 14;
                case 17 -> 97;
                case 18 -> 38;
                case 19 -> 173;
                case 20 -> 104;
                case 21 -> 82;
                case 22 -> 187;
                case 23 -> 16;
                case 24 -> 220;
                case 25 -> 72;
                case 26 -> 36;
                case 27 -> 159;
                case 28 -> 101;
                case 29 -> 62;
                case 30 -> 114;
                case 31 -> 26;
                case 32 -> 37;
                case 33 -> 5;
                case 34 -> 124;
                case 35 -> 179;
                case 36 -> 229;
                case 37 -> 200;
                case 38 -> 169;
                case 39 -> 99;
                case 40 -> 217;
                case 41 -> 139;
                case 42 -> 27;
                case 43 -> 98;
                case 44 -> 103;
                case 45 -> 122;
                case 46 -> 211;
                case 47 -> 144;
                case 48 -> 185;
                case 49 -> 15;
                case 50 -> 50;
                case 51 -> 89;
                case 52 -> 228;
                case 53 -> 156;
                case 54 -> 74;
                case 55 -> 235;
                case 56 -> 241;
                case 57 -> 79;
                case 58 -> 41;
                case 59 -> 161;
                case 60 -> 234;
                case 61 -> 201;
                case 62 -> 233;
                case 63 -> 12;
                case 64 -> 110;
                case 65 -> 189;
                case 66 -> 162;
                case 67 -> 59;
                case 68 -> 112;
                case 69 -> 115;
                case 70 -> 141;
                case 71 -> 218;
                case 72 -> 93;
                case 73 -> 44;
                case 74 -> 239;
                case 75 -> 52;
                case 76 -> 49;
                case 77 -> 6;
                case 78 -> 195;
                case 79 -> 25;
                case 80 -> 246;
                case 81 -> 175;
                case 82 -> 45;
                case 83 -> 19;
                case 84 -> 85;
                case 85 -> 158;
                case 86 -> 126;
                case 87 -> 118;
                case 88 -> 216;
                case 89 -> 250;
                case 90 -> 60;
                case 91 -> 140;
                case 92 -> 153;
                case 93 -> 56;
                case 94 -> 202;
                case 95 -> 18;
                case 96 -> 71;
                case 97 -> 186;
                case 98 -> 22;
                case 99 -> 61;
                case 100 -> 34;
                case 101 -> 181;
                case 102 -> 42;
                case 103 -> 203;
                case 104 -> 32;
                case 105 -> 136;
                case 106 -> 20;
                case 107 -> 255;
                case 108 -> 172;
                case 109 -> 3;
                case 110 -> 184;
                case 111 -> 105;
                case 112 -> 236;
                case 113 -> 177;
                case 114 -> 252;
                case 115 -> 63;
                case 116 -> 248;
                case 117 -> 155;
                case 118 -> 128;
                case 119 -> 238;
                case 120 -> 168;
                case 121 -> 226;
                case 122 -> 13;
                case 123 -> 76;
                case 124 -> 88;
                case 125 -> 31;
                case 126 -> 1;
                case 127 -> 148;
                case 128 -> 171;
                case 129 -> 100;
                case 130 -> 109;
                case 131 -> 108;
                case 132 -> 232;
                case 133 -> 54;
                case 134 -> 111;
                case 135 -> 0;
                case 136 -> 193;
                case 137 -> 224;
                case 138 -> 247;
                case 139 -> 46;
                case 140 -> 30;
                case 141 -> 164;
                case 142 -> 83;
                case 143 -> 113;
                case 144 -> 57;
                case 145 -> 160;
                case 146 -> 81;
                case 147 -> 24;
                case 148 -> 206;
                case 149 -> 157;
                case 150 -> 2;
                case 151 -> 95;
                case 152 -> 135;
                case 153 -> 65;
                case 154 -> 198;
                case 155 -> 249;
                case 156 -> 33;
                case 157 -> 106;
                case 158 -> 67;
                case 159 -> 9;
                case 160 -> 138;
                case 161 -> 243;
                case 162 -> 119;
                case 163 -> 165;
                case 164 -> 137;
                case 165 -> 70;
                case 166 -> 251;
                case 167 -> 208;
                case 168 -> 209;
                case 169 -> 230;
                case 170 -> 145;
                case 171 -> 222;
                case 172 -> 102;
                case 173 -> 7;
                case 174 -> 84;
                case 175 -> 53;
                case 176 -> 130;
                case 177 -> 180;
                case 178 -> 221;
                case 179 -> 190;
                case 180 -> 47;
                case 181 -> 21;
                case 182 -> 242;
                case 183 -> 204;
                case 184 -> 147;
                case 185 -> 4;
                case 186 -> 213;
                case 187 -> 48;
                case 188 -> 197;
                case 189 -> 10;
                case 190 -> 92;
                case 191 -> 219;
                case 192 -> 117;
                case 193 -> 23;
                case 194 -> 192;
                case 195 -> 146;
                case 196 -> 196;
                case 197 -> 174;
                case 198 -> 178;
                case 199 -> 183;
                case 200 -> 210;
                case 201 -> 75;
                case 202 -> 182;
                case 203 -> 121;
                case 204 -> 163;
                case 205 -> 91;
                case 206 -> 188;
                case 207 -> 35;
                case 208 -> 8;
                case 209 -> 231;
                case 210 -> 131;
                case 211 -> 225;
                case 212 -> 194;
                case 213 -> 240;
                case 214 -> 191;
                case 215 -> 142;
                case 216 -> 40;
                case 217 -> 253;
                case 218 -> 205;
                case 219 -> 58;
                case 220 -> 78;
                case 221 -> 107;
                case 222 -> 68;
                case 223 -> 214;
                case 224 -> 69;
                case 225 -> 149;
                case 226 -> 215;
                case 227 -> 170;
                case 228 -> 116;
                case 229 -> 55;
                case 230 -> 166;
                case 231 -> 254;
                case 232 -> 29;
                case 233 -> 73;
                case 234 -> 167;
                case 235 -> 90;
                case 236 -> 17;
                case 237 -> 212;
                case 238 -> 28;
                case 239 -> 11;
                case 240 -> 127;
                case 241 -> 94;
                case 242 -> 176;
                case 243 -> 39;
                case 244 -> 223;
                case 245 -> 51;
                case 246 -> 129;
                case 247 -> 87;
                case 248 -> 96;
                case 249 -> 123;
                case 250 -> 125;
                case 251 -> 133;
                case 252 -> 245;
                case 253 -> 134;
                case 254 -> 143;
                default -> 237;
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
            Initializer_2.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_2.strArr_1[n3];
    }
}
