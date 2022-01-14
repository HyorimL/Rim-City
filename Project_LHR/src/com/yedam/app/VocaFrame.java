package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.lhr.voca.VocaDAO;
import com.yedam.lhr.voca.VocaDAOImpl;
import com.yedam.lhr.voca.Vocabulary;

public class VocaFrame {
	
	private VocaDAO dao = VocaDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	
	
	public VocaFrame() {
		
		while(true) {
			
			//메뉴출력
			menuPrint();
			//메뉴선택
			int menuNo = menuSelect();
			//각 메뉴별 기능실행
			if(menuNo == 1) {
				//단어입력
				inputWord();
			} else if(menuNo == 2) {
				//전체단어조회
				selectAllWords();
			} else if(menuNo == 3) {
				//단건단어조회
				selectOneWord();
			} else if(menuNo == 4) {
				//단어퀴즈
				//wordQuiz();
			} else if(menuNo == 5) {
				//암기한 단어
				learnedWordsList();
			} else if(menuNo == 6) {
				//미암기 단어
				willLearnWordsList();
			} else if(menuNo == 7) {
				//단어 수정
				update();
			} else if(menuNo == 8) {
				//단어 삭제
				delete();
			} else if(menuNo == 9) {
				//종료
				end();
				break;
			}
		}
	}
	
	
	public void menuPrint() {
		
		System.out.println();
		System.out.println("1.단어입력 | 2.전체단어보기 | 3.단건단어검색 | 4.단어퀴즈 | 5.암기한 단어 | 6.미암기 단어 | 7.단어수정 | 8.단어삭제 | 9.종료 ");
		System.out.print("선택>");
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
	
	public void inputWord() {
		//단어와 단어뜻 입력
		Vocabulary voca = inputVocabulary();
		//단어와 단어뜻 등록		
		dao.insert(voca);
	}
	
	public void selectAllWords() {
		
		//전체단어 보기
		List<Vocabulary> list = dao.selectAll();
		
		//전체 단어 출력
		for(Vocabulary voca : list) {
			System.out.println(voca);
		}
	}
	
	public void selectOneWord() {
		
	}
	
	public void learnedWordsList() {
		
	}
	
	public void willLearnWordsList() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
	public void end() {
		
	}
	
	
	
	public Vocabulary inputVocabulary() {
		Vocabulary voca = new Vocabulary();
		
		System.out.print("단어>");
		voca.setVocaWord(scanner.nextLine());
		System.out.print("단어뜻>");
		voca.setVocaMean(scanner.nextLine());
		
		return voca;
	}
	
	
}
