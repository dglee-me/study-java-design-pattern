package kr.co.dglee.factory;

import kr.co.dglee.vo.Button;
import kr.co.dglee.vo.Notification;
import kr.co.dglee.vo.Theme;

public interface ThemeFactory {

	Theme createTheme();

	Button createButton();

	Notification createNotification();
}
