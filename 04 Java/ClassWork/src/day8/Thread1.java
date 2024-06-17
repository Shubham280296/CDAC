package day8;

public class Thread1 extends Thread{

	String name;
	public Thread1(String name) {
		this.name= name;	
	}
	
	public void run() {
		for (int ind = 0; ind < 10; ind ++) {
			System.out.println("thread1 " + ind);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

