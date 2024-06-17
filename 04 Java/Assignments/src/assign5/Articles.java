package assign5;

public class Articles implements Comparable<Articles> {

	private String articlename;
	private int year;
	private String subject;
	private int views;
	
	public Articles(String articlename, int year, String subject, int views) {
		super();
		this.articlename = articlename;
		this.year = year;
		this.subject = subject;
		this.views = views;
	}

	public String getArticlename() {
		return articlename;
	}

	public void setArticlename(String articlename) {
		this.articlename = articlename;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Articles [articlename=" + articlename + ", year=" + year + ", subject=" + subject + ", views=" + views
				+ "]";
	}

	@Override
	public int compareTo(Articles o1) {
		return this.getSubject().compareTo(o1.getSubject());
	}

}
