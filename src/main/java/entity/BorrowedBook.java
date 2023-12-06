package entity;

import java.sql.Date;

public class BorrowedBook {
	
	private int borrowedBookId;
	private int borrowerId;
	private Date checkOutDate;
	private Date dueDate;
	private Date returnedDate;
	
	public BorrowedBook(int borrowedBookId, int borrowerId, Date checkOutDate, Date dueDate) {
		super();
		this.borrowedBookId = borrowedBookId;
		this.borrowerId = borrowerId;
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
	}

	public BorrowedBook(int borrowerId, Date checkOutDate, Date dueDate) {
		super();
		this.borrowerId = borrowerId;
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
	}

	public int getBorrowedBookId() {
		return borrowedBookId;
	}

	public void setBorrowedBookId(int borrowedBookId) {
		this.borrowedBookId = borrowedBookId;
	}

	public int getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}

	@Override
	public String toString() {
		return "BorrowedBook [borrowedBookId=" + borrowedBookId + ", borrowerId=" + borrowerId + ", checkOutDate="
				+ checkOutDate + ", dueDate=" + dueDate + ", returnedDate=" + returnedDate + "]";
	}
	
}
