package ch07;

class Calc {
	int x = 2;
	int add (int x) {
		return x + this.x;
	}
}

class SubCalc extends Calc {
	int x = 4;
	int add (int x) {
		return (x + super.x) * this.x;
	}
}

public class Ch07_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}
