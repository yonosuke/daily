
class Sample7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1;
		System.out.println("car1��錾���܂����B");
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car car2;
		System.out.println("car2��錾���܂����B");
		
		car2 = car1;
		System.out.println("car2��car1�������܂����B");
		
		System.out.print("car1������");
		car1.show();
		System.out.print("car2������");
		car2.show();
		
		System.out.println("Car1�������ԂɕύX�������܂�");
		car1.setCar(2345, 20.5);
		
		System.out.print("car1������");
		car1.show();
		System.out.print("car2������");
		car2.show();

	}

}
