package l3;

import java.io.*;

public class Sample1 {
	public static void main(String[] args) throws IOException {
		System.out.println("あなたは何歳ですか？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		//double num2 = Double.parseDouble(str);
		System.out.println("あなたは" + num + "歳です。");
		//System.out.println("あなたは" + num2 + "歳です。");
	}

}
