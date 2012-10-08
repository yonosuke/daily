package sample.application.kalimba;

import android.app.Activity;
import android.os.Bundle;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.view.View;
import android.view.View.OnClickListener;

public class KalimbaActivity extends Activity implements OnClickListener {

	MediaPlayer[] mp; //MediaPlayer�^�z��̃N���X�ϐ�mp�̐錾

	@Override //onCreate()���\�b�h���I�[�o�[���C�h
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TypedArray notes = getResources().obtainTypedArray(R.array.notes); //notes.xml�̃��\�[�X���擾���āA�^�t���̔z��TypedArray�^�̕ϐ�notes�ɑ��
		TypedArray buttons = getResources().obtainTypedArray(R.array.buttons); //button
		mp = new MediaPlayer[notes.length()]; //MediaPlayer�^�̃C���X�^���X�𐶐�
		for(int i = 0; i < notes.length(); i++) //int�^�ϐ�i�̏����l��0�@i��notes�̌���菭�Ȃ��ꍇ�@�C���N�������g
			mp[i] = MediaPlayer.create(this,notes.getResourceId(i, -1)); //MediaPlayer�^�C���X�^���X�̐���
		for(int i = 0; i < buttons.length(); i++) //int�^�ϐ�i�̏����l��0�@i��buttons�̌���菭�Ȃ��ꍇ�@�C���N�������g
			findViewById(buttons.getResourceId(i, -1)).setOnClickListener(this); //�{�^���̃��X�i�[�o�^
	}

	@Override
	public void onClick(View v) { //onClicd()���\�b�h���I�[�o�[���C�h
		TypedArray buttons = getResources().obtainTypedArray(R.array.buttons); //button
		for(int i = 0; i < buttons.length(); i++){ //�^�b�v���ꂽ�{�^������肵�A�{�^���ɑΉ����������Đ�
			if(buttons.getResourceId(i, -1) == v.getId()){ //buttons��getResourceId���\�b�h�����s�������ʂ�v��getId()���\�b�h�����s�������ʂ������ꍇ
				mp[i].seekTo(0); //�ϐ�mp��seekTo()���\�b�h�����s
				mp[i].start(); //�ϐ�mp��start()���\�b�h�����s
				break;
			}
		}
	}
}