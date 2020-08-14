package queue.blockingqueue.linkedblockingqueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LinkedBlockingQueueDemo {
	
	public static void main(String args[]) {
		
		ExecutorService executorService = null;
		executorService = Executors.newFixedThreadPool(2);
		Buffer buffer = new Buffer();
		executorService.execute(new Producer(buffer));
		executorService.execute(new Consumer(buffer));
		executorService.shutdown();
	}

}
