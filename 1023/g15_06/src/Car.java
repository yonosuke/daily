
class Car implements Runnable { //Runnnable�C���^�[�t�F�[�X������

	private String name;
	
	public Car(String nm){
		name = nm;
	}

	public void run() {
		for(int i = 0; i < 5; i++){
			System.out.println(name + "�̏��������Ă��܂��B");
		}

	}

}
