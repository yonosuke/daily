package ch08;

public class Ch08_32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try {
			calc (10, 0);		
		} catch (Exception e) {
			System.out.println("���l0�Ŋ��낤�Ƃ��܂���");
		}
	}
		static void calc (int i, int j) throws Exception {
			System.out.println(i/j);
		}
	}


