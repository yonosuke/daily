
public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car();
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		System.out.println("�������Ȃ��K�\�����ʂ�ݒ肵�Ă݂܂��B");
		
		car1.setNumGas(1234, -10.0);
		car1.show();

	}

}
