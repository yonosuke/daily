
class RacingCar extends Car{
	
	private int course;
	
	public RacingCar(){
		course = 0;
		System.out.println("���[�V���O�J�[���쐬���܂����B");
	}
	
	public void setCourse(int c){
		course = c;
		System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
	}
	
	public void show(){
		System.out.println("���[�V���O�J�[�̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
		System.out.println("�R�[�X�ԍ���" + course + "�ł��B");
	}
}
