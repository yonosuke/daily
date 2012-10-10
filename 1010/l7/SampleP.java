package l7;

import java.io.*;

public class SampleP {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("5人のテストの点数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] test = new int[5];
		
		//入力された点数を保持する
		for(int i = 0; i < test.length; i++){
		String str = br.readLine();
		int tmp = Integer.parseInt(str);
		test[i] = tmp; //入力された点数をtest[i]に代入
		}
		
		//最高点を選定する
		int max = 0;
		for(int i = 0; i < test.length; i++){
			if(max < test[i]){ //maxがtest[i]より小さかったらtest[i]をmaxに代入
				max = test[i];
			}
		}
		
		for(int i = 0; i < test.length; i++){
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
		}
		
		System.out.println("最高点は" + max + "点です。");

	}

}
