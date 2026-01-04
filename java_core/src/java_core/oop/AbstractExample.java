package java_core.oop;

abstract class B {
	abstract class C {
		abstract void fun();
	}
}

class D extends B {
	class E extends C {

		@Override
		void fun() {
			System.out.println("Playing funny games.");

		}

	}
}

public class AbstractExample {
	public static void main(String[] args) {
		D outer = new D();

		D.E inner = outer.new E();

		inner.fun();
	}
}
