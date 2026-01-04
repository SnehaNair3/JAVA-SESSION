package java_core.oop.object_methods;

public class Books implements Cloneable {

	private String t;
	private String a;
	private int y;

	public Books(String t, String a, int y) {
		super();
		this.t = t;
		this.a = a;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Books : " + t + "" + a + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
//		Books other = (Books) obj;
//
//		return this.t.equals(other.getT()) && this.a.equals(other.getA()) && this.y == other.getY();
		
		return this.hashCode() == obj.hashCode();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Books b1 = new Books("The Alchemist", "Paulo coelho", 2015);
		System.out.println(b1);

		// create a clone
		Books b2 = (Books) b1.clone();
		System.out.println(b2);

		// reference
		Books b3 = b1;
		System.out.println("b3 : " + b3);
		System.out.println("b1 equals b3 : " + b1.equals(b3));

		//new obj with the same content
		Books b4 = new Books("The Alchemist", "Paulo coelho", 2015);
		System.out.println("b1 equals b4 : " + b1.equals(b4));

		// check if 2 objects are equal
		System.out.println("b1 equals b2 : " + b1.equals(b2));

		// get hashcode of 2 objects
		System.out.println("b1 hashcode : " + b1.hashCode());
		System.out.println("b2 hashcode : " + b2.hashCode());
		System.out.println("b3 hashcode : " + b3.hashCode());
		System.out.println("b4 hashcode : " + b4.hashCode());
	}
}
