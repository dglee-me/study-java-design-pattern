package kr.co.dglee.vo.e220v;

public class Refrigerator implements E220v {

	@Override
	public void connect() {

		System.out.println("냉장고 220v Connected");
	}
}
