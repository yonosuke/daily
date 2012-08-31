package Ch03;

public class Ch03_03 {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer x;
		Integer y = 5;
		x = y++;
		System.out.println("xは" + x + "/" + "yは" + y);
		Integer x1;
		Integer y1 = 5;
		x1 = y1--;
		System.out.println("x1は" + x1 + "/" + "y1は" + y1);
		Integer x2;
		Integer y2 = 5;
		x2 = ++y2;
		System.out.println("x2は" + x2 + "/" + "y2は" + y2);
		Integer x3;
		Integer y3 = 5;
		x3 = --y3;
		System.out.println("x3は" + x3 + "/" + "y3は" + y3);

	}

}
