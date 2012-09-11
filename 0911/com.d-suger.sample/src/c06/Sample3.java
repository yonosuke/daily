package c06;

class PrintString {
	String str = "String";
	void printStr() {
		System.out.println(str);
	}
}

public class Sample3 {
	public static void main(String[] args) {

		String str = "文字列"; //
		System.out.println(str); //mainメソッドの変数str

		PrintString pStr = new PrintString(); //PrintStringクラスをつかってpStrというインスタンスを生成
		System.out.println(pStr.str); //PrintStringクラスのフィールドstr
		
		pStr.printStr(); //PrintStringクラスに定義されたprintStrメソッドを実行

	}

}
