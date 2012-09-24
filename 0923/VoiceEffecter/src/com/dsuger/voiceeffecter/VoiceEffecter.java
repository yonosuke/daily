package com.dsuger.voiceeffecter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.os.Environment;

public class VoiceEffecter {
	static final int AUDIO_SAMPLE_FREQ = 8000;
	static final int AUDIO_BUFFER_SIZE = Math.max(AUDIO_SAMPLE_FREQ * 2 * 10,
			AudioRecord.getMinBufferSize(AUDIO_SAMPLE_FREQ,
					AudioFormat.CHANNEL_CONFIGURATION_MONO,
					AudioFormat.ENCODING_PCM_16BIT));

	private final File path = new File(
			Environment
					.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC),
			"TMP");
	private File file = new File(path, "original.wav");
	private File w_file = new File(path, "effect.wav");
	private byte[] rawData;
	private byte[] effectedData;
	private Parameters parameters = new Parameters();

	private VoiceRecorder recorder = new VoiceRecorder(AUDIO_SAMPLE_FREQ);
	private VoicePlayer player = new VoicePlayer(AUDIO_SAMPLE_FREQ);

	public VoiceEffecter() {
		if (!path.exists()) {
			path.mkdirs();
		}
	}

	public void startRecording() {
		recorder.start();
	}

	public void stopRecording() {
		recorder.stop();

		try {
			file.createNewFile();
			rawData = recorder.getData();
			effectedData = rawData.clone();

			FileOutputStream out = new FileOutputStream(file);
			out.write(raw2wav(rawData));
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void startPlaying() {
		player.setWav(effectedData);
		player.start();
	}

	public void stopPlaying() {
		player.stop();
	}

	public byte[] raw2wav(byte[] rawData) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write("RIFF".getBytes());
		out.write(i2littleByte(rawData.length + 36, 4));
		out.write("WAVE".getBytes());
		out.write("fmt ".getBytes());
		out.write(i2littleByte(16, 4));
		out.write(i2littleByte(1, 2));
		out.write(i2littleByte(1, 2));
		out.write(i2littleByte(AUDIO_SAMPLE_FREQ, 4));
		out.write(i2littleByte(AUDIO_SAMPLE_FREQ * 2, 4));
		out.write(i2littleByte(2, 2));
		out.write(i2littleByte(16, 2));
		out.write("data".getBytes());
		out.write(i2littleByte(rawData.length, 4));
		out.write(rawData);
		return out.toByteArray();
	}


	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}

	public Parameters getParameters() {
		return parameters;
	}

	public static byte[] i2littleByte(int value, int size) {
		byte[] b = new byte[size];
		for (int i = 0; i < size; i++, value >>= 8) {
			b[i] = (byte) (value & 0xff);
		}
		return b;
	}

	public void convert() {
		try {
			effectedData = changePitch(rawData, parameters.getPitch());
			effectedData = changeVolume(effectedData, parameters.getVolume());
			effectedData = changeSpeed(effectedData, parameters.getSpeed());
			if (parameters.getReverseFlag()) {
				effectedData = reverse(effectedData);
			}
			if (parameters.getEchoDelay() > 0) {
				effectedData = addEchoEffect(effectedData,
						parameters.getEchoDelay(), parameters.getEchoVolume());
			}
			w_file.createNewFile();
			FileOutputStream out = new FileOutputStream(w_file);
			out.write(raw2wav(effectedData));
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resetParameters() {
		parameters = new Parameters();
	}

	public float getCurrentProgress() {
		if (player.isPlaying()) {
			return player.getCurrentProgress();
		}
		return 0.0f;
	}

	public static byte[] changeSpeed(byte[] data, float speed) {
		if (data == null) {
			return new byte[] {};
		}

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		for (int i = 0; i < data.length / 2 / speed; i++) {
			out.write(data[(int) (i * speed) * 2]);
			out.write(data[(int) (i * speed) * 2 + 1]);
		}

		return out.toByteArray();
	}

	public static byte[] changePitch(byte[] data, float pitch) {
		if (data == null) {
			return new byte[] {};
		}

		int index;
		int n = 200;
		int offset = 0;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		while (offset + n * 2 < data.length) {
			for (int i = 0; i < n; i++) {
				index = ((int) Math.floor(i * pitch) % n) * 2;
				out.write(data[offset + index]);
				out.write(data[offset + index + 1]);
			}
			offset += n * 2;
		}
		return out.toByteArray();
	}

	public static byte[] changeVolume(byte[] data, float volume) {
		if (data == null) {
			return new byte[] {};
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		int val;
		for (int i = 0; i < data.length / 2; i++) {
			val = ((int) data[2 * i + 1] << 8) + data[2 * i];
			byte[] b1 = i2littleByte((int) (val * volume), 2);
			out.write(b1[0]);
			out.write(b1[1]);
		}
		return out.toByteArray();
	}

	public static byte[] reverse(byte[] data) {
		if (data == null) {
			return new byte[] {};
		}

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		for (int i = data.length / 2 - 1; i >= 0; i--) {
			out.write(data[i * 2]);
			out.write(data[i * 2 + 1]);
		}
		return out.toByteArray();
	}

	public static byte[] addEchoEffect(byte[] data, int delay, float volume) {
		if (data == null) {
			return new byte[] {};
		}
		if (volume > 0.9f) {
			volume = 0.9f;
		} else if (volume < 0.0f) {
			volume = 0.0f;
		}

		byte[] echo = data.clone();
		for (int i = 0; i < data.length; i++) {
			if (i > delay) {
				echo[i] += echo[i - delay] * volume;
			}
		}
		return echo;
	}

	class Parameters {
		private float speed = 1.0f;
		private float pitch = 1.0f;
		private float volume = 1.0f;
		private int echoDelay = 0;
		private float echoVolume = 0.3f;
		private boolean reverseFlag = false;

		public void setSpeed(float speed) {
			this.speed = speed;
		}

		public float getSpeed() {
			return speed;
		}

		public void setPitch(float pitch) {
			this.pitch = pitch;
		}

		public float getPitch() {
			return pitch;
		}

		public void setVolume(float volume) {
			this.volume = volume;
		}

		public float getVolume() {
			return volume;
		}

		public void setEchoDelay(int echoDelay) {
			this.echoDelay = echoDelay;
		}

		public int getEchoDelay() {
			return echoDelay;
		}

		public void setEchoVolume(float echoVolume) {
			this.echoVolume = echoVolume;
		}

		public float getEchoVolume() {
			return echoVolume;
		}

		public void setReverseFlag(boolean reverseFlag) {
			this.reverseFlag = reverseFlag;
		}

		public boolean getReverseFlag() {
			return reverseFlag;
		}
	}
}
