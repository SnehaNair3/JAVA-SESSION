package java_core.collections.set_interface.treeset.user_defined;

import java.util.TreeSet;

public class PersonMain {
	public static void main(String[] args) {
		TreeSet<Person> person = new TreeSet<Person>();

		person.add(new Person("Priya", 30, "#4,Skyline,Bangalore"));
		person.add(new Person("Arjun", 25, "#4,Skyline,Delhi"));
		person.add(new Person("Nivin", 45, "#4,Skyline,Kochi"));

		System.out.println(person);
	}
}
