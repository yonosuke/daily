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
/*	public Float x1; //�v���~�e�B�u�����킸�Ƀ��b�p�[�N���X�ŃX�g�C�b�N��
	public Float y1; //�v���~�e�B�u�����킸�Ƀ��b�p�[�N���X�ŃX�g�C�b�N��
	public Integer w; //�v���~�e�B�u�����킸�Ƀ��b�p�[�N���X�ŃX�g�C�b�N��
	public Integer h; //�v���~�e�B�u�����킸�Ƀ��b�p�[�N���X�ŃX�g�C�b�N��*/
	float x1,y1;
	int w,h;
	
	
	
/*	public boolean onTouch(View v, MotionEvent event){ //���̂����̂�abstract���g��
		//return Boolean.valueOf(true);//�Q�ƌ^�ɂ�������ăX�g�C�b�N�ɏ����Ƃ����Ȃ�BOXING �Ƃ��true
		
		return Boolean.valueOf(true);
		
		//return Boolean2, TURE;
	}
	/*
	public enum Boolean { //enum�ŏ����Ƃ����Ȃ�͂�
		TRUE(true),False(false);
		boolean value = true;
		Boolean(boolean bool) {
			this.value = bool;
		}
	}
	*/

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); //�e�N���X�̏�����
		this.setContentView(R.layout.fingerpaint); //���C�A�E�g�̎w��
		
		ImageView iv = (ImageView) this.findViewById(R.id.imageView1); //findViewById��FingerPaintActivity�N���X�̃C���X�^���X���\�b�h Activity�N���X�Œ�`����Ă���
		Display disp = ((WindowManager)this.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay(); //Display�^��disp�Ƃ������[�J���ϐ� getSystemService��FingerPaintActivity�N���X�̃C���X�^���X���\�b�h Context�N���X�Œ�`����Ă��� WindowManager�ł������Ă���̂��킩���Ă邩��ϐ����L���X�g���Ă� getDefaultDisplay�̓N���X���\�b�h 
		/*�����킩��₷�������
		WindowManager wm = (WindowManager)this.getSystemService(Context.WINDOW_SERVICE);
		Display disp = wm.getDefaultDisplay();

		�����Ƃ킩��₷�������
		Object obj = this.getSystemService(Context.WINDOW_SERVICE);
		WindowManager wm = (WindowManager)obj;
		Display disp = wm.getDefaultDisplay();
		
		this.getSystemService(Context.WINDOW_SERVICE)�Ŗ߂��Ă���̂�Object�^
		WindowManager�Ƃ����m�؂�����̂ŃL���X�g
		Object�^�ł͗��p�ł��Ȃ�getDefaultDisplay()���\�b�h���L���X�g�����C���X�^���X������s 
		*/
		this.w = disp.getWidth(); //�[���̉𑜓x���擾
		this.h = disp.getHeight(); //�[���̉𑜓x���擾
		this.bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888); //BitMap�I�u�W�F�N�g���쐬 Bitmap�N���X��android.graphics�p�b�P�[�W Bitmap�N���X�̃N���X���\�b�h
		this.paint = new Paint();
		this.path = new Path();
		this.canvas = new Canvas(bitmap);
		this.paint.setStrokeWidth(5); //���̑������w�� �P�ʂ�dp 1�s�N�Z���̐��̏ꍇ��0���w��
		this.paint.setStyle(Paint.Style.STROKE);
		this.paint.setStrokeJoin(Paint.Join.ROUND);
		this.paint.setStrokeCap(Paint.Cap.ROUND);
		this.canvas.drawColor(Color.WHITE);
		iv.setImageBitmap(bitmap); //BitMap�I�u�W�F�N�g��ImageView�ɕ\��
		iv.setOnTouchListener(this);
	}
	
	@Override
	public boolean onTouch(View v, MotionEvent event){
		float x = event.getX(); //�^�b�`�ʒu�̍��W���擾
		float y = event.getY(); //�^�b�`�ʒu�̍��W���擾
		switch (event.getAction()){ //�A�N�V�����̎�ނ��擾���ĕ��򏈗�
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
		iv.setImageBitmap(bitmap); //ImageView�ɕ\��
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
