
class RacingCar extends Car {
	private int course;
	
	public RacingCar(){
		course = 0;
		System.out.println("���[�V���O�J�[���쐬���܂����B");
	}
	
	public RacingCar(int n, double g, int c){
		super(n, g); //�X�[�p�[�N���X�̈����Q�̃R���X�g���N�^���Ăяo�����悤�ɂ���
		course = c;
		System.out.println("�R�[�X�ԍ�" + course + "�̃��[�V���O�J�[���쐬���܂����B");
	}
	
	public void setCourse(int c){
		course = c;
		System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
	}
}
