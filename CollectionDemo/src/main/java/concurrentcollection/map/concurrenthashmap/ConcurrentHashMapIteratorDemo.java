package concurrentcollection.map.concurrenthashmap;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapIteratorDemo {
	
	static ConcurrentHashMap map = new ConcurrentHashMap();
	
	public static void main(String[] args) throws InterruptedException {		
		map.put(100, "Mitali1");
		map.put(101, "Mitali2");
		Set entrySet = map.entrySet();
		Iterator itr = entrySet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			map.put(106, "Jene");
		}
	}

}
