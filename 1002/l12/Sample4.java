package l12;

interface iVehicle4{
	void vShow(); //���ۃ��\�b�h
}

interface iMaterial4{ //���ۃ��\�b�h
	void mShow();
}

class Car4 implements iVehicle4, iMaterial4{ //�C���^�[�t�F�C�X������
	private int num;
	private double gas;
	
	
	public Car4(int n, double g){
		num = n;
		gas = g;
		System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
	}
	
	public void vShow(){ //iVehicle4�̃��\�b�h���`
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
	
	public void mShow(){ //iMaterila4�̃��\�b�h���`
		System.out.println("�Ԃ̍ގ��͓S�ł��B");
		
	}
}

public class Sample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Car4 car1 = new Car4(1234, 20.5);
		car1.vShow();
		car1.mShow();

	}

}
