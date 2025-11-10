package java_core.oop.constructors.object_creation_ways.reflection;

import java.lang.reflect.InvocationTargetException;

class Student {
	String name, city;

	public Student() {
		super();
		name = "Arya";
		city = "Seoul";
	}

}

public class Example1 {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("java_core.oop.constructors.object_creation_ways.reflection.Student");
			Student s2 = (Student) c.getDeclaredConstructor().newInstance();
			System.out.println("Object created : " + s2);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		} catch (InstantiationException e) {
			System.out.println("Instantiation failed.");
		} catch (IllegalAccessException e) {
			System.out.println("Illegal access.");
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal argument");
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.out.println("No such method.");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
