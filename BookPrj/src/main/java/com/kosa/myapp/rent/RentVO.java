package com.kosa.myapp.rent;

import java.sql.Timestamp;

public class RentVO {
	private int rentId;
	private int bookId;
	private int userId;
	private Timestamp rentDate;
	private Timestamp returnDate;
	
	public int getRentId() {
		return rentId;
	}
	public void setRentId(int rentId) {
		this.rentId = rentId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Timestamp getRentDate() {
		return rentDate;
	}
	public void setRentDate(Timestamp rentDate) {
		this.rentDate = rentDate;
	}
	public Timestamp getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Timestamp returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "RentVO [rentId=" + rentId + ", bookId=" + bookId + ", userId=" + userId + ", rentDate=" + rentDate
				+ ", returnDate=" + returnDate + "]";
	}
	
	
}
