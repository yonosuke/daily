package l08;
class Car3 {
	int num;
	double gas;
	
	void setNumGas(int n, double g) {//Sample4��setNum��getGas���\�b�h���܂Ƃ߂�i2�̈�����n���j
		num = n;
		gas = g;
		System.out.println("�Ԃ̃i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	void show() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}
public class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car3 car1 = new Car3();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number, gasoline);
		car1.show();

	}

}
