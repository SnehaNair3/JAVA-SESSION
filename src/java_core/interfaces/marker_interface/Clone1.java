package java_core.interfaces.marker_interface;

class A implements Cloneable {
	int i;

	public A(int i) {
		super();
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class Clone1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		A a = new A(1);

		A b = (A) a.clone();

		System.out.println("i value : " + b.i);
	}
}
