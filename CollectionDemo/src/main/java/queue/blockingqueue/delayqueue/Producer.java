package queue.blockingqueue.delayqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private BlockingQueue queue;
	long delay = 2000;
	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		int i = 0;
		while(i<10) {
			Random random = new Random();
			int data = random.nextInt(100);
			try {
				queue.put(new MyDelayLogic("Item"+data, delay));
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Produce produced : "+data);
			i++;
		}
	}

}
