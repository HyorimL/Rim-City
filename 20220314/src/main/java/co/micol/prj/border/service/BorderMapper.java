package co.micol.prj.border.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BorderMapper {
	List<BorderVO> borderSelectList();
	BorderVO borderSelect(BorderVO vo);
	int borderInsert(BorderVO vo);
	int borderUpdate(BorderVO vo);
	int borderDelete(BorderVO vo);
	int borderUpdateHit(int id);
	
	List<BorderVO> borderSelectSearchList(@Param("key") String key, @Param("val") String val); //검색할 항목(키값), 검색할 내용(밸류)
	//매개변수가 2개 이상일 때 @Param 사용
	
	List<BorderVO> borderSortList(String key);
}
