package ch08_1_interface;

public class MyClass {
	// �ʵ�, �ʵ��� ������
	RemoteControl rc = new Television();

	// ������
	MyClass() {
	}

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolum(5);
	}

	// �޼ҵ�
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolum(7);
	}
	
    //�޼ҵ�, �Ű������� ������
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolum(3);
	}
}
