package l15;

class Car1 extends Thread{
	private String name;
	
	public Car1(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 25; i++){
			System.out.println(name + "の処理をしています。");
		}
	}
}

public class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car1 car1 = new Car1("1号車");
		car1.start();
		
		for(int i = 0; i < 25; i++){
			System.out.println("main()の処理をしています。");
		}

	}

}
