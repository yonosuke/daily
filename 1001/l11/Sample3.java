package l11;

class Car3 {
	protected int num; //protected�ŃT�u�N���X������A�N�Z�X�ł���
	protected double gas; //protected�ŃT�u�N���X������A�N�Z�X�ł���
	
	public Car3() {
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

class RacingCar3 extends Car3 {
	private int course;
	
	public RacingCar3() {
		course = 0;
		System.out.println("���[�V���O�J�[���쐬���܂����B");
	}
	
	public void seCourse(int c) {
		course = c;
		System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
	}
	
	public void newShow() {
		System.out.println("���[�V���O�J�[�̃i���o�[��" + num + "�ł��B"); //�X�[�p�[�N���X�̃����o�ɃA�N�Z�X�ł���B
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B"); //�X�[�p�[�N���X�̃����o�ɃA�N�Z�X�ł���B
		System.out.println("�R�[�X�i���o�[��" + course + "�ł��B");
	}
}

public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		RacingCar3 rccar1 = new RacingCar3();
		
		rccar1.newShow();

	}

}
