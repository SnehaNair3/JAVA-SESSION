package java_core.arrays.arrays_of_objects;

public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[3];

		students[0] = new Student("Sneha", 20, "Bangalore");
		students[1] = new Student("Arya", 18, "Kochi");
		students[2] = new Student("Manu", 36, "Noida");

		for (Student s : students) {
			System.out.println(s);
		}
	}
}
