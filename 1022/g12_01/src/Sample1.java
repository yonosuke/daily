
class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5); //ナンバー1234ガソリン量20.5の車を作成しました。
		vc[0].setSpeed(60); //速度を60にしました。
		
		vc[1] = new Plane(232); //便232の飛行機を作成しました。
		vc[1].setSpeed(500); //速度を500にしました。
		
		for(int i = 0; i < vc.length; i++){
			vc[i].show();
		}

	}

}
