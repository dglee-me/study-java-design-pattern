package kr.co.dglee.vo.e220v;

public class AirConditioner implements E220v {

	@Override
	public void connect() {

		System.out.println("에어컨 220v Connected");
	}
}
