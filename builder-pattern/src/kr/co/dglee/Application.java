package kr.co.dglee;

import kr.co.dglee.entity.Person;

public class Application {

	public static void main(String[] args) {

		// Java Bean Pattern
		Person person = new Person();
		person.setName("홍길동");
		person.setAge(20);
		person.setBirthday("1990-01-01");
		person.setAddress("서울시 강남구");
		person.setJob("개발자");

		System.out.println(person);

		// Builder Pattern
		Person person2 = Person.builder().name("이동근")
										 .age(30)
										 .birthday("1993-02-04")
										 .address("OO시")
										 .job("백수")
										 .build();

		System.out.println(person2);
	}
}
