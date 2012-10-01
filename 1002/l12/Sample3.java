package l12;

interface iVehicle {
	void show();
}

class Car3 implements iVehicle{
	private int num;
	private double gas;
	
	public Car3(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

class Plane3 implements iVehicle{
	private int flight;
	
	public Plane3(int f){
		flight = f;
		System.out.println("��" + flight + "�̔�s�@�쐬���܂����B");
	}
	
	public void show(){
		System.out.println("��" + flight + "�ł��B");
	}
}
public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		iVehicle[] ivc;
		ivc = new iVehicle[2];
		
		ivc[0] = new Car3(1234, 20.5);
		ivc[1] = new Plane3(232);
		
		for(int i = 0; i < ivc.length; i++){
			ivc[i].show();
		}

	}

}
