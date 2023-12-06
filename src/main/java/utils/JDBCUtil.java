package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import utils.IgnoredByGit;

public class JDBCUtil {
	
public static Connection getConnection() throws Exception {
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			
			//Make a class called IgnoredByGit with the following static variables: 
			String url = IgnoredByGit.URL;
			String username = IgnoredByGit.USERNAME;
			String password = IgnoredByGit.PASSWORD;
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected!");
			
			return conn;
		} catch (Exception e) {System.out.println(e);}
		
		return null;
	}

}
