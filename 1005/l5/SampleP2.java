package l5;
import java.io.*;
public class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("2�̐�������͂��Ă��������B");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		if(num1 > num2){
			System.out.println(num2 + "���" + num1 + "�̕����傫���l�ł��B");
		}else if(num2 > num1){
			System.out.println(num1 + "���" + num2 + "�̕����傫���l�ł��B");
		}else{
			System.out.println("2�̒l�͓����ł��B");
		}

	}

}
