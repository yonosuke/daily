
class Sample8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3;
		car3 = car1;
		
		boolean bl1 = car1.equals(car2);
		boolean bl2 = car1.equals(car3);
		
		System.out.println("car1とcar2が同じか調べたところ" + bl1 + "でした。");
		System.out.println("car1とcar3が同じか調べたところ" + bl2 + "でした。");

	}

}
