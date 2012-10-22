
class Sample7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Company cmp = new Company();
		
		Driver drv1 = new Driver(cmp);
		drv1.start();
		
		Driver drv2 = new Driver(cmp);
		drv2.start();

	}

}
