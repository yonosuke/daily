
class Car extends Thread {
	private String name;
	
	public Car(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 1000; i++){
			try{
				sleep(1000);
				System.out.println(name + "‚Ìˆ—‚ð‚µ‚Ä‚¢‚Ü‚·B");
			}catch(InterruptedException e){
			}
		}
	}
}
