package l08;
class Car2 {
	int num;
	double gas;
	
	void setNum(int n) {//���\�b�h�Œ�`����Ă�������͉�����
		num = n;
		System.out.println("�Ԃ̃i���o�[��" + num + "�ɂ��܂����B");
	}
	
	void getGas(double g) {//���\�b�h�Œ�`����Ă�������͉������i�������Ǝ������̖��O�͈Ⴄ���̂ł��悢�j
		gas = g;
		System.out.println("�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
}


public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car2 car1 = new Car2();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNum(number);
		car1.getGas(gasoline);
		
		//car1.setNum(1234);//������1234��setNum���\�b�h�ɓn���ČĂяo��
		//car1.getGas(20.5);//������20.5��getGas���\�b�h�ɓn���ČĂяo��

	}

}
