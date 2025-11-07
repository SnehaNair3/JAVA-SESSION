package java_core.oop.constructors.initialization_block;

class Bank {
	// class memeber variable
	int amount;

	public Bank() {
		System.out.println("Bank default constructor called.");
		System.out.println("Amount is : " + amount);
	}

	// init block
	{
		amount = 5000;
		System.out.println("Common amount for all banks");
	}

}

public class Example3 {
	public static void main(String[] args) {
		Bank bank = new Bank();
	}
}
