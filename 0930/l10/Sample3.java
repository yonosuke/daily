package l10;

import java.io.*;

public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("���������͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�C���X�^���X�����
		
		String str1 = br.readLine(); //�ŏ��ɓ��͂�������
		
		System.out.println("������������͂��Ă��������B");
		
		String str2 = br.readLine(); //��������
		
		char ch = str2.charAt(0); //����������1�Ԗڂ�ch�ɑ��

		int num = str1.indexOf(ch); //�ŏ��ɓ��͂����������ch�����邩�̌�����������num�ɂ����
		
		if(num != -1){
			System.out.println(str1 + "��" + (num + 1) + "�ԖڂɁu" + ch + "�v��������܂����B");
		}else{
			System.out.println(str1 + "�Ɂu" + ch + "�x�͂���܂���B");
		}
	}
}
