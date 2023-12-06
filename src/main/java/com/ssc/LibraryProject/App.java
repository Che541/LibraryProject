package com.ssc.LibraryProject;

import java.sql.Connection;
import java.sql.DriverManager;
import utils.JDBCUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        JDBCUtil.getConnection();
    }
    
	
    
}
