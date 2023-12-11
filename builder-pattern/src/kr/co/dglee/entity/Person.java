package kr.co.dglee.entity;

public class Person {

	private String name;

	private int age;

	private String birthday;

	private String address;

	private String job;

	public Person() {

	}

	private Person(Builder builder) {

		this.name = builder.name;
		this.age = builder.age;
		this.birthday = builder.birthday;
		this.address = builder.address;
		this.job = builder.job;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setAge(int age) {

		if (age < 0) {
			throw new IllegalArgumentException("age must be greater than 0");
		}
		this.age = age;
	}

	public void setBirthday(String birthday) {

		this.birthday = birthday;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public void setJob(String job) {

		this.job = job;
	}

	public static Builder builder() {

		return new Builder();
	}

	@Override
	public String toString() {

		return "name: " + name + ", age: " + age + ", birthday: " + birthday + ", address: " + address + ", job: " + job;
	}

	public static class Builder {

		private String name;

		private int age;

		private String birthday;

		private String address;

		private String job;

		private Builder() {

		}

		public Builder name(String name) {

			this.name = name;
			return this;
		}

		public Builder age(int age) {

			if (age < 0) {
				throw new IllegalArgumentException("age must be greater than 0");
			}
			this.age = age;
			return this;
		}

		public Builder birthday(String birthday) {

			this.birthday = birthday;
			return this;
		}

		public Builder address(String address) {

			this.address = address;
			return this;
		}

		public Builder job(String job) {

			this.job = job;
			return this;
		}

		public Person build() {

			return new Person(this);
		}
	}
}
