package queue.blockingqueue.delayqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DelayQueueDemo {
	
	public static void main(String args[]){
		
		long delayTime = 2000;
		BlockingQueue<MyDelayLogic> queue = new DelayQueue<MyDelayLogic>();
		ExecutorService executorService = null;
		executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Producer(queue));
		executorService.execute(new Consumer(queue));
		executorService.isShutdown();
	}

}
