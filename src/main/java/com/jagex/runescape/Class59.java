package com.jagex.runescape;

import com.jagex.runescape.cache.def.OverlayDefinition;
import com.jagex.runescape.cache.media.IndexedImage;
import com.jagex.runescape.input.KeyFocusListener;
import com.jagex.runescape.input.MouseHandler;
import com.jagex.runescape.io.Buffer;
import com.jagex.runescape.media.VertexNormal;
import com.jagex.runescape.media.renderable.actor.Player;
import com.jagex.runescape.net.PacketBuffer;
import com.jagex.runescape.scene.Scene;
import com.jagex.runescape.scene.SceneCluster;

public class Class59 {
    public static int anInt1383;
    public static Buffer aClass40_Sub1_1385 = new Buffer(new byte[5000]);
    public static int anInt1386;
    public static IndexedImage aClass40_Sub5_Sub14_Sub2_1387;
    public static int anInt1388;
    public static int anInt1389 = 0;
    public static KeyFocusListener keyFocusListener;
    public static int[] secondMenuOperand;
    public static long[] friends;
    public static int[] anIntArray1398;

    static {
        secondMenuOperand = new int[500];
        friends = new long[200];
        keyFocusListener = new KeyFocusListener();
    }

    public static void dropClient() {
        if(SceneCluster.idleLogout > 0)
            Class48.logout(-7225);
        else {
            OverlayDefinition.method559(40);
            Class30.aClass64_717 = Class40_Sub6.gameConnection;
            Class40_Sub6.gameConnection = null;
        }
    }

    public static void setLowMemory() {
        Scene.lowMemory = true;
        VertexNormal.lowMemory = true;
    }

    public static void method984() {
    	if(Class5.aClass22_189 != null) {
    		if(MouseHandler.anInt1450 >= 0) {
    			if(RSCanvas.anInt54 > 0) {
    				Class39.anInt909 += Buffer.anInt1982;
    				Class5.aClass22_189.method304(MouseHandler.anInt1450, Class39.anInt909);
    				RSCanvas.anInt54--;
    				if(RSCanvas.anInt54 == 0) {
    					Class5.aClass22_189.stop();
    					MouseHandler.anInt1450 = -1;
    					RSCanvas.anInt54 = 20;
    				}
    			}
    		} else if(RSCanvas.anInt54 > 0) {
    			RSCanvas.anInt54--;
    			if(RSCanvas.anInt54 == 0) {
    				if(Player.aByteArray3270 == null)
    					Class5.aClass22_189.method301(256);
    				else {
    					Class5.aClass22_189.method301(PacketBuffer.anInt2258);
    					MouseHandler.anInt1450 = PacketBuffer.anInt2258;
    					Class5.aClass22_189.method300(Player.aByteArray3270, Class30.aBoolean687, PacketBuffer.anInt2258);
    					Player.aByteArray3270 = null;
    				}
    				Class39.anInt909 = 0;
    			}
    		}
    		Class5.aClass22_189.method302(0);
    	}
    }


    public static int getVisibilityPlaneFor(int arg0, int arg1, int arg2, int arg3) {
        if(arg2 != 0)
            getVisibilityPlaneFor(-73, 123, 115, 98);
        if((OverlayDefinition.tile_flags[arg0][arg3][arg1] & 0x8) != 0)
            return 0;
        if(arg0 > 0 && (OverlayDefinition.tile_flags[1][arg3][arg1] & 0x2) != 0)
            return -1 + arg0;
        return arg0;
    }
}
