
class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1 = new Car("1号車"); //Threadクラスのサブクラスのインスタンスを作成。
		car1.start(); //新しいスレッドを起動
		
		for(int i = 0; i < 1000; i++){
			System.out.println("main()の処理をしています。");
		}

	}

}
