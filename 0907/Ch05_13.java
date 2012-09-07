package ch05;

public class Ch05_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = (int)(Math.random() * 10) % 4;
		if(x == 1)      System.out.println("余りは1");
		else if(x == 2) System.out.println("余りは2");
		else if(x == 3) System.out.println("余りは3");
		else            System.out.println("余りなし");

	}

}
