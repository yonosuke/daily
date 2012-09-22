package jp.co.spookies.android.voiceeffecter;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;

public class VoicePlayer implements Runnable {
	private Thread thread;
	private boolean playFlag;
	private long startPlayTime;
	private AudioTrack audioTrack;
	private byte[] data;
	private int sampleRate;
	public static final long MAX_PLAY_TIME = 1000 * 10;
	private long playTime;

	public VoicePlayer(int sampleRate) {
		playFlag = false;
		this.sampleRate = sampleRate;
	}

	/**
	 * 再生
	 */
	public void start() {
		if (data != null && thread == null) {
			thread = new Thread(this);
			playFlag = true;
			thread.start();
		}
	}

	/**
	 * 停止
	 */
	public void stop() {
		playFlag = false;
	}

	/**
	 * 再生する音声データをセットする
	 * 
	 * @param data
	 */
	public void setWav(byte[] data) {
		if (data == null) {
			this.data = new byte[] {};
		}
		this.data = data;
		playTime = data.length * 1000 / sampleRate / 2;
	}

	/**
	 * 音声データの再生時間を取得
	 * 
	 * @return
	 */
	public long getPlayTime() {
		return Math.min(playTime, MAX_PLAY_TIME) + 1000;
	}

	/**
	 * 再生位置を取得
	 * 
	 * @return
	 */
	public float getCurrentProgress() {
		return (float) (System.currentTimeMillis() - startPlayTime)
				/ getPlayTime();
	}

	public boolean isPlaying() {
		return thread != null;
	}

	@Override
	public void run() {
		startPlaying();
		startPlayTime = System.currentTimeMillis();

		// 最長再生時間を超えると自動で停止
		while (playFlag
				&& System.currentTimeMillis() - startPlayTime < getPlayTime()) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stopPlaying();
	}

	/**
	 * AudioTrackの設定と再生
	 */
	private void startPlaying() {
		try {
			// AudioTrackの設定
			audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC, sampleRate,
					AudioFormat.CHANNEL_CONFIGURATION_MONO,
					AudioFormat.ENCODING_PCM_16BIT, data.length,
					AudioTrack.MODE_STATIC);
			audioTrack
					.setPlaybackPositionUpdateListener(
							new AudioTrack.OnPlaybackPositionUpdateListener() {
						@Override
						public void onPeriodicNotification(AudioTrack track) {
						}

						@Override
						public void onMarkerReached(AudioTrack track) {
							// 停止処理
							if (track.getPlayState() 
									== AudioTrack.PLAYSTATE_PLAYING) {
								track.stop();
							}
						}
					});
			audioTrack.write(data, 0, data.length); // 音声データをセット
			audioTrack.play(); // 再生
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	/**
	 * AudioTrackの停止
	 */
	private void stopPlaying() {
		if (audioTrack != null) {
			if (audioTrack.getPlayState() == AudioTrack.PLAYSTATE_PLAYING) {
				audioTrack.stop();
			}
			audioTrack.release(); // AudioTrack解放
			audioTrack = null;
		}
		thread = null;
	}
}
