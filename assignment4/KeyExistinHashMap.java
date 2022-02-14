package assignment4;

import java.util.HashMap;

public class KeyExistinHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		hashmap.put(89, "Prasanna");
		hashmap.put(77, "SDET");
		hashmap.put(33, "Java");
		hashmap.put(44, "Selenium");
		hashmap.put(55, "Expert");

		boolean key1 = hashmap.containsKey(89);
		System.out.println("Key 22 exists in HashMap? : " + key1);

		boolean key2 = hashmap.containsKey(55);
		System.out.println("Key 55 exists in HashMap? : " + key2);

		boolean key3 = hashmap.containsKey(99);
		System.out.println("Key 99 exists in HashMap? : " + key3);
	}
}
