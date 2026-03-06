package java_core.enum_examples;

enum TrafficLight {
	RED, GREEN, YELLOW;
}

public class EnumExample1 {
	public static void main(String[] args) {
		TrafficLight signal = TrafficLight.GREEN;
		System.out.println(signal);
	}
}
