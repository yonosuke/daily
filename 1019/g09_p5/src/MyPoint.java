
class MyPoint {
	private int x;
	private int y;
	
	public MyPoint(){ //�����Ȃ��R���X�g���N�^
		x = 0;
		y = 0;
	}
	
	public MyPoint(int px, int py){ //�R���X�g���N�^�ŏ����ɂ���ď����ݒ�
		if(px >= 0 && px <= 100){
			x = px;
		}else{
			x = 0;
		}
	}
	
	public void setX(int px){ //X���W��ݒ�
		if(px >= 0 && px <= 100){
			x = px;
		}
	}
	
	public void setY(int py){ //Y���W��ݒ�
		if(py >= 0 && py <= 100){
			y = py;
		}
	}
	
	public int getX(){ //X���W�𓾂�
		return x;
	}
	
	public int getY(){ //Y���W�𓾂�
		return y;
	}
}
