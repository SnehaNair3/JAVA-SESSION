package java_core.interfaces.nested_interfaces;

interface Country {
	void message();

	interface Parliament {
		void meeting();
	}

}

class State implements Country.Parliament {

	@Override
	public void meeting() {
		System.out.println("Meeting held on 20 December");

	}

}

public class Example4 {
	public static void main(String[] args) {
		Country.Parliament cp = new State();
		cp.meeting();
	}
}
