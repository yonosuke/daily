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
		// TODO 自動生成されたメソッド・スタブ

	}

}
