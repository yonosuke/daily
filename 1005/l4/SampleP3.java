package l4;

import java.io.*;

public class SampleP3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�O�p�`�̍����ƒ�ӂ���͂��Ă��������B");
		System.out.println("��������͂��Ă�������");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String height = br.readLine();
		double h = Integer.parseInt(height);
		
		System.out.println("��ӂ̒�������͂��Ă�������");
		String width = br.readLine();
		double w = Integer.parseInt(width);
		
		System.out.println("�O�p�`�̖ʐς�" + ((h * w) / 2) + "�ł��B");

	}

}
