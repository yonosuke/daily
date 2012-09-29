package l09;

class MyPoint {
	private int x;
	private int y;

	public MyPoint(){ //コンストラクタ 初期座標を0,0に設定
		x = 0;
		y = 0;
	}
	public MyPoint(int px, int py){ //コンストラクタ 初期座標を設定
		if(px >= 0 && px <= 100){ //pxが0以上100以下の場合は
			x = px;               //xにその数値を代入
		}else{                    //でなければ
			x = 0;                //xに0を代入
		}
		if(py >= 0 && py <= 100){ //pyが0以上100以下の場合は
			y = py;               //yにその数値を代入
		}else{                    //でなければ
			y = 0;                //yに0を代入
		}
	}
	
	public void setX(int px){ //メソッド X座標を設定
		if(px >= 0 && px <= 100){ //pxが0以上100以下の場合は
			x = px;               //xにpxを代入
		}
	}
	public void setY (int py){ //メソッド Y座標を設定
		if(py >= 0 && py <= 100){ //pyが0以上100以下の場合は
			y  = py;              //yにpyを代入
		}
	}
	
	public int getX(){ //メソッド X座標を得る
		return x;
	}
	
	public int getY(){ //メソッド Y座標を得る
		return y;
	}
}

class SampleP5{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyPoint p1 = new MyPoint(); //p1インスタンスを生成
		p1.setX(10); //p1のX座標を設定
		p1.setY(5); //p1のY座標を設定
		
		int px1 = p1.getX(); //p1のX座標を得てpxに代入
		int py1 = p1.getY(); //p1のY座標を得てpyに代入
		
		System.out.println("p1のX座標は" + px1 + "Y座標は" + py1 + "でした。");
		
		MyPoint p2 = new MyPoint(); //p2インスタンスを生成
		p2.setX(20); //p2のX座標を設定
		p2.setY(40); //p2のY座標を設定
		
		int px2 = p2.getX(); //p2のY座標を取得しpx2に代入
		int py2 = p2.getY(); //p2のY座標を取得しpy2に代入
		
		System.out.println("p2のX座標は" + px2 + "Y座標は" + py2 + "でした。");
	}

}
