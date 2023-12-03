package kr.co.dglee.adapter;

import kr.co.dglee.vo.E110v;
import kr.co.dglee.vo.e220v.E220v;

/**
 * 220V 전기를 사용하는 기기를 110V 전기를 사용하는 기기로 변경하는 어댑터 클래스
 */
public class VoltAdapter implements E110v {

	private E220v e220v;

	public VoltAdapter(E220v e220v) {

		this.e220v = e220v;
	}

	@Override
	public void connect() {

		e220v.connect();
	}
}
