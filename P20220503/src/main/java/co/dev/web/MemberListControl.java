package co.dev.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MerBerService;
import co.dev.vo.MemberVo;

public class MemberListControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MerBerService service = new MerBerService();
		List<MemberVo> list = service.memberList();
		
		request.setAttribute("all", list);
		
		request.getRequestDispatcher("memberResult/memberListOutput.jsp").forward(request, response);
		
		
	}

}
