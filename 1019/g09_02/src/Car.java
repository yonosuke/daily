
public class Car {
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g){
		if( g > 0 && g < 100){
			num = n;
			gas = g;
			System.out.println("�i���o�[��" + num + "�K�\�����ʂ�" + gas + "�ɂ��܂����B");
		}else{
			System.out.println(g + "�͐������K�\�����ʂł͂���܂���B");
			System.out.println("�K�\�����ʂ�ύX�ł��܂���ł����B");
		}
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}
