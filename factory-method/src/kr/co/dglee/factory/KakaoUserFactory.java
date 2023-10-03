package kr.co.dglee.factory;

import kr.co.dglee.vo.KakaoUser;
import kr.co.dglee.vo.User;

public class KakaoUserFactory extends UserFactory {

	@Override
	protected User createUser() {
		return new KakaoUser();
	}
}
