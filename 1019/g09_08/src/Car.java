
public class Car {
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car(){
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public static void showSum(){
		System.out.println("�Ԃ͑S����" + sum + "�䂠��܂��B");
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}
