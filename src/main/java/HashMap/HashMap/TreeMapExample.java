package HashMap.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		
		Map<String, Integer> motorbikes = new TreeMap<>();
		
		motorbikes.put("yamaha", 1);
		motorbikes.put("kawasaki", 2);
		motorbikes.put("bMW", 45);
		motorbikes.put("heroHonda", 5);
		
		for(String key : motorbikes.keySet()) {
			System.out.println(key +"-"+motorbikes.get(key));
		}
		
		
	}
}
