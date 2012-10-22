
class SampleP2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1 = new Car("1号車");
		Thread th1 = new Thread(car1);
		th1.start();
		
		Car car2 = new Car("2号車");
		Thread th2 = new Thread(car2);
		th2.start();
		
		for(int i = 0; i < 5; i++){
			System.out.println("main()の処理をしています。");
		}
		
		

	}

}
