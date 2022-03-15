package co.micol.prj.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> selectMemberList();	//전체리스트
	MemberVO selectMember(MemberVO vo); //한명 분 데이터 또는 로그인 처리
	int insertMember(MemberVO vo);		//등록
	int updatetMember(MemberVO vo);		//수정
	int deleteMember(MemberVO vo);		//삭제
	
	boolean isIdCheck(String str); 		//아이디 중복체크. 존재하면 false, 존재하지 않으면 true를 리턴하는 것이 디폴트.
}
