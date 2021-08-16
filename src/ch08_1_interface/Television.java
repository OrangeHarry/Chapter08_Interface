package ch08_1_interface;

public class Television implements RemoteControl {
	// 필드
	private int volum;

	// 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	// 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	// 추상 메소드의 실체 메소드,set으로 필드값 세팅
	@Override
	public void setVolum(int volum) {
		if (volum > RemoteControl.MAX_VOLUM) { // 인터페이스의 상수를 이용해서 volum의 필드값을 제한
			this.volum = RemoteControl.MAX_VOLUM;
		} else if (volum < RemoteControl.MIN_VOLUM) {
			this.volum = RemoteControl.MIN_VOLUM;
		} else {
			this.volum = volum;
		}
		System.out.println("현재 TV 볼륨 = " + this.volum);
	}
}
