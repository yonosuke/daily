package l14;

import java.io.*;

public class Sample10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		if(args.length != 1){
			System.out.println("ファイル名を正しく指定してください。");
			System.exit(1);
		}
		try{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException e){
			System.out.println("入力エラーです。");
		}

	}

}
