package ch05;

public class Ch05_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int i;
		int[] data = new int[]{4, 12, 7, 3, 5, 23, 0, 9};
		for(i = 0; i < data.length; i++) {
			if(data[i] == 0) break;
			if(data[i] > 10) {
				System.out.println(i+ "�Ԗڂ̗v�f��10���傫��");
				continue;
			}
			System.out.println(i + "�Ԗڂ̗v�f��" + data[i]);
		}

	}

}
