package sample.application.kalimba;

import android.app.Activity;
import android.os.Bundle;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.view.View;
import android.view.View.OnClickListener;

public class KalimbaActivity extends Activity implements OnClickListener {

	MediaPlayer[] mp; //MediaPlayer型配列のクラス変数mpの宣言

	@Override //onCreate()メソッドをオーバーライド
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TypedArray notes = getResources().obtainTypedArray(R.array.notes); //notes.xmlのリソースを取得して、型付きの配列TypedArray型の変数notesに代入
		TypedArray buttons = getResources().obtainTypedArray(R.array.buttons); //button
		mp = new MediaPlayer[notes.length()]; //MediaPlayer型のインスタンスを生成
		for(int i = 0; i < notes.length(); i++) //int型変数iの初期値は0　iがnotesの個数より少ない場合　インクリメント
			mp[i] = MediaPlayer.create(this,notes.getResourceId(i, -1)); //MediaPlayer型インスタンスの生成
		for(int i = 0; i < buttons.length(); i++) //int型変数iの初期値は0　iがbuttonsの個数より少ない場合　インクリメント
			findViewById(buttons.getResourceId(i, -1)).setOnClickListener(this); //ボタンのリスナー登録
	}

	@Override
	public void onClick(View v) { //onClicd()メソッドをオーバーライド
		TypedArray buttons = getResources().obtainTypedArray(R.array.buttons); //button
		for(int i = 0; i < buttons.length(); i++){ //タップされたボタンを特定し、ボタンに対応した音を再生
			if(buttons.getResourceId(i, -1) == v.getId()){ //buttonsにgetResourceIdメソッドを実行した結果とvにgetId()メソッドを実行した結果が同じ場合
				mp[i].seekTo(0); //変数mpにseekTo()メソッドを実行
				mp[i].start(); //変数mpにstart()メソッドを実行
				break;
			}
		}
	}
}