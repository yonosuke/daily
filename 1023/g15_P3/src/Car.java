
class Car implements Runnable {
	
	private String name;
	
	public Car(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i = 0; i < 5; i++){
			try{
				Thread.sleep(1000);
				System.out.println(name + "�̏��������Ă��܂��B");
			}catch(InterruptedException e){
			}
		}
	}
}
