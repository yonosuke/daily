
class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car("1����");
		car1.start();
		
		Car car2 = new Car("2����");
		car2.start();
		
		for(int i = 0; i < 1000; i++){
			System.out.println("main()�̏��������Ă��܂��B");
		}

	}

}
