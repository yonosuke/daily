package Ch04;

public class Ch04_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double[][] d_data = new double[2][3];
		int x = Integer.valueOf(args[0]).intValue();
		int y = Integer.valueOf(args[1]).intValue();
		d_data[y][x] = Math.random();
		System.out.println(d_data[y][x]);

	}

}
