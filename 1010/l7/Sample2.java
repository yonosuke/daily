package l7;
import java.io.*;
public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("�e�X�g�̎󌱎Ґ�����͂��Ă�������");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�W�����͂��������ĕϐ�br�Ɋi�[
		String str = br.readLine(); //�ϐ�br�̃e�L�X�g�s��ǂݍ��݂�str�Ɋi�[
		int num = Integer.parseInt(str); //�W�����͕͂�����Ȃ̂�str��int�^�ɂ���
		
		int[] test = new int[num]; //int�^�z��ɕϐ�num��n���āAtest�Ƃ������̃C���X�^���X�𐶐�
		System.out.println("�l�����̓_������͂��Ă��������B");
		
		for(int i = 0; i < num; i++){
			str = br.readLine(); //�_����str�Ɋi�[
			int tmp = Integer.parseInt(str); //�_����int�^�ϐ�tmp�Ɋi�[
			test[i] = tmp; //int�^�z��test��i�Ԗڂ�tmp������
		}
		
		for(int i = 0; i < num; i++){
			System.out.println((i + 1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
		}

	}

}
