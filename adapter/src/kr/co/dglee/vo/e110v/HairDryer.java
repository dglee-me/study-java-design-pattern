package kr.co.dglee.vo.e110v;

import kr.co.dglee.vo.E110v;

public class HairDryer implements E110v {

	@Override
	public void connect() {

		System.out.println("헤어드라이기 110v Connected");
	}
}
