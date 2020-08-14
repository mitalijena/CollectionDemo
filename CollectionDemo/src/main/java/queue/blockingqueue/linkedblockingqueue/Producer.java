package queue.blockingqueue.linkedblockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private Buffer buffer;
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		int i = 0;
		while(i<10) {
			Random random = new Random();
			int data = random.nextInt(100);
			buffer.put(data);
			System.out.println("Produce produced : "+data);
			i++;
		}
	}

}
