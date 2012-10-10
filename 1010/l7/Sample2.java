package l7;
import java.io.*;
public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("テストの受験者数を入力してください");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //標準入力を準備して変数brに格納
		String str = br.readLine(); //変数brのテキスト行を読み込みをstrに格納
		int num = Integer.parseInt(str); //標準入力は文字列なのでstrをint型にする
		
		int[] test = new int[num]; //int型配列に変数numを渡して、testという名のインスタンスを生成
		System.out.println("人数分の点数を入力してください。");
		
		for(int i = 0; i < num; i++){
			str = br.readLine(); //点数をstrに格納
			int tmp = Integer.parseInt(str); //点数をint型変数tmpに格納
			test[i] = tmp; //int型配列testのi番目にtmpを入れる
		}
		
		for(int i = 0; i < num; i++){
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
		}

	}

}
