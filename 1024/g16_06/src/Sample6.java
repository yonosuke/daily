import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sample6 extends Applet implements ActionListener {
	
	Button bt;
	
	public void init(){
		bt = new Button("開始"); //ボタンオブジェクトを作成
		add(bt); //アプレットにボタンオブジェクトをつける
		bt.addActionListener(this); //ボタンが押されたときのイベントを受け取る準備
	}

	@Override
	public void actionPerformed(ActionEvent ae) { //ボタンが押された時の処理
		// TODO 自動生成されたメソッド・スタブ
		bt.setLabel("中止"); //ラベルを中止にする

	}

}
