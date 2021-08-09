package ch08_1_interface;

public class SmartTelevision implements RemoteControl, Serchable {
	private int volum;
	private String name;

	public SmartTelevision(String name) {
		this.name = name;
	}

	@Override
	public void turnOn() {
		System.out.println(name + "TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println(name + "TV를 끕니다");
	}

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

	@Override
	public void serch(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
