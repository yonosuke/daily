package l10;

class Car2{
	private int num;
	private double gas;
	private String name; //�N���X�ϐ����g�����t�B�[���h
	
	public Car2(){
		num = 0;
		gas = 0.0;
		name = "������";
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void setName(String nm){ //�N���X�ϐ����������Ƃ��郁�\�b�h
		name = nm;
		System.out.println("���O��" + name + "�ɂ��܂����B");
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
		System.out.println("���O��" + name + "�ł��B");
	}
}

public class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car2 car1 = new Car2();
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1����";
		
		car1.setCar(number, gasoline);
		car1.setName(str); //������C���X�^���X�ϐ��������ϐ����������Ƃ��ēn��
		
		car1.show();

	}

}
