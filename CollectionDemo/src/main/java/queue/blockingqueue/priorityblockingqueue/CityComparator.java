package queue.blockingqueue.priorityblockingqueue;

import java.util.Comparator;

public class CityComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}
