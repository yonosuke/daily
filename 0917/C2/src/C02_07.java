
public class C02_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String binary = Integer.toBinaryString(102);
		System.out.println(binary);
		
		Integer i = Integer.parseInt("1000011",2);
		System.out.println(i);
		
		String oct = Integer.toOctalString(102);
		System.out.println(oct);
		
		Integer i2 = Integer.parseInt("C9", 16);
		System.out.println(i2);

	}

}
