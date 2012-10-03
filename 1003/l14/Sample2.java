package l14;

public class Sample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			int[] test = new int[5];
			
			System.out.println("test[10]に値を代入します。");
			
			test[10] = 80;
			System.out.println("test[10]に80を代入しました。");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("配列の要素を超えています。");
		}
		
		System.out.println("無事終了しました。");

	}

}
