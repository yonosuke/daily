package l11;

class Car8 {
	protected int num;
	protected double gas;
	
	public Car8() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	
}

public class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car8 car1 = new Car8();
		Car8 car2 = new Car8();
		
		Car8 car3;
		car3 = car1;
		
		boolean bl1 = car1.equals(car2); //車を作成しました。
		boolean bl2 = car1.equals(car3); //車を作成しました。
		
		System.out.println("car1とcar2が同じか調べたところ" + bl1 + "でした。"); //false
		System.out.println("car1とcar3が同じか調べたところ" + bl2 + "でした。"); //true

	}

}
