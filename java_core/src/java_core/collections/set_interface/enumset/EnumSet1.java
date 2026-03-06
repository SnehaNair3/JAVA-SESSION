package java_core.collections.set_interface.enumset;

import java.util.EnumSet;

enum Student {
	GEEK1, GEEK2, GEEK3, GEEK4;
}

public class EnumSet1 {
	public static void main(String[] args) {
		EnumSet<Student> e = EnumSet.of(Student.GEEK1, Student.GEEK3, Student.GEEK4);

		System.out.println("Enumset : " + e);
	}
}
