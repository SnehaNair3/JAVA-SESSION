package java_core.oop.constructors.object_creation_ways.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	String name;
	String city;

	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + "]";
	}

}

public class Example1 {
	public static void main(String[] args) {

		// serialization
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Employee.ser"))) {
			out.writeObject(new Employee("Alice", "Boston"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		}

		// deserialization
		try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream("Employee.ser"))) {
			Employee employee = (Employee) obj.readObject();
			System.out.println("Employee : " + employee);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
