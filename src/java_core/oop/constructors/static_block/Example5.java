package java_core.oop.constructors.static_block;

public class Example5 {

	static int i;
	
	int j;
	
	static
	{
		i=10;
		System.out.println("Static block called.");
	}
	
	public static void main(String[] args) {
		
		System.out.println(Example5.i);
	}
	
}
