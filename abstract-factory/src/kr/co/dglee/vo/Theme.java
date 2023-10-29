package kr.co.dglee.vo;

public class Theme {

	private Button button;

	private Notification notification;

	public Theme(Button button, Notification notification) {

		this.button = button;
		this.notification = notification;
	}

	@Override
	public String toString() {

		return "Theme [button=" + button + ", notification=" + notification + "]";
	}
}
