package l11;

class Car2 {
	private int num;
	private double gas;
	
	public Car2() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public Car2(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
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

class RacingCar2 extends Car2 {
	private int course;
	
	public RacingCar2() {
		course = 0;
		System.out.println("���[�V���O�J�[���쐬���܂����B");
	}
	
	public RacingCar2(int n, double g, int c) {
		super(n, g); //�X�[�p�[�N���X�̈���2�̃R���X�g���N�^���Ăяo�����l�ɂ���i�ȗ�����ƈ����Ȃ��̃R���X�g���N�^���Ăяo�����j
		course = c;  //��super()��this()�ŌĂяo���R���X�g���N�^���w�肷��ꍇ�́A�R���X�g���N�^���̐擪�ɏ����K�v������
		System.out.println("�R�[�X�ԍ�" + course + "�̃��[�V���O�J�[���쐬���܂����B");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
	}
}

public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		RacingCar2 rccar1 = new RacingCar2(1234, 20.5, 5);
	}

}
