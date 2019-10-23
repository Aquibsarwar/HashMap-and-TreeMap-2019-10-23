package HashMap.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		Map<String, Integer> motorbikes = new HashMap<>();
		
		motorbikes.put("Kawasaki", 1);
		motorbikes.put("Yamaha", 2);
		motorbikes.put("Honda", 3);
		motorbikes.put("Hero", 4);
		
		System.out.println("バイクの総数：" +motorbikes.size());


	for(String key:motorbikes.keySet()) {
		System.out.println(motorbikes.get(key)+"-"+key);
		
	}
		
	String searchkey = "Kawasaki";
	if(motorbikes.containsKey(searchkey))
		System.out.println("総数: "+motorbikes.get(searchkey)+" "+ searchkey+" bike");

	System.out.println("ツリーのサイズ： "+motorbikes.size());
	
	}

	
}
