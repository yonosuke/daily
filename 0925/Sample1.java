package l08;
class Car {//…①
	int num;//ナンバー
	double gas;//ガソリン
}


public class Sample1 {
	
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();//…②
		
		car1.num = 1234;//…③
		car1.gas = 20.5;
		
		Car car2;
		car2 = new Car();
		
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("車1のナンバーは" + car1.num + "です。");
		System.out.println("車1のガソリン量は" + car1.gas + "です。");
		
		System.out.println("車2のナンバーは" + car2.num + "です。");
		System.out.println("車2のガソリン量は" + car2.gas + "です。");
		
		/*①クラスを宣言し
		 *②インスタンスを作成し
		 *③メンバにアクセスする*/

	}

}
