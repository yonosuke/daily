package c06;

class PrintString {
	String str = "String";
	void printStr() {
		System.out.println(str);
	}
}

public class Sample3 {
	public static void main(String[] args) {

		String str = "������"; //
		System.out.println(str); //main���\�b�h�̕ϐ�str

		PrintString pStr = new PrintString(); //PrintString�N���X��������pStr�Ƃ����C���X�^���X�𐶐�
		System.out.println(pStr.str); //PrintString�N���X�̃t�B�[���hstr
		
		pStr.printStr(); //PrintString�N���X�ɒ�`���ꂽprintStr���\�b�h�����s

	}

}
