				
class Car {
	int num;
	double gas;
	
	void setNum(int n){
		num = n;
		System.out.println("ナンバーを" + this.num + "にしました。");
	}
	
	void setGas(double g){
		gas = g;
		System.out.println("ガソリン量を" + this.gas + "にしました。");
	}
	
	void show(){
		System.out.println("車のナンバーは" + this.num + "です");
		System.out.println("ガソリン量は" + this.gas + "です。");
	}

}
