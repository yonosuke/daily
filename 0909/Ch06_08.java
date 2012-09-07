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
		// TODO 自動生成されたメソッド・スタブ
		PrintString pStr = new PrintString();
		String str = "モジレツ";
		System.out.println(str);
		System.out.println(pStr.str);
		pStr.printStr();

	}

}
