package l09;

class Car6 {
	private int num;
	private double gas;
	
	public Car6() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	
	public Car6(int n, double g) {
		this();
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	
}

public class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car6 car1 = new Car6();
		//車を作成しました。
		car1.show();
		//車のナンバーは0です。
		//ガソリン量は0.0です。
		
		Car6 car2 = new Car6(1234, 20.5);
		//車を作成しました。
		car2.show();
		//ナンバーを1234ガソリン量を20.5にしました。
		//車のナンバーは1234です。
		//ガソリン量は20.5です。
	}
}
