package ch08_2_polymorphism;

interface InterfaceA {
	public abstract void methodA();
}

interface InterfaceB {
	public void methodB();
}
//인터페이스는 클래스와 달리 다중상속을 허용한다.
interface InterfaceC extends InterfaceA, InterfaceB {
//	void methodA();
//	void methodB();
	void methodC();
}

class ImplementationC implements InterfaceC{

	@Override
	public void methodA() {
    System.out.println("ImplementationC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
	
}

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl; //impl이 interfaceA형으로 형변환이 된거지
		ia.methodA();
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
