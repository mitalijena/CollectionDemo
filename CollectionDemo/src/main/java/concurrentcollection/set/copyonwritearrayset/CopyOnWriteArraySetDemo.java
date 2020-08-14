package concurrentcollection.set.copyonwritearrayset;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

	public static void main(String[] args) {

		CopyOnWriteArraySet set = new CopyOnWriteArraySet();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		System.out.println("Set :" + set);
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			int val = (Integer) itr.next();
			System.out.println("Value is :" + val);
			if (val % 2 == 0) {
				//itr.remove();//is not allowed:UnsupportedOperationException
				set.add(105);// Allowed in CopyOnWriteArraList
			}
		}
	}

}
