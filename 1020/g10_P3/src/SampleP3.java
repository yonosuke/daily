import java.io.*;



class SampleP3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("���������͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		
		System.out.println("a�̑}���ʒu�𐮐��œ��͂��Ă��������B");
		
		String str2 = br.readLine();
		int num = Integer.parseInt(str2);
		
		StringBuffer str3 = new StringBuffer(str1);
		str3.insert(num, 'a');
		
		System.out.println(str3 + "�ɂȂ�܂����B");

	}

}
