package l5;

import java.io.*;

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("成績をしてください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		switch(num){
		case 1:
			System.out.println("もっと頑張りましょう。");
			break;
		case 2:
			System.out.println("もう少し頑張りましょう。");
			break;
		case 3:
			System.out.println("さらに上を目指しましょう。");
			break;
		case 4:
			System.out.println("大変良くできました。");
			break;
		case 5:
			System.out.println("大変優秀です。");
			break;
		default:
			System.out.println("1から5で入力してください。");
			break;
		}
	}
}