package l09;

class Car1 {
	private int num;
	private double gas;
	
	public void setCar(int n){
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	
	public void setCar(double g){
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + n + "ガソリン量を" + g + "にしました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car1 car1 = new Car1();
		
		car1.setCar(1234, 20.5);
		car1.show();
		//ナンバーを1234ガソリン量を20.5にしました。
		//車のナンバーは1234です。
		//ガソリン量は20.5です。
		
		System.out.println("車のナンバーだけ変更します");
		//車のナンバーだけ変更します
		car1.setCar(2345);
		//車のナンバーは2345です。
		car1.show();
		//車のナンバーは2345です。
		//ガソリン量は20.5です
		
		System.out.println("ガソリン量だけ変更します");
		//ガソリン量だけ変更します
		car1.setCar(30.5);
		//ガソリン量を30.5にしました。
		car1.show();
		//車のナンバーは2345です。
		//ガソリン量は30.5です。

	}

}
