package l09;

class Car8 {
	public static int sum = 0; //�N���X�ϐ� �N���X�S�̂ŉ���̎Ԃ����邩��\���t�B�[���h
	private int num;
	private double gas;
	
	public Car8() { //�C���X�^���X���쐬������
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public static void showSum() { //�N���X���\�b�h �C���X�^���X���쐬����Ȃ��Ă��Ăяo����
		System.out.println("�Ԃ͑S����" + sum + "�䂠��܂��B");
	}
	
	public void show() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

public class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car8.showSum(); //�N���X���\�b�h �C���X�^���X���쐬�����ɌĂяo����
		
		Car8 car1 = new Car8();
		car1.setCar(1234, 20.5);
		
		Car8.showSum();

	}

}
