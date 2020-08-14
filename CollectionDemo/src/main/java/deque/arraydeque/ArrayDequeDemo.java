package deque.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("B");
		deque.add("C");
		deque.add("D");
		deque.add("E");
		
		deque.offer("F");
		deque.offerFirst("A");
		deque.offerLast("Z");
		
		Iterator<String> itr = deque.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//removes and returns the head element
		//returns null if deque is empty
		System.out.println("Polled element : "+deque.poll());
		
		for(String str : deque) {
			System.out.println(str);
		}
		
		//returns the head element without removing
		//exception if deque is empty
		System.out.println("Element method : "+deque.element());
		
		for(String str : deque) {
			System.out.println(str);
		}
		
		//Clears the deque
		deque.clear();
		
		//returns the head element without removing
		//returns null if deque is empty
		System.out.println("Peek method : "+deque.peek());
		
		for(String str : deque) {
			System.out.println(str);
		}
	}

}
