package c06;

public class Calc { 
	int[] calcArr(int[] data) { //int型配列calcArrメソッド 引数はint型配列data
		int[] r = new int[data.length]; //int型配列の変数rに…なんでnewしてるの？？
		int i; //int型の変数iを宣言
		for(i = 0; i < data.length; i++) //
			r[i] = data[i] * data[i]; //引数iの配列値を全て2乗し、変数rに格納
		return r;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calc calc = new Calc();
		int[] data = {2, 5, 7, 9, 10};
		
		int[] r = calc.calcArr(data);
		int i;
		for(i = 0; i <r.length; i++)
			System.out.println(r[i]);

	}

}
