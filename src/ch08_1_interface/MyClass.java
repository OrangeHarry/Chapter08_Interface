package ch08_1_interface;

public class MyClass {
	// 필드, 필드의 다형성
	RemoteControl rc = new Television();

	// 생성자
	MyClass() {
	}

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolum(5);
	}

	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolum(7);
	}
	
    //메소드, 매개변수의 다형성
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolum(3);
	}
}
