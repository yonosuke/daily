
class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car1 = new Car("1����"); //Car�N���X�̃C���X�^���X���쐬
		Thread th1 = new Thread(car1); //Thread�N���X�̃C���X�^���X���쐬
		th1.start(); //�X���b�h���N��
		
		for(int i = 0; i < 5; i++){
			System.out.println("main()�̏��������Ă��܂��B");
		}

	}

}
