package assign6;

public class AddTable {

	public static void main(String[] args) {
		ThreadaddTable addTable = new ThreadaddTable();
		Thread t1 = new Thread(addTable,"add");
		Thread t2 = new Thread(addTable,"table");
		ThreadaddTable.n1=2;
		ThreadaddTable.n2=3;
		t1.start();
		t2.start();
	}
}
