
class A {
	A(){
		System.out.println("引数０のコンストラクタです。");
	}
	
	A(int a){
		this();
		System.out.println("引数1のコンストラクタです。");
	}
}
