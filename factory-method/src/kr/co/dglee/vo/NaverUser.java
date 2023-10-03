package kr.co.dglee.vo;

public class NaverUser implements User {

	@Override
	public void signup() {
		System.out.println("네이버 회원가입을 진행합니다.");
	}

	@Override
	public void whoami() {
		System.out.println("네이버 사용자입니다.");
	}
}
