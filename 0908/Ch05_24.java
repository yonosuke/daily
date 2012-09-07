package ch05;

public class Ch05_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i;
		int[] data = new int[]{4, 12, 7, 3, 5, 23, 0, 9};
		for(i = 0; i < data.length; i++) {
			if(data[i] == 0) break;
			if(data[i] > 10) {
				System.out.println(i+ "番目の要素は10より大きい");
				continue;
			}
			System.out.println(i + "番目の要素は" + data[i]);
		}

	}

}
