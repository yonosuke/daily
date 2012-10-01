package l12;

interface iVehicle {
	void show();
}

class Car3 implements iVehicle{
	private int num;
	private double gas;
	
	public Car3(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

class Plane3 implements iVehicle{
	private int flight;
	
	public Plane3(int f){
		flight = f;
		System.out.println("便" + flight + "の飛行機作成しました。");
	}
	
	public void show(){
		System.out.println("便" + flight + "です。");
	}
}
public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		iVehicle[] ivc;
		ivc = new iVehicle[2];
		
		ivc[0] = new Car3(1234, 20.5);
		ivc[1] = new Plane3(232);
		
		for(int i = 0; i < ivc.length; i++){
			ivc[i].show();
		}

	}

}
