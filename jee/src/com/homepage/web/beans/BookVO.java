package com.homepage.web.beans;

import java.util.Date;

public class BookVO {
	private String bookTitle;//책이름
	private String bookWriter;//책저자
	private String bookCompany;//출판사
	private String bookCategory;//책분류
	private String serialNumber;//책식별번호
	private String rentID;//해당책을 누군가 빌려갔다면 누가 빌려갔는지 식별하기 위한 id저장 공간
	private boolean bookIsIt;//책이 도서실에 있나 없나
	private boolean bookRent;//책 빌리기 신청이 들어왓나 안들어왓나
	private boolean bookRentDateDelay;//책 빌려가고 연장을 햇나 안햇나.
	private int bookRentCount;//책 빌려간 횟수
	private Date bookMakeDate;//책 출간일
	private Date bookRentDate;//책 대여일//대여일들의 누적값에 대한 수정 필요
	private Date 
	
	
	public BookVO() {
		// TODO Auto-generated constructor stub
	}
	
	public BookVO(String bookTitle, String bookWriter) {
		// TODO Auto-generated constructor stub
		this.bookTitle=bookTitle;
		this.bookWriter=bookWriter;
	}
	
	public BookVO(String bookTitle, String bookWriter, String bookCompany) {
		// TODO Auto-generated constructor stub
		this.bookTitle=bookTitle;
		this.bookWriter=bookWriter;
		this.bookCompany=bookCompany;
	}
	
	public BookVO(String bookTitle, String bookWriter, String bookCompany, String bookCategory) {
		// TODO Auto-generated constructor stub
		this.bookTitle=bookTitle;
		this.bookWriter=bookWriter;
		this.bookCompany=bookCompany;
		this.bookCategory=bookCategory;
	}
	
	public BookVO(String bookTitle, String bookWriter, String bookCompany, String bookCategory, Date bookMakeDate, String serialNumber) {
		// TODO Auto-generated constructor stub
		this.bookTitle=bookTitle;
		this.bookWriter=bookWriter;
		this.bookCompany=bookCompany;
		this.bookCategory=bookCategory;
		this.bookMakeDate=bookMakeDate;
		this.serialNumber=serialNumber;
		
	}
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookWriter() {
		return bookWriter;
	}
	
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	
	public String getBookCompany() {
		return bookCompany;
	}
	
	public void setBookCompany(String bookCompany) {
		this.bookCompany = bookCompany;
	}
	
	public String getBookCategory() {
		return bookCategory;
	}
	
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public boolean isBookIsIt() {
		return bookIsIt;
	}
	
	public void setBookIsIt(boolean bookIsIt) {
		this.bookIsIt = bookIsIt;
	}
	
	public boolean isBookRent() {
		return bookRent;
	}
	
	public void setBookRent(boolean bookRent) {
		this.bookRent = bookRent;
	}
	
	public boolean isBookDateDelay() {
		return bookRentDateDelay;
	}
	
	public void setBookDateDelay(boolean bookDateDelay) {
		this.bookRentDateDelay = bookDateDelay;
	}
	
	public int getBookRentCount() {
		return bookRentCount;
	}
	
	public void setBookRentCount(int bookRentCount) {
		this.bookRentCount = bookRentCount;
	}
	
	public Date getBookMakeDate() {
		return bookMakeDate;
	}
	
	public void setBookMakeDate(Date bookMakeDate) {
		this.bookMakeDate = bookMakeDate;
	}
	
	public Date getBookRentDate() {
		return bookRentDate;
	}
	
	public void setBookRentDate(Date bookRentDate) {
		this.bookRentDate = bookRentDate;
	}
	
}
