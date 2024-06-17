package day1;

public class Book {
	private String name;
	private String author;
	private String publisher;
	private int year;
	private static int cnt=0;
	
	
	public Book()
	{
		this(null,null,null,0);
	}
	
	public Book(String name, String author,String publisher,int year)
	{
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year =year;
		cnt++;
				
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public static void displaycnt()
	{
		System.out.print("count : "+cnt+"\n");
	}

	public String toString()
	{
		return "Book : "+name+","+author+","+publisher+","+year+"\n";
	} 
	
	public static void swapBook(Book bk1,Book bk2)
	{
		Book temp = bk1;
		bk1 = bk2;
		bk2 = temp;
	}
	
	public static void swapBook(Book[]bk)
	{
		Book temp = bk[0];
		 bk[0] =  bk[1];
		 bk[1] = temp;
	}
}                                    

 