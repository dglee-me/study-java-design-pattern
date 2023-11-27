package kr.co.dglee.vo;

public class Person {

	public Person() {

	}

	public Person(String name) {

		this.name = name;
	}

	public Person(String name, Weapon weapon) {

		this.name = name;
		this.weapon = weapon;
	}

	private String name;

	private Weapon weapon;

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

	public void setWeapon(Weapon weapon) {

		this.weapon = weapon;
	}

	public void attack() {

		// 무기가 있을 경우 weapon.attack() 메서드를 통해 위임(delegate)한다.
		if (weapon == null) {
			System.out.println("주먹으로 공격한다.");
		} else {
			weapon.attack();
		}
	}
}
