/* Class8_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class8_Sub1_Sub2 extends Class8_Sub1
{
    public SourceDataLine aSourceDataLine2216;
    public AudioFormat anAudioFormat2217;
    public byte[] aByteArray2218 = new byte[512];
    public static Class aClass2219;
    
    public void method226(int arg0) throws LineUnavailableException {
	try {
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass2219 == null
		     ? (aClass2219
			= method229("javax.sound.sampled.SourceDataLine"))
		     : aClass2219),
		    anAudioFormat2217, arg0 * 2));
	    aSourceDataLine2216 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine2216.open();
	    aSourceDataLine2216.start();
	} catch (LineUnavailableException lineunavailableexception) {
	    aSourceDataLine2216 = null;
	    throw lineunavailableexception;
	}
    }
    
    public int method224() {
	int i;
	try {
	    i = aSourceDataLine2216.available() >> 1;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
    
    public void method223() {
	for (int i = 0; i < 256; i++) {
	    int i_0_ = anIntArray1829[i];
	    if ((i_0_ + 8388608 & ~0xffffff) != 0)
		i_0_ = 0x7fffff ^ i_0_ >> 31;
	    aByteArray2218[i * 2] = (byte) (i_0_ >> 8);
	    aByteArray2218[i * 2 + 1] = (byte) (i_0_ >> 16);
	}
	aSourceDataLine2216.write(aByteArray2218, 0, 512);
    }
    
    public Class8_Sub1_Sub2() throws Exception {
	super(22050);
	anAudioFormat2217 = new AudioFormat(22050.0F, 16, 1, true, false);
    }
    
    public void method225() {
	if (aSourceDataLine2216 != null) {
	    aSourceDataLine2216.close();
	    aSourceDataLine2216 = null;
	}
    }
    
    public static Class method229(String arg0) {
	Class var_class;
	try {
	    var_class = Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    return null;
	}
	return var_class;
    }
}