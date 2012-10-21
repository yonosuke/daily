class Car extends Vehicle {

	private int num;
	private double gas;
	
	public Car(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	void show() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("速度は" + speed + "です。");
	}
}
