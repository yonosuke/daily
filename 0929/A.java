package l09;

class A {
	A() {
		System.out.println("����0�̃R���X�g���N�^�ł��B");
	}
	A(int a) {
		this();
		System.out.println("����1�̃R���X�g���N�^�ł��B");
	}
}

class SampleP4 {
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		A a1 = new A();
		A a2 = new A(10);
	}

}
