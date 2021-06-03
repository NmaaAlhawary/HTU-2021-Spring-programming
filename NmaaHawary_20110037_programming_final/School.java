package programming;

public class School {

	public static void main(String[] args) {

		Student object = new Student("");
		System.out.println("The place of birth:");
		object.placeOfBirth = "amman";
		System.out.println(object.placeOfBirth);
		System.out.println("Your age :");
		object.setAge(10);
		System.out.println(object.getAge());
		System.out.println("Your name is :");
		object.setName("nma'a");

	}
}
