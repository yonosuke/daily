package l5;
import java.io.*;
public class SampleP1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("��������͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		if((res % 2) == 0){
			System.out.println(res + "�͋����ł��B");
		}else{
			System.out.println(res + "�͊�ł��B");
		}

	}

}
