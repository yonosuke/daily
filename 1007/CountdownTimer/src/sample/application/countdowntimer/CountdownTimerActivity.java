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
        setContentView(R.layout.activity_countdown_timer); //レイアウトの設定

        mContext = this; //このthisって？
        tv = (TextView) this.findViewById(R.id.textView1); //TextView型クラス変数tvの初期化
        btnStart = (Button) this.findViewById(R.id.buttonStart); //Button型クラス変数buttonStartの初期化
        btnStop = (Button) this.findViewById(R.id.buttonStop); //Button型クラス変数buttonStopの初期化
        sb = (SeekBar) this.findViewById(R.id.seekBar1); //SeekBar型クラス変数sbの初期化
        sb.setBackgroundDrawable(drawScale()); //SeekBar型クラス変数sbの背景を、下記drawScale()メソッドにて設定
        setListeners(); //setScale()メソッドを呼び出す
	}

	BitmapDrawable drawScale(){ //Canvasを使用して描画した画像をBitmapDrawabl型のインスタンスとして返すメソッド onCreate()メソッドに呼び出される 書き方ちょっと特殊？
		  Paint paint; //Paint型変数paintの宣言
		  Path path; //Path型変数pathの宣言
		  Canvas canvas; //Canvas型変数canvasの宣言
		  Bitmap bitmap; //Bitmap型変数bitmapの宣言

		  paint = new Paint(); //Paint型のインスタンスを生成
		  paint.setStrokeWidth(0); //Paint型変数paintにsetStrokeWidth()メソッドを実行
		  paint.setStyle(Paint.Style.STROKE); //Paint型変数paintにsetSytle()メソッドを実行
		  bitmap = Bitmap.createBitmap(241, 30, Bitmap.Config.ARGB_8888); //Bitmap型のCreateBitmap()メソッドを実行し変数bitmapに代入
		  
		  path = new Path(); //Path型のインスタンスを生成
		  
		  canvas = new Canvas(bitmap); //CanVas型のインスタンスを生成 引数はbitmap
		  for(int i = 0; i < 17; i++){ //int型変数iの初期値は0　1が17より小さいとき インクリメント
		    path.reset(); //変数pathにreset()メソッドを実行
		    
		    if(i == 5 || i == 10 || i == 15){ //int型変数iが5又は10又は15のとき
		      paint.setColor(Color.WHITE); //Paint型変数paintにset.Color()メソッドを実行
		    }else{
		    	paint.setColor(Color.GRAY); //Paint型変数paintにset.Color()メソッドを実行
		    }
		    
		    path.moveTo(i*16, 5); //Path型変数pathにmoveTo()メソッドを実行
		    path.quadTo(i*16, 5, i*16, 15); //Path型変数pathにquadTo()メソッドを実行
		    canvas.drawPath(path,paint); //Canvas型変数canvasにdrawPathメソッドを実行
		    
		  }
		  BitmapDrawable bd = new BitmapDrawable(bitmap); //BitmapDrawable型のインスタンスを生成（引数はbitmap）しBitmapDrawable型変数bdに代入
		  return bd; //戻り値はBitapDrawable型の変数bd
		}

	void setListeners(){ //リスナーの登録をまとめて実行する onCreate()メソッドに呼び出される
		  sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){ //OnSeekBarChangeListener型のインスタンスを作成し、SeekBar型変数sbにsetOnCeekBarChangeListenerメソッドを実行
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