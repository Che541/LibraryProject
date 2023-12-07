package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utils.JDBCUtil;

public class BorrowerDAO {
	
	public static void createBorrower(String borrowerFirstName, String borrowerLastName) throws Exception{
		try {
			Connection con = JDBCUtil.getConnection();
			String query = "INSERT INTO Borrower (BorrowerFirstName, BorrowerLastName) VALUES (?, ?)";
			PreparedStatement posted = con.prepareStatement(query);
			posted.setString(1, borrowerFirstName);
			posted.setString(2, borrowerLastName);
			posted.executeUpdate();
		} catch (Exception e) {System.out.println(e);}
		finally {System.out.println("Borrower added.");};
	}
	
	
	public static void getBorrowerWithBorrowedBooks(String borrowerFirstName, String borrowerLastName) throws Exception{
		try {
			Connection con = JDBCUtil.getConnection();
			String query = "SELECT * FROM Borrower ";
			query += "JOIN Borrowed_Book ON Borrower.BorrowerID = Borrowed_Book.BorrowerID ";
			query += "JOIN Book ON Borrowed_Book.BookID = Book.BookID ";
			query += "JOIN Book_Description ON Book.BookDescID = Book_Description.BookDescID ";
			query += "WHERE Borrower.BorrowerFirstName = ? AND Borrower.BorrowerLastName = ?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, borrowerFirstName);
			statement.setString(2, borrowerLastName);
			ResultSet result = statement.executeQuery();
			System.out.print(borrowerFirstName + " " + borrowerLastName + " ");
			//System.out.println(result.getInt("borrower.BorrowerID"));
			System.out.println("Borrow History ");
			System.out.println("Book ID Title CheckOutDate DueDate ReturnedDate");
			while(result.next()) {
				System.out.print("ID: " + result.getInt("BookID"));
				System.out.print(" ");
				System.out.print("Title: " + result.getString("Title"));
				System.out.print(" ");
				System.out.print("Check Out Date: " + result.getDate("CheckOutDate"));
				System.out.print(" ");
				System.out.print("Due Date: " + result.getDate("DueDate"));
				System.out.print(" ");
				Date returnedDate = result.getDate("ReturnedDate");
				if (returnedDate != null) {
					System.out.print("Returned: " + returnedDate);
				} else {
					System.out.print("Not Returned");
				}
				System.out.println();
			}
			
		} catch (Exception e) {System.out.println(e);}
	}
	
	
	

}
