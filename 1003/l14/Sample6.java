package l14;

import java.io.*;

public class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("���������͂��Ă��������B");
		
		try{
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			//System.in����InputStreamReader�N���X�̃I�u�W�F�N�g���쐬���A���ꂩ��BufferedReader�N���X�̃I�u�W�F�N�g���쐬
			
			String str = br.readLine(); //readLine()���\�b�h���g����1�s�f�[�^��ǂݍ���
			System.out.println(str + "�����͂���܂����B");
		}
		catch(IOException e){
			System.out.println("���o�̓G���[�ł��B");
		}

	}

}
