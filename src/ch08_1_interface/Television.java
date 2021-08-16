package ch08_1_interface;

public class Television implements RemoteControl {
	// �ʵ�
	private int volum;

	// �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	// �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	// �߻� �޼ҵ��� ��ü �޼ҵ�,set���� �ʵ尪 ����
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
}
