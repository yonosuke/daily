package l08;
class Car6 {
	int num;
	double gas;
	
	int getNum() {
		System.out.println("ナンバーを調べました。");
		return num;
	}
	
	double getGas() {
		System.out.println("ガソリン量をしらべました。");
		return gas;
	}
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
public class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car6 car1 = new Car6();
		
		car1.setNumGas(1234, 20.5);//setNumGasメソッドにint引数1234とdouble型引数20.5を渡して実行
		
		int number = car1.getNum();//getNumメソッドを実行
		double gasoline = car1.getGas();//getGasメソッドを実行
		
		System.out.println("サンプルから車を調べたところ");
		System.out.println("ナンバーは" + number + "ガソリン量は" + gasoline + "でした。");//メソッドの戻り値を代入して実行

	}

}
