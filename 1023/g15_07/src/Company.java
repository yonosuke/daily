
class Company {
	
	private int sum = 0;
	
	public synchronized void add(int a){
		int tmp = sum;
		System.out.println("���݁A���v�z��" + tmp + "�ł��B");
		System.out.println(a + "�~�҂��܂����B");
		tmp = tmp + a;
		System.out.println("���v�z��" + tmp + "�~�ɂ��܂��B");
		sum = tmp;
	}
}
