package l3;
import java.io.*;
public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�~�����͂����ł����H");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double pi = Double.parseDouble(str); 
		System.out.println("�~�����̒l��" + pi + "�ł��B");

	}

}
