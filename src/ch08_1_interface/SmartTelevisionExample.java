package ch08_1_interface;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision("�Ｚ ����Ʈ");
//		tv1.turnOn();
//		tv1.setVolum(7);
//		tv1.serch("����� ��");
//		tv1.turnOff();
		
		//(�ڵ�����ȯ (RemoteControl <---- SmartTelevision)
		RemoteControl rc = tv;
		rc.turnOn();
//		rc.serch(); // �Ұ��� ���� �翬��
 		
		Serchable sc = tv;
		sc.serch("�迬�� ������ũ");
	}
}
