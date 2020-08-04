package com.jagex.runescape.audio;

import com.jagex.runescape.Class43;
import com.jagex.runescape.Runnable_Impl1;
import com.jagex.runescape.cache.CacheIndex;
import com.jagex.runescape.cache.def.UnderlayDefinition;
import com.jagex.runescape.util.Signlink;

public class AppletMusicPlayerSW extends AppletMusicPlayer implements Runnable {
    public static Runnable_Impl1 runnable;
    public static boolean aBoolean2224;
    public static MidiFileReader reader = new MidiFileReader();
    public static int timeStamp;
    public static int[] anIntArray2227 = new int[256];
    public static boolean aBoolean2228;
    public static int anInt2229;

    public AppletMusicPlayerSW(Signlink arg0, Runnable_Impl1 arg1) {

        runnable = arg1;
        runnable.method3(25832);
        runnable.method6(116);
        this.reset((long) timeStamp);
        runnable.method2(anIntArray2227, anInt2229);
        anInt2229 = 0;
        arg0.method394(10, 0, this);
    }

    public static void method325() {
        if(anInt2229 > 0) {
            runnable.method2(anIntArray2227, anInt2229);
            anInt2229 = 0;
        }
    }

    public static void method326(int arg0, byte arg1, int arg2, int arg3, int arg4) {

        if(arg1 > -44)
            method325();
        if(anIntArray2227.length <= anInt2229) {
            runnable.method2(anIntArray2227, anInt2229);
            anInt2229 = 0;
        }
        anIntArray2227[anInt2229++] = -timeStamp + arg3;
        timeStamp = arg3;
        anIntArray2227[anInt2229++] = UnderlayDefinition.bitWiseOR(UnderlayDefinition.bitWiseOR(arg4, arg0 << 8), arg2 << 16);

    }

    public synchronized void method302(int arg0) {

        if(reader.isReady()) {
            if(arg0 != 0)
                aBoolean2224 = false;
            long l = (long) (200 + timeStamp + -runnable.method5(14942)) * (long) (reader.division * 1000);
            for(; ; ) {
                int i = reader.getPrioritizedTrack();
                int i_0_ = reader.trackLengths[i];
                long l_1_ = reader.method251(i_0_);
                if(l < l_1_)
                    break;
                while(i_0_ == reader.trackLengths[i]) {
                    reader.gotoTrack(i);
                    method324(l_1_, i);
                    if(reader.method258()) {
                        reader.markTrackPosition(i);
                        if(reader.isDone()) {
                            if(aBoolean2228)
                                reader.reset(l_1_);
                            else {
                                this.reset((long) (int) (l_1_ / (long) (reader.division * 1000)));
                                reader.clear();
                                method325();
                                return;
                            }
                        }
                        break;
                    }
                    reader.readTrackLength(i);
                    reader.markTrackPosition(i);
                }
            }
            method325();
        }

    }

    public void method324(long arg0, int arg2) {
        int i_2_ = reader.readMessage(arg2);
        if(i_2_ == 1)
            reader.setTrackDone();
        else if((i_2_ & 0x80) != 0) {
            int i_3_ = (int) (arg0 / (long) (1000 * reader.division));
            int i_4_ = i_2_ & 0xff;
            int i_5_ = (0xffa8 & i_2_) >> 8;
            int i_6_ = (i_2_ & 0xffb86b) >> 16;
            if(!this.send0(i_4_, i_5_, i_6_, (long) i_3_))
                method326(i_5_, (byte) -72, i_6_, i_3_, i_4_);
        }
    }

    public void run() {

        try {
            for(; ; ) {
                synchronized(this) {
                    if(aBoolean2224) {
                        aBoolean2224 = false;
                        break;
                    }
                    method302(0);
                }
                Class43.sleep(100L);
            }
        } catch(Exception exception) {
            CacheIndex.method169(null, (byte) -127, exception);
        }

    }

    public void close_() {

        synchronized(this) {
            aBoolean2224 = true;
        }
        for(; ; ) {
            synchronized(this) {
                if(!aBoolean2224)
                    break;
            }
            Class43.sleep(20L);
        }
        runnable.method4(26534);

    }

    public synchronized void method300(byte[] arg0, boolean arg1, int arg3) {

        boolean bool = true;
        reader.parse(arg0);
        timeStamp = 0;
        aBoolean2228 = arg1;
        runnable.method6(-26);
        this.method317(arg3, 0, (long) timeStamp);
        int i = reader.trackCount();
        for(int i_7_ = 0; i_7_ < i; i_7_++) {
            reader.gotoTrack(i_7_);
            while(!reader.method258()) {
                reader.readTrackLength(i_7_);
                if(reader.trackLengths[i_7_] != 0) {
                    bool = false;
                    break;
                }
                method324(0L, i_7_);
            }
            reader.markTrackPosition(i_7_);
        }
        if(bool) {
            if(aBoolean2228)
                throw new RuntimeException();
            this.reset((long) timeStamp);
            reader.clear();
        }
        method325();

    }

    public synchronized void method301(int arg0) {

        this.method318((long) timeStamp, arg0);
        runnable.method2(anIntArray2227, anInt2229);
        anInt2229 = 0;

    }

    public void send(int arg0, int arg1, int arg2, long arg3) {

        method326(arg1, (byte) -102, arg2, (int) arg3, arg0);

    }

    public synchronized void method304(int arg1, int arg2) {
        this.method317(arg1, arg2, (long) timeStamp);
    }

    public synchronized void stop() {

        runnable.method6(-21);
        this.reset((long) timeStamp);
        runnable.method2(anIntArray2227, anInt2229);
        anInt2229 = 0;
        reader.clear();

    }
}
