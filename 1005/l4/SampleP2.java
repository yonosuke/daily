package l4;

import java.io.*;

public class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("正方形の辺の長さを入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		System.out.println("1辺の長さが" + num + "の正方形の面積は" + (num * num) + "です。");

	}

}
