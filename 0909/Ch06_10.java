package ch06;

class PrintString1 {
	void printStr (String str) { //戻り値の型 なし  引数の型 String型
		System.out.println(str); //String型で出力
	}
	int lengthStr (String str) { //戻り値の型 int型  引数の型 String型
		return str.length(); //int型で長さを出力
	}
	void printStrNumber (String str, int x) { //戻り値の型 なし  引数の型 String型 int型
		int i;
		for(i = 0; i < x; i++) //くりかえし
			System.out.println(str); //回数出力
	}
	void printStrMojiretsu () {  //戻り値の型 なし  引数の型 なし
		System.out.println("文字列"); //そのまま出力
	}
}

public class Ch06_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PrintString1 pStr = new PrintString1(); //コンストラクタでpStrをつくって
		int x; //int型の変数xを宣言して（lengthStrがint型なので）
		
		pStr.printStr("moji"); //PrintStringクラスのprintStrメソッド呼び出して　から何してる？？？
		
		x = pStr.lengthStr("moji"); //xに"moji"の文字列の長さを代入
		System.out.println("文字列の長さは" + x); //"moji"は4文字なのでxは4
		
		pStr.printStrNumber("moji", 5); // "moji"を5回出力
		
		pStr.printStrMojiretsu(); //"文字列"を出力

	}

}
