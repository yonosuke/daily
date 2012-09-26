package l08;
class Car3 {
	int num;
	double gas;
	
	void setNumGas(int n, double g) {//Sample4のsetNumとgetGasメソッドをまとめる（2つの引数を渡す）
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
public class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car3 car1 = new Car3();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number, gasoline);
		car1.show();

	}

}
