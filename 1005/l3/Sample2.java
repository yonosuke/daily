package l3;
import java.io.*;
public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("円周率はいくつですか？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double pi = Double.parseDouble(str); 
		System.out.println("円周率の値は" + pi + "です。");

	}

}
