package l3;

import java.io.*;

public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("身長と体重を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double height = Double.parseDouble(str1);
		double weight = Double.parseDouble(str2);
		
		System.out.println("身長は" + height + "センチです。");
		System.out.println("体重は" + weight + "キロです。");

	}

}
