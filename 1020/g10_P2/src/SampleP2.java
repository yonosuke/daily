import java.io.*;


class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("���������͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		StringBuffer str2 = new StringBuffer(str1);
		str2.reverse();
		
		System.out.println(str1 + "���t�ɂ����" + str2 + "�ł��B");
	}
	

}
