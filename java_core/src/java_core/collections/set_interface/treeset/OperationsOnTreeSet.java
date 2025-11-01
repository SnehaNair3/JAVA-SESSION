package java_core.collections.set_interface.treeset;

import java.util.Set;
import java.util.TreeSet;

public class OperationsOnTreeSet {
	public static void main(String[] args) {
		TreeSet<String> planets = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

		planets.add("Earth");
		planets.add("Mercury");
		planets.add("Venus");
		planets.add("Mars");
		planets.add("Jupiter");

		System.out.println("Set : " + planets);
		System.out.println("Size of treeset : " + planets.size());

		System.out.println("Pluto exists : " + planets.contains("Pluto"));
		System.out.println("Mars exists : " + planets.contains("mars"));

		System.out.println("First element : " + planets.first());
		System.out.println("Last element : " + planets.last());

		System.out.println("higher element than venus: " + planets.higher("venus"));
		System.out.println("higher element than jupiter: " + planets.higher("jupiter"));
		System.out.println("lower element than venus: " + planets.lower("venus"));

		System.out.println("Removing jupiter : " + planets.remove("jupiter"));
		System.out.println("Removing venus : " + planets.removeIf(planet -> planet.startsWith("V")));
		System.out.println("Set : " + planets);
		System.out.println("Removing first element : " + planets.pollFirst());
		System.out.println("Removing last element : " + planets.pollLast());

		System.out.println("Contains Mars : " + planets.contains("Mars"));
		System.out.println("Set : "+planets);
	}
}
