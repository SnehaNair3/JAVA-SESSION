package java_core.oop.abstraction;

abstract class Bank1 {
	// instance variables
	double balance = 1000;

	// constructor
	public Bank1() {
		super();
	}

	// abstract method
	abstract void deposit(double amount);

	// concrete method
	public double withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawal successful.");
		return balance;
	}

}

class Acc1 extends Bank1 {

	@Override
	void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposit successful.");

	}

}

public class AbstractClass {
	public static void main(String[] args) {
		Acc1 acc1 = new Acc1();
		acc1.deposit(800.0);
		System.out.println(acc1.withdraw(500));
	}
}
