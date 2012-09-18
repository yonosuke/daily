package rm;

import java.util.Random;



public class RmSample {
	
	private static Random random;
	Double d;
	Integer i;
	
	public static double getDoubleRandom() {
		return Math.random();
	}
	
	public static int getIntRandom() {  
        return random.nextInt(500);//random.nextInt();  
    }  

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RmSample rmsample = new RmSample();
		rmsample.d = getDoubleRandom();
		System.out.println(rmsample.d);
		
        Random random = new Random();  
		System.out.println(random.nextInt(12));
		// TODO 自動生成されたメソッド・スタブ

	}

}
