package ch05;

import java.util.*;

public class Ch05_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar c = Calendar.getInstance();
		int m = c.get(Calendar.MONTH) + 1; //本日の月
		System.out.print("今月は" + m + "月…");
		
		if((m >= 3) && (m <= 5))
			System.out.print("春");
		else if((m >= 6) && (m <= 8))
			System.out.print("夏");
		else if((m >= 9) && (m < 11))
			System.out.print("秋");
		else if((m == 12) || (m == 1) || (m == 2))
			System.out.print("冬");
			
	}

}
