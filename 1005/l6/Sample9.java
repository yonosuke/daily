package l6;
import java.io.*;
public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("���ԖڂŃ��[�v�𒆎~���܂����H�i1�`10�j");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i = 1; i <= 10; i++){
			System.out.println(i + "�Ԗڂ̏����ł��B");
			if(i == res){
				break;
			}
		}

	}

}
