package co.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Info extends HttpServlet {

	// Info 페이지 요청 -> init() -> Service() -> Destroy()

	@Override                  //요청정보             //응답정보
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   resp.setCharacterEncoding("UTF-8"); // 한글처리
       resp.setContentType("text/html;charset=UTF-8"); //만드는페이지에 한글
	   
       PrintWriter out = resp.getWriter();
       out.print("<h3>서블릿 페이지</h>");
       out.print("<h3>안녕하세요</h>");
       out.print("<a href=\"../index.html\">index</a>");
       //<a href="../index.html">index</a>
       
	
	}
	
}
