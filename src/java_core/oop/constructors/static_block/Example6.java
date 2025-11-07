package java_core.oop.constructors.static_block;

public class Example6 {

	static int m;
	
	int n;
	
	static {
		m=100;
		System.out.println("Static block executed.");
	}

	public Example6() {
		System.out.println("Constructor called.");
	}
	
	
	public static void main(String[] args) {
		Example6 e61=new Example6();
		Example6 e62=new Example6();
	}
	
	
}
