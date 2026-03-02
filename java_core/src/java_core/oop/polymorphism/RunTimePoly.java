package java_core.oop.polymorphism;

class Payment {
	void pay() {
		System.out.println("Paying..");
	}
}

class CreditCard extends Payment {
	void pay() {
		System.out.println("Paid using credit card.");
	}
}

class Upi extends Payment {
	void pay() {
		System.out.println("Paid using UPI.");
	}
}

class Cash extends Payment {
	void pay() {
		System.out.println("Paid using cash.");
	}
}

public class RunTimePoly {
	public static void main(String[] args) {
		Payment p;

		p = new CreditCard();
		p.pay();

		p = new Upi();
		p.pay();

		p = new Cash();
		p.pay();
	}
}
