package l6;
import java.io.*;
public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("何番目でループを中止しますか？（1～10）");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i = 1; i <= 10; i++){
			System.out.println(i + "番目の処理です。");
			if(i == res){
				break;
			}
		}

	}

}
