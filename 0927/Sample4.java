package l09;

class Car2 {
	private int num;
	private double gas;
	
	public Car2() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	
	public Car2(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car2 car1 = new Car2();
		//車を作成しました。
		car1.show();
		//車のナンバーは0です。
		//ガソリン量は0.0です。
		
		Car2 car2 = new Car2(1234, 20.5);
		//ナンバー1234ガソリン量20.5の車を作成しました
		car2.show();
		//車のナンバーは1234です。
		//ガソリン量は20.5です。

	}

}
