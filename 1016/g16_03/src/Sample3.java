import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;


public class Sample3 extends Applet {
	Image img;
	
	public void init(){ //�A�v���b�g�����s�����Ƃ��ɍŏ��Ɉ�x���������I�ɌĂяo����郁�\�b�h
		img = getImage(getDocumentBase(), "Image.gif");
	}
	
	public void paint(Graphics g){
		g.drawImage(img, 10, 10, this);
	}
}
