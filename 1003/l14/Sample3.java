package l14;

public class Sample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try{
			int[] test = new int[5];
			
			System.out.println("test[10]�ɒl�������܂��B");
			
			test[10] = 80;
			System.out.println("test[10]��80�������܂����B");
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�z��̗v�f�𒴂��Ă��܂��B");
		}
		
		finally{
			System.out.println("�Ō�ɕK�����̏��������܂��B");
		}
		
		System.out.println("�����I�����܂����B");

	}

}
