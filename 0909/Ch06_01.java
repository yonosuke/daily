package ch06;

class TelService2 {
	String name;
	int basic;
	int call_rate;
	
	int charge(int min) {
		int call_charge = min * call_rate;
		return call_charge + basic;
	}
}

public class Ch06_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		TelService2 rakuraku = new TelService2();
		TelService2 baribari = new TelService2();
		
		rakuraku.name = "���N���N�T�[�r�X�v����";
		rakuraku.basic = 1000;
		rakuraku.call_rate = 20;
		
		baribari.name = "�o���o���T�[�r�X�v����";
		baribari.basic = 2000;
		baribari.call_rate = 10;
		
		System.out.println("���N���N�m30���n�F" + rakuraku.charge(30) + " " + "���N���N�m180���n�F" + rakuraku.charge(180));
		System.out.println("�o���o���m30���n�F" + baribari.charge(30) + " " + "�o���o���m180���n�F" + baribari.charge(180));
		
		

	}

}
