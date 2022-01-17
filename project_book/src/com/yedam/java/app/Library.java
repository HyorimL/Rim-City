package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.book.Book;
import com.yedam.java.book.BookDAO;
import com.yedam.java.book.BookDAOImpl;

public class Library {
	
	
	private Scanner scanner = new Scanner(System.in);
	private BookDAO dao = BookDAOImpl.getInstance();
	
	
	public Library() {
		while(true) {
			//메뉴출력
			menuPrint();
			//메뉴선택
			int menuNo = menuSelect();
			//각 메뉴별 실행
			if(menuNo == 1) {
				selectBookList();
			} else if(menuNo == 2) {
				selectBookInfo();
			} else if(menuNo == 3) {
				selectSearchBookList();
			} else if(menuNo == 4) {
				selectRentalBookList();
			} else if(menuNo == 5) {
				rentalBook();
			} else if(menuNo == 6) {
				returnBook();
			} else if(menuNo == 7) {
				insertBookInfo();
			} else if(menuNo == 9) {
				end();
				break;
			} 
			
		}
	}
	
	public void menuPrint() {
		System.out.println("1.전체조회 2.단건조회 3.내용검색 4.대여가능 5.책대여 6.책반납 7.책등록 9.종료");
		System.out.print("선택>");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch(Exception e) {
			System.out.println("다시 선택하세요.");
		} 
		return menuNo;
	}
	
	
	public void end() {
		System.out.println("프로그램 종료");
		
		
	}
	
	public void insertBookInfo() {
		Book book = inputBookInfo();
		dao.insert(book);
	}
	
	
	public void rentalBook() {
		
		//책제목 입력
		String bookName = inputBookName();
		//해당 북 정보 조회
		Book book = dao.selectBook(bookName);
		//대여 여부 확인
		if(book != null) {
			//대여가 된 경우 별도 안내무구
			if(book.getBookRental() == 1) {
				System.out.println("해당 책은 대여중입니다.");
			} else {
				//대여가 안 된 경우 대여처리
				book.setBookRental(1);
				dao.update(book);
			}
		} else {
			System.out.println("해당하는 정보가 존재하지 않습니다.");
		}
	}
	
	public void returnBook() {
		//책 제목 입력
		String bookName = inputBookName();
		//해당 책 정보 확인
		Book book = dao.selectBook(bookName);
		//반납 처리
		if(book != null) {
			book.setBookRental(0);
			dao.update(book);
		} else {
			System.out.println("해당하는 정보가 존재하지 않습니다.");
		}
		
	}
	
	public void selectBookList() {
		List<Book> list = dao.selectAll();
		for(Book book : list) {
			System.out.println(book);
		}
	}
	
	//단건조회
	public void selectBookInfo() {
		//책 제목 입력
		String bookName = inputBookName();
		
		Book book = dao.selectBook(bookName);
		
		if(book != null) {
			System.out.println(book);
		} else {
			System.out.println("해당하는 정보가 존재하지 않습니다.");
		}
		
	}
	
	
	//내용검색
	public void selectSearchBookList() {
		String keyword = inputBookKeyword();
		List<Book> list = dao.selectAll();
		
		for(Book book : list) {
			if(book.getBookContent().indexOf(keyword) != -1) {
				System.out.println(book);
			}
		}
	}
	
	//대여가능 목록 확인
	public void selectRentalBookList() {
		List<Book> list = dao.selectAll();
		for(Book book : list) {
			if(book.getBookRental() == 0) {
				System.out.println(book);
			}
		}
	}
	
	//책 정보 입력 메소드
	public Book inputBookInfo() {
		Book book = new Book();
		System.out.print("책 제목>");
		book.setBookName(scanner.nextLine());
		System.out.print("저자명>");
		book.setBookWriter(scanner.nextLine());
		System.out.print("책내용>");
		book.setBookContent(scanner.nextLine());
		return book;
	}
	
	public String inputBookName() {
		System.out.print("책 제목>");
		return scanner.nextLine();
	}
	
	public String inputBookKeyword() {
		System.out.print("검색>");
		return scanner.nextLine();
	}

}
