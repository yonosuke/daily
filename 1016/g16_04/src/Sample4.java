import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Sample4 extends Applet implements MouseListener {

	int x = 10;
	int y = 10;
	
	public void init(){
		addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		x = e.getX();
		y = e.getY();
		repaint();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}
	public void paint(Graphics g){
		g.fillOval(x, y, 10, 10);
	}

}
