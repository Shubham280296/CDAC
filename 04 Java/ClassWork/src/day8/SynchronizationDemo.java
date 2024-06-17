package day8;

public class SynchronizationDemo {
	public static void main(String[] args)
	{
		//Counter c =new Counter();
		AtomicCounter c =new AtomicCounter();
		
		Thread one = new Thread (new Runnable() {
			@Override
			public void run() {
				//synchronized(c) {
					for (int ind = 0; ind < 10; ind ++) {
						int count = c.increment();
						System.out.println(Thread.currentThread().getName()+ ":" +count);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
			//}
		});
		
		
		
		Thread two = new Thread (new Runnable() {
			@Override
			public void run() {
				//synchronized(c) {
					for (int ind = 0; ind < 10; ind ++) {
						int count = c.increment();
						System.out.println(Thread.currentThread().getName()+ ":" +count);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
			//}
		});
		
		one.start();
		two.start();
		
	}

}
