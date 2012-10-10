package l7;

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] test = {80, 60, 22, 50, 75}; //配列の初期化（newがない 添字の代わりに実際の要素）
		
		for(int i = 0; i < 5; i++){
			System.out.println((i + 1) + "番目の点数は" + test[i] + "です。");
		}

	}

}
