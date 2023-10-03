package kr.co.dglee.factory;

import kr.co.dglee.vo.NaverUser;
import kr.co.dglee.vo.User;

public class NaverUserFactory extends UserFactory {
	@Override
	protected User createUser() {
		return new NaverUser();
	}
}
