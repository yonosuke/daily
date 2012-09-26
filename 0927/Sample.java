package l09;

class Car0 {
	private int num;
	private double gas;
	
	//必ず引数が2個の場合
	
	private Car0() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	
	public Car0(int n, double g) {
		this();
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Car0 car1 = new Car0();//privateなコンストラクタが呼び出されるオブジェクトは作成出来ない
		//car1.show();
		
		Car0 car2 = new Car0(1234, 20.5);
		car2.show();

	}

}
