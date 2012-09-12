package ch08;

public class Ch08_32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			calc (10, 0);		
		} catch (Exception e) {
			System.out.println("数値0で割ろうとしました");
		}
	}
		static void calc (int i, int j) throws Exception {
			System.out.println(i/j);
		}
	}


