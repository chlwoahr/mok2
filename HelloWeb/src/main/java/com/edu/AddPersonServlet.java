package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPersonServlet
 */
@WebServlet("/addPersonServlet")
public class AddPersonServlet extends HttpServlet { // 자바코드로 html코드작성가능
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	} // 주소창에 엔터를 치면 연결

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//		doGet(request, response);
		String id = request.getParameter("uid"); // uid에 담겨있는 값을
		String name = request.getParameter("uname"); 
		String score = request.getParameter("uscore"); 
		String age = request.getParameter("uage");
		
		System.out.println("아이디: "+ id);
		System.out.println("이름: "+ name);
		System.out.println("점수: "+ score);
		System.out.println("나이: "+ age);
		
		// "form.html" -> addPersonServlet
		
		PrintWriter out = response.getWriter(); 
		out.println("<h3>응답결과</h3>");
		out.println("<h4>입력아이디: "+id+"</h4>");
		out.println("<h4>입력이름: "+name+"</h4>");
		out.println("<h4>입력점수: "+score+"</h4>");
		out.println("<h4>입력나이: "+age+"</h4>");
		// 응답정보의 출력스트림 : 화면에출력
		// 출력스트림 ,inputstream: 입력, ouputstream : 출력 , reader, Write
	}

}
