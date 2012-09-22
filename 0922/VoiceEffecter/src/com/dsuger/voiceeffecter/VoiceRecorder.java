package com.dsuger.voiceeffecter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;

public class VoiceRecorder implements Runnable {
	private Thread thread;
	private boolean recordFlag;
	private long startRecordTime;
	private AudioRecord audioRecord;
	private int sampleRate;
	public static final long MAX_RECORD_TIME = 1000 * 10;
	private int bufferSize;
	private ByteArrayOutputStream byteStream;

	public VoiceRecorder(int sampleRate) {
		thread = null;
		recordFlag = false;
		this.sampleRate = sampleRate;
		bufferSize = AudioRecord.getMinBufferSize(sampleRate,
				AudioFormat.CHANNEL_CONFIGURATION_MONO,
				AudioFormat.ENCODING_PCM_16BIT) * 2;

	}

	public void start() {
		if (thread == null) {
			thread = new Thread(this);
			recordFlag = true;
			thread.start();
		}
	}

	public void stop() {
		recordFlag = false;
	}

	public byte[] getData() {
		if (byteStream != null) {
			return byteStream.toByteArray();
		}
		return new byte[] {};
	}

	public boolean isRecording() {
		return thread != null;
	}

	@Override
	public void run() {
		startRecording();
		startRecordTime = System.currentTimeMillis();
		byteStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[bufferSize];
		while (recordFlag
				&& System.currentTimeMillis() - startRecordTime < MAX_RECORD_TIME) {
			try {
				Thread.sleep(1);
				audioRecord.read(buffer, 0, buffer.length);
				byteStream.write(buffer);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		stopRecording();
	}

	private void startRecording() {
		try {
			audioRecord = new AudioRecord(MediaRecorder.AudioSource.MIC,
					sampleRate, AudioFormat.CHANNEL_IN_MONO,
					AudioFormat.ENCODING_PCM_16BIT, bufferSize);
			audioRecord.startRecording();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void stopRecording() {
		audioRecord.stop();
		audioRecord.release();
		thread = null;
	}
}
