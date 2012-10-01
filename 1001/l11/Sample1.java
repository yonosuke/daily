package l11;

class Car {
	private int num;
	private double gas;
	
	public Car() { //コンストラクタ　サブクラスのオブジェクトを作成したときにはスーパークラスのコンストラクタの処理が先に行われる。
		num = 0;   //サブクラスのコンストラクタ内の先頭で、スーパークラスの引数の無いコンストラクタを呼び出す
		gas = 0.0; //（スーパークラスから継承したメンバの初期化が行われる）
		System.out.println("車を作成しました。"); //インスタンスが生成されたときに実行される
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

class RacingCar extends Car {
	private int course; //追加するフィールド
	
	public RacingCar() { //コンストラクタ
		course = 0;
		System.out.println("レーシングカーを作成しました。"); //インスタンスが生成されたときに実行される
	}
	
	public void setCourse(int c) { //追加するメソッド
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
}


public class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RacingCar rccar1 = new RacingCar(); //サブクラスのインスタンスを作成
		
		rccar1.setCar(1234, 20.5); //継承したメソッドを呼んでいる
		rccar1.setCourse(5); //追加したメソッドを呼んでいる

	}

}
