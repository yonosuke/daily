package ch06;

class PrintString1 {
	void printStr (String str) { //�߂�l�̌^ �Ȃ�  �����̌^ String�^
		System.out.println(str); //String�^�ŏo��
	}
	int lengthStr (String str) { //�߂�l�̌^ int�^  �����̌^ String�^
		return str.length(); //int�^�Œ������o��
	}
	void printStrNumber (String str, int x) { //�߂�l�̌^ �Ȃ�  �����̌^ String�^ int�^
		int i;
		for(i = 0; i < x; i++) //���肩����
			System.out.println(str); //�񐔏o��
	}
	void printStrMojiretsu () {  //�߂�l�̌^ �Ȃ�  �����̌^ �Ȃ�
		System.out.println("������"); //���̂܂܏o��
	}
}

public class Ch06_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		PrintString1 pStr = new PrintString1(); //�R���X�g���N�^��pStr��������
		int x; //int�^�̕ϐ�x��錾���āilengthStr��int�^�Ȃ̂Łj
		
		pStr.printStr("moji"); //PrintString�N���X��printStr���\�b�h�Ăяo���ā@���牽���Ă�H�H�H
		
		x = pStr.lengthStr("moji"); //x��"moji"�̕�����̒�������
		System.out.println("������̒�����" + x); //"moji"��4�����Ȃ̂�x��4
		
		pStr.printStrNumber("moji", 5); // "moji"��5��o��
		
		pStr.printStrMojiretsu(); //"������"���o��

	}

}
