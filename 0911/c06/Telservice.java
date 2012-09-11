package c06;

public class Telservice {
	String name;
	int basic;
	int call_rate;
	
	int charge(int min) {
		int call_charge = min * call_rate;
		return call_charge + basic;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
