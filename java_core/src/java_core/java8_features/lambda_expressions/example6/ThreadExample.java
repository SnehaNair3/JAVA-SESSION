package java_core.java8_features.lambda_expressions.example6;

public class ThreadExample {
	public static void main(String[] args) {

		// without lambda
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println(" Runnable Without lambda");

			}
		};

		Thread t1 = new Thread(runnable);
		t1.start();

		// with lambda
		Runnable runnable2 = () -> System.out.println("Runnable with lambda");
		Thread t2 = new Thread(runnable2);
		t2.start();

	}
}
