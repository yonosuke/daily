
public class Car {
	private int num;
	private double gas;
	
	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public Car(int n, double g){
		this(); //��̈����Ȃ��̃R���X�g���N�^���Ă�
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}
