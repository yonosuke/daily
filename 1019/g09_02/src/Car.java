
public class Car {
	private int num;
	private double gas;
	
	public void setNumGas(int n, double g){
		if( g > 0 && g < 100){
			num = n;
			gas = g;
			System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
		}else{
			System.out.println(g + "は正しいガソリン量ではありません。");
			System.out.println("ガソリン量を変更できませんでした。");
		}
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
