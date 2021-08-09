package ch08_1_interface;

public class SmartTelevision implements RemoteControl, Serchable {
	private int volum;
	private String name;

	public SmartTelevision(String name) {
		this.name = name;
	}

	@Override
	public void turnOn() {
		System.out.println(name + "TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println(name + "TV�� ���ϴ�");
	}

	@Override
	public void setVolum(int volum) {
		if (volum > RemoteControl.MAX_VOLUM) { // �������̽��� ����� �̿��ؼ� volum�� �ʵ尪�� ����
			this.volum = RemoteControl.MAX_VOLUM;
		} else if (volum < RemoteControl.MIN_VOLUM) {
			this.volum = RemoteControl.MIN_VOLUM;
		} else {
			this.volum = volum;
		}
		System.out.println("���� TV ���� = " + this.volum);
	}

	@Override
	public void serch(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

}
