				
class Car {
	int num;
	double gas;
	
	void setNum(int n){
		num = n;
		System.out.println("�i���o�[��" + this.num + "�ɂ��܂����B");
	}
	
	void setGas(double g){
		gas = g;
		System.out.println("�K�\�����ʂ�" + this.gas + "�ɂ��܂����B");
	}
	
	void show(){
		System.out.println("�Ԃ̃i���o�[��" + this.num + "�ł�");
		System.out.println("�K�\�����ʂ�" + this.gas + "�ł��B");
	}

}
