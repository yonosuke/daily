package ch05;

public class Ch05_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i, j;
		int[][] data = new int[][] {
				                   {4, 12, 7, 6, 5}, // →i ↓j
				                   {9, 27, 3, 1, 0},
				                   {12, 1, 2, 3, 6}
		                           };
		for(j = 0; j < 3; j++){
			for(i = 0; i < data[j].length; i++) //横を1つづつ
				System.out.print(data[j][i] + " "); //スペースを入れて出力
		System.out.println();
		}

	}

}
