package l09;

class Car0 {
	private int num;
	private double gas;
	
	//�K��������2�̏ꍇ
	
	private Car0() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public Car0(int n, double g) {
		this();
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void show() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		//Car0 car1 = new Car0();//private�ȃR���X�g���N�^���Ăяo�����I�u�W�F�N�g�͍쐬�o���Ȃ�
		//car1.show();
		
		Car0 car2 = new Car0(1234, 20.5);
		car2.show();

	}

}
