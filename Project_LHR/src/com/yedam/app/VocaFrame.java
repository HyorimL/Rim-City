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

		if (result == 1) {

			while (true) {

				// 메뉴출력
				menuPrint();
				// 메뉴선택
				int menuNo = menuSelect();
				// 각 메뉴별 기능실행
				if (menuNo == 1) {
					// 단어입력
					insertWord();
				} else if (menuNo == 2) {
					// 전체단어조회
					selectAllWords();
				} else if (menuNo == 3) {
					// 단건단어조회
					selectOneWord();
				} else if (menuNo == 4) {
					// 암기한 단어로 변경
					learnedWord();
				} else if (menuNo == 5) {
					// 미암기 단어 조회
					willLearnList();
				} else if (menuNo == 6) {
					// 단어퀴즈
					wordQuiz();
				} else if (menuNo == 7) {
					// 단어 삭제
					delete();
				} else if (menuNo == 9) {
					// 종료
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
		System.out.println("1.단어입력 | 2.전체단어보기 | 3.단건단어보기 | 4.암기한단어 | 5.미암기단어보기 | 6.단어퀴즈 | 7.단어삭제 | 9.단어장 닫기 ");
		System.out.print("선택>");
	}

	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	// 메뉴1)단어입력
	public void insertWord() {
		Vocabulary voca = inputVocabulary();
		dao.insert(voca);
	}

	// 단어 정보 입력 메서드
	public Vocabulary inputVocabulary() {
		Vocabulary voca = new Vocabulary();
		System.out.print("단어>");
		voca.setVocaWord(scanner.nextLine());
		System.out.print("단어뜻>");
		voca.setVocaMean(scanner.nextLine());

		return voca;
	}

	// 메뉴2)전체단어보기
	public void selectAllWords() {
		List<Vocabulary> list = dao.selectAll();
		for (Vocabulary voca : list) {
			System.out.println(voca);
			if (voca == null) {
				System.out.println("단어장이 비어있습니다.");
			}
		}
	}

	// 메뉴3)단건단어보기
	public void selectOneWord() {
		String vocaWord = inputWord();
		Vocabulary voca = dao.selectOne(vocaWord);
		if (voca != null) {
			System.out.println(voca);
		} else {
			System.out.println("해당 단어가 존재하지 않습니다.");
		}
	}

	// 메뉴6)단어퀴즈 ㅠㅠㅠ
	public void wordQuiz() {
		
		// 단어테이블에서 selectAll()
		List<Vocabulary> quizList = VocaDAOImpl.getInstance().selectAll();
		
		System.out.println("단어퀴즈를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + quizList.size() + "개의 단어가 있습니다.");
		System.out.println("__________________________________________");
		
		while (true) {
			
			int answerNum = quizPrint(quizList);			
			System.out.print("정답 입력>> ");

			int choice = Integer.parseInt(scanner.nextLine());

			if (choice == -1) {

				System.out.println("퀴즈를 종료합니다.");

				break;

			} else if (choice == answerNum) {
				System.out.println("*** 정답입니다! ***");
				System.out.println("_________________________");
			} else {
				System.out.println("*** 땡! ***");
				System.out.println("_________________________");

			}
		}
	}

	public int quizPrint(List<Vocabulary> quizList) {
	
		int[] numList = new int[3];
		
		for(int i=0; i<numList.length; i++) {
			numList[i] = (int) (Math.random() * quizList.size());
		}
		
		int answerNum = (int) (Math.random() * numList.length);
		
		//단어 출력
		System.out.println(quizList.get(numList[answerNum]).getVocaWord());
		
		//선택지 출력
		for(int i=0; i<numList.length; i++) {
			System.out.println(i+1 + "번 "+ quizList.get(numList[i]).getVocaMean());
		}
		
		return answerNum + 1;
	}

	// 메뉴4)암기한 단어로 변경
	public void learnedWord() {

		// 암기한 단어 입력
		String vocaWord = inputWord();
		// 단어 조회
		Vocabulary voca = dao.selectOne(vocaWord);
		// 암기 여부 확인
		if (voca != null) {
			// 암기한 단어인 경우
			if (voca.getVocaLearn() == 1) {
				System.out.println("이미 암기한 단어입니다.");
			} else {
				// 미암기 단어인 경우
				voca.setVocaLearn(1);
				dao.update(voca);
			}
		} else {
			System.out.println("해당 단어는 단어장에 없습니다.");
		}
	}

	// 메뉴5)미암기 단어 조회
	public void willLearnList() {
		List<Vocabulary> list = dao.selectAll();
		for (Vocabulary voca : list) {
			if (voca.getVocaLearn() == 0) {
				System.out.println(voca);
			}
		}
	}

	public Vocabulary inputVocaWord() {
		Vocabulary voca = new Vocabulary();
		System.out.print("단어>");
		voca.setVocaWord(scanner.nextLine());
		System.out.print("단어뜻>");
		voca.setVocaMean(scanner.nextLine());
		return voca;
	}

	// 메뉴7)단어 삭제
	public void delete() {
		// 삭제할 단어 입력
		String vocaWord = inputWord();
		// 단어 삭제
		dao.delete(vocaWord);
	}

	// 메뉴9)단어장 종료
	public void end() {
		System.out.println("단어장을 닫습니다.");
	}

	public String inputWord() {
		String vocaWord = null;
		System.out.print("단어>");
		vocaWord = scanner.nextLine();
		return vocaWord;
	}

}
