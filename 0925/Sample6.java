package l08;
class Car6 {
	int num;
	double gas;
	
	int getNum() {
		System.out.println("�i���o�[�𒲂ׂ܂����B");
		return num;
	}
	
	double getGas() {
		System.out.println("�K�\�����ʂ�����ׂ܂����B");
		return gas;
	}
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�Ԃ̃i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	void show() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}
public class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car6 car1 = new Car6();
		
		car1.setNumGas(1234, 20.5);//setNumGas���\�b�h��int����1234��double�^����20.5��n���Ď��s
		
		int number = car1.getNum();//getNum���\�b�h�����s
		double gasoline = car1.getGas();//getGas���\�b�h�����s
		
		System.out.println("�T���v������Ԃ𒲂ׂ��Ƃ���");
		System.out.println("�i���o�[��" + number + "�K�\�����ʂ�" + gasoline + "�ł����B");//���\�b�h�̖߂�l�������Ď��s

	}

}
