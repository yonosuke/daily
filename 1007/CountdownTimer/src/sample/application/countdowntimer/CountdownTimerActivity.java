package sample.application.countdowntimer;

import android.app.Activity;
import android.os.Bundle;
import java.text.SimpleDateFormat;

import sample.application.countdowntimer.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class CountdownTimerActivity extends Activity {

	static TextView tv;
	static SeekBar sb;
	static Context mContext;
	static int timeLeft = 0;
	static Button btnStart,btnStop;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown_timer); //���C�A�E�g�̐ݒ�

        mContext = this; //����this���āH
        tv = (TextView) this.findViewById(R.id.textView1); //TextView�^�N���X�ϐ�tv�̏�����
        btnStart = (Button) this.findViewById(R.id.buttonStart); //Button�^�N���X�ϐ�buttonStart�̏�����
        btnStop = (Button) this.findViewById(R.id.buttonStop); //Button�^�N���X�ϐ�buttonStop�̏�����
        sb = (SeekBar) this.findViewById(R.id.seekBar1); //SeekBar�^�N���X�ϐ�sb�̏�����
        sb.setBackgroundDrawable(drawScale()); //SeekBar�^�N���X�ϐ�sb�̔w�i���A���LdrawScale()���\�b�h�ɂĐݒ�
        setListeners(); //setScale()���\�b�h���Ăяo��
	}

	BitmapDrawable drawScale(){ //Canvas���g�p���ĕ`�悵���摜��BitmapDrawabl�^�̃C���X�^���X�Ƃ��ĕԂ����\�b�h onCreate()���\�b�h�ɌĂяo����� ������������Ɠ���H
		  Paint paint; //Paint�^�ϐ�paint�̐錾
		  Path path; //Path�^�ϐ�path�̐錾
		  Canvas canvas; //Canvas�^�ϐ�canvas�̐錾
		  Bitmap bitmap; //Bitmap�^�ϐ�bitmap�̐錾

		  paint = new Paint(); //Paint�^�̃C���X�^���X�𐶐�
		  paint.setStrokeWidth(0); //Paint�^�ϐ�paint��setStrokeWidth()���\�b�h�����s
		  paint.setStyle(Paint.Style.STROKE); //Paint�^�ϐ�paint��setSytle()���\�b�h�����s
		  bitmap = Bitmap.createBitmap(241, 30, Bitmap.Config.ARGB_8888); //Bitmap�^��CreateBitmap()���\�b�h�����s���ϐ�bitmap�ɑ��
		  
		  path = new Path(); //Path�^�̃C���X�^���X�𐶐�
		  
		  canvas = new Canvas(bitmap); //CanVas�^�̃C���X�^���X�𐶐� ������bitmap
		  for(int i = 0; i < 17; i++){ //int�^�ϐ�i�̏����l��0�@1��17��菬�����Ƃ� �C���N�������g
		    path.reset(); //�ϐ�path��reset()���\�b�h�����s
		    
		    if(i == 5 || i == 10 || i == 15){ //int�^�ϐ�i��5����10����15�̂Ƃ�
		      paint.setColor(Color.WHITE); //Paint�^�ϐ�paint��set.Color()���\�b�h�����s
		    }else{
		    	paint.setColor(Color.GRAY); //Paint�^�ϐ�paint��set.Color()���\�b�h�����s
		    }
		    
		    path.moveTo(i*16, 5); //Path�^�ϐ�path��moveTo()���\�b�h�����s
		    path.quadTo(i*16, 5, i*16, 15); //Path�^�ϐ�path��quadTo()���\�b�h�����s
		    canvas.drawPath(path,paint); //Canvas�^�ϐ�canvas��drawPath���\�b�h�����s
		    
		  }
		  BitmapDrawable bd = new BitmapDrawable(bitmap); //BitmapDrawable�^�̃C���X�^���X�𐶐��i������bitmap�j��BitmapDrawable�^�ϐ�bd�ɑ��
		  return bd; //�߂�l��BitapDrawable�^�̕ϐ�bd
		}

	void setListeners(){ //���X�i�[�̓o�^���܂Ƃ߂Ď��s���� onCreate()���\�b�h�ɌĂяo�����
		  sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){ //OnSeekBarChangeListener�^�̃C���X�^���X���쐬���ASeekBar�^�ϐ�sb��setOnCeekBarChangeListener���\�b�h�����s
		    @Override
		    public void onProgressChanged(SeekBar seekBar, int progress,
		        boolean fromUser) {
		      timeLeft=progress*60;
		      if(fromUser)showTime(progress*60);
		      if(fromUser&&(progress>0)) btnStart.setEnabled(true);
		      else btnStart.setEnabled(false);
		      if(progress==0)btnStop.setEnabled(false);
		    }
		    @Override
		    public void onStartTrackingTouch(SeekBar seekBar) {
		    }
		    @Override
		    public void onStopTrackingTouch(SeekBar seekBar) {
		    }
		  });
			btnStart.setOnClickListener(new OnClickListener(){
				  public void onClick(View v) {
				    Intent intent = new Intent(mContext, TimerService.class);
				    intent.putExtra("counter", timeLeft);
				    startService(intent);
				    btnStart.setEnabled(false);
				    btnStop.setEnabled(true);
				    sb.setEnabled(false);
				  }
				});
				btnStop.setOnClickListener(new OnClickListener(){
				  public void onClick(View v) {
				    Intent i=new Intent(mContext,TimerService.class);
				    mContext.stopService(i);
				    btnStop.setEnabled(false);
				    btnStart.setEnabled(true);
				    sb.setEnabled(true);
				  }
				});
				((Button)findViewById(R.id.buttonSettings)).setOnClickListener(
					    new OnClickListener(){
					  public void onClick(View v) {
					    Intent intent=new Intent(CountdownTimerActivity.this, Preferences.class);
					    startActivity(intent);
					   }
					});
	}
	
	static void showTime(int timeSeconds){
		  SimpleDateFormat form=new SimpleDateFormat("mm:ss");
		  tv.setText(form.format(timeSeconds*1000));
		}
	
	public static void countdown(int counter){
		  showTime(counter);
		  timeLeft=counter;
		  if(counter%60==0) sb.setProgress(counter/60);
		  else sb.setProgress(counter/60+1);
		  if(counter!=0){
		    btnStop.setEnabled(true);
		    btnStart.setEnabled(false);
		    sb.setEnabled(false);
		  }else{
		    btnStop.setEnabled(false);
		    btnStart.setEnabled(false);
		    sb.setEnabled(true);
		  }
		}
	
}