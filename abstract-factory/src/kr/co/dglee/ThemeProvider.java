package kr.co.dglee;

import kr.co.dglee.factory.ThemeFactory;
import kr.co.dglee.vo.Theme;

public class ThemeProvider {

	public static Theme getTheme(ThemeFactory factory) {

		return factory.createTheme();
	}
}
