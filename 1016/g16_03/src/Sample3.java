import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class Sample3 extends Applet {
	Image img;
	
	public void init(){ //アプレットが実行されるときに最初に一度だけ自動的に呼び出されるメソッド
		img = getImage(getDocumentBase(), "Image.gif");
	}
	
	public void paint(Graphics g){
		g.drawImage(img, 10, 10, this);
	}
}
