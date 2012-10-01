package l12;

abstract class Vehicle2 { //���ۃN���X
	protected int speed;
	public void setSpeed(int s){
		speed = s;
		System.out.println("���x��" + speed + "�ɂ��܂����B");
	}
	abstract void show(); //���ۃ��\�b�h
}

class Car2 extends Vehicle2{ //���ۃN���X���g��
	private int num;
	private double gas;
	
	public Car2(int n, double g){
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

class Plane2 extends Vehicle2{ //���ۃN���X���g��
	private int flight;
	
	public Plane2(int f){
		flight = f;
		System.out.println("��" + flight + "�̔�s�@���쐬���܂����B");
	}
	
	public void show(){ //show()���\�b�h�̏������`����
		System.out.println("��s�@�̕ւ�" + flight + "�ł��B");
		System.out.println("���x��" + speed + "�ł��B");
	}
}

public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Vehicle2[] vc; //���ۃN���X�̔z�������
		vc = new Vehicle2[2];
		
		vc[0] = new Car2(1234, 20.5); //1�߂̃C���X�^���X��Car�N���X
		
		vc[1] = new Plane2(232); //2�߂̃C���X�^���X��Plane�N���X
		
		for(int i = 0; i < vc.length; i++){
			if(vc[i] instanceof Car2){ //�I�u�W�F�N�g��Car�N���X���ǂ������ׂ�
				System.out.println((i + 1) + "�Ԗڂ̃I�u�W�F�N�g��Car2�N���X�ł��B");
				}else{
				System.out.println((i + 1) + "�Ԗڂ̃I�u�W�F�N�g��Car2�N���X�ł͂���܂���B");

			}
		}

	}

}