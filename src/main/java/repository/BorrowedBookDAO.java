package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import utils.JDBCUtil;

public class BorrowedBookDAO {
	
	
	public static void borrowBook(int bookId, int borrowerId) {
		
		try {
			Connection con = JDBCUtil.getConnection();
			
			long millis = System.currentTimeMillis();
			Date checkOutDate = new Date(millis);
			//Add 8 days for due date.
			Date dueDate = new Date(checkOutDate.getTime() + (1000 * 60 * 60 * 24 * 8));
			
			String query = "INSERT INTO borrowed_book (BookID, BorrowerID, CheckOutDate, DueDate) VALUES (?, ?, ?, ?)";
			PreparedStatement posted = con.prepareStatement(query);
			posted.setInt(1, bookId);
			posted.setInt(2, borrowerId);
			posted.setDate(3, checkOutDate);
			posted.setDate(4, dueDate);
			posted.executeUpdate();
		} catch (Exception e) {System.out.println(e);}
		finally {System.out.println("Book checked out.");};
	}
	
	public static void returnBook(int borrowedBookId) {
		try {
			Connection con = JDBCUtil.getConnection();
			
			long millis = System.currentTimeMillis();
			Date returnedDate = new Date(millis);
		
			String query = "UPDATE borrowed_book SET ReturnedDate = ? WHERE BorrowedBookID = ?";
			PreparedStatement posted = con.prepareStatement(query);
			posted.setDate(1, returnedDate);
			posted.setInt(2, borrowedBookId);
			posted.executeUpdate();
		} catch (Exception e) {System.out.println(e);}
		finally {System.out.println("Book returned.");};
	}
}
