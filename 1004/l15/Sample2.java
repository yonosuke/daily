package l15;

class Car2 extends Thread{
	private String name;
	
	public Car2(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 25; i++){
			System.out.println(name + "の処理をしています。");
		}
	}
}

public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car2 car1 = new Car2("1号車");
		car1.start();
		
		Car2 car2 = new Car2("2号車");
		car2.start();
		
		for(int i = 0; i < 25; i++){
			System.out.println("main()の処理をしています");
		}

	}

}
