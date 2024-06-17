package day4;
import java.util.ArrayList;
import java.util.List;


public class Library {
	List<Book> books;
	
	public Library(List<Book> books)
	{
		this.books = books;
	}
	
	public void addBook(Book b) throws DuplicateBookException
	{
		for (Book bb:books)
		{
			if (bb.getIsnb()==b.getIsnb())
			{
				throw new DuplicateBookException("Book already exists");
			}
		}
		books.add(b);
	}
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book(1233456,"AAA","BBB"));
		books.add(new Book(1233456,"AAA","BBB"));
		
		Library lib = new Library(books);
		try {
				lib.addBook(new Book(1233456,"AAA","BBB"));
		}
		catch(DuplicateBookException e)
		{	
			System.out.print(e);
		}
	}

}
