package kr.co.dglee.vo;

public class KakaoUser implements User {

	@Override
	public void signup() {
		System.out.println("카카오 회원가입을 진행합니다.");
	}

	@Override
	public void whoami() {
		System.out.println("카카오 유저입니다.");
	}
}
