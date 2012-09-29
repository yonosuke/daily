package l09;

class MyPoint {
	private int x;
	private int y;

	public MyPoint(){ //�R���X�g���N�^ �������W��0,0�ɐݒ�
		x = 0;
		y = 0;
	}
	public MyPoint(int px, int py){ //�R���X�g���N�^ �������W��ݒ�
		if(px >= 0 && px <= 100){ //px��0�ȏ�100�ȉ��̏ꍇ��
			x = px;               //x�ɂ��̐��l����
		}else{                    //�łȂ����
			x = 0;                //x��0����
		}
		if(py >= 0 && py <= 100){ //py��0�ȏ�100�ȉ��̏ꍇ��
			y = py;               //y�ɂ��̐��l����
		}else{                    //�łȂ����
			y = 0;                //y��0����
		}
	}
	
	public void setX(int px){ //���\�b�h X���W��ݒ�
		if(px >= 0 && px <= 100){ //px��0�ȏ�100�ȉ��̏ꍇ��
			x = px;               //x��px����
		}
	}
	public void setY (int py){ //���\�b�h Y���W��ݒ�
		if(py >= 0 && py <= 100){ //py��0�ȏ�100�ȉ��̏ꍇ��
			y  = py;              //y��py����
		}
	}
	
	public int getX(){ //���\�b�h X���W�𓾂�
		return x;
	}
	
	public int getY(){ //���\�b�h Y���W�𓾂�
		return y;
	}
}

class SampleP5{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		MyPoint p1 = new MyPoint(); //p1�C���X�^���X�𐶐�
		p1.setX(10); //p1��X���W��ݒ�
		p1.setY(5); //p1��Y���W��ݒ�
		
		int px1 = p1.getX(); //p1��X���W�𓾂�px�ɑ��
		int py1 = p1.getY(); //p1��Y���W�𓾂�py�ɑ��
		
		System.out.println("p1��X���W��" + px1 + "Y���W��" + py1 + "�ł����B");
		
		MyPoint p2 = new MyPoint(); //p2�C���X�^���X�𐶐�
		p2.setX(20); //p2��X���W��ݒ�
		p2.setY(40); //p2��Y���W��ݒ�
		
		int px2 = p2.getX(); //p2��Y���W���擾��px2�ɑ��
		int py2 = p2.getY(); //p2��Y���W���擾��py2�ɑ��
		
		System.out.println("p2��X���W��" + px2 + "Y���W��" + py2 + "�ł����B");
	}

}
