package l7;

import java.io.*;

public class SampleP {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("5�l�̃e�X�g�̓_������͂��Ă��������B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] test = new int[5];
		
		//���͂��ꂽ�_����ێ�����
		for(int i = 0; i < test.length; i++){
		String str = br.readLine();
		int tmp = Integer.parseInt(str);
		test[i] = tmp; //���͂��ꂽ�_����test[i]�ɑ��
		}
		
		//�ō��_��I�肷��
		int max = 0;
		for(int i = 0; i < test.length; i++){
			if(max < test[i]){ //max��test[i]��菬����������test[i]��max�ɑ��
				max = test[i];
			}
		}
		
		for(int i = 0; i < test.length; i++){
			System.out.println((i + 1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
		}
		
		System.out.println("�ō��_��" + max + "�_�ł��B");

	}

}
