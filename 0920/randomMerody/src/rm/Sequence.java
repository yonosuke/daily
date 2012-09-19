package rm;

import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class Sequence {
    public static void main(String[] args) throws Exception {
        Sequencer sequencer = null;
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 240);
            Track track = seq.createTrack();

            MetaMessage tempo = new MetaMessage();
            tempo.setMessage(0x51, new byte[] {0x07, (byte)0xa1, 0x20}, 3);
            track.add(new MidiEvent(tempo, 0));
        
            ShortMessage noteOn1 = new ShortMessage();
            noteOn1.setMessage(ShortMessage.NOTE_ON, 60, 64);
            track.add(new MidiEvent(noteOn1, 0));

            ShortMessage noteOn2 = new ShortMessage();
            noteOn2.setMessage(ShortMessage.NOTE_OFF, 60, 0);
            track.add(new MidiEvent(noteOn2, 480));
        
            sequencer.setSequence(seq);
            sequencer.start();
            while (sequencer.isRunning()) Thread.sleep(100);
        }
        finally {
            if (sequencer != null && sequencer.isOpen()) sequencer.close();
        }
    }
}