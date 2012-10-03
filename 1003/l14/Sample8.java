package l14;

import java.io.*;

public class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			BufferedReader br = new BufferedReader(new FileReader("test1.text"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("ファイルに書き込まれている2つの文字列は");
			System.out.println(str1 + "です。");
			System.out.println(str2 + "です。");
		}
		catch(IOException e){
			System.out.println("入出力エラーです。");
		}

	}

}
