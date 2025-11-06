package java_core.oop.abstract_class;

abstract class Bank {
	abstract void deposit();
}

class Account extends Bank {
	int amount = 2000;

	@Override
	void deposit() {
		System.out.println("Deposited amount " + amount + " successfully.");
	}

}

public class AbstractExample {
	public static void main(String[] args) {
		Bank acc = new Account();
		acc.deposit();
	}
}
