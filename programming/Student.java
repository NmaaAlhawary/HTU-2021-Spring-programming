package programming;

public class Student {
	private String name;
	private int age;
	public String placeOfBirth;

	public Student(String placeOfBirth) {

		this.placeOfBirth = placeOfBirth;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
}
