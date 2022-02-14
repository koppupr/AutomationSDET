package assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeysOfMapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        List<String> valueList = new ArrayList<String>(map.values());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);

    }
}