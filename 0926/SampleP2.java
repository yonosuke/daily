package l08;
class CarP2 {
	int num;
	double gas;
	
	void setNumGas (int n, double g) {
		num = n;
		gas = g;
		System.out.println("�Ԃ̃i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	void show() {
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}
public class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		CarP2 car1 = new CarP2();
		car1.setNumGas(1234, 20.5);
		car1.show();

	}

}
