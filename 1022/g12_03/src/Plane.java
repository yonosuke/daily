
class Plane implements iVehicle {
	
	private int flight;
	
	public Plane(int f){
		flight = f;
		System.out.println("��" + flight + "�̔�s�@���쐬���܂����B");
	}
	
	public void show() {
		System.out.println("��s�@�̕ւ�" + flight + "�ł��B");
	}
}
