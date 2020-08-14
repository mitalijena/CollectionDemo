package queue.blockingqueue.priorityblockingqueue;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer>(2);
		queue.add(6);
		queue.add(4);
		queue.add(9);
		queue.add(1);
		queue.add(8);
		System.out.println("Original Queue : "+queue);
		ArrayList list = new ArrayList();
		queue.drainTo(list);
		System.out.println("List : "+list);
		System.out.println("Final Queue : "+queue);
		BlockingQueue<String> queue1 = new PriorityBlockingQueue<String>(2);
		queue1.add("zebra");
		queue1.add("Horse");
		queue1.add("Lion");
		queue1.add("Bat");
		queue1.add("Python");
		System.out.println("Original Queue : "+queue1);
		ArrayList list1 = new ArrayList();
		queue.drainTo(list1);
		System.out.println("List : "+list1);
		System.out.println("Final Queue : "+queue1);
	}

}