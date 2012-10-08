package l6;
import java.io.*;
public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("いくつまでの合計を求めますか？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i; //sum = sum + 1 sumの初期値は０
		}
		System.out.println("1から" + num + "までの合計は" + sum + "です。");

	}

}
