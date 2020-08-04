package com.jagex.runescape.audio;

import com.jagex.runescape.Class29;
import com.jagex.runescape.Class47;
import com.jagex.runescape.language.Native;
import com.jagex.runescape.util.Signlink;
import com.jagex.runescape.util.SignlinkNode;

import java.awt.*;

public class WebsiteMusicPlayer extends MusicPlayer {
    public boolean aBoolean1835;
    public SignlinkNode aSignlinkNode_1836;
    public boolean aBoolean1852;
    public int anInt1860;
    public byte[] aByteArray1866;
    public Signlink aClass31_1872;

    public WebsiteMusicPlayer(Signlink arg0) {
        aClass31_1872 = arg0;
    }

    public void method301(int arg0) {
    }

    public void stop() {
        if(aBoolean1835) {
            try {
//                Class28.method369(aClass31_1872.anApplet740, "midibox.src=\"c:/silence.mid\";", arg0 ^ 0x6f0f);
            } catch(Throwable throwable) {
                /* empty */
            }
            aBoolean1835 = false;
        }
        aSignlinkNode_1836 = null;
    }

    public void method302(int arg0) {
        if(aSignlinkNode_1836 != null && aSignlinkNode_1836.anInt434 != 0) {
            if(aSignlinkNode_1836.anInt434 == 1) {
                Class47 class47 = (Class47) aSignlinkNode_1836.value;
                try {
                    class47.method918(aByteArray1866, 0, aByteArray1866.length, false);
                    class47.method917(1);
                    try {
//                        Class28.method369(aClass31_1872.anApplet740, ("midibox.loop=" + (!aBoolean1852 ? "0" : "\"infinite\"") + "; midibox.src=\"" + class47.method915(false).getPath().replace('\\', '/') + "\"; midibox.volume=" + anInt1860 + ";"), -28497);
                        aBoolean1835 = true;
                    } catch(Throwable throwable) {
                        /* empty */
                    }
                } catch(Exception exception) {
                    try {
                        class47.method917(1);
                    } catch(Exception exception_0_) {
                        /* empty */
                    }
                }
            }
            aSignlinkNode_1836 = null;
        }
    }

    public void close_() {
    }

    public void method304(int arg1, int arg2) {
        if(arg1 == 0)
            arg1 = 1;
        int i = Class29.method372(arg1) + -arg2;
        if(aSignlinkNode_1836 == null) {
            do {
                if(aBoolean1835) {
                    try {
//                        Class28.method369(aClass31_1872.anApplet740, "midibox.volume=" + i + ";", -28497);
                    } catch(Throwable throwable) {
                        break;
                    }
                    break;
                }
            } while(false);
        } else
            anInt1860 = i;
    }

    public void method300(byte[] arg0, boolean arg1, int arg3) {
        aSignlinkNode_1836 = aClass31_1872.method396(86);
        if(aSignlinkNode_1836 != null) {
            if(arg3 == 0)
                arg3 = 1;
            anInt1860 = Class29.method372(arg3);
            aByteArray1866 = arg0;
            aBoolean1852 = arg1;
        }
    }
}
