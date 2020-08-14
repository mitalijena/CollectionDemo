package queue.blockingqueue.delayqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class MyDelayLogic implements Delayed {

	private String item;
	private long delayTime;
	
	public MyDelayLogic(String item, long delayTime) {
		this.item = item;
		this.delayTime = System.currentTimeMillis() + delayTime;
	}

	public long getDelay(TimeUnit unit) {
		long diff = delayTime - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

	public int compareTo(Delayed o) {
		if(this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)) {
			return -1;
		}
		if(this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
			return 1;
		}
		return 0;
	}
	
	public String toString() {
		return "MyDelay Logic :"+" : Item : "+item+ " : ExpiryTime : "+delayTime;
	}

}
