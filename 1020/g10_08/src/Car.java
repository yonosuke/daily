
class Car {
	private int num;
	private double gas;
	private String name;
	
	public Car(){
		num = 0;
		gas = 0.0;
		name = "������";
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void setName(String nm){
		name = nm;
		System.out.println("���O��" + name + "�ɂ��܂����B");
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
		System.out.println("���O��" + name + "�ł��B");
	}
}
