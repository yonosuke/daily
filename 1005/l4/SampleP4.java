package l4;

import java.io.*;

public class SampleP4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�Ȗ�1�`�T�̓_������͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		
		int sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		sum += Integer.parseInt(str4);
		sum += Integer.parseInt(str5);

		
		System.out.println("5�Ȗڂ̍��v�_��" + sum + "�ł��B");
		System.out.println("5�Ȗڂ̍��v�_��" + (sum/ (double)5) + "�ł��B");


	}

}
