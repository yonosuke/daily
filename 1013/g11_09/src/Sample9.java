
class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car[] cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i = 0; i < cars.length; i++){
			Class c1 = cars[i].getClass();
			System.out.println((i + 1) + "番目のオブジェクトのクラスは" + c1 + "です。");
		}

	}

}
