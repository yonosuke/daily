
public class Car {
	protected int num;
	protected double gas;
	
	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public String toString(){
		String str = "�i���o�[:" + num + "�K�\������:" + gas;
		return str;
	}
}
