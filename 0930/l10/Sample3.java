package l10;

import java.io.*;

public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字列を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //インスタンスを作る
		
		String str1 = br.readLine(); //最初に入力した文字
		
		System.out.println("検索文字を入力してください。");
		
		String str2 = br.readLine(); //検索文字
		
		char ch = str2.charAt(0); //検索文字の1番目をchに代入

		int num = str1.indexOf(ch); //最初に入力した文字列にchがあるかの検索をかけてnumにいれる
		
		if(num != -1){
			System.out.println(str1 + "の" + (num + 1) + "番目に「" + ch + "」が見つかりました。");
		}else{
			System.out.println(str1 + "に「" + ch + "』はありません。");
		}
	}
}
