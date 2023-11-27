package kr.co.dglee.vo;

public class Sword implements Weapon {

	public Sword() {

	}

	@Override
	public void attack() {

		System.out.println("칼로 공격한다.");
	}
}
