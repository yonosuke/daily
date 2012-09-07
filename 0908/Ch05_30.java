package ch05;

public class Ch05_30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int j = 0;
		int i;
		int x;
		LOOP1:
		while(++j < 10) {
			System.out.println(j + "の段");
			i = 0;
			
			while(++i < 10) {
				x = j*i;
				if(x > 50) { break LOOP1; }
				System.out.println(j + "x" + i + "=" + x);
			}
		}

	}

}
