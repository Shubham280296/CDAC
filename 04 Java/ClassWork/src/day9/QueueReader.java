package day9;

import java.util.concurrent.BlockingQueue;

public class QueueReader implements Runnable{
	
	BlockingQueue<String> queue;
	
	public QueueReader(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		for(int i=0;i<5;i++)
		{
			String value = queue.poll();
			System.out.println("Thread"+name+"added element"+value);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
