package kr.co.dglee;

import kr.co.dglee.factory.KakaoUserFactory;
import kr.co.dglee.factory.NaverUserFactory;
import kr.co.dglee.vo.KakaoUser;
import kr.co.dglee.vo.NaverUser;

public class Application {

	public static void main(String[] args) {

		NaverUserFactory naverFactory = new NaverUserFactory();
		NaverUser naverUser = (NaverUser)naverFactory.createInstance();
		naverUser.whoami();

		KakaoUserFactory kakaoFactory = new KakaoUserFactory();
		KakaoUser kakaoUser = (KakaoUser)kakaoFactory.createInstance();
		kakaoUser.whoami();
	}
}
