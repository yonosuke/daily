
class Car {
	int num;
	double gas;
	
	int getNum(){
		System.out.println("ナンバーを調べました");
		return num;
	}
	
	double getGas(){
		System.out.println("ガソリン量を調べました。");
		return gas;
	}
	
	void setNumGas(int n, double g){
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
