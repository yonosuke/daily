package c06;

public class Sample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Telservice rakuraku = new Telservice();
		Telservice baribari = new Telservice();
		
		rakuraku.name = "���N���N�T�[�r�X�v����";
		rakuraku.basic = 1000;
		rakuraku.call_rate = 20;
		
		baribari.name = "�o���o���T�[�r�X�v����";
		baribari.basic = 2000;
		baribari.call_rate = 10;
		
		System.out.println(rakuraku.name + "/30�� " + rakuraku.charge(30));
		System.out.println(rakuraku.name + "/180�� " + rakuraku.charge(180));
		System.out.println(baribari.name + "/30�� " + baribari.charge(30));
		System.out.println(baribari.name + "/180�� " + baribari.charge(180));

	}

}
