
class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car("1����");
		car1.start();
		
		for(int i =0; i < 5; i++){
			try{
				Thread.sleep(1000);
				System.out.println("main()�̏��������Ă��܂��B");
			}catch(InterruptedException e){
				
			}
		}

	}

}
