package l10;

class Car3{
	private int num;
	private double gas;
	
	public Car3(){
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car3[] cars = new Car3[3]; //Car3[]�^�z�� �v�f��3�m��
		/*
		cars[0] = new Car3();
		cars[1] = new Car3();
		cars[2] = new Car3();
		*///����for���͂���3l�ƈꏏ
		for(int i = 0; i < cars.length; i++){
			cars[i] = new Car3();
		}
		
		cars[0].setCar(1234, 20.5);
		cars[1].setCar(2345, 30.5);
		cars[2].setCar(3456, 40.5);
		
		for(int i = 0; i < cars.length; i++){
			cars[i].show();
		}

	}

}
