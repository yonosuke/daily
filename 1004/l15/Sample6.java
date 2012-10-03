package l15;

class Car6 implements Runnable{
	private String name;
	
	public Car6(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println(name + "の処理をしています。");
		}
	}
}

public class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car6 car1 = new Car6("1号車");
		
		Thread th1 = new Thread(car1); //Threadクラスのオブジェクトを作成
		th1.start(); //スレッドを起動
		
		for(int i = 0; i < 5; i++){
			System.out.println("main()の処理をしています。");
		}

	}

}
