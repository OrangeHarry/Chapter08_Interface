package ch08_1_interface;

public interface RemoteControl {
	// ��� ���� (static final�� �ٿ��� ��������� �Ѵ�, �� �پ��־ ��Ŭ�������� �ڵ����� �ٿ��༭ �����ص� �Ǳ� �Ѵ�..)
	public int MAX_VOLUM = 10;
	public static final int MIN_VOLUM = 0;

	// �߻�޼ҵ�(abstract�� �ٿ��� ������ �������̽������� ������ �����ϴ�. ��Ŭ�������� �ڵ����� �ٿ��༭....�򰥸��� ����)
	public void turnOn();
	public abstract void turnOff();
	public abstract void setVolum(int volum); // �޼ҵ��� ����θ� �ۼ�
}
