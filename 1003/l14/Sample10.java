package l14;

import java.io.*;

public class Sample10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		if(args.length != 1){
			System.out.println("�t�@�C�����𐳂����w�肵�Ă��������B");
			System.exit(1);
		}
		try{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException e){
			System.out.println("���̓G���[�ł��B");
		}

	}

}
