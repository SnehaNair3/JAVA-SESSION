package java_core.collections.map_interface.hashMap;

import java.util.HashMap;
import java.util.Map;

public class IteratingHashMap {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("Apple", "Red");
		hm.put("Orange", "orange");
		hm.put("Grapes", "Green");
		hm.put("Mango", "Yellow");
		hm.put("Kiwi", "Green");

		System.out.println("Map : " + hm);

		// Using `entrySet` and a `for-each` loop:
		for (Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println("Key : "+entry.getKey() + "  Value : " + entry.getValue());
		}
		
		System.out.println();
		
		 // Using `keySet` and a `for-each` loop:
		for(String key : hm.keySet()) {
			System.out.println("Key : "+key + "  Value : "+hm.get(key));
		}
		
		System.out.println();
		
		
		// Using `values` and a `for-each` loop:
		for(String value :  hm.values()) {
			System.out.println("Values : "+value);
		}
		
		
	}
}
