package queue.blockingqueue.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Buffer {
	
	BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(5);
	
	public void get() {
		try {
			System.out.println("Consumer consumed :"+queue.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void put(int data) {
		try {
			queue.put(data);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
