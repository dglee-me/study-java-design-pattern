package kr.co.dglee;

import kr.co.dglee.adapter.VoltAdapter;
import kr.co.dglee.vo.E110v;
import kr.co.dglee.vo.e110v.HairDryer;
import kr.co.dglee.vo.e220v.AirConditioner;
import kr.co.dglee.vo.e220v.E220v;
import kr.co.dglee.vo.e220v.Refrigerator;

public class Application {

	public static void main(String[] args) {

		// 220V 전기를 사용하는 에어컨과 냉장고를 사용
		E220v airConditioner = new AirConditioner();
		E220v refrigerator = new Refrigerator();

		airConditioner.connect();
		refrigerator.connect();

		// 110V 전기를 사용하는 헤어드라이기를 사용
		E110v hairDryer = new HairDryer();
		hairDryer.connect();

		// 110V 전기를 사용하는 곳에서 220V 에어컨을 사용하려면 어댑터를 사용
		E110v airConditioner110v = new VoltAdapter(airConditioner);
		airConditioner110v.connect();
	}
}
