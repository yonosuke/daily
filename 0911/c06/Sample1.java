package c06;

public class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Telservice rakuraku = new Telservice();
		Telservice baribari = new Telservice();
		
		rakuraku.name = "ラクラクサービスプラン";
		rakuraku.basic = 1000;
		rakuraku.call_rate = 20;
		
		baribari.name = "バリバリサービスプラン";
		baribari.basic = 2000;
		baribari.call_rate = 10;
		
		System.out.println(rakuraku.name + "/30分 " + rakuraku.charge(30));
		System.out.println(rakuraku.name + "/180分 " + rakuraku.charge(180));
		System.out.println(baribari.name + "/30分 " + baribari.charge(30));
		System.out.println(baribari.name + "/180分 " + baribari.charge(180));

	}

}
