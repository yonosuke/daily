package l15;

class Car4 extends Thread{
	private String name;
	
	public Car4(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println(name + "�̏��������Ă��܂��B");
		}
	}
}

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car4 car1 = new Car4("1����");
		car1.start();
		
		for(int i = 0; i < 5; i++){
			try{
				Thread.sleep(1000);
				System.out.println("main()�̏��������Ă��܂��B");
			}
			catch(InterruptedException e){}
		}

	}

}
