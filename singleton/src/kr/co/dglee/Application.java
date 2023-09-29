package kr.co.dglee;

public class Application {
	public static void main(String[] args) {

		// Calculator calc = new Calculator(); // private 생성자이므로 에러 발생
		Calculator calc = Calculator.getInstance();
		Calculator calc2 = Calculator.getInstance();

		System.out.println(calc == calc2); // 같은 객체를 참조하므로 true
		System.out.println(calc == Calculator.getInstance()); // 같은 객체를 참조하므로 true

		System.out.println(calc.add(10, 10));
		System.out.println(calc.sub(10, 9));
	}
}
