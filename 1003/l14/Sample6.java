package l14;

import java.io.*;

public class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字列を入力してください。");
		
		try{
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			//System.inからInputStreamReaderクラスのオブジェクトを作成し、それからBufferedReaderクラスのオブジェクトを作成
			
			String str = br.readLine(); //readLine()メソッドを使って1行データを読み込む
			System.out.println(str + "が入力されました。");
		}
		catch(IOException e){
			System.out.println("入出力エラーです。");
		}

	}

}
