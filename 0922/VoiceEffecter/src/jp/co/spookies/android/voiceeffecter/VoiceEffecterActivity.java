package jp.co.spookies.android.voiceeffecter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class VoiceEffecterActivity extends Activity {
	VoiceEffecter manager;
	VoiceEffecter.Parameters parameters;
	SeekBar speedSeek, pitchSeek, volumeSeek, echoDelaySeek, echoVolumeSeek;
	TextView speedText, pitchText, volumeText, echoDelayText, echoVolumeText;
	CheckBox reverseCheck;
	ProgressDialog dialog;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		manager = new VoiceEffecter();

		// 各SeekBar
		speedSeek = (SeekBar) findViewById(R.id.speed_seek);
		pitchSeek = (SeekBar) findViewById(R.id.pitch_seek);
		volumeSeek = (SeekBar) findViewById(R.id.volume_seek);
		echoDelaySeek = (SeekBar) findViewById(R.id.echo_delay_seek);
		echoVolumeSeek = (SeekBar) findViewById(R.id.echo_volume_seek);
		reverseCheck = (CheckBox) findViewById(R.id.reverse_flag);

		// 各パラメータの値を表示するTextView
		speedText = (TextView) findViewById(R.id.speed);
		pitchText = (TextView) findViewById(R.id.pitch);
		volumeText = (TextView) findViewById(R.id.volume);
		echoDelayText = (TextView) findViewById(R.id.echo_delay);
		echoVolumeText = (TextView) findViewById(R.id.echo_volume);

		speedSeek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				parameters.setSpeed(progress / 100.0f);
				speedText.setText("speed:" + parameters.getSpeed());
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
		});
		pitchSeek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				parameters.setPitch(progress / 100.0f);
				pitchText.setText("pitch:" + parameters.getPitch());
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
		});
		volumeSeek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				parameters.setVolume(progress / 100.0f);
				volumeText.setText("volume:" + parameters.getVolume());
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
		});

		echoDelaySeek.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				parameters.setEchoDelay((int) (VoiceEffecter.AUDIO_SAMPLE_FREQ
						* progress / 100.0f));
				echoDelayText.setText("echo delay:" + progress / 100.0f);
				if (progress == 0) {
					echoVolumeSeek.setEnabled(false);
				} else {
					echoVolumeSeek.setEnabled(true);
				}
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}
		});

		echoVolumeSeek
				.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
					@Override
					public void onProgressChanged(SeekBar seekBar,
							int progress, boolean fromUser) {
						parameters.setEchoVolume(progress / 100.0f);
						echoVolumeText.setText("echo vol.:"
								+ parameters.getEchoVolume());
					}

					@Override
					public void onStartTrackingTouch(SeekBar seekBar) {
					}

					@Override
					public void onStopTrackingTouch(SeekBar seekBar) {
					}
				});

		reverseCheck.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				parameters.setReverseFlag(((CheckBox) v).isChecked());
			}
		});
		initParameters();
	}

	/**
	 * 録音ボタン
	 * 
	 * @param v
	 */
	public void onClickRecord(View v) {
		dialog = new ProgressDialog(this);
		dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		dialog.setMessage("recording...");
		dialog.setCancelable(false);
		dialog.setButton("STOP", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				manager.stopRecording();
			}
		});
		dialog.show();
		manager.startRecording();
	}

	/**
	 * 再生ボタン
	 * 
	 * @param v
	 */
	public void onClickStartPlaying(View v) {
		dialog = new ProgressDialog(this);
		dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		dialog.setMax(100);
		dialog.incrementProgressBy(0);
		dialog.setCancelable(false);
		dialog.setMessage("playing...");
		dialog.setCancelable(false);
		dialog.setButton("STOP", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
				manager.stopPlaying();
			}
		});
		dialog.show();
		manager.setParameters(parameters);
		manager.convert();
		manager.startPlaying();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (dialog.isShowing()) {
					dialog.setProgress((int) (manager.getCurrentProgress() * 100));
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	/**
	 * パラメータの初期化
	 * 
	 * @param v
	 */
	public void onClickReset(View v) {
		initParameters();
	}

	public void initParameters() {
		manager.resetParameters();
		parameters = manager.getParameters();

		speedSeek.setProgress((int) (parameters.getSpeed() * 100));
		pitchSeek.setProgress((int) (parameters.getPitch() * 100));
		volumeSeek.setProgress((int) (parameters.getVolume() * 100));
		echoDelaySeek.setProgress(parameters.getEchoDelay());
		echoVolumeSeek.setProgress((int) (parameters.getEchoVolume() * 100));
		reverseCheck.setChecked(parameters.getReverseFlag());
	}
}