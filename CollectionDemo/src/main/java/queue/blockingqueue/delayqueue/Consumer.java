package queue.blockingqueue.delayqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	private BlockingQueue queue;
	public Consumer(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		int i = 0;
		while(i<10) {
			try {
				System.out.println("Consumer consumed : "+queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
