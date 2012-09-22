package com.dsuger.voiceeffecter;

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

	public void start() {
		if (data != null && thread == null) {
			thread = new Thread(this);
			playFlag = true;
			thread.start();
		}
	}

	public void stop() {
		playFlag = false;
	}

	public void setWav(byte[] data) {
		if (data == null) {
			this.data = new byte[] {};
		}
		this.data = data;
		playTime = data.length * 1000 / sampleRate / 2;
	}

	public long getPlayTime() {
		return Math.min(playTime, MAX_PLAY_TIME) + 1000;
	}

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

	private void startPlaying() {
		try {
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
							if (track.getPlayState() 
									== AudioTrack.PLAYSTATE_PLAYING) {
								track.stop();
							}
						}
					});
			audioTrack.write(data, 0, data.length); 
			audioTrack.play();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	private void stopPlaying() {
		if (audioTrack != null) {
			if (audioTrack.getPlayState() == AudioTrack.PLAYSTATE_PLAYING) {
				audioTrack.stop();
			}
			audioTrack.release();
			audioTrack = null;
		}
		thread = null;
	}
}
