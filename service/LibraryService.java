package com.library.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.library.model.Book;
import com.library.model.BorrowingRecord;

public class LibraryService {
    
	private List<Book> books;
    private List<BorrowingRecord> borrowingRecords;
    private int nextBookID = 1;
    private int nextRecordID = 1;

    public LibraryService() {
        books = new ArrayList<>();
        borrowingRecords = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book newBook = new Book(nextBookID++, title, author);
        books.add(newBook);
    }

    public List<Book> searchBooks(String bookname) {
        List<Book> search = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(bookname.toLowerCase()) || 
                book.getAuthor().toLowerCase().contains(bookname.toLowerCase())) {
            	search.add(book);
            }
        }
        return search;
    }
    
    

    public void borrowBook(int bookID, int userID, Date dueDate) {
        Book bookToBorrow = getBookByID(bookID);
     
        if (bookToBorrow != null && bookToBorrow.getisAvailable()) {
            bookToBorrow.setAvailable(false);
            borrowingRecords.add(new BorrowingRecord(nextRecordID++, bookID, userID, new Date(), dueDate));
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    public void returnBook(int bookID) {
        Book bookToReturn = getBookByID(bookID);
        if (bookToReturn != null && !bookToReturn.getisAvailable()) {
            bookToReturn.setAvailable(true);
            updateBorrowingRecord(bookID);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Invalid book ID or book is already available.");
        }
    }

    private Book getBookByID(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    private void updateBorrowingRecord(int bookID) {
        for (BorrowingRecord record : borrowingRecords) {
            if (record.getBookID() == bookID) {
                record.setDueDate(new Date());
                return;
            }
        }
    }

}
