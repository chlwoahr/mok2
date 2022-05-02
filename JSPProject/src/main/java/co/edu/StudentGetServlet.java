package co.edu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/StudentGetServlet")
public class StudentGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public StudentGetServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// GET: cmd=search, cmd=null -> JSON 반환
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("uft-8");
		

		String cmd = request.getParameter("cmd");

		if (cmd != null && cmd.equals("search")) { //한건 조회
			String id = request.getParameter("user_id");
			StudentDAO dao = new StudentDAO();
			Student stud = dao.searchStudent(id);
			if (stud != null) {
			
			response.setContentType("text/html;charset=utf-8");
			if(stud != null) {
			response.getWriter().println("<form action= 'StudentGetServlet' method='post'>");
			response.getWriter().println("<input type = 'hidden' name='cmd' value='mod'>");
			response.getWriter().println("<h3>학생번호: " + stud.getStudentNo() + "</h3>");
			response.getWriter().println("<h3>학생이름: " + stud.getStudentName() + "</h3>");
			response.getWriter().println("<h3>영어점수: " + "<input type = 'number' name='eng_score' value ="+stud.getEngScore()+"></h3>");
			response.getWriter().println("<h3>국어점수: " + "<input type = 'number' name='kor_score' value ="+stud.getKorScore()+"></h3>");
			response.getWriter().println("<input type = 'hidden' name='user_id' value = "+stud.getStudentNo()+">");
			response.getWriter().println("<input type = 'hidden' name='user_name' value = "+stud.getStudentName()+">");
			
			response.getWriter().println("<input type = 'submit' value=수정>");
			response.getWriter().println("</form>");
			
			response.getWriter().println("<a href = 'studentList.jsp'>목록</a>");
			
			}
			} else {
				response.getWriter().print("<script>alert('조회된 데이터가 없습니다.')</script>");
			}

		} else if (cmd != null && cmd.equals("list")) {
			response.setContentType("text/html;charset=utf-8");
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String engScore = request.getParameter("eng_score");
			String korScore = request.getParameter("kor_score");
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			dao.addStudent(stud);
			response.getWriter().print("입력성공");

		} else {
			
			response.setContentType("text/json;charset=utf-8");
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.studentList(); // [{}, {}, {}]
			Gson gson = new GsonBuilder().create();
			response.getWriter().print(gson.toJson(list));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("uft-8");
		response.setContentType("text/html;charset=utf-8");

		String cmd = request.getParameter("cmd");

		if (cmd != null && cmd.equals("add")) {
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));
			
			boolean result = dao.addStudent(stud);
			if(result) {
				response.getWriter().print("<script>alert('입력성공')</script>");
			}else {
				response.getWriter().print("<script>alert('입력실패')</script>");
			}
			
		} else if (cmd != null && cmd.equals("mod")) {

			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");
			
			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));

			boolean result = dao.modifyStudent(stud);
			if(result) {
				response.getWriter().print("<script>alert('수정성공')</script>");
			}else {
				response.getWriter().print("<script>alert('수정실패')</script>");
			}
			
			
		} else if (cmd != null && cmd.equals("del")) {
			StudentDAO dao = new StudentDAO();
			String id = request.getParameter("user_id");
			if(dao.removeStudent(id)) {
				response.getWriter().print("<script>alert('삭제성공')</script>");
			}else {
				response.getWriter().print("<script>alert('삭제실패')</script>");
			}
		}
		response.sendRedirect("studentList.jsp");
	}
}
