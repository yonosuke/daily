package l08;
class Car1 {
	int num;
	double gas;
	
	void show() {
		System.out.println("�Ԃ̃i���o�[��" + this.num + "�ł��B");//�N���X���ł͒��ځi�������͖����I��this.�����āj�A�N�Z�X
		System.out.println("�K�\�����ʂ�" + this.gas + "�ł��B");
	}
	
	void showCar() {
		System.out.println("���ꂩ��Ԃ̏���\�����܂��B");
		this.show();//�N���X���ł͒��ځi�������͖����I��this.�����āj�Ăяo��
	}
}


public class Sample2 {

	public static void main(String[] args) {
		Car1 car1 = new Car1();
		car1.num = 1234;//�N���X�O�ł̓C���X�^���X���w���ϐ���.�����ăA�N�Z�X
		car1.gas = 20.5;
		
		car1.show();
		car1.showCar();

	}

}
