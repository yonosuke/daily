package l5;
import java.io.*;
public class SampleP3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("0から10までの整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer num = Integer.parseInt(str);
		if(num <= 10 && num >= 0){
			System.out.println("「正解です。」");
		}else{
			System.out.println("「間違いです。」");
		}

	}

}
