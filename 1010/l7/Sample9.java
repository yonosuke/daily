package l7;
import java.io.*;
public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] test = new int[5];
		System.out.println(test.length + "�l�̓_������͂��Ă��������B");
		
		for(int i = 0; i < test.length; i++){
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		for(int s = 0; s < test.length; s++){
			for(int t = s + 1; t < test.length-1; t++){
				if(test[t] > test[s]){
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		
		for(int j = 0; j < test.length; j++){
			System.out.println((j + 1) + "�Ԗڂ̐l�̓_����" + test[j] + "�ł��B");
		}

	}

}
