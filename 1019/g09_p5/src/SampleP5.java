
class SampleP5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		MyPoint p1 = new MyPoint();
		p1.setX(10);
		p1.setY(5);
		
		int px1 = p1.getX();
		int py1 = p1.getY();
		
		System.out.println("p1��x���W��" + px1 + "Y���W��" + py1 + "�ł����B");
		
		MyPoint p2 = new MyPoint(20, 10);
		
		int px2 = p2.getX();
		int py2 = p2.getY();
		
		System.out.println("p2��x���W��" + px2 + "Y���W��" + py2 + "�ł����B");

	}

}
