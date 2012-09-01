package sample.application.voiceinputtest;

import android.os.Bundle;
import android.app.Activity;
import java.util.ArrayList;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Locale;
import android.speech.tts.TextToSpeech;

import android.content.SharedPreferences;
import android.text.Editable;
import android.text.Selection;
import java.text.DateFormat;
import java.util.Date;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.text.TextWatcher;

public class VoiceInputTest extends Activity implements View.OnClickListener, TextToSpeech.OnInitListener {
	
	boolean memoChanged=false;
	
	private static final int REQUEST_CODE = 1;
	private EditText inpText;
	private String preInp = "";
	private Button inpBtn, canBtn, clsBtn;	
	final private Float SPEECH_SLOW = 0.5f;
	final private Float SPEECH_NORMAL = 1.0f;
	final private Float SPEECH_FAST = 1.5f;
	final private Float PITCH_LOW = 0.5f;
	final private Float PITCH_NORMAL = 1.0f;
	final private Float PITCH_HIGH = 1.5f;
	private TextToSpeech    tts;
	private Button buttonSpeech;
	private Button buttonSlow;
	private Button buttonNormal;
	private Button buttonFast;
	private Button buttonLowPitch;
	private Button buttonNormalPitch;
	private Button buttonHighPitch;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_voice_input_test);
		
		inpText = (EditText)findViewById(R.id.result);
		inpBtn = (Button)findViewById(R.id.speech);
		inpBtn.setOnClickListener(this);
		canBtn = (Button)findViewById(R.id.cancel);
		canBtn.setOnClickListener(this);
		clsBtn = (Button)findViewById(R.id.clear);
		clsBtn.setOnClickListener(this);
		buttonSpeech = (Button)findViewById(R.id.ButtonSpeech);
		buttonSpeech.setOnClickListener(this);
		buttonSlow = (Button)findViewById(R.id.ButtonSlow);
		buttonSlow.setOnClickListener(this);
		buttonNormal = (Button)findViewById(R.id.ButtonNormal);
		buttonNormal.setOnClickListener(this);
		buttonFast = (Button)findViewById(R.id.ButtonFast);
		buttonFast.setOnClickListener(this);
		buttonLowPitch = (Button)findViewById(R.id.ButtonLowPitch);
		buttonLowPitch.setOnClickListener(this);
		buttonNormalPitch = (Button)findViewById(R.id.ButtonNormalPitch);
		buttonNormalPitch.setOnClickListener(this);
		buttonHighPitch = (Button)findViewById(R.id.ButtonHighPitch);
		buttonHighPitch.setOnClickListener(this);
		tts = new TextToSpeech(this, this);
		
		EditText et=(EditText) findViewById(R.id.result);
		SharedPreferences pref=this.getSharedPreferences("MemoPrefs", MODE_PRIVATE);
		et.setText(pref.getString("memo", ""));
		et.setSelection(pref.getInt("cursor", 0));
		memoChanged=pref.getBoolean("memoChanged", false);
		
		TextWatcher tw=new TextWatcher(){

			@Override
			public void afterTextChanged(Editable s) {
				// TODO 自動生成されたメソッド・スタブ
				
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO 自動生成されたメソッド・スタブ
				
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO 自動生成されたメソッド・スタブ
				memoChanged=true;
				
			}
		};
		et.addTextChangedListener(tw);
		
		
		}
	
	@Override
	protected void onStop() {
		super.onStop();
		EditText et=(EditText) findViewById(R.id.result);
		SharedPreferences pref=getSharedPreferences("MemoPrefs", MODE_PRIVATE);
		SharedPreferences.Editor editor=pref.edit();
		editor.putString("memo", et.getText().toString());
		editor.putInt("cursor", Selection.getSelectionStart(et.getText()));
		editor.putBoolean("memoChanged", memoChanged);
		editor.commit();
	}
	
	void saveMemo(){
		  EditText et=(EditText)this.findViewById(R.id.result);
		  String title;
		  String memo=et.getText().toString();
		  if(memo.trim().length()>0){
		    if(memo.indexOf("\n")==-1){
		      title=memo.substring(0, Math.min(memo.length(),20));
		    }
		    else{
		      title=memo.substring(0, Math.min(memo.indexOf("\n"),20));
		    }
		    String ts=DateFormat.getDateTimeInstance().format(new Date());
		    DB memos=new DB(this);
		    SQLiteDatabase db=memos.getWritableDatabase();
		    ContentValues values=new ContentValues();
		    values.put("title", title+"\n"+ts);
		    values.put("memo", memo);
		    db.insertOrThrow("memoDB", null,values);
		    memos.close();
		    memoChanged=false;
		  }
		}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (null != tts) {
			tts.shutdown();
		}
	}

	public void onInit(int status) {
		if (TextToSpeech.SUCCESS == status) {
			Locale locale = Locale.ENGLISH;
			if (tts.isLanguageAvailable(locale) >= TextToSpeech.LANG_AVAILABLE) {
				tts.setLanguage(locale);
			} else {
				Log.d("", "Error SetLocale");
			}
		} else {
			Log.d("", "Error Init");
		}
	}

	public void speechText() {
		String string = ((EditText)findViewById(R.id.result)).getText().toString();
		if (0 < string.length()) {
			if (tts.isSpeaking()) {
				tts.stop();
			}
		}
	tts.speak(string, TextToSpeech.QUEUE_FLUSH, null);
	}
	
	@Override
	public void onClick(View v) {
		if(v == inpBtn) {
			try {
				Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
				intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
				intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "音声を入力してください。");
				startActivityForResult(intent, REQUEST_CODE);
			}
			catch (ActivityNotFoundException e) {
				Toast.makeText(VoiceInputTest.this, "Not found Activity", Toast.LENGTH_LONG).show();
			}
		}
		else if(v == canBtn) {
			if(preInp != null) {
				inpText.setText(preInp);
				inpText.setSelection(preInp.length());
			}
		}
		else if(v == clsBtn) {
			inpText.setText("");
		}
		if (buttonSpeech == v) {
			speechText();
		} else if (buttonSlow == v) {
			tts.setSpeechRate(SPEECH_SLOW);
		} else if (buttonNormal == v) {
			tts.setSpeechRate(SPEECH_NORMAL);
		} else if (buttonFast == v) {
			tts.setSpeechRate(SPEECH_FAST);
		} else if (buttonLowPitch == v) {
			tts.setPitch(PITCH_LOW);
		} else if (buttonNormalPitch == v) {
			tts.setPitch(PITCH_NORMAL);
		} else if (buttonHighPitch == v) {
			tts.setPitch(PITCH_HIGH);
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		String input = "";
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
			preInp = inpText.getText().toString();
			ArrayList<String> candidates = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
			Log.v("Speech", "Candidate Num = " + candidates.size());
			if(candidates.size() > 0) {
				input = preInp + candidates.get(0);
				}
			if(input != null) {
				inpText.setText(input);
				inpText.setSelection(input.length());
			}
		}
		if(resultCode==RESULT_OK){
			  EditText et=(EditText) findViewById(R.id.result);
			  switch(requestCode){
			  case 0:
			    et.setText(data.getStringExtra("text"));
			    memoChanged=false;
			    break;
			  }
			}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater mi=getMenuInflater();
		mi.inflate(R.menu.menu, menu);
		return super.onCreateOptionsMenu(menu);
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		EditText et=(EditText) findViewById(R.id.result);
		switch(item.getItemId()){
		case R.id.menu_save:
			saveMemo();
			break;
		case R.id.menu_open:
			if(memoChanged) saveMemo();
			Intent i=new Intent(this,List.class);
			startActivityForResult(i,0);
			break;
		case R.id.menu_new:
			if(memoChanged) saveMemo();
			et.setText("");
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
}