package l15;

class Car5 extends Thread{
	private String name;
	
	public Car5(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println(name + "の処理をしています。");
		}
	}
}

public class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car5 car1 = new Car5("1号車");
		car1.start();
		
		try{
			car1.join();
		}
		catch(InterruptedException e){}
		
		System.out.println("main()の処理を終わります。");

	}

}
