
class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car();
		try{
			car1.setCar(1234, -10.0);
		}catch(CarException e){
			System.out.println(e + "�����o����܂����B");
		}
		car1.show();

	}

}
