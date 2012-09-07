package ch05;

public class Ch05_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = (int)(Math.random() * 10) % 4;
		switch (x){
		case 1: System.out.println("余りは1");
			break;
		case 2: System.out.println("余りは2");
			break;
		case 3: System.out.println("余りは3");
			break;
		default: System.out.println("余りなし");
			break;
		}

	}

}
