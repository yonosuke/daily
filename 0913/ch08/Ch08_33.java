package ch08;

class calcException extends Exception {
	void printError() {
		System.out.println("calcExceptionがthrowされました");
	}
}

public class Ch08_33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			calc(2, 3);
		} catch (calcException e) {
			e.printError();
		}

	}
	static void calc (int i, int j) throws calcException {
		if(i * j == 0) {
			throw new calcException();
		}
		System.out.println(i * j);
	}

}
