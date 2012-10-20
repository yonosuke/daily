
class Sample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1;
		System.out.println("car1を宣言しました。");
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car car2;
		System.out.println("car2を宣言しました。");
		
		car2 = car1;
		System.out.println("car2にcar1を代入しました。");
		
		System.out.print("car1がさす");
		car1.show();
		System.out.print("car2がさす");
		car2.show();

	}

}
