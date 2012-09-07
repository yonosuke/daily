package ch06;

class Calc1 {
	int [] calcArr(int[] data) {
		int[] r = new int[data.length];
		int i;
		for(i = 0; i < data.length; i++)
			r[i] = data[i]*data[i];
		return r;
	}
}

public class Ch06_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calc1 calc = new Calc1();
		int[] data = {2, 5, 7, 9, 10};
		int[] r = calc.calcArr(data);
		int i;
		for(i = 0; i < r.length; i++)
			System.out.println(r[i]);

	}

}
