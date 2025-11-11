package java_core.interfaces.nested_interfaces;

class Bank {
	interface Account {
		void display();
	}
}

class MyAccount implements Bank.Account {

	@Override
	public void display() {
		System.out.println("Hi ! , Welcome to SBI Bank");

	}

}

public class Example3 {
	public static void main(String[] args) {
		Bank.Account obj = new MyAccount();
		obj.display();
	}
}
