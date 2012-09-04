package Ch_04;

public class Ch04_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[]{1, 2, 3};
		int[] data2 = data;
		System.out.println(data2[2]);
		
		data[1] = 4;
		System.out.println(data[1]);

	}

}
