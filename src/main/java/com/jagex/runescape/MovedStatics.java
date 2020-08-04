package com.jagex.runescape;

import java.awt.Component;

import com.jagex.runescape.cache.Cache;
import com.jagex.runescape.cache.CacheIndex;
import com.jagex.runescape.cache.def.ActorDefinition;
import com.jagex.runescape.cache.def.GameObjectDefinition;
import com.jagex.runescape.cache.def.IdentityKit;
import com.jagex.runescape.cache.def.ItemDefinition;
import com.jagex.runescape.cache.def.OverlayDefinition;
import com.jagex.runescape.cache.def.UnderlayDefinition;
import com.jagex.runescape.cache.def.VarbitDefinition;
import com.jagex.runescape.cache.media.AnimationSequence;
import com.jagex.runescape.cache.media.ImageRGB;
import com.jagex.runescape.cache.media.IndexedImage;
import com.jagex.runescape.cache.media.SpotAnimDefinition;
import com.jagex.runescape.cache.media.Widget.Widget;
import com.jagex.runescape.collection.Node;
import com.jagex.runescape.frame.ChatBox;
import com.jagex.runescape.frame.ScreenController;
import com.jagex.runescape.frame.ScreenMode;
import com.jagex.runescape.input.KeyFocusListener;
import com.jagex.runescape.input.MouseHandler;
import com.jagex.runescape.io.Buffer;
import com.jagex.runescape.language.English;
import com.jagex.runescape.language.Native;
import com.jagex.runescape.media.Rasterizer3D;
import com.jagex.runescape.media.renderable.GameObject;
import com.jagex.runescape.media.renderable.Item;
import com.jagex.runescape.media.renderable.Model;
import com.jagex.runescape.media.renderable.Renderable;
import com.jagex.runescape.media.renderable.actor.Actor;
import com.jagex.runescape.media.renderable.actor.Npc;
import com.jagex.runescape.media.renderable.actor.Player;
import com.jagex.runescape.net.ISAAC;
import com.jagex.runescape.scene.GroundItemTile;
import com.jagex.runescape.scene.InteractiveObject;
import com.jagex.runescape.scene.SceneCluster;
import com.jagex.runescape.scene.tile.SceneTile;
import com.jagex.runescape.scene.tile.Wall;
import com.jagex.runescape.scene.tile.WallDecoration;
import com.jagex.runescape.scene.util.CollisionMap;
import com.jagex.runescape.util.Signlink;

public class MovedStatics {

	public static int[] anIntArray1909 = new int[99];

    static {
        int i = 0;
        for(int i_27_ = 0; i_27_ < 99; i_27_++) {
            int i_28_ = i_27_ + 1;
            int i_29_ = (int) ((double) i_28_ + 300.0 * Math.pow(2.0, (double) i_28_ / 7.0));
            i += i_29_;
            MovedStatics.anIntArray1909[i_27_] = i / 4;
        }
    }

	public static void method440(byte arg0) {
	    if(ISAAC.aBoolean512) {
	        Class51.anIntArray1198 = null;
	        GameObject.flameRightBackground = null;
	        ProducingGraphicsBuffer.aProducingGraphicsBuffer_1631 = null;
	        Class51.aProducingGraphicsBuffer_1206 = null;
	        Landscape.anIntArray1168 = null;
	        Class40_Sub5_Sub17_Sub6.anIntArray3255 = null;
	        Class59.aClass40_Sub5_Sub14_Sub2_1387 = null;
	        Class61.anIntArray1445 = null;
	        Class40_Sub5_Sub15.aClass40_Sub5_Sub14_Sub2_2775 = null;
	        Renderable.anIntArray2865 = null;
	        Class8.flameLeftBackground = null;
	        Class39.aProducingGraphicsBuffer_907 = null;
	        GameObjectDefinition.aProducingGraphicsBuffer_2524 = null;
	        Class39.aClass40_Sub5_Sub14_Sub4_918 = null;
	        MovedStatics.aClass40_Sub5_Sub14_Sub2Array535 = null;
	        Class40_Sub5_Sub17_Sub6.anIntArray3248 = null;
	        MovedStatics.loginBoxGraphics = null;
	        SceneTile.aClass40_Sub5_Sub14_Sub4_2043 = null;
	        Class4.anIntArray178 = null;
	        KeyFocusListener.aProducingGraphicsBuffer_1285 = null;
	        if(arg0 <= -65) {
	            Class17.aProducingGraphicsBuffer_463 = null;
	            Class42.anIntArray1013 = null;
	            Class33.method405(16969, 10);
	            GameShell.method19(true, 24041);
	            ISAAC.aBoolean512 = false;
	        }
	    }
	}

	public static void method441(CacheIndex arg0) {
	    Actor.aCacheIndex_3144 = arg0;
	}

	public static int[] menuActionTypes = new int[500];
	public static ProducingGraphicsBuffer loginBoxGraphics;
	public static int anInt892;
	public static boolean aBoolean893 = false;
	public static int[] anIntArray1916 = new int[50];
	public static IndexedImage aClass40_Sub5_Sub14_Sub2_1919;
	public static int anInt1923 = 0;
	public static void method445(int arg0) {
	    if(CollisionMap.anInt165 != 0) {
	        int i = 0;
	        if(Class40_Sub5_Sub15.systemUpdateTime != 0)
	            i = 1;
	        for(int i_1_ = 0; i_1_ < 100; i_1_++) {
	            if(ChatBox.chatMessages[i_1_] != null) {
	                int i_2_ = ChatBox.chatTypes[i_1_];
	                String class1 = ChatBox.chatPlayerNames[i_1_];
	                if(class1 != null && class1.startsWith(Native.whiteCrown))
	                    class1 = class1.substring(5);
	                if(class1 != null && class1.startsWith(Native.goldCrown))
	                    class1 = class1.substring(5);
	                if((i_2_ == 3 || i_2_ == 7) && (i_2_ == 7 || ChatBox.privateChatMode == 0 || ChatBox.privateChatMode == 1 && Class40_Sub2.hasFriend(class1))) {
	                    int i_3_ = 329 + -(13 * i);
	                    i++;
	                    if(Class13.mouseX > 4 && i_3_ + -10 < Landscape.mouseY + -4 && -4 + Landscape.mouseY <= i_3_ + 3) {
	                        int i_4_ = 25 + WallDecoration.fontNormal.getStringWidth(English.from + Native.prefixColon+ class1+ ChatBox.chatMessages[i_1_]);
	                        if(i_4_ > 450)
	                            i_4_ = 450;
	                        if(Class13.mouseX < 4 + i_4_) {
	                            if(InteractiveObject.playerRights >= 1) {
	                                OverlayDefinition.addActionRow(English.reportAbuse, 0, 0, 0, 2028, Native.aClass1_620+ class1);
	                            }
	                            OverlayDefinition.addActionRow(English.addIgnore, 0, 0, 0, 2051, Native.aClass1_620+ class1);
	                            OverlayDefinition.addActionRow(English.addFriend, 0, 0, 0, 2045, Native.aClass1_620+ class1);
	                        }
	                    }
	                    if(i >= 5)
	                        return;
	                }
	                if((i_2_ == 5 || i_2_ == 6) && ChatBox.privateChatMode < 2 && ++i >= 5)
	                    return;
	            }
	        }
	        if(arg0 != 9767)
	            anInt1923 = 48;
	    }
	}

	public static boolean method446(Signlink arg0, int arg1, boolean arg2, byte arg3) {
	    if(arg3 != 30)
	        MovedStatics.doWalkTo(47, -7, 96, -97, -111, true, -110, 57, -36, -84, -42);
	    if(!Class39.method452(arg0, arg2))
	        return false;
	    if(arg1 > 0)
	        RSString.aClass9_1684 = new Cache(arg1);
	    return true;
	}

	public static boolean doWalkTo(int arg0, int arg1, int startX, int endX, int objectType, boolean flag, int arg7, int arg8, int startY, int endY, int clickType) {
	    for(int x = 0; x < 104; x++) {
	        for(int y = 0; y < 104; y++) {
	            Class57.wayPoints[x][y] = 0;
	            Landscape.distanceValues[x][y] = 99999999;
	        }
	    }
	    int currentX = startX;
	    int currentY = startY;
	    Class57.wayPoints[startX][startY] = 99;
	    Landscape.distanceValues[startX][startY] = 0;
	    int nextIndex = 0;
	    int currentIndex = 0;
	    Class24.walkingQueueX[nextIndex] = startX;
	    Wall.walkingQueueY[nextIndex++] = startY;
	    boolean foundDestination = false;
	    int maxPathSize = Class24.walkingQueueX.length;
	    int[][] clippingPaths = Landscape.currentCollisionMap[Player.worldLevel].clippingData;
	    while(currentIndex != nextIndex) {
	        currentY = Wall.walkingQueueY[currentIndex];
	        currentX = Class24.walkingQueueX[currentIndex];
	        currentIndex = (currentIndex + 1) % maxPathSize;
	        if(currentX == endX && currentY == endY) {
	            foundDestination = true;
	            break;
	        }
	        if(objectType != 0) {
	            if(objectType >= 5 && objectType != 10 || !Landscape.currentCollisionMap[Player.worldLevel].reachedWall(currentX, currentY, endX, endY, objectType + -1, arg7)) {
	                if(objectType < 10 && Landscape.currentCollisionMap[Player.worldLevel].reachedWallDecoration(currentX, currentY, endX, endY, -1 + objectType, arg7)) {
	                    foundDestination = true;
	                    break;
	                }
	            } else {
	                foundDestination = true;
	                break;
	            }
	        }
	        if(arg0 != 0 && arg8 != 0 && Landscape.currentCollisionMap[Player.worldLevel].reachedFacingObject(currentX, currentY, endX, endY, arg0, arg8, arg1)) {
	            foundDestination = true;
	            break;
	        }
	        int newDistanceValue = Landscape.distanceValues[currentX][currentY] + 1;
	        if(currentX > 0 && Class57.wayPoints[-1 + currentX][currentY] == 0 && (0x1280108 & clippingPaths[currentX - 1][currentY]) == 0) {
	            Class24.walkingQueueX[nextIndex] = currentX - 1;
	            Wall.walkingQueueY[nextIndex] = currentY;
	            nextIndex = (1 + nextIndex) % maxPathSize;
	            Class57.wayPoints[-1 + currentX][currentY] = 2;
	            Landscape.distanceValues[currentX - 1][currentY] = newDistanceValue;
	        }
	        if(currentX < 103 && Class57.wayPoints[currentX + 1][currentY] == 0 && (clippingPaths[1 + currentX][currentY] & 0x1280180) == 0) {
	            Class24.walkingQueueX[nextIndex] = currentX + 1;
	            Wall.walkingQueueY[nextIndex] = currentY;
	            nextIndex = (nextIndex + 1) % maxPathSize;
	            Class57.wayPoints[currentX + 1][currentY] = 8;
	            Landscape.distanceValues[currentX + 1][currentY] = newDistanceValue;
	        }
	        if(currentY > 0 && Class57.wayPoints[currentX][currentY - 1] == 0 && (clippingPaths[currentX][-1 + currentY] & 0x1280102) == 0) {
	            Class24.walkingQueueX[nextIndex] = currentX;
	            Wall.walkingQueueY[nextIndex] = -1 + currentY;
	            Class57.wayPoints[currentX][-1 + currentY] = 1;
	            nextIndex = (nextIndex + 1) % maxPathSize;
	            Landscape.distanceValues[currentX][currentY - 1] = newDistanceValue;
	        }
	        if(currentY < 103 && Class57.wayPoints[currentX][currentY + 1] == 0 && (clippingPaths[currentX][currentY + 1] & 0x1280120) == 0) {
	            Class24.walkingQueueX[nextIndex] = currentX;
	            Wall.walkingQueueY[nextIndex] = 1 + currentY;
	            Class57.wayPoints[currentX][currentY + 1] = 4;
	            Landscape.distanceValues[currentX][1 + currentY] = newDistanceValue;
	            nextIndex = (nextIndex + 1) % maxPathSize;
	        }
	        if(currentX > 0 && currentY > 0 && Class57.wayPoints[-1 + currentX][currentY - 1] == 0 && (clippingPaths[currentX - 1][-1 + currentY] & 0x128010e) == 0 && (0x1280108 & clippingPaths[currentX + -1][currentY]) == 0 && (clippingPaths[currentX][-1 + currentY] & 0x1280102) == 0) {
	            Class24.walkingQueueX[nextIndex] = -1 + currentX;
	            Wall.walkingQueueY[nextIndex] = currentY - 1;
	            nextIndex = (nextIndex + 1) % maxPathSize;
	            Class57.wayPoints[currentX + -1][-1 + currentY] = 3;
	            Landscape.distanceValues[-1 + currentX][currentY + -1] = newDistanceValue;
	        }
	        if(currentX < 103 && currentY > 0 && Class57.wayPoints[currentX + 1][-1 + currentY] == 0 && (clippingPaths[1 + currentX][-1 + currentY] & 0x1280183) == 0 && (clippingPaths[currentX + 1][currentY] & 0x1280180) == 0 && (0x1280102 & clippingPaths[currentX][-1 + currentY]) == 0) {
	            Class24.walkingQueueX[nextIndex] = 1 + currentX;
	            Wall.walkingQueueY[nextIndex] = currentY - 1;
	            nextIndex = (nextIndex + 1) % maxPathSize;
	            Class57.wayPoints[1 + currentX][-1 + currentY] = 9;
	            Landscape.distanceValues[currentX + 1][-1 + currentY] = newDistanceValue;
	        }
	        if(currentX > 0 && currentY < 103 && Class57.wayPoints[currentX + -1][currentY + 1] == 0 && (0x1280138 & clippingPaths[-1 + currentX][1 + currentY]) == 0 && (0x1280108 & clippingPaths[currentX - 1][currentY]) == 0 && (clippingPaths[currentX][currentY + 1] & 0x1280120) == 0) {
	            Class24.walkingQueueX[nextIndex] = -1 + currentX;
	            Wall.walkingQueueY[nextIndex] = 1 + currentY;
	            Class57.wayPoints[currentX - 1][1 + currentY] = 6;
	            Landscape.distanceValues[-1 + currentX][currentY + 1] = newDistanceValue;
	            nextIndex = (1 + nextIndex) % maxPathSize;
	        }
	        if(currentX < 103 && currentY < 103 && Class57.wayPoints[1 + currentX][1 + currentY] == 0 && (0x12801e0 & clippingPaths[currentX + 1][currentY + 1]) == 0 && (0x1280180 & clippingPaths[1 + currentX][currentY]) == 0 && (clippingPaths[currentX][1 + currentY] & 0x1280120) == 0) {
	            Class24.walkingQueueX[nextIndex] = 1 + currentX;
	            Wall.walkingQueueY[nextIndex] = currentY + 1;
	            nextIndex = (nextIndex + 1) % maxPathSize;
	            Class57.wayPoints[1 + currentX][1 + currentY] = 12;
	            Landscape.distanceValues[1 + currentX][1 + currentY] = newDistanceValue;
	        }
	    }
	    Class40_Sub5_Sub15.arbitraryDestination = 0;
	    if(!foundDestination) {
	        if(flag) {
	            int i_14_ = 1000;
	            int deviation = 10;
	            int maxStepsNonInclusive = 100;
	            for(int deviationX = endX + -deviation; endX + deviation >= deviationX; deviationX++) {
	                for(int deviationY = -deviation + endY; endY + deviation >= deviationY; deviationY++) {
	                    if(deviationX >= 0 && deviationY >= 0 && deviationX < 104 && deviationY < 104 && Landscape.distanceValues[deviationX][deviationY] < 100) {
	                        int i_19_ = 0;
	                        int i_20_ = 0;
	                        if(deviationY < endY)
	                            i_19_ = endY - deviationY;
	                        else if(deviationY > endY - (-arg8 + 1))
	                            i_19_ = deviationY + -arg8 + -endY + 1;
	                        if(deviationX < endX)
	                            i_20_ = -deviationX + endX;
	                        else if(-1 + arg0 + endX < deviationX)
	                            i_20_ = deviationX + -arg0 + -endX + 1;
	                        int i_21_ = i_19_ * i_19_ + i_20_ * i_20_;
	                        if(i_14_ > i_21_ || i_21_ == i_14_ && Landscape.distanceValues[deviationX][deviationY] < maxStepsNonInclusive) {
	                            currentY = deviationY;
	                            i_14_ = i_21_;
	                            currentX = deviationX;
	                            maxStepsNonInclusive = Landscape.distanceValues[deviationX][deviationY];
	                        }
	                    }
	                }
	            }
	            if(i_14_ == 1000)
	                return false;
	            if(startX == currentX && startY == currentY)
	                return false;
	            Class40_Sub5_Sub15.arbitraryDestination = 1;
	        } else {
	            return false;
	        }
	    }
	    currentIndex = 0;
	    Class24.walkingQueueX[currentIndex] = currentX;
	    Wall.walkingQueueY[currentIndex++] = currentY;
	    int initialSkipCheck;
	    int waypoint = initialSkipCheck = Class57.wayPoints[currentX][currentY];
	    while(currentX != startX || startY != currentY) {
	        if(waypoint != initialSkipCheck) {
	            initialSkipCheck = waypoint;
	            Class24.walkingQueueX[currentIndex] = currentX;
	            Wall.walkingQueueY[currentIndex++] = currentY;
	        }
	        if((waypoint & 0x1) != 0)
	            currentY++;
	        else if((waypoint & 0x4) != 0)
	            currentY--;
	        if((waypoint & 0x2) != 0)
	            currentX++;
	        else if((waypoint & 0x8) != 0)
	            currentX--;
	        waypoint = Class57.wayPoints[currentX][currentY];
	    }
	    if(currentIndex > 0) {
	        maxPathSize = currentIndex;
	        if(maxPathSize > 25)
	            maxPathSize = 25;
	        currentIndex--;
	        int x = Class24.walkingQueueX[currentIndex];
	        int y = Wall.walkingQueueY[currentIndex];
	        if(clickType == 0) {
	            SceneCluster.packetBuffer.putPacket(73);
	            SceneCluster.packetBuffer.putByte(3 + maxPathSize + maxPathSize);
	        }
	        if(clickType == 1) {
	            SceneCluster.packetBuffer.putPacket(236);
	            SceneCluster.packetBuffer.putByte(14 + maxPathSize + maxPathSize + 3);
	        }
	        if(clickType == 2) {
	            SceneCluster.packetBuffer.putPacket(89);
	            SceneCluster.packetBuffer.putByte(3 + maxPathSize + maxPathSize);
	        }
	        SceneCluster.packetBuffer.putShortLE(y + Class26.baseY);
	        SceneCluster.packetBuffer.putByte(Item.obfuscatedKeyStatus[82] ? 1 : 0);
	        SceneCluster.packetBuffer.putShortLE(SpotAnimDefinition.baseX + x);
	        VarbitDefinition.destinationX = Class24.walkingQueueX[0];
	        Class55.destinationY = Wall.walkingQueueY[0];
	        for(int counter = 1; maxPathSize > counter; counter++) {
	            currentIndex--;
	            SceneCluster.packetBuffer.putByte(Class24.walkingQueueX[currentIndex] - x);
	            SceneCluster.packetBuffer.putByte(-y + Wall.walkingQueueY[currentIndex]);
	        }
	        return true;
	    }
	    return clickType != 1;
	}

	public static void method450(byte arg0) {
	    if(Player.headIconDrawType == 2) {
	        if(arg0 >= -28)
	            method445(-128);
	        MovedStatics.method312(2 * ActorDefinition.anInt2404, Class35.anInt1730 + (-Class26.baseY + Class4.anInt175 << 7), (ProducingGraphicsBuffer.anInt1637 + -SpotAnimDefinition.baseX << 7) + Landscape.anInt1170, 4976905);
	        if(ISAAC.anInt522 > -1 && Node.pulseCycle % 20 < 10)
	            UnderlayDefinition.aClass40_Sub5_Sub14_Sub4Array2567[0].drawImage(ISAAC.anInt522 + -12, -28 + Class44.anInt1048);
	    }
	}

	public static int method420(int arg0, int arg1, boolean arg2) {
	    if(arg0 == -2)
	        return 12345678;
	    if(arg0 == -1) {
	        if(arg1 < 0)
	            arg1 = 0;
	        else if(arg1 > 127)
	            arg1 = 127;
	        arg1 = -arg1 + 127;
	        return arg1;
	    }
	    if(!arg2)
	        Class34.method415(-124, -88);
	    arg1 = arg1 * (arg0 & 0x7f) / 128;
	    if(arg1 < 2)
	        arg1 = 2;
	    else if(arg1 > 126)
	        arg1 = 126;
	    return (0xff80 & arg0) + arg1;
	}

	public static void method312(int arg0, int arg1, int arg2, int arg3) {
	    if(arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
	        Class44.anInt1048 = -1;
	        ISAAC.anInt522 = -1;
	    } else {
	        int i = Class37.getFloorDrawHeight(Player.worldLevel, arg2, arg1) + -arg0;
	        arg1 -= Class40_Sub5_Sub6.cameraY;
	        i -= SceneCluster.cameraZ;
	        int i_1_ = Model.COSINE[Class26.anInt627];
	        int i_2_ = Model.SINE[Class26.anInt627];
	        arg2 -= Class12.cameraX;
	        int i_3_ = Model.SINE[ProducingGraphicsBuffer_Sub1.anInt2210];
	        int i_4_ = Model.COSINE[ProducingGraphicsBuffer_Sub1.anInt2210];
	        int i_5_ = arg1 * i_3_ + arg2 * i_4_ >> 16;
	        arg1 = i_4_ * arg1 - arg2 * i_3_ >> 16;
	        if(arg3 != 4976905)
	            English.password = null;
	        arg2 = i_5_;
	        i_5_ = i * i_1_ - arg1 * i_2_ >> 16;
	        arg1 = arg1 * i_1_ + i * i_2_ >> 16;
	        i = i_5_;
	        if(arg1 < 50) {
	            Class44.anInt1048 = -1;
	            ISAAC.anInt522 = -1;
	        } else {
	            if(ScreenController.frameMode == ScreenMode.FIXED){
	                ISAAC.anInt522 = 256 + (arg2 << 9) / arg1;
	                Class44.anInt1048 = (i << 9) / arg1 + 167;
	            } else {
	                ISAAC.anInt522 = ScreenController.frameWidth/2 + (arg2 << 9) / arg1;
	                Class44.anInt1048 = (i << 9) / arg1 +  ScreenController.frameHeight/2;
	            }
	
	        }
	    }
	}

	public static void method311(Component arg1) {
	    arg1.removeKeyListener(Class59.keyFocusListener);
	    arg1.removeFocusListener(Class59.keyFocusListener);
	}

	public static void method313() {
	    for(int i = -1; Player.localPlayerCount > i; i++) {
	        int i_6_;
	        if(i == -1)
	            i_6_ = 2047;
	        else
	            i_6_ = Player.trackedPlayerIndices[i];
	        Player class40_sub5_sub17_sub4_sub1 = Player.trackedPlayers[i_6_];
	        if(class40_sub5_sub17_sub4_sub1 != null && class40_sub5_sub17_sub4_sub1.anInt3078 > 0) {
	            class40_sub5_sub17_sub4_sub1.anInt3078--;
	            if(class40_sub5_sub17_sub4_sub1.anInt3078 == 0)
	                class40_sub5_sub17_sub4_sub1.forcedChatMessage = null;
	        }
	    }
	    for(int i_7_ = 0; i_7_ < Player.npcCount; i_7_++) {
	        int i_8_ = Player.npcIds[i_7_];
	        Npc class40_sub5_sub17_sub4_sub2 = Player.npcs[i_8_];
	        if(class40_sub5_sub17_sub4_sub2 != null && class40_sub5_sub17_sub4_sub2.anInt3078 > 0) {
	            class40_sub5_sub17_sub4_sub2.anInt3078--;
	            if(class40_sub5_sub17_sub4_sub2.anInt3078 == 0)
	                class40_sub5_sub17_sub4_sub2.forcedChatMessage = null;
	        }
	    }
	}

	public static int anInt1856;
	public static CacheIndex aCacheIndex_1855;
	public static int[] anIntArray1846 = new int[5];
	public static long aLong1841;
	public static void method299(byte arg0, int arg1) {
	    int[] is = Class40_Sub5_Sub13.minimapImage.pixels;
	    int i = is.length;
	    for(int i_0_ = 0; i > i_0_; i_0_++)
	        is[i_0_] = 0;
	    for(int i_1_ = 1; i_1_ < 103; i_1_++) {
	        int i_2_ = 24628 + (-(512 * i_1_) + 52736) * 4;
	        for(int i_3_ = 1; i_3_ < 103; i_3_++) {
	            if((0x18 & OverlayDefinition.tile_flags[arg1][i_3_][i_1_]) == 0)
	                Npc.currentScene.method96(is, i_2_, 512, arg1, i_3_, i_1_);
	            if(arg1 < 3 && (OverlayDefinition.tile_flags[1 + arg1][i_3_][i_1_] & 0x8) != 0)
	                Npc.currentScene.method96(is, i_2_, 512, 1 + arg1, i_3_, i_1_);
	            i_2_ += 4;
	        }
	    }
	    Class40_Sub5_Sub13.minimapImage.method723();
	    int i_4_ = (-10 + (int) (Math.random() * 20.0) + 238 << 8) + (228 + (int) (Math.random() * 20.0) << 16) + 238 + (int) (20.0 * Math.random()) + -10;
	    int i_5_ = -10 + (int) (20.0 * Math.random()) + 238 << 16;
	    for(int i_6_ = 1; i_6_ < 103; i_6_++) {
	        for(int i_7_ = 1; i_7_ < 103; i_7_++) {
	            if((OverlayDefinition.tile_flags[arg1][i_7_][i_6_] & 0x18) == 0)
	                Actor.method781(1850, arg1, i_7_, i_4_, i_5_, i_6_);
	            if(arg1 < 3 && (0x8 & OverlayDefinition.tile_flags[1 + arg1][i_7_][i_6_]) != 0)
	                Actor.method781(1850, 1 + arg1, i_7_, i_4_, i_5_, i_6_);
	        }
	    }
	    GameObject.minimapHintCount = 0;
	    if(arg0 < 24)
	        Player.trackedPlayerAppearanceCache = null;
	    for(int i_8_ = 0; i_8_ < 104; i_8_++) {
	        for(int i_9_ = 0; i_9_ < 104; i_9_++) {
	            int i_10_ = Npc.currentScene.getFloorDecorationHash(Player.worldLevel, i_8_, i_9_);
	            if(i_10_ != 0) {
	                i_10_ = 0x7fff & i_10_ >> 14;
	                int i_11_ = GameObjectDefinition.getDefinition(i_10_).icon;
	                if(i_11_ >= 0) {
	                    int i_12_ = i_9_;
	                    int i_13_ = i_8_;
	                    if(i_11_ != 22 && i_11_ != 29 && i_11_ != 34 && i_11_ != 36 && i_11_ != 46 && i_11_ != 47 && i_11_ != 48) {
	                        int[][] is_14_ = Landscape.currentCollisionMap[Player.worldLevel].clippingData;
	                        for(int i_15_ = 0; i_15_ < 10; i_15_++) {
	                            int i_16_ = (int) (Math.random() * 4.0);
	                            if(i_16_ == 0 && i_13_ > 0 && i_13_ > -3 + i_8_ && (is_14_[-1 + i_13_][i_12_] & 0x1280108) == 0)
	                                i_13_--;
	                            if(i_16_ == 1 && i_13_ < 103 && i_13_ < i_8_ + 3 && (is_14_[i_13_ + 1][i_12_] & 0x1280180) == 0)
	                                i_13_++;
	                            if(i_16_ == 2 && i_12_ > 0 && i_12_ > -3 + i_9_ && (is_14_[i_13_][i_12_ - 1] & 0x1280102) == 0)
	                                i_12_--;
	                            if(i_16_ == 3 && i_12_ < 103 && 3 + i_9_ > i_12_ && (0x1280120 & is_14_[i_13_][1 + i_12_]) == 0)
	                                i_12_++;
	                        }
	                    }
	                    MouseHandler.minimapHint[GameObject.minimapHintCount] = Class8.aClass40_Sub5_Sub14_Sub4Array296[i_11_];
	                    Actor.minimapHintX[GameObject.minimapHintCount] = i_13_;
	                    LinkedList.minimapHintY[GameObject.minimapHintCount] = i_12_;
	                    GameObject.minimapHintCount++;
	                }
	            }
	        }
	    }
	}

	public static void method305() {
	//        if(ScreenController.frameMode == ScreenMode.FIXED){
	
	            RSCanvas.chatboxProducingGraphicsBuffer.prepareRasterizer();
	//        }
	        Class44.chatboxBackgroundImage.drawImage(0, 0);
	        Class5.chatboxLineOffsets = Rasterizer3D.setLineOffsets(Class5.chatboxLineOffsets);
	    }

	public static String method307(Buffer arg0, int arg1, int arg2) {
	    try {
	        if(arg1 != -1)
	            MovedStatics.aBooleanArray548 = null;
	        int length = arg0.getSmart();
	        if(length > arg2)
	            length = arg2;
	        byte[] chars = new byte[length];
	        arg0.currentPosition += IdentityKit.aHuffmanEncoding_2590.method1023(arg0.buffer, length, 0, chars, arg0.currentPosition, -1);
	        return new String(chars);
	    } catch(Exception exception) {
	        return English.cabbage;
	    }
	}

	public static void method309(int arg0, int arg1) {
	    do {
	        AnimationSequence.anInt2480 = Node.pulseCycle;
	        HuffmanEncoding.method1030((byte) 127);
	        int i = Npc.method795((byte) -70, arg1).anInt2633;
	        if(i != 0) {
	            int i_21_ = GroundItemTile.varbitmasks[arg1];
	            if(i == 1) {
	                if(i_21_ == 1) {
	                    Rasterizer3D.method711(0.9);
	                    ((Class35) Rasterizer3D.anInterface3_2939).method424(0.9);
	                }
	                if(i_21_ == 2) {
	                    Rasterizer3D.method711(0.8);
	                    ((Class35) Rasterizer3D.anInterface3_2939).method424(0.8);
	                }
	                if(i_21_ == 3) {
	                    Rasterizer3D.method711(0.7);
	                    ((Class35) Rasterizer3D.anInterface3_2939).method424(0.7);
	                }
	                if(i_21_ == 4) {
	                    Rasterizer3D.method711(0.6);
	                    ((Class35) Rasterizer3D.anInterface3_2939).method424(0.6);
	                }
	                GameObject.method774((byte) -96);
	                Class40_Sub5_Sub11.clearScreen = true;
	            }
	            if(i == 3) {
	                int i_22_ = 0;
	                if(i_21_ == 0)
	                    i_22_ = 255;
	                if(i_21_ == 1)
	                    i_22_ = 192;
	                if(i_21_ == 2)
	                    i_22_ = 128;
	                if(i_21_ == 3)
	                    i_22_ = 64;
	                if(i_21_ == 4)
	                    i_22_ = 0;
	                if(i_22_ != RSCanvas.anInt60) {
	                    if(RSCanvas.anInt60 != 0 || MouseHandler.anInt1457 == -1) {
	                        if(i_22_ == 0) {
	                            Class33.method402(false);
	                            Class35.songTimeout = 0;
	                        } else
	                            Node.method456(i_22_);
	                    } else {
	                        Class33.method414(false, 0, MouseHandler.anInt1457, i_22_, 0, Class55.aClass6_Sub1_1286);
	                        Class35.songTimeout = 0;
	                    }
	                    RSCanvas.anInt60 = i_22_;
	                }
	            }
	            if(i == 9)
	                Class43.bankInsertMode = i_21_;
	            if(i == 10) {
	                if(i_21_ == 0)
	                    RSCanvas.anInt65 = 127;
	                if(i_21_ == 1)
	                    RSCanvas.anInt65 = 96;
	                if(i_21_ == 2)
	                    RSCanvas.anInt65 = 64;
	                if(i_21_ == 3)
	                    RSCanvas.anInt65 = 32;
	                if(i_21_ == 4)
	                    RSCanvas.anInt65 = 0;
	            }
	            if(i == 8) {
	                ChatBox.redrawChatbox = true;
	                CollisionMap.anInt165 = i_21_;
	            }
	            if(i == 4) {
	                if(i_21_ == 0)
	                    Class5.anInt200 = 127;
	                if(i_21_ == 1)
	                    Class5.anInt200 = 96;
	                if(i_21_ == 2)
	                    Class5.anInt200 = 64;
	                if(i_21_ == 3)
	                    Class5.anInt200 = 32;
	                if(i_21_ == 4)
	                    Class5.anInt200 = 0;
	            }
	            if(i == 6)
	                Class40_Sub5_Sub1.anInt2280 = i_21_;
	            if(arg0 != -1)
	                method309(74, -85);
	            if(i != 5)
	                break;
	            ProducingGraphicsBuffer.oneMouseButton = i_21_;
	        }
	
	        break;
	    } while(false);
	}

	public static void method308() {
	    RSString.method56(false, null, 0);
	}

	public static int anInt547 = 0;
	public static boolean[] aBooleanArray548 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false};
	public static boolean accountFlagged = false;
	public static boolean membersWorld = false;
	public static IndexedImage[] aClass40_Sub5_Sub14_Sub2Array535;
	public static int anInt537 = 0;
	public static int anInt545;
	public static IndexedImage[] method315() {
	    IndexedImage[] class40_sub5_sub14_sub2s = new IndexedImage[UnderlayDefinition.anInt2581];
	    for(int i = 0; UnderlayDefinition.anInt2581 > i; i++) {
	        IndexedImage class40_sub5_sub14_sub2 = class40_sub5_sub14_sub2s[i] = new IndexedImage();
	        class40_sub5_sub14_sub2.maxWidth = ItemDefinition.anInt2846;
	        class40_sub5_sub14_sub2.maxHeight = GameShell.anInt31;
	        class40_sub5_sub14_sub2.xDrawOffset = Class57.anIntArray1347[i];
	        class40_sub5_sub14_sub2.yDrawOffset = Actor.anIntArray3111[i];
	        class40_sub5_sub14_sub2.imgWidth = Class17.anIntArray456[i];
	        class40_sub5_sub14_sub2.imgHeight = Npc.anIntArray3312[i];
	        class40_sub5_sub14_sub2.palette = Buffer.anIntArray1972;
	        class40_sub5_sub14_sub2.imgPixels = GroundItemTile.aByteArrayArray1370[i];
	    }
	    ActorDefinition.method569();
	    return class40_sub5_sub14_sub2s;
	}

	public static ImageRGB[] method319(byte arg0) {
	    ImageRGB[] class40_sub5_sub14_sub4s = new ImageRGB[UnderlayDefinition.anInt2581];
	    if(arg0 != -62)
	        return null;
	    for(int i = 0; i < UnderlayDefinition.anInt2581; i++) {
	        ImageRGB class40_sub5_sub14_sub4 = class40_sub5_sub14_sub4s[i] = new ImageRGB();
	        class40_sub5_sub14_sub4.maxWidth = ItemDefinition.anInt2846;
	        class40_sub5_sub14_sub4.maxHeight = GameShell.anInt31;
	        class40_sub5_sub14_sub4.offsetX = Class57.anIntArray1347[i];
	        class40_sub5_sub14_sub4.offsetY = Actor.anIntArray3111[i];
	        class40_sub5_sub14_sub4.imageWidth = Class17.anIntArray456[i];
	        class40_sub5_sub14_sub4.imageHeight = Npc.anIntArray3312[i];
	        byte[] is = GroundItemTile.aByteArrayArray1370[i];
	        int i_4_ = class40_sub5_sub14_sub4.imageHeight * class40_sub5_sub14_sub4.imageWidth;
	        class40_sub5_sub14_sub4.pixels = new int[i_4_];
	        for(int i_5_ = 0; i_5_ < i_4_; i_5_++)
	            class40_sub5_sub14_sub4.pixels[i_5_] = Buffer.anIntArray1972[HuffmanEncoding.method1021(255, is[i_5_])];
	    }
	    ActorDefinition.method569();
	    return class40_sub5_sub14_sub4s;
	}

	public static int duplicateClickCount = 0;
	public static Widget aWidget_1887;
    
}
