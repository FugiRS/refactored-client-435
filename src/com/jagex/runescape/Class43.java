package com.jagex.runescape;

import com.jagex.runescape.cache.def.ItemDefinition;
import com.jagex.runescape.cache.def.ActorDefinition;
import com.jagex.runescape.cache.media.IdentityKit;
import com.jagex.runescape.media.renderable.actor.Player;

import java.util.Date;

public class Class43 {
    public static Cache aClass9_1014 = new Cache(64);
    public static int anInt1015;
    public static int anInt1016;
    public static int anInt1018;
    public static RSString aClass1_1019;
    public static int cameraYawOffset = 0;
    public static RSString aClass1_1021 = RSString.CreateString("flash1:");
    public static Class45 aClass45_1022;
    public static int anInt1023;
    public static RSString aClass1_1024;
    public static int anInt1025;
    public static RSString aClass1_1026;
    public static RSString aClass1_1027;
    public static int openChatboxWidgetId;

    static {
        aClass1_1019 = aClass1_1021;
        aClass45_1022 = new Class45();
        aClass1_1024 = RSString.CreateString("backleft2");
        aClass1_1027 = RSString.CreateString(":");
        anInt1025 = 0;
        openChatboxWidgetId = -1;
        aClass1_1026 = RSString.CreateString("Schlie-8en");
    }

    public static void method890(long arg0, int arg1) {

        anInt1023++;
        if(arg0 > 0L) {
            int i = 81 / ((arg1 + 20) / 42);
            if(arg0 % 10L != 0L)
                ISAAC.method283(arg0, -103);
            else {
                ISAAC.method283(-1L + arg0, -110);
                ISAAC.method283(1L, -110);
            }
        }

    }

    public static void method891(Object[] arg0, int arg1, int arg2, Widget arg3, int arg4, boolean arg5) {

        anInt1015++;
        int i = 0;
        Class40_Sub5_Sub1 class40_sub5_sub1 = IdentityKit.method626(((Integer) arg0[0]).intValue(), 76, 27);
        int[] is = class40_sub5_sub1.anIntArray2262;
        int[] is_0_ = class40_sub5_sub1.anIntArray2272;
        int i_1_ = 0;
        int i_2_ = -1;
        int i_3_ = -1;
        try {
            SubNode.anIntArray2086 = new int[class40_sub5_sub1.anInt2271];
            Class51.aClass1Array1204 = new RSString[class40_sub5_sub1.anInt2267];
            int i_4_ = 0;
            int i_5_ = 0;
            if(arg5 != false)
                cameraYawOffset = -119;
            for(int i_6_ = 1; i_6_ < arg0.length; i_6_++) {
                if(!(arg0[i_6_] instanceof Integer)) {
                    if(arg0[i_6_] instanceof RSString)
                        Class51.aClass1Array1204[i_5_++] = (RSString) arg0[i_6_];
                } else {
                    int i_7_ = ((Integer) arg0[i_6_]).intValue();
                    if((i_7_ ^ 0xffffffff) == 2147483646)
                        i_7_ = arg4;
                    if(i_7_ == -2147483646)
                        i_7_ = arg2;
                    if(i_7_ == -2147483645)
                        i_7_ = arg3.anInt2689;
                    if(i_7_ == -2147483644)
                        i_7_ = arg1;
                    SubNode.anIntArray2086[i_4_++] = i_7_;
                }
            }
            for(; ; ) {
                i_3_ = is_0_[++i_2_];
                if((i_3_ ^ 0xffffffff) > -101) {
                    if((i_3_ ^ 0xffffffff) == -1) {
                        Class67.anIntArray1588[i++] = is[i_2_];
                        continue;
                    }
                    if(i_3_ == 1) {
                        int i_8_ = is[i_2_];
                        Class67.anIntArray1588[i++] = Class58.varbitmasks[i_8_];
                        continue;
                    }
                    if(i_3_ == 2) {
                        int i_9_ = is[i_2_];
                        Class58.varbitmasks[i_9_] = Class67.anIntArray1588[--i];
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -4) {
                        Class40_Sub11.aClass1Array2153[i_1_++] = class40_sub5_sub1.aClass1Array2270[i_2_];
                        continue;
                    }
                    if(i_3_ == 6) {
                        i_2_ += is[i_2_];
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -8) {
                        i -= 2;
                        if(Class67.anIntArray1588[i] != Class67.anIntArray1588[1 + i])
                            i_2_ += is[i_2_];
                        continue;
                    }
                    if(i_3_ == 8) {
                        i -= 2;
                        if((Class67.anIntArray1588[1 + i] ^ 0xffffffff) == (Class67.anIntArray1588[i] ^ 0xffffffff))
                            i_2_ += is[i_2_];
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -10) {
                        i -= 2;
                        if(Class67.anIntArray1588[1 + i] > Class67.anIntArray1588[i])
                            i_2_ += is[i_2_];
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -11) {
                        i -= 2;
                        if(Class67.anIntArray1588[1 + i] < Class67.anIntArray1588[i])
                            i_2_ += is[i_2_];
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -22) {
                        if((Class29.anInt678 ^ 0xffffffff) != -1) {
                            Class61 class61 = (Class56.aClass61Array1320[--Class29.anInt678]);
                            Class51.aClass1Array1204 = class61.aClass1Array1430;
                            SubNode.anIntArray2086 = class61.anIntArray1420;
                            i_2_ = class61.anInt1433;
                            class40_sub5_sub1 = class61.aClass40_Sub5_Sub1_1419;
                            is = class40_sub5_sub1.anIntArray2262;
                            is_0_ = class40_sub5_sub1.anIntArray2272;
                            continue;
                        }
                        break;
                    }
                    if(i_3_ == 25) {
                        int i_10_ = is[i_2_];
                        Class67.anIntArray1588[i++] = Class40_Sub5_Sub6.method585(i_10_, 1369);
                        continue;
                    }
                    if(i_3_ == 27) {
                        int i_11_ = is[i_2_];
                        Class40_Sub2.method522(Class67.anIntArray1588[--i], i_11_, (byte) 118);
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -32) {
                        i -= 2;
                        if((Class67.anIntArray1588[i] <= Class67.anIntArray1588[i + 1]))
                            i_2_ += is[i_2_];
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -33) {
                        i -= 2;
                        if((Class67.anIntArray1588[1 + i] <= Class67.anIntArray1588[i]))
                            i_2_ += is[i_2_];
                        continue;
                    }
                    if(i_3_ == 33) {
                        Class67.anIntArray1588[i++] = SubNode.anIntArray2086[is[i_2_]];
                        continue;
                    }
                    if(i_3_ == 34) {
                        SubNode.anIntArray2086[is[i_2_]] = Class67.anIntArray1588[--i];
                        continue;
                    }
                    if(i_3_ == 35) {
                        Class40_Sub11.aClass1Array2153[i_1_++] = Class51.aClass1Array1204[is[i_2_]];
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -37) {
                        Class51.aClass1Array1204[is[i_2_]] = Class40_Sub11.aClass1Array2153[--i_1_];
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -38) {
                        int i_12_ = is[i_2_];
                        i_1_ -= i_12_;
                        RSString class1 = (IdentityKit.method627(63, i_12_, i_1_, Class40_Sub11.aClass1Array2153));
                        Class40_Sub11.aClass1Array2153[i_1_++] = class1;
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -39) {
                        i--;
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -40) {
                        i_1_--;
                        continue;
                    }
                    if(i_3_ == 40) {
                        int i_13_ = is[i_2_];
                        Class40_Sub5_Sub1 class40_sub5_sub1_14_ = IdentityKit.method626(i_13_, 73, 65);
                        int[] is_15_ = new int[class40_sub5_sub1_14_.anInt2271];
                        RSString[] class1s = new RSString[class40_sub5_sub1_14_.anInt2267];
                        for(int i_16_ = 0; ((class40_sub5_sub1_14_.anInt2263 > i_16_)); i_16_++)
                            is_15_[i_16_] = (Class67.anIntArray1588[i - (class40_sub5_sub1_14_.anInt2263 + -i_16_)]);
                        for(int i_17_ = 0; class40_sub5_sub1_14_.anInt2266 > i_17_; i_17_++)
                            class1s[i_17_] = (Class40_Sub11.aClass1Array2153[(i_1_ - class40_sub5_sub1_14_.anInt2266 + i_17_)]);
                        i_1_ -= class40_sub5_sub1_14_.anInt2266;
                        i -= class40_sub5_sub1_14_.anInt2263;
                        Class61 class61 = new Class61();
                        class61.aClass1Array1430 = Class51.aClass1Array1204;
                        class61.aClass40_Sub5_Sub1_1419 = class40_sub5_sub1;
                        class61.anIntArray1420 = SubNode.anIntArray2086;
                        class40_sub5_sub1 = class40_sub5_sub1_14_;
                        class61.anInt1433 = i_2_;
                        Class56.aClass61Array1320[Class29.anInt678++] = class61;
                        is = class40_sub5_sub1.anIntArray2262;
                        Class51.aClass1Array1204 = class1s;
                        i_2_ = -1;
                        SubNode.anIntArray2086 = is_15_;
                        is_0_ = class40_sub5_sub1.anIntArray2272;
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -43) {
                        Class67.anIntArray1588[i++] = Class22_Sub1.anIntArray1847[is[i_2_]];
                        continue;
                    }
                    if((i_3_ ^ 0xffffffff) == -44) {
                        Class22_Sub1.anIntArray1847[is[i_2_]] = Class67.anIntArray1588[--i];
                        continue;
                    }
                }
                boolean bool;
                bool = (is[i_2_] ^ 0xffffffff) == -2;
                if((i_3_ ^ 0xffffffff) > -1001) {
                    if((i_3_ ^ 0xffffffff) == -101) {
                        i -= 3;
                        int i_18_ = Class67.anIntArray1588[i];
                        int i_19_ = Class67.anIntArray1588[i + 1];
                        int i_20_ = Class67.anIntArray1588[i + 2];
                        Widget widget = Class68.method1045(i_18_, (byte) -108);
                        if(widget.aWidgetArray2713 == null)
                            widget.aWidgetArray2713 = new Widget[1 + i_20_];
                        if((i_20_ ^ 0xffffffff) <= ((widget.aWidgetArray2713).length ^ 0xffffffff)) {
                            Widget[] widgets = new Widget[1 + i_20_];
                            for(int i_21_ = 0; (((widget.aWidgetArray2713).length > i_21_)); i_21_++)
                                widgets[i_21_] = (widget.aWidgetArray2713[i_21_]);
                            widget.aWidgetArray2713 = widgets;
                        }
                        Widget widget_22_ = new Widget();
                        widget_22_.anInt2648 = widget.anInt2689;
                        widget_22_.type = i_19_;
                        widget_22_.anInt2689 = ((0xffff & widget.anInt2689) << -1708169617) + (-2147483648 + i_20_);
                        widget.aWidgetArray2713[i_20_] = widget_22_;
                        if(!bool)
                            Class22_Sub2.aWidget_1887 = widget_22_;
                        else
                            Class40_Sub6.aWidget_2116 = widget_22_;
                    } else if(i_3_ == 101) {
                        Widget widget = (!bool ? Class22_Sub2.aWidget_1887 : Class40_Sub6.aWidget_2116);
                        Widget widget_23_ = Class68.method1045((widget.anInt2648), (byte) -100);
                        widget_23_.aWidgetArray2713[Class66.method1021((widget.anInt2689), 32767)] = null;
                    } else {
                        if(i_3_ != 102)
                            break;
                        Widget widget = Class68.method1045((Class67.anIntArray1588[--i]), (byte) -83);
                        widget.aWidgetArray2713 = null;
                    }
                } else if(((i_3_ ^ 0xffffffff) <= -1001 && (i_3_ ^ 0xffffffff) > -1101) || ((i_3_ ^ 0xffffffff) <= -2001 && i_3_ < 2100)) {
                    Widget widget;
                    if(i_3_ >= 2000) {
                        widget = Class68.method1045((Class67.anIntArray1588[--i]), (byte) -64);
                        i_3_ -= 1000;
                    } else
                        widget = (bool ? Class40_Sub6.aWidget_2116 : Class22_Sub2.aWidget_1887);
                    if((i_3_ ^ 0xffffffff) == -1001) {
                        i -= 2;
                        widget.anInt2656 = Class67.anIntArray1588[i];
                        widget.anInt2696 = Class67.anIntArray1588[i + 1];
                    } else if((i_3_ ^ 0xffffffff) == -1002) {
                        i -= 2;
                        widget.anInt2692 = Class67.anIntArray1588[i];
                        widget.anInt2643 = Class67.anIntArray1588[1 + i];
                    } else if(i_3_ == 1003)
                        widget.aBoolean2750 = Class67.anIntArray1588[--i] == 1;
                    else {
                        if(i_3_ != 1004)
                            break;
                        widget.aBoolean2688 = Class67.anIntArray1588[--i] == 1;
                    }
                } else if((i_3_ ^ 0xffffffff) <= -1101 && i_3_ < 1200 || ((i_3_ ^ 0xffffffff) <= -2101 && (i_3_ ^ 0xffffffff) > -2201)) {
                    Widget widget;
                    if((i_3_ ^ 0xffffffff) > -2001)
                        widget = (!bool ? Class22_Sub2.aWidget_1887 : Class40_Sub6.aWidget_2116);
                    else {
                        widget = Class68.method1045((Class67.anIntArray1588[--i]), (byte) -65);
                        i_3_ -= 1000;
                    }
                    if(i_3_ == 1100) {
                        i -= 2;
                        widget.anInt2746 = Class67.anIntArray1588[i];
                        widget.scrollPosition = Class67.anIntArray1588[1 + i];
                    } else if(i_3_ == 1101) {
                        int i_24_ = Class67.anIntArray1588[--i];
                        int i_25_ = (0x7e0b & i_24_) >> 1185286442;
                        int i_26_ = i_24_ & 0x1f;
                        int i_27_ = i_24_ >> 2043942949 & 0x1f;
                        widget.anInt2647 = ((i_27_ << 1110799051) + (i_25_ << -2109315117) + (i_26_ << -170628573));
                    } else if(i_3_ == 1102)
                        widget.aBoolean2645 = Class67.anIntArray1588[--i] == 1;
                    else if((i_3_ ^ 0xffffffff) == -1104)
                        widget.anInt2745 = Class67.anIntArray1588[--i];
                    else if((i_3_ ^ 0xffffffff) == -1105)
                        i--;
                    else if(i_3_ == 1105)
                        widget.anInt2744 = Class67.anIntArray1588[--i];
                    else if((i_3_ ^ 0xffffffff) == -1107)
                        widget.anInt2751 = Class67.anIntArray1588[--i];
                    else if((i_3_ ^ 0xffffffff) == -1108)
                        widget.aBoolean2641 = ((Class67.anIntArray1588[--i] ^ 0xffffffff) == -2);
                    else if(i_3_ == 1108) {
                        widget.anInt2687 = 1;
                        widget.anInt2673 = Class67.anIntArray1588[--i];
                    } else if((i_3_ ^ 0xffffffff) == -1110) {
                        i -= 6;
                        widget.anInt2737 = Class67.anIntArray1588[i];
                        widget.anInt2679 = Class67.anIntArray1588[1 + i];
                        widget.anInt2690 = Class67.anIntArray1588[i + 2];
                        widget.anInt2657 = Class67.anIntArray1588[3 + i];
                        widget.anInt2725 = Class67.anIntArray1588[4 + i];
                        widget.anInt2728 = Class67.anIntArray1588[5 + i];
                    } else if((i_3_ ^ 0xffffffff) == -1111)
                        widget.anInt2659 = Class67.anIntArray1588[--i];
                    else if(i_3_ == 1111)
                        widget.aBoolean2701 = ((Class67.anIntArray1588[--i] ^ 0xffffffff) == -2);
                    else if(i_3_ == 1112)
                        widget.aClass1_2668 = Class40_Sub11.aClass1Array2153[--i_1_];
                    else if(i_3_ == 1113)
                        widget.anInt2642 = Class67.anIntArray1588[--i];
                    else if((i_3_ ^ 0xffffffff) == -1115) {
                        i -= 3;
                        widget.anInt2733 = Class67.anIntArray1588[i];
                        widget.anInt2715 = Class67.anIntArray1588[i + 1];
                        widget.anInt2732 = Class67.anIntArray1588[i + 2];
                    } else {
                        if((i_3_ ^ 0xffffffff) != -1116)
                            break;
                        widget.aBoolean2665 = Class67.anIntArray1588[--i] == 1;
                    }
                } else if((i_3_ < 1200 || (i_3_ ^ 0xffffffff) <= -1301) && ((i_3_ ^ 0xffffffff) > -2201 || i_3_ >= 2300)) {
                    if((i_3_ < 1300 || (i_3_ ^ 0xffffffff) <= -1401) && ((i_3_ ^ 0xffffffff) > -2301 || (i_3_ ^ 0xffffffff) <= -2401)) {
                        if(i_3_ < 1500) {
                            if(i_3_ == 1400) {
                                i -= 2;
                                int i_28_ = Class67.anIntArray1588[i + 1];
                                int i_29_ = Class67.anIntArray1588[i];
                                Widget widget = Class68.method1045(i_29_, (byte) -75);
                                if((widget.aWidgetArray2713) == null || ((widget.aWidgetArray2713).length <= i_28_) || (widget.aWidgetArray2713[i_28_]) == null)
                                    Class67.anIntArray1588[i++] = 0;
                                else {
                                    Class67.anIntArray1588[i++] = 1;
                                    if(!bool)
                                        Class22_Sub2.aWidget_1887 = (widget.aWidgetArray2713[i_28_]);
                                    else
                                        Class40_Sub6.aWidget_2116 = (widget.aWidgetArray2713[i_28_]);
                                }
                            } else if((i_3_ ^ 0xffffffff) == -1402) {
                                i -= 3;
                                int i_30_ = Class67.anIntArray1588[i];
                                int i_31_ = Class67.anIntArray1588[2 + i];
                                int i_32_ = Class67.anIntArray1588[i + 1];
                                Widget widget = (Class27.method361((Class59.aWidgetArrayArray1390[i_30_]), i_31_, true, 0, -1, 0, i_32_, 398));
                                if(widget != null) {
                                    Class67.anIntArray1588[i++] = 1;
                                    if(!bool)
                                        Class22_Sub2.aWidget_1887 = widget;
                                    else
                                        Class40_Sub6.aWidget_2116 = widget;
                                } else
                                    Class67.anIntArray1588[i++] = 0;
                            } else {
                                if((i_3_ ^ 0xffffffff) != -1403)
                                    break;
                                i -= 3;
                                Widget widget = Class68.method1045((Class67.anIntArray1588[i]), (byte) -103);
                                int i_33_ = Class67.anIntArray1588[2 + i];
                                int i_34_ = Class67.anIntArray1588[i + 1];
                                Widget widget_35_ = (Class27.method361((widget.aWidgetArray2713), i_33_, true, widget.scrollPosition, widget.anInt2689, widget.anInt2746, i_34_, 398));
                                if(widget_35_ == null)
                                    Class67.anIntArray1588[i++] = 0;
                                else {
                                    Class67.anIntArray1588[i++] = 1;
                                    if(!bool)
                                        Class22_Sub2.aWidget_1887 = widget_35_;
                                    else
                                        Class40_Sub6.aWidget_2116 = widget_35_;
                                }
                            }
                        } else if(i_3_ < 1600) {
                            Widget widget = (bool ? Class40_Sub6.aWidget_2116 : (Class22_Sub2.aWidget_1887));
                            if(i_3_ == 1500)
                                Class67.anIntArray1588[i++] = widget.anInt2656;
                            else if((i_3_ ^ 0xffffffff) == -1502)
                                Class67.anIntArray1588[i++] = widget.anInt2696;
                            else if((i_3_ ^ 0xffffffff) == -1503)
                                Class67.anIntArray1588[i++] = widget.anInt2692;
                            else if(i_3_ == 1503)
                                Class67.anIntArray1588[i++] = widget.anInt2643;
                            else if((i_3_ ^ 0xffffffff) == -1505)
                                Class67.anIntArray1588[i++] = (!widget.aBoolean2750 ? 0 : 1);
                            else {
                                if((i_3_ ^ 0xffffffff) != -1506)
                                    break;
                                Class67.anIntArray1588[i++] = widget.anInt2648;
                            }
                        } else if((i_3_ ^ 0xffffffff) <= -1701) {
                            if((i_3_ ^ 0xffffffff) > -2501) {
                                if((i_3_ ^ 0xffffffff) == -2402) {
                                    i -= 3;
                                    int i_36_ = Class67.anIntArray1588[1 + i];
                                    int i_37_ = Class67.anIntArray1588[i];
                                    int i_38_ = Class67.anIntArray1588[i + 2];
                                    Widget widget = (Class27.method361((Class59.aWidgetArrayArray1390[i_37_]), i_38_, false, 0, -1, 0, i_36_, 398));
                                    if(widget != null)
                                        Class67.anIntArray1588[i++] = widget.anInt2689;
                                    else
                                        Class67.anIntArray1588[i++] = -1;
                                } else {
                                    if((i_3_ ^ 0xffffffff) != -2403)
                                        break;
                                    i -= 3;
                                    Widget widget = (Class68.method1045(Class67.anIntArray1588[i], (byte) -113));
                                    int i_39_ = Class67.anIntArray1588[1 + i];
                                    int i_40_ = Class67.anIntArray1588[i + 2];
                                    Widget widget_41_ = (Class27.method361((Class59.aWidgetArrayArray1390[(widget.anInt2689 >> -291405296)]), i_40_, false, widget.scrollPosition, 0xffff & (widget.anInt2689), widget.anInt2746, i_39_, 398));
                                    if(widget_41_ != null)
                                        Class67.anIntArray1588[i++] = (widget_41_.anInt2689);
                                    else
                                        Class67.anIntArray1588[i++] = -1;
                                }
                            } else if((i_3_ ^ 0xffffffff) <= -2601) {
                                if((i_3_ ^ 0xffffffff) > -2701) {
                                    Widget widget = (Class68.method1045(Class67.anIntArray1588[--i], (byte) -90));
                                    if((i_3_ ^ 0xffffffff) == -2601)
                                        Class67.anIntArray1588[i++] = widget.anInt2746;
                                    else {
                                        if(i_3_ != 2601)
                                            break;
                                        Class67.anIntArray1588[i++] = widget.scrollPosition;
                                    }
                                } else {
                                    if(i_3_ < 2800)
                                        break;
                                    if(i_3_ < 3100) {
                                        if(i_3_ == 3000) {
                                            int i_42_ = (Class67.anIntArray1588[--i]);
                                            if((Class6_Sub1.anInt1819 ^ 0xffffffff) == 0) {
                                                PacketBuffer.method517(0, i_42_, -9225);
                                                Class6_Sub1.anInt1819 = i_42_;
                                            }
                                        } else if(((i_3_ ^ 0xffffffff) == -3002) || ((i_3_ ^ 0xffffffff) == -3004)) {
                                            i -= 2;
                                            int i_43_ = (Class67.anIntArray1588[i]);
                                            int i_44_ = (Class67.anIntArray1588[i + 1]);
                                            Class33.method406(0, i_44_, i_43_, -128);
                                        } else if(i_3_ == 3002) {
                                            Widget widget = (!bool ? (Class22_Sub2.aWidget_1887) : (Class40_Sub6.aWidget_2116));
                                            if((Class6_Sub1.anInt1819 ^ 0xffffffff) == 0) {
                                                PacketBuffer.method517((widget.anInt2689) & 0x7fff, (widget.anInt2648), -9225);
                                                Class6_Sub1.anInt1819 = (widget.anInt2689);
                                            }
                                        } else {
                                            if((i_3_ ^ 0xffffffff) != -3004)
                                                break;
                                            Widget widget = (bool ? (Class40_Sub6.aWidget_2116) : (Class22_Sub2.aWidget_1887));
                                            int i_45_ = (Class67.anIntArray1588[--i]);
                                            Class33.method406((0x7fff & (widget.anInt2689)), i_45_, (widget.anInt2648), -121);
                                        }
                                    } else if(i_3_ >= 3200) {
                                        if((i_3_ ^ 0xffffffff) > -3301) {
                                            if((i_3_ ^ 0xffffffff) == -3201) {
                                                i -= 3;
                                                Class53.method950((Class67.anIntArray1588[i]), (byte) 55, (Class67.anIntArray1588[i + 1]), (Class67.anIntArray1588[2 + i]));
                                            } else if(i_3_ == 3201)
                                                Class51.method942(257, (Class67.anIntArray1588[--i]));
                                            else {
                                                if((i_3_ ^ 0xffffffff) != -3203)
                                                    break;
                                                i -= 2;
                                                Class57.method975((Class67.anIntArray1588[i + 1]), (byte) 110, (Class67.anIntArray1588[i]));
                                            }
                                        } else if(i_3_ < 3400) {
                                            if(i_3_ != 3300)
                                                break;
                                            Class67.anIntArray1588[i++] = Node.anInt926;
                                        } else if(i_3_ < 4100) {
                                            if((i_3_ ^ 0xffffffff) == -4001) {
                                                i -= 2;
                                                int i_46_ = (Class67.anIntArray1588[i]);
                                                int i_47_ = (Class67.anIntArray1588[i + 1]);
                                                Class67.anIntArray1588[i++] = i_46_ + i_47_;
                                            } else if((i_3_ ^ 0xffffffff) == -4002) {
                                                i -= 2;
                                                int i_48_ = (Class67.anIntArray1588[1 + i]);
                                                int i_49_ = (Class67.anIntArray1588[i]);
                                                Class67.anIntArray1588[i++] = i_49_ + -i_48_;
                                            } else if((i_3_ ^ 0xffffffff) == -4003) {
                                                i -= 2;
                                                int i_50_ = (Class67.anIntArray1588[i + 1]);
                                                int i_51_ = (Class67.anIntArray1588[i]);
                                                Class67.anIntArray1588[i++] = i_51_ * i_50_;
                                            } else if((i_3_ ^ 0xffffffff) == -4004) {
                                                i -= 2;
                                                int i_52_ = (Class67.anIntArray1588[i]);
                                                int i_53_ = (Class67.anIntArray1588[i + 1]);
                                                Class67.anIntArray1588[i++] = i_52_ / i_53_;
                                            } else if(i_3_ == 4004) {
                                                int i_54_ = (Class67.anIntArray1588[--i]);
                                                Class67.anIntArray1588[i++] = (int) (Math.random() * (double) i_54_);
                                            } else if((i_3_ ^ 0xffffffff) == -4006) {
                                                int i_55_ = (Class67.anIntArray1588[--i]);
                                                Class67.anIntArray1588[i++] = (int) ((double) (1 + i_55_) * (Math.random()));
                                            } else if((i_3_ ^ 0xffffffff) == -4007) {
                                                i -= 5;
                                                int i_56_ = (Class67.anIntArray1588[1 + i]);
                                                int i_57_ = (Class67.anIntArray1588[i]);
                                                int i_58_ = (Class67.anIntArray1588[i + 3]);
                                                int i_59_ = (Class67.anIntArray1588[i + 4]);
                                                int i_60_ = (Class67.anIntArray1588[2 + i]);
                                                Class67.anIntArray1588[i++] = (i_57_ + ((i_59_ + -i_60_) * (-i_57_ + i_56_) / (i_58_ - i_60_)));
                                            } else if((i_3_ ^ 0xffffffff) == -4008) {
                                                i -= 2;
                                                int i_61_ = (Class67.anIntArray1588[i]);
                                                int i_62_ = (Class67.anIntArray1588[i + 1]);
                                                Class67.anIntArray1588[i++] = i_61_ + (i_62_ * i_61_ / 100);
                                            } else if((i_3_ ^ 0xffffffff) == -4009) {
                                                i -= 2;
                                                int i_63_ = (Class67.anIntArray1588[i]);
                                                int i_64_ = (Class67.anIntArray1588[i + 1]);
                                                Class67.anIntArray1588[i++] = (Class40_Sub5_Sub9.method619(1 << i_64_, i_63_));
                                            } else if((i_3_ ^ 0xffffffff) == -4010) {
                                                i -= 2;
                                                int i_65_ = (Class67.anIntArray1588[i]);
                                                int i_66_ = (Class67.anIntArray1588[1 + i]);
                                                Class67.anIntArray1588[i++] = (Class66.method1021(i_65_, -1 + -(1 << i_66_)));
                                            } else if(i_3_ == 4010) {
                                                i -= 2;
                                                int i_67_ = (Class67.anIntArray1588[i]);
                                                int i_68_ = (Class67.anIntArray1588[1 + i]);
                                                Class67.anIntArray1588[i++] = (((Class66.method1021(1 << i_68_, i_67_)) ^ 0xffffffff) != -1 ? 1 : 0);
                                            } else if(i_3_ == 4011) {
                                                i -= 2;
                                                int i_69_ = (Class67.anIntArray1588[i + 1]);
                                                int i_70_ = (Class67.anIntArray1588[i]);
                                                Class67.anIntArray1588[i++] = i_70_ % i_69_;
                                            } else if((i_3_ ^ 0xffffffff) == -4013) {
                                                i -= 2;
                                                int i_71_ = (Class67.anIntArray1588[i]);
                                                int i_72_ = (Class67.anIntArray1588[i + 1]);
                                                if(i_71_ != 0)
                                                    Class67.anIntArray1588[i++] = (int) (Math.pow((double) i_71_, (double) i_72_));
                                                else
                                                    Class67.anIntArray1588[i++] = 0;
                                            } else {
                                                if(i_3_ != 4013)
                                                    break;
                                                i -= 2;
                                                int i_73_ = (Class67.anIntArray1588[i]);
                                                int i_74_ = (Class67.anIntArray1588[1 + i]);
                                                if(i_73_ != 0) {
                                                    if((i_74_ ^ 0xffffffff) != -1)
                                                        Class67.anIntArray1588[i++] = (int) (Math.pow((double) i_73_, (1.0 / (double) i_74_)));
                                                    else
                                                        Class67.anIntArray1588[i++] = 2147483647;
                                                } else
                                                    Class67.anIntArray1588[i++] = 0;
                                            }
                                        } else {
                                            if(i_3_ >= 4200)
                                                break;
                                            if(i_3_ == 4100) {
                                                RSString class1 = (Class40_Sub11.aClass1Array2153[--i_1_]);
                                                int i_75_ = (Class67.anIntArray1588[--i]);
                                                Class40_Sub11.aClass1Array2153[i_1_++] = (Class40_Sub5_Sub17_Sub6.method832(118, (new RSString[]{class1, (HashTable.method334(i_75_, -1))})));
                                            } else if(i_3_ == 4101) {
                                                i_1_ -= 2;
                                                RSString class1 = (Class40_Sub11.aClass1Array2153[i_1_ + 1]);
                                                RSString class1_76_ = (Class40_Sub11.aClass1Array2153[i_1_]);
                                                Class40_Sub11.aClass1Array2153[i_1_++] = (Class40_Sub5_Sub17_Sub6.method832(53, (new RSString[]{class1_76_, class1})));
                                            } else if(i_3_ == 4102) {
                                                RSString class1 = (Class40_Sub11.aClass1Array2153[--i_1_]);
                                                int i_77_ = (Class67.anIntArray1588[--i]);
                                                Class40_Sub11.aClass1Array2153[i_1_++] = (Class40_Sub5_Sub17_Sub6.method832(-115, (new RSString[]{class1, (Class66.method1024(true, (byte) -85, i_77_))})));
                                            } else if((i_3_ ^ 0xffffffff) == -4104) {
                                                RSString class1 = (Class40_Sub11.aClass1Array2153[--i_1_]);
                                                Class40_Sub11.aClass1Array2153[i_1_++] = class1.method79();
                                            } else if((i_3_ ^ 0xffffffff) == -4105) {
                                                int i_78_ = (Class67.anIntArray1588[--i]);
                                                long l = (86400000L * ((long) i_78_ + 11745L));
                                                Class8.aCalendar279.setTime(new Date(l));
                                                int i_79_ = Class8.aCalendar279.get(5);
                                                int i_80_ = Class8.aCalendar279.get(2);
                                                int i_81_ = Class8.aCalendar279.get(1);
                                                Class40_Sub11.aClass1Array2153[i_1_++] = (Class40_Sub5_Sub17_Sub6.method832(-55, (new RSString[]{(HashTable.method334(i_79_, -1)), (Class27.aClass1_643), (Class40_Sub5_Sub17_Sub1.aClass1Array2964[i_80_]), (Class27.aClass1_643), (HashTable.method334(i_81_, -1))})));
                                            } else if((i_3_ ^ 0xffffffff) == -4106) {
                                                i_1_ -= 2;
                                                RSString class1 = (Class40_Sub11.aClass1Array2153[i_1_]);
                                                RSString class1_82_ = (Class40_Sub11.aClass1Array2153[i_1_ + 1]);
                                                if((Player.localPlayer.aClass30_3282) == null || !(Player.localPlayer.aClass30_3282.aBoolean683))
                                                    Class40_Sub11.aClass1Array2153[i_1_++] = class1;
                                                else
                                                    Class40_Sub11.aClass1Array2153[i_1_++] = class1_82_;
                                            } else if(i_3_ == 4106) {
                                                int i_83_ = (Class67.anIntArray1588[--i]);
                                                Class40_Sub11.aClass1Array2153[i_1_++] = (HashTable.method334(i_83_, -1));
                                            } else {
                                                if(i_3_ != 4107)
                                                    break;
                                                i_1_ -= 2;
                                                Class67.anIntArray1588[i++] = (Class40_Sub11.aClass1Array2153[i_1_].method84((Class40_Sub11.aClass1Array2153[i_1_ + 1]), (byte) 109));
                                            }
                                        }
                                    } else if((i_3_ ^ 0xffffffff) == -3101) {
                                        RSString class1 = (Class40_Sub11.aClass1Array2153[--i_1_]);
                                        Class44.method895(84, 0, class1, (Landscape.aClass1_1183));
                                    } else {
                                        if(i_3_ != 3101)
                                            break;
                                        i -= 2;
                                        ActorDefinition.method570(Class67.anIntArray1588[i], (Class67.anIntArray1588[i + 1]), (Player.localPlayer), -1);
                                    }
                                }
                            } else {
                                Widget widget = Class68.method1045((Class67.anIntArray1588[--i]), (byte) -103);
                                if((i_3_ ^ 0xffffffff) == -2501)
                                    Class67.anIntArray1588[i++] = widget.anInt2656;
                                else if((i_3_ ^ 0xffffffff) == -2502)
                                    Class67.anIntArray1588[i++] = widget.anInt2696;
                                else if((i_3_ ^ 0xffffffff) == -2503)
                                    Class67.anIntArray1588[i++] = widget.anInt2692;
                                else if(i_3_ == 2503)
                                    Class67.anIntArray1588[i++] = widget.anInt2643;
                                else if(i_3_ == 2504)
                                    Class67.anIntArray1588[i++] = (widget.aBoolean2750 ? 1 : 0);
                                else {
                                    if(i_3_ != 2505)
                                        break;
                                    Class67.anIntArray1588[i++] = widget.anInt2648;
                                }
                            }
                        } else {
                            Widget widget = (bool ? Class40_Sub6.aWidget_2116 : (Class22_Sub2.aWidget_1887));
                            if((i_3_ ^ 0xffffffff) == -1601)
                                Class67.anIntArray1588[i++] = widget.anInt2746;
                            else {
                                if(i_3_ != 1601)
                                    break;
                                Class67.anIntArray1588[i++] = widget.scrollPosition;
                            }
                        }
                    } else {
                        Widget widget;
                        if((i_3_ ^ 0xffffffff) <= -2001) {
                            widget = Class68.method1045((Class67.anIntArray1588[--i]), (byte) -81);
                            i_3_ -= 1000;
                        } else
                            widget = (!bool ? Class22_Sub2.aWidget_1887 : (Class40_Sub6.aWidget_2116));
                        if((i_3_ ^ 0xffffffff) <= -1301 && i_3_ <= 1309 || i_3_ >= 1314 && i_3_ <= 1317) {
                            RSString class1 = Class40_Sub11.aClass1Array2153[--i_1_];
                            Object[] objects = new Object[class1.length() + 1];
                            for(int i_84_ = objects.length - 1; (i_84_ ^ 0xffffffff) <= -2; i_84_--) {
                                if(class1.method55(-1 + i_84_, arg5) != 115)
                                    objects[i_84_] = new Integer(Class67.anIntArray1588[--i]);
                                else
                                    objects[i_84_] = (Class40_Sub11.aClass1Array2153[--i_1_]);
                            }
                            objects[0] = new Integer(Class67.anIntArray1588[--i]);
                            if(i_3_ == 1303)
                                widget.anObjectArray2707 = objects;
                            if(i_3_ == 1317)
                                widget.anObjectArray2680 = objects;
                            if((i_3_ ^ 0xffffffff) == -1305)
                                widget.anObjectArray2658 = objects;
                            if((i_3_ ^ 0xffffffff) == -1303)
                                widget.anObjectArray2644 = objects;
                            if((i_3_ ^ 0xffffffff) == -1317)
                                widget.anObjectArray2747 = objects;
                            if(i_3_ == 1301)
                                widget.anObjectArray2681 = objects;
                            if(i_3_ == 1300)
                                widget.anObjectArray2677 = objects;
                            if((i_3_ ^ 0xffffffff) == -1316)
                                widget.anObjectArray2695 = objects;
                            if((i_3_ ^ 0xffffffff) == -1307)
                                widget.anObjectArray2669 = objects;
                            if((i_3_ ^ 0xffffffff) == -1306)
                                widget.anObjectArray2672 = objects;
                            if(i_3_ == 1309)
                                widget.anObjectArray2712 = objects;
                            if(i_3_ == 1308)
                                widget.anObjectArray2650 = objects;
                        } else if((i_3_ ^ 0xffffffff) == -1311) {
                            int i_85_ = -1 + Class67.anIntArray1588[--i];
                            if((i_85_ ^ 0xffffffff) > -1 || (i_85_ ^ 0xffffffff) < -10)
                                i_1_--;
                            else {
                                if((widget.aClass1Array2661 == null) || (((widget.aClass1Array2661).length <= i_85_))) {
                                    RSString[] class1s = new RSString[1 + i_85_];
                                    if(widget.aClass1Array2661 != null) {
                                        for(int i_86_ = 0; (((widget.aClass1Array2661).length > i_86_)); i_86_++)
                                            class1s[i_86_] = (widget.aClass1Array2661[i_86_]);
                                    }
                                    widget.aClass1Array2661 = class1s;
                                }
                                widget.aClass1Array2661[i_85_] = (Class40_Sub11.aClass1Array2153[--i_1_]);
                            }
                        } else if((i_3_ ^ 0xffffffff) == -1312)
                            widget.anInt2738 = Class67.anIntArray1588[--i];
                        else if(i_3_ == 1312)
                            widget.aBoolean2694 = (Class67.anIntArray1588[--i] ^ 0xffffffff) == -2;
                        else {
                            if((i_3_ ^ 0xffffffff) != -1314)
                                break;
                            i--;
                        }
                    }
                } else {
                    Widget widget;
                    if((i_3_ ^ 0xffffffff) > -2001)
                        widget = (!bool ? Class22_Sub2.aWidget_1887 : Class40_Sub6.aWidget_2116);
                    else {
                        widget = Class68.method1045((Class67.anIntArray1588[--i]), (byte) -65);
                        i_3_ -= 1000;
                    }
                    if(i_3_ == 1200) {
                        i -= 3;
                        int i_87_ = Class67.anIntArray1588[i];
                        int i_88_ = Class67.anIntArray1588[i + 2];
                        if((i_87_ ^ 0xffffffff) != 0) {
                            ItemDefinition class40_sub5_sub16 = ItemDefinition.forId(i_87_, 10);
                            widget.anInt2687 = 4;
                            widget.anInt2690 = class40_sub5_sub16.modelRotation1;
                            widget.anInt2725 = class40_sub5_sub16.anInt2827;
                            widget.anInt2728 = (100 * class40_sub5_sub16.modelZoom / i_88_);
                            widget.anInt2657 = class40_sub5_sub16.modelRotation2;
                            widget.anInt2679 = class40_sub5_sub16.modelOffset2;
                            widget.anInt2737 = class40_sub5_sub16.modelOffset1;
                            widget.anInt2673 = i_87_;
                        } else
                            widget.anInt2687 = 0;
                    } else if((i_3_ ^ 0xffffffff) == -1202) {
                        widget.anInt2687 = 2;
                        widget.anInt2673 = Class67.anIntArray1588[--i];
                    } else if(i_3_ == 1202) {
                        widget.anInt2687 = 3;
                        widget.anInt2673 = Player.localPlayer.aClass30_3282.method374(-20874);
                    } else {
                        if(i_3_ != 1203)
                            break;
                        Widget widget_89_ = (!bool ? Class40_Sub6.aWidget_2116 : Class22_Sub2.aWidget_1887);
                        widget.anInt2738 = widget_89_.anInt2689;
                    }
                }
            }
        } catch(Exception exception) {
            /* empty */
        }

    }

    public static void drawTabArea(int arg0) {
        Class38.aBoolean893 = true;
        Class61.method996(19655);
        if((Class29.anInt673 ^ 0xffffffff) != 0) {
            boolean bool = Class40_Sub5_Sub6.drawInterface(0, Class29.anInt673, 261, (byte) -5, 0, 1, 190);
            if(!bool)
                ISAAC.redrawTabArea = true;
        } else if(Class40_Sub5_Sub11.tabWidgetIds[Class5.currentTabId] != -1) {
            boolean bool = Class40_Sub5_Sub6.drawInterface(0, (Class40_Sub5_Sub11.tabWidgetIds[Class5.currentTabId]), 261, (byte) -5, 0, 1, 190);
            if(!bool)
                ISAAC.redrawTabArea = true;
        }
        if(Class4.menuOpen && Class40_Sub5_Sub17_Sub1.menuScreenArea == 1) {
            if(Class34.anInt848 == 1)
                Class32.method398(-2);
            else
                Class40_Sub5_Sub6.method588(-1);
        }
        if(arg0 >= -22)
            cameraYawOffset = 80;
        Class55.method964(40);
    }

    public static void method893(byte arg0) {

        if(arg0 <= 104)
            aClass1_1024 = null;
        aClass9_1014 = null;
        aClass1_1026 = null;
        aClass1_1021 = null;
        aClass45_1022 = null;
        aClass1_1024 = null;
        aClass1_1019 = null;
        aClass1_1027 = null;

    }

    public static void method894(boolean arg0) {

        anInt1018++;
        if((SceneTile.activeInterfaceType ^ 0xffffffff) == -1) {
            Landscape.aClass1Array1184[0] = Class68.aClass1_1635;
            Class38.anIntArray884[0] = 1005;
            ActorDefinition.anInt2394 = 1;
            if((ActorDefinition.anInt2433 ^ 0xffffffff) != 0) {
                Class40_Sub5_Sub17_Sub3.anInt3065 = -1;
                Floor.anInt2328 = -1;
                Class13.method243((byte) 89, 0, 765, 503, ActorDefinition.anInt2433, 0, Class13.mouseX, Landscape.mouseY, 0);
                ItemDefinition.anInt2850 = Floor.anInt2328;
                HashTable.anInt573 = Class40_Sub5_Sub17_Sub3.anInt3065;
            } else {
                Class38_Sub1.method445(9767);
                Class40_Sub5_Sub17_Sub3.anInt3065 = -1;
                Floor.anInt2328 = -1;
                boolean bool = arg0;
                if(Class13.mouseX > 4 && Landscape.mouseY > 4 && Class13.mouseX < 516 && (Landscape.mouseY ^ 0xffffffff) > -339) {
                    if((Class66.anInt1560 ^ 0xffffffff) == 0)
                        Class64.method1013(arg0);
                    else
                        Class13.method243((byte) 89, 4, 516, 338, Class66.anInt1560, 4, Class13.mouseX, Landscape.mouseY, 0);
                }
                HashTable.anInt573 = Class40_Sub5_Sub17_Sub3.anInt3065;
                ItemDefinition.anInt2850 = Floor.anInt2328;
                Class40_Sub5_Sub17_Sub3.anInt3065 = -1;
                Floor.anInt2328 = -1;
                if((Class13.mouseX ^ 0xffffffff) < -554 && Landscape.mouseY > 205 && Class13.mouseX < 743 && (Landscape.mouseY ^ 0xffffffff) > -467) {
                    if((Class29.anInt673 ^ 0xffffffff) != 0)
                        Class13.method243((byte) 89, 205, 743, 466, Class29.anInt673, 553, Class13.mouseX, Landscape.mouseY, 1);
                    else if((Class40_Sub5_Sub11.tabWidgetIds[Class5.currentTabId]) != -1)
                        Class13.method243((byte) 89, 205, 743, 466, (Class40_Sub5_Sub11.tabWidgetIds[Class5.currentTabId]), 553, Class13.mouseX, Landscape.mouseY, 1);
                }
                if(Floor.anInt2328 != CollisionMap.anInt163) {
                    ISAAC.redrawTabArea = true;
                    CollisionMap.anInt163 = Floor.anInt2328;
                }
                Floor.anInt2328 = -1;
                if(Class40_Sub5_Sub17_Sub3.anInt3065 != FloorDecoration.anInt614) {
                    FloorDecoration.anInt614 = Class40_Sub5_Sub17_Sub3.anInt3065;
                    ISAAC.redrawTabArea = true;
                }
                Class40_Sub5_Sub17_Sub3.anInt3065 = -1;
                if(Class13.mouseX > 17 && (Landscape.mouseY ^ 0xffffffff) < -358 && Class13.mouseX < 496 && (Landscape.mouseY ^ 0xffffffff) > -454) {
                    if((openChatboxWidgetId ^ 0xffffffff) == 0) {
                        if((Class48.anInt1138 ^ 0xffffffff) == 0) {
                            if(Landscape.mouseY < 434 && Class13.mouseX < 426)
                                Class40_Sub11.method873((Landscape.mouseY + -357), 45);
                        } else
                            Class13.method243((byte) 89, 357, 496, 453, Class48.anInt1138, 17, Class13.mouseX, Landscape.mouseY, 3);
                    } else
                        Class13.method243((byte) 89, 357, 496, 453, openChatboxWidgetId, 17, Class13.mouseX, Landscape.mouseY, 2);
                }
                if(((openChatboxWidgetId ^ 0xffffffff) != 0 || (Class48.anInt1138 ^ 0xffffffff) != 0) && (Class55.anInt1296 != Floor.anInt2328)) {
                    Class52.redrawChatbox = true;
                    Class55.anInt1296 = Floor.anInt2328;
                }
                if(((openChatboxWidgetId ^ 0xffffffff) != 0 || Class48.anInt1138 != -1) && ((Class67.anInt1586 ^ 0xffffffff) != (Class40_Sub5_Sub17_Sub3.anInt3065 ^ 0xffffffff))) {
                    Class52.redrawChatbox = true;
                    Class67.anInt1586 = Class40_Sub5_Sub17_Sub3.anInt3065;
                }
                while(!bool) {
                    bool = true;
                    for(int i = 0; -1 + ActorDefinition.anInt2394 > i; i++) {
                        if(Class38.anIntArray884[i] < 1000 && ((Class38.anIntArray884[1 + i] ^ 0xffffffff) < -1001)) {
                            bool = false;
                            RSString class1 = Landscape.aClass1Array1184[i];
                            Landscape.aClass1Array1184[i] = Landscape.aClass1Array1184[i + 1];
                            Landscape.aClass1Array1184[i + 1] = class1;
                            int i_90_ = Class38.anIntArray884[i];
                            Class38.anIntArray884[i] = Class38.anIntArray884[i + 1];
                            Class38.anIntArray884[i + 1] = i_90_;
                            i_90_ = Class19.anIntArray483[i];
                            Class19.anIntArray483[i] = Class19.anIntArray483[1 + i];
                            Class19.anIntArray483[1 + i] = i_90_;
                            i_90_ = Class59.anIntArray1393[i];
                            Class59.anIntArray1393[i] = Class59.anIntArray1393[1 + i];
                            Class59.anIntArray1393[i + 1] = i_90_;
                            i_90_ = Class33.anIntArray791[i];
                            Class33.anIntArray791[i] = Class33.anIntArray791[i + 1];
                            Class33.anIntArray791[1 + i] = i_90_;
                        }
                    }
                }
            }
        }

    }
}
