package Ch09;
import java.io.*;
public class Ch09_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try {
			
			int a = System.in.read();
			System.out.println("���͕����F" + (char)a);
		} catch (IOException e) {
			System.out.println("���̓G���[");
		}

	}

}
