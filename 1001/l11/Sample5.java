package l11;

class Car5 {
	protected int num;
	protected double gas;
	
	public Car5() {
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

class RacingCar5 extends Car5 {
	private int course;
	
	public RacingCar5() {
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

public class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car5 rccar1 = new Car5(); //�X�[�p�[�N���X�̃C���X�^���X�ł�
		
		rccar1.setCar(1234, 20.5);
		//rccar1.setCouse(5);
		
		rccar1.show(); //�T�u�N���X��show()���\�b�h���Ăяo�����
		
		//�C���X�^���X���w���ϐ��̃N���X�Ɋ֌W�Ȃ��A�C���X�^���X���g�̃N���X�ɂ���ēK�؂ȃ��\�b�h���Ăяo�����B

	}

}
