import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Sample2 extends Applet {
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawLine(10, 10, 100, 100);
		
		g.setFont(new Font("Serif", Font.BOLD, 24));
		g.drawString("Hello", 20, 20);
	}
}
