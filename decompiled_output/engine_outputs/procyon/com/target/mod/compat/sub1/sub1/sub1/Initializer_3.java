// 
// Decompiled by Procyon v0.6.0
// 

package com.target.mod.compat.sub1.sub1.sub1;

import java.io.Reader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.awt.Color;
import net.minecraft.class_1887;
import net.minecraft.class_7923;
import net.minecraft.class_1792;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_13;
import java.util.List;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_5;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_4;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_7;
import net.minecraft.class_5321;
import com.google.gson.JsonArray;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_11;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_15;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_3;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_6;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_8;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub;
import com.target.mod.compat.sub1.sub1.sub3.sub3.AbstractSyncA;
import com.google.gson.JsonParser;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import com.google.gson.JsonElement;
import java.util.Iterator;
import com.target.mod.compat.sub1.sub1.sub5.AbstractLoadF;
import com.target.mod.compat.sub1.sub1.sub3.sub3.RenderASub_1;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_18;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_22;
import com.target.mod.compat.sub1.sub1.sub5.sub1.CalcGSub;
import com.target.mod.compat.sub1.sub1.sub7.Initializer_21;
import java.io.File;
import com.google.gson.JsonObject;

public class Initializer_3
{
    private JsonObject jsonObject;
    private File file;
    private static final String[] strArr;
    private static final String[] strArr_1;
    
    public Initializer_3() {
        if (Initializer_1.class310 != null) {
            final File parent = new File(Initializer_1.class310.field_1697, Initializer_21.computeString(createString(27830, 9990)));
            if (!parent.exists()) {
                parent.mkdirs();
            }
            this.file = new File(parent, createString(27836, -32552));
        }
    }
    
    private File getFile() {
        if (this.file == null && Initializer_1.class310 != null) {
            final File parent = new File(Initializer_1.class310.field_1697, Initializer_21.computeString(createString(27830, 9990)));
            if (!parent.exists()) {
                parent.mkdirs();
            }
            this.file = new File(parent, createString(27825, 20873));
        }
        return this.file;
    }
    
    public void execute() {
        final File file = this.getFile();
        Label_0039: {
            Label_0023: {
                try {
                    if (file == null) {
                        break Label_0023;
                    }
                    final File file2 = file;
                    final boolean b = file2.exists();
                    if (!b) {
                        break Label_0023;
                    }
                    break Label_0039;
                }
                catch (final Exception ex) {
                    throw computeThrowable(ex);
                }
                try {
                    final File file2 = file;
                    final boolean b = file2.exists();
                    if (!b) {
                        this.jsonObject = new JsonObject();
                        return;
                    }
                }
                catch (final Exception ex2) {
                    throw computeThrowable(ex2);
                }
            }
            try {
                final JsonObject computeJsonobject = this.computeJsonobject(file.toPath());
                Label_0151: {
                    try {
                        if (computeJsonobject == null) {
                            break Label_0151;
                        }
                        this.setJsonobject(this.jsonObject = computeJsonobject);
                        if (Initializer_1.getSyncf() == null) {
                            return;
                        }
                    }
                    catch (final Exception ex3) {
                        throw computeThrowable(ex3);
                    }
                    final CalcGSub calcGSub = Initializer_1.getSyncf().computeCalcg_1(CalcGSub.class);
                    Label_0114: {
                        try {
                            if (calcGSub == null) {
                                return;
                            }
                            final CalcGSub calcGSub2 = calcGSub;
                            final RenderASub_1 renderASub_1 = calcGSub2.buffC_1;
                            final Boolean b2 = renderASub_1.getValue();
                            final Boolean b3 = b2;
                            final boolean b4 = b3;
                            if (b4) {
                                break Label_0114;
                            }
                            return;
                        }
                        catch (final Exception ex4) {
                            throw computeThrowable(ex4);
                        }
                        try {
                            final CalcGSub calcGSub2 = calcGSub;
                            final RenderASub_1 renderASub_1 = calcGSub2.buffC_1;
                            final Boolean b2 = renderASub_1.getValue();
                            final Boolean b3 = b2;
                            final boolean b4 = b3;
                            if (b4) {
                                Initializer_22.getSortf().processAll(createString(27805, -24346), createString(27789, -24043), Initializer_18.CONFIG_LOAD);
                            }
                        }
                        catch (final Exception ex5) {
                            throw computeThrowable(ex5);
                        }
                    }
                    return;
                }
                this.jsonObject = new JsonObject();
            }
            catch (final Exception ex6) {
                this.jsonObject = new JsonObject();
            }
        }
    }
    
    private void setJsonobject(final JsonObject jsonObject) {
        try {
            if (jsonObject == null) {
                this.jsonObject = new JsonObject();
                return;
            }
        }
        catch (final Exception ex) {
            throw computeThrowable(ex);
        }
        this.jsonObject = jsonObject;
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        Label_0605: {
            Label_0590: {
                Label_0515: {
                    Label_0440: {
                        Label_0188: {
                            try {
                                if (!this.jsonObject.has(createString(27794, -4503)) || !this.jsonObject.get(createString(27794, -4503)).isJsonObject()) {
                                    break Label_0188;
                                }
                            }
                            catch (final Exception ex2) {
                                throw computeThrowable(ex2);
                            }
                            final JsonObject asJsonObject = this.jsonObject.getAsJsonObject(createString(27794, -4503));
                            for (final AbstractLoadF abstractLoadF : Initializer_1.syncF.getList()) {
                                if (asJsonObject.has(abstractLoadF.getString())) {
                                    final boolean asBoolean = asJsonObject.get(abstractLoadF.getString()).getAsBoolean();
                                    try {
                                        if (asBoolean != abstractLoadF.isEnabled()) {
                                            abstractLoadF.execute_2();
                                        }
                                    }
                                    catch (final Exception ex3) {
                                        throw computeThrowable(ex3);
                                    }
                                    b = true;
                                }
                            }
                            try {
                                if (!this.jsonObject.has(createString(27799, 22826)) || !this.jsonObject.get(createString(27799, 22826)).isJsonObject()) {
                                    break Label_0440;
                                }
                            }
                            catch (final Exception ex4) {
                                throw computeThrowable(ex4);
                            }
                        }
                        final JsonObject asJsonObject2 = this.jsonObject.getAsJsonObject(createString(27799, 22826));
                        for (final AbstractLoadF abstractLoadF2 : Initializer_1.syncF.getList()) {
                            int int1 = abstractLoadF2.getInt_7();
                            if (asJsonObject2.has(abstractLoadF2.getString())) {
                                try {
                                    final JsonElement value = asJsonObject2.get(abstractLoadF2.getString());
                                    Label_0354: {
                                        try {
                                            if (!value.isJsonPrimitive() || !value.getAsJsonPrimitive().isNumber()) {
                                                break Label_0354;
                                            }
                                        }
                                        catch (final Exception ex5) {
                                            throw computeThrowable(ex5);
                                        }
                                        int1 = value.getAsInt();
                                    }
                                }
                                catch (final Exception ex6) {}
                            }
                            Label_0428: {
                                try {
                                    if (!new String(new char[] { 'R', 'a', 'd', 'i', 'u', 'm' }).equalsIgnoreCase(abstractLoadF2.getString()) || int1 > 0) {
                                        break Label_0428;
                                    }
                                }
                                catch (final Exception ex7) {
                                    throw computeThrowable(ex7);
                                }
                                int1 = 344;
                            }
                            abstractLoadF2.setInt(int1);
                            b2 = true;
                        }
                        try {
                            if (!this.jsonObject.has(createString(27781, 21969)) || !this.jsonObject.get(createString(27781, 21969)).isJsonObject()) {
                                break Label_0515;
                            }
                        }
                        catch (final Exception ex8) {
                            throw computeThrowable(ex8);
                        }
                    }
                    this.setJsonobject_1(this.jsonObject.getAsJsonObject(createString(27781, 21969)));
                    b3 = true;
                    try {
                        if (!this.jsonObject.has(createString(27801, 32297)) || !this.jsonObject.get(createString(27801, 32297)).isJsonPrimitive()) {
                            break Label_0590;
                        }
                    }
                    catch (final Exception ex9) {
                        throw computeThrowable(ex9);
                    }
                }
                this.setString_1(this.jsonObject.get(createString(27801, 32297)).getAsString());
                try {
                    if (!b) {
                        break Label_0605;
                    }
                    final boolean b4 = b2;
                    if (b4) {
                        break Label_0605;
                    }
                    break Label_0605;
                }
                catch (final Exception ex10) {
                    throw computeThrowable(ex10);
                }
            }
            try {
                final boolean b4 = b2;
                if (b4) {
                    if (b3) {
                        return;
                    }
                }
            }
            catch (final Exception ex11) {
                throw computeThrowable(ex11);
            }
        }
        for (final AbstractLoadF abstractLoadF3 : Initializer_1.syncF.getList()) {
            try {
                if (abstractLoadF3.isEnabled()) {
                    abstractLoadF3.execute_2();
                }
            }
            catch (final Exception ex12) {
                throw computeThrowable(ex12);
            }
            abstractLoadF3.setInt(-1);
        }
        final AbstractLoadF computeCalcg = Initializer_1.syncF.computeCalcg(createString(27790, -8856));
        Label_0718: {
            try {
                if (computeCalcg == null) {
                    return;
                }
                final AbstractLoadF abstractLoadF4 = computeCalcg;
                final boolean b5 = abstractLoadF4.isEnabled();
                if (!b5) {
                    break Label_0718;
                }
                return;
            }
            catch (final Exception ex13) {
                throw computeThrowable(ex13);
            }
            try {
                final AbstractLoadF abstractLoadF4 = computeCalcg;
                final boolean b5 = abstractLoadF4.isEnabled();
                if (!b5) {
                    computeCalcg.execute_2();
                }
            }
            catch (final Exception ex14) {
                throw computeThrowable(ex14);
            }
        }
    }
    
    public void execute_1() {
        try {
            this.jsonObject = this.getValue();
            final File file = this.getFile();
            if (file == null) {
                return;
            }
            final File parentFile = file.getParentFile();
            Label_0041: {
                try {
                    if (parentFile == null) {
                        break Label_0041;
                    }
                    final File file2 = parentFile;
                    final boolean b = file2.exists();
                    if (!b) {
                        break Label_0041;
                    }
                    break Label_0041;
                }
                catch (final Throwable t) {
                    throw computeThrowable(t);
                }
                try {
                    final File file2 = parentFile;
                    final boolean b = file2.exists();
                    if (!b) {
                        parentFile.mkdirs();
                    }
                }
                catch (final Throwable t2) {
                    throw computeThrowable(t2);
                }
            }
            try (final FileWriter fileWriter = new FileWriter(file)) {
                new GsonBuilder().setPrettyPrinting().create().toJson((JsonElement)this.jsonObject, (Appendable)fileWriter);
                Label_0169: {
                    if (Initializer_1.getSyncf() != null) {
                        final CalcGSub calcGSub = Initializer_1.getSyncf().computeCalcg_1(CalcGSub.class);
                        Label_0135: {
                            try {
                                if (calcGSub == null) {
                                    break Label_0169;
                                }
                                final CalcGSub calcGSub2 = calcGSub;
                                final RenderASub_1 renderASub_1 = calcGSub2.buffC_1;
                                final Boolean b2 = renderASub_1.getValue();
                                final Boolean b3 = b2;
                                final boolean b4 = b3;
                                if (b4) {
                                    break Label_0135;
                                }
                                break Label_0169;
                            }
                            catch (final Throwable t3) {
                                throw computeThrowable(t3);
                            }
                            try {
                                final CalcGSub calcGSub2 = calcGSub;
                                final RenderASub_1 renderASub_1 = calcGSub2.buffC_1;
                                final Boolean b2 = renderASub_1.getValue();
                                final Boolean b3 = b2;
                                final boolean b4 = b3;
                                if (b4) {
                                    Initializer_22.getSortf().processAll(createString(27776, -31773), createString(27827, 5872), Initializer_18.CONFIG_SAVE);
                                }
                            }
                            catch (final Throwable t4) {
                                throw computeThrowable(t4);
                            }
                        }
                    }
                }
            }
        }
        catch (final Exception ex) {}
    }
    
    private JsonObject getValue() {
        if (this.jsonObject == null) {
            this.jsonObject = new JsonObject();
        }
        final JsonObject jsonObject = new JsonObject();
        for (final AbstractLoadF abstractLoadF : Initializer_1.syncF.getList()) {
            jsonObject.addProperty(abstractLoadF.getString(), Boolean.valueOf(abstractLoadF.isEnabled()));
        }
        this.jsonObject.add(createString(27794, -4503), (JsonElement)jsonObject);
        final JsonObject jsonObject2 = new JsonObject();
        for (final AbstractLoadF abstractLoadF2 : Initializer_1.syncF.getList()) {
            if (abstractLoadF2.getInt_7() <= 0) {
                if (abstractLoadF2 == Initializer_1.syncF.computeCalcg_1(CalcGSub.class)) {
                    jsonObject2.addProperty(abstractLoadF2.getString(), (Number)344);
                }
                else {
                    jsonObject2.addProperty(abstractLoadF2.getString(), createString(27824, 14079));
                }
            }
            else {
                jsonObject2.addProperty(abstractLoadF2.getString(), (Number)abstractLoadF2.getInt_7());
            }
        }
        this.jsonObject.add(createString(27799, 22826), (JsonElement)jsonObject2);
        this.jsonObject.add(createString(27781, 21969), (JsonElement)this.getValue_1());
        if (!this.jsonObject.has(createString(27801, 32297)) || !this.jsonObject.get(createString(27801, 32297)).isJsonPrimitive()) {
            if (this.jsonObject.has(createString(27801, 32297))) {
                this.jsonObject.remove(createString(27801, 32297));
            }
        }
        return this.jsonObject;
    }
    
    public void execute_2() {
        this.execute_1();
    }
    
    public void execute_3() {
        this.execute_1();
    }
    
    public boolean isEnabled() {
        return this.jsonObject != null && this.jsonObject.has(createString(27801, 32297)) && this.jsonObject.get(createString(27801, 32297)).isJsonPrimitive();
    }
    
    public void setString(final String s) {
        Label_0045: {
            try {
                if (s.contains(createString(27834, 10427))) {
                    this.jsonObject = new JsonObject();
                    break Label_0045;
                }
            }
            catch (final Exception ex) {
                throw computeThrowable(ex);
            }
            this.jsonObject = JsonParser.parseString(s).getAsJsonObject();
        }
        if (this.jsonObject != null) {
            boolean b = false;
            boolean b2 = false;
            boolean b3 = false;
            Label_0632: {
                Label_0617: {
                    Label_0542: {
                        Label_0467: {
                            Label_0215: {
                                try {
                                    if (!this.jsonObject.has(createString(27782, 30852)) || !this.jsonObject.get(createString(27794, -4503)).isJsonObject()) {
                                        break Label_0215;
                                    }
                                }
                                catch (final Exception ex2) {
                                    throw computeThrowable(ex2);
                                }
                                final JsonObject asJsonObject = this.jsonObject.getAsJsonObject(createString(27794, -4503));
                                for (final AbstractLoadF abstractLoadF : Initializer_1.syncF.getList()) {
                                    if (asJsonObject.has(abstractLoadF.getString())) {
                                        final boolean asBoolean = asJsonObject.get(abstractLoadF.getString()).getAsBoolean();
                                        try {
                                            if (asBoolean != abstractLoadF.isEnabled()) {
                                                abstractLoadF.execute_2();
                                            }
                                        }
                                        catch (final Exception ex3) {
                                            throw computeThrowable(ex3);
                                        }
                                        b = true;
                                    }
                                }
                                try {
                                    if (!this.jsonObject.has(createString(27777, 29434)) || !this.jsonObject.get(createString(27799, 22826)).isJsonObject()) {
                                        break Label_0467;
                                    }
                                }
                                catch (final Exception ex4) {
                                    throw computeThrowable(ex4);
                                }
                            }
                            final JsonObject asJsonObject2 = this.jsonObject.getAsJsonObject(createString(27799, 22826));
                            for (final AbstractLoadF abstractLoadF2 : Initializer_1.syncF.getList()) {
                                int int1 = abstractLoadF2.getInt_7();
                                if (asJsonObject2.has(abstractLoadF2.getString())) {
                                    try {
                                        final JsonElement value = asJsonObject2.get(abstractLoadF2.getString());
                                        Label_0381: {
                                            try {
                                                if (!value.isJsonPrimitive() || !value.getAsJsonPrimitive().isNumber()) {
                                                    break Label_0381;
                                                }
                                            }
                                            catch (final Exception ex5) {
                                                throw computeThrowable(ex5);
                                            }
                                            int1 = value.getAsInt();
                                        }
                                    }
                                    catch (final Exception ex6) {}
                                }
                                Label_0455: {
                                    try {
                                        if (!new String(new char[] { 'R', 'a', 'd', 'i', 'u', 'm' }).equalsIgnoreCase(abstractLoadF2.getString()) || int1 > 0) {
                                            break Label_0455;
                                        }
                                    }
                                    catch (final Exception ex7) {
                                        throw computeThrowable(ex7);
                                    }
                                    int1 = 344;
                                }
                                abstractLoadF2.setInt(int1);
                                b2 = true;
                            }
                            try {
                                if (!this.jsonObject.has(createString(27783, 11214)) || !this.jsonObject.get(createString(27781, 21969)).isJsonObject()) {
                                    break Label_0542;
                                }
                            }
                            catch (final Exception ex8) {
                                throw computeThrowable(ex8);
                            }
                        }
                        this.setJsonobject_1(this.jsonObject.getAsJsonObject(createString(27781, 21969)));
                        b3 = true;
                        try {
                            if (!this.jsonObject.has(createString(27801, 32297)) || !this.jsonObject.get(createString(27801, 32297)).isJsonPrimitive()) {
                                break Label_0617;
                            }
                        }
                        catch (final Exception ex9) {
                            throw computeThrowable(ex9);
                        }
                    }
                    this.setString_1(this.jsonObject.get(createString(27801, 32297)).getAsString());
                    try {
                        if (!b) {
                            break Label_0632;
                        }
                        final boolean b4 = b2;
                        if (b4) {
                            break Label_0632;
                        }
                        break Label_0632;
                    }
                    catch (final Exception ex10) {
                        throw computeThrowable(ex10);
                    }
                }
                try {
                    final boolean b4 = b2;
                    if (b4) {
                        if (b3) {
                            return;
                        }
                    }
                }
                catch (final Exception ex11) {
                    throw computeThrowable(ex11);
                }
            }
            for (final AbstractLoadF abstractLoadF3 : Initializer_1.syncF.getList()) {
                try {
                    if (abstractLoadF3.isEnabled()) {
                        abstractLoadF3.execute_2();
                    }
                }
                catch (final Exception ex12) {
                    throw computeThrowable(ex12);
                }
                abstractLoadF3.setInt(-1);
            }
            final AbstractLoadF computeCalcg = Initializer_1.syncF.computeCalcg(createString(27807, 14500));
            Label_0745: {
                try {
                    if (computeCalcg == null) {
                        return;
                    }
                    final AbstractLoadF abstractLoadF4 = computeCalcg;
                    final boolean b5 = abstractLoadF4.isEnabled();
                    if (!b5) {
                        break Label_0745;
                    }
                    return;
                }
                catch (final Exception ex13) {
                    throw computeThrowable(ex13);
                }
                try {
                    final AbstractLoadF abstractLoadF4 = computeCalcg;
                    final boolean b5 = abstractLoadF4.isEnabled();
                    if (!b5) {
                        computeCalcg.execute_2();
                    }
                }
                catch (final Exception ex14) {
                    throw computeThrowable(ex14);
                }
            }
        }
    }
    
    public JsonObject getValue_1() {
        final JsonObject jsonObject = new JsonObject();
        for (final AbstractLoadF abstractLoadF : Initializer_1.syncF.getList()) {
            final JsonObject jsonObject2 = new JsonObject();
            for (final AbstractSyncA abstractSyncA : abstractLoadF.getList()) {
                if (abstractSyncA instanceof final RenderASub_1 renderASub_19) {
                    jsonObject2.addProperty(abstractSyncA.getString(), Boolean.valueOf(renderASub_19.getValue()));
                }
                else if (abstractSyncA instanceof final RenderASub renderASub) {
                    jsonObject2.addProperty(abstractSyncA.getString(), (Number)renderASub.getValue());
                }
                else if (abstractSyncA instanceof final RenderASub_8 renderASub_18) {
                    jsonObject2.addProperty(abstractSyncA.getString(), (Number)renderASub_18.getValue());
                }
                else if (abstractSyncA instanceof final RenderASub_6 renderASub_17) {
                    jsonObject2.addProperty(abstractSyncA.getString(), (String)renderASub_17.getValue());
                }
                else if (abstractSyncA instanceof final RenderASub_3 renderASub_16) {
                    jsonObject2.addProperty(abstractSyncA.getString(), (Number)renderASub_16.getValue());
                }
                else if (abstractSyncA instanceof final RenderASub_15 renderASub_15) {
                    jsonObject2.addProperty(abstractSyncA.getString(), renderASub_15.getValue().toString());
                }
                else if (abstractSyncA instanceof final RenderASub_11 renderASub_11) {
                    final JsonObject jsonObject3 = new JsonObject();
                    final JsonArray jsonArray = new JsonArray();
                    for (final class_5321 class_5321 : renderASub_11.getList()) {
                        try {
                            jsonArray.add(class_5321.method_29177().toString());
                        }
                        catch (final Exception ex) {}
                    }
                    jsonObject3.add(createString(27826, -7261), (JsonElement)jsonArray);
                    final JsonArray jsonArray2 = new JsonArray();
                    final Iterator<String> iterator4 = renderASub_11.getSet().iterator();
                    while (iterator4.hasNext()) {
                        jsonArray2.add((String)iterator4.next());
                    }
                    jsonObject3.add(createString(27779, 9589), (JsonElement)jsonArray2);
                    final JsonObject jsonObject4 = new JsonObject();
                    final JsonArray jsonArray3 = new JsonArray();
                    final Iterator<String> iterator5 = renderASub_11.getSet().iterator();
                    while (iterator5.hasNext()) {
                        jsonArray3.add((String)iterator5.next());
                    }
                    jsonObject4.add(createString(27793, -25555), (JsonElement)jsonArray3);
                    jsonObject3.add(createString(27788, 17749), (JsonElement)jsonObject4);
                    jsonObject2.add(abstractSyncA.getString(), (JsonElement)jsonObject3);
                }
                else {
                    if (abstractSyncA instanceof final RenderASub_7 renderASub_12) {
                        try {
                            if (!abstractSyncA.getString().equalsIgnoreCase(createString(27797, 18223))) {
                                jsonObject2.addProperty(abstractSyncA.getString(), (Number)((AbstractSyncA<Number>)renderASub_12).getValue());
                                continue;
                            }
                            continue;
                        }
                        catch (final Exception ex2) {
                            throw computeThrowable(ex2);
                        }
                    }
                    if (abstractSyncA instanceof final RenderASub_4 renderASub_13) {
                        final int n = 27802;
                        final Color color = renderASub_13.getColor();
                        jsonObject2.addProperty(abstractSyncA.getString(), String.format(createString(n, 6792), color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
                    }
                    else if (abstractSyncA instanceof final RenderASub_5 renderASub_14) {
                        final JsonArray jsonArray4 = new JsonArray();
                        final Iterator iterator6 = ((AbstractSyncA<List>)renderASub_14).getValue().iterator();
                        while (iterator6.hasNext()) {
                            jsonArray4.add((String)iterator6.next());
                        }
                        jsonObject2.add(abstractSyncA.getString(), (JsonElement)jsonArray4);
                    }
                    else {
                        if (!(abstractSyncA instanceof RenderASub_13)) {
                            continue;
                        }
                        final class_1792 class_5322 = ((RenderASub_13)abstractSyncA).getValue();
                        if (class_5322 == null) {
                            continue;
                        }
                        jsonObject2.addProperty(abstractSyncA.getString(), class_7923.field_41178.method_10221((Object)class_5322).toString());
                    }
                }
            }
            try {
                if (jsonObject2.isEmpty()) {
                    continue;
                }
                jsonObject.add(abstractLoadF.getString(), (JsonElement)jsonObject2);
            }
            catch (final Exception ex3) {
                throw computeThrowable(ex3);
            }
        }
        return jsonObject;
    }
    
    public void setJsonobject_1(final JsonObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //     6: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.getList:()Ljava/util/List;
        //     9: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    14: astore          4
        //    16: astore_2       
        //    17: aload           4
        //    19: invokeinterface java/util/Iterator.hasNext:()Z
        //    24: ifeq            2031
        //    27: aload           4
        //    29: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    34: checkcast       Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //    37: astore          5
        //    39: aload_1        
        //    40: aload           5
        //    42: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.getString:()Ljava/lang/String;
        //    45: aload_2        
        //    46: ifnull          68
        //    49: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //    52: ifne            62
        //    55: goto            17
        //    58: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    61: athrow         
        //    62: aload_1        
        //    63: aload           5
        //    65: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.getString:()Ljava/lang/String;
        //    68: invokevirtual   com/google/gson/JsonObject.getAsJsonObject:(Ljava/lang/String;)Lcom/google/gson/JsonObject;
        //    71: astore          6
        //    73: aload           5
        //    75: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.getList:()Ljava/util/List;
        //    78: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    83: astore          7
        //    85: aload           7
        //    87: invokeinterface java/util/Iterator.hasNext:()Z
        //    92: ifeq            2027
        //    95: aload           7
        //    97: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   102: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA;
        //   105: astore          8
        //   107: aload           6
        //   109: aload           8
        //   111: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   114: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   117: aload_2        
        //   118: ifnull          24
        //   121: aload_2        
        //   122: ifnull          143
        //   125: ifne            138
        //   128: goto            135
        //   131: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   134: athrow         
        //   135: goto            85
        //   138: aload           8
        //   140: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   143: aload_2        
        //   144: ifnull          205
        //   147: ifeq            200
        //   150: goto            157
        //   153: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   156: athrow         
        //   157: aload           8
        //   159: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   162: astore          9
        //   164: aload           9
        //   166: aload           6
        //   168: aload           8
        //   170: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   173: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   176: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //   179: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   182: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.setObject:(Ljava/lang/Object;)V
        //   185: aload_2        
        //   186: ifnonnull       2018
        //   189: invokestatic    com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.getInt_1:()I
        //   192: istore_3       
        //   193: iinc            3, 1
        //   196: iload_3        
        //   197: invokestatic    com/target/mod/compat/sub1/sub2/sub2/sub1/Initializer.setInt:(I)V
        //   200: aload           8
        //   202: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   205: aload_2        
        //   206: ifnull          263
        //   209: ifeq            251
        //   212: goto            219
        //   215: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   218: athrow         
        //   219: aload           8
        //   221: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   224: astore          10
        //   226: aload           10
        //   228: aload           6
        //   230: aload           8
        //   232: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   235: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   238: invokevirtual   com/google/gson/JsonElement.getAsDouble:()D
        //   241: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   244: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.setObject:(Ljava/lang/Object;)V
        //   247: aload_2        
        //   248: ifnonnull       2018
        //   251: aload           8
        //   253: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_8;
        //   256: goto            263
        //   259: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   262: athrow         
        //   263: aload_2        
        //   264: ifnull          321
        //   267: ifeq            309
        //   270: goto            277
        //   273: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   276: athrow         
        //   277: aload           8
        //   279: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_8;
        //   282: astore          11
        //   284: aload           11
        //   286: aload           6
        //   288: aload           8
        //   290: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   293: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   296: invokevirtual   com/google/gson/JsonElement.getAsDouble:()D
        //   299: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   302: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_8.setDouble:(Ljava/lang/Double;)V
        //   305: aload_2        
        //   306: ifnonnull       2018
        //   309: aload           8
        //   311: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   314: goto            321
        //   317: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   320: athrow         
        //   321: aload_2        
        //   322: ifnull          376
        //   325: ifeq            364
        //   328: goto            335
        //   331: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   334: athrow         
        //   335: aload           8
        //   337: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6;
        //   340: astore          12
        //   342: aload           12
        //   344: aload           6
        //   346: aload           8
        //   348: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   351: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   354: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   357: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_6.setObject:(Ljava/lang/Object;)V
        //   360: aload_2        
        //   361: ifnonnull       2018
        //   364: aload           8
        //   366: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_3;
        //   369: goto            376
        //   372: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   375: athrow         
        //   376: aload_2        
        //   377: ifnull          434
        //   380: ifeq            422
        //   383: goto            390
        //   386: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   389: athrow         
        //   390: aload           8
        //   392: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_3;
        //   395: astore          13
        //   397: aload           13
        //   399: aload           6
        //   401: aload           8
        //   403: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   406: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   409: invokevirtual   com/google/gson/JsonElement.getAsDouble:()D
        //   412: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   415: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_3.setDouble:(Ljava/lang/Double;)V
        //   418: aload_2        
        //   419: ifnonnull       2018
        //   422: aload           8
        //   424: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   427: goto            434
        //   430: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   433: athrow         
        //   434: aload_2        
        //   435: ifnull          489
        //   438: ifeq            477
        //   441: goto            448
        //   444: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   447: athrow         
        //   448: aload           8
        //   450: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15;
        //   453: astore          14
        //   455: aload           14
        //   457: aload           6
        //   459: aload           8
        //   461: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   464: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   467: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   470: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_15.setString:(Ljava/lang/String;)V
        //   473: aload_2        
        //   474: ifnonnull       2018
        //   477: aload           8
        //   479: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   482: goto            489
        //   485: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   488: athrow         
        //   489: aload_2        
        //   490: ifnull          1554
        //   493: ifeq            1542
        //   496: goto            503
        //   499: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   502: athrow         
        //   503: aload           8
        //   505: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11;
        //   508: astore          15
        //   510: aload           6
        //   512: aload           8
        //   514: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   517: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   520: astore          20
        //   522: aload           20
        //   524: aload_2        
        //   525: ifnull          649
        //   528: invokevirtual   com/google/gson/JsonElement.isJsonObject:()Z
        //   531: ifne            640
        //   534: goto            541
        //   537: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   540: athrow         
        //   541: aload           6
        //   543: aload           8
        //   545: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   548: invokevirtual   com/google/gson/JsonObject.getAsJsonArray:(Ljava/lang/String;)Lcom/google/gson/JsonArray;
        //   551: astore          21
        //   553: aload           15
        //   555: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.execute:()V
        //   558: aload           21
        //   560: invokevirtual   com/google/gson/JsonArray.iterator:()Ljava/util/Iterator;
        //   563: astore          22
        //   565: aload           22
        //   567: invokeinterface java/util/Iterator.hasNext:()Z
        //   572: ifeq            631
        //   575: aload           22
        //   577: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   582: checkcast       Lcom/google/gson/JsonElement;
        //   585: astore          23
        //   587: aload           23
        //   589: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   592: astore          24
        //   594: aload           24
        //   596: invokestatic    net/minecraft/class_2960.method_60654:(Ljava/lang/String;)Lnet/minecraft/class_2960;
        //   599: astore          25
        //   601: getstatic       net/minecraft/class_7924.field_41265:Lnet/minecraft/class_5321;
        //   604: aload           25
        //   606: invokestatic    net/minecraft/class_5321.method_29179:(Lnet/minecraft/class_5321;Lnet/minecraft/class_2960;)Lnet/minecraft/class_5321;
        //   609: astore          26
        //   611: aload           15
        //   613: aload           26
        //   615: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.setClass_5321:(Lnet/minecraft/class_5321;)V
        //   618: aload_2        
        //   619: ifnull          1538
        //   622: goto            627
        //   625: astore          25
        //   627: aload_2        
        //   628: ifnonnull       565
        //   631: goto            1538
        //   634: astore          21
        //   636: aload_2        
        //   637: ifnonnull       1538
        //   640: aload           20
        //   642: goto            649
        //   645: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   648: athrow         
        //   649: invokevirtual   com/google/gson/JsonElement.getAsJsonObject:()Lcom/google/gson/JsonObject;
        //   652: astore          21
        //   654: aload           15
        //   656: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.execute:()V
        //   659: aload           21
        //   661: sipush          27828
        //   664: sipush          28338
        //   667: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   670: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   673: aload_2        
        //   674: ifnull          722
        //   677: ifeq            821
        //   680: goto            687
        //   683: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   686: athrow         
        //   687: aload           21
        //   689: sipush          27828
        //   692: sipush          28338
        //   695: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   698: aload_2        
        //   699: ifnull          743
        //   702: goto            709
        //   705: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   708: athrow         
        //   709: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   712: invokevirtual   com/google/gson/JsonElement.isJsonArray:()Z
        //   715: goto            722
        //   718: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   721: athrow         
        //   722: ifeq            821
        //   725: aload           21
        //   727: sipush          27828
        //   730: sipush          28338
        //   733: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   736: goto            743
        //   739: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   742: athrow         
        //   743: invokevirtual   com/google/gson/JsonObject.getAsJsonArray:(Ljava/lang/String;)Lcom/google/gson/JsonArray;
        //   746: astore          22
        //   748: aload           22
        //   750: invokevirtual   com/google/gson/JsonArray.iterator:()Ljava/util/Iterator;
        //   753: astore          23
        //   755: aload           23
        //   757: invokeinterface java/util/Iterator.hasNext:()Z
        //   762: ifeq            821
        //   765: aload           23
        //   767: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   772: checkcast       Lcom/google/gson/JsonElement;
        //   775: astore          24
        //   777: aload           24
        //   779: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   782: astore          25
        //   784: aload           25
        //   786: invokestatic    net/minecraft/class_2960.method_60654:(Ljava/lang/String;)Lnet/minecraft/class_2960;
        //   789: astore          26
        //   791: getstatic       net/minecraft/class_7924.field_41265:Lnet/minecraft/class_5321;
        //   794: aload           26
        //   796: invokestatic    net/minecraft/class_5321.method_29179:(Lnet/minecraft/class_5321;Lnet/minecraft/class_2960;)Lnet/minecraft/class_5321;
        //   799: astore          27
        //   801: aload           15
        //   803: aload           27
        //   805: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.setClass_5321:(Lnet/minecraft/class_5321;)V
        //   808: aload_2        
        //   809: ifnull          1538
        //   812: goto            817
        //   815: astore          25
        //   817: aload_2        
        //   818: ifnonnull       755
        //   821: new             Ljava/util/ArrayList;
        //   824: dup            
        //   825: invokespecial   java/util/ArrayList.<init>:()V
        //   828: astore          22
        //   830: aload           21
        //   832: sipush          27792
        //   835: sipush          1682
        //   838: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   841: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //   844: aload_2        
        //   845: ifnull          1034
        //   848: ifeq            1020
        //   851: goto            858
        //   854: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   857: athrow         
        //   858: aload           21
        //   860: sipush          27792
        //   863: sipush          1682
        //   866: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   869: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //   872: invokevirtual   com/google/gson/JsonElement.isJsonArray:()Z
        //   875: aload_2        
        //   876: ifnull          1034
        //   879: goto            886
        //   882: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   885: athrow         
        //   886: ifeq            1020
        //   889: goto            896
        //   892: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   895: athrow         
        //   896: aload           21
        //   898: sipush          27792
        //   901: sipush          1682
        //   904: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   907: invokevirtual   com/google/gson/JsonObject.getAsJsonArray:(Ljava/lang/String;)Lcom/google/gson/JsonArray;
        //   910: astore          23
        //   912: aload           23
        //   914: invokevirtual   com/google/gson/JsonArray.iterator:()Ljava/util/Iterator;
        //   917: astore          24
        //   919: aload           24
        //   921: invokeinterface java/util/Iterator.hasNext:()Z
        //   926: ifeq            1020
        //   929: aload           24
        //   931: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   936: checkcast       Lcom/google/gson/JsonElement;
        //   939: astore          25
        //   941: aload           25
        //   943: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //   946: astore          26
        //   948: aload           26
        //   950: aload_2        
        //   951: ifnull          34
        //   954: aload_2        
        //   955: ifnull          970
        //   958: ifnull          1011
        //   961: goto            968
        //   964: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   967: athrow         
        //   968: aload           26
        //   970: invokevirtual   java/lang/String.isEmpty:()Z
        //   973: aload_2        
        //   974: ifnull          1010
        //   977: ifne            1011
        //   980: goto            987
        //   983: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   986: athrow         
        //   987: aload           15
        //   989: aload           26
        //   991: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.setString:(Ljava/lang/String;)V
        //   994: aload           22
        //   996: aload           26
        //   998: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1003: goto            1010
        //  1006: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1009: athrow         
        //  1010: pop            
        //  1011: goto            1016
        //  1014: astore          26
        //  1016: aload_2        
        //  1017: ifnonnull       919
        //  1020: aload           21
        //  1022: sipush          27796
        //  1025: sipush          -16279
        //  1028: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //  1031: invokevirtual   com/google/gson/JsonObject.has:(Ljava/lang/String;)Z
        //  1034: aload_2        
        //  1035: ifnull          1502
        //  1038: ifeq            1488
        //  1041: goto            1048
        //  1044: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1047: athrow         
        //  1048: aload           21
        //  1050: sipush          27796
        //  1053: sipush          -16279
        //  1056: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //  1059: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //  1062: invokevirtual   com/google/gson/JsonElement.isJsonObject:()Z
        //  1065: aload_2        
        //  1066: ifnull          1502
        //  1069: goto            1076
        //  1072: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1075: athrow         
        //  1076: ifeq            1488
        //  1079: goto            1086
        //  1082: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1085: athrow         
        //  1086: aload           21
        //  1088: sipush          27796
        //  1091: sipush          -16279
        //  1094: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //  1097: invokevirtual   com/google/gson/JsonObject.getAsJsonObject:(Ljava/lang/String;)Lcom/google/gson/JsonObject;
        //  1100: astore          23
        //  1102: aload           23
        //  1104: invokevirtual   com/google/gson/JsonObject.keySet:()Ljava/util/Set;
        //  1107: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1112: astore          24
        //  1114: aload           24
        //  1116: invokeinterface java/util/Iterator.hasNext:()Z
        //  1121: ifeq            1484
        //  1124: aload           24
        //  1126: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1131: checkcast       Ljava/lang/String;
        //  1134: astore          25
        //  1136: aload           23
        //  1138: aload           25
        //  1140: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //  1143: astore          26
        //  1145: aload           26
        //  1147: invokevirtual   com/google/gson/JsonElement.isJsonArray:()Z
        //  1150: aload_2        
        //  1151: ifnull          92
        //  1154: aload_2        
        //  1155: ifnull          1351
        //  1158: ifeq            1339
        //  1161: goto            1168
        //  1164: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1167: athrow         
        //  1168: new             Ljava/util/ArrayList;
        //  1171: dup            
        //  1172: invokespecial   java/util/ArrayList.<init>:()V
        //  1175: astore          27
        //  1177: aload           26
        //  1179: invokevirtual   com/google/gson/JsonElement.getAsJsonArray:()Lcom/google/gson/JsonArray;
        //  1182: invokevirtual   com/google/gson/JsonArray.iterator:()Ljava/util/Iterator;
        //  1185: astore          28
        //  1187: aload           28
        //  1189: invokeinterface java/util/Iterator.hasNext:()Z
        //  1194: ifeq            1235
        //  1197: aload           28
        //  1199: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1204: checkcast       Lcom/google/gson/JsonElement;
        //  1207: astore          29
        //  1209: aload           27
        //  1211: aload           29
        //  1213: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //  1216: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1221: pop            
        //  1222: aload_2        
        //  1223: ifnull          1244
        //  1226: goto            1231
        //  1229: astore          30
        //  1231: aload_2        
        //  1232: ifnonnull       1187
        //  1235: aload           15
        //  1237: aload           25
        //  1239: aload           27
        //  1241: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.setStringAndObject:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1244: sipush          27835
        //  1247: sipush          -6590
        //  1250: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //  1253: aload           25
        //  1255: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1258: ifeq            1335
        //  1261: aload           27
        //  1263: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1268: astore          28
        //  1270: aload           28
        //  1272: invokeinterface java/util/Iterator.hasNext:()Z
        //  1277: ifeq            1335
        //  1280: aload           28
        //  1282: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1287: checkcast       Ljava/lang/String;
        //  1290: astore          29
        //  1292: aload           15
        //  1294: aload           29
        //  1296: aload_2        
        //  1297: ifnull          1328
        //  1300: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.checkString:(Ljava/lang/String;)Z
        //  1303: aload_2        
        //  1304: ifnull          1121
        //  1307: goto            1314
        //  1310: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1313: athrow         
        //  1314: ifne            1331
        //  1317: aload           15
        //  1319: aload           29
        //  1321: goto            1328
        //  1324: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1327: athrow         
        //  1328: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.setString:(Ljava/lang/String;)V
        //  1331: aload_2        
        //  1332: ifnonnull       1270
        //  1335: aload_2        
        //  1336: ifnonnull       1480
        //  1339: aload           26
        //  1341: invokevirtual   com/google/gson/JsonElement.isJsonPrimitive:()Z
        //  1344: goto            1351
        //  1347: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1350: athrow         
        //  1351: aload_2        
        //  1352: ifnull          1380
        //  1355: ifeq            1480
        //  1358: goto            1365
        //  1361: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1364: athrow         
        //  1365: aload           26
        //  1367: invokevirtual   com/google/gson/JsonElement.getAsJsonPrimitive:()Lcom/google/gson/JsonPrimitive;
        //  1370: invokevirtual   com/google/gson/JsonPrimitive.isBoolean:()Z
        //  1373: goto            1380
        //  1376: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1379: athrow         
        //  1380: aload_2        
        //  1381: ifnull          1435
        //  1384: ifeq            1420
        //  1387: goto            1394
        //  1390: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1393: athrow         
        //  1394: aload           15
        //  1396: aload           25
        //  1398: aload           26
        //  1400: invokevirtual   com/google/gson/JsonElement.getAsBoolean:()Z
        //  1403: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1406: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.setStringAndObject:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1409: aload_2        
        //  1410: ifnonnull       1480
        //  1413: goto            1420
        //  1416: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1419: athrow         
        //  1420: aload           26
        //  1422: invokevirtual   com/google/gson/JsonElement.getAsJsonPrimitive:()Lcom/google/gson/JsonPrimitive;
        //  1425: invokevirtual   com/google/gson/JsonPrimitive.isNumber:()Z
        //  1428: goto            1435
        //  1431: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1434: athrow         
        //  1435: ifeq            1461
        //  1438: aload           15
        //  1440: aload           25
        //  1442: aload           26
        //  1444: invokevirtual   com/google/gson/JsonElement.getAsNumber:()Ljava/lang/Number;
        //  1447: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.setStringAndObject:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1450: aload_2        
        //  1451: ifnonnull       1480
        //  1454: goto            1461
        //  1457: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1460: athrow         
        //  1461: aload           15
        //  1463: aload           25
        //  1465: aload           26
        //  1467: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //  1470: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.setStringAndObject:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1473: goto            1480
        //  1476: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1479: athrow         
        //  1480: aload_2        
        //  1481: ifnonnull       1114
        //  1484: aload_2        
        //  1485: ifnonnull       1528
        //  1488: aload           22
        //  1490: invokeinterface java/util/List.isEmpty:()Z
        //  1495: goto            1502
        //  1498: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1501: athrow         
        //  1502: ifne            1528
        //  1505: aload           15
        //  1507: sipush          27835
        //  1510: sipush          -6590
        //  1513: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //  1516: aload           22
        //  1518: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.setStringAndObject:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1521: goto            1528
        //  1524: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1527: athrow         
        //  1528: aload           15
        //  1530: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_11.execute_1:()V
        //  1533: goto            1538
        //  1536: astore          23
        //  1538: aload_2        
        //  1539: ifnonnull       2018
        //  1542: aload           8
        //  1544: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_7;
        //  1547: goto            1554
        //  1550: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1553: athrow         
        //  1554: aload_2        
        //  1555: ifnull          1650
        //  1558: ifeq            1638
        //  1561: goto            1568
        //  1564: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1567: athrow         
        //  1568: aload           8
        //  1570: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_7;
        //  1573: astore          16
        //  1575: aload_2        
        //  1576: ifnull          1634
        //  1579: aload           8
        //  1581: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //  1584: sipush          27831
        //  1587: sipush          -5783
        //  1590: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //  1593: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1596: ifne            2018
        //  1599: goto            1606
        //  1602: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1605: athrow         
        //  1606: aload           16
        //  1608: aload           6
        //  1610: aload           8
        //  1612: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //  1615: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //  1618: invokevirtual   com/google/gson/JsonElement.getAsInt:()I
        //  1621: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1624: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_7.setObject:(Ljava/lang/Object;)V
        //  1627: goto            1634
        //  1630: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1633: athrow         
        //  1634: aload_2        
        //  1635: ifnonnull       2018
        //  1638: aload           8
        //  1640: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_4;
        //  1643: goto            1650
        //  1646: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1649: athrow         
        //  1650: aload_2        
        //  1651: ifnull          1798
        //  1654: ifeq            1786
        //  1657: goto            1664
        //  1660: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1663: athrow         
        //  1664: aload           8
        //  1666: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_4;
        //  1669: astore          17
        //  1671: aload           6
        //  1673: aload           8
        //  1675: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //  1678: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //  1681: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //  1684: astore          20
        //  1686: aload           20
        //  1688: iconst_0       
        //  1689: aload           20
        //  1691: invokevirtual   java/lang/String.length:()I
        //  1694: bipush          7
        //  1696: invokestatic    java/lang/Math.min:(II)I
        //  1699: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1702: invokestatic    java/awt/Color.decode:(Ljava/lang/String;)Ljava/awt/Color;
        //  1705: astore          21
        //  1707: aload_2        
        //  1708: ifnull          1777
        //  1711: aload           20
        //  1713: invokevirtual   java/lang/String.length:()I
        //  1716: bipush          9
        //  1718: if_icmplt       1770
        //  1721: goto            1728
        //  1724: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1727: athrow         
        //  1728: aload           20
        //  1730: bipush          7
        //  1732: bipush          9
        //  1734: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1737: bipush          16
        //  1739: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;I)I
        //  1742: istore          22
        //  1744: new             Ljava/awt/Color;
        //  1747: dup            
        //  1748: aload           21
        //  1750: invokevirtual   java/awt/Color.getRed:()I
        //  1753: aload           21
        //  1755: invokevirtual   java/awt/Color.getGreen:()I
        //  1758: aload           21
        //  1760: invokevirtual   java/awt/Color.getBlue:()I
        //  1763: iload           22
        //  1765: invokespecial   java/awt/Color.<init>:(IIII)V
        //  1768: astore          21
        //  1770: aload           17
        //  1772: aload           21
        //  1774: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_4.setColor:(Ljava/awt/Color;)V
        //  1777: goto            1782
        //  1780: astore          21
        //  1782: aload_2        
        //  1783: ifnonnull       2018
        //  1786: aload           8
        //  1788: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5;
        //  1791: goto            1798
        //  1794: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1797: athrow         
        //  1798: aload_2        
        //  1799: ifnull          1947
        //  1802: ifeq            1924
        //  1805: goto            1812
        //  1808: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1811: athrow         
        //  1812: aload           8
        //  1814: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5;
        //  1817: astore          18
        //  1819: aload           6
        //  1821: aload           8
        //  1823: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //  1826: invokevirtual   com/google/gson/JsonObject.getAsJsonArray:(Ljava/lang/String;)Lcom/google/gson/JsonArray;
        //  1829: astore          20
        //  1831: aload           18
        //  1833: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5.execute:()V
        //  1836: iconst_0       
        //  1837: istore          21
        //  1839: iload           21
        //  1841: aload           20
        //  1843: invokevirtual   com/google/gson/JsonArray.size:()I
        //  1846: if_icmpge       1920
        //  1849: aload           20
        //  1851: iload           21
        //  1853: invokevirtual   com/google/gson/JsonArray.get:(I)Lcom/google/gson/JsonElement;
        //  1856: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //  1859: astore          22
        //  1861: aload_2        
        //  1862: ifnull          1916
        //  1865: aload           22
        //  1867: aload_2        
        //  1868: ifnull          34
        //  1871: goto            1878
        //  1874: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1877: athrow         
        //  1878: ifnull          1913
        //  1881: aload           22
        //  1883: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //  1886: invokevirtual   java/lang/String.isEmpty:()Z
        //  1889: ifne            1913
        //  1892: goto            1899
        //  1895: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1898: athrow         
        //  1899: aload           18
        //  1901: aload           22
        //  1903: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_5.setString:(Ljava/lang/String;)V
        //  1906: goto            1913
        //  1909: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1912: athrow         
        //  1913: iinc            21, 1
        //  1916: aload_2        
        //  1917: ifnonnull       1839
        //  1920: aload_2        
        //  1921: ifnonnull       2018
        //  1924: aload           8
        //  1926: aload_2        
        //  1927: ifnull          1952
        //  1930: goto            1937
        //  1933: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1936: athrow         
        //  1937: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_13;
        //  1940: goto            1947
        //  1943: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  1946: athrow         
        //  1947: ifeq            2018
        //  1950: aload           8
        //  1952: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_13;
        //  1955: astore          19
        //  1957: aload           6
        //  1959: aload           8
        //  1961: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //  1964: invokevirtual   com/google/gson/JsonObject.get:(Ljava/lang/String;)Lcom/google/gson/JsonElement;
        //  1967: invokevirtual   com/google/gson/JsonElement.getAsString:()Ljava/lang/String;
        //  1970: astore          20
        //  1972: aload           20
        //  1974: invokestatic    net/minecraft/class_2960.method_60654:(Ljava/lang/String;)Lnet/minecraft/class_2960;
        //  1977: astore          21
        //  1979: getstatic       net/minecraft/class_7923.field_41178:Lnet/minecraft/class_7922;
        //  1982: aload           21
        //  1984: invokeinterface net/minecraft/class_7922.method_63535:(Lnet/minecraft/class_2960;)Ljava/lang/Object;
        //  1989: checkcast       Lnet/minecraft/class_1792;
        //  1992: astore          22
        //  1994: aload           22
        //  1996: ifnull          2013
        //  1999: aload           19
        //  2001: aload           22
        //  2003: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_13.setObject:(Ljava/lang/Object;)V
        //  2006: goto            2013
        //  2009: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //  2012: athrow         
        //  2013: goto            2018
        //  2016: astore          21
        //  2018: goto            2023
        //  2021: astore          9
        //  2023: aload_2        
        //  2024: ifnonnull       85
        //  2027: aload_2        
        //  2028: ifnonnull       17
        //  2031: return         
        //    StackMapTable: 00 B3 FE 00 11 07 01 9A 00 07 00 9B 46 01 49 07 00 04 FF 00 17 00 06 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 00 01 07 00 38 03 FF 00 05 00 06 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 00 02 07 00 40 07 00 C5 FD 00 10 07 00 40 07 00 9B 46 01 FF 00 26 00 09 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 01 07 00 38 03 02 44 01 49 07 00 38 03 2A 44 01 49 07 00 38 03 1F 47 07 00 38 43 01 49 07 00 38 03 1F 47 07 00 38 43 01 49 07 00 38 03 1C 47 07 00 38 43 01 49 07 00 38 03 1F 47 07 00 38 43 01 49 07 00 38 03 1C 47 07 00 38 43 01 49 07 00 38 03 FF 00 21 00 15 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 00 01 07 00 38 03 FD 00 17 07 01 4E 07 00 9B FF 00 3B 00 19 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 01 4E 07 00 9B 07 00 84 07 00 C5 00 01 07 00 38 FC 00 01 07 00 04 F8 00 03 FF 00 02 00 15 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 00 01 07 00 38 05 44 07 00 38 43 07 00 84 FF 00 21 00 16 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 00 01 07 00 38 03 51 07 00 38 FF 00 03 00 16 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 00 02 07 00 40 07 00 C5 48 07 00 38 43 01 50 07 00 38 FF 00 03 00 16 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 00 02 07 00 40 07 00 C5 FD 00 0B 07 01 4E 07 00 9B FF 00 3B 00 19 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 07 01 4E 07 00 9B 07 00 84 00 01 07 00 38 FC 00 01 07 01 D4 FF 00 03 00 16 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 00 00 FF 00 20 00 17 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 07 01 D6 00 01 07 00 38 03 57 07 00 38 43 01 45 07 00 38 03 FD 00 16 07 01 4E 07 00 9B FF 00 2C 00 1B 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 07 01 D6 07 01 4E 07 00 9B 07 00 84 07 00 C5 00 01 07 00 38 03 41 07 00 C5 4C 07 00 38 03 52 07 00 38 43 01 00 FF 00 02 00 1A 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 07 01 D6 07 01 4E 07 00 9B 07 00 84 00 01 07 00 38 FC 00 01 07 01 D4 FF 00 03 00 17 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 07 01 D6 00 00 4D 01 49 07 00 38 03 57 07 00 38 43 01 45 07 00 38 03 FD 00 1B 07 00 40 07 00 9B 46 01 FF 00 2A 00 1B 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 07 01 D6 07 00 40 07 00 9B 07 00 C5 07 00 84 00 01 07 00 38 03 FD 00 12 07 01 D6 07 00 9B FF 00 29 00 1E 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 07 01 D6 07 00 40 07 00 9B 07 00 C5 07 00 84 07 01 D6 07 00 9B 07 00 84 00 01 07 00 38 01 FA 00 03 08 19 FF 00 27 00 1E 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 07 01 D6 07 00 40 07 00 9B 07 00 C5 07 00 84 07 01 D6 07 00 9B 07 00 C5 00 01 07 00 38 43 01 49 07 00 38 FF 00 03 00 1E 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 40 07 01 D6 07 00 40 07 00 9B 07 00 C5 07 00 84 07 01 D6 07 00 9B 07 00 C5 00 02 07 01 4C 07 00 C5 02 FA 00 03 F9 00 03 47 07 00 38 43 01 49 07 00 38 03 4A 07 00 38 43 01 49 07 00 38 03 55 07 00 38 03 4A 07 00 38 43 01 55 07 00 38 03 4E 07 00 38 03 F9 00 03 F9 00 03 49 07 00 38 43 01 55 07 00 38 03 47 07 00 38 FF 00 01 00 16 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 07 01 4C 00 00 00 00 07 00 84 07 00 04 00 00 FF 00 03 00 09 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 47 07 00 38 43 01 49 07 00 38 03 FF 00 21 00 11 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 00 07 01 64 00 01 07 00 38 03 57 07 00 38 03 FF 00 03 00 09 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 47 07 00 38 43 01 49 07 00 38 03 FF 00 3B 00 16 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 00 00 07 01 67 00 00 07 00 C5 07 01 6D 00 01 07 00 38 03 29 06 FF 00 02 00 15 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 00 00 07 01 67 00 00 07 00 C5 00 01 07 00 38 FC 00 01 07 01 D4 FF 00 03 00 09 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 47 07 00 38 43 01 49 07 00 38 03 FF 00 1A 00 16 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 00 00 00 07 01 7F 00 07 01 4E 01 00 00 FF 00 22 00 17 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 00 00 00 07 01 7F 00 07 01 4E 01 07 00 C5 00 01 07 00 38 43 07 00 C5 50 07 00 38 03 49 07 00 38 03 02 FA 00 03 FF 00 03 00 09 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 48 07 00 38 43 07 01 35 45 07 00 38 43 01 44 07 01 35 FF 00 38 00 17 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 00 00 00 00 07 01 82 07 00 C5 07 01 58 07 01 85 00 01 07 00 38 03 FF 00 02 00 15 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 00 00 00 00 00 00 00 00 07 01 82 07 00 C5 00 01 07 00 38 FF 00 01 00 09 07 00 02 07 00 40 07 01 9A 00 07 00 9B 07 00 A3 07 00 40 07 00 9B 07 01 35 00 00 42 07 00 38 01 FA 00 03 F8 00 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  522    534    537    541    Ljava/lang/Exception;
        //  489    496    499    503    Ljava/lang/Exception;
        //  455    482    485    489    Ljava/lang/Exception;
        //  434    441    444    448    Ljava/lang/Exception;
        //  397    427    430    434    Ljava/lang/Exception;
        //  376    383    386    390    Ljava/lang/Exception;
        //  342    369    372    376    Ljava/lang/Exception;
        //  321    328    331    335    Ljava/lang/Exception;
        //  284    314    317    321    Ljava/lang/Exception;
        //  263    270    273    277    Ljava/lang/Exception;
        //  226    256    259    263    Ljava/lang/Exception;
        //  205    212    215    219    Ljava/lang/Exception;
        //  143    150    153    157    Ljava/lang/Exception;
        //  121    128    131    135    Ljava/lang/Exception;
        //  49     58     58     62     Ljava/lang/Exception;
        //  594    618    625    627    Ljava/lang/Exception;
        //  541    631    634    640    Ljava/lang/Exception;
        //  722    736    739    743    Ljava/lang/Exception;
        //  687    715    718    722    Ljava/lang/Exception;
        //  677    702    705    709    Ljava/lang/Exception;
        //  654    680    683    687    Ljava/lang/Exception;
        //  636    642    645    649    Ljava/lang/Exception;
        //  777    808    815    817    Ljava/lang/Exception;
        //  977    1003   1006   1010   Ljava/lang/Exception;
        //  970    980    983    987    Ljava/lang/Exception;
        //  954    961    964    968    Ljava/lang/Exception;
        //  858    889    892    896    Ljava/lang/Exception;
        //  848    879    882    886    Ljava/lang/Exception;
        //  830    851    854    858    Ljava/lang/Exception;
        //  941    1011   1014   1016   Ljava/lang/Exception;
        //  1154   1161   1164   1168   Ljava/lang/Exception;
        //  1048   1079   1082   1086   Ljava/lang/Exception;
        //  1038   1069   1072   1076   Ljava/lang/Exception;
        //  1034   1041   1044   1048   Ljava/lang/Exception;
        //  1209   1222   1229   1231   Ljava/lang/Exception;
        //  1502   1521   1524   1528   Ljava/lang/Exception;
        //  1484   1495   1498   1502   Ljava/lang/Exception;
        //  1438   1473   1476   1480   Ljava/lang/Exception;
        //  1435   1454   1457   1461   Ljava/lang/Exception;
        //  1394   1428   1431   1435   Ljava/lang/Exception;
        //  1384   1413   1416   1420   Ljava/lang/Exception;
        //  1380   1387   1390   1394   Ljava/lang/Exception;
        //  1355   1373   1376   1380   Ljava/lang/Exception;
        //  1351   1358   1361   1365   Ljava/lang/Exception;
        //  1335   1344   1347   1351   Ljava/lang/Exception;
        //  1314   1321   1324   1328   Ljava/lang/Exception;
        //  1292   1307   1310   1314   Ljava/lang/Exception;
        //  1528   1533   1536   1538   Ljava/lang/Exception;
        //  1707   1721   1724   1728   Ljava/lang/Exception;
        //  1650   1657   1660   1664   Ljava/lang/Exception;
        //  1634   1643   1646   1650   Ljava/lang/Exception;
        //  1579   1627   1630   1634   Ljava/lang/Exception;
        //  1575   1599   1602   1606   Ljava/lang/Exception;
        //  1554   1561   1564   1568   Ljava/lang/Exception;
        //  1538   1547   1550   1554   Ljava/lang/Exception;
        //  1686   1777   1780   1782   Ljava/lang/Exception;
        //  1994   2006   2009   2013   Ljava/lang/Exception;
        //  1924   1940   1943   1947   Ljava/lang/Exception;
        //  1920   1930   1933   1937   Ljava/lang/Exception;
        //  1881   1906   1909   1913   Ljava/lang/Exception;
        //  1878   1892   1895   1899   Ljava/lang/Exception;
        //  1861   1871   1874   1878   Ljava/lang/Exception;
        //  1798   1805   1808   1812   Ljava/lang/Exception;
        //  1782   1791   1794   1798   Ljava/lang/Exception;
        //  1972   2013   2016   2018   Ljava/lang/Exception;
        //  138    2018   2021   2023   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0687:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private JsonObject computeJsonobject(final Path path) {
        try {
            if (!Files.exists(path, new LinkOption[0])) {
                return null;
            }
        }
        catch (final Throwable t) {
            throw computeThrowable(t);
        }
        try (final FileReader fileReader = new FileReader(path.toFile())) {
            return JsonParser.parseReader((Reader)fileReader).getAsJsonObject();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public void setString_1(final String s) {
        if (this.jsonObject == null) {
            this.jsonObject = new JsonObject();
        }
        this.jsonObject.addProperty(createString(27780, 21164), s);
    }
    
    public String getString() {
        if (this.jsonObject != null && this.jsonObject.has(createString(27801, 32297)) && this.jsonObject.get(createString(27801, 32297)).isJsonPrimitive()) {
            return this.jsonObject.get(createString(27801, 32297)).getAsString();
        }
        return createString(27785, -5313);
    }
    
    public void execute_4() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.class310:Lnet/minecraft/class_310;
        //     7: getfield        net/minecraft/class_310.field_1697:Ljava/io/File;
        //    10: sipush          27778
        //    13: sipush          -19779
        //    16: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //    19: invokestatic    com/target/mod/compat/sub1/sub1/sub7/Initializer_21.computeString:(Ljava/lang/String;)Ljava/lang/String;
        //    22: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    25: astore_1       
        //    26: aload_1        
        //    27: invokevirtual   java/io/File.exists:()Z
        //    30: ifne            45
        //    33: aload_1        
        //    34: invokevirtual   java/io/File.mkdirs:()Z
        //    37: pop            
        //    38: goto            45
        //    41: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //    44: athrow         
        //    45: new             Ljava/io/File;
        //    48: dup            
        //    49: aload_1        
        //    50: sipush          27784
        //    53: sipush          20528
        //    56: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //    59: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    62: astore_2       
        //    63: new             Lcom/google/gson/JsonObject;
        //    66: dup            
        //    67: invokespecial   com/google/gson/JsonObject.<init>:()V
        //    70: astore_3       
        //    71: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //    74: sipush          27800
        //    77: sipush          -7926
        //    80: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //    83: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.computeCalcg:(Ljava/lang/String;)Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //    86: astore          4
        //    88: aload           4
        //    90: ifnull          274
        //    93: aload           4
        //    95: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.getList:()Ljava/util/List;
        //    98: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   103: astore          5
        //   105: aload           5
        //   107: invokeinterface java/util/Iterator.hasNext:()Z
        //   112: ifeq            274
        //   115: aload           5
        //   117: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   122: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA;
        //   125: astore          6
        //   127: aload           6
        //   129: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   132: ifeq            211
        //   135: aload           6
        //   137: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   140: astore          7
        //   142: aload           6
        //   144: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   147: astore          8
        //   149: aload           8
        //   151: sipush          27833
        //   154: sipush          9649
        //   157: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   160: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   163: ifne            190
        //   166: aload           8
        //   168: sipush          27803
        //   171: sipush          9621
        //   174: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   177: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   180: ifeq            211
        //   183: goto            190
        //   186: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   189: athrow         
        //   190: aload_3        
        //   191: aload           8
        //   193: aload           7
        //   195: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.getValue:()Ljava/lang/Object;
        //   198: checkcast       Ljava/lang/Number;
        //   201: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   204: goto            211
        //   207: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   210: athrow         
        //   211: aload           6
        //   213: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   216: ifeq            271
        //   219: aload           6
        //   221: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1;
        //   224: astore          7
        //   226: aload           6
        //   228: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   231: astore          8
        //   233: aload           8
        //   235: sipush          27829
        //   238: sipush          -28943
        //   241: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   244: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   247: ifeq            271
        //   250: aload_3        
        //   251: aload           8
        //   253: aload           7
        //   255: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub_1.getValue:()Ljava/lang/Object;
        //   258: checkcast       Ljava/lang/Boolean;
        //   261: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //   264: goto            271
        //   267: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   270: athrow         
        //   271: goto            105
        //   274: getstatic       com/target/mod/compat/sub1/sub1/sub1/Initializer_1.syncF:Lcom/target/mod/compat/sub1/sub1/sub1/Initializer_4;
        //   277: sipush          27786
        //   280: sipush          -1077
        //   283: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   286: invokevirtual   com/target/mod/compat/sub1/sub1/sub1/Initializer_4.computeCalcg:(Ljava/lang/String;)Lcom/target/mod/compat/sub1/sub1/sub5/AbstractLoadF;
        //   289: astore          5
        //   291: aload           5
        //   293: ifnull          468
        //   296: aload           5
        //   298: invokevirtual   com/target/mod/compat/sub1/sub1/sub5/AbstractLoadF.getList:()Ljava/util/List;
        //   301: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   306: astore          6
        //   308: aload           6
        //   310: invokeinterface java/util/Iterator.hasNext:()Z
        //   315: ifeq            468
        //   318: aload           6
        //   320: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   325: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA;
        //   328: astore          7
        //   330: aload           7
        //   332: instanceof      Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   335: ifeq            465
        //   338: aload           7
        //   340: checkcast       Lcom/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub;
        //   343: astore          8
        //   345: aload           7
        //   347: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/AbstractSyncA.getString:()Ljava/lang/String;
        //   350: astore          9
        //   352: aload           9
        //   354: ldc_w           "X"
        //   357: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   360: ifne            429
        //   363: aload           9
        //   365: ldc_w           "Y"
        //   368: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   371: ifne            429
        //   374: goto            381
        //   377: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   380: athrow         
        //   381: aload           9
        //   383: sipush          27806
        //   386: sipush          24729
        //   389: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   392: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   395: ifne            429
        //   398: goto            405
        //   401: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   404: athrow         
        //   405: aload           9
        //   407: sipush          27832
        //   410: sipush          -18313
        //   413: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   416: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   419: ifeq            465
        //   422: goto            429
        //   425: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   428: athrow         
        //   429: aload_3        
        //   430: aload           9
        //   432: sipush          27795
        //   435: sipush          -32021
        //   438: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.createString:(II)Ljava/lang/String;
        //   441: swap           
        //   442: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   447: aload           8
        //   449: invokevirtual   com/target/mod/compat/sub1/sub1/sub3/sub3/RenderASub.getValue:()Ljava/lang/Object;
        //   452: checkcast       Ljava/lang/Number;
        //   455: invokevirtual   com/google/gson/JsonObject.addProperty:(Ljava/lang/String;Ljava/lang/Number;)V
        //   458: goto            465
        //   461: invokestatic    com/target/mod/compat/sub1/sub1/sub1/Initializer_3.computeThrowable:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   464: athrow         
        //   465: goto            308
        //   468: new             Ljava/io/FileWriter;
        //   471: dup            
        //   472: aload_2        
        //   473: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;)V
        //   476: astore          6
        //   478: new             Lcom/google/gson/GsonBuilder;
        //   481: dup            
        //   482: invokespecial   com/google/gson/GsonBuilder.<init>:()V
        //   485: invokevirtual   com/google/gson/GsonBuilder.setPrettyPrinting:()Lcom/google/gson/GsonBuilder;
        //   488: invokevirtual   com/google/gson/GsonBuilder.create:()Lcom/google/gson/Gson;
        //   491: astore          7
        //   493: aload           7
        //   495: aload_3        
        //   496: aload           6
        //   498: invokevirtual   com/google/gson/Gson.toJson:(Lcom/google/gson/JsonElement;Ljava/lang/Appendable;)V
        //   501: aload           6
        //   503: invokevirtual   java/io/FileWriter.close:()V
        //   506: goto            531
        //   509: astore          7
        //   511: aload           6
        //   513: invokevirtual   java/io/FileWriter.close:()V
        //   516: goto            528
        //   519: astore          8
        //   521: aload           7
        //   523: aload           8
        //   525: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   528: aload           7
        //   530: athrow         
        //   531: goto            535
        //   534: astore_1       
        //   535: return         
        //    StackMapTable: 00 1A FF 00 29 00 02 07 00 02 07 00 18 00 01 07 00 E0 03 FF 00 3B 00 06 07 00 02 07 00 18 07 00 18 07 00 40 07 00 A3 07 00 9B 00 00 FF 00 50 00 09 07 00 02 07 00 18 07 00 18 07 00 40 07 00 A3 07 00 9B 07 01 35 07 01 38 07 00 C5 00 01 07 00 E0 03 50 07 00 E0 F9 00 03 FF 00 37 00 09 07 00 02 07 00 18 07 00 18 07 00 40 07 00 A3 07 00 9B 07 01 35 07 00 61 07 00 C5 00 01 07 00 E0 F9 00 03 F9 00 02 FD 00 21 07 00 A3 07 00 9B FF 00 44 00 0A 07 00 02 07 00 18 07 00 18 07 00 40 07 00 A3 07 00 A3 07 00 9B 07 01 35 07 01 38 07 00 C5 00 01 07 00 E0 03 53 07 00 E0 03 53 07 00 E0 03 5F 07 00 E0 F9 00 03 F9 00 02 FF 00 28 00 07 07 00 02 07 00 18 07 00 18 07 00 40 07 00 A3 07 00 A3 07 00 E8 00 01 07 00 E0 FF 00 09 00 08 07 00 02 07 00 18 07 00 18 07 00 40 07 00 A3 07 00 A3 07 00 E8 07 00 E0 00 01 07 00 E0 08 FF 00 02 00 08 07 00 02 07 00 18 07 00 18 07 00 40 07 00 A3 07 00 A3 07 00 E8 07 00 F8 00 00 FF 00 02 00 01 07 00 02 00 01 07 00 38 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  405    458    461    465    Ljava/lang/Throwable;
        //  381    422    425    429    Ljava/lang/Throwable;
        //  363    398    401    405    Ljava/lang/Throwable;
        //  352    374    377    381    Ljava/lang/Throwable;
        //  233    264    267    271    Ljava/lang/Throwable;
        //  166    204    207    211    Ljava/lang/Throwable;
        //  149    183    186    190    Ljava/lang/Throwable;
        //  26     38     41     45     Ljava/lang/Throwable;
        //  478    501    509    531    Ljava/lang/Throwable;
        //  511    516    519    528    Ljava/lang/Throwable;
        //  0      531    534    535    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0381:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void execute_5() {
        try {
            final File file = new File(new File(Initializer_1.class310.field_1697, Initializer_21.computeString(createString(27830, 9990))), createString(27787, 29288));
            if (!file.exists()) {
                return;
            }
            final JsonObject computeJsonobject = this.computeJsonobject(file.toPath());
            if (computeJsonobject == null) {
                return;
            }
            final AbstractLoadF computeCalcg = Initializer_1.syncF.computeCalcg(createString(27804, 6649));
            if (computeCalcg != null) {
                for (final AbstractSyncA abstractSyncA : computeCalcg.getList()) {
                    final String string = abstractSyncA.getString();
                    Label_0177: {
                        try {
                            if (!computeJsonobject.has(string)) {
                                continue;
                            }
                            if (!(abstractSyncA instanceof RenderASub)) {
                                break Label_0177;
                            }
                        }
                        catch (final Exception ex) {
                            throw computeThrowable(ex);
                        }
                        ((RenderASub)abstractSyncA).setObject();
                    }
                    if (abstractSyncA instanceof final RenderASub_1 renderASub_1) {
                        renderASub_1.setObject(computeJsonobject.get(string).getAsBoolean());
                    }
                }
            }
            final AbstractLoadF computeCalcg2 = Initializer_1.syncF.computeCalcg(createString(27798, -22719));
            if (computeCalcg2 != null) {
                for (AbstractSyncA abstractSyncA2 : computeCalcg2.getList()) {
                    final String s = createString(27791, -9490) + abstractSyncA2.getString();
                    try {
                        if (!computeJsonobject.has(s) || !(abstractSyncA2 instanceof RenderASub)) {
                            continue;
                        }
                    }
                    catch (final Exception ex2) {
                        throw computeThrowable(ex2);
                    }
                    ((RenderASub)abstractSyncA2).setObject();
                }
            }
        }
        catch (final Exception ex3) {}
    }
    
    private static Throwable computeThrowable(final Throwable t) {
        return t;
    }
    
    static {
        final String[] strArr2 = new String[45];
        int n = 0;
        String s;
        int n2 = (s = """
                      §°o\u0083c6\u00eb\u0088\u0018\u00c1)\u00fa¨\u00f2m¥_\u0015\u00dd\u008f \u0095\u0016\u00c8\u00c9\u00f2\u008c\u00ff\u009f\u0000\u0094\u0010\u00f1\u0007y\u00938¤¬\u00ef\u0096\f\u0084l£\f\u00d2P\u00ea]\u00ec0\u0098\u00c0\b\u00d6\u001a\u00dd\u00ca
                      °LV\u0007\u0081\u00e8\u00d8\u0097\u000bw\u00d0\u000b\u00f0\u0011-£\u0003¥\u00d0\u00e3«\u00e7p\b\u00ec¾Q]:.\u00f6y\u0003½\u00f8\u0001\r\u0094T\u00c3 a\u00fe\u00e7\u001f\r\u00fc\u00d2\u001aY\u0011 \u00d7\u00c0hy\u0099\u00f9\u00ecX\u007fms&®\u00efO\u0000\u0002\u0005\u0083\u0003F\u0014~\r\u0018\u009d\u00f5v[\u00c6\u009es±y\u00f1(w
                      º3\u00cd¬\u00ff}\u00fb\u00e9\u00f4u\u000b®\u0000\u00d9\u0006fx»\u007f\u00e4(\u00e6\fgD\u001aM¦¡!\u0080H\u00ec\u0000n\b\u00da#\u0097\u00ee\u00e2X\u00ed·\fn7\u008b\u00eb,/\u009d\u00f1>(»~\b@S\u0093\u00ff\u00fc¹\u0018y\rd³\u00dd\u00dc¢a\u009f\u00ec\u0002\u00823\u00d5e\b\u001b\u00fe¹C\u008b9\u00c3\u009b\u0007\u00ed\u00fcªI\u00feR\u00dc\b\u00c3\u001d¢?\u00e8¶¯j\b\u00deNeD\u00f4\u00d5G¥\u0007mw\u0094cf\u008c\u00f6\u000b\u00ffh\u00cc\u008c?@W_[pn\bY3\u0095\u00eb\u00ea \u0084\u001b\b\u0082\u00d5W3[\u008ff±\u001b\u00d1	¼ZSH\u00da¤\u00d7l[D\u0086\u0095U\u0000H_\u009eD>^\u0095\u0010U\u009a\u00f7\u000b\u000b<m\u0081\u00f0\u0088ia¾\u00eb\u00ad\fe\u0016\u009fCU¹\u001a`\u00f2\u0097[4\u0004\u008b\u00f2+\u0098\u000b\u00ad\u0016g\u0007	\u00e8\u00da\u0090\u00ea\u00e9\u000f\u0007§\u009f\u0091\u00f6\u00d23K\u001a\u0084\u00ef\u0016\u0086\u0006\u00d3p\u00d7\u009d\f\u00f9\u0086&¨3m«40?-\u00f0\u00e4k
                      \u00da\u0007\u00e9\u00ddX¾\u00eb:l	\u0083\u00ea\u00829\u00c2$ADY\f\u00e8i[ 6V\u00de\u00deV\u00cd¶\u00c2\u0007\u00ea+µ\u00ef¦xe
                       3\u009e¬\u0095}¶\u00e9]t\u0002\u00fd~	§|\u0094(%«\u00ee\u00f1O""").length();
        int n3 = 8;
        int n4 = -1;
    Label_0024:
        while (true) {
            while (true) {
                int n8;
                int n7;
                int n6;
                int n5 = n6 = (n7 = (n8 = 59));
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
                                    case 0 -> 126;
                                    case 1 -> 17;
                                    case 2 -> 32;
                                    case 3 -> 95;
                                    case 4 -> 119;
                                    case 5 -> 114;
                                    default -> 35;
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
                            n2 = (s = "\u00f6k\u0001\u00fd\u0090\u00da\u00f4´\"½t1\u00f7)\u00993\u00c5\u00ce\u0004\u00cab#A\u001a\u000b\\\u0087D(p\u0010\u00e8\u0092±´y").length();
                            n3 = 24;
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
                    n5 = (n6 = (n7 = (n8 = 72)));
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
        strArr_1 = new String[45];
    }
    
    private static String createString(final int n, final int n2) {
        final int n3 = (n ^ 0x6C90) & 0xFFFF;
        if (Initializer_3.strArr_1[n3] == null) {
            final char[] charArray = Initializer_3.strArr[n3].toCharArray();
            final int n5 = switch (charArray[0] & '\u00ff') {
                case 0 -> 253;
                case 1 -> 196;
                case 2 -> 132;
                case 3 -> 174;
                case 4 -> 237;
                case 5 -> 17;
                case 6 -> 28;
                case 7 -> 0;
                case 8 -> 27;
                case 9 -> 189;
                case 10 -> 232;
                case 11 -> 51;
                case 12 -> 84;
                case 13 -> 122;
                case 14 -> 110;
                case 15 -> 120;
                case 16 -> 178;
                case 17 -> 58;
                case 18 -> 186;
                case 19 -> 97;
                case 20 -> 219;
                case 21 -> 251;
                case 22 -> 13;
                case 23 -> 57;
                case 24 -> 79;
                case 25 -> 30;
                case 26 -> 255;
                case 27 -> 105;
                case 28 -> 252;
                case 29 -> 156;
                case 30 -> 151;
                case 31 -> 162;
                case 32 -> 129;
                case 33 -> 102;
                case 34 -> 130;
                case 35 -> 199;
                case 36 -> 8;
                case 37 -> 63;
                case 38 -> 242;
                case 39 -> 173;
                case 40 -> 211;
                case 41 -> 75;
                case 42 -> 93;
                case 43 -> 86;
                case 44 -> 3;
                case 45 -> 154;
                case 46 -> 146;
                case 47 -> 215;
                case 48 -> 70;
                case 49 -> 1;
                case 50 -> 35;
                case 51 -> 220;
                case 52 -> 40;
                case 53 -> 16;
                case 54 -> 64;
                case 55 -> 47;
                case 56 -> 43;
                case 57 -> 44;
                case 58 -> 118;
                case 59 -> 230;
                case 60 -> 24;
                case 61 -> 45;
                case 62 -> 221;
                case 63 -> 175;
                case 64 -> 53;
                case 65 -> 238;
                case 66 -> 229;
                case 67 -> 247;
                case 68 -> 139;
                case 69 -> 176;
                case 70 -> 138;
                case 71 -> 77;
                case 72 -> 108;
                case 73 -> 76;
                case 74 -> 188;
                case 75 -> 148;
                case 76 -> 101;
                case 77 -> 177;
                case 78 -> 94;
                case 79 -> 140;
                case 80 -> 180;
                case 81 -> 114;
                case 82 -> 65;
                case 83 -> 82;
                case 84 -> 80;
                case 85 -> 74;
                case 86 -> 39;
                case 87 -> 185;
                case 88 -> 128;
                case 89 -> 106;
                case 90 -> 165;
                case 91 -> 33;
                case 92 -> 36;
                case 93 -> 200;
                case 94 -> 164;
                case 95 -> 99;
                case 96 -> 226;
                case 97 -> 145;
                case 98 -> 18;
                case 99 -> 210;
                case 100 -> 250;
                case 101 -> 66;
                case 102 -> 168;
                case 103 -> 29;
                case 104 -> 119;
                case 105 -> 98;
                case 106 -> 207;
                case 107 -> 121;
                case 108 -> 34;
                case 109 -> 103;
                case 110 -> 141;
                case 111 -> 41;
                case 112 -> 193;
                case 113 -> 239;
                case 114 -> 241;
                case 115 -> 209;
                case 116 -> 131;
                case 117 -> 26;
                case 118 -> 78;
                case 119 -> 89;
                case 120 -> 109;
                case 121 -> 225;
                case 122 -> 240;
                case 123 -> 163;
                case 124 -> 236;
                case 125 -> 62;
                case 126 -> 227;
                case 127 -> 198;
                case 128 -> 147;
                case 129 -> 149;
                case 130 -> 21;
                case 131 -> 155;
                case 132 -> 54;
                case 133 -> 59;
                case 134 -> 217;
                case 135 -> 83;
                case 136 -> 19;
                case 137 -> 125;
                case 138 -> 117;
                case 139 -> 68;
                case 140 -> 137;
                case 141 -> 52;
                case 142 -> 244;
                case 143 -> 113;
                case 144 -> 5;
                case 145 -> 23;
                case 146 -> 170;
                case 147 -> 107;
                case 148 -> 81;
                case 149 -> 20;
                case 150 -> 214;
                case 151 -> 195;
                case 152 -> 142;
                case 153 -> 46;
                case 154 -> 136;
                case 155 -> 69;
                case 156 -> 126;
                case 157 -> 167;
                case 158 -> 153;
                case 159 -> 6;
                case 160 -> 7;
                case 161 -> 31;
                case 162 -> 4;
                case 163 -> 96;
                case 164 -> 223;
                case 165 -> 166;
                case 166 -> 228;
                case 167 -> 124;
                case 168 -> 191;
                case 169 -> 104;
                case 170 -> 50;
                case 171 -> 135;
                case 172 -> 216;
                case 173 -> 37;
                case 174 -> 22;
                case 175 -> 133;
                case 176 -> 161;
                case 177 -> 72;
                case 178 -> 190;
                case 179 -> 88;
                case 180 -> 42;
                case 181 -> 73;
                case 182 -> 150;
                case 183 -> 92;
                case 184 -> 25;
                case 185 -> 91;
                case 186 -> 212;
                case 187 -> 205;
                case 188 -> 10;
                case 189 -> 181;
                case 190 -> 134;
                case 191 -> 202;
                case 192 -> 143;
                case 193 -> 95;
                case 194 -> 60;
                case 195 -> 206;
                case 196 -> 160;
                case 197 -> 169;
                case 198 -> 11;
                case 199 -> 171;
                case 200 -> 112;
                case 201 -> 235;
                case 202 -> 183;
                case 203 -> 246;
                case 204 -> 218;
                case 205 -> 179;
                case 206 -> 127;
                case 207 -> 100;
                case 208 -> 71;
                case 209 -> 115;
                case 210 -> 197;
                case 211 -> 248;
                case 212 -> 152;
                case 213 -> 67;
                case 214 -> 182;
                case 215 -> 123;
                case 216 -> 233;
                case 217 -> 222;
                case 218 -> 32;
                case 219 -> 204;
                case 220 -> 9;
                case 221 -> 55;
                case 222 -> 158;
                case 223 -> 224;
                case 224 -> 243;
                case 225 -> 194;
                case 226 -> 15;
                case 227 -> 172;
                case 228 -> 14;
                case 229 -> 49;
                case 230 -> 111;
                case 231 -> 2;
                case 232 -> 254;
                case 233 -> 85;
                case 234 -> 87;
                case 235 -> 245;
                case 236 -> 249;
                case 237 -> 213;
                case 238 -> 48;
                case 239 -> 184;
                case 240 -> 116;
                case 241 -> 144;
                case 242 -> 157;
                case 243 -> 159;
                case 244 -> 192;
                case 245 -> 12;
                case 246 -> 231;
                case 247 -> 61;
                case 248 -> 90;
                case 249 -> 187;
                case 250 -> 38;
                case 251 -> 201;
                case 252 -> 208;
                case 253 -> 56;
                case 254 -> 203;
                default -> 234;
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
            Initializer_3.strArr_1[n3] = new String(charArray).intern();
        }
        return Initializer_3.strArr_1[n3];
    }
}
