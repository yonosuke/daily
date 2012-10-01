package l11;

class Car5 {
	protected int num;
	protected double gas;
	
	public Car5() {
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

class RacingCar5 extends Car5 {
	private int course;
	
	public RacingCar5() {
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

public class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car5 rccar1 = new Car5(); //スーパークラスのインスタンスでも
		
		rccar1.setCar(1234, 20.5);
		//rccar1.setCouse(5);
		
		rccar1.show(); //サブクラスのshow()メソッドが呼び出される
		
		//インスタンスを指す変数のクラスに関係なく、インスタンス自身のクラスによって適切なメソッドが呼び出される。

	}

}
