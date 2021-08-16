package ch08_1_interface;

public interface RemoteControl {
	// 상수 선언 (static final을 붙여서 선언해줘야 한다, 안 붙어있어도 이클립스에서 자동으로 붙여줘서 생략해도 되긴 한다..)
	public int MAX_VOLUM = 10;
	public static final int MIN_VOLUM = 0;

	// 추상메소드(abstract를 붙여야 하지만 인터페이스에서는 생략이 가능하다. 이클립스에서 자동으로 붙여줘서....헷갈리게 증말)
	public void turnOn();
	public abstract void turnOff();
	public abstract void setVolum(int volum); // 메소드의 선언부만 작성
}
