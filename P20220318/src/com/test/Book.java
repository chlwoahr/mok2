package com.test;

public class Book {
	
	private String model;
	private String bookJj ;
	private String bookCc ;
	private int bookMm ;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBookJj() {
		return bookJj;
	}
	public void setBookJj(String bookJj) {
		this.bookJj = bookJj;
	}
	public String getBookCc() {
		return bookCc;
	}
	public void setBookCc(String bookCc) {
		this.bookCc = bookCc;
	}
	public int getBookMm() {
		return bookMm;
	}
	public void setBookMm(int bookMm) {
		this.bookMm = bookMm;
	}
	public String bookInFo() {
		String r = this.getModel() + this.getBookCc() + this.getBookMm();
		return r;
		
	}
}
