package l6;
import java.io.*;
public class sample10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("���т���͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		switch(res){
		case 1:
		case 2:
			System.out.println("���������撣��܂��傤");
			break;
		case 3:
		case 4:
			System.out.println("���̒��q�Ŋ撣��܂��傤");
			break;
		case 5:
			System.out.println("��ϗD�G�ł��B");
			break;
		default:
			System.out.println("1�`5�܂ł̐��т���͂��Ă��������B");
			break;
		}

	}

}
