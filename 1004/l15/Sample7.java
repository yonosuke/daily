package l15;

class Company{
	private int sum = 0;
	public synchronized void add(int a){ //synchronized�œ������Ƃ�
		int tmp = sum;
		System.out.println("���݁A���v�z��" + tmp + "�~�ł��B");
		System.out.println(a + "�~�҂��܂����B");
		tmp = tmp + a;
		System.out.println("���v�z��" + tmp + "�~�ɂ��܂��B");
		sum = tmp;
	}
}

class Driver extends Thread{
	private Company comp;
	
	public Driver(Company c){
		comp = c;
	}
	
	public void run(){
		for(int i = 0; i < 3; i++){
			comp.add(50);
		}
	}
}

public class Sample7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Company cmp = new Company();
		
		Driver drv1 = new Driver(cmp);
		drv1.start();
		
		Driver drv2 = new Driver(cmp);
		drv2.start();

	}

}
