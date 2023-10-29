package kr.co.dglee;

import kr.co.dglee.factory.MacOSThemeFactory;
import kr.co.dglee.factory.WindowsThemeFactory;
import kr.co.dglee.vo.Theme;

public class Application {

	public static void main(String[] args) {

		Theme macTheme = ThemeProvider.getTheme(new MacOSThemeFactory());
		Theme windowsTheme = ThemeProvider.getTheme(new WindowsThemeFactory());

		System.out.println("MacOS:: " + macTheme.toString());
		System.out.println("Windows:: " + windowsTheme.toString());
	}
}
