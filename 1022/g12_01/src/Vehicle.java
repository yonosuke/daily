abstract class Vehicle {
	protected int speed;
	
	public void setSpeed(int s){
		speed = s;
		System.out.println("���x��" + speed + "�ɂ��܂����B");
	}
	abstract void show();
}
