package l5;

import java.io.*;

public class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("���Ԗڂ̃R�[�X�ɂ��܂����H");
		System.out.println("��������͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res == 1) ? 'A' : 'B'; //(res == 1)��ture�̂Ƃ�A false�̂Ƃ�B
		
		System.out.println(ans + "�R�[�X��I�����܂����B");

	}

}
