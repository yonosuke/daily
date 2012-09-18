package rm;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Synthesizer;

public class Device {
    public static void main(String[] args) throws Exception {
        MidiDevice.Info[] info = MidiSystem.getMidiDeviceInfo();
        System.err.println("There are " + info.length + " devices.");
        for (int i = 0; i < info.length; i++) {
            System.err.println("*** " + i + " ***");
            System.err.println("  Description:" + info[i].getDescription());
            System.err.println("  Name:" + info[i].getName());
            System.err.println("  Vendor:" + info[i].getVendor());
            MidiDevice device = MidiSystem.getMidiDevice(info[i]);
            if (device instanceof Sequencer) {
                System.err.println("  *** This is Sequencer.");
            }
            if (device instanceof Synthesizer) {
                System.err.println("  *** This is Synthesizer.");
            }
            System.err.println();
        }
    }

}
