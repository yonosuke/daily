import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class SampleP4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("������2���͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int ans = Math.min(num1, num2);
		System.out.println(num1 + "��" + num2 + "�̂�������������" + ans + "�ł��B");

	}

}
