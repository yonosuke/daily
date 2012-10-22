
class Sample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1 = new Car();
		try{
			car1.setCar(1234, -10.0);
		}catch(CarException e){
			System.out.println(e + "が送出されました。");
		}
		car1.show();

	}

}
