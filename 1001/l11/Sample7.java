package l11;

class Car7 {
	protected int num;
	protected double gas;
	
	public Car7() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
	
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public String toString(){
		String str = "�i���o�[:" + num + "�K�\������" + gas;
		return str;
	}
}

public class Sample7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car7 car1 = new Car7();
		car1.setCar(1234, 20.5); //setCar()���\�b�h���Ă΂��
		
		System.out.println(car1); //toString()���\�b�h���Ă΂��

	}

}
