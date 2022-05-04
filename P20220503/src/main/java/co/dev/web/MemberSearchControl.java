package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MerBerService;
import co.dev.vo.MemberVo;

public class MemberSearchControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String job = request.getParameter("job");
		MerBerService service = new MerBerService();
		MemberVo member = service.memberSearch(id);
		String path = "";
		if(job.equals("search")) {
			path = "memberView/memberSearch.jsp";
		}else if(job.equals("update")) {
			path = "memberView/memberUpdate.jsp";
		}else if(job.equals("delete")) {
			request.setAttribute("aaa", member.getId()+"/"+member.getName()+"/"+member.getEmail()+"/"+member.getPasswd());
			path = "memberView/memberDelete.jsp";
		}
		
		if(id.isEmpty()) {
			request.setAttribute("error", "아이디를 입력하세요");
			request.getRequestDispatcher(path).forward(request, response); //아이디값이없을때 각각의 페이지로 돌아가게
			return;
		}
		
		
		
		if(member == null) {
			request.setAttribute("result", "조회된 정보가 없습니다.");
		}
		request.setAttribute("member", member);
		
		if(job.equals("search")){
			path = "memberResult/memberSearchOutput.jsp";
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

}
