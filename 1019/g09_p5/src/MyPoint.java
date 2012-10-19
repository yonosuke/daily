
class MyPoint {
	private int x;
	private int y;
	
	public MyPoint(){ //引数なしコンストラクタ
		x = 0;
		y = 0;
	}
	
	public MyPoint(int px, int py){ //コンストラクタで条件によって初期設定
		if(px >= 0 && px <= 100){
			x = px;
		}else{
			x = 0;
		}
	}
	
	public void setX(int px){ //X座標を設定
		if(px >= 0 && px <= 100){
			x = px;
		}
	}
	
	public void setY(int py){ //Y座標を設定
		if(py >= 0 && py <= 100){
			y = py;
		}
	}
	
	public int getX(){ //X座標を得る
		return x;
	}
	
	public int getY(){ //Y座標を得る
		return y;
	}
}
