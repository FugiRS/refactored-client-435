/* Class40_Sub5_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Method;

public class Class40_Sub5_Sub12 extends SubNode
{
    public static int anInt2634;
    public static int anInt2635;
    public boolean aBoolean2636 = false;
    public static RSString aClass1_2637 = Class58.method978(-11538, "glow2:");
    public static int anInt2638;
    public int anInt2639;
    public RSString aClass1_2640;
    public boolean aBoolean2641;
    public int anInt2642;
    public int anInt2643;
    public Object[] anObjectArray2644;
    public boolean aBoolean2645;
    public static int anInt2646;
    public int anInt2647;
    public int anInt2648;
    public int anInt2649;
    public Object[] anObjectArray2650;
    public int anInt2651 = 1;
    public static int anInt2652;
    public int anInt2653;
    public int anInt2654;
    public boolean aBoolean2655;
    public int anInt2656;
    public int anInt2657;
    public Object[] anObjectArray2658;
    public int anInt2659;
    public int anInt2660;
    public RSString[] aClass1Array2661;
    public static int anInt2662;
    public int anInt2663;
    public RSString aClass1_2664;
    public boolean aBoolean2665;
    public static int anInt2666;
    public int anInt2667;
    public RSString aClass1_2668;
    public Object[] anObjectArray2669;
    public int anInt2670;
    public static RSString aClass1_2671;
    public Object[] anObjectArray2672;
    public int anInt2673;
    public static RSString aClass1_2674;
    public static int anInt2675;
    public RSString aClass1_2676;
    public Object[] anObjectArray2677;
    public static RSString aClass1_2678;
    public int anInt2679;
    public Object[] anObjectArray2680;
    public Object[] anObjectArray2681;
    public boolean aBoolean2682;
    public int anInt2683;
    public static RSString aClass1_2684;
    public int[] anIntArray2685;
    public static RSString aClass1_2686;
    public int anInt2687;
    public boolean aBoolean2688;
    public int anInt2689;
    public int anInt2690;
    public static RSString aClass1_2691;
    public int anInt2692;
    public int[] anIntArray2693;
    public boolean aBoolean2694;
    public Object[] anObjectArray2695;
    public int anInt2696;
    public static int anInt2697;
    public RSString[] aClass1Array2698;
    public int[] anIntArray2699;
    public static int anInt2700;
    public boolean aBoolean2701;
    public int anInt2702;
    public boolean aBoolean2703;
    public int[] anIntArray2704;
    public static int anInt2705;
    public static RSString aClass1_2706
	= Class58.method978(-11538, "Choose Option");
    public Object[] anObjectArray2707;
    public int[] anIntArray2708;
    public RSString aClass1_2709;
    public int[] anIntArray2710;
    public int anInt2711;
    public Object[] anObjectArray2712;
    public Class40_Sub5_Sub12[] aClass40_Sub5_Sub12Array2713;
    public int anInt2714;
    public int anInt2715;
    public static RSString aClass1_2716;
    public static int anInt2717;
    public int anInt2718;
    public int anInt2719;
    public int anInt2720;
    public int anInt2721;
    public int anInt2722;
    public boolean aBoolean2723;
    public static int anInt2724;
    public int anInt2725;
    public int anInt2726;
    public boolean aBoolean2727;
    public int anInt2728;
    public static RSString aClass1_2729;
    public boolean aBoolean2730;
    public int anInt2731;
    public int anInt2732;
    public int anInt2733;
    public int anInt2734;
    public static int anInt2735;
    public int anInt2736;
    public int anInt2737;
    public int anInt2738;
    public static int anInt2739;
    public static RSString aClass1_2740;
    public static int packetsize;
    public int[] anIntArray2742;
    public int anInt2743;
    public int anInt2744;
    public int anInt2745;
    public int anInt2746;
    public Object[] anObjectArray2747;
    public int[][] anIntArrayArray2748;
    public int anInt2749;
    public boolean aBoolean2750;
    public int anInt2751;
    
    public void method636(int arg0, boolean arg1, int arg2) {
	try {
	    anInt2646++;
	    int i = anIntArray2685[arg2];
	    anIntArray2685[arg2] = anIntArray2685[arg0];
	    anIntArray2685[arg0] = i;
	    i = anIntArray2710[arg2];
	    anIntArray2710[arg2] = anIntArray2710[arg0];
	    if (arg1 != false)
		anIntArrayArray2748 = null;
	    anIntArray2710[arg0] = i;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   ("qd.B(" + arg0 + ',' + arg1 + ',' + arg2
				    + ')'));
	}
    }
    
    public void method637(Buffer arg0, int arg1) {
	anInt2717++;
	aBoolean2636 = false;
	anInt2683 = arg0.method468(false);
	anInt2714 = arg0.method468(false);
	anInt2639 = arg0.method469(65280);
	if (arg1 >= -35)
	    aBoolean2723 = true;
	anInt2649 = anInt2656 = arg0.method463((byte) -128);
	anInt2743 = anInt2696 = arg0.method463((byte) -63);
	anInt2692 = arg0.method469(65280);
	anInt2643 = arg0.method469(65280);
	anInt2745 = arg0.method468(false);
	anInt2648 = arg0.method469(65280);
	if ((anInt2648 ^ 0xffffffff) == -65536)
	    anInt2648 = -1;
	anInt2721 = arg0.method469(65280);
	if (anInt2721 == 65535)
	    anInt2721 = -1;
	int i = arg0.method468(false);
	if ((i ^ 0xffffffff) < -1) {
	    anIntArray2742 = new int[i];
	    anIntArray2693 = new int[i];
	    for (int i_0_ = 0; i > i_0_; i_0_++) {
		anIntArray2742[i_0_] = arg0.method468(false);
		anIntArray2693[i_0_] = arg0.method469(65280);
	    }
	}
	int i_1_ = arg0.method468(false);
	if ((i_1_ ^ 0xffffffff) < -1) {
	    anIntArrayArray2748 = new int[i_1_][];
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
		 i_2_++) {
		int i_3_ = arg0.method469(65280);
		anIntArrayArray2748[i_2_] = new int[i_3_];
		for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
		     i_4_++) {
		    anIntArrayArray2748[i_2_][i_4_] = arg0.method469(65280);
		    if ((anIntArrayArray2748[i_2_][i_4_] ^ 0xffffffff)
			== -65536)
			anIntArrayArray2748[i_2_][i_4_] = -1;
		}
	    }
	}
	if ((anInt2683 ^ 0xffffffff) == -1) {
	    anInt2720 = arg0.method469(65280);
	    aBoolean2750 = arg0.method468(false) == 1;
	}
	if ((anInt2683 ^ 0xffffffff) == -2) {
	    arg0.method469(65280);
	    arg0.method468(false);
	}
	if (anInt2683 == 2) {
	    anIntArray2685 = new int[anInt2643 * anInt2692];
	    anIntArray2710 = new int[anInt2643 * anInt2692];
	    aBoolean2703 = (arg0.method468(false) ^ 0xffffffff) == -2;
	    aBoolean2727 = arg0.method468(false) == 1;
	    aBoolean2655 = arg0.method468(false) == 1;
	    aBoolean2723 = (arg0.method468(false) ^ 0xffffffff) == -2;
	    anInt2749 = arg0.method468(false);
	    anInt2667 = arg0.method468(false);
	    anIntArray2708 = new int[20];
	    anIntArray2704 = new int[20];
	    anIntArray2699 = new int[20];
	    for (int i_5_ = 0; i_5_ < 20; i_5_++) {
		int i_6_ = arg0.method468(false);
		if ((i_6_ ^ 0xffffffff) == -2) {
		    anIntArray2699[i_5_] = arg0.method463((byte) -97);
		    anIntArray2708[i_5_] = arg0.method463((byte) -85);
		    anIntArray2704[i_5_] = arg0.method491(-4750);
		} else
		    anIntArray2704[i_5_] = -1;
	    }
	    aClass1Array2698 = new RSString[5];
	    for (int i_7_ = 0; i_7_ < 5; i_7_++) {
		aClass1Array2698[i_7_] = arg0.getRSString(-10721);
		if (aClass1Array2698[i_7_].method59(-3136) == 0)
		    aClass1Array2698[i_7_] = null;
	    }
	}
	if ((anInt2683 ^ 0xffffffff) == -4)
	    aBoolean2645 = arg0.method468(false) == 1;
	if (anInt2683 == 4 || anInt2683 == 1) {
	    anInt2733 = arg0.method468(false);
	    anInt2715 = arg0.method468(false);
	    anInt2732 = arg0.method468(false);
	    anInt2642 = arg0.method469(65280);
	    aBoolean2665 = (arg0.method468(false) ^ 0xffffffff) == -2;
	}
	if ((anInt2683 ^ 0xffffffff) == -5) {
	    aClass1_2668 = arg0.getRSString(-10721);
	    aClass1_2640 = arg0.getRSString(-10721);
	}
	if (anInt2683 == 1 || (anInt2683 ^ 0xffffffff) == -4
	    || (anInt2683 ^ 0xffffffff) == -5)
	    anInt2647 = arg0.method491(-4750);
	if ((anInt2683 ^ 0xffffffff) == -4 || (anInt2683 ^ 0xffffffff) == -5) {
	    anInt2726 = arg0.method491(-4750);
	    anInt2719 = arg0.method491(-4750);
	    anInt2663 = arg0.method491(-4750);
	}
	if ((anInt2683 ^ 0xffffffff) == -6) {
	    anInt2744 = arg0.method491(-4750);
	    anInt2670 = arg0.method491(-4750);
	}
	if ((anInt2683 ^ 0xffffffff) == -7) {
	    anInt2687 = 1;
	    anInt2673 = arg0.method469(65280);
	    if (anInt2673 == 65535)
		anInt2673 = -1;
	    anInt2651 = 1;
	    anInt2711 = arg0.method469(65280);
	    if ((anInt2711 ^ 0xffffffff) == -65536)
		anInt2711 = -1;
	    anInt2659 = arg0.method469(65280);
	    if ((anInt2659 ^ 0xffffffff) == -65536)
		anInt2659 = -1;
	    anInt2653 = arg0.method469(65280);
	    if ((anInt2653 ^ 0xffffffff) == -65536)
		anInt2653 = -1;
	    anInt2728 = arg0.method469(65280);
	    anInt2690 = arg0.method469(65280);
	    anInt2657 = arg0.method469(65280);
	}
	if (anInt2683 == 7) {
	    anIntArray2685 = new int[anInt2692 * anInt2643];
	    anIntArray2710 = new int[anInt2692 * anInt2643];
	    anInt2733 = arg0.method468(false);
	    anInt2642 = arg0.method469(65280);
	    aBoolean2665 = arg0.method468(false) == 1;
	    anInt2647 = arg0.method491(-4750);
	    anInt2749 = arg0.method463((byte) -72);
	    anInt2667 = arg0.method463((byte) -122);
	    aBoolean2727 = (arg0.method468(false) ^ 0xffffffff) == -2;
	    aClass1Array2698 = new RSString[5];
	    for (int i_8_ = 0; i_8_ < 5; i_8_++) {
		aClass1Array2698[i_8_] = arg0.getRSString(-10721);
		if ((aClass1Array2698[i_8_].method59(-3136) ^ 0xffffffff)
		    == -1)
		    aClass1Array2698[i_8_] = null;
	    }
	}
	if ((anInt2683 ^ 0xffffffff) == -9)
	    aClass1_2668 = arg0.getRSString(-10721);
	if ((anInt2714 ^ 0xffffffff) == -3 || anInt2683 == 2) {
	    aClass1_2664 = arg0.getRSString(-10721);
	    aClass1_2709 = arg0.getRSString(-10721);
	    anInt2702 = arg0.method469(65280);
	}
	if ((anInt2714 ^ 0xffffffff) == -2 || (anInt2714 ^ 0xffffffff) == -5
	    || (anInt2714 ^ 0xffffffff) == -6
	    || (anInt2714 ^ 0xffffffff) == -7) {
	    aClass1_2676 = arg0.getRSString(-10721);
	    if ((aClass1_2676.method59(-3136) ^ 0xffffffff) == -1) {
		if ((anInt2714 ^ 0xffffffff) == -2)
		    aClass1_2676 = Class39.aClass1_919;
		if ((anInt2714 ^ 0xffffffff) == -5)
		    aClass1_2676 = RSRuntimeException.aClass1_1649;
		if ((anInt2714 ^ 0xffffffff) == -6)
		    aClass1_2676 = RSRuntimeException.aClass1_1649;
		if (anInt2714 == 6)
		    aClass1_2676 = Class3.aClass1_167;
	    }
	}
    }
    
    public DirectColorSprite method638(byte arg0, int arg1) {
	try {
	    anInt2675++;
	    Class40_Sub13.aBoolean2177 = false;
	    if ((arg1 ^ 0xffffffff) > -1 || anIntArray2704.length <= arg1)
		return null;
	    int i = anIntArray2704[arg1];
	    if ((i ^ 0xffffffff) == 0)
		return null;
	    int i_9_ = 124 % ((-15 - arg0) / 34);
	    DirectColorSprite class40_sub5_sub14_sub4
		= ((DirectColorSprite)
		   Cache.aClass9_326.method231((long) i, (byte) 121));
	    if (class40_sub5_sub14_sub4 != null)
		return class40_sub5_sub14_sub4;
	    class40_sub5_sub14_sub4
		= Class48.method927(0, Class40_Sub5_Sub15.aClass6_2779, true,
				    i);
	    if (class40_sub5_sub14_sub4 != null)
		Cache.aClass9_326.method230(-7208, (long) i,
					     class40_sub5_sub14_sub4);
	    else
		Class40_Sub13.aBoolean2177 = true;
	    return class40_sub5_sub14_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   "qd.E(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public static void method639(int arg0) {
	anInt2662++;
	synchronized (Class59.aClass54_1392) {
	    Class59.anInt1389 = Class52.anInt1214;
	    if (Class40_Sub5_Sub8.anInt2543 < 0) {
		for (int i = 0; (i ^ 0xffffffff) > -113; i++)
		    Class40_Sub5_Sub17_Sub3.aBooleanArray3056[i] = false;
		Class40_Sub5_Sub8.anInt2543 = Class40_Sub13.anInt2183;
	    } else {
		while ((Class40_Sub13.anInt2183 ^ 0xffffffff)
		       != (Class40_Sub5_Sub8.anInt2543 ^ 0xffffffff)) {
		    int i = RSString.anIntArray1706[Class40_Sub13.anInt2183];
		    Class40_Sub13.anInt2183
			= 0x7f & Class40_Sub13.anInt2183 - -1;
		    if ((i ^ 0xffffffff) > -1)
			Class40_Sub5_Sub17_Sub3.aBooleanArray3056
			    [i ^ 0xffffffff]
			    = false;
		    else
			Class40_Sub5_Sub17_Sub3.aBooleanArray3056[i] = true;
		}
	    }
	    Class52.anInt1214 = Class40_Sub5_Sub10.anInt2598;
	}
	if (arg0 <= 121)
	    aClass1_2674 = null;
    }
    
    public static void method640(byte arg0) {
	try {
	    Class68.aClass9_1615.method235((byte) 49);
	    if (arg0 < -11)
		anInt2652++;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "qd.K(" + arg0 + ')');
	}
    }
    
    public static void method641(int arg0) {
	try {
	    aClass1_2716 = null;
	    aClass1_2671 = null;
	    aClass1_2678 = null;
	    if (arg0 > -88)
		method648(85, (byte) 24);
	    aClass1_2706 = null;
	    aClass1_2686 = null;
	    aClass1_2691 = null;
	    aClass1_2729 = null;
	    aClass1_2637 = null;
	    aClass1_2674 = null;
	    aClass1_2740 = null;
	    aClass1_2684 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "qd.D(" + arg0 + ')');
	}
    }
    
    public static void method642(Component arg0, int arg1) {
	try {
	    if (arg1 != -10)
		method639(-106);
	    Method method = Signlink.aMethod729;
	    if (method != null) {
		try {
		    method.invoke(arg0, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    arg0.addKeyListener(Class59.aClass54_1392);
	    arg0.addFocusListener(Class59.aClass54_1392);
	    anInt2697++;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   ("qd.M(" + (arg0 != null ? "{...}" : "null")
				    + ',' + arg1 + ')'));
	}
    }
    
    public DirectColorSprite method643(int arg0, boolean arg1) {
	try {
	    Class40_Sub13.aBoolean2177 = false;
	    anInt2666++;
	    int i;
	    if (arg1)
		i = anInt2670;
	    else
		i = anInt2744;
	    if ((i ^ 0xffffffff) == 0)
		return null;
	    DirectColorSprite class40_sub5_sub14_sub4
		= ((DirectColorSprite)
		   Cache.aClass9_326.method231((long) i, (byte) 103));
	    if (arg0 != 127)
		aBoolean2636 = false;
	    if (class40_sub5_sub14_sub4 != null)
		return class40_sub5_sub14_sub4;
	    class40_sub5_sub14_sub4
		= Class48.method927(0, Class40_Sub5_Sub15.aClass6_2779, true,
				    i);
	    if (class40_sub5_sub14_sub4 == null)
		Class40_Sub13.aBoolean2177 = true;
	    else
		Cache.aClass9_326.method230(-7208, (long) i,
					     class40_sub5_sub14_sub4);
	    return class40_sub5_sub14_sub4;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   "qd.I(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public void method644(byte arg0, Buffer arg1) {
	arg1.method468(false);
	aBoolean2636 = true;
	anInt2683 = arg1.method468(false);
	anInt2639 = arg1.method469(65280);
	if (arg0 < 58)
	    method642(null, -90);
	anInt2649 = anInt2656 = arg1.method463((byte) -122);
	anInt2638++;
	anInt2743 = anInt2696 = arg1.method463((byte) -61);
	anInt2692 = arg1.method469(65280);
	if (anInt2683 == 9)
	    anInt2643 = arg1.method463((byte) -124);
	else
	    anInt2643 = arg1.method469(65280);
	anInt2648 = arg1.method469(65280);
	if (anInt2648 == 65535)
	    anInt2648 = -1;
	aBoolean2750 = (arg1.method468(false) ^ 0xffffffff) == -2;
	aBoolean2688 = (arg1.method468(false) ^ 0xffffffff) == -2;
	if (anInt2683 == 0) {
	    anInt2746 = arg1.method469(65280);
	    anInt2731 = arg1.method469(65280);
	}
	if ((anInt2683 ^ 0xffffffff) == -6) {
	    anInt2744 = arg1.method491(-4750);
	    anInt2751 = arg1.method469(65280);
	    aBoolean2641 = (arg1.method468(false) ^ 0xffffffff) == -2;
	    anInt2745 = arg1.method468(false);
	}
	if (anInt2683 == 6) {
	    anInt2687 = 1;
	    anInt2673 = arg1.method469(65280);
	    if ((anInt2673 ^ 0xffffffff) == -65536)
		anInt2673 = -1;
	    anInt2737 = arg1.method463((byte) -127);
	    anInt2679 = arg1.method463((byte) -120);
	    anInt2690 = arg1.method469(65280);
	    anInt2657 = arg1.method469(65280);
	    anInt2725 = arg1.method469(65280);
	    anInt2728 = arg1.method469(65280);
	    anInt2659 = arg1.method469(65280);
	    if ((anInt2659 ^ 0xffffffff) == -65536)
		anInt2659 = -1;
	    aBoolean2701 = arg1.method468(false) == 1;
	}
	if (anInt2683 == 4) {
	    anInt2642 = arg1.method469(65280);
	    aClass1_2668 = arg1.getRSString(-10721);
	    anInt2732 = arg1.method468(false);
	    anInt2733 = arg1.method468(false);
	    anInt2715 = arg1.method468(false);
	    aBoolean2665 = arg1.method468(false) == 1;
	    anInt2647 = arg1.method491(-4750);
	}
	if ((anInt2683 ^ 0xffffffff) == -4) {
	    anInt2647 = arg1.method491(-4750);
	    aBoolean2645 = (arg1.method468(false) ^ 0xffffffff) == -2;
	    anInt2745 = arg1.method468(false);
	}
	if (anInt2683 == 9) {
	    arg1.method468(false);
	    anInt2647 = arg1.method491(-4750);
	}
	if (aBoolean2688) {
	    anObjectArray2677 = Class25.method345((byte) 89, arg1);
	    anObjectArray2681 = Class25.method345((byte) 89, arg1);
	    anObjectArray2644 = Class25.method345((byte) 89, arg1);
	    anObjectArray2707 = Class25.method345((byte) 89, arg1);
	    anObjectArray2658 = Class25.method345((byte) 89, arg1);
	    anObjectArray2672 = Class25.method345((byte) 89, arg1);
	    anObjectArray2669 = Class25.method345((byte) 89, arg1);
	    Class25.method345((byte) 89, arg1);
	    anObjectArray2650 = Class25.method345((byte) 89, arg1);
	    anObjectArray2712 = Class25.method345((byte) 89, arg1);
	    Class25.method345((byte) 89, arg1);
	    anObjectArray2695 = Class25.method345((byte) 89, arg1);
	    anObjectArray2747 = Class25.method345((byte) 89, arg1);
	    anObjectArray2680 = Class25.method345((byte) 89, arg1);
	    aBoolean2727 = arg1.method468(false) == 1;
	    anInt2736 = arg1.method469(65280);
	    aBoolean2694 = arg1.method468(false) == 1;
	    arg1.method468(false);
	    int i = arg1.method468(false);
	    if (i > 0) {
		aClass1Array2661 = new RSString[i];
		for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_10_++)
		    aClass1Array2661[i_10_] = arg1.getRSString(-10721);
	    }
	    anInt2738 = arg1.method469(65280);
	    if ((anInt2738 ^ 0xffffffff) == -65536)
		anInt2738 = -1;
	}
    }
    
    public static void method645(byte arg0) {
	try {
	    Class58.aClass9_1364.method235((byte) 118);
	    anInt2739++;
	    Class46.aClass9_1102.method235((byte) -42);
	    if (arg0 != -37)
		aClass1_2637 = null;
	    Class19.aClass9_470.method235((byte) 103);
	    Class49.aClass9_1145.method235((byte) 97);
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "qd.L(" + arg0 + ')');
	}
    }
    
    public Model method646(byte arg0, Class40_Sub5_Sub7 arg1,
					     int arg2, boolean arg3,
					     Class30 arg4) {
	try {
	    Class40_Sub13.aBoolean2177 = false;
	    anInt2705++;
	    int i;
	    int i_11_;
	    if (arg3) {
		i_11_ = anInt2711;
		i = anInt2651;
	    } else {
		i = anInt2687;
		i_11_ = anInt2673;
	    }
	    if ((i ^ 0xffffffff) == -1)
		return null;
	    if ((i ^ 0xffffffff) == -2 && (i_11_ ^ 0xffffffff) == 0)
		return null;
	    if (arg0 <= 25)
		aBoolean2688 = true;
	    Model class40_sub5_sub17_sub5
		= ((Model)
		   Class53.aClass9_1264.method231((long) ((i << -983578160)
							  + i_11_),
						  (byte) 59));
	    if (class40_sub5_sub17_sub5 == null) {
		if ((i ^ 0xffffffff) == -2) {
		    class40_sub5_sub17_sub5
			= Model.method830(Cache.aClass6_329,
							    i_11_, 0);
		    if (class40_sub5_sub17_sub5 == null) {
			Class40_Sub13.aBoolean2177 = true;
			return null;
		    }
		    class40_sub5_sub17_sub5.method810();
		    class40_sub5_sub17_sub5.method802(64, 768, -50, -10, -50,
						      true);
		}
		if ((i ^ 0xffffffff) == -3) {
		    class40_sub5_sub17_sub5
			= Landscape.method932((byte) -101, i_11_)
			      .method575((byte) 122);
		    if (class40_sub5_sub17_sub5 == null) {
			Class40_Sub13.aBoolean2177 = true;
			return null;
		    }
		    class40_sub5_sub17_sub5.method810();
		    class40_sub5_sub17_sub5.method802(64, 768, -50, -10, -50,
						      true);
		}
		if ((i ^ 0xffffffff) == -4) {
		    if (arg4 == null)
			return null;
		    class40_sub5_sub17_sub5 = arg4.method379(30);
		    if (class40_sub5_sub17_sub5 == null) {
			Class40_Sub13.aBoolean2177 = true;
			return null;
		    }
		    class40_sub5_sub17_sub5.method810();
		    class40_sub5_sub17_sub5.method802(64, 768, -50, -10, -50,
						      true);
		}
		if ((i ^ 0xffffffff) == -5) {
		    ItemDefinition class40_sub5_sub16
			= Class44.method897(i_11_, 10);
		    class40_sub5_sub17_sub5
			= class40_sub5_sub16.method753(false, 10, 26910);
		    if (class40_sub5_sub17_sub5 == null) {
			Class40_Sub13.aBoolean2177 = true;
			return null;
		    }
		    class40_sub5_sub17_sub5.method810();
		    class40_sub5_sub17_sub5.method802(64 + (class40_sub5_sub16
							    .anInt2825),
						      768 + (class40_sub5_sub16
							     .anInt2840),
						      -50, -10, -50, true);
		}
		Class53.aClass9_1264.method230(-7208,
					       (long) ((i << -557905040)
						       + i_11_),
					       class40_sub5_sub17_sub5);
	    }
	    if (arg1 != null)
		class40_sub5_sub17_sub5
		    = arg1.method598(arg2, class40_sub5_sub17_sub5, true);
	    return class40_sub5_sub17_sub5;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   ("qd.F(" + arg0 + ','
				    + (arg1 != null ? "{...}" : "null") + ','
				    + arg2 + ',' + arg3 + ','
				    + (arg4 != null ? "{...}" : "null")
				    + ')'));
	}
    }
    
    public RSFont method647(byte arg0) {
	try {
	    Class40_Sub13.aBoolean2177 = false;
	    anInt2735++;
	    if ((anInt2642 ^ 0xffffffff) == -65536)
		return null;
	    RSFont class40_sub5_sub14_sub1
		= ((RSFont)
		   Class67.aClass9_1582.method231((long) anInt2642,
						  (byte) 67));
	    if (arg0 != 34)
		return null;
	    if (class40_sub5_sub14_sub1 != null)
		return class40_sub5_sub14_sub1;
	    class40_sub5_sub14_sub1
		= Class40_Sub5_Sub17_Sub1.method760(0, (byte) 36,
						    (Class40_Sub5_Sub15
						     .aClass6_2779),
						    anInt2642);
	    if (class40_sub5_sub14_sub1 == null)
		Class40_Sub13.aBoolean2177 = true;
	    else
		Class67.aClass9_1582.method230(-7208, (long) anInt2642,
					       class40_sub5_sub14_sub1);
	    return class40_sub5_sub14_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception, "qd.J(" + arg0 + ')');
	}
    }
    
    public static RSString method648(int arg0, byte arg1) {
	try {
	    anInt2724++;
	    if (arg1 != -100)
		return null;
	    if (arg0 < 100000)
		return HashTable.method334(arg0, -1);
	    if ((arg0 ^ 0xffffffff) > -10000001)
		return (Class40_Sub5_Sub17_Sub6.method832
			(110,
			 new RSString[] { HashTable.method334(arg0 / 1000, -1),
					Class40_Sub5_Sub10.aClass1_2587 }));
	    return (Class40_Sub5_Sub17_Sub6.method832
		    (-84, new RSString[] { HashTable.method334(arg0 / 1000000,
							   arg1 ^ 0x63),
					 Class22.aClass1_542 }));
	} catch (RuntimeException runtimeexception) {
	    throw Class8.method216(runtimeexception,
				   "qd.C(" + arg0 + ',' + arg1 + ')');
	}
    }
    
    public Class40_Sub5_Sub12() {
	anInt2639 = 0;
	anInt2657 = 0;
	aBoolean2665 = false;
	aBoolean2641 = false;
	aClass1_2664 = Class22_Sub2.aClass1_1877;
	anInt2654 = 0;
	aClass1_2676 = Class39.aClass1_919;
	anInt2667 = 0;
	anInt2660 = 0;
	anInt2687 = 1;
	anInt2653 = -1;
	anInt2647 = 0;
	aBoolean2682 = false;
	anInt2673 = -1;
	anInt2690 = 0;
	anInt2702 = 0;
	aBoolean2694 = false;
	anInt2648 = -1;
	anInt2663 = 0;
	aBoolean2688 = false;
	anInt2670 = -1;
	anInt2696 = 0;
	anInt2711 = -1;
	anInt2649 = 0;
	aBoolean2727 = false;
	aClass1_2640 = Class22_Sub2.aClass1_1877;
	aBoolean2703 = false;
	anInt2719 = 0;
	anInt2692 = 0;
	anInt2659 = -1;
	anInt2733 = 0;
	anInt2721 = -1;
	aClass1_2709 = Class22_Sub2.aClass1_1877;
	anInt2679 = 0;
	anInt2734 = 0;
	aClass1_2668 = Class22_Sub2.aClass1_1877;
	anInt2689 = -1;
	anInt2732 = 0;
	aBoolean2655 = false;
	aBoolean2645 = false;
	anInt2738 = -1;
	anInt2728 = 100;
	aBoolean2723 = false;
	anInt2722 = 0;
	anInt2715 = 0;
	anInt2656 = 0;
	aBoolean2701 = false;
	anInt2744 = -1;
	aBoolean2730 = false;
	anInt2643 = 0;
	anInt2745 = 0;
	anInt2743 = 0;
	anInt2725 = 0;
	anInt2746 = 0;
	anInt2737 = 0;
	aBoolean2750 = false;
	anInt2726 = 0;
	anInt2720 = 0;
	anInt2731 = 0;
	anInt2736 = 0;
	anInt2718 = -1;
	anInt2749 = 0;
	anInt2714 = 0;
	anInt2751 = 0;
    }
    
    static {
	aClass1_2678
	    = Class58.method978(-11538, "Enter name of friend to add to list");
	aClass1_2729 = Class58.method978(-11538, "@cr2@");
	aClass1_2684 = aClass1_2706;
	aClass1_2691 = Class58.method978(-11538, "::errortest");
	aClass1_2716
	    = Class58.method978(-11538,
				"Fehler beim Laden Ihres Charakter)2Profils");
	aClass1_2671 = aClass1_2637;
	packetsize = 0;
	aClass1_2740 = aClass1_2678;
	aClass1_2686 = Class58.method978(-11538, "Starting game engine)3)3)3");
	aClass1_2674 = aClass1_2686;
    }
}