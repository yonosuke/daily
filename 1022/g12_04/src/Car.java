
class Car implements iVehicle, iMaterial {
	
	private int num;
	private double gas;
	
	public Car(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
	}

	public void vShow() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
	
	public void mShow() {
		System.out.println("�Ԃ̍ގ��͓S�ł�");
	}

}
