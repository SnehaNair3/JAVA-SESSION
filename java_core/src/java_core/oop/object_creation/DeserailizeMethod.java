package java_core.oop.object_creation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student2 implements Serializable {
	String name;

	public Student2(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + "]";
	}

}

public class DeserailizeMethod {
	public static void main(String[] args) throws ClassNotFoundException {

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student2.ser"));
			out.writeObject(new Student2("Alice"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student2.ser"));
			Student2 s = (Student2) in.readObject();
			System.out.println("Object is :" + s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
