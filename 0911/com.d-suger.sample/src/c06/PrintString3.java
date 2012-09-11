package c06;

public class PrintString3 {
	
	void printStr (String str) { //①
		System.out.println(str);
	}
	
	int lengthStr (String str) { //②
		return str.length();
	}
	
	void printStrNumber (String str, int x) { //③
		int i;
		for(i = 0; i < x; i++);
		System.out.println(str);
	}
	
	void printStrMojiretsu () {
		System.out.println("文字列");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PrintString3 pStr = new PrintString3(); //コンストラクタでpStrをつくって
		
		pStr.printStr("moji"); //①printStrメソッド実行
		
		int x; //int型の変数xを宣言
		x = pStr.lengthStr("moji"); //②変数xにlengthStrメソッド（引数"moji"）の実行結果を代入
		System.out.println("文字列の長さは" + x); //上記の実行結果を表示
		
		pStr.printStrNumber("moji", 5); //③printStrNumberメソッドに引数を渡して実行
		
		pStr.printStrMojiretsu(); //printStrMojiretsuメソッドを実行

	}

}
