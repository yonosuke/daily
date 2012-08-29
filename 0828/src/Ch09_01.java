package Ch09;
import java.io.*;
public class Ch09_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			
			int a = System.in.read();
			System.out.println("入力文字：" + (char)a);
		} catch (IOException e) {
			System.out.println("入力エラー");
		}

	}

}
