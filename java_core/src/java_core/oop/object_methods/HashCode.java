package java_core.oop.object_methods;

import java.util.Objects;

class Product {
	int id = 101;

	@Override
	public int hashCode() {
		return id*31;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}

}

public class HashCode {

	public static void main(String[] args) {
		Product product = new Product();

		System.out.println(product.hashCode());
	}
}
