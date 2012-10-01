package l11;

class Car9 {
	protected int num;
	protected double gas;
	
	public Car9() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
}

class RacingCar9 extends Car9{
	private int course;
	
	public RacingCar9() {
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
}

public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car9[] cars;
		cars = new Car9[2];
		
		cars[0] = new Car9();
		cars[1] = new RacingCar9();
		
		for(int i = 0; i < cars.length; i++){
			Class c1 = cars[i].getClass(); //getClass()メソッドはClassクラスのオブジェクトが返される
			System.out.println((i + 1) + "番目のオブジェクトのクラスは" + c1 + "です。");
		}

	}

}
