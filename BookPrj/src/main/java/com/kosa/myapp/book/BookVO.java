package com.kosa.myapp.book;

import java.util.Arrays;

public class BookVO {
	private int bookId;
	private String bookTitle;
	private byte[] bookImage;
	private String bookAuthor;
	private int bookPrice;
	private String locationId;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public byte[] getBookImage() {
		return bookImage;
	}
	public void setBookImage(byte[] bookImage) {
		this.bookImage = bookImage;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	@Override
	public String toString() {
		return "BookVO [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookImage=" + Arrays.toString(bookImage)
				+ ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice + ", locationId=" + locationId + "]";
	}
	
	
}
