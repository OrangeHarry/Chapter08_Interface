package ch08_2_polymorphism;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); Vehicle�������̽����� checkFare�� ����
		 
		Bus bus = (Bus) vehicle;  //���� Ÿ�� ��ȯ
		bus.run();
		bus.checkFare();
	}
}
