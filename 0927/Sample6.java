package l09;

class Car6 {
	private int num;
	private double gas;
	
	public Car6() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public Car6(int n, double g) {
		this();
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void show() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
	
}

public class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car6 car1 = new Car6();
		//�Ԃ��쐬���܂����B
		car1.show();
		//�Ԃ̃i���o�[��0�ł��B
		//�K�\�����ʂ�0.0�ł��B
		
		Car6 car2 = new Car6(1234, 20.5);
		//�Ԃ��쐬���܂����B
		car2.show();
		//�i���o�[��1234�K�\�����ʂ�20.5�ɂ��܂����B
		//�Ԃ̃i���o�[��1234�ł��B
		//�K�\�����ʂ�20.5�ł��B
	}
}
