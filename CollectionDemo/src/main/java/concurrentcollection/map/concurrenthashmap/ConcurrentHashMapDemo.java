package concurrentcollection.map.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap map = new ConcurrentHashMap();
		map.put("Mitali", "Jena");
		System.out.println("Original Map : "+map);
		
		//put the entry if key is not already present
		map.putIfAbsent("Manoj", "Kotian");
		System.out.println("Map after putIfAbsent method successful : "+map);
		
		//put the entry if key is not already present
		map.putIfAbsent("Mitali", "Kotian");
		System.out.println("Map after putIfAbsent method : "+map);
		
		//remove if both key-value combination is present
		map.remove("Jane", "Doe");
		System.out.println("Map after remove1 method : "+map);
		
		//remove if both key-value combination is present
		map.remove("Mitali", "Jena");
		System.out.println("Map after remove2 method : "+map);
		
		//remove if both key-value combination is present
		map.remove("Mitali", "Kotian");
		System.out.println("Map after remove3 method : "+map);
		
		//replace if both key-value combination is present then replaces the old-value with new-value 
		map.replace("Mitali", "Kotian", "Jena");
		System.out.println("Map after replace1 method : "+map);
		
		//replace if both key-value combination is present then replaces the old-value with new-value
		map.replace("Manoj", "Jena", "Wenger");
		System.out.println("Map after replace2 method : "+map);
		
		//replace if both key-value combination is present then replaces the old-value with new-value
		map.replace("Manoj", "Kotian", "Wenger");
		System.out.println("Map after replace3 method : "+map);
	}

}
