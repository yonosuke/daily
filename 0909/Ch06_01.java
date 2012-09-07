package ch06;

class TelService2 {
	String name;
	int basic;
	int call_rate;
	
	int charge(int min) {
		int call_charge = min * call_rate;
		return call_charge + basic;
	}
}

public class Ch06_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TelService2 rakuraku = new TelService2();
		TelService2 baribari = new TelService2();
		
		rakuraku.name = "ラクラクサービスプラン";
		rakuraku.basic = 1000;
		rakuraku.call_rate = 20;
		
		baribari.name = "バリバリサービスプラン";
		baribari.basic = 2000;
		baribari.call_rate = 10;
		
		System.out.println("ラクラク［30分］：" + rakuraku.charge(30) + " " + "ラクラク［180分］：" + rakuraku.charge(180));
		System.out.println("バリバリ［30分］：" + baribari.charge(30) + " " + "バリバリ［180分］：" + baribari.charge(180));
		
		

	}

}
