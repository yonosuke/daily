
public class Car {
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
		System.out.println("�i���o�[��" + num + "�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}
