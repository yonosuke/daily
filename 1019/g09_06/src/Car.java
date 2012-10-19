
public class Car {
	private int num;
	private double gas;
	
	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	
	public Car(int n, double g){
		this(); //上の引数なしのコンストラクタを呼ぶ
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
