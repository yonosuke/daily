
class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3;
		car3 = car1;
		
		boolean bl1 = car1.equals(car2);
		boolean bl2 = car1.equals(car3);
		
		System.out.println("car1��car2�����������ׂ��Ƃ���" + bl1 + "�ł����B");
		System.out.println("car1��car3�����������ׂ��Ƃ���" + bl2 + "�ł����B");

	}

}
