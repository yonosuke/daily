
class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car[] cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i = 0; i < cars.length; i++){
			Class c1 = cars[i].getClass();
			System.out.println((i + 1) + "�Ԗڂ̃I�u�W�F�N�g�̃N���X��" + c1 + "�ł��B");
		}

	}

}
