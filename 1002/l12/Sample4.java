package l12;

interface iVehicle4{
	void vShow(); //抽象メソッド
}

interface iMaterial4{ //抽象メソッド
	void mShow();
}

class Car4 implements iVehicle4, iMaterial4{ //インターフェイスを実装
	private int num;
	private double gas;
	
	
	public Car4(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	public void vShow(){ //iVehicle4のメソッドを定義
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	
	public void mShow(){ //iMaterila4のメソッドを定義
		System.out.println("車の材質は鉄です。");
		
	}
}

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car4 car1 = new Car4(1234, 20.5);
		car1.vShow();
		car1.mShow();

	}

}
