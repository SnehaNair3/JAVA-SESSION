package java_core.interfaces.marker_interface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class D implements Serializable {
	String name, city;

	public D(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

}

public class Serial1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		D d = new D("Vishnu", "Sydney");

		// serialization
		FileOutputStream fos = new FileOutputStream("d.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		// deserialization
		FileInputStream fis = new FileInputStream("d.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		D d2 = (D) ois.readObject();

		System.out.println("Name : " + d2.name);
		System.out.println("City : " + d2.city);

		oos.close();
		ois.close();

		fos.close();
		fis.close();

	}
}
