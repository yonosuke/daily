package l14;

class CarException extends Exception{ //例外クラスを拡張
	
}

class Car5{
	private int num;
	private double gas;
	
	public Car5(){
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	
	public void setCar(int n, double g) throws CarException{ //例外を送出するメソッド
		if(g < 0){
			CarException e = new CarException();
			throw e; //例外を送出する
		}else{
			num = n;
			gas = g;
			System.out.println("ナンバーを" + num + "にガソリンを" + gas + "にしました。");
		}
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car5 car1 = new Car5();
		try{
			car1.setCar(1234, -10); //これで例外送出される
		}
		catch(CarException e){
			System.out.println(e + "が送出されました。");
		}
		car1.show();

	}

}
