package l11;

class Car {
	private int num;
	private double gas;
	
	public Car() { //�R���X�g���N�^�@�T�u�N���X�̃I�u�W�F�N�g���쐬�����Ƃ��ɂ̓X�[�p�[�N���X�̃R���X�g���N�^�̏�������ɍs����B
		num = 0;   //�T�u�N���X�̃R���X�g���N�^���̐擪�ŁA�X�[�p�[�N���X�̈����̖����R���X�g���N�^���Ăяo��
		gas = 0.0; //�i�X�[�p�[�N���X����p�����������o�̏��������s����j
		System.out.println("�Ԃ��쐬���܂����B"); //�C���X�^���X���������ꂽ�Ƃ��Ɏ��s�����
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void show() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

class RacingCar extends Car {
	private int course; //�ǉ�����t�B�[���h
	
	public RacingCar() { //�R���X�g���N�^
		course = 0;
		System.out.println("���[�V���O�J�[���쐬���܂����B"); //�C���X�^���X���������ꂽ�Ƃ��Ɏ��s�����
	}
	
	public void setCourse(int c) { //�ǉ����郁�\�b�h
		course = c;
		System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
	}
}


public class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		RacingCar rccar1 = new RacingCar(); //�T�u�N���X�̃C���X�^���X���쐬
		
		rccar1.setCar(1234, 20.5); //�p���������\�b�h���Ă�ł���
		rccar1.setCourse(5); //�ǉ��������\�b�h���Ă�ł���

	}

}
