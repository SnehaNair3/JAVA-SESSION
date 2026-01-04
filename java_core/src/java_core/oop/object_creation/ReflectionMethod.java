package java_core.oop.object_creation;

import java.lang.reflect.InvocationTargetException;

class Student {

	public Student() {
      System.out.println("Student object created.");
	}

}

public class ReflectionMethod {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		try {
			Class<?> c = Class.forName("java_core.oop.object_creation.Student");
			Student std = (Student) c.getDeclaredConstructor().newInstance();
			System.out.println(std);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}
}
