package ch08_1_interface;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스를 사용하면 TV완성을 기다리지 않아도 사용가능하다.
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolum(12);
		rc.setVolum(7);
		rc.turnOff();
		System.out.println("=====================");
		rc = new Audio();
		rc.turnOn();
		rc.setVolum(-5);
		rc.setVolum(7);
		rc.turnOff();
		
		// 인터페이스를 사용하지 않을 경우
//		       각 제조사의 TV가 완성되어야만 코드를 작성할 수 있다.
//		RemoteControl tv1 = new Television("삼성");
//		RemoteControl tv1 = new Television("LG");
//		tv1.turnOn();
//		tv2.turnOn();
	}
}
