package ch08;

public class Ch08_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		try {
			int x = Integer.valueOf("string").intValue();
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println("���l�ɕϊ��ł��܂���");
		} 


	}

}
