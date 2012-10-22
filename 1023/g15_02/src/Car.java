
class Car extends Thread {
	private String name;
	
	public Car(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 1000; i++){
			System.out.println(name + "‚Ìˆ—‚ð‚µ‚Ä‚¢‚Ü‚·B");
		}
	}
}
