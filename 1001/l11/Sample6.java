package l11;

class Car6 {
	protected int num;
	protected double gas;
	
	public Car6() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void show() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

class RacingCar6 extends Car6 {
	private int course;
	
	public RacingCar6() {
		course = 0;
		System.out.println("���[�V���O�J�[���쐬���܂����B");
	}
	
	public void setCouse(int c) {
		course = c;
		System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
	}
	
	public void show() { //�T�u�N���X�ŃI�[�o�[���C�h����show()���\�b�h
		System.out.println("���[�V���O�J�[�̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
		System.out.println("�R�[�X�ԍ���" + course + "�ł��B");
	}
}

public class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car6[] cars; //�X�[�p�[�N���X�̔z�������
		cars = new Car6[2];
		
		cars[0] = new Car6(); //�X�[�p�[�N���X�̃C���X�^���X���쐬
		cars[0].setCar(1234, 20.5);
		
		cars[1] = new RacingCar6(); //�T�u�N���X�̃C���X�^���X���쐬
		cars[1].setCar(4567, 30.5);
		
		for(int i = 0; i < cars.length; i++) { //�ǂ���������X�[�p�[�N���X�̔z��ň�����i�|�����[�t�B�Y���j
			cars[i].show();
		}

	}

}
