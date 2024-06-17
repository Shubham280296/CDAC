package day9;

public class Book {

	final int isbn;
	String title;
	
	public Book()
	{
		isbn = 1456;
		title = "Java";
	}
	
	public Book(int isbn,String title)
	{
		this.isbn = isbn;
		this.title=title;
	}
	
	private void simplePrivateMethod()
	{
		System.out.println("Private Method");
	}
	
	public static void simpleStaticMethod()
	{
		System.out.println("Static Method");
	}
	
	@MyAnno(priority=1)
	public  void simpleMethod()
	{
		System.out.println("Public Method");
	}
	
	public  void setValue(int isbn,String title)
	{
		System.out.println(new Book(isbn,title).toString());
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + "]";
	}	
	
}
