package com.library.model;

public class Book {

	private int bookID;
    private String title;
    private String author;
    private boolean isAvailable = true;
	
    public Book()
    {
		super();
	}
	public Book(int bookID, String title, String author) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean getisAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable
				+ "]";
	}
    
    
}
