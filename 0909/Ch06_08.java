package ch06;

class PrintString {
	String str = "String";
	void printStr () {
		System.out.println(str);
	}
}


public class Ch06_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		PrintString pStr = new PrintString();
		String str = "���W���c";
		System.out.println(str);
		System.out.println(pStr.str);
		pStr.printStr();

	}

}
