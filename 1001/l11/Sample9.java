package l11;

class Car9 {
	protected int num;
	protected double gas;
	
	public Car9() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
}

class RacingCar9 extends Car9{
	private int course;
	
	public RacingCar9() {
		course = 0;
		System.out.println("���[�V���O�J�[���쐬���܂����B");
	}
}

public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car9[] cars;
		cars = new Car9[2];
		
		cars[0] = new Car9();
		cars[1] = new RacingCar9();
		
		for(int i = 0; i < cars.length; i++){
			Class c1 = cars[i].getClass(); //getClass()���\�b�h��Class�N���X�̃I�u�W�F�N�g���Ԃ����
			System.out.println((i + 1) + "�Ԗڂ̃I�u�W�F�N�g�̃N���X��" + c1 + "�ł��B");
		}

	}

}
