package ch06;

class Telservice {
	String name;
	int basic;
	int call_rate;
	int charge(int min) {
		int call_charge = min * call_rate;
		return call_charge + basic;
	}
}

public class Ch06_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Telservice rakuraku = new Telservice();
		rakuraku.name = "ラクラクサービスプラン";
		rakuraku.basic = 1000;
		rakuraku.call_rate = 20;

	}

}

