package l14;

class CarException extends Exception{ //��O�N���X���g��
	
}

class Car5{
	private int num;
	private double gas;
	
	public Car5(){
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g) throws CarException{ //��O�𑗏o���郁�\�b�h
		if(g < 0){
			CarException e = new CarException();
			throw e; //��O�𑗏o����
		}else{
			num = n;
			gas = g;
			System.out.println("�i���o�[��" + num + "�ɃK�\������" + gas + "�ɂ��܂����B");
		}
	}
	
	public void show(){
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

public class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car5 car1 = new Car5();
		try{
			car1.setCar(1234, -10); //����ŗ�O���o�����
		}
		catch(CarException e){
			System.out.println(e + "�����o����܂����B");
		}
		car1.show();

	}

}
