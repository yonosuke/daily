package c06;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Telservice rakuraku = new Telservice();
		rakuraku.name = "���N���N�T�[�r�X�v����";
		rakuraku.basic = 1000;
		rakuraku.call_rate = 20;
		
		System.out.println("�����i20���j��" + rakuraku.charge(20) + "�ł�");

	}

}
