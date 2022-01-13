package com.yedam.book;

import java.util.List;

public interface BookDAO {

	
	//전체조회
	public List<Book> selectAll();
	
	
	//단건조회
	public Book selectOne(String bookName);
	
	//내용검색
	public Book selectContent(String bookContent);
	
	
	//책등록
	public void insertBook(Book book);
	
	//책대여
	public void rentalBook(Book book);
	
	
}
