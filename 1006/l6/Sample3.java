package l6;
import java.io.*;
public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("������*���o�͂��܂����H");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		for(int i = 1; i <= num; i++){
			System.out.print("*");
		}

	}

}
