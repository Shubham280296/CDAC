package day1;

public class User {

	public static void main(String[] args) {
		Book bk1 = new Book();
		Book bk2 = new Book("AA","BB","CC",2001);
				
		System.out.print(bk2.getName()+"\n");
		System.out.print(bk1.toString()+"\n");
		Book.displaycnt();
		
		Book.swapBook(bk1,bk2);
		System.out.print("Swap by value : \n"+bk1+"\n"+bk2+"\n");
		
		
		Book[]bk = {bk1,bk2};
		System.out.print("Swap by array : before swap : \n"+bk[0]+"\n"+bk[1]+"\n");
		Book.swapBook(bk);
		System.out.print("Swap by array : after swap : \n"+bk[0]+"\n"+bk[1]);
	}

}
