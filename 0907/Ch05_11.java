package ch05;

import java.util.*;

public class Ch05_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Calendar c = Calendar.getInstance();
		int m = c.get(Calendar.MONTH) + 1; //�{���̌�
		System.out.print("������" + m + "���c");
		
		if((m >= 3) && (m <= 5))
			System.out.print("�t");
		else if((m >= 6) && (m <= 8))
			System.out.print("��");
		else if((m >= 9) && (m < 11))
			System.out.print("�H");
		else if((m == 12) || (m == 1) || (m == 2))
			System.out.print("�~");
			
	}

}
