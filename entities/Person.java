package entities;

public class Person {

	private String name;
	private int age;
	private double height;
	private String email;

	public Person() {
	}

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Person(int age, double height) {
		this.age = age;
		this.height = height;
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}
	public String toString() {
		return name
			+ ", "
			+ email;
	}


}

	