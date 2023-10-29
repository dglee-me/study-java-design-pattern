package kr.co.dglee.factory;

import kr.co.dglee.vo.Button;
import kr.co.dglee.vo.MacOSButton;
import kr.co.dglee.vo.MacOSNotification;
import kr.co.dglee.vo.Notification;
import kr.co.dglee.vo.Theme;

public class MacOSThemeFactory implements ThemeFactory {

	@Override
	public Theme createTheme() {

		return new Theme(createButton(), createNotification());
	}

	@Override
	public Button createButton() {

		return new MacOSButton();
	}

	@Override
	public Notification createNotification() {

		return new MacOSNotification();
	}

}
