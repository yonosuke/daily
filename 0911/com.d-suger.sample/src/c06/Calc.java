package c06;

public class Calc { 
	int[] calcArr(int[] data) { //int�^�z��calcArr���\�b�h ������int�^�z��data
		int[] r = new int[data.length]; //int�^�z��̕ϐ�r�Ɂc�Ȃ��new���Ă�́H�H
		int i; //int�^�̕ϐ�i��錾
		for(i = 0; i < data.length; i++) //
			r[i] = data[i] * data[i]; //����i�̔z��l��S��2�悵�A�ϐ�r�Ɋi�[
		return r;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Calc calc = new Calc();
		int[] data = {2, 5, 7, 9, 10};
		
		int[] r = calc.calcArr(data);
		int i;
		for(i = 0; i <r.length; i++)
			System.out.println(r[i]);

	}

}
