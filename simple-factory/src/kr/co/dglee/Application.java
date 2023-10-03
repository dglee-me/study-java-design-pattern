package kr.co.dglee;

import kr.co.dglee.factory.PetFactory;
import kr.co.dglee.vo.Pet;

public class Application {

	public static void main(String[] args) {

		PetFactory factory = new PetFactory();

		// 강아지
		Pet petA = factory.create(Pet.Type.DOG);
		petA.bark();

		// 고양이
		Pet petB = factory.create(Pet.Type.CAT);
		petB.bark();

		// 토끼(팩토리에서 구현하지 않았기 때문에 예외 발생)
		try {
			Pet petC = factory.create(Pet.Type.RABBIT);
			petC.bark();
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
