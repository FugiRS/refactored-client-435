package com.jagex.runescape;

import com.jagex.runescape.cache.Cache;
import com.jagex.runescape.cache.def.VarbitDefinition;
import com.jagex.runescape.cache.media.Widget.Widget;
import com.jagex.runescape.io.Buffer;
import com.jagex.runescape.media.Rasterizer;
import com.jagex.runescape.scene.util.CollisionMap;
import com.jagex.runescape.util.Signlink;
import com.jagex.runescape.util.SignlinkNode;

import java.awt.*;

public abstract class ProducingGraphicsBuffer {
    public static Cache aClass9_1615 = new Cache(64);
    public static int anInt1618 = 0;
    public static int anInt1623 = 0;
    public static boolean[] aBooleanArray1629;
    public static int oneMouseButton = 0;
    public static ProducingGraphicsBuffer aProducingGraphicsBuffer_1631;
    public static SignlinkNode aSignlinkNode_1632;
    public static int anInt1634 = 0;
    public static int anInt1637 = 0;

    public int height;
    public int width;
    public int[] pixels;
    public Image image;

    public static void method1040(Component arg0, int arg1, Signlink arg2) {
        try {
            Class8_Sub1 class8_sub1 = new Class8_Sub1_Sub2();
            class8_sub1.method222(arg2, 2048);
            CollisionMap.aClass8_166 = class8_sub1;
        } catch (Throwable throwable) {
            try {
                CollisionMap.aClass8_166 = new Class8_Sub1_Sub1(arg2, arg0);
            } catch (Throwable throwable_0_) {
                if (arg1 <= Signlink.aString735.toLowerCase().indexOf("microsoft")) {
                    try {
                        CollisionMap.aClass8_166 = new Class8_Sub2();
                        return;
                    } catch (Throwable throwable_1_) {
                        /* empty */
                    }
                }
                CollisionMap.aClass8_166 = new Class8(8000);
            }
        }

    }


    public static boolean method1043(int arg0) {
        if (aBooleanArray1629[arg0])
            return true;
        if (!VarbitDefinition.aCacheIndex_2349.method186(123, arg0))
            return false;
        int i_4_ = VarbitDefinition.aCacheIndex_2349.method190(arg0);
        if (i_4_ == 0) {
            aBooleanArray1629[arg0] = true;
            return true;
        }
        if (Widget.interfaces[arg0] == null)
            Widget.interfaces[arg0] = new Widget[i_4_];
        for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
            if (Widget.interfaces[arg0][i_5_] == null) {
                byte[] is = VarbitDefinition.aCacheIndex_2349.getFile(i_5_, arg0);
                if (is != null) {
                    Widget.interfaces[arg0][i_5_] = new Widget();
                    Widget.interfaces[arg0][i_5_].id = (arg0 << 16) + i_5_;
                    if (is[0] == -1)
                        Widget.interfaces[arg0][i_5_].decodeIf3(new Buffer(is));
                    else
                        Widget.interfaces[arg0][i_5_].decodeIf1(new Buffer(is));
                }
            }
        }
        aBooleanArray1629[arg0] = true;
        return true;

    }

    public abstract void method1041(int i, int i_2_, Component component, int i_3_);

    public abstract void drawGraphics(int x, int y, Graphics graphics);
    public abstract void paintComponent(int x, int y, Graphics graphics);

    public void prepareRasterizer() {
        Rasterizer.prepare(pixels, width, height);
    }
}
