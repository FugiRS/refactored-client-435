package com.jagex.runescape;

import javax.sound.midi.*;
import java.io.ByteArrayInputStream;

public class Class22_Sub2_Sub1 extends Class22_Sub2 implements Receiver {
    public static Sequencer sequencer = null;
    public static volatile boolean playing = false;
    public static Receiver receiver = null;

    public Class22_Sub2_Sub1() {
        try {
            receiver = MidiSystem.getReceiver();
            sequencer = MidiSystem.getSequencer(false);
            sequencer.getTransmitter().setReceiver(this);
            sequencer.open();
            reset(-1L);
        } catch(Exception exception) {
            Class65.method1019(104);
        }
    }

    public synchronized void method304(int arg1, int arg2) {
        if(sequencer != null) {
            method317(arg1, arg2, -1L);
        }
    }

    public void close_() {
        if(null != sequencer) {
            sequencer.close();
            sequencer = null;
        }
        if(receiver != null) {
            receiver.close();
            receiver = null;
        }
    }

    public void method301(int volume) {
        if(null != sequencer) {
            method318(-1L, volume);
        }
    }

    public void close() {
        /* empty */
    }

    public void stop() {
        if(sequencer != null) {
            playing = false;
            sequencer.stop();
            reset(-1L);
        }
    }

    public void send(int status, int data1, int data2, long timeStamp) {
        try {
            ShortMessage shortmessage = new ShortMessage();
            shortmessage.setMessage(status, data1, data2);
            receiver.send(shortmessage, timeStamp);
        } catch(InvalidMidiDataException invalidmididataexception) {
            /* empty */
        }
    }

    public void method300(byte[] arg0, boolean loop, int volume) {
        if(sequencer != null) {
            try {
                Sequence sequence = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
                sequencer.setSequence(sequence);
                sequencer.setLoopCount(!loop ? 0 : -1);
                method317(volume, 0, -1L);
                playing = true;
                sequencer.start();
            } catch(Exception exception) {
                /* empty */
            }
        }
    }

    public synchronized void send(MidiMessage m, long arg1) {
        if(playing) {
            byte[] data = m.getMessage();
            if(!send0(data[0] & 0xff, data[1], data.length >= 3 ? data[2] : 0, arg1))
                receiver.send(m, arg1);
        }
    }

    public void method302(int arg0) {
    }
}
