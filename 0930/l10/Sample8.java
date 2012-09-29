package l10;

class Car2{
	private int num;
	private double gas;
	private String name; //クラス変数を使ったフィールド
	
	public Car2(){
		num = 0;
		gas = 0.0;
		name = "名無し";
		System.out.println("車を作成しました。");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void setName(String nm){ //クラス変数を仮引数とするメソッド
		name = nm;
		System.out.println("名前を" + name + "にしました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("名前は" + name + "です。");
	}
}

public class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car2 car1 = new Car2();
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1号車";
		
		car1.setCar(number, gasoline);
		car1.setName(str); //文字列インスタンス変数をさす変数を実引数として渡す
		
		car1.show();

	}

}
