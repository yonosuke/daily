package ch06;
class TelService1 {
	String name; //String型のnameというフィールド（変数）を定義
	int basic; //int型のbasicというフィールド（変数）を定義
	int call_rate; //int型のcall_rateというフィールド（変数）を定義
	
	int charge(int min) { // メソッド
		int call_charge = min * call_rate;
		return call_charge + basic;
	}
}

public class Ch06_01_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TelService1 rakuraku = new TelService1(); //TelServiceクラス オブジェクト名rakuraku コンストラクタでつくる
		rakuraku.name = "ラクラクサービスプラン"; //インスタンスオブジェクト TelServiceクラスを使ってインスタンス化
		rakuraku.basic = 1000; //インスタンスオブジェクト TelServiceクラスを使ってインスタンス化
		rakuraku.call_rate = 20; //インスタンスオブジェクト TelServiceクラスを使ってインスタンス化
		
		
		
		System.out.println("料金（通話20分）は" + rakuraku.charge(20) + "円");

	}

}
