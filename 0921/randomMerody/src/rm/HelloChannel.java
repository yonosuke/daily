package rm;

import java.util.Random;

import javax.sound.midi.* ;
public class HelloChannel {
	
	private static Random random;//
	public static int getIntRandom() {//
        return random.nextInt(500);//
    }//
	
	
  public static void main(String[] args){
	  Random random = new Random();//
    MidiChannel channel = null;
    try {

/*
 * �V�X�e������Synsesizer �𓾂āA�J���B
 * �߂�
 */
      Synthesizer synthesizer = MidiSystem.getSynthesizer();
      synthesizer.open();


/*
 * �V�X�e������Soundbank �𓾂�
 * �߂�
 */
      Soundbank soundbank = synthesizer.getDefaultSoundbank();


/*
 * Soundbank ���̍ŏ���Instrument(���F)���g���悤�ݒ肷��
 * �߂�
 */

      Instrument[] instruments = synthesizer.getDefaultSoundbank().getInstruments();
      synthesizer.loadInstrument(instruments[0]);


/*
 * Synsesizer����Channel�𓾂�B
 * �߂�
 */
      channel = synthesizer.getChannels()[15];//���F�ύX15�܂�


/*
 * Channel���g�����̍���48�A ����127��1�b�Ԗ炷
 * �߂�
 */
      for (int i = 0; i <= 48; i++) {
	System.out.println("Play pitch:"+ random.nextInt(127) + "/" + "velocity:" + random.nextInt(127) );
	channel.noteOn(random.nextInt(127) , random.nextInt(127));
	Thread.currentThread().sleep(random.nextInt(1000));
	channel.noteOff(128);
//      System.out.println("Note off");
      }
      
      
/*
 *  Synsesizer �����B
 * �߂�
 */
      synthesizer.close();
    } catch(Exception e){
      if(channel != null)  channel.allNotesOff();
    }
    System.exit(0);
  }
}