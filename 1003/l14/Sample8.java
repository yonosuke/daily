package l14;

import java.io.*;

public class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try{
			BufferedReader br = new BufferedReader(new FileReader("test1.text"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("�t�@�C���ɏ������܂�Ă���2�̕������");
			System.out.println(str1 + "�ł��B");
			System.out.println(str2 + "�ł��B");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[�ł��B");
		}

	}

}
