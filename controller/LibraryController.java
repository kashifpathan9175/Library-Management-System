package com.library.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.library.model.Book;

import com.library.utility.UserInput;
public class LibraryController {
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
    	com.library.service.LibraryService library = new com.library.service.LibraryService();

    	int ch;
    	do {
			
		 
        
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            
            
            int choice = UserInput.getIntInput("Select an option");

            switch (choice) {
            
                case 1:
                {
                    System.out.println("enter title of book");
                    String title = sc.next();
                    System.out.println("enter author of book");
                    
                    String author = sc.next();
                    library.addBook(title, author);
                    System.out.println("Book added successfully!");
                    break;
                } 
                
                case 2:
                {
                	List<Book> searchResults = null;
                	String string = UserInput.getStringInput("enter book name or author name");
                	if(string !=null)
                	{
                     searchResults = library.searchBooks(string);
                	}
                    System.out.println(searchResults);
                    
                    break;
                }
                
                case 3:
                {
                	 System.out.println("Enter book id to borrow");
                	 int bookIDToBorrow = sc.nextInt();

                	 System.out.print("Enter due date in format (yyyy-MM-dd): ");
                     String userInput = sc.next();
                     
                     Date dueDate = null;
                     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                     try {
                          dueDate = dateFormat.parse(userInput);
                     } catch (ParseException e) {
                         System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                     }
                    
                     System.out.println("enter userId");
                     int userID = sc.nextInt();
                     library.borrowBook(bookIDToBorrow, userID, dueDate);
                     break;
                }
                
                case 4:
                {
                	 int bookIDToReturn = UserInput.getIntInput("Enter book ID to return");
                     library.returnBook(bookIDToReturn);
                     break;
                }
                case 5:
                {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("press 1 to continue else press 0");
            ch=sc.nextInt();
    	}
    	
    	while (ch==1);
        }
    }

