package l6;
import java.io.*;
public class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�e�X�g�̓_������͂��Ă��������B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int sum = 0;
		
		do{
			String str = br.readLine(); //���͕������str�Ɋi�[
			num = Integer.parseInt(str); //������𐔒l��
			sum += num; //sum = sum + num
		}while(num != 0); //0�����͂���Ȃ�����
		
		System.out.println("�e�X�g�̍��v�_��" + sum + "�ł��B");


	}

}
