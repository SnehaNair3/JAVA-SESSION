package java_core.oop.object_creation;

class Room implements Cloneable {
	String color;
	int area;

	public Room(String color, int area) {
		super();
		this.color = color;
		this.area = area;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Room [color=" + color + ", area=" + area + "]";
	}

}

public class CloneMethod {
	public static void main(String[] args) throws CloneNotSupportedException {

		Room r1 = new Room("Blue", 1000);
		System.out.println("Room 1 : " + r1);

		Room r2 = (Room) r1.clone();
		System.out.println("Room 2 : " + r2);

		System.out.println("r1 hashcode: " + r1.hashCode());
		System.out.println("r2 hashcode: " + r2.hashCode());
	}
}
