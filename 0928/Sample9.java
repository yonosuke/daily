package l09;

class Car9 {
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car9() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public static void showSum() {
		System.out.println("�Ԃ͑S����" + sum + "�䂠��܂��B");
		//show();
	}
	
	public void show() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

public class Sample9 {
	public static void main(String[] args) {
	}
}