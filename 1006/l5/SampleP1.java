package l5;
import java.io.*;
public class SampleP1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		if((res % 2) == 0){
			System.out.println(res + "は偶数です。");
		}else{
			System.out.println(res + "は奇数です。");
		}

	}

}
