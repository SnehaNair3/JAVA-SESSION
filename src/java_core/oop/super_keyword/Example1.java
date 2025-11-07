package java_core.oop.super_keyword;


class Vehile{
	int maxSpeed=120;
}


class Car extends Vehile{
	int maxSpeed=180;
	
	void display() {
		System.out.println("Speed is : "+super.maxSpeed);
	}
}

public class Example1 {
public static void main(String[] args) {
	Car car=new Car();
	car.display();
}
}
