package l14;

import java.io.*;

public class Sample7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.text")));
			
			pw.println("Hello!");
			pw.println("GoodBye");
			System.out.println("ファイルに書き込みました。");
			
			pw.close();
		}
		catch(IOException e){
			System.out.println("入出力エラーです。");
			
		}

	}

}
