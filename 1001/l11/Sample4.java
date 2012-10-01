package l11;

class Car4 {
	protected int num;
	protected double gas;
	
	public Car4() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

class RacingCar4 extends Car4 {
	private int course;
	
	public RacingCar4() {
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	
	public void setCouse(int c) {
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
	
	public void show() { //サブクラスでオーバーライドしたshow()メソッド
		System.out.println("レーシングカーのナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("コース番号は" + course + "です。");
	}
}

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RacingCar4 rccar1 = new RacingCar4();
		
		rccar1.setCar(1234, 20.5);
		rccar1.setCouse(5);
		
		rccar1.show();

	}

}
