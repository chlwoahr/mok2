package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//jsp 상태 정보 유지하는 방법.

//application: p20220503/p20220504 <- tomcat 서버 프로젝트단위
//session: user1/ user2/ user3 <- p20220503/ 동일한프로젝트에 유저별로 가지고있는 정보
//request: page1/ page2 -  			   <- servlet1, servlet2 1~2페이지 사이 내부적으로 정보를 공휴

@WebServlet("/queryTest")
public class QueryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QueryTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pwd");
		String name = request.getParameter("name");
		String [] hobbies = request.getParameterValues("hobby");
		String gen =request.getParameter("gender");
		String rel = request.getParameter("religion");
		String intro = request.getParameter("intro");
		
		PrintWriter out = response.getWriter();
		out.print("<h3>id: " + id + "</h3>");
		out.print("<h3>pass: " + pass + "</h3>");
		out.print("<h3>name: " + name + "</h3>");
		out.print("<ul>");
		for(String hobby : hobbies) {
			out.print("<li>"+hobby+"</li>");
		}
		out.print("</ul>");
		out.print("<h3>성별: " + gen + "</h3>");
		out.print("<h3>종교: " + rel + "</h3>");
		out.print("<h3>자기소개: " + intro + "</h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pwd");
		String name = request.getParameter("name");
		String [] hobbies = request.getParameterValues("hobby");
		String gen =request.getParameter("gender");
		String rel = request.getParameter("religion");
		String intro = request.getParameter("intro");
		
		PrintWriter out = response.getWriter();
		out.print("<h3>id: " + id + "</h3>");
		out.print("<h3>pass: " + pass + "</h3>");
		out.print("<h3>name: " + name + "</h3>");
		out.print("<ul>");
		for(String hobby : hobbies) {
			out.print("<li>"+hobby+"</li>");
		}
		out.print("</ul>");
		out.print("<h3>성별: " + gen + "</h3>");
		out.print("<h3>종교: " + rel + "</h3>");
		out.print("<h3>자기소개: " + intro + "</h3>");
		

	}

}
