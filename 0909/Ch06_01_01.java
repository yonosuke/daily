package ch06;
class TelService1 {
	String name; //String�^��name�Ƃ����t�B�[���h�i�ϐ��j���`
	int basic; //int�^��basic�Ƃ����t�B�[���h�i�ϐ��j���`
	int call_rate; //int�^��call_rate�Ƃ����t�B�[���h�i�ϐ��j���`
	
	int charge(int min) { // ���\�b�h
		int call_charge = min * call_rate;
		return call_charge + basic;
	}
}

public class Ch06_01_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		TelService1 rakuraku = new TelService1(); //TelService�N���X �I�u�W�F�N�g��rakuraku �R���X�g���N�^�ł���
		rakuraku.name = "���N���N�T�[�r�X�v����"; //�C���X�^���X�I�u�W�F�N�g TelService�N���X���g���ăC���X�^���X��
		rakuraku.basic = 1000; //�C���X�^���X�I�u�W�F�N�g TelService�N���X���g���ăC���X�^���X��
		rakuraku.call_rate = 20; //�C���X�^���X�I�u�W�F�N�g TelService�N���X���g���ăC���X�^���X��
		
		
		
		System.out.println("�����i�ʘb20���j��" + rakuraku.charge(20) + "�~");

	}

}
