
class SampleP3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car("1����");
		Thread th1 = new Thread(car1);
		th1.start();
		
		for(int i = 0; i < 5; i++){
			System.out.println("main()�̏��������Ă��܂��B");
		}

	}

}
