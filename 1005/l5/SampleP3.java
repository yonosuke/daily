package l5;
import java.io.*;
public class SampleP3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("0����10�܂ł̐�������͂��Ă��������B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer num = Integer.parseInt(str);
		if(num <= 10 && num >= 0){
			System.out.println("�u�����ł��B�v");
		}else{
			System.out.println("�u�ԈႢ�ł��B�v");
		}

	}

}
