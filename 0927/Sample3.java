package l09;

class Car1 {
	private int num;
	private double gas;
	
	public void setCar(int n){
		num = n;
		System.out.println("�i���o�[��" + num + "�ɂ��܂����B");
	}
	
	public void setCar(double g){
		gas = g;
		System.out.println("�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + n + "�K�\�����ʂ�" + g + "�ɂ��܂����B");
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car1 car1 = new Car1();
		
		car1.setCar(1234, 20.5);
		car1.show();
		//�i���o�[��1234�K�\�����ʂ�20.5�ɂ��܂����B
		//�Ԃ̃i���o�[��1234�ł��B
		//�K�\�����ʂ�20.5�ł��B
		
		System.out.println("�Ԃ̃i���o�[�����ύX���܂�");
		//�Ԃ̃i���o�[�����ύX���܂�
		car1.setCar(2345);
		//�Ԃ̃i���o�[��2345�ł��B
		car1.show();
		//�Ԃ̃i���o�[��2345�ł��B
		//�K�\�����ʂ�20.5�ł�
		
		System.out.println("�K�\�����ʂ����ύX���܂�");
		//�K�\�����ʂ����ύX���܂�
		car1.setCar(30.5);
		//�K�\�����ʂ�30.5�ɂ��܂����B
		car1.show();
		//�Ԃ̃i���o�[��2345�ł��B
		//�K�\�����ʂ�30.5�ł��B

	}

}
