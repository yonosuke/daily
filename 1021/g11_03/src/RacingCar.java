
class RacingCar extends Car{
	private int course;
	
	public RacingCar(){
		course = 0;
		System.out.println("レージングカーを作成しました。");
	}
	
	public void setCourse(int c){
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
	
	public void newShow(){
		System.out.println("レーシングカーのナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("コース番号は" + course + "です。");
	}
}
