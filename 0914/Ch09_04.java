package Ch09;

import java.io.IOException;

public class Ch09_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			int a;
			while((a = System.in.read()) != -1);
			System.out.println("入力文字：" +(char)a);
		} catch (IOException e) {
			System.out.println("入力エラー");
		}

	}

}
