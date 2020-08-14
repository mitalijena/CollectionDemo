package queue.blockingqueue.synchronousqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Buffer {
	
	BlockingQueue<Integer> queue = new SynchronousQueue<Integer>();
	
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
