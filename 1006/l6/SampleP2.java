package l6;
import java.io.*;
public class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("テストの点数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int sum = 0;
		
		do{
			String str = br.readLine(); //入力文字列をstrに格納
			num = Integer.parseInt(str); //文字列を数値に
			sum += num; //sum = sum + num
		}while(num != 0); //0が入力されない限り
		
		System.out.println("テストの合計点は" + sum + "です。");


	}

}
