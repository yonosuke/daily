
class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5);
		vc[1] = new Plane(232);
		
		for(int i = 0; i < vc.length; i++){
			if(vc[i] instanceof Car){
				System.out.println((i + 1) + "�Ԗڂ̃I�u�W�F�N�g��Car�N���X�ł��B");
			}else{
				System.out.println((i + 1) + "�Ԗڂ̃I�u�W�F�N�g��Car�N���X�ł͂���܂���B");
			}
		}

	}

}
