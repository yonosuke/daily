package l15;

class Car6 implements Runnable{
	private String name;
	
	public Car6(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println(name + "�̏��������Ă��܂��B");
		}
	}
}

public class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car6 car1 = new Car6("1����");
		
		Thread th1 = new Thread(car1); //Thread�N���X�̃I�u�W�F�N�g���쐬
		th1.start(); //�X���b�h���N��
		
		for(int i = 0; i < 5; i++){
			System.out.println("main()�̏��������Ă��܂��B");
		}

	}

}
