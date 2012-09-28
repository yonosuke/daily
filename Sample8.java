package l09;

class Car8 {
	public static int sum = 0; //クラス変数 クラス全体で何台の車があるかを表すフィールド
	private int num;
	private double gas;
	
	public Car8() { //インスタンスが作成されると
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("車を作成しました。");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public static void showSum() { //クラスメソッド インスタンスが作成されなくても呼び出せる
		System.out.println("車は全部で" + sum + "台あります。");
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car8.showSum(); //クラスメソッド インスタンスを作成せずに呼び出せる
		
		Car8 car1 = new Car8();
		car1.setCar(1234, 20.5);
		
		Car8.showSum();

	}

}
