
class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1 = new Car("1号車");
		car1.start();
		
		for(int i =0; i < 5; i++){
			try{
				Thread.sleep(1000);
				System.out.println("main()の処理をしています。");
			}catch(InterruptedException e){
				
			}
		}

	}

}
