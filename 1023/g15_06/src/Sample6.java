
class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car1 = new Car("1号車"); //Carクラスのインスタンスを作成
		Thread th1 = new Thread(car1); //Threadクラスのインスタンスを作成
		th1.start(); //スレッドを起動
		
		for(int i = 0; i < 5; i++){
			System.out.println("main()の処理をしています。");
		}

	}

}
