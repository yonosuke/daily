package ch05;

public class Ch05_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		char c;
		if(args.length > 0){
			c = args[0].charAt(0);
		
			switch (c){
			case 'a':System.out.println("��������'a'");
				break;
			case 'b':System.out.println("��������'b'");
				break;
			case 'c':System.out.println("��������'c'");
				break;
			default:System.out.println("�������͂���ȊO");
			}
		
		}

	}

}
