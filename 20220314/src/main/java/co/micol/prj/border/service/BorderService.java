package co.micol.prj.border.service;

import java.util.List;

public interface BorderService {

	List<BorderVO> borderSelectList();
	BorderVO borderSelect(BorderVO vo);
	int borderInsert(BorderVO vo);
	int borderUpdate(BorderVO vo);
	int borderDelete(BorderVO vo);
	int borderUpdateHit(int id);
	//검색기능 구현할 vo 객체 : 검색할 항목(키값), 검색할 내용(밸류)
	List<BorderVO> borderSelectSearchList(String key, String val); 
	List<BorderVO> borderSortList(String key);
}
