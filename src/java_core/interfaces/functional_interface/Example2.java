package java_core.interfaces.functional_interface;

@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class Example2 {
	public static void main(String[] args) {
		
		//lambda expression to define the calculate method.
		Square s = (int x) -> x * x;

		int ans = s.calculate(5);
		System.out.println("Answer is : " + ans);
	}
}
