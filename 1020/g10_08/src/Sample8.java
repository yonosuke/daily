
class Sample8 {
	public static void main(String args[]){
		Car car1 = new Car(); //�Ԃ��쐬���܂����B
		
		car1.show(); //�Ԃ̃i���o�[��0�ł��B�K�\�����ʂ�0.0�ł��B���O�͖������ł��B
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1����";
		
		car1.setCar(number, gasoline); //�i���o�[��1234�K�\�����ʂ�20.5�ɂ��܂����B
		car1.setName(str); //���O��1���Ԃɂ��܂����B
		
		car1.show(); //�Ԃ̃i���o�[��1234�ł��B�K�\�����ʂ�20.5�ł��B���O��1���Ԃł�
	}
}
