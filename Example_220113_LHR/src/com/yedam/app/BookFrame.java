package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.book.Book;
import com.yedam.book.BookDAO;
import com.yedam.book.BookDAOImpl;

public class BookFrame {
	
	
	
	private Scanner scanner = new Scanner(System.in);
	private BookDAO dao = BookDAOImpl.getInstance();
	
	public void run() {
		
		while(true)  {
			
			//메뉴출력
			menuPrint();
			
			//메뉴선택 
			int menuNo = menuSelect();
			
			//각 기능별 실행
			if (menuNo == 1) {
				//전체조회
				selectAllBook();
			} else if (menuNo == 2) {
				//단건조회
				selectOneBook();
			} else if (menuNo == 3) {
				//내용검색
				selectContent();
			} else if (menuNo == 4) {
				//대여가능
				rentalable();
			} else if (menuNo == 5) {
				//책대여
				rentalBook();
			} else if (menuNo == 6) {
				//책반납
				returnBook();
			} else if (menuNo == 7) {
				//책등록
				inputBook();
			} else if (menuNo == 9) {
				//종료
				end();
				break;
			}
		}
	}
	
	public void menuPrint() {
		
		System.out.println("================================================================================");
		System.out.println("1.전체조회 | 2.단건조회 | 3.내용검색 | 4.대여가능 | 5.책 대여 | 6.책 반납 | 7.책 등록 | 9.종료");
		System.out.println("================================================================================");
		System.out.print("메뉴선택>");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch(Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}
	
	
	//1.전체조회
	public void selectAllBook() {
		List<Book> list = dao.selectAll();
	}

	
	
	//2.단건조회
	public void selectOneBook() {
		//찾을 책제목 입력 
		String bookName = inputBookName();
		//책정보 조회
		Book book = dao.selectOne(bookName);
		//책정보 출력
		if(book == null) {
			System.out.println("검색하신 책이 없습니다.");
		} else {
			System.out.println(book);
		}
	}
	
	
	
	//3.내용검색
	public void selectContent() {
		
	}
	
	
	
	//4.대여가능
	public void rentalable() {
		
	}
	
	
	
	//5.책대여
	public void rentalBook() {
		
		
	}
	
	
	
	/*
	public Book inputBookName() {
		Book book = new Book();
		System.out.print("책제목>");
		book.setBookName(scanner.nextLine());
		
		return book;
	}
	*/	
		
	//6.책반납
	public void returnBook() {
		
		
	}
	
	
	
	
	//7.책등록
	public Book inputBook() {
		Book book = new Book();
		System.out.print("책제목>");
		book.setBookName(scanner.nextLine());
		System.out.print("저자명>");
		book.setBookWriter(scanner.nextLine());
		System.out.print("내용>");
		book.setBookContent(scanner.nextLine());
		book.setBookRental(0);
		return book;
	}
	
	
	
	//9.종료
	public void end() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public String inputBookName() {
		String bookName = null;
		System.out.print("책제목>");
		bookName = (scanner.nextLine());
		return bookName;
	}

}
