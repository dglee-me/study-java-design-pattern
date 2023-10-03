package kr.co.dglee.factory;

import kr.co.dglee.vo.Cat;
import kr.co.dglee.vo.Dog;
import kr.co.dglee.vo.Pet;

public class PetFactory {

	public Pet create(Pet.Type type) throws IllegalArgumentException {
		return switch (type) {
			case DOG -> new Dog();
			case CAT -> new Cat();
			default -> throw new IllegalArgumentException("잘못된 타입입니다.");
		};
	}
}
