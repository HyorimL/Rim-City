package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.lhr.voca.VocaDAO;
import com.yedam.lhr.voca.VocaDAOImpl;
import com.yedam.lhr.voca.Vocabulary;

public class VocaFrame {
	
	private VocaDAO dao = VocaDAOImpl.getInstance();
	private Scanner scanner = new Scanner(System.in);
	
	
	public VocaFrame(int result) {
		
		
		
		if(result == 1) {
		
		while(true) {
			
			//메뉴출력
			menuPrint();
			//메뉴선택
			int menuNo = menuSelect();
			//각 메뉴별 기능실행
			if(menuNo == 1) {
				//단어입력
				insertWord();
			} else if(menuNo == 2) {
				//전체단어조회
				selectAllWords();
			} else if(menuNo == 3) {
				//단건단어조회
				selectOneWord();
			} else if(menuNo == 4) {
				//암기한 단어 조회
				learnedList();
			} else if(menuNo == 5) {
				//미암기 단어 조회
				willLearnList();
			} else if(menuNo == 6) {
				//단어퀴즈
				//wordQuiz();
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
		} else if (result == 0) {
			System.out.println("비밀번호를 잘못 입력하였습니다.");
		} else if (result == -1) {
			System.out.println("가입된 회원이 아닙니다.");
		}
	}
	
	
	public void menuPrint() {
		
		System.out.println();
		System.out.println("1.단어입력 | 2.전체단어보기 | 3.단건단어보기 | 4.암기단어 | 5.미암기단어 | 6.단어퀴즈 | 7.단어수정 | 8.단어삭제 | 9.종료 ");
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
	
	
	
	//메뉴1)단어입력
	public void insertWord() {
		Vocabulary voca = inputVocabulary();
		dao.insert(voca);
	}
	
	//단어 정보 입력 메서드
	public Vocabulary inputVocabulary() {
		Vocabulary voca = new Vocabulary();
		System.out.print("단어>");
		voca.setVocaWord(scanner.nextLine());
		System.out.print("단어뜻>");
		voca.setVocaMean(scanner.nextLine());
		
		return voca;
	}
	
	
	//메뉴2)전체단어보기
	public void selectAllWords() {
		List<Vocabulary> list = dao.selectAll();
		for(Vocabulary voca : list) {
			System.out.println(voca);
			if(voca == null) {
				System.out.println("단어장이 비어있습니다.");
			}
		}
	}
	
	//메뉴3)단건단어보기
	public void selectOneWord() {
		String vocaWord = inputWord();
		Vocabulary voca = dao.selectOne(vocaWord);
		if(voca != null) {
			System.out.println(voca);
		} else {
			System.out.println("해당 단어가 존재하지 않습니다.");
		}
	}
	
	//메뉴6)단어퀴즈
	public void wordQuiz() {
		
	}
	
	
	//메뉴4)암기한 단어 조회
	public void learnedList() {
		List<Vocabulary> list = dao.selectAll();
		for(Vocabulary voca : list) {
			if(voca.getVocaLearn() == 1) {
				System.out.println(voca);
			}
		}
	}
	
	//메뉴5)미암기 단어 조회
	public void willLearnList() {
		List<Vocabulary> list = dao.selectAll();
		for(Vocabulary voca : list) {
			if(voca.getVocaLearn() == 0) {
				System.out.println(voca);
			}
		}
	}
	
	//메뉴7)단어 수정
	public void update() {
		//수정할 단어 입력
		Vocabulary voca = inputVocaWord();
		//단어뜻 수정
		dao.update(voca);
	}
	
	public Vocabulary inputVocaWord() {
		Vocabulary voca = new Vocabulary();
		System.out.print("단어>");
		voca.setVocaWord(scanner.nextLine());
		System.out.print("단어뜻>");
		voca.setVocaMean(scanner.nextLine());
		return voca;
	}
	
	//메뉴8)단어 삭제
	public void delete() {
		//삭제할 단어 입력
		String vocaWord = inputWord();
		//단어 삭제
		dao.delete(vocaWord);
	}
	
	//메뉴9)단어장 종료
	public void end() {
		System.out.println("프로그램 종료");
	}
	
	public String inputWord() {
		String vocaWord = null;
		System.out.print("단어>");
		vocaWord = scanner.nextLine();
		return vocaWord;
	}
	
	
	
}
