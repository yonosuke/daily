
class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car("1����"); //Thread�N���X�̃T�u�N���X�̃C���X�^���X���쐬�B
		car1.start(); //�V�����X���b�h���N��
		
		for(int i = 0; i < 1000; i++){
			System.out.println("main()�̏��������Ă��܂��B");
		}

	}

}
