package concurrentcollection.list.copyonwritearraylist;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("Mitali");
		System.out.println("Original list :"+list);
		
		list.add("Mitali");
		System.out.println("List after add method with same object :"+list);
		
		//Adds object if its not present
		list.addIfAbsent("Mitali");
		System.out.println("List after addIfAbsent method with same object :"+list);
		list.addIfAbsent("Manoj");
		System.out.println("List after addIfAbsent method with different object :"+list);
		
		//Add all objects from a collection only if the objects are not present in the list
		ArrayList list1 = new ArrayList();
		list1.add("Jane");
		list1.add("Doe");
		list1.add("Manoj");
		list.addAllAbsent(list1);
		System.out.println("List after addAllAbsent method :"+list);
	}

}
