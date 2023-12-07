package entity;

public class BookDescription {
	private int bookDescId;
	private String title;
	private String author;
	private String genre;
	private String summary;
	private String ISBN;
	
	public BookDescription(int bookDescId, String title, String genre, String summary, String iSBN) {
		super();
		this.bookDescId = bookDescId;
		this.title = title;
		this.genre = genre;
		this.summary = summary;
		ISBN = iSBN;
	}

	public BookDescription(String title, String author, String genre, String summary, String iSBN) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.summary = summary;
		ISBN = iSBN;
	}

	public int getBookDescId() {
		return bookDescId;
	}

	public void setBookDescId(int bookDescId) {
		this.bookDescId = bookDescId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "BookDescription [bookDescId=" + bookDescId + ", title=" + title + ", author=" + author + ", genre=" + genre + ", summary="
				+ summary + ", ISBN=" + ISBN + "]";
	}

}
