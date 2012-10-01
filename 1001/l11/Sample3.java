package l11;

class Car3 {
	protected int num; //protectedでサブクラスからもアクセスできる
	protected double gas; //protectedでサブクラスからもアクセスできる
	
	public Car3() {
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

class RacingCar3 extends Car3 {
	private int course;
	
	public RacingCar3() {
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	
	public void seCourse(int c) {
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
	
	public void newShow() {
		System.out.println("レーシングカーのナンバーは" + num + "です。"); //スーパークラスのメンバにアクセスできる。
		System.out.println("ガソリン量は" + gas + "です。"); //スーパークラスのメンバにアクセスできる。
		System.out.println("コースナンバーは" + course + "です。");
	}
}

public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RacingCar3 rccar1 = new RacingCar3();
		
		rccar1.newShow();

	}

}
