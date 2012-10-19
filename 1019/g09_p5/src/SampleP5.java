
class SampleP5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyPoint p1 = new MyPoint();
		p1.setX(10);
		p1.setY(5);
		
		int px1 = p1.getX();
		int py1 = p1.getY();
		
		System.out.println("p1のx座標は" + px1 + "Y座標は" + py1 + "でした。");
		
		MyPoint p2 = new MyPoint(20, 10);
		
		int px2 = p2.getX();
		int py2 = p2.getY();
		
		System.out.println("p2のx座標は" + px2 + "Y座標は" + py2 + "でした。");

	}

}
