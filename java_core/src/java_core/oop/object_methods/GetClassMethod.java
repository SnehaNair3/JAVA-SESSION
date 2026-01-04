package java_core.oop.object_methods;

public class GetClassMethod {

	public static void main(String[] args) {
		Object o = new String("Hello");

		Class c = o.getClass();

		System.out.println("Class of the object is : " + c);
		System.out.println("Class of the object is : " + c.getName());
		System.out.println("Class of the object is : " + c.getModifiers());
		System.out.println("Class of the object is : " + c.getTypeName());
	}
}
