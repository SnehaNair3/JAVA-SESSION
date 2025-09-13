package problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 4, 2, 5, 3, 4, 6,8,6 };

		Set<Integer> seen = new HashSet<Integer>();
		Set<Integer> dup = new HashSet<Integer>();

		for (int v : arr) {
			if (!seen.add(v)) {
				dup.add(v);
			}
		}
		System.out.println(dup);
	}
}
