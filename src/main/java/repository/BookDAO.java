package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utils.JDBCUtil;

public class BookDAO {
	
	public static void createBook(int newBookDescId) throws Exception{
		try {
			Connection con = JDBCUtil.getConnection();
			String query = "INSERT INTO book (BookDescID) VALUES (?)";
			PreparedStatement posted = con.prepareStatement(query);
			posted.setInt(1, newBookDescId);
			posted.executeUpdate();
		} catch (Exception e) {System.out.println(e);}
		finally {System.out.println("Book created.");};
	}
	
	public static void getAllBooksWithDescriptions() throws Exception{
		try {
			Connection con = JDBCUtil.getConnection();
			String query = "SELECT * FROM Book JOIN Book_Description on Book.BookDescriptionID = BookDescription.BookDescriptionID";
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				System.out.print(result.getInt("BookID"));
				System.out.print(" ");
				System.out.print(result.getInt("BookDescriptionID"));
				System.out.print(" ");
				System.out.print(result.getString("Title"));
				System.out.print(" ");
				System.out.print(result.getString("Genre"));
				System.out.println();
			}
			
		} catch (Exception e) {System.out.println(e);}
	}
	
	
	
	
	public static void deleteBook(int bookId) throws Exception{
		try {
			Connection con = JDBCUtil.getConnection();
			String query = "DELETE FROM book WHERE BookID = ?";
			PreparedStatement posted = con.prepareStatement(query);
			posted.setInt(1, bookId);
			posted.executeQuery();
		} catch (Exception e) {System.out.println(e);}
		finally {System.out.println("Book deleted.");};
	}
	

}
