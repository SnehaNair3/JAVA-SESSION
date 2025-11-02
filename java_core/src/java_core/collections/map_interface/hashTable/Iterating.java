package java_core.collections.map_interface.hashTable;

import java.util.Hashtable;
import java.util.Map;

public class Iterating {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

		ht.put("one", 1);
		ht.put("two", 2);
		ht.put("three", 3);
		ht.put("four", 4);

		System.out.println("table : " + ht);
		
		
		//iterating 
		for(Map.Entry<String, Integer> e : ht.entrySet()) {
			System.out.println("Key : "+e.getKey()  +  "  Value : "+e.getValue());
		}
		
		//modification while iterating
		for(String key : ht.keySet()) {
			System.out.println("Key : "+key + "  Value : "+ht.get(key));
			
			ht.put("four", 8);
		}
		
		System.out.println("Modfied hashtable : "+ht);
	}
}
