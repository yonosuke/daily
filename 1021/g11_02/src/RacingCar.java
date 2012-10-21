
class RacingCar extends Car {
	private int course;
	
	public RacingCar(){
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	
	public RacingCar(int n, double g, int c){
		super(n, g); //スーパークラスの引数２個のコンストラクタが呼び出されるようにする
		course = c;
		System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
	}
	
	public void setCourse(int c){
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
}
