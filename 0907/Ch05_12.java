package ch05;

public class Ch05_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int x = (int)(Math.random() * 10) % 4;
		switch (x){
		case 1: System.out.println("�]���1");
			break;
		case 2: System.out.println("�]���2");
			break;
		case 3: System.out.println("�]���3");
			break;
		default: System.out.println("�]��Ȃ�");
			break;
		}

	}

}
