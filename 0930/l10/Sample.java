package l10;

import java.io.*;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("��������͂��Ă�������");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str); //perseInt()���\�b�h��Integer�N���X�̃N���X���\�b�h
		System.out.println(num + "�����͂���܂����B");
	}

}
