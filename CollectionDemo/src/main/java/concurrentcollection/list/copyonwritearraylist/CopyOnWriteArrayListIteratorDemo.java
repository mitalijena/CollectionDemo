package concurrentcollection.list.copyonwritearraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListIteratorDemo {
	
	static CopyOnWriteArrayList list = new CopyOnWriteArrayList();
	
	public static void main(String[] args) throws InterruptedException {		
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		System.out.println("List :"+list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			int val = (Integer) itr.next();
			System.out.println("Value is :"+val);
			if(val % 2 == 0) {
				//itr.remove();//is not allowed:UnsupportedOperationException
				list.add(105);//Allowed in CopyOnWriteArraList
			}
		}
	}

}
