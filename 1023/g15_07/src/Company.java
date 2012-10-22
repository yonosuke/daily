
class Company {
	
	private int sum = 0;
	
	public synchronized void add(int a){
		int tmp = sum;
		System.out.println("Œ»İA‡ŒvŠz‚Í" + tmp + "‚Å‚·B");
		System.out.println(a + "‰~‰Ò‚¬‚Ü‚µ‚½B");
		tmp = tmp + a;
		System.out.println("‡ŒvŠz‚ğ" + tmp + "‰~‚É‚µ‚Ü‚·B");
		sum = tmp;
	}
}
