package queue.blockingqueue.linkedblockingqueue;


public class Consumer implements Runnable {
	
	private Buffer buffer;
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		int i = 0;
		while(i<10) {
			buffer.get();
		}
	}

}
