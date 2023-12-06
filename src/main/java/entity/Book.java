package entity;

public class Book {
	private int bookId;
	private int bookDescId;
	
	public Book(int bookId, int bookDescId) {
		super();
		this.bookId = bookId;
		this.bookDescId = bookDescId;
	}

	public Book(int newBookDescId) {
		bookDescId = newBookDescId;
	}
	
	public int getBookId() {
		return this.bookId;
	}
	
	public void setBookId(int newBookId) {
		this.bookId = newBookId;
	}
	
	public int getBookDescId() {
		return this.bookDescId;
	}
	
	public void setBookDescId(int newBookDescId) {
		this.bookDescId = newBookDescId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookDescId=" + bookDescId + "]";
	}
	
}
