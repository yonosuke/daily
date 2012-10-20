import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("文字列を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine(); //文字列を入力させる
		
		System.out.println("検索文字を入力してください。");
		
		String str2 = br.readLine(); //検索する文字を入力させる
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch); //文字を検索する
		
		if(num != -1){ //numが-1でない時
			System.out.println(str1 + "の" + (num + 1) + "番目に「" + ch + "」が見つかりました。");
		}else{
			System.out.println(str1 + "に「" + ch + "」はありません。");
		}
		
		

	}

}
