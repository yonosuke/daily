
class Car {
	int num;
	double gas;
	
	int getNum(){
		System.out.println("�i���o�[�𒲂ׂ܂���");
		return num;
	}
	
	double getGas(){
		System.out.println("�K�\�����ʂ𒲂ׂ܂����B");
		return gas;
	}
	
	void setNumGas(int n, double g){
		num = n;
		gas = g;
		System.out.println("�Ԃ̃i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}
