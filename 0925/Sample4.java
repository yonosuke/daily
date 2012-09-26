package l08;
class Car2 {
	int num;
	double gas;
	
	void setNum(int n) {//メソッドで定義されている引数は仮引数
		num = n;
		System.out.println("車のナンバーを" + num + "にしました。");
	}
	
	void getGas(double g) {//メソッドで定義されている引数は仮引数（仮引数と実引数の名前は違うものでもよい）
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}
}


public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car2 car1 = new Car2();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNum(number);
		car1.getGas(gasoline);
		
		//car1.setNum(1234);//実引数1234をsetNumメソッドに渡して呼び出す
		//car1.getGas(20.5);//実引数20.5をgetGasメソッドに渡して呼び出す

	}

}
