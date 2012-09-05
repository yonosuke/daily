package Ch04;

public class Ch04_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] data = new int[3][];
		data[0] = new int[]{1, 2, 3};
		data[1] = new int[]{4, 5,};
		data[2] = new int[]{6, 7, 8, 9, 10};
		
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		
		System.out.println(data[2][0]);
		System.out.println(data[2][1]);
		System.out.println(data[2][3]);
		System.out.println(data[2][4]);


	}

}
