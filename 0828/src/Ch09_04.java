package Ch09;

import java.io.IOException;

public class Ch09_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try {
			int a;
			while((a = System.in.read()) != -1);
			System.out.println("���͕����F" +(char)a);
		} catch (IOException e) {
			System.out.println("���̓G���[");
		}

	}

}
