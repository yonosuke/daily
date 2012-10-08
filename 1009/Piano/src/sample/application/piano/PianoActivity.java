package sample.application.piano;

import android.app.Activity;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import sample.application.piano.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.ImageView;

public class PianoActivity extends Activity implements OnTouchListener{

	static final int numWk = 11, numBk = 7, numKeys = numWk + numBk;
	Region[] kb = new Region[numKeys];
	MediaPlayer[] key=new MediaPlayer[numKeys];
	int sw,sh;
	int[] activePointers=new int[numKeys];
	Drawable  drawable_white, drawable_black, drawable_white_pressed, drawable_black_pressed;
	Timer timer;
	Bitmap bitmap_keyboard;
	ImageView iv;
	boolean[] lastPlayingNotes;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TypedArray notes = getResources().obtainTypedArray(R.array.notes);
		for(int i=0; i < notes.length(); i++){
			int k = notes.getResourceId(i, -1);
			if(k != -1){
				key[i] = MediaPlayer.create(this,k);
			}else key[i] = null;
		}
		Resources res = getResources();
		drawable_white = res.getDrawable(R.drawable.white);
		drawable_black = res.getDrawable(R.drawable.black);
		drawable_white_pressed = res.getDrawable(R.drawable.white_pressed);
		drawable_black_pressed = res.getDrawable(R.drawable.black_pressed);
		Display disp = ((WindowManager)this.getSystemService(
				Context.WINDOW_SERVICE)).getDefaultDisplay();
		sw = disp.getWidth();
		sh = disp.getHeight();
		makeRegions();
		for(int i = 0; i<numKeys; i++)activePointers[i] = -1;
		iv = (ImageView)findViewById(R.id.imageView1);
		iv.setOnTouchListener(this);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		int pointerIndex=event.getActionIndex();
		float x = event.getX(pointerIndex);
		float y = event.getY(pointerIndex);
		for(int j = 0; j < numKeys; j++){
			if(kb[j].contains((int)x,(int)y)){
				switch(event.getActionMasked()){
				
				//�^�b�`�����Ƃ��̏���
				case MotionEvent.ACTION_DOWN:
				case MotionEvent.ACTION_POINTER_DOWN:
					playNote(key[j]);
					activePointers[pointerIndex]=j;
					break;
					
				//�������Ƃ��̏���
				case MotionEvent.ACTION_UP:
				case MotionEvent.ACTION_POINTER_UP:
					stopNote(key[j]);
					activePointers[pointerIndex] = -1;
					break;
					
					//�h���b�O�����Ƃ��̏���
				case MotionEvent.ACTION_MOVE:
					if(activePointers[pointerIndex] != j){
						if(activePointers[pointerIndex] != -1)
							stopNote(key[activePointers[pointerIndex]]);
						playNote(key[j]);
						activePointers[pointerIndex] = j;
					}
				}
				break;
			}
		}
		return true;
	}

	@Override
	protected void onPause() {
		super.onPause();
		timer.cancel();
	}

	@Override
	protected void onResume() {
		super.onResume();

		timer = new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				//�eMediaPlayer�I�u�W�F�N�g�̍Đ���Ԃ��擾
				boolean[] playingNotes=new boolean[numKeys];
				for(int i = 0; i < playingNotes.length; i++)
					playingNotes[i] = key[i].isPlaying();
				//�O����s���Ƃ͍Đ���Ԃ��ς�����ꍇ�̂݉�ʏ������������s
				if(!Arrays.equals(playingNotes, lastPlayingNotes)){
					bitmap_keyboard = drawKeys();
					//UI�X���b�h��ImageView�ɉ摜���Z�b�g
					runOnUiThread(new Runnable(){
						@Override
						public void run() {
							iv.setImageBitmap(bitmap_keyboard);
						}
					});
				}
				//�Đ���Ԃ�ϐ��ɕۑ�
				lastPlayingNotes = playingNotes;
			}
		}, 0, 100);
	}

	void makeRegions(){
		int kw,kh,bkw,bkh;
		//��ʃT�C�Y����L�[�̑傫�����v�Z����
		kw = (int)(sw/numWk);
		kh = (int)(sh*0.8);
		bkw = (int)(kw*0.6);
		bkh = (int)(sh*0.5);
		//�L�[�̌`�ɍ��킹��path�I�u�W�F�N�g�̍쐬
		Path[] path = new Path[4];
		path[0] = new Path();
		path[1] = new Path();
		path[2] = new Path();
		path[3] = new Path();
		//�E�ɍ����̂��锒��
		path[0].lineTo(0, kh);
		path[0].lineTo(kw, kh);
		path[0].lineTo(kw, bkh);
		path[0].lineTo(kw-(bkw/2),bkh);
		path[0].lineTo(kw-(bkw/2), 0);
		path[0].close();
		//���E�ɍ����̂��锒��
		path[1].moveTo(bkw/2, 0);
		path[1].lineTo(bkw/2, bkh);
		path[1].lineTo(0,bkh);
		path[1].lineTo(0,kh);
		path[1].lineTo(kw, kh);
		path[1].lineTo(kw, bkh);
		path[1].lineTo(kw-(bkw/2),bkh);
		path[1].lineTo(kw-(bkw/2), 0);
		path[1].close();
		//���ɍ����̂��锒��
		path[2].moveTo(bkw/2, 0);
		path[2].lineTo(bkw/2, bkh);
		path[2].lineTo(0,bkh);
		path[2].lineTo(0,kh);
		path[2].lineTo(kw, kh);
		path[2].lineTo(kw,0);
		path[2].close();
		//����
		path[3].addRect(0, 0, bkw, bkh, Direction.CCW);
		//Path�I�u�W�F�N�g�̏����g�p����Region�I�u�W�F�N�g���쐬���A�L�[���ƂɊ��蓖�Ă�
		Region region = new Region (0,0,sw,sh);
		int kt[] = new int[]{0,1,2,0,1,1,2,0,1,2,0,3,3,-1,3,3,3,-1,3,3};
		for(int i = 0; i < numWk; i++){
			kb[i] = new Region();
			Path pathtmp = new Path();
			pathtmp.addPath(path[kt[i]], i*kw, 0); 
			kb[i].setPath(pathtmp, region);
		}
		int j = numWk;
		for(int i = numWk; i < kt.length; i++){
			if(kt[i] != -1){
				kb[j] = new Region();
				Path pathtmp = new Path();
				pathtmp.addPath(path[kt[i]],(i - numWk + 1) * kw - (bkw / 2), 0);
				kb[j].setPath(pathtmp,region);
				j = j + 1;
			}
		}
	}


	Bitmap drawKeys(){
		Bitmap bm = Bitmap.createBitmap(sw, sh, Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(bm); 
		for(int i = 0; i < numWk; i++){
			if(key[i].isPlaying()){
				drawable_white_pressed.setBounds(kb[i].getBounds());
				drawable_white_pressed.draw(canvas);
			}else{
				drawable_white.setBounds(kb[i].getBounds());
				drawable_white.draw(canvas);
			}
		}
		for(int i = numWk; i < numKeys; i++){
			if(key[i].isPlaying()){
				drawable_black_pressed.setBounds(kb[i].getBounds());
				drawable_black_pressed.draw(canvas);
			}else{
				drawable_black.setBounds(kb[i].getBounds());
				drawable_black.draw(canvas);
			}
		}
		return bm;
	}

	private void playNote(MediaPlayer mp){
		mp.seekTo(0);
		mp.start();
	}

	private void stopNote(MediaPlayer mp){
		mp.pause();
	}

}