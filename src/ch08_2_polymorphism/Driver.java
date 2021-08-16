package ch08_2_polymorphism;

public class Driver {
	// �ʵ�
	// ������
	// �޼ҵ�
//	public void drive(Bus bus) {
//		bus.run();
//	}
//
//	public void drive(Taxi taxi) {
//		taxi.run();
//	}
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) { //vehicle �Ű� ������ �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus) vehicle; // Bus��ü�� ��� �����ϰ� ���� Ÿ�� ��ȯ
			bus.checkFare(); //Bus Ÿ������ ����Ÿ�� ��ȯ�� �ϴ� ����
		}
		vehicle.run();
	}
}
