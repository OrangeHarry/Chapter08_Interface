package ch08_2_polymorphism;

public class Driver {
	// 필드
	// 생성자
	// 메소드
//	public void drive(Bus bus) {
//		bus.run();
//	}
//
//	public void drive(Taxi taxi) {
//		taxi.run();
//	}
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) { //vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle; // Bus객체일 경우 안전하게 강제 타입 변환
			bus.checkFare(); //Bus 타입으로 강제타입 변환을 하는 이유
		}
		vehicle.run();
	}
}
