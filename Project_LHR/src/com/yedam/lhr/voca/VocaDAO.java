package com.yedam.lhr.voca;

import java.util.List;



public interface VocaDAO {
	
	
	
	    //전체단어조회
		public List<Vocabulary> selectAll();
				
		//단건단어조회
		public Vocabulary selectOne(String vocaWord);
		
		//단어등록
		public void insert(Vocabulary voca);
		
		//단어수정
		public void update(Vocabulary voca);
		
		//단어삭제
		public void delete(String vocaWord);

	
	
	
	

}
