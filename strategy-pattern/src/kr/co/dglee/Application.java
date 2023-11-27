package kr.co.dglee;

import kr.co.dglee.vo.Person;
import kr.co.dglee.vo.Sword;

public class Application {

	public static void main(String[] args) {

		// 무기가 없는 사용자 (주먹으로 공격한다.)
		Person person1 = new Person("이정화");
		person1.attack();

		// 무기가 있는 사용자 (무기로 공격한다.)
		Person person2 = new Person("이동근", new Sword());
		person2.attack();
	}
}
