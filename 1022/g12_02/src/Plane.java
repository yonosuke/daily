
class Plane extends Vehicle {

	private int flight;
	
	public Plane(int f){
		flight = f;
		System.out.println("��" + flight + "�̔�s�@���쐬���܂����B");
	}
	
	void show() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("��s�@�̕ւ�" + flight + "�ł��B");
		System.out.println("���x��" + speed + "�ł��B");
	}
}
