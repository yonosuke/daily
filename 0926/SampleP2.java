package l08;
class CarP2 {
	int num;
	double gas;
	
	void setNumGas (int n, double g) {
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
public class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CarP2 car1 = new CarP2();
		car1.setNumGas(1234, 20.5);
		car1.show();

	}

}
