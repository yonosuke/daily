package l09;

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
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car2 car1 = new Car2();
		//�Ԃ��쐬���܂����B
		car1.show();
		//�Ԃ̃i���o�[��0�ł��B
		//�K�\�����ʂ�0.0�ł��B
		
		Car2 car2 = new Car2(1234, 20.5);
		//�i���o�[1234�K�\������20.5�̎Ԃ��쐬���܂���
		car2.show();
		//�Ԃ̃i���o�[��1234�ł��B
		//�K�\�����ʂ�20.5�ł��B

	}

}
