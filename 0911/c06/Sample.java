package c06;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Telservice rakuraku = new Telservice();
		rakuraku.name = "ラクラクサービスプラン";
		rakuraku.basic = 1000;
		rakuraku.call_rate = 20;
		
		System.out.println("料金（20分）は" + rakuraku.charge(20) + "です");

	}

}
