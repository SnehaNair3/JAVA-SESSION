package java_core.oop.constructors.static_block;

public class Example7 {

	static {
		System.out.println("Static block 1 called.");
	}

	static int k;

	public Example7() {
		System.out.println("Constructor called.");
	}

	static {
		System.out.println("Static block 2 called");
	}
	
	static {
		k=100;
		System.out.println("Static block 3 called withvalue of k : "+k);
	}
	
	public static void main(String[] args) {
		Example7 e7=new Example7();
	}
}
