package kr.co.dglee;

public class Calculator {
	private static final Calculator instance = new Calculator();

	private Calculator() {}

	public static Calculator getInstance() {
		return instance;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}
