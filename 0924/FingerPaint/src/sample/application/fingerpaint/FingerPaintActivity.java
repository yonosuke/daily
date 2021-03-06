package sample.application.fingerpaint;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.os.Environment;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;

public class FingerPaintActivity extends Activity implements OnTouchListener {
	public Canvas canvas;
	public Paint paint;
	public Path path;
	public Bitmap bitmap;
/*	public Float x1; //プリミティブをつかわずにラッパークラスでストイックに
	public Float y1; //プリミティブをつかわずにラッパークラスでストイックに
	public Integer w; //プリミティブをつかわずにラッパークラスでストイックに
	public Integer h; //プリミティブをつかわずにラッパークラスでストイックに*/
	float x1,y1;
	int w,h;
	
	
	
/*	public boolean onTouch(View v, MotionEvent event){ //実体を持つのでabstractをトル
		//return Boolean.valueOf(true);//参照型にこだわってストイックに書くとこうなるBOXING とりまtrue
		
		return Boolean.valueOf(true);
		
		//return Boolean2, TURE;
	}
	/*
	public enum Boolean { //enumで書くとこうなるはず
		TRUE(true),False(false);
		boolean value = true;
		Boolean(boolean bool) {
			this.value = bool;
		}
	}
	*/

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); //親クラスの初期化
		this.setContentView(R.layout.fingerpaint); //レイアウトの指定
		
		ImageView iv = (ImageView) this.findViewById(R.id.imageView1); //findViewByIdはFingerPaintActivityクラスのインスタンスメソッド Activityクラスで定義されている
		Display disp = ((WindowManager)this.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay(); //Display型のdispというローカル変数 getSystemServiceはFingerPaintActivityクラスのインスタンスメソッド Contextクラスで定義されている WindowManagerでかえってくるのがわかってるから変数をキャストしてる getDefaultDisplayはクラスメソッド 
		/*↑をわかりやすくすると
		WindowManager wm = (WindowManager)this.getSystemService(Context.WINDOW_SERVICE);
		Display disp = wm.getDefaultDisplay();

		もっとわかりやすくすると
		Object obj = this.getSystemService(Context.WINDOW_SERVICE);
		WindowManager wm = (WindowManager)obj;
		Display disp = wm.getDefaultDisplay();
		
		this.getSystemService(Context.WINDOW_SERVICE)で戻ってくるのはObject型
		WindowManagerという確証があるのでキャスト
		Object型では利用できないgetDefaultDisplay()メソッドをキャストしたインスタンスから実行 
		*/
		this.w = disp.getWidth(); //端末の解像度を取得
		this.h = disp.getHeight(); //端末の解像度を取得
		this.bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888); //BitMapオブジェクトを作成 Bitmapクラスはandroid.graphicsパッケージ Bitmapクラスのクラスメソッド
		this.paint = new Paint();
		this.path = new Path();
		this.canvas = new Canvas(bitmap);
		this.paint.setStrokeWidth(5); //線の太さを指定 単位はdp 1ピクセルの線の場合は0を指定
		this.paint.setStyle(Paint.Style.STROKE);
		this.paint.setStrokeJoin(Paint.Join.ROUND);
		this.paint.setStrokeCap(Paint.Cap.ROUND);
		this.canvas.drawColor(Color.WHITE);
		iv.setImageBitmap(bitmap); //BitMapオブジェクトをImageViewに表示
		iv.setOnTouchListener(this);
	}
	
	@Override
	public boolean onTouch(View v, MotionEvent event){
		float x = event.getX(); //タッチ位置の座標を取得
		float y = event.getY(); //タッチ位置の座標を取得
		switch (event.getAction()){ //アクションの種類を取得して分岐処理
		case MotionEvent.ACTION_DOWN:
			this.path.reset();
			this.path.moveTo(x, y);
			this.x1 = x;
			this.y1 = y;
			break;
		case MotionEvent.ACTION_MOVE:
			path.quadTo(x1, y1, x, y);
			this.x1 = x;
			this.y1 = y;
			this.canvas.drawPath(this.path,this.paint);
			this.path.reset();
			this.path.moveTo(x, y);
			break;
		case MotionEvent.ACTION_UP:
			if(x == x1 && y == y1)y1 = y1 + 1;
			this.path.quadTo(x1, y1, x, y);
			this.canvas.drawPath(this.path, this.paint);
			this.path.reset();
			break;
		}
		ImageView iv = (ImageView)this.findViewById(R.id.imageView1);
		iv.setImageBitmap(bitmap); //ImageViewに表示
		return true;
	}
	
	void save() {
		
		SharedPreferences prefs = getSharedPreferences("FingerPaintPreferences", MODE_PRIVATE);
		int imageNumber = prefs.getInt("imageNumber", 1);
		File file = null;
		
		if (externalMedisChecker()) {
			DecimalFormat form = new DecimalFormat("0000");
			String path = Environment.getExternalStorageDirectory() + "/mypaint/";
			File outDir = new File(path);
			if(!outDir.exists());
			
			do {
				file = new File(path + "img" +form.format(imageNumber) + ".png");
				imageNumber++;
			} while(file.exists());
			if(writeImage(file)) {
				SharedPreferences.Editor editor = prefs.edit();
				editor.putInt("imageNumber", imageNumber);
				editor.commit();
			}
		}
	}

	private boolean writeImage(File file) {
		try {
			FileOutputStream fo = new FileOutputStream(file);
			bitmap.compress(CompressFormat.PNG, 100, fo);
			fo.flush();
			fo.close();
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			return false;
		}
		return true;
	}

	private boolean externalMedisChecker() {
		boolean result = false;
		String status = Environment.getExternalStorageState();
		if(status.equals(Environment.MEDIA_MOUNTED))result = true;
		return result;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater mi = getMenuInflater();
		mi.inflate(R.menu.menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		case R.id.menu_save:
			save();
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
