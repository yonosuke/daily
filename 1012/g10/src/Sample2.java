import java.io.*;

class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�p������͂��Ă�������.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String strl = str.toLowerCase();
		
		System.out.println("�啶���ɕϊ������" + stru + "�ł��B");
		System.out.println("�������ɕϊ������" + strl + "�ł��B");

	}

}
