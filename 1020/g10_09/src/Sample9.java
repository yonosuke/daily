
class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car[] cars = new Car[3];
		
		for(int i = 0; i < cars.length; i++){
			cars[i] = new Car();
		}
		
		cars[0].setCar(1234, 20.5);
		cars[1].setCar(2345, 30.5);
		cars[2].setCar(3456, 40.5);
		
		for(int i = 0; i < cars.length; i++){
			cars[i].show();
		}
	}

}
