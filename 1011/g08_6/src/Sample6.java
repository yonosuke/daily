
class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car car1 = new Car();
		
		car1.setNumGas(1234, 20.5);
		
		int number = car1.getNum();
		double gasoline = car1.getGas();
		
		System.out.println("�T���v������Ԃ𒲂ׂ��Ƃ���");
		System.out.println("�i���o�[��" + number + "�K�\�����ʂ�" + gasoline + "�ł����B");

	}

}
