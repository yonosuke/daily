
class Sample8 {
	public static void main(String args[]){
		Car car1 = new Car(); //車を作成しました。
		
		car1.show(); //車のナンバーは0です。ガソリン量は0.0です。名前は名無しです。
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1号車";
		
		car1.setCar(number, gasoline); //ナンバーを1234ガソリン量を20.5にしました。
		car1.setName(str); //名前を1号車にしました。
		
		car1.show(); //車のナンバーは1234です。ガソリン量は20.5です。名前は1号車です
	}
}
