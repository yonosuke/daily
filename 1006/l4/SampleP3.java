package l4;

import java.io.*;

public class SampleP3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("三角形の高さと底辺を入力してください。");
		System.out.println("高さを入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String height = br.readLine();
		double h = Integer.parseInt(height);
		
		System.out.println("底辺の長さを入力してください");
		String width = br.readLine();
		double w = Integer.parseInt(width);
		
		System.out.println("三角形の面積は" + ((h * w) / 2) + "です。");

	}

}
