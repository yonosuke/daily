import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Sample5 extends Applet {
	
	int x = 10;
	int y = 10;
	
	public void init(){
		addMouseListener(new MouseAdapter() { //�C���i�[�N���X�i�����N���X�j�@�A�_�v�^�N���X���p��
			public void mousePressed(MouseEvent e){
				x = e.getX();
				y = e.getY();
				repaint();
			}
		});
	}
	
	public void paitn(Graphics g){
		g.fillOval(x, y, 10, 10);
	}
}
