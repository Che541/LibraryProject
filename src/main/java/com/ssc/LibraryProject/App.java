package com.ssc.LibraryProject;

import java.sql.Connection;
import java.sql.DriverManager;

import repository.*;
import utils.JDBCUtil;


public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        JDBCUtil.getConnection();
        
        BookDescriptionDAO.createBookDescription("Book A", "Horrow", "A scary book.", "11-112-0");
    }
    
	
    
}
