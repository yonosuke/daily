package c06;

public class Calc { 
	int[] calcArr(int[] data) { //int�^�z��calcArr���\�b�h ������int�^�z��data
		int[] r = new int[data.length]; //����data�̒�����int�^�z��̕ϐ�r�Ɋi�[
		
		int i; //int�^�̕ϐ�i��錾
		for(i = 0; i < data.length; i++) //for��
			r[i] = data[i] * data[i]; //����i�̔z��l��S��2�悵�A�ϐ�r�Ɋi�[
		return r;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Calc calc = new Calc(); //Calc�N���X���g����calc�C���X�^���X�𐶐�
		int[] data = {2, 5, 7, 9, 10}; //int�^�z��data��������
		
		int[] r = calc.calcArr(data); //int�^�z��r��calcArr(data)�̎��s���ʂ���
		
		int i; //int�^�̕ϐ�i��錾
		
		for(i = 0; i < r.length; i++)
			System.out.println(r[i]); //calcArr�̎��s���ʂ�i�̕������o��

	}

}
