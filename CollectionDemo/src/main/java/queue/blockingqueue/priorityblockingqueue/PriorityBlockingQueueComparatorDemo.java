package queue.blockingqueue.priorityblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final BlockingQueue<String> queue = new PriorityBlockingQueue<String>(5, new CityComparator());
		final String[] cityNames = {"Mumbai","Delhi","Ahmedabad","Bhubaneswar","Ranchi","Patna","Chandigarh","Kolkata","Chennai","Bengaluru"};
	
		new Thread() {
			@Override
			public void run() {
				for(int i=0;i<cityNames.length;i++) {
					try {
						System.out.println("Consumer consumed : "+queue.take());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				for(int i=0;i<cityNames.length;i++) {
					try {
						queue.put(cityNames[i]);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}