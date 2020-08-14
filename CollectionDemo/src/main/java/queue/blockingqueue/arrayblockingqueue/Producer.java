package queue.blockingqueue.arrayblockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private BlockingQueue<String> blockingQueue;
	public Producer(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	public void run() {
		try {
			for(int i=0;i<=10;i++) {
				blockingQueue.put("Message"+i);
				System.out.println("Produced : "+"Message"+i);
			}
			blockingQueue.put("Stop");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
