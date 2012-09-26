package l08;
class Car1 {
	int num;
	double gas;
	
	void show() {
		System.out.println("車のナンバーは" + this.num + "です。");//クラス内では直接（もしくは明示的にthis.をつけて）アクセス
		System.out.println("ガソリン量は" + this.gas + "です。");
	}
	
	void showCar() {
		System.out.println("これから車の情報を表示します。");
		this.show();//クラス内では直接（もしくは明示的にthis.をつけて）呼び出す
	}
}


public class Sample2 {

	public static void main(String[] args) {
		Car1 car1 = new Car1();
		car1.num = 1234;//クラス外ではインスタンスを指す変数名.をつけてアクセス
		car1.gas = 20.5;
		
		car1.show();
		car1.showCar();

	}

}
