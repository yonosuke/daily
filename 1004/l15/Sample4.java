package l15;

class Car4 extends Thread{
	private String name;
	
	public Car4(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println(name + "の処理をしています。");
		}
	}
}

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car4 car1 = new Car4("1号車");
		car1.start();
		
		for(int i = 0; i < 5; i++){
			try{
				Thread.sleep(1000);
				System.out.println("main()の処理をしています。");
			}
			catch(InterruptedException e){}
		}

	}

}
