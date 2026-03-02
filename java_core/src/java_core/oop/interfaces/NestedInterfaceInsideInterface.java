package java_core.oop.interfaces;

interface OuterInterface {
	interface InnerInterface {
		void show();
	}
}

public class NestedInterfaceInsideInterface implements OuterInterface.InnerInterface {

	@Override
	public void show() {
		System.out.println("Show the details.");
	}

	public static void main(String[] args) {
		OuterInterface.InnerInterface ob = new NestedInterfaceInsideInterface();
		ob.show();
	}

}
