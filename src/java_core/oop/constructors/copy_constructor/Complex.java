package java_core.oop.constructors.copy_constructor;

public class Complex {
	double re, im;

	public Complex(double re, double im) {
		super();
		System.out.println("Constructor called.");
		this.re = re;
		this.im = im;
	}

	// copy constructor
	Complex(Complex c) {
		this.re = c.re;
		this.im = c.im;
		System.out.println("Copy constructor called.");
	}

	@Override
	public String toString() {
		return "Complex [re=" + re + ", im=" + im + "]";
	}

	public static void main(String[] args) {
		Complex complex1 = new Complex(1.1, 2.0);
		Complex complex2 = new Complex(complex1);
		System.out.println("Complex 1 : " + complex1);
		System.out.println("Complex 2 : " + complex2);
	}
}
