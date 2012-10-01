package l12;

abstract class Vehicle { //���ۃN���X
	protected int speed;
	public void setSpeed(int s){
		speed = s;
		System.out.println("���x��" + speed + "�ɂ��܂����B");
	}
	abstract void show(); //���ۃ��\�b�h
}

class Car extends Vehicle{ //���ۃN���X���g��
	private int num;
	private double gas;
	
	public Car(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
	}
	
	public void show(){ //show()���\�b�h�̏������`����
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
		System.out.println("���x��" + speed + "�ł��B");
	}
}

class Plane extends Vehicle{ //���ۃN���X���g��
	private int flight;
	
	public Plane(int f){
		flight = f;
		System.out.println("��" + flight + "�̔�s�@���쐬���܂����B");
	}
	
	public void show(){ //show()���\�b�h�̏������`����
		System.out.println("��s�@�̕ւ�" + flight + "�ł��B");
		System.out.println("���x��" + speed + "�ł��B");
	}
}

public class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Vehicle[] vc; //���ۃN���X�̔z�������
		vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5); //1�߂̃C���X�^���X��Car�N���X
		vc[0].setSpeed(60);
		
		vc[1] = new Plane(232); //2�߂̃C���X�^���X��Plane�N���X
		vc[1].setSpeed(500);
		
		for(int i = 0; i < vc.length; i++){
			vc[i].show(); //�C���X�^���X�̃N���X�ɑΉ�����show()���\�b�h���Ăяo�����
		}

	}

}
