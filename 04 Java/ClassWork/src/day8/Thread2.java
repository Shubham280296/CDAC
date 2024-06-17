package day8;

public class Thread2 implements Runnable {

	String name;

	public Thread2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int ind = 0; ind < 10; ind ++) {
			System.out.println("thread2 " + ind);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
