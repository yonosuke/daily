package l12;

abstract class Vehicle2 { //抽象クラス
	protected int speed;
	public void setSpeed(int s){
		speed = s;
		System.out.println("速度を" + speed + "にしました。");
	}
	abstract void show(); //抽象メソッド
}

class Car2 extends Vehicle2{ //抽象クラスを拡張
	private int num;
	private double gas;
	
	public Car2(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	public void show(){ //show()メソッドの処理を定義した
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("速度は" + speed + "です。");
	}
}

class Plane2 extends Vehicle2{ //抽象クラスを拡張
	private int flight;
	
	public Plane2(int f){
		flight = f;
		System.out.println("便" + flight + "の飛行機を作成しました。");
	}
	
	public void show(){ //show()メソッドの処理を定義した
		System.out.println("飛行機の便は" + flight + "です。");
		System.out.println("速度は" + speed + "です。");
	}
}

public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Vehicle2[] vc; //抽象クラスの配列を準備
		vc = new Vehicle2[2];
		
		vc[0] = new Car2(1234, 20.5); //1つめのインスタンスはCarクラス
		
		vc[1] = new Plane2(232); //2つめのインスタンスはPlaneクラス
		
		for(int i = 0; i < vc.length; i++){
			if(vc[i] instanceof Car2){ //オブジェクトがCarクラスかどうか調べる
				System.out.println((i + 1) + "番目のオブジェクトはCar2クラスです。");
				}else{
				System.out.println((i + 1) + "番目のオブジェクトはCar2クラスではありません。");

			}
		}

	}

}