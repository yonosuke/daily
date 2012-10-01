package l11;

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
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
	}
	
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

class RacingCar2 extends Car2 {
	private int course;
	
	public RacingCar2() {
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	
	public RacingCar2(int n, double g, int c) {
		super(n, g); //スーパークラスの引数2個のコンストラクタが呼び出される様にする（省略すると引数なしのコンストラクタが呼び出される）
		course = c;  //↑super()やthis()で呼び出すコンストラクタを指定する場合は、コンストラクタ内の先頭に書く必要がある
		System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
}

public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RacingCar2 rccar1 = new RacingCar2(1234, 20.5, 5);
	}

}
