package co.dev.web;

import java.io.IOException;
import java.util.jar.Attributes.Name;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MerBerService;
import co.dev.vo.MemberVo;

public class MemberUpdateControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String nm = request.getParameter("name");
		String em = request.getParameter("email");
		String ps = request.getParameter("passwd");
		
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setName(nm);
		vo.setPasswd(ps);
		vo.setEmail(em);
		
		if(id.isEmpty() || nm.isBlank() || em.isBlank() || ps.isBlank() ) {
			request.setAttribute("error", "모든 항목을 입력하세요!");
			request.getRequestDispatcher("memberView/memberUpdate.jsp").forward(request, response);
			return;
		}
		
		MerBerService service = new MerBerService();
		service.memberUpdate(vo);
		
		request.setAttribute("id", id);
		
		
		request.getRequestDispatcher("memberResult/memberUpdateOutput.jsp").forward(request, response);
		
		
	}

}
