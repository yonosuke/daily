
class RacingCar extends Car{
	private int course;
	
	public RacingCar(){
		course = 0;
		System.out.println("���[�W���O�J�[���쐬���܂����B");
	}
	
	public void setCourse(int c){
		course = c;
		System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
	}
}
