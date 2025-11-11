package java_core.interfaces.marker_interface;

import java.io.Serializable;

class Bank implements Serializable {
	public Bank() {
		System.out.println("Bank object created..");
	}
}

class Account {
	public Account() {
		System.out.println("Account object created.");
	}
}

public class Marker {
public static void main(String[] args) {
	Bank bank=new Bank();
}
}
