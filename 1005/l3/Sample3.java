package l3;

import java.io.*;

public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�g���Ƒ̏d����͂��Ă��������B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		double height = Double.parseDouble(str1);
		double weight = Double.parseDouble(str2);
		
		System.out.println("�g����" + height + "�Z���`�ł��B");
		System.out.println("�̏d��" + weight + "�L���ł��B");

	}

}
