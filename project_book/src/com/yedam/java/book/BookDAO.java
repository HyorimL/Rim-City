package com.yedam.java.book;

import java.util.List;

public interface BookDAO {

	//DAO는 DB와 소통하는 역할만 한다
	//전체조회
	public List<Book> selectAll();
	
	//단건조회
	public Book selectBook(String bookName);
		
	//책등록
	public void insert(Book book);
	
	//수정
	public void update(Book book);
	
	
}
