package ch08;

public class Ch08_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			int x = Integer.valueOf("string").intValue();
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println("数値に変換できません");
		} 


	}

}
