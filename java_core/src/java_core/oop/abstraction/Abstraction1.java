package java_core.oop.abstraction;

abstract class Atm {

	double balance = 500.0;

	abstract void deposit(double amount);

	abstract void withdraw(double amount);

	abstract double findBalance();
}

class Account extends Atm {

	@Override
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited " + amount + " successfully.");
		System.out.println("Balance is : " + balance);

	}

	@Override
	void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawed " + amount + " successfully.");
		System.out.println("Balance is : " + balance);

	}

	@Override
	double findBalance() {

		return balance;
	}

}

public class Abstraction1 {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.deposit(100.0);
		acc.withdraw(50.0);
	}
}
