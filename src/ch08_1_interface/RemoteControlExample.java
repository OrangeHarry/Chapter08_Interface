package ch08_1_interface;

public class RemoteControlExample {
	public static void main(String[] args) {
		//�������̽��� ����ϸ� TV�ϼ��� ��ٸ��� �ʾƵ� ��밡���ϴ�.
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
		
		// �������̽��� ������� ���� ���
//		       �� �������� TV�� �ϼ��Ǿ�߸� �ڵ带 �ۼ��� �� �ִ�.
//		RemoteControl tv1 = new Television("�Ｚ");
//		RemoteControl tv1 = new Television("LG");
//		tv1.turnOn();
//		tv2.turnOn();
	}
}
