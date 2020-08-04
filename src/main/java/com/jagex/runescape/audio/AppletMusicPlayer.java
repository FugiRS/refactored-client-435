package com.jagex.runescape.audio;

import com.jagex.runescape.Class34;
import com.jagex.runescape.Class43;
import com.jagex.runescape.Class44;

public abstract class AppletMusicPlayer extends MusicPlayer {
    public static int[] volumes = new int[]{12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800};


    public static void method316(int arg0) {
        do {
            Class43.aClass9_1014.method235();
            Class34.aClass9_851.method235();
            if(arg0 == -11965)
                break;
            getChannelVolume(-25);

            break;
        } while(false);
    }

    public static int getChannelVolume(int arg0) {
        int i = volumes[arg0];
        i = (i * Class44.volume >> 8) * i;
        return (int) (Math.sqrt(i) + 0.5);
    }

	private static int[] anIntArray889 = new int[128];

    public abstract void send(int i, int i_0_, int i_1_, long l);

    public void method317(int volume, int arg1, long timeStamp) {
    	volume = (int) ((double) volume * Math.pow(0.1, (double) arg1 * 5.0E-4) + 0.5);
    	if(volume != Class44.volume) {
    		Class44.volume = volume;
    		for(int i = 0; i < 16; i++) {
    			int data = getChannelVolume(i);
    			send(176 + i, 7, data >> 7, timeStamp);
    			send(176 + i, 39, data & 0x7f, timeStamp);
    		}
    	}
    }

    public void method318(long timeStamp, int volume) {
        Class44.volume = volume;
        for(int i = 0; i < 16; i++)
            volumes[i] = 12800;
        for(int i = 0; i < 16; i++) {
            int data = getChannelVolume(i);
            send(176 + i, 7, data >> 7, timeStamp);
            send(176 + i, 39, 0x7f & data, timeStamp);
        }
    }

    public void reset(long timeStamp) {
        for(int i = 0; i < 128; i++) {
            int i_6_ = AppletMusicPlayer.anIntArray889[i];
            AppletMusicPlayer.anIntArray889[i] = 0;
            for(int i_7_ = 0; i_7_ < 16; i_7_++) {
                if((i_6_ & 1 << i_7_) != 0)
                    send(144 + i_7_, i, 0, timeStamp);
            }
        }
        for(int i = 0; i < 16; i++)
            send(i + 176, 123, 0, timeStamp);
        for(int i = 0; i < 16; i++)
            send(i + 176, 120, 0, timeStamp);
        for(int i = 0; i < 16; i++)
            send(i + 176, 121, 0, timeStamp);
        for(int i = 0; i < 16; i++)
            send(i + 176, 0, 0, timeStamp);
        for(int i = 0; i < 16; i++)
            send(176 + i, 32, 0, timeStamp);
        for(int i = 0; i < 16; i++)
            send(i + 192, 0, 0, timeStamp);
    }

    public boolean send0(int arg0, int arg1, int arg2, long arg3) {
        if((arg0 & 0xe0) == 128) {
            int i = 1 << (arg0 & 0xf);
            int i_8_ = AppletMusicPlayer.anIntArray889[arg1];
            if(arg0 >= 144 && arg2 != 0) {
                if((i_8_ & i) != 0)
                    send(arg0, arg1, 0, arg3);
                else
                    AppletMusicPlayer.anIntArray889[arg1] = i_8_ | i;
            } else
                AppletMusicPlayer.anIntArray889[arg1] = i_8_ & (i ^ 0xffffffff);
            return false;
        }
        if((arg0 & 0xf0) == 176) {
            if(arg1 == 121) {
                send(arg0, arg1, arg2, arg3);
                int i = arg0 & 0xf;
                volumes[i] = 12800;
                int i_9_ = getChannelVolume(i);
                send(arg0, 7, i_9_ >> 7, arg3);
                send(arg0, 39, i_9_ & 0x7f, arg3);
                return true;
            }
            if(arg1 == 7 || arg1 == 39) {
                int i = arg0 & 0xf;
                if(arg1 == 7)
                    volumes[i] = (volumes[i] & 0x7f) + (arg2 << 7);
                else
                    volumes[i] = (volumes[i] & 0x3f80) + arg2;
                int i_10_ = getChannelVolume(i);
                send(arg0, 7, i_10_ >> 7, arg3);
                send(arg0, 39, i_10_ & 0x7f, arg3);
                return true;
            }
        }
        return false;
    }
}
