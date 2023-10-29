package kr.co.dglee.factory;

import kr.co.dglee.vo.Button;
import kr.co.dglee.vo.Notification;
import kr.co.dglee.vo.Theme;
import kr.co.dglee.vo.WindowsButton;
import kr.co.dglee.vo.WindowsNotification;

public class WindowsThemeFactory implements ThemeFactory {

	@Override
	public Theme createTheme() {

		return new Theme(createButton(), createNotification());
	}

	@Override
	public Button createButton() {

		return new WindowsButton();
	}

	@Override
	public Notification createNotification() {

		return new WindowsNotification();
	}
}
