package l14;

import java.io.*;

public class Sample7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.text")));
			
			pw.println("Hello!");
			pw.println("GoodBye");
			System.out.println("�t�@�C���ɏ������݂܂����B");
			
			pw.close();
		}
		catch(IOException e){
			System.out.println("���o�̓G���[�ł��B");
			
		}

	}

}
