import java.io.*;


class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字列を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		StringBuffer str2 = new StringBuffer(str1);
		str2.reverse();
		
		System.out.println(str1 + "を逆にすると" + str2 + "です。");
	}
	

}
