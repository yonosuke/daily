package ch05;

public class Ch05_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int i, j;
		int[][] data = new int[][] {
				                   {4, 12, 7, 6, 5}, // ��i ��j
				                   {9, 27, 3, 1, 0},
				                   {12, 1, 2, 3, 6}
		                           };
		for(j = 0; j < 3; j++){
			for(i = 0; i < data[j].length; i++) //����1�Â�
				System.out.print(data[j][i] + " "); //�X�y�[�X�����ďo��
		System.out.println();
		}

	}

}
