
class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car("1����");
		car1.start();
		
		try{
			car1.join(); //���̃X���b�h�̏I���������𒆒f���đҋ@
		}catch(InterruptedException e){
		}
		
		System.out.println("main()�̏����������܂��B");

	}

}
