package com.library.model;

import java.util.Date;

public class BorrowingRecord {

	private int recordID;
    private int bookID;
    private int userID;
    private Date borrowingDate;
    private Date dueDate;
	
    public BorrowingRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BorrowingRecord(int recordID, int bookID, int userID, Date borrowingDate, Date dueDate) {
		super();
		this.recordID = recordID;
		this.bookID = bookID;
		this.userID = userID;
		this.borrowingDate = borrowingDate;
		this.dueDate = dueDate;
	}
	public int getRecordID() {
		return recordID;
	}
	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public Date getBorrowingDate() {
		return borrowingDate;
	}
	public void setBorrowingDate(Date borrowingDate) {
		this.borrowingDate = borrowingDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "BorrowingRecord [recordID=" + recordID + ", bookID=" + bookID + ", userID=" + userID
				+ ", borrowingDate=" + borrowingDate + ", dueDate=" + dueDate + "]";
	}
    
    
}
