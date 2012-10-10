
class Car {
	int num;
	double gas;
	
	void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	
	void showCar(){
		System.out.println("これから車の情報を表示します。");
		this.show();
	}
}
