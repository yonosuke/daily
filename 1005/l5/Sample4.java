package l5;

import java.io.*;

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("���т����Ă��������B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		switch(num){
		case 1:
			System.out.println("�����Ɗ撣��܂��傤�B");
			break;
		case 2:
			System.out.println("���������撣��܂��傤�B");
			break;
		case 3:
			System.out.println("����ɏ��ڎw���܂��傤�B");
			break;
		case 4:
			System.out.println("��ϗǂ��ł��܂����B");
			break;
		case 5:
			System.out.println("��ϗD�G�ł��B");
			break;
		default:
			System.out.println("1����5�œ��͂��Ă��������B");
			break;
		}
	}
}