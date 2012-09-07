package ch05;

public class Ch05_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		char c;
		if(args.length > 0){
			c = args[0].charAt(0);
		
			switch (c){
			case 'a':System.out.println("頭文字は'a'");
				break;
			case 'b':System.out.println("頭文字は'b'");
				break;
			case 'c':System.out.println("頭文字は'c'");
				break;
			default:System.out.println("頭文字はそれ以外");
			}
		
		}

	}

}
