package ch08;

class calcException extends Exception {
	void printError() {
		System.out.println("calcException��throw����܂���");
	}
}

public class Ch08_33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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
