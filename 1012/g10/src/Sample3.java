import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		System.out.println("���������͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine(); //���������͂�����
		
		System.out.println("������������͂��Ă��������B");
		
		String str2 = br.readLine(); //�������镶������͂�����
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch); //��������������
		
		if(num != -1){ //num��-1�łȂ���
			System.out.println(str1 + "��" + (num + 1) + "�ԖڂɁu" + ch + "�v��������܂����B");
		}else{
			System.out.println(str1 + "�Ɂu" + ch + "�v�͂���܂���B");
		}
		
		

	}

}
