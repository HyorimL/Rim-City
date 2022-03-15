package co.micol.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		MemberService memberDao = new MemberServiceImpl(); //모델객체생성
		request.setAttribute("members", memberDao.selectMemberList()); //모델객체에 데이터담기 요청

		return "member/memberList";
	}

}
