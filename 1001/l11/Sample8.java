package l11;

class Car8 {
	protected int num;
	protected double gas;
	
	public Car8() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
}

public class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car8 car1 = new Car8();
		Car8 car2 = new Car8();
		
		Car8 car3;
		car3 = car1;
		
		boolean bl1 = car1.equals(car2); //�Ԃ��쐬���܂����B
		boolean bl2 = car1.equals(car3); //�Ԃ��쐬���܂����B
		
		System.out.println("car1��car2�����������ׂ��Ƃ���" + bl1 + "�ł����B"); //false
		System.out.println("car1��car3�����������ׂ��Ƃ���" + bl2 + "�ł����B"); //true

	}

}
