package l6;
import java.io.*;
public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�����܂ł̍��v�����߂܂����H");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i; //sum = sum + 1 sum�̏����l�͂O
		}
		System.out.println("1����" + num + "�܂ł̍��v��" + sum + "�ł��B");

	}

}
