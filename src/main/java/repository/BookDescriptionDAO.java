package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utils.JDBCUtil;

public class BookDescriptionDAO {
	
	public static void createBookDescription(String title, String author, String genre, String summary, String ISBN) throws Exception{
		try {
			Connection con = JDBCUtil.getConnection();
			String query = "INSERT INTO book_description (Title, Author, Genre, Summary, ISBN) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement posted = con.prepareStatement(query);
			posted.setString(1, title);
			posted.setString(2, author);
			posted.setString(3, genre);
			posted.setString(4, summary);
			posted.setString(5, ISBN);
			posted.executeUpdate();
		} catch (Exception e) {System.out.println(e);}
		finally {System.out.println("Book description added.");};
	}
	
	public static void deleteBookDescription(int bookDescriptionId) throws Exception{
		try {
			Connection con = JDBCUtil.getConnection();
			String query = "DELETE FROM BookDescription WHERE BookDescriptionID = ?";
			PreparedStatement posted = con.prepareStatement(query);
			posted.setInt(1, bookDescriptionId);
			posted.executeQuery();
		} catch (Exception e) {System.out.println(e);}
		finally {System.out.println("Book description deleted.");};
	}
	

}
