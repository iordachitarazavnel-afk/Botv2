// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub7.sub2.sub1;

import java.util.Iterator;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import com.target.mod.compat.sub1.sub1.sub7.sub2.sub2.Initializer_2;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import net.minecraft.class_310;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import net.minecraft.class_2960;
import java.awt.Font;

class Initializer
{
    final char charValue;
    final char charValue_1;
    final Font[] FontArray;
    final class_2960 class2960;
    final int intValue;
    private final Char2ObjectArrayMap<RecordSub> char2ObjectArrayMap;
    int intValue_1;
    int intValue_2;
    boolean boolFlag;
    
    public Initializer(final char charValue, final char charValue_1, final Font[] fontArray, final class_2960 class2960, final int intValue) {
        this.char2ObjectArrayMap = (Char2ObjectArrayMap<RecordSub>)new Char2ObjectArrayMap();
        this.boolFlag = false;
        this.charValue = charValue;
        this.charValue_1 = charValue_1;
        this.FontArray = fontArray;
        this.class2960 = class2960;
        this.intValue = intValue;
    }
    
    public RecordSub computeNodee(final char c) {
        if (!this.boolFlag) {
            this.execute_1();
        }
        return (RecordSub)this.char2ObjectArrayMap.get(c);
    }
    
    public void execute() {
        class_310.method_1551().method_1531().method_4615(this.class2960);
        this.char2ObjectArrayMap.clear();
        this.intValue_1 = -1;
        this.intValue_2 = -1;
        this.boolFlag = false;
    }
    
    public boolean checkChar(final char c) {
        return c >= this.charValue && c < this.charValue_1;
    }
    
    private Font computeFont(final char c) {
        for (final Font font : this.FontArray) {
            if (font.canDisplay(c)) {
                return font;
            }
        }
        return this.FontArray[0];
    }
    
    public void execute_1() {
        final String[] stringarrArray = CloseableImpl.getStringarrArray();
        final int boolFlag = this.boolFlag ? 1 : 0;
        if (stringarrArray != null) {
            if (boolFlag != '\0') {
                return;
            }
            final int n = this.charValue_1 - this.charValue - 1;
        }
        final char c = (char)boolFlag;
        final int n2 = (int)(Math.ceil(Math.sqrt(c)) * 1.5);
        this.char2ObjectArrayMap.clear();
        char c2 = '\0';
        int n3 = 0;
        int max = 0;
        int max2 = 0;
        int n4 = 0;
        int n5 = 0;
        int max3 = 0;
        final ArrayList list = new ArrayList();
        final FontRenderContext frc = new FontRenderContext(new AffineTransform(), true, false);
        while (c2 <= c) {
            final char c3 = (char)(this.charValue + c2);
            final Rectangle2D stringBounds = this.computeFont(c3).getStringBounds(String.valueOf(c3), frc);
            final int n6 = (int)Math.ceil(stringBounds.getWidth());
            final int b = (int)Math.ceil(stringBounds.getHeight());
            ++c2;
            max = Math.max(max, n4 + n6);
            max2 = Math.max(max2, n5 + b);
            final int n7 = n3;
            final int n8 = n2;
            if (stringarrArray != null) {
                if (n7 >= n8) {
                    n4 = 0;
                    n5 += max3 + this.intValue;
                    n3 = 0;
                    max3 = 0;
                }
                max3 = Math.max(max3, b);
                list.add(new RecordSub(n4, n5, n6, b, c3, this));
                final int n9 = n6 + this.intValue;
            }
            n4 = n7 + n8;
            ++n3;
            if (stringarrArray == null) {
                break;
            }
        }
        final BufferedImage bufferedImage = new BufferedImage(Math.max(max + this.intValue, 1), Math.max(max2 + this.intValue, 1), 2);
        this.intValue_1 = bufferedImage.getWidth();
        this.intValue_2 = bufferedImage.getHeight();
        final Graphics2D graphics = bufferedImage.createGraphics();
        graphics.setColor(new Color(255, 255, 255, 0));
        graphics.fillRect(0, 0, this.intValue_1, this.intValue_2);
        graphics.setColor(Color.WHITE);
        graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        for (final RecordSub recordSub : list) {
            graphics.setFont(this.computeFont(recordSub.getChar()));
            graphics.drawString(String.valueOf(recordSub.getChar()), recordSub.getInt(), recordSub.getInt_1() + graphics.getFontMetrics().getAscent());
            this.char2ObjectArrayMap.put(recordSub.getChar(), (Object)recordSub);
            if (stringarrArray == null) {
                return;
            }
            if (stringarrArray == null) {
                break;
            }
        }
        Initializer_2.setClass_2960AndBufferedimage(this.class2960, bufferedImage);
        this.boolFlag = true;
    }
}
