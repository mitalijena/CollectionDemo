package queue.blockingqueue.arrayblockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

		private BlockingQueue<String> blockingQueue;
		public Consumer(BlockingQueue<String> blockingQueue) {
			this.blockingQueue = blockingQueue;
		}

		public void run() {
			String msg = null;
			try {
				while(!(msg = blockingQueue.take()).equals("Stop")) {
					System.out.println("Consumed : "+msg);
					Thread.sleep(2000);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}

}
