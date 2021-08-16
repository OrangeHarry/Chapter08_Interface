package ch08_2_polymorphism;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); Vehicle인터페이스에는 checkFare가 없음
		 
		Bus bus = (Bus) vehicle;  //강제 타입 변환
		bus.run();
		bus.checkFare();
	}
}
