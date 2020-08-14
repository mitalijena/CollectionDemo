package deque.blockingdeque.linkedblockingdeque;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingDequeDemo {

	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<String>();
		deque.add("B");
		deque.add("C");
		deque.add("D");
		deque.add("E");		
		System.out.println("LinkedBlockingQueue :"+deque);
		
		//adds element in head of the deque
		deque.addFirst("addFirst");
		System.out.println("LinkedBlockingQueue after addFirst method :"+deque);
		
		//adds element in the head of the deque
		deque.offerFirst("offerFirst");
		System.out.println("LinkedBlockingQueue after offerFirst method :"+deque);
		
		//adds element in the head of the deque
		deque.putFirst("putFirst");
		System.out.println("LinkedBlockingQueue after putFirst method :"+deque);
		
		//adds element in the head of the deque
		deque.offerFirst("message", 1000, TimeUnit.MILLISECONDS);
		System.out.println("LinkedBlockingQueue after offerFirst method :"+deque);
		
}

}
