package java_core.oop.interfaces.Comparable_comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student3 {
	String name;
	int age;

	public Student3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student3> {

	@Override
	public int compare(Student3 o1, Student3 o2) {
		return o1.age - o2.age;
	}

}

public class Example1 {
	public static void main(String[] args) {
		List<Student3> list = Arrays.asList(new Student3("Maya", 20), new Student3("Hari", 25),
				new Student3("Priya", 19));
		Collections.sort(list, new AgeComparator());
		System.out.println(list.get(0).age);
		System.out.println(list.get(1).age);
	}
}
