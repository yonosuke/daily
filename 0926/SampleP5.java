package l08;
class MyPoint {
	int x;
	int y;
	
	void setX(int hoge1){
		x = hoge1;
	}
	
	void setY(int hoge2){
		y = hoge2;
	}
	
	int getX(){
		return x;
	}
	
	int getY(){
		return y;
	}
}
public class SampleP5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		MyPoint p1 = new MyPoint();
		p1.setX(10);
		p1.setY(5);
		
		int px = p1.getX();
		int py = p1.getY();
		
		System.out.println("X���W��" + px + "Y���W��" + py + "�ł���");

	}

}
