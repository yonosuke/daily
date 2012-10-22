import java.applet.Applet;
import java.awt.Graphics;


public class Sample7 extends Applet implements Runnable {
	
	int num;
	
	public void inti(){
		Thread th;
		th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		try{
			for(int i = 0; i < 10; i++){
				num = i;
				repaint();
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
		}
	}
	
	public void paint(Graphics g){
		String str = num + "です。";
		g.drawString(str, 10, 10);
	}

}
