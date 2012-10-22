
class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1 = new Car("1号車");
		car1.start();
		
		Car car2 = new Car("2号車");
		car2.start();
		
		for(int i = 0; i < 1000; i++){
			System.out.println("main()の処理をしています。");
		}

	}

}
