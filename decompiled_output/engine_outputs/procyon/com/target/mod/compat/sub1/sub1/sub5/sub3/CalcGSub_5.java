// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub5.sub3;

import net.minecraft.class_239;
import net.minecraft.class_2246;
import net.minecraft.class_3965;
import java.util.Iterator;
import net.minecraft.class_1799;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_476;
import net.minecraft.class_310;
import net.minecraft.class_433;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import net.minecraft.class_1802;
import com.target.mod.compat.sub1.sub1.sub5.Initializer;
import net.minecraft.class_2338;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_3;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_13;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;

public class CalcGSub_5 extends AbstractLoadF
{
    private final RenderASub_6 eventQ;
    private final RenderASub_13 stepG;
    private final RenderASub_3 configO;
    private final RenderASub_3 configO_1;
    private Initializer_5 checkC;
    private class_2338 class2338;
    private int intValue;
    private int intValue_1;
    private int intValue_2;
    private boolean boolFlag;
    private float floatValue;
    private float floatValue_1;
    private boolean boolFlag_1;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public CalcGSub_5() {
        super(createString(-18011, -18568), createString(-18016, 25875), Initializer.stepF);
        this.eventQ = new RenderASub_6(createString(-18009, -11582), createString(-18013, 24557));
        this.stepG = new RenderASub_13(createString(-18015, -24068), class_1802.field_8606);
        this.configO = new RenderASub_3(createString(-18012, -19635), 2.0, 1.0, 10.0, 1.0);
        this.configO_1 = new RenderASub_3(createString(-18014, 20573), 60.0, 20.0, 200.0, 5.0);
        this.checkC = Initializer_5.IDLE;
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.boolFlag = false;
        this.setRenderaarr(this.eventQ, this.stepG, this.configO, this.configO_1);
    }
    
    @Override
    public void execute() {
        if (CalcGSub_5.class310.field_1724 == null || CalcGSub_5.class310.field_1687 == null || CalcGSub_5.class310.field_1761 == null) {
            this.execute_2();
            return;
        }
        this.execute_3();
    }
    
    @Override
    public void execute_1() {
        this.checkC = Initializer_5.IDLE;
        this.class2338 = null;
        this.intValue = 0;
        this.intValue_1 = 0;
        this.intValue_2 = 0;
        this.boolFlag = false;
    }
    
    @Override
    public void execute_2() {
        final String[] stringarrArray = Initializer_13.getStringarrArray();
        if (stringarrArray != null) {
            Label_0043: {
                if (CalcGSub_5.class310.field_1724 != null) {
                    class_310 class_311;
                    final class_310 class_310 = class_311 = CalcGSub_5.class310;
                    if (stringarrArray != null) {
                        if (class_310.field_1687 == null) {
                            break Label_0043;
                        }
                        final class_310 class310;
                        class_311 = (class310 = CalcGSub_5.class310);
                    }
                    if (stringarrArray != null) {
                        if (class_310.field_1761 == null) {
                            break Label_0043;
                        }
                        class_311 = CalcGSub_5.class310;
                    }
                    int n2;
                    int boolFlag_1;
                    final int n = boolFlag_1 = (n2 = ((class_311.field_1755 instanceof class_433) ? 1 : 0));
                    if (stringarrArray != null) {
                        if (n != 0) {
                            CalcGSub_5.class310.field_1724.method_7346();
                            this.execute_3();
                            return;
                        }
                        CalcGSub_5.class310.field_1724.method_36456(this.floatValue);
                        CalcGSub_5.class310.field_1724.method_36457(this.floatValue_1);
                        final int n3;
                        boolFlag_1 = (n3 = (n2 = this.intValue));
                    }
                    if (stringarrArray != null) {
                        if (n > 0) {
                            --this.intValue;
                            return;
                        }
                        n2 = (boolFlag_1 = (this.boolFlag_1 ? 1 : 0));
                    }
                    while (true) {
                        CalcGSub_5 calcGSub_5 = null;
                        Label_0277: {
                            if (stringarrArray != null) {
                                if (boolFlag_1 != 0) {
                                    this.boolFlag_1 = false;
                                    CalcGSub_5.class310.field_1690.field_1904.method_23481(false);
                                }
                                calcGSub_5 = this;
                                if (stringarrArray == null) {
                                    break Label_0277;
                                }
                                n2 = this.checkC.ordinal();
                            }
                            switch (n2) {
                                case 1: {
                                    calcGSub_5 = this;
                                    break;
                                }
                                case 2: {
                                    this.execute_5();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 3: {
                                    this.execute_6();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 4: {
                                    this.execute_7();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 5: {
                                    this.execute_8();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 6: {
                                    this.execute_9();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 7: {
                                    this.execute_10();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 8: {
                                    this.execute_11();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 9: {
                                    this.execute_12();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 10: {
                                    this.execute_13();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 11: {
                                    this.execute_14();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 12: {
                                    this.execute_15();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 13: {
                                    this.execute_16();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 14: {
                                    this.execute_17();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 15: {
                                    this.execute_18();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 16: {
                                    this.execute_19();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 17: {
                                    this.execute_20();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 18: {
                                    this.execute_21();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 19: {
                                    this.execute_22();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 20: {
                                    this.execute_23();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 21: {
                                    this.execute_24();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 22: {
                                    this.execute_25();
                                    if (stringarrArray == null)
                                    return;
                                }
                                case 23: {
                                    this.execute_26();
                                    return;
                                }
                            }
                        }
                        calcGSub_5.execute_4();
                        if (stringarrArray == null) {
                            continue;
                        }
                        break;
                    }
                    return;
                }
            }
            this.execute_2();
        }
    }
    
    private void execute_3() {
        this.checkC = Initializer_5.FINDING_SPAWNER;
        this.class2338 = null;
        this.intValue = 0;
        this.intValue_1 = this.configO_1.getValue().intValue();
        this.intValue_2 = 0;
        this.boolFlag = false;
        if (CalcGSub_5.class310.field_1724 != null) {
            this.floatValue = CalcGSub_5.class310.field_1724.method_36454();
            this.floatValue_1 = CalcGSub_5.class310.field_1724.method_36455();
        }
        this.boolFlag_1 = false;
    }
    
    private void execute_4() {
        if (this.isEnabled_1()) {
            this.checkC = Initializer_5.OPENING_SPAWNER;
            this.intValue = this.configO.getValue().intValue();
        }
        else {
            this.execute_2();
        }
    }
    
    private void execute_5() {
        if (this.class2338 == null) {
            this.checkC = Initializer_5.FINDING_SPAWNER;
            return;
        }
        CalcGSub_5.class310.field_1690.field_1904.method_23481(true);
        this.boolFlag_1 = true;
        this.checkC = Initializer_5.WAITING_SPAWNER_GUI;
        this.intValue_1 = this.configO_1.getValue().intValue();
        this.intValue = this.configO.getValue().intValue();
    }
    
    private void execute_6() {
        if (CalcGSub_5.class310.field_1755 instanceof class_476) {
            this.checkC = Initializer_5.LOOTING_BONES;
            this.intValue = 0;
            return;
        }
        --this.intValue_1;
        if (this.intValue_1 <= 0) {
            this.execute_2();
        }
    }
    
    private void execute_7() {
        if (!(CalcGSub_5.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        if (this.isEnabled()) {
            this.checkC = Initializer_5.CLOSING_SPAWNER;
            this.intValue = this.configO.getValue().intValue();
            return;
        }
        int n = 0;
        for (int i = 0; i < CalcGSub_5.class310.field_1724.field_7512.field_7761.size(); ++i) {
            if (i < 36) {
                final class_1799 method_7677 = CalcGSub_5.class310.field_1724.field_7512.method_7611(i).method_7677();
                if (!method_7677.method_7960() && method_7677.method_31574(class_1802.field_8606)) {
                    CalcGSub_5.class310.field_1761.method_2906(CalcGSub_5.class310.field_1724.field_7512.field_7763, i, 0, class_1713.field_7794, (class_1657)CalcGSub_5.class310.field_1724);
                    if (++n >= 3) {
                        this.intValue = 1;
                        return;
                    }
                }
            }
        }
        if (n == 0) {
            this.checkC = Initializer_5.CLOSING_SPAWNER;
            this.intValue = this.configO.getValue().intValue();
        }
        else {
            this.intValue = 1;
        }
    }
    
    private void execute_8() {
        CalcGSub_5.class310.field_1724.method_7346();
        this.checkC = Initializer_5.ORDER_COMMAND;
        this.intValue = this.configO.getValue().intValue() * 2;
    }
    
    private void execute_9() {
        CalcGSub_5.class310.field_1724.field_3944.method_45730(createString(-18010, -3359) + (String)this.eventQ.getValue());
        this.checkC = Initializer_5.WAIT_ORDER_GUI;
        this.intValue_1 = this.configO_1.getValue().intValue();
        this.intValue = this.configO.getValue().intValue();
    }
    
    private void execute_10() {
        if (CalcGSub_5.class310.field_1755 instanceof class_476) {
            this.checkC = Initializer_5.SELECT_ORDER_ITEM;
            this.intValue = this.configO.getValue().intValue();
            return;
        }
        --this.intValue_1;
        if (this.intValue_1 <= 0) {
            this.execute_2();
        }
    }
    
    private void execute_11() {
        if (!(CalcGSub_5.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        boolean b = false;
        for (int i = 0; i < CalcGSub_5.class310.field_1724.field_7512.field_7761.size(); ++i) {
            final class_1799 method_7677 = CalcGSub_5.class310.field_1724.field_7512.method_7611(i).method_7677();
            if (!method_7677.method_7960() && method_7677.method_31574(this.stepG.getClass_1792())) {
                CalcGSub_5.class310.field_1761.method_2906(CalcGSub_5.class310.field_1724.field_7512.field_7763, i, 0, class_1713.field_7790, (class_1657)CalcGSub_5.class310.field_1724);
                b = true;
                this.intValue = this.configO.getValue().intValue() * 2;
                break;
            }
        }
        if (b) {
            this.checkC = Initializer_5.WAIT_DELIVERY_GUI;
            this.intValue_1 = this.configO_1.getValue().intValue();
        }
        else {
            this.execute_2();
        }
    }
    
    private void execute_12() {
        if (CalcGSub_5.class310.field_1755 instanceof class_476) {
            boolean b = false;
            for (int i = 0; i < CalcGSub_5.class310.field_1724.field_7512.field_7761.size(); ++i) {
                if (CalcGSub_5.class310.field_1724.field_7512.method_7611(i).field_7871 == CalcGSub_5.class310.field_1724.method_31548()) {
                    b = true;
                    break;
                }
            }
            if (b) {
                this.checkC = Initializer_5.DELIVERING_BONES;
                this.intValue = 0;
                return;
            }
        }
        --this.intValue_1;
        if (this.intValue_1 <= 0) {
            this.execute_2();
        }
    }
    
    private void execute_13() {
        if (!(CalcGSub_5.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        int n = 0;
        for (int i = 0; i < CalcGSub_5.class310.field_1724.field_7512.field_7761.size(); ++i) {
            if (CalcGSub_5.class310.field_1724.field_7512.method_7611(i).field_7871 == CalcGSub_5.class310.field_1724.method_31548()) {
                final class_1799 method_7677 = CalcGSub_5.class310.field_1724.field_7512.method_7611(i).method_7677();
                if (!method_7677.method_7960() && method_7677.method_31574(class_1802.field_8606)) {
                    CalcGSub_5.class310.field_1761.method_2906(CalcGSub_5.class310.field_1724.field_7512.field_7763, i, 0, class_1713.field_7794, (class_1657)CalcGSub_5.class310.field_1724);
                    if (++n >= 3) {
                        this.intValue = 1;
                        return;
                    }
                }
            }
        }
        if (n == 0) {
            this.checkC = Initializer_5.WAIT_AFTER_DELIVERY_1;
            this.intValue = 5;
        }
        else {
            this.intValue = 1;
        }
    }
    
    private void execute_14() {
        this.checkC = Initializer_5.CLOSING_DELIVERY;
        this.intValue = 5;
    }
    
    private void execute_15() {
        if (CalcGSub_5.class310.field_1755 != null) {
            CalcGSub_5.class310.field_1724.method_7346();
        }
        this.checkC = Initializer_5.WAIT_AFTER_CLOSE_DELIVERY;
        this.intValue = 5;
        this.boolFlag = false;
    }
    
    private void execute_16() {
        this.checkC = Initializer_5.WAIT_CONFIRM_GUI;
        this.intValue_1 = this.configO_1.getValue().intValue();
        this.intValue = 5;
    }
    
    private void execute_17() {
        if (CalcGSub_5.class310.field_1755 instanceof class_476) {
            this.checkC = Initializer_5.WAIT_CONFIRM_SETTLE;
            this.intValue = 5;
            return;
        }
        --this.intValue_1;
        if (this.intValue_1 <= 0) {
            this.execute_2();
        }
    }
    
    private void execute_18() {
        if (!(CalcGSub_5.class310.field_1755 instanceof class_476)) {
            this.checkC = Initializer_5.WAIT_CONFIRM_GUI;
            return;
        }
        if (CalcGSub_5.class310.field_1724.field_7512.field_7761.size() > 15) {
            if (CalcGSub_5.class310.field_1724.field_7512.method_7611(15).method_7677().method_31574(class_1802.field_8581)) {
                this.checkC = Initializer_5.CLICK_CONFIRM_SLOT;
                this.intValue = 5;
            }
            else {
                this.intValue = 5;
            }
        }
    }
    
    private void execute_19() {
        if (!(CalcGSub_5.class310.field_1755 instanceof class_476)) {
            this.execute_2();
            return;
        }
        if (!this.boolFlag && CalcGSub_5.class310.field_1724.field_7512.field_7761.size() > 15 && CalcGSub_5.class310.field_1724.field_7512.method_7611(15).method_7677().method_31574(class_1802.field_8581)) {
            CalcGSub_5.class310.field_1761.method_2906(CalcGSub_5.class310.field_1724.field_7512.field_7763, 15, 0, class_1713.field_7790, (class_1657)CalcGSub_5.class310.field_1724);
            this.boolFlag = true;
        }
        this.checkC = Initializer_5.WAIT_AFTER_CONFIRM_1;
        this.intValue = 5;
    }
    
    private void execute_20() {
        this.checkC = Initializer_5.WAIT_AFTER_CONFIRM_2;
        this.intValue = 5;
    }
    
    private void execute_21() {
        this.checkC = Initializer_5.WAIT_AFTER_CONFIRM_3;
        this.intValue = 5;
    }
    
    private void execute_22() {
        this.checkC = Initializer_5.DOUBLE_ESCAPE;
        this.intValue_2 = 2;
        this.intValue = 5;
    }
    
    private boolean isEnabled() {
        final Iterator iterator = CalcGSub_5.class310.field_1724.method_31548().field_7547.iterator();
        while (iterator.hasNext()) {
            if (((class_1799)iterator.next()).method_7960()) {
                return false;
            }
        }
        return true;
    }
    
    private void execute_23() {
        if (this.intValue_2 > 0) {
            if (CalcGSub_5.class310.field_1755 != null) {
                CalcGSub_5.class310.field_1724.method_7346();
            }
            --this.intValue_2;
            this.intValue = 5;
            return;
        }
        this.checkC = Initializer_5.DOUBLE_RIGHTCLICK_FIRST;
        this.intValue = 5;
    }
    
    private void execute_24() {
        if (!this.isEnabled_1()) {
            this.execute_2();
            return;
        }
        CalcGSub_5.class310.field_1690.field_1904.method_23481(true);
        this.boolFlag_1 = true;
        this.checkC = Initializer_5.DOUBLE_RIGHTCLICK_SECOND;
        this.intValue = 5;
    }
    
    private void execute_25() {
        if (!this.isEnabled_1()) {
            this.execute_2();
            return;
        }
        CalcGSub_5.class310.field_1690.field_1904.method_23481(true);
        this.boolFlag_1 = true;
        this.checkC = Initializer_5.POST_CYCLE_DELAY;
        this.intValue = 5;
    }
    
    private void execute_26() {
        this.checkC = Initializer_5.FINDING_SPAWNER;
        this.intValue_1 = this.configO_1.getValue().intValue();
        this.intValue = 20;
    }
    
    private boolean isEnabled_1() {
        final class_239 field_1765 = CalcGSub_5.class310.field_1765;
        if (field_1765 instanceof final class_3965 class_3965) {
            final class_2338 method_17777 = class_3965.method_17777();
            if (CalcGSub_5.class310.field_1687.method_8320(method_17777).method_27852(class_2246.field_10260)) {
                this.class2338 = method_17777.method_10062();
                return true;
            }
        }
        return this.class2338 != null && CalcGSub_5.class310.field_1687.method_8320(this.class2338).method_27852(class_2246.field_10260);
    }
    
    static {
        final String[] strArr2 = new String[8];
        int n = 0;
        String s;
        int n2 = (s = """
                      \u0091f\u0015|\u0004\u008d\u0014,½\u0004q\u00c7[\u0013	\u00c2Y\u00de\u001a\u001b\u00f1XM\u00995@7¨\u00d8_\u000e\u0093\u00f0
                      \u00178\u001aZ\u00c7Mz\u0096v\u00c0\u0006\u00d3\u00d3¦'P\u00e2
                      o\u008b\u0015,&\u0083AZ\u00fe\u00e6\u0018\u00fc\u0094¸"\u009eH\u0097[¨¸c_eBL;\u00e1@¡\u000e\u008f\u00fb\u00c5\u0095""").length();
        int n3 = 13;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 68));
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
                                    case 0 -> 95;
                                    case 1 -> 93;
                                    case 2 -> 29;
                                    case 3 -> 99;
                                    case 4 -> 113;
                                    case 5 -> 79;
                                    default -> 18;
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
                            n2 = (s = "! ®\u0007\u00eb\u0013\u00ea\tq\n\u00f4\u0013-\u00c9)O'\u00fc)\u00cf\u00ebC\u0098\u00e0\u00d2").length();
                            n3 = 5;
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
                    n5 = (n6 = (n7 = (n8 = 114)));
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
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0xFFFFB9A5) & 0xFFFF;
        if (CalcGSub_5.strArr_1[n3] == null) {
            final char[] charArray = CalcGSub_5.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 128;
                case 1 -> 241;
                case 2 -> 23;
                case 3 -> 36;
                case 4 -> 168;
                case 5 -> 59;
                case 6 -> 176;
                case 7 -> 20;
                case 8 -> 84;
                case 9 -> 8;
                case 10 -> 165;
                case 11 -> 80;
                case 12 -> 127;
                case 13 -> 69;
                case 14 -> 124;
                case 15 -> 38;
                case 16 -> 63;
                case 17 -> 107;
                case 18 -> 252;
                case 19 -> 154;
                case 20 -> 15;
                case 21 -> 143;
                case 22 -> 186;
                case 23 -> 48;
                case 24 -> 100;
                case 25 -> 5;
                case 26 -> 46;
                case 27 -> 95;
                case 28 -> 121;
                case 29 -> 68;
                case 30 -> 196;
                case 31 -> 51;
                case 32 -> 174;
                case 33 -> 117;
                case 34 -> 190;
                case 35 -> 231;
                case 36 -> 103;
                case 37 -> 14;
                case 38 -> 12;
                case 39 -> 86;
                case 40 -> 101;
                case 41 -> 35;
                case 42 -> 210;
                case 43 -> 195;
                case 44 -> 182;
                case 45 -> 177;
                case 46 -> 85;
                case 47 -> 92;
                case 48 -> 17;
                case 49 -> 44;
                case 50 -> 73;
                case 51 -> 141;
                case 52 -> 162;
                case 53 -> 105;
                case 54 -> 125;
                case 55 -> 159;
                case 56 -> 204;
                case 57 -> 237;
                case 58 -> 111;
                case 59 -> 180;
                case 60 -> 25;
                case 61 -> 184;
                case 62 -> 4;
                case 63 -> 98;
                case 64 -> 194;
                case 65 -> 248;
                case 66 -> 161;
                case 67 -> 200;
                case 68 -> 76;
                case 69 -> 253;
                case 70 -> 41;
                case 71 -> 66;
                case 72 -> 2;
                case 73 -> 83;
                case 74 -> 70;
                case 75 -> 203;
                case 76 -> 126;
                case 77 -> 191;
                case 78 -> 170;
                case 79 -> 153;
                case 80 -> 232;
                case 81 -> 93;
                case 82 -> 246;
                case 83 -> 181;
                case 84 -> 164;
                case 85 -> 60;
                case 86 -> 57;
                case 87 -> 234;
                case 88 -> 151;
                case 89 -> 158;
                case 90 -> 140;
                case 91 -> 148;
                case 92 -> 132;
                case 93 -> 22;
                case 94 -> 64;
                case 95 -> 61;
                case 96 -> 239;
                case 97 -> 213;
                case 98 -> 129;
                case 99 -> 224;
                case 100 -> 220;
                case 101 -> 188;
                case 102 -> 55;
                case 103 -> 72;
                case 104 -> 13;
                case 105 -> 1;
                case 106 -> 185;
                case 107 -> 179;
                case 108 -> 77;
                case 109 -> 189;
                case 110 -> 3;
                case 111 -> 123;
                case 112 -> 65;
                case 113 -> 9;
                case 114 -> 211;
                case 115 -> 56;
                case 116 -> 193;
                case 117 -> 88;
                case 118 -> 47;
                case 119 -> 152;
                case 120 -> 94;
                case 121 -> 28;
                case 122 -> 207;
                case 123 -> 172;
                case 124 -> 254;
                case 125 -> 99;
                case 126 -> 79;
                case 127 -> 116;
                case 128 -> 228;
                case 129 -> 133;
                case 130 -> 112;
                case 131 -> 32;
                case 132 -> 78;
                case 133 -> 251;
                case 134 -> 49;
                case 135 -> 149;
                case 136 -> 24;
                case 137 -> 53;
                case 138 -> 173;
                case 139 -> 183;
                case 140 -> 147;
                case 141 -> 108;
                case 142 -> 122;
                case 143 -> 156;
                case 144 -> 106;
                case 145 -> 144;
                case 146 -> 33;
                case 147 -> 104;
                case 148 -> 247;
                case 149 -> 209;
                case 150 -> 178;
                case 151 -> 31;
                case 152 -> 205;
                case 153 -> 102;
                case 154 -> 75;
                case 155 -> 192;
                case 156 -> 130;
                case 157 -> 131;
                case 158 -> 243;
                case 159 -> 67;
                case 160 -> 16;
                case 161 -> 21;
                case 162 -> 118;
                case 163 -> 39;
                case 164 -> 30;
                case 165 -> 175;
                case 166 -> 201;
                case 167 -> 233;
                case 168 -> 145;
                case 169 -> 163;
                case 170 -> 71;
                case 171 -> 236;
                case 172 -> 43;
                case 173 -> 240;
                case 174 -> 19;
                case 175 -> 217;
                case 176 -> 91;
                case 177 -> 134;
                case 178 -> 115;
                case 179 -> 187;
                case 180 -> 29;
                case 181 -> 10;
                case 182 -> 40;
                case 183 -> 244;
                case 184 -> 206;
                case 185 -> 45;
                case 186 -> 212;
                case 187 -> 235;
                case 188 -> 82;
                case 189 -> 42;
                case 190 -> 216;
                case 191 -> 198;
                case 192 -> 90;
                case 193 -> 208;
                case 194 -> 238;
                case 195 -> 229;
                case 196 -> 81;
                case 197 -> 171;
                case 198 -> 114;
                case 199 -> 221;
                case 200 -> 58;
                case 201 -> 160;
                case 202 -> 167;
                case 203 -> 146;
                case 204 -> 169;
                case 205 -> 27;
                case 206 -> 227;
                case 207 -> 218;
                case 208 -> 26;
                case 209 -> 215;
                case 210 -> 50;
                case 211 -> 120;
                case 212 -> 223;
                case 213 -> 166;
                case 214 -> 18;
                case 215 -> 150;
                case 216 -> 155;
                case 217 -> 7;
                case 218 -> 135;
                case 219 -> 230;
                case 220 -> 249;
                case 221 -> 37;
                case 222 -> 214;
                case 223 -> 34;
                case 224 -> 138;
                case 225 -> 119;
                case 226 -> 74;
                case 227 -> 97;
                case 228 -> 199;
                case 229 -> 202;
                case 230 -> 242;
                case 231 -> 109;
                case 232 -> 11;
                case 233 -> 245;
                case 234 -> 225;
                case 235 -> 54;
                case 236 -> 136;
                case 237 -> 219;
                case 238 -> 157;
                case 239 -> 137;
                case 240 -> 250;
                case 241 -> 255;
                case 242 -> 0;
                case 243 -> 197;
                case 244 -> 113;
                case 245 -> 139;
                case 246 -> 142;
                case 247 -> 62;
                case 248 -> 89;
                case 249 -> 96;
                case 250 -> 6;
                case 251 -> 226;
                case 252 -> 52;
                case 253 -> 87;
                case 254 -> 222;
                default -> 110;
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
            CalcGSub_5.strArr_1[n3] = new String(charArray).intern();
        }
        return CalcGSub_5.strArr_1[n3];
    }
}
