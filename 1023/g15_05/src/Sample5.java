
class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1 = new Car("1号車");
		car1.start();
		
		try{
			car1.join(); //このスレッドの終了迄処理を中断して待機
		}catch(InterruptedException e){
		}
		
		System.out.println("main()の処理をおわります。");

	}

}
