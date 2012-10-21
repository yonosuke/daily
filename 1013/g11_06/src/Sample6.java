
class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car[] cars = new Car[2];
		
		cars[0] = new Car();
		cars[0].setCar(1234, 20.5);
		
		cars[1] = new Car();
		cars[1].setCar(4567, 30.5);
		
		for(int i = 0; i < cars.length ; i++){
			cars[i].show();
		}
	}

}
