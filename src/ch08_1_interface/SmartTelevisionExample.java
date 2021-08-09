package ch08_1_interface;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision("삼성 스마트");
//		tv1.turnOn();
//		tv1.setVolum(7);
//		tv1.serch("손흥민 골");
//		tv1.turnOff();
		
		//(자동형변환 (RemoteControl <---- SmartTelevision)
		RemoteControl rc = tv;
		rc.turnOn();
//		rc.serch(); // 불가능 하지 당연히
 		
		Serchable sc = tv;
		sc.serch("김연경 스파이크");
	}
}
