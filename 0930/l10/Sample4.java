package l10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("���������͂��Ă��������B");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("�ǉ����镶�������͂��Ă��������B");
		
		String str2 = br.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println(str1 + "��" + str2 + "��ǉ������" + sb + "�ł��B");

	}

}
