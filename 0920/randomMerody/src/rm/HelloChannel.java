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
 * システムからSynsesizer を得て、開く。
 * 戻る
 */
      Synthesizer synthesizer = MidiSystem.getSynthesizer();
      synthesizer.open();


/*
 * システムからSoundbank を得る
 * 戻る
 */
      Soundbank soundbank = synthesizer.getDefaultSoundbank();


/*
 * Soundbank 中の最初のInstrument(音色)を使うよう設定する
 * 戻る
 */

      Instrument[] instruments = synthesizer.getDefaultSoundbank().getInstruments();
      synthesizer.loadInstrument(instruments[0]);


/*
 * SynsesizerからChannelを得る。
 * 戻る
 */
      channel = synthesizer.getChannels()[15];//音色変更15まで


/*
 * Channelを使い音の高さ48、 強さ127で1秒間鳴らす
 * 戻る
 */
      for (int i = 0; i <= 48; i++) {
	System.out.println("Play pitch:"+ random.nextInt(127) + "/" + "velocity:" + random.nextInt(127) );
	channel.noteOn(random.nextInt(127) , random.nextInt(127));
	Thread.currentThread().sleep(random.nextInt(1000));
	channel.noteOff(128);
//      System.out.println("Note off");
      }
      
      
/*
 *  Synsesizer を閉じる。
 * 戻る
 */
      synthesizer.close();
    } catch(Exception e){
      if(channel != null)  channel.allNotesOff();
    }
    System.exit(0);
  }
}