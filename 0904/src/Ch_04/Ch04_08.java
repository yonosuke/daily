package Ch_04;

public class Ch04_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "今日は 良い天気 だ";
		String[] data = str.split(" ");
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		
		String str2 = "abcdedacdcdef";
		String[] data2 = str2.split("cd");
		System.out.println(data2[0]);
		System.out.println(data2[1]);
		System.out.println(data2[2]);
		System.out.println(data2[3]);
		
		String str3 = "abcdefacdcdef";
		String[] data3 = str3.split("cd",2);
		System.out.println(data3[0]);
		System.out.println(data3[1]);
	}
}
