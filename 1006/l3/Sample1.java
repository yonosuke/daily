package l3;

import java.io.*;

public class Sample1 {
	public static void main(String[] args) throws IOException {
		System.out.println("���Ȃ��͉��΂ł����H");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		//double num2 = Double.parseDouble(str);
		System.out.println("���Ȃ���" + num + "�΂ł��B");
		//System.out.println("���Ȃ���" + num2 + "�΂ł��B");
	}

}
