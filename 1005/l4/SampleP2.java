package l4;

import java.io.*;

public class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�����`�̕ӂ̒�������͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		System.out.println("1�ӂ̒�����" + num + "�̐����`�̖ʐς�" + (num * num) + "�ł��B");

	}

}
