
class Car {
	int num;
	double gas;
	
	void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
	
	void showCar(){
		System.out.println("���ꂩ��Ԃ̏���\�����܂��B");
		this.show();
	}
}
