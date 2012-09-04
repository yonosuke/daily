package Ch_04;

public class Ch04_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		char data[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		String str1 = new String(data);
		System.out.println(str1);
		
		String str2 = String.valueOf(data);
		System.out.println(str2);
		
		String str3 = String.valueOf(data, 2, 4);
		System.out.println(str3);

	}

}
