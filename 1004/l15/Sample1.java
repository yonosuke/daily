package l15;

class Car1 extends Thread{
	private String name;
	
	public Car1(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 25; i++){
			System.out.println(name + "�̏��������Ă��܂��B");
		}
	}
}

public class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car1 car1 = new Car1("1����");
		car1.start();
		
		for(int i = 0; i < 25; i++){
			System.out.println("main()�̏��������Ă��܂��B");
		}

	}

}
