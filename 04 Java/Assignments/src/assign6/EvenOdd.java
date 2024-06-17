package assign6;

public class EvenOdd {

	public static void main(String[] args) {
		Threadeveodd evenodd = new Threadeveodd();
		Thread t1 = new Thread(evenodd,"odd");
		Thread t2 = new Thread(evenodd,"even");
		
		t1.start();
		t2.start();
	}
}
