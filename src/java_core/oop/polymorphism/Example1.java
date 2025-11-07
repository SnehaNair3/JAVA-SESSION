package java_core.oop.polymorphism;

public class Example1 {
	int balance = 5000;
	double interest = 0.5;

	void deposit(int amount) {
		System.out.println("Deposited " + amount + " successfully.");
		System.out.println("Available balance is : " + (balance + amount));
	}

	void deposit(int amount, double interest) {
		System.out.println("Deposited " + amount + " successfully.");
		System.out.println("Interest is : " + interest);
	}

	public static void main(String[] args) {
		Example1 e1 = new Example1();
		e1.deposit(500);
		e1.deposit(100, 1.2);
	}
}
