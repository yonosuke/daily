
class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5); //�i���o�[1234�K�\������20.5�̎Ԃ��쐬���܂����B
		vc[0].setSpeed(60); //���x��60�ɂ��܂����B
		
		vc[1] = new Plane(232); //��232�̔�s�@���쐬���܂����B
		vc[1].setSpeed(500); //���x��500�ɂ��܂����B
		
		for(int i = 0; i < vc.length; i++){
			vc[i].show();
		}

	}

}
