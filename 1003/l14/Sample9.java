package l14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try{
			BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
			
			int[] test = new int[8];
			String str;
			
			for(int i = 0; i < test.length; i++){
				str = br.readLine();
				test[i] = Integer.parseInt(str);
			}
			
			int max = test[0];
			int min = test[0];
			for(int i = 0; i < test.length; i++){
				if(max < test[i])
					max = test[i];
				if(min > test[i])
					min = test[i];
				System.out.println(test[i]);
			}
		
		System.out.println("�ō��_��" + max + "�ł��B");
		System.out.println("�Œ�_��" + min + "�ł��B");
		
		br.close();

	}
	catch(IOException e){
		System.out.println("���o�̓G���[�ł��B");
	}

}
}
