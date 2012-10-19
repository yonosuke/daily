
public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1 = new Car();
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		System.out.println("正しくないガソリン量を設定してみます。");
		
		car1.setNumGas(1234, -10.0);
		car1.show();

	}

}
