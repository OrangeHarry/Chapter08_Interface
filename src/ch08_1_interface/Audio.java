package ch08_1_interface;

public class Audio implements RemoteControl {
	// ÇÊµå
	private int volum;

	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
	}

	@Override
	public void setVolum(int volum) {
		if (volum > RemoteControl.MAX_VOLUM) {
			this.volum = RemoteControl.MAX_VOLUM;
		} else if (volum < RemoteControl.MIN_VOLUM) {
			this.volum = RemoteControl.MIN_VOLUM;
		} else {
			this.volum = volum;
		}
		System.out.println("ÇöÀç Audio º¼·ý = " + this.volum);
	}
}
