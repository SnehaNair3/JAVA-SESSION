package java_core.oop.constructors;

class Device {
	static Device instance = null;
	public int x = 10;

	private Device() {

	}

	public static Device getInstance() {
		if (instance == null) {
			instance = new Device();
		}

		return instance;
	}

}

public class PrivateConstructor {
	public static void main(String[] args) {

		Device d1 = Device.getInstance();

		Device d2 = Device.getInstance();

		d1.x = d1.x + 10;

		System.out.println("d1 x : " + d1.x);
		System.out.println("d2 x : " + d2.x);
	}
}
