package entity;

public class Borrower {
	private int borrowerId;
	private String borrowerFirstName;
	private String borrowerLastName;
	public Borrower(int borrowerId, String borrowerFirstName, String borrowerLastName) {
		super();
		this.borrowerId = borrowerId;
		this.borrowerFirstName = borrowerFirstName;
		this.borrowerLastName = borrowerLastName;
	}
	public Borrower(String borrowerFirstName, String borrowerLastName) {
		super();
		this.borrowerFirstName = borrowerFirstName;
		this.borrowerLastName = borrowerLastName;
	}
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public String getBorrowerFirstName() {
		return borrowerFirstName;
	}
	public void setBorrowerFirstName(String borrowerFirstName) {
		this.borrowerFirstName = borrowerFirstName;
	}
	public String getBorrowerLastName() {
		return borrowerLastName;
	}
	public void setBorrowerLastName(String borrowerLastName) {
		this.borrowerLastName = borrowerLastName;
	}
	@Override
	public String toString() {
		return "Borrower [borrowerId=" + borrowerId + ", borrowerFirstName=" + borrowerFirstName + ", borrowerLastName="
				+ borrowerLastName + "]";
	}
	
	
}
