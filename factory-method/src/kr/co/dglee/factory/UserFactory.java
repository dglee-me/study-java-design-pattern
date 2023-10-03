package kr.co.dglee.factory;

import kr.co.dglee.vo.User;

public abstract class UserFactory {

	public User createInstance() {
		User user = createUser();
		user.signup();
		return user;
	}

	protected abstract User createUser();
}
