package java_core.interfaces.functional_interface;

public class Main {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("New thread created.")).start();

	}
}

//Runnable has one abstract method run().so it qualifies as a functional intreface.
//() -> syso("new thread created") defines the run method.

//a functional interface can extend another functional interface.