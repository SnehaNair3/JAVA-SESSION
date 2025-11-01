package java_core.collections.set_interface.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThreadSafeHashset {
	public static void main(String[] args) {
		Set<String> season = new HashSet<String>();

		season.add("Summer");
		season.add("Winter");
		season.add("Monsoon");
		season.add("Autumn");
		season.add("Spring");

		Set<String> synchronizedSeason = Collections.synchronizedSet(season);

		System.out.println("Set : " + synchronizedSeason);
	}
}
