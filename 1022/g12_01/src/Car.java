class Car extends Vehicle {

	private int num;
	private double gas;
	
	public Car(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
	}
	
	void show() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
		System.out.println("���x��" + speed + "�ł��B");
	}
}
