package queue.blockingqueue.synchronousqueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronousQueueDemo {
	
	public static void main(String args[]){
		
		ExecutorService executorService = null;
		Buffer buffer = new Buffer();
		executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Producer(buffer));
		executorService.execute(new Consumer(buffer));
		executorService.isShutdown();
	}

}
