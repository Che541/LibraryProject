package com.ssc.LibraryProject;

import java.util.Scanner;

import repository.BookDAO;
import repository.BorrowedBookDAO;
import repository.BorrowerDAO;

public class Menu {
	
	public static void createMenu() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number to select option");
		System.out.println("1: Check out a book");
		System.out.println("2: Return a book");
		System.out.println("3: View all available books");
		System.out.println("4: View borrower info");
		
		int choice = scanner.nextInt();
		//scanner.close();
		
		switch(choice) {
		case 1: 
			checkOutBookOption();
			break;
		case 2: 
			returnBookOption();
			break;
		case 3: 
			BookDAO.getAllBooksWithDescriptions();
			break;
		case 4: 
			viewBorrowerInfoOption();
			break;
		default: 
			System.out.println("Invalid choice.");
		}
		createMenu();
	}
	
	public static void checkOutBookOption() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input borrower id number then hit enter:");
		int borrowerId = scanner.nextInt();
		System.out.println("Input book id number then hit enter");
		int bookId = scanner.nextInt();
		//scanner.close();
		BorrowedBookDAO.borrowBook(bookId, borrowerId);
	}
	
	public static void returnBookOption() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input book id:");
		int bookId = scanner.nextInt();
		//scanner.close();
		BorrowedBookDAO.returnBook(bookId);
	}
	
	public static void viewBorrowerInfoOption() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input borrower first name: ");
		String borrowerFirstName = scanner.next();
		System.out.println("Please input borrower last name: ");
		String borrowerLastName = scanner.next();
		//scanner.close();
		BorrowerDAO.getBorrowerWithBorrowedBooks(borrowerFirstName, borrowerLastName);
		
	}

}
