package day4;

public class Book {
	
	private int isnb;
	private String name;
	private String author;
	
	public Book(int isnb, String name, String author) {
		this.isnb = isnb;
		this.name = name;
		this.author = author;
	}

	public int getIsnb() {
		return isnb;
	}

	public void setIsnb(int isnb) {
		this.isnb = isnb;
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

	@Override
	public String toString() {
		return "Book [isnb=" + isnb + ", name=" + name + ", author=" + author + "]";
	}
		

}
