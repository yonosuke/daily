package ch08;



public class Ch08_31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		strToNum("123");
	}
	
	static void strToNum (String str) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			int x = Integer.valueOf("string").intValue();
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println("数値に変換出来ません");
		}

	}

}
