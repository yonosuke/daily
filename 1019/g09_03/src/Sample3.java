
public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car();
		
		car1.setCar(1234, 20.5);
		car1.show();
		
		System.out.println("�Ԃ̃i���o�[�����ύX���܂��B");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("�K�\�����ʂ����ύX���܂��B");
		car1.setCar(30.5);
		car1.show();
	}

}
